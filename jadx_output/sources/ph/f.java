package ph;

/* loaded from: classes12.dex */
public abstract class f implements ph.g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f354263a;

    public f(boolean z17) {
        this.f354263a = z17;
    }

    @Override // ph.g
    public boolean a(ph.c batteryState, int i17) {
        kotlin.jvm.internal.o.g(batteryState, "batteryState");
        return !this.f354263a;
    }

    @Override // ph.h
    public boolean b(java.lang.String event) {
        kotlin.jvm.internal.o.g(event, "event");
        throw new java.lang.RuntimeException("Use #onStateChanged(BatteryState, String) instead");
    }

    @Override // ph.g
    public boolean c(ph.c batteryState, int i17) {
        kotlin.jvm.internal.o.g(batteryState, "batteryState");
        return !this.f354263a;
    }

    @Override // ph.h
    public boolean d(ph.c batteryState, long j17) {
        kotlin.jvm.internal.o.g(batteryState, "batteryState");
        return !this.f354263a;
    }

    @Override // ph.g
    public boolean e(ph.c batteryState) {
        kotlin.jvm.internal.o.g(batteryState, "batteryState");
        return !this.f354263a;
    }

    @Override // ph.g
    public boolean f(ph.c batteryState, java.lang.String event) {
        kotlin.jvm.internal.o.g(batteryState, "batteryState");
        kotlin.jvm.internal.o.g(event, "event");
        return !this.f354263a;
    }

    @Override // ph.g
    public boolean g(ph.c batteryState, boolean z17) {
        kotlin.jvm.internal.o.g(batteryState, "batteryState");
        return !this.f354263a;
    }
}
