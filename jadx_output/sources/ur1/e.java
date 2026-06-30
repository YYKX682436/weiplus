package ur1;

/* loaded from: classes11.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final ur1.e f430346d = new ur1.e();

    /* renamed from: a, reason: collision with root package name */
    public long f430347a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.LinkedList f430348b;

    /* renamed from: c, reason: collision with root package name */
    public final int f430349c = hashCode();

    public final void a(boolean z17, int i17) {
        ((ox.r) ((rm.d0) i95.n0.c(rm.d0.class))).Bi(i17).a(z17, ur1.a.f430340a);
    }

    public final com.tencent.pigeon.biz.PersonalCenterTabInfo b(android.content.Context context) {
        java.lang.String h5_url;
        kotlin.jvm.internal.o.g(context, "context");
        java.util.LinkedList linkedList = ur1.n.f430361a.b().f385822f;
        kotlin.jvm.internal.o.d(linkedList);
        java.util.Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            r45.jv jvVar = (r45.jv) it.next();
            java.util.LinkedList cell_list = jvVar.f378122d;
            kotlin.jvm.internal.o.f(cell_list, "cell_list");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : cell_list) {
                int i17 = ((r45.kv) obj).f378970d;
                ur1.l[] lVarArr = ur1.l.f430359d;
                if (i17 == 1 || i17 == 2 || i17 == 3) {
                    arrayList.add(obj);
                }
            }
            jvVar.f378122d = new java.util.LinkedList(arrayList);
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        java.util.Iterator it6 = linkedList.iterator();
        boolean z17 = false;
        boolean z18 = false;
        boolean z19 = false;
        while (it6.hasNext()) {
            java.util.LinkedList cell_list2 = ((r45.jv) it6.next()).f378122d;
            kotlin.jvm.internal.o.f(cell_list2, "cell_list");
            java.util.Iterator it7 = cell_list2.iterator();
            while (it7.hasNext()) {
                int i18 = ((r45.kv) it7.next()).f378971e;
                ur1.k[] kVarArr = ur1.k.f430358d;
                if (i18 == 1) {
                    z17 = true;
                } else if (i18 == 6) {
                    z18 = true;
                } else if (i18 == 7) {
                    z19 = true;
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BizFlutterPersonalCenterMgr", "myMessageOk = " + z17 + ", notificationOk = " + z18 + ", settingOk = " + z19);
        if ((z17 && z18 && z19) ? false : true) {
            com.tencent.mm.autogen.mmdata.rpt.BizPersonalCenterReportStruct bizPersonalCenterReportStruct = new com.tencent.mm.autogen.mmdata.rpt.BizPersonalCenterReportStruct();
            bizPersonalCenterReportStruct.f55401d = 102L;
            bizPersonalCenterReportStruct.k();
            com.tencent.mars.xlog.Log.w("MicroMsg.BizFlutterPersonalCenterMgr", "triggerRedLine!");
            r45.jv jvVar2 = new r45.jv();
            java.util.LinkedList linkedList2 = jvVar2.f378122d;
            r45.kv kvVar = new r45.kv();
            ur1.k[] kVarArr2 = ur1.k.f430358d;
            kvVar.f378971e = 1;
            kvVar.f378975i = context.getResources().getString(com.tencent.mm.R.string.alp);
            ur1.l[] lVarArr2 = ur1.l.f430359d;
            kvVar.f378970d = 1;
            linkedList2.add(kvVar);
            r45.jv jvVar3 = new r45.jv();
            java.util.LinkedList linkedList3 = jvVar3.f378122d;
            r45.kv kvVar2 = new r45.kv();
            kvVar2.f378971e = 6;
            kvVar2.f378975i = context.getResources().getString(com.tencent.mm.R.string.alr);
            kvVar2.f378970d = 1;
            linkedList3.add(kvVar2);
            java.util.LinkedList linkedList4 = jvVar3.f378122d;
            r45.kv kvVar3 = new r45.kv();
            kvVar3.f378971e = 7;
            kvVar3.f378975i = context.getResources().getString(com.tencent.mm.R.string.alt);
            kvVar3.f378970d = 1;
            linkedList4.add(kvVar3);
            java.util.LinkedList linkedList5 = new java.util.LinkedList();
            linkedList5.add(jvVar2);
            linkedList5.add(jvVar3);
            linkedList = linkedList5;
        } else {
            com.tencent.mm.autogen.mmdata.rpt.BizPersonalCenterReportStruct bizPersonalCenterReportStruct2 = new com.tencent.mm.autogen.mmdata.rpt.BizPersonalCenterReportStruct();
            bizPersonalCenterReportStruct2.f55401d = 101L;
            bizPersonalCenterReportStruct2.k();
        }
        this.f430348b = linkedList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.LinkedList linkedList6 = this.f430348b;
        if (linkedList6 == null) {
            kotlin.jvm.internal.o.o("cellGroupList");
            throw null;
        }
        java.util.Iterator it8 = linkedList6.iterator();
        while (it8.hasNext()) {
            r45.jv jvVar4 = (r45.jv) it8.next();
            java.util.LinkedList cell_list3 = jvVar4.f378122d;
            kotlin.jvm.internal.o.f(cell_list3, "cell_list");
            if (!cell_list3.isEmpty()) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.util.LinkedList<r45.kv> cell_list4 = jvVar4.f378122d;
                kotlin.jvm.internal.o.f(cell_list4, "cell_list");
                for (r45.kv kvVar4 : cell_list4) {
                    int i19 = kvVar4.f378970d;
                    ur1.l[] lVarArr3 = ur1.l.f430359d;
                    if (i19 == 2) {
                        h5_url = kvVar4.f378972f;
                        kotlin.jvm.internal.o.f(h5_url, "h5_url");
                    } else {
                        h5_url = "";
                    }
                    com.tencent.pigeon.biz.PersonalCenterSingleTabInfo.Companion companion = com.tencent.pigeon.biz.PersonalCenterSingleTabInfo.INSTANCE;
                    java.lang.Object[] objArr = new java.lang.Object[4];
                    objArr[0] = kvVar4.f378975i;
                    int i27 = kvVar4.f378971e;
                    ur1.k[] kVarArr3 = ur1.k.f430358d;
                    objArr[1] = java.lang.Boolean.valueOf(i27 == 7);
                    objArr[2] = java.lang.Integer.valueOf(kvVar4.f378971e);
                    objArr[3] = h5_url;
                    arrayList3.add(companion.fromList(kz5.c0.k(objArr)));
                }
                arrayList2.add(com.tencent.pigeon.biz.PersonalCenterGroupInfo.INSTANCE.fromList(kz5.b0.c(arrayList3)));
            }
        }
        com.tencent.pigeon.biz.PersonalCenterTabInfo.Companion companion2 = com.tencent.pigeon.biz.PersonalCenterTabInfo.INSTANCE;
        java.lang.Object[] objArr2 = new java.lang.Object[2];
        objArr2[0] = arrayList2;
        objArr2[1] = java.lang.Boolean.valueOf(ur1.n.f430361a.b().f385826m == 1);
        return companion2.fromList(kz5.c0.i(objArr2));
    }

    public final void c(long j17, long j18, long j19, java.lang.String biz, boolean z17, java.lang.String wording, long j27) {
        kotlin.jvm.internal.o.g(biz, "biz");
        kotlin.jvm.internal.o.g(wording, "wording");
        byte[] decode = android.util.Base64.decode(biz, 0);
        kotlin.jvm.internal.o.f(decode, "decode(...)");
        long V = com.tencent.mm.sdk.platformtools.t8.V(new java.lang.String(decode, r26.c.f368865a), 0L);
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        boolean l17 = su4.r2.l();
        long j28 = this.f430347a;
        com.tencent.mm.autogen.mmdata.rpt.BizPersonalCenterReportStruct bizPersonalCenterReportStruct = new com.tencent.mm.autogen.mmdata.rpt.BizPersonalCenterReportStruct();
        bizPersonalCenterReportStruct.f55401d = j17;
        bizPersonalCenterReportStruct.f55402e = j18;
        bizPersonalCenterReportStruct.f55403f = j28;
        bizPersonalCenterReportStruct.f55404g = j19;
        bizPersonalCenterReportStruct.f55405h = V;
        bizPersonalCenterReportStruct.f55406i = l17 ? 1L : 0L;
        bizPersonalCenterReportStruct.f55407j = z17 ? 1L : 0L;
        bizPersonalCenterReportStruct.f55408k = com.tencent.mm.storage.c2.f193803a;
        bizPersonalCenterReportStruct.f55409l = j27;
        bizPersonalCenterReportStruct.f55410m = bizPersonalCenterReportStruct.b("wording", wording, true);
        bizPersonalCenterReportStruct.k();
    }

    public final void d(android.content.Context context, int i17, int i18, com.tencent.pigeon.biz.BizCallbackApi bizCallbackApi) {
        kotlin.jvm.internal.o.g(context, "context");
        java.util.LinkedList linkedList = this.f430348b;
        if (linkedList == null) {
            kotlin.jvm.internal.o.o("cellGroupList");
            throw null;
        }
        java.lang.Object element = ((r45.jv) linkedList.get(i17)).f378122d.get(i18);
        com.tencent.mm.autogen.mmdata.rpt.BizPersonalCenterReportStruct bizPersonalCenterReportStruct = new com.tencent.mm.autogen.mmdata.rpt.BizPersonalCenterReportStruct();
        bizPersonalCenterReportStruct.f55401d = 1L;
        r45.kv kvVar = (r45.kv) element;
        bizPersonalCenterReportStruct.f55402e = kvVar.f378971e;
        bizPersonalCenterReportStruct.f55403f = bizPersonalCenterReportStruct.f55408k;
        bizPersonalCenterReportStruct.k();
        int i19 = kvVar.f378970d;
        ur1.l[] lVarArr = ur1.l.f430359d;
        if (i19 == 2) {
            kotlin.jvm.internal.o.f(element, "element");
            r45.kv kvVar2 = (r45.kv) element;
            com.tencent.mars.xlog.Log.i("MicroMsg.BizFlutterPersonalCenterMgr", "jump2Web");
            if (com.tencent.mm.sdk.platformtools.t8.K0(kvVar2.f378972f)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BizFlutterPersonalCenterMgr", "gotoWebView url is null!");
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", kvVar2.f378972f);
            intent.putExtra("KRightBtn", !kvVar2.f378976m);
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
            return;
        }
        ur1.l[] lVarArr2 = ur1.l.f430359d;
        if (i19 != 3) {
            ur1.l[] lVarArr3 = ur1.l.f430359d;
            if (i19 == 1) {
                int i27 = kvVar.f378971e;
                ur1.k[] kVarArr = ur1.k.f430358d;
                if (i27 == 1) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.BizFlutterPersonalCenterMgr", "jump2MyBiz");
                    ((vw.m2) ((rv.k3) i95.n0.c(rv.k3.class))).bj(context, 1);
                    return;
                }
                ur1.k[] kVarArr2 = ur1.k.f430358d;
                if (i27 == 2) {
                    kotlin.jvm.internal.o.f(element, "element");
                    com.tencent.mars.xlog.Log.i("MicroMsg.BizFlutterPersonalCenterMgr", "jump2RecentRead");
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.addFlags(67108864);
                    intent2.putExtra("biz_time_line_line_session_id", this.f430347a);
                    j45.l.j(context, "brandservice", ".ui.personalcenter.recentread.BizPCRecentReadUI", intent2, null);
                    return;
                }
                ur1.k[] kVarArr3 = ur1.k.f430358d;
                if (i27 == 6) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.BizFlutterPersonalCenterMgr", "jump2Notification");
                    ((vw.m2) ((rv.k3) i95.n0.c(rv.k3.class))).fj(context, 1, 0);
                    return;
                }
                ur1.k[] kVarArr4 = ur1.k.f430358d;
                if (i27 == 7) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.BizFlutterPersonalCenterMgr", "jump2Setting");
                    if (context instanceof com.tencent.mm.ui.MMActivity) {
                        j45.l.w((com.tencent.mm.ui.MMActivity) context, "com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineSettingUI", new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineSettingUI.class), this.f430349c, new ur1.c(this, bizCallbackApi));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        kotlin.jvm.internal.o.f(element, "element");
        r45.kv kvVar3 = (r45.kv) element;
        com.tencent.mars.xlog.Log.i("MicroMsg.BizFlutterPersonalCenterMgr", "jump2Wxa");
        if (kvVar3.f378977n == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizFlutterPersonalCenterMgr", "cellInfo.weapp_info == null");
            return;
        }
        l81.b1 b1Var = new l81.b1();
        r45.bn bnVar = kvVar3.f378977n;
        java.lang.String str = bnVar.f370877d;
        b1Var.f317014b = str;
        b1Var.f317012a = bnVar.f370878e;
        b1Var.f317022f = bnVar.f370879f;
        b1Var.f317018d = bnVar.f370884n;
        b1Var.f317016c = bnVar.f370881h;
        b1Var.f317034l = bnVar.f370882i;
        int i28 = bnVar.f370880g;
        if (i28 == 0) {
            i28 = com.tencent.mm.plugin.appbrand.ad.jsapi.e.CTRL_INDEX;
        }
        b1Var.f317032k = i28;
        com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer();
        b1Var.f317041s = appBrandLaunchReferrer;
        appBrandLaunchReferrer.f77323e = str;
        com.tencent.mm.protobuf.g gVar = bnVar.f370883m;
        appBrandLaunchReferrer.f77324f = gVar != null ? gVar.toString() : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.BizFlutterPersonalCenterMgr", "WeAppOpenBundle init, appid = " + b1Var.f317014b + ", username = " + b1Var.f317012a + ", enterPath = " + b1Var.f317022f + ", versionType = " + b1Var.f317016c);
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(context, b1Var);
    }
}
