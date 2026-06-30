package vb5;

/* loaded from: classes5.dex */
public final class i implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vb5.l f434850d;

    public i(vb5.l lVar) {
        this.f434850d = lVar;
    }

    @Override // l75.q0
    public final void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        vb5.l lVar = this.f434850d;
        java.lang.String str2 = lVar.f434856e;
        if (lVar.f198580d.D() && !com.tencent.mm.sdk.platformtools.t8.K0(str) && kotlin.jvm.internal.o.b(str, lVar.f198580d.x())) {
            ym5.a1.f(new vb5.k(lVar, com.tencent.mm.ui.tipsbar.e.f209929d, false));
        }
    }
}
