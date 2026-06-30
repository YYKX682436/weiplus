package rb2;

/* loaded from: classes10.dex */
public final class p2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f393726d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rb2.z2 f393727e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f393728f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(so2.y0 y0Var, rb2.z2 z2Var, in5.s0 s0Var) {
        super(1);
        this.f393726d = y0Var;
        this.f393727e = z2Var;
        this.f393728f = s0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String username = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(username, "username");
        so2.y0 y0Var = this.f393726d;
        com.tencent.mm.protocal.protobuf.FinderContact reply_contact = y0Var.f410703d.u0().getReply_contact();
        jz5.f0 f0Var = null;
        r45.xk b17 = reply_contact != null ? ya2.d.b(ya2.d.h(reply_contact, null, false, 3, null), false) : null;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        in5.s0 s0Var = this.f393728f;
        if (b17 != null) {
            so2.y0 y0Var2 = this.f393726d;
            android.content.Context context = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            java.lang.String string = b17.getString(0);
            java.lang.String str = string == null ? "" : string;
            rb2.z2 z2Var = this.f393727e;
            so2.g0.b(y0Var2, context, str, z2Var.f393686e.getCommentScene(), z2Var.f393686e.z0(), "");
            f0Var = f0Var2;
        }
        if (f0Var == null) {
            android.content.Context context2 = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            so2.g0.d(y0Var, username, context2, "");
        }
        return f0Var2;
    }
}
