package kv1;

/* loaded from: classes8.dex */
public class a extends java.util.HashSet {

    /* renamed from: d, reason: collision with root package name */
    public final kv1.b f312648d;

    public a(kv1.b bVar) {
        this.f312648d = bVar;
    }

    @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public synchronized boolean add(java.lang.Object obj) {
        boolean add;
        add = super.add(obj);
        d();
        return add;
    }

    @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        super.clear();
        synchronized (this) {
            iv1.a aVar = (iv1.a) this.f312648d;
            aVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.CDNDownloadClient", "notify clear");
            iv1.f fVar = aVar.f295103a;
            iv1.f.a(fVar);
            com.tencent.mars.xlog.Log.i("MicroMsg.CDNDownloadClient", "stopCheckProcessActiveTimer");
            fVar.f295116m.d();
        }
    }

    public final synchronized void d() {
        iv1.a aVar = (iv1.a) this.f312648d;
        aVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.CDNDownloadClient", "notify add");
        iv1.f fVar = aVar.f295103a;
        fVar.b();
        com.tencent.mars.xlog.Log.i("MicroMsg.CDNDownloadClient", "startCheckProcessActiveTimer");
        fVar.f295116m.c(20000L, 20000L);
    }

    public final synchronized void e() {
        iv1.a aVar = (iv1.a) this.f312648d;
        aVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.CDNDownloadClient", "notify remove");
        iv1.f fVar = aVar.f295103a;
        if (((java.util.HashSet) fVar.f295113g).size() == 0) {
            iv1.f.a(fVar);
            com.tencent.mars.xlog.Log.i("MicroMsg.CDNDownloadClient", "stopCheckProcessActiveTimer");
            fVar.f295116m.d();
        }
    }

    @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public synchronized boolean remove(java.lang.Object obj) {
        boolean remove;
        remove = super.remove(obj);
        e();
        return remove;
    }
}
