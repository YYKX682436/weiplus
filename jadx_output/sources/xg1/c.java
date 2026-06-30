package xg1;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: h, reason: collision with root package name */
    public static android.content.ServiceConnection f454357h;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f454358a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Intent f454359b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC f454360c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.task.k f454361d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.report.AppBrandStatObject f454362e;

    /* renamed from: f, reason: collision with root package name */
    public int f454363f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f454364g;

    public c(android.content.Context ctx, android.content.Intent startAppBrandIntent, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC cfg, com.tencent.mm.plugin.appbrand.task.k task, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject stat) {
        kotlin.jvm.internal.o.g(ctx, "ctx");
        kotlin.jvm.internal.o.g(startAppBrandIntent, "startAppBrandIntent");
        kotlin.jvm.internal.o.g(cfg, "cfg");
        kotlin.jvm.internal.o.g(task, "task");
        kotlin.jvm.internal.o.g(stat, "stat");
        this.f454358a = ctx;
        this.f454359b = startAppBrandIntent;
        this.f454360c = cfg;
        this.f454361d = task;
        this.f454362e = stat;
        this.f454363f = -1;
        this.f454364g = jz5.h.b(new xg1.a(this));
    }
}
