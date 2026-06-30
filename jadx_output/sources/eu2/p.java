package eu2;

/* loaded from: classes2.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eu2.b0 f256803d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cw2.wa f256804e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f256805f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(eu2.b0 b0Var, cw2.wa waVar, java.lang.Long l17) {
        super(0);
        this.f256803d = b0Var;
        this.f256804e = waVar;
        this.f256805f = l17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17;
        du2.n Ui = this.f256803d.Ui();
        du2.l lVar = eu2.b0.I;
        fu2.c wi6 = Ui.wi(lVar);
        if (wi6 == null) {
            com.tencent.mars.xlog.Log.i("FinderVideoSystemPlayerController", "[onPlayProgressMs] depend is null, currentBusinessType = " + lVar);
        } else {
            fu2.b bVar = ((eu2.j) wi6).f256792c;
            eu2.b0 b0Var = this.f256803d;
            bVar.f266874a = b0Var.f256764n;
            boolean z18 = true;
            if (b0Var.f256765o) {
                du2.n Ui2 = b0Var.Ui();
                Ui2.getClass();
                if (lVar != Ui2.f243489i) {
                    com.tencent.mars.xlog.Log.i("FinderSystemPlayerManager", "[updateProgress] update progress failed! businessType = " + lVar + ", currentBusinessType = " + Ui2.f243489i);
                } else if (du2.n.Ai(Ui2, null, 1, null) != null) {
                    if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
                        z17 = true;
                    } else {
                        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                        z17 = false;
                    }
                    if (!z17 && !z65.c.a()) {
                        kb2.b bVar2 = kb2.b.f306225a;
                        z18 = false;
                    }
                    if (z18) {
                        com.tencent.mars.xlog.Log.i("FinderSystemPlayerManager", "[updateProgress] businessType = " + lVar);
                    }
                    android.support.v4.media.session.r rVar = Ui2.f243487g;
                    if (rVar != null) {
                        rVar.a("COMMAND_UPDATE_PROGRESS", null, null);
                    }
                }
            } else {
                b0Var.rj(this.f256804e, true, null, this.f256805f);
            }
        }
        return jz5.f0.f302826a;
    }
}
