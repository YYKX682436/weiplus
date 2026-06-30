package qm3;

/* loaded from: classes10.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final kp4.s0 f364784a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f364785b;

    /* renamed from: c, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f364786c;

    /* renamed from: d, reason: collision with root package name */
    public final qm3.c f364787d;

    public i(kp4.s0 thumbFetcherFactory) {
        kotlin.jvm.internal.o.g(thumbFetcherFactory, "thumbFetcherFactory");
        this.f364784a = thumbFetcherFactory;
        this.f364785b = new java.util.HashMap();
        this.f364786c = kotlinx.coroutines.z0.b();
        this.f364787d = new qm3.c(this);
    }

    public final qm3.a a(kp4.a aVar) {
        java.util.HashMap hashMap = this.f364785b;
        java.lang.Object obj = hashMap.get(aVar);
        if (obj == null) {
            obj = new qm3.a(null, null, null, null, null, null, 63, null);
            hashMap.put(aVar, obj);
        }
        return (qm3.a) obj;
    }
}
