package org.webrtc;

/* loaded from: classes15.dex */
class JNILogging {
    private final org.webrtc.Loggable loggable;

    public JNILogging(org.webrtc.Loggable loggable) {
        this.loggable = loggable;
    }

    public void logToInjectable(java.lang.String str, java.lang.Integer num, java.lang.String str2) {
        this.loggable.onLogMessage(str, org.webrtc.Logging.Severity.values()[num.intValue()], str2);
    }
}
