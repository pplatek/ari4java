package ch.loway.oss.ari4java.generated;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Mon Nov 17 10:19:16 CET 2014
// ----------------------------------------------------

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import ch.loway.oss.ari4java.tools.RestException;
import ch.loway.oss.ari4java.tools.AriCallback;
import ch.loway.oss.ari4java.tools.tags.*;

/**********************************************************
 * 
 * Generated by: JavaInterface
 *********************************************************/


public interface ActionChannels {

// void originateWithId String String String String long String String String int Map<String,String> String AriCallback<Channel> callback
/**********************************************************
 * 
 * 
 * @since ari_1_5_0
 *********************************************************/
public void originateWithId(String channelId, String endpoint, String extension, String context, long priority, String app, String appArgs, String callerId, int timeout, Map<String,String> variables, String otherChannelId, AriCallback<Channel> callback);



// void ring String
/**********************************************************
 * Indicate ringing to a channel.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void ring(String channelId) throws RestException;



// void snoopChannel String String String String String AriCallback<Channel> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void snoopChannel(String channelId, String spy, String whisper, String app, String appArgs, AriCallback<Channel> callback);



// void ringStop String
/**********************************************************
 * Stop ringing indication on a channel if locally generated.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void ringStop(String channelId) throws RestException;



// void playWithId String String String String int int AriCallback<Playback> callback
/**********************************************************
 * 
 * 
 * @since ari_1_5_0
 *********************************************************/
public void playWithId(String channelId, String playbackId, String media, String lang, int offsetms, int skipms, AriCallback<Playback> callback);



// void unmute String String
/**********************************************************
 * Unmute a channel.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void unmute(String channelId, String direction) throws RestException;



// void snoopChannelWithId String String String String String String AriCallback<Channel> callback
/**********************************************************
 * 
 * 
 * @since ari_1_5_0
 *********************************************************/
public void snoopChannelWithId(String channelId, String snoopId, String spy, String whisper, String app, String appArgs, AriCallback<Channel> callback);



// void ringStop String AriCallback<Void> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void ringStop(String channelId, AriCallback<Void> callback);



// void continueInDialplan String String String int AriCallback<Void> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void continueInDialplan(String channelId, String context, String extension, int priority, AriCallback<Void> callback);



// void hangup String String
/**********************************************************
 * Delete (i.e. hangup) a channel.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void hangup(String channelId, String reason) throws RestException;



// void unmute String String AriCallback<Void> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void unmute(String channelId, String direction, AriCallback<Void> callback);



// void stopMoh String AriCallback<Void> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void stopMoh(String channelId, AriCallback<Void> callback);



// void get String AriCallback<Channel> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void get(String channelId, AriCallback<Channel> callback);



// void setChannelVar String String String
/**********************************************************
 * Set the value of a channel variable or function.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void setChannelVar(String channelId, String variable, String value) throws RestException;



// void unhold String AriCallback<Void> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void unhold(String channelId, AriCallback<Void> callback);



// void startSilence String AriCallback<Void> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void startSilence(String channelId, AriCallback<Void> callback);



// Playback play String String String int int
/**********************************************************
 * Start playback of media.
 * The media URI may be any of a number of URI's. Currently sound: and recording: URI's are supported. This operation creates a playback resource that can be used to control the playback of media (pause, rewind, fast forward, etc.)
 * 
 * @since ari_0_0_1
 *********************************************************/
public Playback play(String channelId, String media, String lang, int offsetms, int skipms) throws RestException;



// void hangup String String AriCallback<Void> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void hangup(String channelId, String reason, AriCallback<Void> callback);



// void continueInDialplan String String String int
/**********************************************************
 * Exit application; continue execution in the dialplan.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void continueInDialplan(String channelId, String context, String extension, int priority) throws RestException;



// void originate String String String long String String String int AriCallback<Channel> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void originate(String endpoint, String extension, String context, long priority, String app, String appArgs, String callerId, int timeout, AriCallback<Channel> callback);



// Channel get String
/**********************************************************
 * Channel details.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public Channel get(String channelId) throws RestException;



// Playback play String String String int int String
/**********************************************************
 * Start playback of media.
 * The media URI may be any of a number of URI's. Currently sound:, recording:, number:, digits:, characters:, and tone: URI's are supported. This operation creates a playback resource that can be used to control the playback of media (pause, rewind, fast forward, etc.)
 * 
 * @since ari_1_5_0
 *********************************************************/
public Playback play(String channelId, String media, String lang, int offsetms, int skipms, String playbackId) throws RestException;



// void stopSilence String
/**********************************************************
 * Stop playing silence to a channel.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void stopSilence(String channelId) throws RestException;



// Channel snoopChannelWithId String String String String String String
/**********************************************************
 * Start snooping.
 * Snoop (spy/whisper) on a specific channel.
 * 
 * @since ari_1_5_0
 *********************************************************/
public Channel snoopChannelWithId(String channelId, String snoopId, String spy, String whisper, String app, String appArgs) throws RestException;



// void startSilence String
/**********************************************************
 * Play silence to a channel.
 * Using media operations such as /play on a channel playing silence in this manner will suspend silence without resuming automatically.
 * 
 * @since ari_0_0_1
 *********************************************************/
public void startSilence(String channelId) throws RestException;



// void mute String String
/**********************************************************
 * Mute a channel.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void mute(String channelId, String direction) throws RestException;



// void snoopChannel String String String String String String AriCallback<Channel> callback
/**********************************************************
 * 
 * 
 * @since ari_1_5_0
 *********************************************************/
public void snoopChannel(String channelId, String spy, String whisper, String app, String appArgs, String snoopId, AriCallback<Channel> callback);



// void stopMoh String
/**********************************************************
 * Stop playing music on hold to a channel.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void stopMoh(String channelId) throws RestException;



// void play String String String int int String AriCallback<Playback> callback
/**********************************************************
 * 
 * 
 * @since ari_1_5_0
 *********************************************************/
public void play(String channelId, String media, String lang, int offsetms, int skipms, String playbackId, AriCallback<Playback> callback);



// void startMoh String String
/**********************************************************
 * Play music on hold to a channel.
 * Using media operations such as /play on a channel playing MOH in this manner will suspend MOH without resuming automatically. If continuing music on hold is desired, the stasis application must reinitiate music on hold.
 * 
 * @since ari_0_0_1
 *********************************************************/
public void startMoh(String channelId, String mohClass) throws RestException;



// void unhold String
/**********************************************************
 * Remove a channel from hold.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void unhold(String channelId) throws RestException;



// void originate String String String long String String String int Map<String,String> String String AriCallback<Channel> callback
/**********************************************************
 * 
 * 
 * @since ari_1_5_0
 *********************************************************/
public void originate(String endpoint, String extension, String context, long priority, String app, String appArgs, String callerId, int timeout, Map<String,String> variables, String channelId, String otherChannelId, AriCallback<Channel> callback);



// void startMoh String String AriCallback<Void> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void startMoh(String channelId, String mohClass, AriCallback<Void> callback);



// Channel originate String String String long String String String int
/**********************************************************
 * Create a new channel (originate).
 * The new channel is created immediately and a snapshot of it returned. If a Stasis application is provided it will be automatically subscribed to the originated channel for further events and updates.
 * 
 * @since ari_0_0_1
 *********************************************************/
public Channel originate(String endpoint, String extension, String context, long priority, String app, String appArgs, String callerId, int timeout) throws RestException;



// Channel originateWithId String String String String long String String String int Map<String,String> String
/**********************************************************
 * Create a new channel (originate with id).
 * The new channel is created immediately and a snapshot of it returned. If a Stasis application is provided it will be automatically subscribed to the originated channel for further events and updates.
 * 
 * @since ari_1_5_0
 *********************************************************/
public Channel originateWithId(String channelId, String endpoint, String extension, String context, long priority, String app, String appArgs, String callerId, int timeout, Map<String,String> variables, String otherChannelId) throws RestException;



// void stopSilence String AriCallback<Void> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void stopSilence(String channelId, AriCallback<Void> callback);



// Variable getChannelVar String String
/**********************************************************
 * Get the value of a channel variable or function.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public Variable getChannelVar(String channelId, String variable) throws RestException;



// void sendDTMF String String int int int int
/**********************************************************
 * Send provided DTMF to a given channel.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void sendDTMF(String channelId, String dtmf, int before, int between, int duration, int after) throws RestException;



// void getChannelVar String String AriCallback<Variable> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void getChannelVar(String channelId, String variable, AriCallback<Variable> callback);



// void answer String
/**********************************************************
 * Answer a channel.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void answer(String channelId) throws RestException;



// void list AriCallback<List<Channel>> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void list(AriCallback<List<Channel>> callback);



// void hold String
/**********************************************************
 * Hold a channel.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void hold(String channelId) throws RestException;



// void setChannelVar String String String AriCallback<Void> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void setChannelVar(String channelId, String variable, String value, AriCallback<Void> callback);



// List<Channel> list
/**********************************************************
 * List all active channels in Asterisk.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public List<Channel> list() throws RestException;



// Channel originate String String String long String String String int Map<String,String> String String
/**********************************************************
 * Create a new channel (originate).
 * The new channel is created immediately and a snapshot of it returned. If a Stasis application is provided it will be automatically subscribed to the originated channel for further events and updates.
 * 
 * @since ari_1_5_0
 *********************************************************/
public Channel originate(String endpoint, String extension, String context, long priority, String app, String appArgs, String callerId, int timeout, Map<String,String> variables, String channelId, String otherChannelId) throws RestException;



// void ring String AriCallback<Void> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void ring(String channelId, AriCallback<Void> callback);



// void record String String String int int String boolean String AriCallback<LiveRecording> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void record(String channelId, String name, String format, int maxDurationSeconds, int maxSilenceSeconds, String ifExists, boolean beep, String terminateOn, AriCallback<LiveRecording> callback);



// void play String String String int int AriCallback<Playback> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void play(String channelId, String media, String lang, int offsetms, int skipms, AriCallback<Playback> callback);



// Channel snoopChannel String String String String String String
/**********************************************************
 * Start snooping.
 * Snoop (spy/whisper) on a specific channel.
 * 
 * @since ari_1_5_0
 *********************************************************/
public Channel snoopChannel(String channelId, String spy, String whisper, String app, String appArgs, String snoopId) throws RestException;



// void mute String String AriCallback<Void> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void mute(String channelId, String direction, AriCallback<Void> callback);



// void answer String AriCallback<Void> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void answer(String channelId, AriCallback<Void> callback);



// Playback playWithId String String String String int int
/**********************************************************
 * Start playback of media and specify the playbackId.
 * The media URI may be any of a number of URI's. Currently sound: and recording: URI's are supported. This operation creates a playback resource that can be used to control the playback of media (pause, rewind, fast forward, etc.)
 * 
 * @since ari_1_5_0
 *********************************************************/
public Playback playWithId(String channelId, String playbackId, String media, String lang, int offsetms, int skipms) throws RestException;



// void sendDTMF String String int int int int AriCallback<Void> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void sendDTMF(String channelId, String dtmf, int before, int between, int duration, int after, AriCallback<Void> callback);



// Channel snoopChannel String String String String String
/**********************************************************
 * Start snooping.
 * Snoop (spy/whisper) on a specific channel.
 * 
 * @since ari_0_0_1
 *********************************************************/
public Channel snoopChannel(String channelId, String spy, String whisper, String app, String appArgs) throws RestException;



// void hold String AriCallback<Void> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void hold(String channelId, AriCallback<Void> callback);



// LiveRecording record String String String int int String boolean String
/**********************************************************
 * Start a recording.
 * Record audio from a channel. Note that this will not capture audio sent to the channel. The bridge itself has a record feature if that's what you want.
 * 
 * @since ari_0_0_1
 *********************************************************/
public LiveRecording record(String channelId, String name, String format, int maxDurationSeconds, int maxSilenceSeconds, String ifExists, boolean beep, String terminateOn) throws RestException;


}
;
