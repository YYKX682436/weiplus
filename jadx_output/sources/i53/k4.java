package i53;

/* loaded from: classes8.dex */
public final class k4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f288637d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f288638e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i53.l4 f288639f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f288640g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f288641h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ m33.i1 f288642i;

    public k4(java.util.List list, java.lang.String str, i53.l4 l4Var, java.util.ArrayList arrayList, int i17, m33.i1 i1Var) {
        this.f288637d = list;
        this.f288638e = str;
        this.f288639f = l4Var;
        this.f288640g = arrayList;
        this.f288641h = i17;
        this.f288642i = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i53.l4 l4Var;
        java.util.ArrayList<p43.a> arrayList;
        java.lang.String j17 = gm0.j1.b().j();
        p43.b Bi = ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Bi();
        kotlin.jvm.internal.o.d(j17);
        java.util.ArrayList arrayList2 = (java.util.ArrayList) ((p43.d) Bi).J0(j17);
        int size = arrayList2.size();
        java.util.Iterator it = this.f288637d.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            l4Var = this.f288639f;
            arrayList = this.f288640g;
            if (!hasNext) {
                break;
            }
            m33.k1 k1Var = (m33.k1) it.next();
            if (com.tencent.mm.vfs.w6.j(k1Var.f323305c)) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(this.f288638e);
                java.lang.String str = java.io.File.separator;
                sb6.append(str);
                java.lang.String sb7 = sb6.toString();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(k1Var.f323303a)) {
                    sb7 = sb7 + k1Var.f323303a + str;
                }
                p43.a a17 = l4Var.a(k1Var, sb7, j17);
                if (a17 != null) {
                    arrayList.add(a17);
                }
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.MiniGameVideoProcessor", "gamelog.saveToGameCenterLocal, GameExternalService, file not exist path= " + k1Var.f323305c);
            }
        }
        int size2 = arrayList.size() + size;
        int i17 = this.f288641h;
        if (size2 > i17) {
            java.util.List subList = arrayList2.subList(0, (size + arrayList.size()) - i17);
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(subList, 10));
            java.util.Iterator it6 = subList.iterator();
            while (it6.hasNext()) {
                arrayList3.add(((p43.a) it6.next()).field_fileId);
            }
            ((p43.d) ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Bi()).z0(arrayList3);
        }
        ((p43.d) ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Bi()).D0(arrayList);
        l4Var.b(arrayList, 1);
        com.tencent.mars.xlog.Log.i("MicroMsg.MiniGameVideoProcessor", "gamelog.saveToGameCenterLocal, GameExternalService, after insert count  = " + ((java.util.ArrayList) ((p43.d) ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Bi()).J0(j17)).size());
        m33.i1 i1Var = this.f288642i;
        if (i1Var != null) {
            i1Var.onSuccess();
        }
        for (p43.a aVar : arrayList) {
            n53.b.c(new lj0.b(aVar.field_appId, 0L, 1L, 3, 3, 0, 0, 0, aVar.field_extJsonData, com.tencent.mm.plugin.appbrand.jsapi.contact.j.CTRL_INDEX, null));
        }
    }
}
