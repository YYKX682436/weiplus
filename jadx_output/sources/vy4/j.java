package vy4;

/* loaded from: classes15.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f441500d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f441501e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f441502f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ vy4.k f441503g;

    public j(vy4.k kVar, java.util.List list, java.util.List list2, java.util.List list3) {
        this.f441503g = kVar;
        this.f441500d = list;
        this.f441501e = list2;
        this.f441502f = list3;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.List list;
        java.util.List list2;
        int i17;
        int i18;
        java.util.List list3;
        this.f441503g.getClass();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.HashSet hashSet2 = new java.util.HashSet();
        java.util.List<vy4.o> list4 = this.f441501e;
        if (list4 != null && !list4.isEmpty()) {
            for (vy4.o oVar : list4) {
                int i19 = oVar.f441514b;
                if (i19 == 1) {
                    hashSet.add(oVar.f441513a);
                } else if (i19 == 2) {
                    hashSet2.add(oVar.f441513a);
                }
            }
        }
        int i27 = 3;
        java.util.List<java.lang.Integer> list5 = this.f441502f;
        if (list5 == null || list5.isEmpty()) {
            list = list5;
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Integer num : list5) {
                yy4.a aVar = new yy4.a();
                aVar.field_expId = num.toString();
                sy4.m.f413884c.c().get(aVar, "expId");
                if (android.text.TextUtils.isEmpty(aVar.field_LabsAppId)) {
                    list3 = list5;
                } else {
                    aVar.field_Switch = i27;
                    list3 = list5;
                    aVar.field_endtime = com.tencent.mm.sdk.platformtools.t8.i1() - 1;
                    arrayList.add(aVar);
                    com.tencent.mars.xlog.Log.i("MicroMsg.XExptForWelabBridge", "welab app[%s] stop now", aVar);
                    java.lang.String str = aVar.field_LabsAppId;
                    java.lang.String str2 = aVar.field_expId;
                    sy4.q qVar = new sy4.q();
                    qVar.f413891a = str;
                    qVar.f413893c = 9;
                    qVar.f413894d = java.lang.System.currentTimeMillis();
                    qVar.f413892b = str2;
                    qVar.f413895e = false;
                    sy4.r.b(qVar);
                }
                list5 = list3;
                i27 = 3;
            }
            list = list5;
            if (!arrayList.isEmpty()) {
                sy4.m.f413884c.c().z0(arrayList);
            }
        }
        java.util.List list6 = this.f441500d;
        if (list6 == null || list6.isEmpty()) {
            list2 = list6;
        } else {
            java.util.HashMap hashMap = new java.util.HashMap();
            java.util.Iterator it = list6.iterator();
            while (it.hasNext()) {
                vy4.n nVar = (vy4.n) it.next();
                yy4.a aVar2 = new yy4.a();
                aVar2.field_expId = java.lang.String.valueOf(nVar.f441508a);
                java.util.List list7 = list6;
                aVar2.field_sequence = nVar.f441509b;
                long j17 = nVar.f441510c;
                if (j17 <= 0) {
                    j17 = java.lang.System.currentTimeMillis() / 1000;
                }
                aVar2.field_starttime = j17;
                long j18 = nVar.f441511d;
                if (j18 <= 0) {
                    j18 = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
                }
                aVar2.field_endtime = j18;
                java.lang.String str3 = "xlab_" + nVar.f441508a;
                java.util.HashMap hashMap2 = nVar.f441512e;
                aVar2.field_AllVer = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) hashMap2.get(sy4.s.b(str3, "AllVer")), 0);
                aVar2.field_BizType = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) hashMap2.get(sy4.s.b(str3, "BizType")), 0);
                aVar2.field_Desc_cn = (java.lang.String) hashMap2.get(sy4.s.b(str3, "Desc_cn"));
                aVar2.field_Desc_en = (java.lang.String) hashMap2.get(sy4.s.b(str3, "Desc_en"));
                aVar2.field_Desc_hk = (java.lang.String) hashMap2.get(sy4.s.b(str3, "Desc_hk"));
                aVar2.field_Desc_tw = (java.lang.String) hashMap2.get(sy4.s.b(str3, "Desc_tw"));
                aVar2.field_DetailURL = (java.lang.String) hashMap2.get(sy4.s.b(str3, "DetailURL"));
                aVar2.field_Introduce_cn = (java.lang.String) hashMap2.get(sy4.s.b(str3, "Introduce_cn"));
                aVar2.field_Introduce_en = (java.lang.String) hashMap2.get(sy4.s.b(str3, "Introduce_en"));
                aVar2.field_Introduce_hk = (java.lang.String) hashMap2.get(sy4.s.b(str3, "Introduce_hk"));
                aVar2.field_Introduce_tw = (java.lang.String) hashMap2.get(sy4.s.b(str3, "Introduce_tw"));
                aVar2.field_Pos = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) hashMap2.get(sy4.s.b(str3, "Pos")), 0);
                aVar2.field_Type = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) hashMap2.get(sy4.s.b(str3, "Type")), 0);
                aVar2.field_Switch = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) hashMap2.get(sy4.s.b(str3, "Switch")), 0);
                aVar2.field_WeAppPath = (java.lang.String) hashMap2.get(sy4.s.b(str3, "WeAppPath"));
                aVar2.field_WeAppUser = (java.lang.String) hashMap2.get(sy4.s.b(str3, "WeAppUser"));
                aVar2.field_LabsAppId = (java.lang.String) hashMap2.get(sy4.s.b(str3, "LabsAppId"));
                aVar2.field_TitleKey_android = (java.lang.String) hashMap2.get(sy4.s.b(str3, "TitleKey_android"));
                aVar2.field_Title_cn = (java.lang.String) hashMap2.get(sy4.s.b(str3, "Title_cn"));
                aVar2.field_Title_en = (java.lang.String) hashMap2.get(sy4.s.b(str3, "Title_en"));
                aVar2.field_Title_hk = (java.lang.String) hashMap2.get(sy4.s.b(str3, "Title_hk"));
                aVar2.field_Title_tw = (java.lang.String) hashMap2.get(sy4.s.b(str3, "Title_tw"));
                aVar2.field_ThumbUrl_cn = (java.lang.String) hashMap2.get(sy4.s.b(str3, "ThumbUrl_cn"));
                aVar2.field_ThumbUrl_en = (java.lang.String) hashMap2.get(sy4.s.b(str3, "ThumbUrl_en"));
                aVar2.field_ThumbUrl_hk = (java.lang.String) hashMap2.get(sy4.s.b(str3, "ThumbUrl_hk"));
                aVar2.field_ThumbUrl_tw = (java.lang.String) hashMap2.get(sy4.s.b(str3, "ThumbUrl_tw"));
                java.util.Iterator it6 = it;
                aVar2.field_ImgUrl_android_cn = sy4.s.a(hashMap2, sy4.s.b(str3, "ImgUrl_android_cn")).replace(',', ';');
                aVar2.field_ImgUrl_android_tw = sy4.s.a(hashMap2, sy4.s.b(str3, "ImgUrl_android_tw")).replace(',', ';');
                aVar2.field_ImgUrl_android_en = sy4.s.a(hashMap2, sy4.s.b(str3, "ImgUrl_android_en")).replace(',', ';');
                aVar2.field_ImgUrl_android_hk = sy4.s.a(hashMap2, sy4.s.b(str3, "ImgUrl_android_hk")).replace(',', ';');
                if (android.text.TextUtils.isEmpty(aVar2.field_ImgUrl_android_cn)) {
                    aVar2.field_ImgUrl_android_cn = (java.lang.String) hashMap2.get(sy4.s.b(str3, "ImgUrl_cn"));
                }
                if (android.text.TextUtils.isEmpty(aVar2.field_ImgUrl_android_en)) {
                    aVar2.field_ImgUrl_android_en = (java.lang.String) hashMap2.get(sy4.s.b(str3, "ImgUrl_en"));
                }
                if (android.text.TextUtils.isEmpty(aVar2.field_ImgUrl_android_hk)) {
                    aVar2.field_ImgUrl_android_hk = (java.lang.String) hashMap2.get(sy4.s.b(str3, "ImgUrl_hk"));
                }
                if (android.text.TextUtils.isEmpty(aVar2.field_ImgUrl_android_tw)) {
                    aVar2.field_ImgUrl_android_tw = (java.lang.String) hashMap2.get(sy4.s.b(str3, "ImgUrl_tw"));
                }
                aVar2.field_RedPoint = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) hashMap2.get(sy4.s.b(str3, "RedPoint")), 0);
                aVar2.field_WeAppDebugMode = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) hashMap2.get(sy4.s.b(str3, "WeAppDebugMode")), 0);
                aVar2.field_TitleKey_android = (java.lang.String) hashMap2.get(sy4.s.b(str3, "TitleKey_android"));
                aVar2.field_Icon = (java.lang.String) hashMap2.get(sy4.s.b(str3, "Icon"));
                aVar2.field_bItemFromXExpt = 1;
                aVar2.field_status = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) hashMap2.get(sy4.s.b(str3, "status")), 0);
                aVar2.field_idkey = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) hashMap2.get(sy4.s.b(str3, "idkey")), 0);
                aVar2.field_idkeyValue = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) hashMap2.get(sy4.s.b(str3, "idkeyValue")), 0);
                if (aVar2.isValid()) {
                    if (!hashMap.containsKey(aVar2.field_LabsAppId)) {
                        hashMap.put(aVar2.field_LabsAppId, aVar2);
                    } else if (com.tencent.mm.sdk.platformtools.t8.P(((yy4.a) hashMap.get(aVar2.field_LabsAppId)).field_expId, 0) < com.tencent.mm.sdk.platformtools.t8.P(aVar2.field_expId, 0)) {
                        hashMap.put(aVar2.field_LabsAppId, aVar2);
                    }
                    int i28 = aVar2.field_idkey;
                    if (i28 > 0 && (i18 = aVar2.field_idkeyValue) >= 0) {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(i28, i18, 1L, false);
                    }
                }
                list6 = list7;
                it = it6;
            }
            list2 = list6;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (yy4.a aVar3 : hashMap.values()) {
                sy4.m mVar = sy4.m.f413884c;
                yy4.a b17 = mVar.b(aVar3.field_LabsAppId);
                if ((b17.field_bItemFromXExpt == 1) && com.tencent.mm.sdk.platformtools.t8.P(b17.field_expId, 0) > com.tencent.mm.sdk.platformtools.t8.P(aVar3.field_expId, 0)) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.XExptForWelabBridge", "it had local welab item, don't update.local[%s] new[%s]", b17, aVar3);
                } else if (aVar3.field_status == 1) {
                    mVar.c().delete(aVar3, "expId");
                } else {
                    arrayList2.add(aVar3);
                    linkedList.add(aVar3);
                    az4.h hVar = az4.h.f16179c;
                    hVar.getClass();
                    if (aVar3.field_RedPoint == 1 && !hVar.b(aVar3.field_LabsAppId) && aVar3.y0()) {
                        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
                        bk0.a.g().p(266267, true);
                    }
                    java.lang.String str4 = aVar3.field_LabsAppId;
                    java.lang.String str5 = aVar3.field_expId;
                    boolean a17 = hVar.a(aVar3);
                    sy4.q qVar2 = new sy4.q();
                    qVar2.f413891a = str4;
                    qVar2.f413893c = 8;
                    qVar2.f413894d = java.lang.System.currentTimeMillis();
                    qVar2.f413892b = str5;
                    qVar2.f413895e = a17;
                    sy4.r.b(qVar2);
                }
            }
            if (!arrayList2.isEmpty()) {
                sy4.m.f413884c.c().z0(arrayList2);
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(kc1.l.CTRL_INDEX, 20);
        }
        if (!hashSet.isEmpty() || !hashSet2.isEmpty()) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.Iterator it7 = ((java.util.ArrayList) sy4.m.f413884c.c().y0()).iterator();
            while (it7.hasNext()) {
                yy4.a aVar4 = (yy4.a) it7.next();
                if (aVar4 != null && aVar4.isValid()) {
                    if (aVar4.field_bItemFromXExpt == 1) {
                        if (hashSet.contains(aVar4.field_LabsAppId) && aVar4.field_Switch == 1) {
                            i17 = 2;
                            aVar4.field_Switch = 2;
                            arrayList3.add(aVar4);
                        } else {
                            i17 = 2;
                        }
                        if (hashSet2.contains(aVar4.field_LabsAppId) && aVar4.field_Switch == i17) {
                            aVar4.field_Switch = 1;
                            arrayList3.add(aVar4);
                        }
                    }
                }
            }
            if (!arrayList3.isEmpty()) {
                sy4.m.f413884c.c().z0(arrayList3);
            }
        }
        sy4.m.f413884c.f(linkedList);
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = java.lang.Integer.valueOf(list2 != null ? list2.size() : 0);
        objArr[1] = java.lang.Integer.valueOf(list != null ? list.size() : 0);
        objArr[2] = java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime);
        objArr[3] = hashSet;
        objArr[4] = hashSet2;
        com.tencent.mars.xlog.Log.i("MicroMsg.XExptForWelabBridge", "itemList [%d] delList[%d] cost[%d] openAppId[%s] closeAppId[%s]", objArr);
    }
}
