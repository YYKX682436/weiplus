package eu2;

/* loaded from: classes2.dex */
public final class a0 implements zy2.ub {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eu2.b0 f256755d;

    public a0(eu2.b0 b0Var) {
        this.f256755d = b0Var;
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void E(java.lang.String str, java.lang.String str2) {
        eu2.b0 b0Var = this.f256755d;
        cw2.da daVar = b0Var.f256757d;
        cw2.wa f130756y = daVar != null ? daVar.getF130756y() : null;
        cw2.da daVar2 = b0Var.f256757d;
        java.lang.Long valueOf = daVar2 != null ? java.lang.Long.valueOf(daVar2.getCurrentPlayMs()) : null;
        if (b0Var.Vi(f130756y, "onVideoEnded")) {
            return;
        }
        b0Var.rj(f130756y, false, null, valueOf);
        b0Var.pj();
        b0Var.oj();
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void I(java.lang.String str, java.lang.String str2, int i17, int i18) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void N(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void N5(java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
    }

    @Override // zy2.ub
    public void e3(int i17, int i18) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void i(java.lang.String str, java.lang.String str2) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void l(java.lang.String str, java.lang.String str2) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void m2(java.lang.String str, java.lang.String str2, boolean z17) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void o(java.lang.String str, java.lang.String str2) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void onSeekComplete(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void p2(java.lang.String str, java.lang.String str2) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void v3(java.lang.String str, java.lang.String str2, int i17, int i18, int i19) {
    }
}
