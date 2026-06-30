package vi2;

/* loaded from: classes3.dex */
public final class l implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final r45.if5 f437553d;

    public l(r45.if5 micAudience) {
        kotlin.jvm.internal.o.g(micAudience, "micAudience");
        this.f437553d = micAudience;
    }

    @Override // in5.c
    public long getItemId() {
        return this.f437553d.hashCode();
    }

    @Override // in5.c
    public int h() {
        return 1;
    }
}
