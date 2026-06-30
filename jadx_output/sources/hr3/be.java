package hr3;

/* loaded from: classes5.dex */
public final class be extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.pf f283428d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be(hr3.pf pfVar) {
        super(0);
        this.f283428d = pfVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.storage.p7[] L0;
        y35.r[] g17;
        boolean z17;
        hr3.pf pfVar = this.f283428d;
        try {
            java.lang.String username = pfVar.getUsername();
            int i17 = 1;
            if (username != null && (L0 = r21.w.Ai().L0(username, 3)) != null && (g17 = y35.r.g(com.tencent.mm.sdk.platformtools.x2.f193071a, L0)) != null) {
                if (!(g17.length == 0)) {
                    for (y35.r rVar : g17) {
                        if (rVar.k()) {
                            z17 = true;
                            break;
                        }
                    }
                }
            }
            z17 = false;
            dy1.r rVar2 = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.g gVar = pfVar.f283891g;
            cy1.a aVar = (cy1.a) rVar2;
            aVar.pk((android.widget.Button) ((jz5.n) gVar).getValue(), "50164_finish");
            aVar.ik((android.widget.Button) ((jz5.n) gVar).getValue(), 40, 33926);
            android.widget.Button button = (android.widget.Button) ((jz5.n) gVar).getValue();
            jz5.l[] lVarArr = new jz5.l[1];
            if (!z17) {
                i17 = 0;
            }
            lVarArr[0] = new jz5.l("friend_request_has_img", java.lang.Integer.valueOf(i17));
            aVar.gk(button, kz5.c1.l(lVarArr));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SayHiPictureUIC", th6, "bindCommitBtnReport err", new java.lang.Object[0]);
        }
        return jz5.f0.f302826a;
    }
}
