package v02;

/* loaded from: classes8.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v02.f0 f432283d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f432284e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(v02.f0 f0Var, java.lang.String str) {
        super(0);
        this.f432283d = f0Var;
        this.f432284e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        v02.f0 f0Var = this.f432283d;
        java.util.Map t17 = kz5.c1.t(f0Var.f432248m);
        t17.remove("chat_name");
        ((cy1.a) f0Var.rj()).Hj("doc_chat_clk", "view_clk", kz5.c1.m(t17, kz5.b1.e(new jz5.l("chat_name", this.f432284e))), 36223);
        return jz5.f0.f302826a;
    }
}
