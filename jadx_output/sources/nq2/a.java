package nq2;

/* loaded from: classes2.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f338976d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f338977e;

    public a(r45.qt2 qt2Var, java.util.LinkedList linkedList) {
        this.f338976d = qt2Var;
        this.f338977e = linkedList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nq2.d dVar = nq2.d.f338980a;
        if (!dVar.b()) {
            com.tencent.mars.xlog.Log.w("NearbyPreloadManager", "startPreloadNearbyLiveTabPages return for enableNearbyLivePagesPreload:" + dVar.b());
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startPreloadNearbyLiveTabPages tabList:");
        java.util.LinkedList<r45.dd2> linkedList = this.f338977e;
        sb6.append(linkedList.size());
        com.tencent.mars.xlog.Log.i("NearbyPreloadManager", sb6.toString());
        for (r45.dd2 dd2Var : linkedList) {
            java.util.HashMap hashMap = nq2.d.f338982c;
            if (hashMap.containsKey(java.lang.Integer.valueOf(dd2Var.getInteger(0)))) {
                com.tencent.mars.xlog.Log.w("NearbyPreloadManager", "startPreloadNearbyLiveTabPages return for map contains tab:[" + dd2Var.getInteger(0) + ", " + dd2Var.getString(1) + ']');
            } else {
                java.util.Iterator it = nq2.d.f338984e.iterator();
                int i17 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i17 = -1;
                        break;
                    } else if (((r45.dd2) it.next()).getInteger(0) == dd2Var.getInteger(0)) {
                        break;
                    } else {
                        i17++;
                    }
                }
                if (i17 != -1) {
                    com.tencent.mars.xlog.Log.w("NearbyPreloadManager", "startPreloadNearbyLiveTabPages return for tab page rendered tab:[" + dd2Var.getInteger(0) + ", " + dd2Var.getString(1) + ']');
                } else if (dd2Var.getBoolean(2)) {
                    nq2.d dVar2 = nq2.d.f338980a;
                    int integer = dd2Var.getInteger(0);
                    int a17 = dVar2.a(integer);
                    pq2.e d17 = dVar2.d(a17, integer, 12);
                    r45.qt2 contextObj = this.f338976d;
                    kotlin.jvm.internal.o.g(contextObj, "contextObj");
                    d17.k();
                    d17.f357591r = contextObj;
                    d17.h();
                    hashMap.put(java.lang.Integer.valueOf(integer), d17);
                    com.tencent.mars.xlog.Log.i("NearbyPreloadManager", "startAndPutTargetNearbyLiveSquareTabPagePreload PagePreloadMap commentScene " + a17 + " TabId: " + integer + " memoryType: " + (integer + 1005000 + dVar2.a(integer)));
                } else {
                    com.tencent.mars.xlog.Log.w("NearbyPreloadManager", "startPreloadNearbyLiveTabPages return for tab disable preload:[" + dd2Var.getInteger(0) + ", " + dd2Var.getString(1) + ']');
                }
            }
        }
    }
}
