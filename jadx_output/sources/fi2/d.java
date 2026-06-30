package fi2;

/* loaded from: classes10.dex */
public final class d implements fi2.l {

    /* renamed from: a, reason: collision with root package name */
    public final zi2.w f262811a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f262812b;

    public d(zi2.w plugin) {
        kotlin.jvm.internal.o.g(plugin, "plugin");
        this.f262811a = plugin;
        this.f262812b = jz5.h.b(new fi2.b(this));
    }

    @Override // fi2.l
    public boolean a() {
        return zl2.r4.f473950a.y1(this.f262811a.S0());
    }

    public final ci2.d d() {
        return (ci2.d) ((jz5.n) this.f262812b).getValue();
    }
}
