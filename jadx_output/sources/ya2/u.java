package ya2;

/* loaded from: classes8.dex */
public final class u implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f460548d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f460549e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f460550f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f460551g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f460552h;

    public u(android.content.Context context, com.tencent.mm.ui.widget.dialog.k0 k0Var, int i17, java.lang.String str, kotlin.jvm.internal.h0 h0Var) {
        this.f460548d = context;
        this.f460549e = k0Var;
        this.f460550f = i17;
        this.f460551g = str;
        this.f460552h = h0Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.clear();
        int i17 = this.f460550f;
        java.lang.String str = this.f460551g;
        java.lang.String str2 = (java.lang.String) this.f460552h.f310123d;
        android.content.Context context = this.f460548d;
        g4Var.q(i17, str, context.getResources().getString(com.tencent.mm.R.string.nig), 0, 0);
        ya2.s sVar = new ya2.s(context, str2);
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f460549e;
        k0Var.F = sVar;
        k0Var.G = new ya2.t(str, context);
    }
}
