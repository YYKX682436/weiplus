package vr1;

/* loaded from: classes8.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vr1.o f439574d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f439575e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(vr1.o oVar, androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(0);
        this.f439574d = oVar;
        this.f439575e = appCompatActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        xr1.g gVar = this.f439574d.f439583e;
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f439575e;
        kotlin.jvm.internal.o.e(appCompatActivity, "null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.ui.personalcenter.recentread.BizPCRecentReadUI");
        xm3.n0 n0Var = new xm3.n0();
        n0Var.f455357b = false;
        return new com.tencent.mm.plugin.mvvmlist.MvvmList(gVar, n0Var, (com.tencent.mm.plugin.brandservice.ui.personalcenter.recentread.BizPCRecentReadUI) appCompatActivity, null, null, 24, null);
    }
}
