package z25;

/* loaded from: classes12.dex */
public class h implements g35.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z25.i f469812a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z25.i f469813b;

    public h(z25.i iVar, z25.i iVar2) {
        this.f469813b = iVar;
        this.f469812a = iVar2;
    }

    public void a(boolean z17, int i17, r45.y45 y45Var) {
        z25.e eVar;
        z25.i iVar = this.f469813b;
        iVar.f469819f = false;
        z25.i iVar2 = this.f469812a;
        if (!z17) {
            if (-1 != i17) {
                ((z25.a) iVar.f469822i).a(iVar2, false, i17);
                return;
            } else {
                ((z25.a) iVar.f469822i).a(iVar2, iVar.f469815b < iVar.f469820g, -1);
                return;
            }
        }
        z25.a aVar = (z25.a) iVar.f469822i;
        aVar.f469756y++;
        int i18 = y45Var != null ? y45Var.f390786i : 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.CGIFileUploader", "upload section success, index = %s, successCount:%s, partIDLimit:%s", java.lang.Integer.valueOf(iVar2.f469818e.f469808b), java.lang.Integer.valueOf(aVar.f469756y), java.lang.Integer.valueOf(i18));
        java.util.List list = aVar.f469753v;
        list.remove(iVar2);
        int i19 = aVar.f469757z;
        if (i18 <= i19) {
            i18 = i19;
        }
        aVar.f469757z = i18;
        int i27 = aVar.f469755x;
        z25.k kVar = aVar.f469750s;
        if (i27 > 0) {
            float f17 = (aVar.f469756y * 1.0f) / i27;
            z25.g gVar = iVar2.f469818e;
            long j17 = gVar.f469809c + gVar.f469810d;
            z25.d dVar = (z25.d) kVar;
            dVar.getClass();
            int i28 = aVar.f469761d;
            z25.f fVar = dVar.f469777b;
            if (i28 == fVar.f469790a && (eVar = fVar.f469792c) != null) {
                eVar.b(f17, j17);
            }
        }
        int i29 = iVar2.f469818e.f469808b;
        java.util.List list2 = aVar.f469754w;
        if (i29 == 0) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(y45Var.f390781d)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CGIFileUploader", "no upload id return!");
                aVar.c();
                if (kVar != null) {
                    ((z25.d) kVar).c(aVar, aVar.f469752u, -30002);
                    return;
                }
                return;
            }
            aVar.f469752u = y45Var.f390781d;
            java.util.Iterator it = list2.iterator();
            while (it.hasNext()) {
                ((z25.i) it.next()).f469816c = y45Var.f390781d;
            }
        }
        if (aVar.d(aVar.f469756y)) {
            if (list2.size() == 1 && list.size() == 0) {
                aVar.e();
            }
            if (list2.size() == 0 && list.size() == 0) {
                z25.j jVar = new z25.j();
                jVar.f469823a = y45Var.f390782e;
                jVar.f469824b = y45Var.f390783f;
                jVar.f469826d = aVar.f469759b;
                aVar.c();
                if (kVar != null) {
                    z25.d dVar2 = (z25.d) kVar;
                    com.tencent.mars.xlog.Log.i("MicroMsg.CGIParallelUploadMgr", "upload file success, type = %s, path = %s, aeskey = %s, fileId = %s", java.lang.Integer.valueOf(aVar.f469761d), aVar.f469758a, jVar.f469824b, jVar.f469823a);
                    z25.f fVar2 = dVar2.f469777b;
                    fVar2.f469803n += jVar.f469826d;
                    int i37 = fVar2.f469790a;
                    int i38 = aVar.f469761d;
                    if (i37 == i38) {
                        jVar.f469825c = aVar.f469769l;
                        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        fVar2.f469801l = java.lang.System.currentTimeMillis();
                        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                        java.lang.Integer valueOf = java.lang.Integer.valueOf(dVar2.f469777b.f469791b);
                        java.lang.Long valueOf2 = java.lang.Long.valueOf(dVar2.f469777b.f469802m);
                        z25.f fVar3 = dVar2.f469777b;
                        g0Var.g(20470, true, true, true, valueOf, valueOf2, java.lang.Long.valueOf(fVar3.f469801l - fVar3.f469800k), 0, java.lang.Long.valueOf(dVar2.f469777b.f469803n));
                        g0Var.A(1431, 1);
                        int i39 = dVar2.f469777b.f469791b;
                        if (i39 == 1) {
                            g0Var.A(1431, 4);
                        } else if (i39 == 2) {
                            g0Var.A(1431, 7);
                        } else if (i39 == 3) {
                            g0Var.A(1431, 10);
                            if (dVar2.f469777b.f469802m > 26214400) {
                                g0Var.A(1431, 13);
                            }
                        }
                        z25.e eVar2 = dVar2.f469777b.f469792c;
                        if (eVar2 != null) {
                            eVar2.c(jVar);
                            return;
                        }
                        return;
                    }
                    if (i38 == 1) {
                        dVar2.f469785j = jVar.f469824b;
                        dVar2.f469784i = jVar.f469823a;
                        dVar2.e(24);
                        return;
                    }
                    if (i38 == 2) {
                        dVar2.f469781f = jVar.f469823a;
                        dVar2.f469782g = jVar.f469824b;
                        if (i37 == 25) {
                            dVar2.e(1);
                            return;
                        } else {
                            dVar2.e(i37);
                            return;
                        }
                    }
                    if (i38 != 3) {
                        if (i38 != 24) {
                            dVar2.e(i37);
                            return;
                        }
                        dVar2.f469786k = jVar.f469823a;
                        dVar2.f469787l = jVar.f469824b;
                        dVar2.e(25);
                        return;
                    }
                    dVar2.f469779d = jVar.f469823a;
                    dVar2.f469780e = jVar.f469824b;
                    if (i37 == 1 || i37 == 24 || i37 == 25) {
                        dVar2.e(2);
                    } else {
                        dVar2.e(i37);
                    }
                }
            }
        }
    }
}
