package sm2;

/* loaded from: classes3.dex */
public final class e4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409438d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(sm2.o4 o4Var) {
        super(1);
        this.f409438d = o4Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        sm2.o4 o4Var = this.f409438d;
        if (booleanValue) {
            androidx.appcompat.app.AppCompatActivity appCompatActivity = o4Var.f19594b;
            db5.t7.makeText(appCompatActivity, appCompatActivity.getString(com.tencent.mm.R.string.dmz), 0).show();
        }
        com.tencent.mm.plugin.finder.live.plugin.v70 v70Var = o4Var.L;
        if (v70Var != null) {
            v70Var.w1();
        }
        return jz5.f0.f302826a;
    }
}
