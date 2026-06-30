package x51;

/* loaded from: classes5.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f451972d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y61.f f451973e;

    public b(long j17, y61.f fVar) {
        this.f451972d = j17;
        this.f451973e = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.HashSet hashSet = x51.e.f451989a;
        java.util.HashSet hashSet2 = x51.e.f451989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.AddrBookSyncHelper", "syncAddrBook running:%b setSize:%d call:%d callback:%s", false, java.lang.Integer.valueOf(hashSet2.size()), java.lang.Long.valueOf(this.f451972d), this.f451973e);
        hashSet2.add(this.f451973e);
        r61.q0.k(true);
        ((ku5.t0) ku5.t0.f312615d).q(new x51.d(null));
    }
}
