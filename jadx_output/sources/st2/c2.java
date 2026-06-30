package st2;

/* loaded from: classes3.dex */
public final class c2 {

    /* renamed from: a, reason: collision with root package name */
    public static final st2.c2 f412249a = new st2.c2();

    public final java.lang.String a(java.lang.String url, long j17) {
        kotlin.jvm.internal.o.g(url, "url");
        if (r26.n0.B(url, "?", false)) {
            return url + "&objectId=" + pm0.v.u(j17);
        }
        if (!(url.length() > 0)) {
            return url;
        }
        return url + "?objectId=" + pm0.v.u(j17);
    }

    public final com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.ShareActionConfig b(gk2.e liveData, r45.y23 productInfo, r45.ce0 ce0Var) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String string;
        int i17;
        java.lang.String string2;
        java.lang.String string3;
        kotlin.jvm.internal.o.g(liveData, "liveData");
        kotlin.jvm.internal.o.g(productInfo, "productInfo");
        java.lang.String finderUsername = ((mm2.c1) liveData.a(mm2.c1.class)).f328852o;
        long j17 = ((mm2.e1) liveData.a(mm2.e1.class)).f328983m;
        java.lang.String nonceId = ((mm2.e1) liveData.a(mm2.e1.class)).f328992v;
        zl2.b0 b0Var = zl2.b0.f473663a;
        java.lang.String u17 = pm0.v.u(((mm2.e1) liveData.a(mm2.e1.class)).f328988r.getLong(0));
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        kotlin.jvm.internal.o.g(nonceId, "nonceId");
        r45.br2 br2Var = new r45.br2();
        br2Var.set(0, u17);
        br2Var.set(1, finderUsername);
        br2Var.set(2, pm0.v.u(j17));
        br2Var.set(3, nonceId);
        br2Var.set(4, "");
        r45.ce0 ce0Var2 = (r45.ce0) productInfo.getCustom(9);
        if (ce0Var2 == null || (str = ce0Var2.getString(0)) == null) {
            str = "";
        }
        br2Var.set(5, str);
        r45.ce0 ce0Var3 = (r45.ce0) productInfo.getCustom(9);
        if (ce0Var3 == null || (str2 = ce0Var3.getString(1)) == null) {
            str2 = "";
        }
        br2Var.set(6, str2);
        br2Var.set(7, pm0.v.u(productInfo.getLong(0)));
        java.util.LinkedList list = productInfo.getList(2);
        kotlin.jvm.internal.o.f(list, "getImg_urls(...)");
        java.lang.String str5 = (java.lang.String) kz5.n0.a0(list, 0);
        if (str5 == null) {
            str5 = "";
        }
        br2Var.set(8, str5);
        java.lang.String string4 = productInfo.getString(1);
        if (string4 == null) {
            string4 = "";
        }
        br2Var.set(9, string4);
        br2Var.set(11, java.lang.Integer.valueOf(productInfo.getInteger(5)));
        br2Var.set(27, java.lang.Boolean.valueOf(productInfo.getInteger(36) != 0));
        k91.v5 Ai = ((k91.g4) ((com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class))).Ai(br2Var.getString(5));
        if (Ai == null || (str3 = Ai.field_bigHeadURL) == null) {
            str3 = "";
        }
        br2Var.set(12, str3);
        if (Ai == null || (str4 = Ai.field_nickname) == null) {
            str4 = "";
        }
        br2Var.set(13, str4);
        r45.e07 e07Var = (r45.e07) productInfo.getCustom(32);
        br2Var.set(18, e07Var != null ? e07Var.getString(2) : null);
        java.util.LinkedList list2 = productInfo.getList(34);
        br2Var.set(20, list2 != null ? (java.lang.String) kz5.n0.Z(list2) : null);
        java.util.LinkedList list3 = productInfo.getList(34);
        br2Var.set(22, list3 != null ? (java.lang.String) kz5.n0.a0(list3, 1) : null);
        br2Var.set(34, productInfo.getBoolean(63) ? "1" : "");
        br2Var.set(35, productInfo.getString(65));
        r45.id5 id5Var = (r45.id5) productInfo.getCustom(74);
        br2Var.set(36, id5Var != null ? id5Var.getString(0) : null);
        br2Var.set(37, id5Var != null ? id5Var.getString(1) : null);
        br2Var.set(38, id5Var != null ? id5Var.getString(2) : null);
        br2Var.set(39, id5Var != null ? id5Var.getString(3) : null);
        java.lang.String string5 = ce0Var != null ? ce0Var.getString(2) : null;
        if (!(string5 == null || string5.length() == 0)) {
            java.lang.String string6 = ce0Var != null ? ce0Var.getString(3) : null;
            if (!(string6 == null || string6.length() == 0)) {
                if (ce0Var == null || (string = ce0Var.getString(2)) == null) {
                    string = br2Var.getString(12);
                }
                br2Var.set(12, string);
                if (ce0Var == null || (string3 = ce0Var.getString(3)) == null) {
                    i17 = 13;
                    string2 = br2Var.getString(13);
                } else {
                    string2 = string3;
                    i17 = 13;
                }
                br2Var.set(i17, string2);
            }
        }
        if (productInfo.getInteger(31) != 0) {
            br2Var.set(10, java.lang.Integer.valueOf(productInfo.getInteger(4)));
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("platformHeadImg:");
        sb6.append(br2Var.getString(12));
        sb6.append(" platformName: ");
        sb6.append(br2Var.getString(13));
        sb6.append(", page:");
        sb6.append(ce0Var != null ? ce0Var.getString(2) : null);
        sb6.append(", ");
        sb6.append(ce0Var != null ? ce0Var.getString(3) : null);
        com.tencent.mars.xlog.Log.i("Finder.FinderProductShareUtil", sb6.toString());
        br2Var.set(14, "");
        r45.y64 d17 = cm2.a.f43328a.d(productInfo);
        if (d17 != null) {
            long c17 = c01.id.c();
            if (d17.getLong(1) > c17 && d17.getInteger(0) > 0) {
                br2Var.set(15, java.lang.Integer.valueOf(d17.getInteger(0)));
                br2Var.set(16, java.lang.Long.valueOf(d17.getLong(1)));
            }
            com.tencent.mars.xlog.Log.i("Finder.FinderProductShareUtil", productInfo.getString(1) + ",discount_price:" + d17.getInteger(0) + ", serverTime:" + c17 + ",end_time_ms:" + d17.getLong(1));
        }
        br2Var.set(29, productInfo.getString(30));
        br2Var.set(17, ((mm2.c1) liveData.a(mm2.c1.class)).f328786c3);
        zl2.b0.f473665c = br2Var;
        java.lang.String u18 = pm0.v.u(c01.id.a());
        zl2.b0.f473664b.put(u18, br2Var);
        b0Var.f(br2Var, "Finder.FinderProductShareUtilput");
        b0Var.g(br2Var, "commodity_item", zl2.b0.d(b0Var, br2Var, null, null, null, null, 30, null));
        return new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.ShareActionConfig(true, u18);
    }

