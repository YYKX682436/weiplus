package h42;

/* loaded from: classes15.dex */
public abstract class a implements h42.c {

    /* renamed from: a, reason: collision with root package name */
    public j42.f f278906a;

    /* renamed from: b, reason: collision with root package name */
    public int f278907b = 0;

    public void a(java.lang.String str) {
        j42.f fVar;
        if (u46.l.e(str) || (fVar = this.f278906a) == null) {
            return;
        }
        fVar.remove(str);
    }

    public void b() {
        this.f278907b = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_edge_computing_cache_storage_mode, 0);
        j42.f fVar = this.f278906a;
        if (fVar != null) {
            fVar.close();
        }
        this.f278906a = null;
        int i17 = this.f278907b;
        if (i17 == 0) {
            this.f278906a = new j42.e(type());
        } else if (i17 == 1) {
            this.f278906a = new j42.a(type());
        }
        j42.f fVar2 = this.f278906a;
        if (fVar2 == null) {
            com.tencent.mars.xlog.Log.e("EdgeComputingDataCacheBase", "[EdgeComputingDataCacheBase] reset illegal storageMode : " + this.f278907b);
        } else {
            fVar2.reset();
            com.tencent.mars.xlog.Log.i("EdgeComputingDataCacheBase", "[EdgeComputingDataCacheBase] reset storageMode : " + this.f278907b);
        }
    }
}
