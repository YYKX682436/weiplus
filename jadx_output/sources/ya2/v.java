package ya2;

/* loaded from: classes8.dex */
public final class v implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f460555d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f460556e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f460557f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f460558g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f460559h;

    public v(android.content.Context context, com.tencent.mm.ui.widget.dialog.k0 k0Var, int i17, kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.h0 h0Var2) {
        this.f460555d = context;
        this.f460556e = k0Var;
        this.f460557f = i17;
        this.f460558g = h0Var;
        this.f460559h = h0Var2;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.clear();
        int i17 = this.f460557f;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.CharSequence charSequence = (java.lang.CharSequence) this.f460558g.f310123d;
        ((ke0.e) xVar).getClass();
        android.content.Context context = this.f460555d;
        android.text.SpannableString i18 = com.tencent.mm.pluginsdk.ui.span.c0.i(context, charSequence);
        java.lang.String str = (java.lang.String) this.f460559h.f310123d;
        g4Var.q(i17, i18, context.getResources().getString(com.tencent.mm.R.string.nig), 0, 0);
        ya2.s sVar = new ya2.s(context, str);
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f460556e;
        k0Var.F = sVar;
        k0Var.G = new ya2.t(i18, context);
    }
}
