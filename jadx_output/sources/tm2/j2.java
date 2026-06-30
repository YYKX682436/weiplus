package tm2;

/* loaded from: classes3.dex */
public final class j2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tm2.s2 f420532d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f420533e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(tm2.s2 s2Var, int i17) {
        super(0);
        this.f420532d = s2Var;
        this.f420533e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        tm2.s2 s2Var = this.f420532d;
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(s2Var.f19600b);
        androidx.appcompat.app.AppCompatActivity appCompatActivity = s2Var.f19600b;
        u1Var.g(appCompatActivity.getResources().getString(com.tencent.mm.R.string.d4i));
        u1Var.n(appCompatActivity.getResources().getString(com.tencent.mm.R.string.f491447d41));
        int i17 = this.f420533e;
        u1Var.l(new tm2.h2(s2Var, i17));
        u1Var.j(appCompatActivity.getResources().getString(com.tencent.mm.R.string.f491446d40));
        u1Var.i(new tm2.i2(s2Var, i17));
        u1Var.q(false);
        return jz5.f0.f302826a;
    }
}
