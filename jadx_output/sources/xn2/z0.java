package xn2;

/* loaded from: classes2.dex */
public final class z0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xn2.f1 f455591d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(xn2.f1 f1Var) {
        super(0);
        this.f455591d = f1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        xn2.f1 f1Var = this.f455591d;
        android.view.View findViewById = f1Var.h().findViewById(com.tencent.mm.R.id.m2_);
        findViewById.setOnClickListener(new xn2.y0(f1Var, findViewById));
        return findViewById;
    }
}
