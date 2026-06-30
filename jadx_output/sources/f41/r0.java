package f41;

/* loaded from: classes.dex */
public final class r0 implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f259511d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.storage.z3 f259512e;

    public r0(java.lang.String username) {
        kotlin.jvm.internal.o.g(username, "username");
        this.f259511d = username;
        this.f259512e = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(username, true);
    }

    @Override // in5.c
    public long getItemId() {
        return this.f259511d.hashCode();
    }

    @Override // in5.c
    public int h() {
        return 0;
    }
}
