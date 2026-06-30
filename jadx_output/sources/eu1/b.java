package eu1;

/* loaded from: classes4.dex */
public class b implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f256742d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public int f256743e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final int f256744f = 5;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f256745g = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Runnable f256746h = new eu1.a(this);

    public b() {
        gm0.j1.b().c();
        if (xt1.t0.fj().f456576n == null) {
            xt1.t0.fj().f456576n = new fu1.m(gm0.j1.u().f273153f);
        }
        fu1.m mVar = xt1.t0.fj().f456576n;
        mVar.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor f17 = mVar.f266861d.f("select * from ShareCardSyncItemInfo where retryCount < 10", null, 2);
        while (f17.moveToNext()) {
            fu1.l lVar = new fu1.l();
            lVar.convertFrom(f17);
            arrayList.add(lVar);
        }
        f17.close();
        arrayList.size();
        new java.util.ArrayList();
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareCardBatchGetCardMgr", "scsmgr <init>, init pending list size = %d", java.lang.Integer.valueOf(arrayList.size()));
        gm0.j1.n().f273288b.a(1132, this);
    }

    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareCardBatchGetCardMgr", "doShareCardSyncNetScene");
        int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() / 1000);
        int i17 = currentTimeMillis - this.f256743e;
        int i18 = this.f256744f;
        if (i18 <= 0) {
            i18 = 5;
        }
        if (i17 < i18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ShareCardBatchGetCardMgr", "sync interval is " + i17);
            com.tencent.mm.sdk.platformtools.n3 n3Var = this.f256745g;
            java.lang.Runnable runnable = this.f256746h;
            n3Var.removeCallbacks(runnable);
            n3Var.postDelayed(runnable, i18 * 1000);
        }
        this.f256743e = currentTimeMillis;
    }

    public void b() {
        tt1.l lVar;
        if (this.f256742d == null) {
            return;
        }
        for (int i17 = 0; i17 < ((java.util.ArrayList) this.f256742d).size(); i17++) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.ArrayList) this.f256742d).get(i17);
            if (weakReference != null && (lVar = (tt1.l) weakReference.get()) != null) {
                lVar.W0();
            }
        }
    }

    public void c(tt1.l lVar) {
        if (this.f256742d == null) {
            this.f256742d = new java.util.ArrayList();
        }
        if (lVar != null) {
            this.f256742d.add(new java.lang.ref.WeakReference(lVar));
        }
    }

    public void d(tt1.l lVar) {
        tt1.l lVar2;
        if (this.f256742d == null || lVar == null) {
            return;
        }
        for (int i17 = 0; i17 < this.f256742d.size(); i17++) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) this.f256742d.get(i17);
            if (weakReference != null && (lVar2 = (tt1.l) weakReference.get()) != null && lVar2.equals(lVar)) {
                this.f256742d.remove(weakReference);
                return;
            }
        }
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareCardBatchGetCardMgr", "scsmgr onSceneEnd, errType = %d, errCode = %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 == 0 && i18 == 0) {
            android.support.v4.media.f.a(m1Var);
            throw null;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.ShareCardBatchGetCardMgr", "scsmgr onSceneEnd fail, stop batch get, errType = %d, errCode = %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        android.support.v4.media.f.a(m1Var);
        throw null;
    }
}
