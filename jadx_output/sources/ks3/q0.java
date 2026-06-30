package ks3;

/* loaded from: classes4.dex */
public class q0 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f311738d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f311739e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f311740f;

    /* renamed from: g, reason: collision with root package name */
    public int f311741g;

    public q0() {
        new java.util.HashMap();
        new java.util.LinkedHashMap();
        new java.util.LinkedHashMap();
        new java.util.HashMap();
        this.f311738d = new java.util.HashMap();
        this.f311739e = new java.util.HashMap();
        this.f311740f = new java.util.HashMap();
        this.f311741g = 0;
        new java.util.ArrayList();
        new java.util.HashMap();
        gm0.j1.n().f273288b.a(483, this);
        gm0.j1.n().f273288b.a(484, this);
        gm0.j1.n().f273288b.a(485, this);
    }

    public final java.util.ArrayList a(java.util.HashMap hashMap) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            arrayList.add((java.lang.Long) it.next());
        }
        return arrayList;
    }

    public final void b(ks3.d0 d0Var) {
        java.util.HashMap hashMap;
        int i17 = this.f311741g + 1;
        this.f311741g = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareModeMailAppService", "processCheckImgStatusSceneEnd, checkTimes: %d", java.lang.Integer.valueOf(i17));
        java.util.Iterator it = ((ks3.d) d0Var.f311653e.f70711b.f70700a).f311651e.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            hashMap = this.f311738d;
            if (!hasNext) {
                break;
            }
            ks3.g gVar = (ks3.g) it.next();
            long j17 = gVar.f311671d;
            int i18 = gVar.f311673f;
            if (hashMap.containsKey(java.lang.Long.valueOf(j17))) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ShareModeMailAppService", "msgSvrId: %d, status: %d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i18));
                if (i18 == 0) {
                    hashMap.remove(java.lang.Long.valueOf(j17));
                    if (gVar.f311672e != null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.ShareModeMailAppService", "msgSvrId: %d, attachId: %s", java.lang.Long.valueOf(j17), gVar.f311672e);
                        this.f311739e.put(java.lang.Long.valueOf(j17), gVar.f311672e);
                        this.f311740f.put(gVar.f311672e, java.lang.Integer.valueOf(gVar.f311674g));
                    }
                } else {
                    hashMap.put(java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i18));
                }
            }
        }
        if (hashMap.isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ShareModeMailAppService", "all image is in server");
        } else {
            if (this.f311741g >= 3) {
                a(hashMap);
                throw null;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ShareModeMailAppService", "checkTime small than limit, doScene again");
            gm0.j1.n().f273288b.g(new ks3.d0(a(hashMap)));
        }
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareModeMailAppService", "onSceneEnd, errType: %d, errCode: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShareModeMailAppService", "errType = %d, errCode = %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            if (m1Var.getType() == 483) {
                b((ks3.d0) m1Var);
                return;
            }
            return;
        }
        if (m1Var.getType() == 483) {
            b((ks3.d0) m1Var);
        } else if (m1Var.getType() == 484) {
            android.support.v4.media.f.a(m1Var);
        } else if (m1Var.getType() == 485) {
            android.support.v4.media.f.a(m1Var);
        }
    }
}
