package g62;

/* loaded from: classes12.dex */
public class a implements wu5.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.KvReportEvent f269072d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g62.b f269073e;

    public a(g62.b bVar, com.tencent.mm.autogen.events.KvReportEvent kvReportEvent) {
        this.f269073e = bVar;
        this.f269072d = kvReportEvent;
    }

    @Override // wu5.f
    public boolean a() {
        return false;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "callbackOfKvReportEvent_tasks";
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.HashMap hashMap;
        boolean z17;
        q42.l lVar = g42.f.Bi().f268721d;
        com.tencent.mm.autogen.events.KvReportEvent kvReportEvent = this.f269072d;
        am.ji jiVar = kvReportEvent.f54460g;
        java.lang.String str = jiVar.f7034b;
        int i17 = (int) jiVar.f7033a;
        lVar.getClass();
        if (g42.i.h()) {
            if (((java.util.HashMap) l42.n.Ai().f316001f).containsKey(java.lang.String.valueOf(i17))) {
                if (i17 <= 0 || u46.l.e(str)) {
                    com.tencent.mars.xlog.Log.e("EdgeComputingDataSourceService", "[EdgeComputingDataSourceService] sendKV data or reportID isEmpty!");
                } else {
                    g42.i.a("EdgeComputingDataSourceService", "[EdgeComputingDataSourceService] sendKV reportID : " + i17 + ", data : " + str);
                    lVar.f360081b.post(new q42.c(lVar, i17, java.lang.System.currentTimeMillis(), str));
                }
            }
        }
        am.ji jiVar2 = kvReportEvent.f54460g;
        long j17 = jiVar2.f7033a;
        java.lang.String str2 = jiVar2.f7034b;
        g62.b bVar = this.f269073e;
        bVar.getClass();
        if (j17 != 11110 && j17 != 11108 && com.tencent.mm.sdk.platformtools.x2.n() && (!com.tencent.mm.sdk.platformtools.t8.K0(bVar.f269074d))) {
            g62.i iVar = new g62.i();
            iVar.f269091h = str2;
            iVar.f269088e = 10001;
            iVar.f269090g = (int) j17;
            gm0.j1.d().g(iVar);
        }
        long j18 = jiVar2.f7033a;
        java.lang.String str3 = jiVar2.f7034b;
        if (!bVar.f269075e || (hashMap = bVar.f269076f) == null) {
            return;
        }
        java.util.List list = (java.util.List) hashMap.get(j18 + "");
        if (list == null) {
            list = new java.util.LinkedList();
            z17 = false;
        } else {
            g62.h hVar = (g62.h) list.get(list.size() - 1);
            hVar.getClass();
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            boolean z19 = java.lang.System.currentTimeMillis() - hVar.f269084b < 1000;
            if (z19) {
                hVar.f269086d = true;
            }
            z17 = z19;
        }
        boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        list.add(0, new g62.h(j18, str3, java.lang.System.currentTimeMillis(), z17));
        hashMap.put(j18 + "", list);
    }
}
