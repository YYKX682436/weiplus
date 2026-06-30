package zh1;

@j95.b(dependencies = {com.tencent.mm.plugin.appbrand.app.PluginAppBrand.class})
/* loaded from: classes8.dex */
public final class p extends i95.w implements com.tencent.mm.plugin.appbrand.service.k5 {

    /* renamed from: d, reason: collision with root package name */
    public static final zh1.p f472931d = new zh1.p();

    public zh1.z0 Ai(bi1.g openMaterialScene, android.content.Context context, com.tencent.mm.ui.widget.dialog.k0 bottomSheet, com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection openMaterialCollection, zh1.v0 v0Var, zh1.c1 c1Var) {
        kotlin.jvm.internal.o.g(openMaterialScene, "openMaterialScene");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(bottomSheet, "bottomSheet");
        kotlin.jvm.internal.o.g(openMaterialCollection, "openMaterialCollection");
        openMaterialCollection.toString();
        zh1.z0 a17 = zh1.v.f472945n.a(2L, openMaterialScene, context, bottomSheet, openMaterialCollection, v0Var, c1Var);
        a17.o(zh1.y0.ENABLE);
        return a17;
    }

    public void Bi(java.util.List materialModelList, zh1.a1 a1Var) {
        kotlin.jvm.internal.o.g(materialModelList, "materialModelList");
        materialModelList.toString();
        int i17 = ai1.a.f5080a;
        ai1.p pVar = ai1.p.f5102b;
        java.lang.String a17 = ai1.b.f5081a.a(materialModelList);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WeChatOpenMaterialDataSource", "fetchMultiSelectOpenMaterials materialModelList:" + materialModelList);
        java.util.HashMap hashMap = ai1.p.f5103c;
        synchronized (hashMap) {
            ai1.f fVar = new ai1.f(a1Var, materialModelList);
            if (hashMap.containsKey(a17)) {
                if (a1Var != null) {
                    java.lang.Object obj = hashMap.get(a17);
                    kotlin.jvm.internal.o.d(obj);
                    ((java.util.ArrayList) obj).add(fVar);
                }
                return;
            }
            hashMap.put(a17, new java.util.ArrayList());
            if (a1Var != null) {
                java.lang.Object obj2 = hashMap.get(a17);
                kotlin.jvm.internal.o.d(obj2);
                ((java.util.ArrayList) obj2).add(fVar);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WeChatOpenMaterialDataSource", "fetchMultiSelectOpenMaterialsByCgi requestKey:" + a17 + " materialModelList:" + materialModelList);
            com.tencent.mm.ipcinvoker.wx_extension.x xVar = (com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class);
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            lVar.f70666c = "/cgi-bin/mmbiz-bin/wxabusiness/batchgetmaterialrecommwxa";
            lVar.f70667d = 16463;
            r45.pf pfVar = new r45.pf();
            x.d dVar = new x.d(0);
            java.util.Iterator it = materialModelList.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                java.util.LinkedList linkedList = pfVar.f382992d;
                if (!hasNext) {
                    linkedList.size();
                    lVar.f70664a = pfVar;
                    lVar.f70665b = new r45.qf();
                    ((h80.i) xVar).wi(lVar.a(), new ai1.j(materialModelList, a17));
                    return;
                }
                com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel materialModel = (com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel) it.next();
                java.lang.String mimeType = materialModel.f86269d;
                kotlin.jvm.internal.o.f(mimeType, "mimeType");
                if ((mimeType.length() > 0) && !dVar.contains(materialModel.f86269d)) {
                    r45.wi4 wi4Var = new r45.wi4();
                    wi4Var.f389208d = materialModel.f86269d;
                    wi4Var.f389209e = materialModel.f86270e;
                    linkedList.add(wi4Var);
                    dVar.add(materialModel.f86269d);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection Di(java.util.List r12) {
        /*
            r11 = this;
            java.lang.String r0 = "materialModelList"
            kotlin.jvm.internal.o.g(r12, r0)
            r12.toString()
            ai1.p r0 = ai1.p.f5102b
            ai1.b r1 = ai1.b.f5081a
            boolean r2 = r12.isEmpty()
            r3 = 1
            r4 = 0
            r5 = 0
            java.lang.String r6 = "MicroMsg.AppBrand.OpenMaterialDataCache"
            if (r2 == 0) goto L1e
            java.lang.String r1 = "materialModelList is null, get fail"
            com.tencent.mars.xlog.Log.i(r6, r1)
            goto Lc3
        L1e:
            java.lang.String r1 = r1.a(r12)
            boolean r2 = com.tencent.mm.sdk.platformtools.t8.K0(r1)
            if (r2 == 0) goto L44
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "materialModelListKey is null, get fail, materialModelList:"
            r1.<init>(r2)
            int r2 = r12.size()
            r1.append(r2)
            java.lang.String r2 = " return"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.mars.xlog.Log.w(r6, r1)
            goto Lc3
        L44:
            java.lang.String r2 = "OpenMaterialsMultiRsp###"
            java.lang.String r2 = r2.concat(r1)
            com.tencent.mm.plugin.appbrand.app.q0 r7 = com.tencent.mm.plugin.appbrand.app.q0.f75227a
            com.tencent.mm.sdk.platformtools.o4 r8 = r7.a()
            if (r8 == 0) goto L57
            java.lang.String r8 = r8.getString(r2, r5)
            goto L58
        L57:
            r8 = r5
        L58:
            java.lang.String r9 = "OpenMaterialsMultiRspTime###_"
            java.lang.String r1 = r9.concat(r1)
            com.tencent.mm.sdk.platformtools.o4 r7 = r7.a()
            r9 = 0
            if (r7 == 0) goto L6a
            long r9 = r7.getLong(r1, r9)
        L6a:
            if (r8 == 0) goto L75
            int r1 = r8.length()
            if (r1 != 0) goto L73
            goto L75
        L73:
            r1 = r4
            goto L76
        L75:
            r1 = r3
        L76:
            if (r1 != 0) goto Lc3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r7 = "get, got rawCgiRsp for cacheKey: "
            r1.<init>(r7)
            r1.append(r2)
            java.lang.String r2 = " rawCgiRsp:"
            r1.append(r2)
            int r2 = r8.length()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.mars.xlog.Log.i(r6, r1)
            r45.qf r1 = new r45.qf     // Catch: java.lang.Exception -> Lb1
            r1.<init>()     // Catch: java.lang.Exception -> Lb1
            java.nio.charset.Charset r2 = r26.c.f368867c     // Catch: java.lang.Exception -> Lb1
            byte[] r2 = r8.getBytes(r2)     // Catch: java.lang.Exception -> Lb1
            java.lang.String r7 = "getBytes(...)"
            kotlin.jvm.internal.o.f(r2, r7)     // Catch: java.lang.Exception -> Lb1
            r1.parseFrom(r2)     // Catch: java.lang.Exception -> Lb1
            java.lang.Long r2 = java.lang.Long.valueOf(r9)     // Catch: java.lang.Exception -> Lb1
            nm5.b r1 = nm5.j.c(r1, r2)     // Catch: java.lang.Exception -> Lb1
            goto Lc4
        Lb1:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r7 = "get, parse rawCgiRsp fail since "
            r2.<init>(r7)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.tencent.mars.xlog.Log.w(r6, r1)
        Lc3:
            r1 = r5
        Lc4:
            if (r1 != 0) goto Lce
            java.lang.String r12 = "MicroMsg.AppBrand.WeChatOpenMaterialDataSource"
            java.lang.String r0 = "fetchMultiSelectOpenMaterialsQuickly, cachedCgiRsp is null"
            com.tencent.mars.xlog.Log.i(r12, r0)
            goto Lec
        Lce:
            java.lang.Object r2 = r1.a(r4)
            java.lang.String r4 = "$1(...)"
            kotlin.jvm.internal.o.f(r2, r4)
            r45.qf r2 = (r45.qf) r2
            java.lang.Object r1 = r1.a(r3)
            java.lang.String r3 = "$2(...)"
            kotlin.jvm.internal.o.f(r1, r3)
            java.lang.Number r1 = (java.lang.Number) r1
            long r3 = r1.longValue()
            com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection r5 = r0.c(r2, r3, r12)
        Lec:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zh1.p.Di(java.util.List):com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection");
    }

    public void Ni(com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel materialModel, zh1.a1 fetchOpenMaterialsCallback) {
        kotlin.jvm.internal.o.g(materialModel, "materialModel");
        kotlin.jvm.internal.o.g(fetchOpenMaterialsCallback, "fetchOpenMaterialsCallback");
        materialModel.toString();
        ai1.p pVar = ai1.p.f5102b;
        nm5.b b17 = ai1.b.f5081a.b(materialModel);
        if (b17 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WeChatOpenMaterialDataSource", "fetchOpenMaterials, cachedCgiRsp is null");
            pVar.b(materialModel, fetchOpenMaterialsCallback);
            return;
        }
        java.lang.Object a17 = b17.a(0);
        kotlin.jvm.internal.o.f(a17, "$1(...)");
        java.lang.Object a18 = b17.a(1);
        kotlin.jvm.internal.o.f(a18, "$2(...)");
        pm0.v.X(new ai1.n(fetchOpenMaterialsCallback, (r45.ji3) a17, ((java.lang.Number) a18).longValue(), materialModel));
        pVar.b(materialModel, null);
    }

    public com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection Ri(com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel materialModel) {
        kotlin.jvm.internal.o.g(materialModel, "materialModel");
        int i17 = ai1.a.f5080a;
        ai1.p pVar = ai1.p.f5102b;
        nm5.b b17 = ai1.b.f5081a.b(materialModel);
        if (b17 == null) {
            return null;
        }
        java.lang.Object a17 = b17.a(0);
        kotlin.jvm.internal.o.f(a17, "$1(...)");
        java.lang.Object a18 = b17.a(1);
        kotlin.jvm.internal.o.f(a18, "$2(...)");
        return pVar.d((r45.ji3) a17, ((java.lang.Number) a18).longValue(), materialModel);
    }

    public zh1.w0 Ui(long j17, long j18, com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection appBrandOpenMaterialCollection, java.lang.String str) {
        bi1.g gVar;
        bi1.g gVar2;
        if (j17 != 1) {
            bi1.g gVar3 = bi1.g.IMAGE;
            if (j17 != 2) {
                if (j17 == 3) {
                    gVar2 = bi1.g.VIDEO;
                } else if (j17 == 4) {
                    gVar2 = bi1.g.ATTACH;
                } else if (j17 == 5) {
                    gVar2 = bi1.g.SNS_IMAGE;
                } else if (j17 == 6) {
                    gVar2 = bi1.g.SNS_VIDEO;
                }
            }
            gVar = gVar3;
            return new di1.f(j18, gVar, appBrandOpenMaterialCollection, str);
        }
        gVar2 = bi1.g.WEB_VIEW;
        gVar = gVar2;
        return new di1.f(j18, gVar, appBrandOpenMaterialCollection, str);
    }

    public boolean Vi(bi1.g openMaterialScene) {
        kotlin.jvm.internal.o.g(openMaterialScene, "openMaterialScene");
        boolean z17 = (j62.e.g().i(openMaterialScene.f20993f, openMaterialScene.f20994g, true, true) & openMaterialScene.f20992e) != 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandOpenMaterialService", "isEnabled(" + openMaterialScene + "): " + z17);
        return z17;
    }

    public boolean Zi(com.tencent.mm.ui.widget.dialog.k0 bottomSheet, com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection openMaterialCollection) {
        kotlin.jvm.internal.o.g(bottomSheet, "bottomSheet");
        kotlin.jvm.internal.o.g(openMaterialCollection, "openMaterialCollection");
        int i17 = bottomSheet.R1;
        boolean z17 = true;
        java.util.List appBrandOpenMaterialDetailModels = openMaterialCollection.f86252g;
        if (i17 == 0) {
            java.util.List appBrandOpenMaterialModels = openMaterialCollection.f86251f;
            kotlin.jvm.internal.o.f(appBrandOpenMaterialModels, "appBrandOpenMaterialModels");
            if (!(!appBrandOpenMaterialModels.isEmpty())) {
                kotlin.jvm.internal.o.f(appBrandOpenMaterialDetailModels, "appBrandOpenMaterialDetailModels");
                if (!(!appBrandOpenMaterialDetailModels.isEmpty())) {
                    z17 = false;
                }
            }
        } else {
            kotlin.jvm.internal.o.f(appBrandOpenMaterialDetailModels, "appBrandOpenMaterialDetailModels");
            z17 = true ^ appBrandOpenMaterialDetailModels.isEmpty();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandOpenMaterialService", "needEnhance, needEnhance: " + z17);
        return z17;
    }

    public com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection aj(com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel materialModel) {
        java.lang.String jSONObject;
        java.lang.String string;
        kotlin.jvm.internal.o.g(materialModel, "materialModel");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.OpenMaterialsTempStorage", "getCollectionInner, materialModel: " + materialModel + ", remove: false");
        org.json.JSONObject e17 = ai1.d.e(materialModel);
        if (e17 == null || (jSONObject = e17.toString()) == null) {
            return com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection.a(materialModel);
        }
        com.tencent.mm.sdk.platformtools.o4 a17 = com.tencent.mm.plugin.appbrand.app.q0.f75227a.a();
        com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection appBrandOpenMaterialCollection = null;
        if (a17 != null && (string = a17.getString(jSONObject, null)) != null) {
            try {
                appBrandOpenMaterialCollection = ai1.d.a(new org.json.JSONObject(string));
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.OpenMaterialsTempStorage", "getCollectionInner, fail since " + e18);
            }
        }
        return appBrandOpenMaterialCollection == null ? com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection.a(materialModel) : appBrandOpenMaterialCollection;
    }

    public zh1.w0 bj(bi1.g openMaterialScene, com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel materialModel, com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection openMaterialCollection, boolean z17) {
        kotlin.jvm.internal.o.g(openMaterialScene, "openMaterialScene");
        kotlin.jvm.internal.o.g(materialModel, "materialModel");
        kotlin.jvm.internal.o.g(openMaterialCollection, "openMaterialCollection");
        ai1.c cVar = ai1.c.f5082a;
        return new di1.f(2L, openMaterialScene, openMaterialCollection, z17 ? cVar.a(materialModel, true) : cVar.a(materialModel, false));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a8 A[EDGE_INSN: B:30:0x00a8->B:31:0x00a8 BREAK  A[LOOP:0: B:9:0x000f->B:35:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[LOOP:0: B:9:0x000f->B:35:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean wi(java.util.List r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != 0) goto L4
            return r0
        L4:
            boolean r1 = r8.isEmpty()
            if (r1 == 0) goto Lb
            return r0
        Lb:
            java.util.Iterator r8 = r8.iterator()
        Lf:
            boolean r1 = r8.hasNext()
            r2 = 0
            if (r1 == 0) goto La7
            java.lang.Object r1 = r8.next()
            r3 = r1
            com.tencent.mm.plugin.scanner.ImageQBarDataBean r3 = (com.tencent.mm.plugin.scanner.ImageQBarDataBean) r3
            int r4 = r3.f158620e
            java.lang.String r3 = r3.f158619d
            java.lang.Class<kd0.l2> r5 = kd0.l2.class
            i95.m r6 = i95.n0.c(r5)
            kd0.l2 r6 = (kd0.l2) r6
            jd0.z1 r6 = (jd0.z1) r6
            r6.getClass()
            boolean r6 = com.tencent.mm.plugin.scanner.z0.d(r4, r3)
            if (r6 != 0) goto La3
            i95.m r6 = i95.n0.c(r5)
            kd0.l2 r6 = (kd0.l2) r6
            jd0.z1 r6 = (jd0.z1) r6
            r6.getClass()
            boolean r6 = com.tencent.mm.plugin.scanner.z0.h(r4, r3)
            if (r6 != 0) goto La3
            i95.m r6 = i95.n0.c(r5)
            kd0.l2 r6 = (kd0.l2) r6
            jd0.z1 r6 = (jd0.z1) r6
            r6.getClass()
            boolean r6 = com.tencent.mm.plugin.scanner.z0.l(r4, r3)
            if (r6 != 0) goto La3
            i95.m r6 = i95.n0.c(r5)
            kd0.l2 r6 = (kd0.l2) r6
            jd0.z1 r6 = (jd0.z1) r6
            r6.getClass()
            boolean r6 = com.tencent.mm.plugin.scanner.z0.n(r4, r3)
            if (r6 != 0) goto La3
            i95.m r6 = i95.n0.c(r5)
            kd0.l2 r6 = (kd0.l2) r6
            jd0.z1 r6 = (jd0.z1) r6
            r6.getClass()
            boolean r6 = com.tencent.mm.plugin.scanner.z0.o(r4, r3)
            if (r6 != 0) goto La3
            i95.m r6 = i95.n0.c(r5)
            kd0.l2 r6 = (kd0.l2) r6
            jd0.z1 r6 = (jd0.z1) r6
            r6.getClass()
            boolean r6 = com.tencent.mm.plugin.scanner.z0.k(r4, r3)
            if (r6 != 0) goto La3
            i95.m r5 = i95.n0.c(r5)
            kd0.l2 r5 = (kd0.l2) r5
            jd0.z1 r5 = (jd0.z1) r5
            r5.getClass()
            boolean r3 = com.tencent.mm.plugin.scanner.z0.m(r4, r3)
            if (r3 != 0) goto La3
            boolean r3 = com.tencent.mm.plugin.scanner.j1.b(r4)
            if (r3 == 0) goto La1
            goto La3
        La1:
            r3 = r2
            goto La4
        La3:
            r3 = r0
        La4:
            if (r3 == 0) goto Lf
            goto La8
        La7:
            r1 = 0
        La8:
            if (r1 != 0) goto Lab
            goto Lac
        Lab:
            r0 = r2
        Lac:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zh1.p.wi(java.util.List):boolean");
    }
}
