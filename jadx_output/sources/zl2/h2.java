package zl2;

/* loaded from: classes2.dex */
public final class h2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f473800d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f473801e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f473802f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f473803g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f473804h;

    public h2(kotlin.jvm.internal.h0 h0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, android.content.Context context, kotlin.jvm.internal.h0 h0Var2, java.lang.String str) {
        this.f473800d = h0Var;
        this.f473801e = baseFinderFeed;
        this.f473802f = context;
        this.f473803g = h0Var2;
        this.f473804h = str;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        o25.y1 y1Var = (o25.y1) this.f473800d.f310123d;
        if (y1Var != null) {
            kotlin.jvm.internal.o.e(menuItem, "null cannot be cast to non-null type com.tencent.mm.ui.base.MMMenuItem");
            ((com.tencent.mm.pluginsdk.forward.m) y1Var).aj((db5.h4) menuItem, new zl2.g2(this.f473801e, this.f473800d, menuItem, this.f473802f, this.f473803g, this.f473804h));
        }
    }
}
