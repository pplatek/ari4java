package ch.loway.oss.ari4java.generated.ari_0_0_1.models;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Date;
import java.util.List;

/** =====================================================
 * Channel changed location in the dialplan.
 * 
 * Defined in file :events.json
 * ====================================================== */
public class ChannelDialplan_impl_ari_0_0_1 extends Event_impl_ari_0_0_1 implements ChannelDialplan, java.io.Serializable {
  /**  The channel that changed dialplan location.  */
  private Channel channel;
 public Channel getChannel() {
   return channel;
 }

 public void setChannel(Channel val ) {
   channel = val;
 }

  /**  The application about to be executed.  */
  private String dialplan_app;
 public String getDialplan_app() {
   return dialplan_app;
 }

 public void setDialplan_app(String val ) {
   dialplan_app = val;
 }

  /**  The data to be passed to the application.  */
  private String dialplan_app_data;
 public String getDialplan_app_data() {
   return dialplan_app_data;
 }

 public void setDialplan_app_data(String val ) {
   dialplan_app_data = val;
 }

}
