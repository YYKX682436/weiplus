package pv0;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final pv0.b f358520a;

    /* renamed from: b, reason: collision with root package name */
    public final pp0.s0 f358521b;

    /* renamed from: c, reason: collision with root package name */
    public final pp0.r0 f358522c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f358523d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f358524e;

    public g(pv0.b timbreManagerCallback, pp0.s0 speechManager, pp0.r0 materialManager) {
        kotlin.jvm.internal.o.g(timbreManagerCallback, "timbreManagerCallback");
        kotlin.jvm.internal.o.g(speechManager, "speechManager");
        kotlin.jvm.internal.o.g(materialManager, "materialManager");
        this.f358520a = timbreManagerCallback;
        this.f358521b = speechManager;
        this.f358522c = materialManager;
        this.f358523d = jz5.h.b(new pv0.f(this));
        this.f358524e = jz5.h.b(new pv0.d(this));
    }

    public final void a(java.util.List timbreRequestGroupList) {
        kotlin.jvm.internal.o.g(timbreRequestGroupList, "timbreRequestGroupList");
        yu0.t tVar = (yu0.t) kz5.n0.a0(timbreRequestGroupList, 0);
        dw0.a aVar = tVar != null ? tVar.f465841g : null;
        com.tencent.mars.xlog.Log.i("TimbreManager", "submitTimbreRequestGroup: materialPrefix " + aVar + ' ');
        if (aVar == null) {
            com.tencent.mars.xlog.Log.e("TimbreManager", "submitTimbreRequestGroup:  impossible mistake materialPrefix == null");
            return;
        }
        int ordinal = aVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                return;
            }
            vu0.b bVar = (vu0.b) ((jz5.n) this.f358524e).getValue();
            bVar.getClass();
            java.util.Iterator it = timbreRequestGroupList.iterator();
            while (it.hasNext()) {
                yu0.t tVar2 = (yu0.t) it.next();
                java.lang.String str = tVar2.f465838d;
                java.lang.String str2 = tVar2.f465836b;
                com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(uu0.l.a("wav", bVar.b(str, str2)));
                if (r6Var.A() && r6Var.m()) {
                    com.tencent.mars.xlog.Log.i("AudioFilterService", "submitSpeechRequest: cache cacheFile " + r6Var.o());
                    bVar.f440053b.c(new ru0.e(tVar2.f465835a, tVar2.f465836b, tVar2.f465837c, r6Var, null, 16, null));
                } else {
                    ru0.d dVar = new ru0.d(tVar2.f465835a, str2);
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap = bVar.f440054c;
                    if (concurrentHashMap.get(dVar) != null) {
                        return;
                    } else {
                        concurrentHashMap.put(dVar, kotlinx.coroutines.l.d(bVar.f440055d, null, null, new vu0.a(bVar, dVar, tVar2, null), 3, null));
                    }
                }
            }
            return;
        }
        vu0.s sVar = (vu0.s) ((jz5.n) this.f358523d).getValue();
        sVar.getClass();
        java.util.Iterator it6 = timbreRequestGroupList.iterator();
        while (it6.hasNext()) {
            yu0.t tVar3 = (yu0.t) it6.next();
            java.util.List list = tVar3.f465839e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                java.lang.String text = ((com.tencent.maas.moviecomposing.segments.CaptionItem) obj).getText();
                kotlin.jvm.internal.o.f(text, "getText(...)");
                if (text.length() > 0) {
                    arrayList.add(obj);
                }
            }
            java.lang.String c17 = sVar.c(arrayList);
            java.lang.String str3 = tVar3.f465836b;
            java.lang.String b17 = sVar.b(c17, str3, "");
            java.util.Map map = (java.util.Map) sVar.f440158j.get(b17);
            com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(uu0.l.b(), b17);
            if (!r6Var2.m()) {
                r6Var2.J();
            }
            com.tencent.mm.vfs.r6[] G = r6Var2.G();
            com.tencent.mm.vfs.r6 r6Var3 = G != null ? (com.tencent.mm.vfs.r6) kz5.z.O(G) : null;
            if (r6Var3 == null || map == null) {
                ru0.d dVar2 = new ru0.d(tVar3.f465835a, str3);
                java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = sVar.f440156h;
                if (concurrentHashMap2.get(dVar2) != null) {
                    return;
                } else {
                    concurrentHashMap2.put(dVar2, kotlinx.coroutines.l.d(sVar.f440157i, null, null, new vu0.p(sVar, dVar2, arrayList, tVar3, null), 3, null));
                }
            } else {
                com.tencent.mars.xlog.Log.i("AudioTimbreService", "submitSpeechRequest: cache cacheFile " + r6Var3.o());
                sVar.f440150b.c(new ru0.e(tVar3.f465835a, tVar3.f465836b, tVar3.f465837c, r6Var3, map));
            }
        }
    }
}