    public final l81.b1 c(r45.y23 data, int i17, byte[] bArr, java.lang.String setSceneNote, gk2.e eVar, boolean z17) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String string;
        java.util.HashMap hashMap;
        java.util.HashMap hashMap2;
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(setSceneNote, "setSceneNote");
        r45.ce0 ce0Var = z17 ? (r45.ce0) data.getCustom(9) : (r45.ce0) data.getCustom(8);
        boolean z18 = false;
        if (ce0Var != null && (string = ce0Var.getString(0)) != null) {
            if (eVar != null && (hashMap2 = ((mm2.f6) eVar.a(mm2.f6.class)).Q) != null) {
                java.lang.String string2 = ce0Var.getString(2);
                if (string2 == null) {
                    string2 = "";
                }
                hashMap2.put(string, string2);
            }
            if (eVar != null && (hashMap = ((mm2.f6) eVar.a(mm2.f6.class)).R) != null) {
                java.lang.String string3 = ce0Var.getString(3);
                if (string3 == null) {
                    string3 = "";
                }
                hashMap.put(string, string3);
            }
        }
        boolean z19 = ce0Var != null && ce0Var.getInteger(5) == 1;
        com.tencent.mars.xlog.Log.i("FinderLive.MiniProgramPayloadHelper", "showNavigationBar:" + z19);
        l81.b1 b1Var = new l81.b1();
        dk2.ah ahVar = new dk2.ah();
        java.lang.String string4 = data.getString(13);
        if (string4 == null) {
            string4 = "";
        }
        ahVar.f233211d = string4;
        ahVar.f233212e = data.getLong(0);
        ahVar.f233215h = "";
        ahVar.f233214g = com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_PUSH;
        ahVar.f233220p = -1;
        ahVar.f233221q = bArr;
        ahVar.f233223s = z17;
        ahVar.f233224t = !z17;
        ahVar.f233227w = ce0Var != null && ce0Var.getBoolean(8);
        b1Var.f317028i = ahVar;
        if (ce0Var == null || (str = ce0Var.getString(0)) == null) {
            str = "";
        }
        b1Var.f317014b = str;
        if (ce0Var == null || (str2 = ce0Var.getString(1)) == null) {
            str2 = "";
        }
        b1Var.f317022f = str2;
        b1Var.f317032k = i17;
        b1Var.f317034l = setSceneNote;
        int e17 = f412249a.e();
        k91.s2 s2Var = k91.s2.f305760d;
        k91.t2 t2Var = z19 ? k91.t2.f305767e : k91.t2.f305768f;
        boolean z27 = !z19;
        k91.y2 y2Var = k91.y2.f305827d;
        com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.CustomSubjectInfo h17 = zl2.q4.f473933a.h(ce0Var);
        int dimension = (int) com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479706d1);
        if (ce0Var != null && ce0Var.getBoolean(8)) {
            z18 = true;
        }
        b1Var.G = new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig(true, e17, s2Var, false, null, false, null, t2Var, z17, z19, null, y2Var, z27, false, null, false, 0, null, 0, 0, 0, !z18, false, false, null, false, h17, dimension, false, null, z17, 0, false, false, false, false, null, null, null, false, null, null, false, -1277172616, 2047, null);
        com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.String string5 = data.getString(26);
        if (string5 == null) {
            string5 = "";
        }
        jSONObject.put("cookies", string5);
        appBrandLaunchReferrer.f77322d = 1;
        appBrandLaunchReferrer.f77325g = jSONObject.toString();
        b1Var.f317041s = appBrandLaunchReferrer;
        return b1Var;
    }

    public final l81.b1 d(android.content.Context context, r45.ce0 page, int i17, byte[] locClickId, java.lang.String setSceneNote, gk2.e eVar) {
        java.util.HashMap hashMap;
        java.util.HashMap hashMap2;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(page, "page");
        kotlin.jvm.internal.o.g(locClickId, "locClickId");
        kotlin.jvm.internal.o.g(setSceneNote, "setSceneNote");
        java.lang.String string = page.getString(0);
        if (string != null) {
            if (eVar != null && (hashMap2 = ((mm2.f6) eVar.a(mm2.f6.class)).Q) != null) {
                java.lang.String string2 = page.getString(2);
                if (string2 == null) {
                    string2 = "";
                }
                hashMap2.put(string, string2);
            }
            if (eVar != null && (hashMap = ((mm2.f6) eVar.a(mm2.f6.class)).R) != null) {
                java.lang.String string3 = page.getString(3);
                if (string3 == null) {
                    string3 = "";
                }
                hashMap.put(string, string3);
            }
        }
        boolean z17 = page.getInteger(5) == 1;
        com.tencent.mars.xlog.Log.i("FinderLive.MiniProgramPayloadHelper", "getBundleFromPage showNavigationBar:" + z17);
        l81.b1 b1Var = new l81.b1();
        dk2.ah ahVar = new dk2.ah();
        ahVar.f233215h = "";
        ahVar.f233214g = com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_PUSH;
        ahVar.f233220p = -1;
        ahVar.f233221q = locClickId;
        ahVar.f233223s = false;
        ahVar.f233224t = true;
        ahVar.f233227w = page.getBoolean(8);
        b1Var.f317028i = ahVar;
        boolean z18 = ahVar.f233223s;
        boolean z19 = ahVar.f233224t;
        java.lang.String string4 = page.getString(0);
        if (string4 == null) {
            string4 = "";
        }
        b1Var.f317014b = string4;
        java.lang.String string5 = page.getString(1);
        b1Var.f317022f = string5 != null ? string5 : "";
        b1Var.f317032k = i17;
        b1Var.f317034l = setSceneNote;
        int e17 = f412249a.e();
        k91.s2 s2Var = k91.s2.f305760d;
        b1Var.G = new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig(true, e17, s2Var, true, new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.BackgroundShapeConfig(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.z_), true, true, false, false, 24, null), true, new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.CloseWhenClickEmptyAreaConfig(context.getClass().getName(), s2Var), z17 ? k91.t2.f305767e : k91.t2.f305768f, z18, z17, null, k91.y2.f305827d, !z17, z19, null, false, 0, null, 0, 0, 0, !(page.getBoolean(8)), false, false, null, false, zl2.q4.f473933a.h(page), (int) com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479706d1), z18 && !z19, null, false, 0, false, false, false, false, null, null, null, false, null, null, false, -471874560, 2047, null);
        return b1Var;
    }

    public final int e() {
        float f17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).y;
        if (com.tencent.mm.sdk.platformtools.x2.f193075e.getConfiguration().orientation == 2) {
            f17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).x;
        }
        return (int) ((ae2.in.f3688a.h0() / 100.0f) * f17);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x032d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(android.content.Context r64, gk2.e r65, cm2.m0 r66, byte[] r67, boolean r68, kotlin.coroutines.Continuation r69) {
        /*
            Method dump skipped, instructions count: 816
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: st2.c2.f(android.content.Context, gk2.e, cm2.m0, byte[], boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0178, code lost:
    
        if (r10 == null) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x04a5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(android.content.Context r69, gk2.e r70, cm2.m0 r71, kotlin.coroutines.Continuation r72) {
        /*
            Method dump skipped, instructions count: 1230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: st2.c2.g(android.content.Context, gk2.e, cm2.m0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(android.content.Context r78, gk2.e r79, cm2.m0 r80, kotlin.coroutines.Continuation r81) {
        /*
            Method dump skipped, instructions count: 1001
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: st2.c2.h(android.content.Context, gk2.e, cm2.m0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(android.content.Context r16, gk2.e r17, cm2.m0 r18, boolean r19, kotlin.coroutines.Continuation r20) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: st2.c2.i(android.content.Context, gk2.e, cm2.m0, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(android.content.Context r62, gk2.e r63, cm2.m0 r64, byte[] r65, boolean r66, kotlin.coroutines.Continuation r67) {
        /*
            Method dump skipped, instructions count: 714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: st2.c2.j(android.content.Context, gk2.e, cm2.m0, byte[], boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void k(l81.b1 bundle) {
        kotlin.jvm.internal.o.g(bundle, "bundle");
        com.tencent.mars.xlog.Log.i("FinderLive.MiniProgramPayloadHelper", "[appId:" + bundle.f317014b + ",path:" + bundle.f317022f + ",halfScreen:" + bundle.G.c() + ",scene:" + bundle.f317032k + ",sceneNote:" + bundle.f317034l + ",extraData:" + bundle.f317028i + ']');
    }
}
