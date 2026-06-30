package yi5;

/* loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yi5.c f462622d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(yi5.c cVar) {
        super(1);
        this.f462622d = cVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        wi5.c0 c0Var;
        java.lang.String str;
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        if (!state.e() && (c0Var = (wi5.c0) state.a(wi5.c0.class)) != null && (str = (java.lang.String) kz5.n0.a0(c0Var.f446282b, 0)) != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Contact_User", str);
            j45.l.n(this.f462622d.getContext(), com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, 1);
        }
        return jz5.f0.f302826a;
    }
}
