package ps2;

/* loaded from: classes10.dex */
public final class f extends ps2.d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(java.lang.String str, java.lang.String TAG) {
        super(str, TAG);
        kotlin.jvm.internal.o.g(TAG, "TAG");
    }

    @Override // ps2.d, bi4.o0
    public bi4.d1 a() {
        return null;
    }

    @Override // ps2.d, bi4.o0
    public boolean d(android.content.Context context, android.os.Bundle bundle) {
        pj4.j0 j0Var = this.f21074b;
        if (j0Var == null || !kotlin.jvm.internal.o.b(j0Var.f355139d, "14")) {
            return false;
        }
        java.lang.String str = j0Var.f355142g;
        if (!(str == null || r26.n0.N(str))) {
            byte[] decode = android.util.Base64.decode(j0Var.f355142g, 0);
            pj4.u1 u1Var = new pj4.u1();
            u1Var.parseFrom(decode);
            pj4.s1 s1Var = u1Var.f355306f;
            if (!(s1Var != null && s1Var.f355286d == 0)) {
                java.lang.String str2 = s1Var != null ? s1Var.f355287e : null;
                if (!(str2 == null || str2.length() == 0)) {
                    i95.m c17 = i95.n0.c(ed0.a1.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                    android.app.Activity activity = (android.app.Activity) context;
                    java.lang.String string = bundle != null ? bundle.getString("userName", "") : "";
                    kotlin.jvm.internal.o.f(string, "getClickUserName(...)");
                    vx3.i iVar = new vx3.i();
                    pj4.s1 s1Var2 = u1Var.f355306f;
                    iVar.f441298o = s1Var2 != null ? s1Var2.f355286d : 0L;
                    java.lang.String str3 = s1Var2 != null ? s1Var2.f355287e : null;
                    iVar.f441299p = str3 != null ? str3 : "";
                    pj4.v1 v1Var = u1Var.f355305e;
                    iVar.f441300q = v1Var != null ? v1Var.f355310d : 0;
                    pf5.z zVar = pf5.z.f353948a;
                    if (!(activity instanceof androidx.appcompat.app.AppCompatActivity)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    ((hy2.f) ((iz2.b) zVar.a((androidx.appcompat.app.AppCompatActivity) activity).c(iz2.b.class))).O6(7, new mx3.l(1, 10, string, iVar, activity, false));
                }
            }
            return false;
        }
        return true;
    }

    @Override // ps2.d, bi4.o0
    public java.lang.CharSequence i() {
        return "";
    }

    @Override // ps2.d, bi4.o0
    public boolean p(android.widget.FrameLayout container) {
        kotlin.jvm.internal.o.g(container, "container");
        return false;
    }
}
