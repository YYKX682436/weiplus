package qd2;

/* loaded from: classes10.dex */
public final class b1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f361705d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qd2.g1 f361706e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(java.lang.String str, qd2.g1 g1Var) {
        super(0);
        this.f361705d = str;
        this.f361706e = g1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str = qd2.g1.f361745u;
        boolean b17 = kotlin.jvm.internal.o.b(this.f361705d, str);
        qd2.g1 g1Var = this.f361706e;
        if (b17) {
            if (!g1Var.f361762p) {
                qd2.g1.a(g1Var, "https://support.weixin.qq.com/cgi-bin/mmsupportacctnodeweb-bin/pages/s6zCQ8q4oR2FpRXe");
            }
        } else if (!g1Var.f361761o) {
            qd2.g1.a(g1Var, str);
        }
        return jz5.f0.f302826a;
    }
}
