package xm0;

/* loaded from: classes7.dex */
public final class a implements org.webrtc.Loggable {
    @Override // org.webrtc.Loggable
    public void onLogMessage(java.lang.String str, org.webrtc.Logging.Severity severity, java.lang.String str2) {
        java.lang.Object[] objArr = new java.lang.Object[0];
        ym0.i.f463129a.e("WebRTCLog:" + str2, str, java.util.Arrays.copyOf(objArr, objArr.length));
    }
}
