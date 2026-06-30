package su1;

/* loaded from: classes.dex */
public final class l extends com.tencent.mm.sdk.event.n {
    public l() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        java.lang.String str;
        com.tencent.mm.autogen.events.ScanQrcodeLiveScreenCastAuthorizationEvent event = (com.tencent.mm.autogen.events.ScanQrcodeLiveScreenCastAuthorizationEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        if (!(((k40.f) ((l40.e) i95.n0.c(l40.e.class))).Ui(com.tencent.mm.sdk.platformtools.x2.f193071a).length() == 0)) {
            if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_finder_screen_cast_pc_forbidden, false)) {
                am.at atVar = event.f54737g;
                if (atVar != null && (str = atVar.f6186a) != null) {
                    new uu1.a(str).doScene(gm0.j1.d().f70764d, new su1.k(this));
                }
                return true;
            }
        }
        j45.l.j(com.tencent.mm.sdk.platformtools.x2.f193071a, "cast", ".ui.ScreenCastActivity", new android.content.Intent(), null);
        return true;
    }
}
