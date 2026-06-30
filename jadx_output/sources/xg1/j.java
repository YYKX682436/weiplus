package xg1;

/* loaded from: classes7.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f454375a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Intent f454376b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC f454377c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.report.AppBrandStatObject f454378d;

    public j(android.content.Context ctx, android.content.Intent intent, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC initConfig, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject statObject) {
        kotlin.jvm.internal.o.g(ctx, "ctx");
        kotlin.jvm.internal.o.g(intent, "intent");
        kotlin.jvm.internal.o.g(initConfig, "initConfig");
        kotlin.jvm.internal.o.g(statObject, "statObject");
        this.f454375a = ctx;
        this.f454376b = intent;
        this.f454377c = initConfig;
        this.f454378d = statObject;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xg1.j)) {
            return false;
        }
        xg1.j jVar = (xg1.j) obj;
        return kotlin.jvm.internal.o.b(this.f454375a, jVar.f454375a) && kotlin.jvm.internal.o.b(this.f454376b, jVar.f454376b) && kotlin.jvm.internal.o.b(this.f454377c, jVar.f454377c) && kotlin.jvm.internal.o.b(this.f454378d, jVar.f454378d);
    }

    public int hashCode() {
        return (((((this.f454375a.hashCode() * 31) + this.f454376b.hashCode()) * 31) + this.f454377c.hashCode()) * 31) + this.f454378d.hashCode();
    }

    public java.lang.String toString() {
        return "PendingIntentTask(ctx=" + this.f454375a + ", intent=" + this.f454376b + ", initConfig=" + this.f454377c + ", statObject=" + this.f454378d + ')';
    }
}
