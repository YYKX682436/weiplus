package ni2;

/* loaded from: classes3.dex */
public final class l1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f337369a;

    /* renamed from: b, reason: collision with root package name */
    public final qo0.c f337370b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.l f337371c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.dialog.k0 f337372d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f337373e;

    public l1(android.content.Context context, qo0.c statusMonitor, com.tencent.mm.plugin.finder.live.plugin.l basePlugin) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        kotlin.jvm.internal.o.g(basePlugin, "basePlugin");
        this.f337369a = context;
        this.f337370b = statusMonitor;
        this.f337371c = basePlugin;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 1, true);
        this.f337372d = k0Var;
        this.f337373e = jz5.h.b(new ni2.k1(this));
        k0Var.V1 = true;
        k0Var.f211872n = new ni2.g1(this);
        k0Var.f211881s = new ni2.h1(this);
        k0Var.p(new ni2.i1(this));
    }
}
