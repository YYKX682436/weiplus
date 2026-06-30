package lu5;

/* loaded from: classes12.dex */
public final class g implements wu5.j {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Runnable f321465d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f321466e;

    public g(java.lang.Runnable runnable, boolean z17) {
        kotlin.jvm.internal.o.h(runnable, "runnable");
        this.f321465d = runnable;
        this.f321466e = z17;
    }

    @Override // wu5.f
    public boolean a() {
        return this.f321466e;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return toString();
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f321465d.run();
    }

    public java.lang.String toString() {
        java.lang.reflect.Field field;
        java.lang.Runnable runnable = this.f321465d;
        if (runnable.getClass() == lu5.c.f321460b && (field = lu5.c.f321461c) != null) {
            return "TPCR-".concat(field.get(runnable).getClass().getName());
        }
        return "TPCR-" + runnable;
    }
}
