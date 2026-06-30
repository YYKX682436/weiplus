package wa3;

/* loaded from: classes15.dex */
public class i extends com.tencent.mm.app.z2 {
    @Override // com.tencent.mm.app.a3
    public void onAppBackground(java.lang.String str) {
        if (gm0.j1.a() && gm0.j1.b().f273254q) {
            gm0.j1.b();
            if (gm0.m.r()) {
                return;
            }
            com.tencent.mm.autogen.events.ResumeOrPauseTrackRoomEvent resumeOrPauseTrackRoomEvent = new com.tencent.mm.autogen.events.ResumeOrPauseTrackRoomEvent();
            resumeOrPauseTrackRoomEvent.f54709g.f8474a = false;
            resumeOrPauseTrackRoomEvent.e();
        }
    }

    @Override // com.tencent.mm.app.a3
    public void onAppForeground(java.lang.String str) {
        if (gm0.j1.a() && gm0.j1.b().f273254q) {
            gm0.j1.b();
            if (gm0.m.r()) {
                return;
            }
            com.tencent.mm.autogen.events.ResumeOrPauseTrackRoomEvent resumeOrPauseTrackRoomEvent = new com.tencent.mm.autogen.events.ResumeOrPauseTrackRoomEvent();
            resumeOrPauseTrackRoomEvent.f54709g.f8474a = true;
            resumeOrPauseTrackRoomEvent.e();
        }
    }
}
