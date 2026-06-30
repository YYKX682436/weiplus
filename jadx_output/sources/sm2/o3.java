package sm2;

/* loaded from: classes3.dex */
public final class o3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f409602d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409603e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(int i17, sm2.o4 o4Var) {
        super(0);
        this.f409602d = i17;
        this.f409603e = o4Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sm2.o4 o4Var = this.f409603e;
        int i17 = this.f409602d;
        if (i17 == -3301) {
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(o4Var.f19594b);
            androidx.appcompat.app.AppCompatActivity appCompatActivity = o4Var.f19594b;
            u1Var.g(appCompatActivity.getResources().getString(com.tencent.mm.R.string.d4i));
            u1Var.n(appCompatActivity.getResources().getString(com.tencent.mm.R.string.d3z));
            u1Var.l(new sm2.l3(o4Var, i17));
            u1Var.q(false);
        } else {
            com.tencent.mm.ui.widget.dialog.u1 u1Var2 = new com.tencent.mm.ui.widget.dialog.u1(o4Var.f19594b);
            androidx.appcompat.app.AppCompatActivity appCompatActivity2 = o4Var.f19594b;
            u1Var2.g(appCompatActivity2.getResources().getString(com.tencent.mm.R.string.d4i));
            u1Var2.n(appCompatActivity2.getResources().getString(com.tencent.mm.R.string.f491447d41));
            u1Var2.l(new sm2.m3(o4Var, i17));
            u1Var2.j(appCompatActivity2.getResources().getString(com.tencent.mm.R.string.f491446d40));
            u1Var2.i(new sm2.n3(o4Var, i17));
            u1Var2.q(false);
        }
        return jz5.f0.f302826a;
    }
}
