package mn2;

/* loaded from: classes15.dex */
public abstract class d extends com.tencent.mm.loader.cache.memory.e {

    /* renamed from: b, reason: collision with root package name */
    public static final lt0.a f329935b;

    /* renamed from: a, reason: collision with root package name */
    public final jt0.i f329936a;

    static {
        lt0.a aVar = new lt0.a();
        aVar.f321164b = "FinderBitmapMemoryGlobalCache";
        aVar.f321163a = java.lang.Math.max(41943040, aVar.f321163a * 2);
        kt0.g b17 = kt0.g.b();
        kt0.e eVar = new kt0.e(aVar);
        b17.f311915b.put(aVar.f321164b, eVar);
        if (aVar.equals(kt0.g.f311913d)) {
            b17.f311914a = eVar;
        }
        com.tencent.mars.xlog.Log.i("Finder.DefaultBitmapMemoryCache", "cacheConfigure maxSize=" + com.tencent.mm.sdk.platformtools.t8.f0(aVar.f321163a));
        f329935b = aVar;
    }

    public d(int i17) {
        this.f329936a = new jt0.i(i17, mn2.c.f329920a, f329935b, getClass());
        ki.i.f308101c.c(new mn2.b(i17, this));
    }

    @Override // com.tencent.mm.loader.cache.memory.e
    public void c(ip0.a key, dp0.a aVar, java.lang.Object obj) {
        android.graphics.Bitmap value = (android.graphics.Bitmap) obj;
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(value, "value");
        this.f329936a.put(b(key, aVar), value);
    }

    @Override // com.tencent.mm.loader.cache.memory.e
    public void d(ip0.a key, dp0.a aVar) {
        kotlin.jvm.internal.o.g(key, "key");
        this.f329936a.remove(b(key, aVar));
    }
}
