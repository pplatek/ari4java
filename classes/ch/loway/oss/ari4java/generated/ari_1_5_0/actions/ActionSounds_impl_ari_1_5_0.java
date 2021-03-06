package ch.loway.oss.ari4java.generated.ari_1_5_0.actions;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Mon Nov 17 10:19:16 CET 2014
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import ch.loway.oss.ari4java.tools.BaseAriAction;
import ch.loway.oss.ari4java.tools.RestException;
import ch.loway.oss.ari4java.tools.AriCallback;
import com.fasterxml.jackson.core.type.TypeReference;
import ch.loway.oss.ari4java.generated.ari_1_5_0.models.*;

/**********************************************************
 * 
 * Generated by: Apis
 *********************************************************/


public class ActionSounds_impl_ari_1_5_0 extends BaseAriAction  implements ActionSounds {
/**********************************************************
 * Sounds
 * 
 * List all sounds.
 *********************************************************/
private void buildList(String lang, String format) {
reset();
url = "/sounds";
method = "GET";
lParamQuery.add( BaseAriAction.HttpParam.build( "lang", lang) );
lParamQuery.add( BaseAriAction.HttpParam.build( "format", format) );
}

@Override
public List<Sound> list(String lang, String format) throws RestException {
buildList(lang, format);
String json = httpActionSync();
return deserializeJsonAsAbstractList( json,
   new TypeReference<List<Sound_impl_ari_1_5_0>>() {} ); 
}

@Override
public void list(String lang, String format, AriCallback<List<Sound>> callback) {
buildList(lang, format);
httpActionAsync(callback, new TypeReference<List<Sound_impl_ari_1_5_0>>() {});
}

/**********************************************************
 * Individual sound
 * 
 * Get a sound's details.
 *********************************************************/
private void buildGet(String soundId) {
reset();
url = "/sounds/" + soundId + "";
method = "GET";
}

@Override
public Sound get(String soundId) throws RestException {
buildGet(soundId);
String json = httpActionSync();
return deserializeJson( json, Sound_impl_ari_1_5_0.class ); 
}

@Override
public void get(String soundId, AriCallback<Sound> callback) {
buildGet(soundId);
httpActionAsync(callback, Sound_impl_ari_1_5_0.class);
}

/** No missing signatures from interface */
};

