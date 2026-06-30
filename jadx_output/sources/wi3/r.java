package wi3;

/* loaded from: classes4.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f446260d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wi3.o f446261e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f446262f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f446263g;

    public r(long j17, wi3.o oVar, java.lang.String str, int i17) {
        this.f446260d = j17;
        this.f446261e = oVar;
        this.f446262f = str;
        this.f446263g = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneMultiMediaReport", "do report, id:%d", java.lang.Long.valueOf(this.f446260d));
        if (this.f446261e.f446236e != 1) {
            java.lang.String[] split = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_multi_media_report_video_sample, "0,0.5,1.0", true).split(",");
            float[] fArr = new float[split.length];
            for (int i17 = 0; i17 < split.length; i17++) {
                fArr[i17] = com.tencent.mm.sdk.platformtools.t8.L(split[i17], 0.0f);
            }
            java.lang.String i18 = com.tencent.mm.vfs.w6.i(this.f446262f, false);
            final java.lang.String str = this.f446262f;
            final wi3.o oVar = this.f446261e;
            final int i19 = this.f446263g;
            final long j17 = this.f446260d;
            yz5.p pVar = new yz5.p() { // from class: wi3.r$$a
                @Override // yz5.p
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    int i27 = i19;
                    long j18 = j17;
                    java.util.LinkedList linkedList = (java.util.LinkedList) obj;
                    jz5.l lVar = (jz5.l) obj2;
                    if (bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.global.RepairerConfigSendMMFGFileSwitch()) == 1) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        java.util.Iterator it = linkedList.iterator();
                        while (it.hasNext()) {
                            java.util.Iterator it6 = ((java.util.LinkedList) it.next()).iterator();
                            while (it6.hasNext()) {
                                sb6.append((java.lang.Float) it6.next());
                                sb6.append("\n");
                            }
                            sb6.append("\n\n");
                        }
                        ((zc0.h) ((xs.i1) i95.n0.c(xs.i1.class))).aj(java.lang.String.format("mmfg_rpt_%s.txt", java.lang.Long.valueOf(java.lang.System.currentTimeMillis())), sb6.toString().getBytes(), true);
                    }
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(linkedList.size());
                    java.lang.String str2 = str;
                    com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneMultiMediaReport", "mmfg check result:%s, path:%s", valueOf, str2);
                    wi3.n nVar = new wi3.n();
                    java.util.LinkedList linkedList2 = new java.util.LinkedList();
                    java.util.Iterator it7 = linkedList.iterator();
                    while (it7.hasNext()) {
                        java.util.LinkedList linkedList3 = (java.util.LinkedList) it7.next();
                        if (linkedList.size() > 38400) {
                            linkedList3 = new java.util.LinkedList(linkedList3.subList(0, 38400));
                        }
                        wi3.m mVar = new wi3.m();
                        mVar.f446233d = linkedList3;
                        linkedList2.add(mVar);
                    }
                    nVar.f446234d = linkedList2;
                    int intValue = ((java.lang.Integer) lVar.f302833d).intValue();
                    wi3.o oVar2 = oVar;
                    oVar2.f446245q = intValue;
                    oVar2.f446246r = ((java.lang.Integer) lVar.f302834e).intValue();
                    try {
                        byte[] byteArray = nVar.toByteArray();
                        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneMultiMediaReport", "[checkVideo] byte size = " + byteArray.length);
                        oVar2.B = new com.tencent.mm.protobuf.g(byteArray, 0, byteArray.length);
                    } catch (java.io.IOException e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneMultiMediaReport", e17, java.lang.String.format("error %s", str2), new java.lang.Object[0]);
                    }
                    gm0.j1.d().g(new wi3.u(oVar2, i27, j18, null));
                    return null;
                }
            };
            wi3.l lVar = wi3.l.f446226a;
            synchronized (wi3.l.class) {
                kotlinx.coroutines.l.f(null, new wi3.e(pVar, i18, fArr, null), 1, null);
            }
            return;
        }
        android.graphics.BitmapFactory.Options n07 = com.tencent.mm.sdk.platformtools.x.n0(this.f446262f);
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_multi_media_report_filter_limit, 2048);
        int i27 = n07.outWidth;
        int i28 = n07.outHeight;
        if (i27 * i28 > Ni * Ni && i27 * i28 > com.tencent.mm.ui.bk.f() * com.tencent.mm.ui.bk.g()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneMultiMediaReport", "image too large (%d * %d)", java.lang.Integer.valueOf(n07.outWidth), java.lang.Integer.valueOf(n07.outHeight));
            gm0.j1.d().g(new wi3.u(this.f446261e, this.f446263g, this.f446260d, null));
            return;
        }
        wi3.o oVar2 = this.f446261e;
        oVar2.f446245q = n07.outWidth;
        oVar2.f446246r = n07.outHeight;
        java.lang.String str2 = this.f446262f;
        wi3.t tVar = new wi3.t(this);
        wi3.l lVar2 = wi3.l.f446226a;
        synchronized (wi3.l.class) {
            kotlinx.coroutines.l.f(null, new wi3.d(tVar, str2, null), 1, null);
        }
    }
}
