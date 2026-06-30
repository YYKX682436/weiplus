package q92;

@j95.b
/* loaded from: classes10.dex */
public final class h extends l85.m1 implements m40.g0 {

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f360900i;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f360901g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f360902h;

    static {
        l75.e0 e0Var = m92.b.T1;
        f360900i = new java.lang.String[]{l75.n0.getCreateSQLs(m92.b.T1, "FinderAccount")};
    }

    public h() {
        super("PluginFinderAccount");
        this.f360901g = jz5.h.b(new q92.e(this));
        this.f360902h = jz5.h.b(new q92.f(this));
    }

    public boolean Ai(java.lang.String username) {
        kotlin.jvm.internal.o.g(username, "username");
        ya2.b2 b17 = ya2.h.f460484a.b(username);
        if (b17 == null) {
            return false;
        }
        int i17 = b17.field_follow_Flag;
        l75.e0 e0Var = ya2.b2.O2;
        return i17 != ya2.b2.Q2;
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountInitialized(context);
        ((g92.a) pf5.u.f353936a.e(m40.g0.class).c(g92.a.class)).r5(context);
    }

    @Override // l85.m1, i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountReleased(context);
    }
}
