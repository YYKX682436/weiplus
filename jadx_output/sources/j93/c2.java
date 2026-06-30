package j93;

/* loaded from: classes.dex */
public final class c2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j93.e2 f298367d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(j93.e2 e2Var) {
        super(1);
        this.f298367d = e2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        wi5.c0 c0Var;
        java.lang.String str;
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        if (!state.e() && (c0Var = (wi5.c0) state.a(wi5.c0.class)) != null && (str = (java.lang.String) kz5.n0.a0(c0Var.f446282b, 0)) != null) {
            j93.e2 e2Var = this.f298367d;
            e2Var.getClass();
            e2Var.f298378f = str;
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Contact_User", str);
            j45.l.n(e2Var.getContext(), com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, 1);
        }
        return jz5.f0.f302826a;
    }
}
