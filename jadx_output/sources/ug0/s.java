package ug0;

/* loaded from: classes5.dex */
public final class s extends jm0.g {

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.sdk.event.IListener f427479f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f427480g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(jm0.o service) {
        super(service);
        kotlin.jvm.internal.o.g(service, "service");
        this.f427480g = new java.util.HashMap();
    }

    public static final ug0.s T6(jm0.o hostService) {
        kotlin.jvm.internal.o.g(hostService, "hostService");
        if (!jm0.g.class.isAssignableFrom(ug0.s.class)) {
            throw new java.lang.IllegalArgumentException(hostService.getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(hostService.getViewModel(), new jm0.e(hostService)).a(ug0.s.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return (ug0.s) ((jm0.g) a17);
    }

    @Override // jm0.g
    public void S6() {
        com.tencent.mm.sdk.event.IListener iListener = this.f427479f;
        if (iListener != null) {
            iListener.dead();
        }
        this.f427479f = null;
    }
}
