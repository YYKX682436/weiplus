package ug2;

/* loaded from: classes3.dex */
public final class c implements ug2.f {

    /* renamed from: a, reason: collision with root package name */
    public final r45.ch1 f427516a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f427517b;

    /* renamed from: c, reason: collision with root package name */
    public long f427518c;

    public c(r45.ch1 msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        this.f427516a = msg;
        this.f427517b = jz5.h.b(new ug2.b(this));
    }

    @Override // ug2.f
    public void a(long j17) {
        this.f427518c = j17;
    }

    @Override // ug2.f
    public ug2.e b() {
        return ug2.e.f427523e;
    }

    @Override // ug2.f
    public long c() {
        return this.f427518c;
    }

    @Override // ug2.f
    public ug2.d priority() {
        return ug2.d.f427520e;
    }
}
