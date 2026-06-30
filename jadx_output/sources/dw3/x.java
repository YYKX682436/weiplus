package dw3;

/* loaded from: classes8.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.on0 f244292d;

    public x(r45.on0 on0Var) {
        this.f244292d = on0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r45.on0 on0Var = this.f244292d;
        if (!on0Var.f382369i) {
            dw3.c0.f244182a.j(on0Var.f382371n);
        }
        if (gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_WEIXIN_CAMERASAVEVIDEO_STATE_BOOLEAN, true)) {
            boolean z17 = on0Var.f382367g;
            if (z17 || (!z17 && on0Var.f382370m && on0Var.f382368h)) {
                java.lang.String h17 = ai3.d.h("mp4");
                if (!on0Var.f382367g) {
                    h17 = q75.c.b("mp4");
                }
                ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).Ai(com.tencent.mm.sdk.platformtools.x2.f193071a, on0Var.f382372o, h17);
                q75.c.f(h17, com.tencent.mm.sdk.platformtools.x2.f193071a);
            }
        }
    }
}
