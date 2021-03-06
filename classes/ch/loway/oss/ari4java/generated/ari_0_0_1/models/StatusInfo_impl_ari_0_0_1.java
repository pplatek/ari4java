package ch.loway.oss.ari4java.generated.ari_0_0_1.models;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Mon Nov 17 10:19:16 CET 2014
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**********************************************************
 * Info about Asterisk status
 * 
 * Defined in file: asterisk.json
 * Generated by: Model
 *********************************************************/

public class StatusInfo_impl_ari_0_0_1 implements StatusInfo, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  Time when Asterisk was last reloaded.  */
  private Date last_reload_time;
 public Date getLast_reload_time() {
   return last_reload_time;
 }

 @JsonDeserialize( as=Date.class )
 public void setLast_reload_time(Date val ) {
   last_reload_time = val;
 }

  /**  Time when Asterisk was started.  */
  private Date startup_time;
 public Date getStartup_time() {
   return startup_time;
 }

 @JsonDeserialize( as=Date.class )
 public void setStartup_time(Date val ) {
   startup_time = val;
 }

/** No missing signatures from interface */
}

