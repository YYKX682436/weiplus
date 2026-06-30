package cw2;

/* loaded from: classes2.dex */
public final class c8 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw2.f8 f223620d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f223621e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c8(cw2.f8 f8Var, androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(2);
        this.f223620d = f8Var;
        this.f223621e = appCompatActivity;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("$");
        cw2.f8 f8Var = this.f223620d;
        sb6.append(f8Var.F0());
        sb6.append(" onFeedSelect ");
        sb6.append(f8Var.f223715z);
        sb6.append(" -> ");
        sb6.append(intValue);
        sb6.append(", ");
        sb6.append(booleanValue);
        sb6.append('.');
        com.tencent.mars.xlog.Log.i("FinderVideoCore", sb6.toString());
        if (f8Var.f223715z != intValue) {
            androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f223621e;
            kotlin.jvm.internal.o.e(appCompatActivity, "null cannot be cast to non-null type android.app.Activity");
            if (!((com.tencent.mm.plugin.finder.viewmodel.component.gg) pf5.z.f353948a.a(appCompatActivity).a(com.tencent.mm.plugin.finder.viewmodel.component.gg.class)).f134514p) {
                com.tencent.mm.plugin.finder.viewmodel.component.gg.f134504z = false;
                com.tencent.mars.xlog.Log.i(pf5.o.TAG, "resumeFromClickFloatBallAndBack:false");
            }
        }
        if (!booleanValue) {
            f8Var.Z();
        }
        f8Var.f223715z = intValue;
        return jz5.f0.f302826a;
    }
}
