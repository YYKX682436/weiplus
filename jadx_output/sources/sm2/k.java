package sm2;

/* loaded from: classes3.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409529d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(sm2.o4 o4Var) {
        super(1);
        this.f409529d = o4Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        sm2.o4 o4Var = this.f409529d;
        if (booleanValue) {
            androidx.appcompat.app.AppCompatActivity appCompatActivity = o4Var.f19594b;
            db5.t7.makeText(appCompatActivity, appCompatActivity.getString(com.tencent.mm.R.string.dmz), 0).show();
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.k1 k1Var = ml2.k1.f327638e;
            ml2.y4 y4Var = ml2.j0.f327583i;
            ((ml2.j0) c17).Bj(14, null);
        }
        com.tencent.mm.plugin.finder.live.plugin.v70 v70Var = o4Var.L;
        if (v70Var != null) {
            v70Var.v1();
        }
        return jz5.f0.f302826a;
    }
}
