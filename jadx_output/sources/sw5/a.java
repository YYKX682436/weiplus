package sw5;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f413489a = new java.util.LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f413490b = new java.util.LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final android.os.Handler f413491c = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f413492d = new java.util.LinkedHashMap();

    public final synchronized qw5.b a(kw5.b bVar, yz5.a aVar) {
        if (bVar == null) {
            return null;
        }
        java.lang.Object obj = ((java.util.LinkedHashMap) this.f413489a).get(bVar);
        if (obj == null) {
            if (aVar != null) {
                ow5.a bizConfig = (ow5.a) aVar.invoke();
                kotlin.jvm.internal.o.g(bizConfig, "bizConfig");
                qw5.b bVar2 = new qw5.b(bizConfig);
                this.f413489a.put(bVar, bVar2);
                this.f413490b.put(bVar, aVar);
                obj = bVar2;
            } else {
                yz5.a aVar2 = (yz5.a) ((java.util.LinkedHashMap) this.f413490b).get(bVar);
                if (aVar2 != null) {
                    ow5.a bizConfig2 = (ow5.a) aVar2.invoke();
                    kotlin.jvm.internal.o.g(bizConfig2, "bizConfig");
                    obj = new qw5.b(bizConfig2);
                    this.f413489a.put(bVar, obj);
                }
            }
        }
        return (qw5.b) obj;
    }

    public final synchronized void b(kw5.b bVar) {
        qw5.b a17 = a(bVar, null);
        if (a17 != null) {
            vw5.b bVar2 = a17.f367233d;
            if (bVar2 != null) {
                ((xw5.d) bVar2).b();
                zw5.a aVar = yw5.a.f467000a;
                yw5.a.f467001b.remove(java.lang.Long.valueOf(a17.f367231b));
            }
            com.tencent.wemagic.adframework.plugin.scl.zidl_gen.b.f220042b.e(a17.f367231b);
            ((rw5.a) a17.f367232c).a();
        }
        synchronized (kw5.b.f313214b) {
            if (bVar != null) {
            }
        }
        this.f413489a.remove(bVar);
        this.f413490b.remove(bVar);
    }
}
