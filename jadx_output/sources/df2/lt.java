package df2;

/* loaded from: classes10.dex */
public final class lt extends if2.b {

    /* renamed from: y1, reason: collision with root package name */
    public static yz5.a f230703y1;
    public in5.c A;
    public kotlinx.coroutines.r2 B;
    public final java.util.LinkedList C;
    public mm2.o6 D;
    public androidx.constraintlayout.widget.ConstraintLayout E;
    public android.widget.FrameLayout F;
    public com.tencent.mm.ui.widget.RoundCornerConstraintLayout G;
    public com.tencent.mm.ui.widget.RoundedCornerFrameLayout H;
    public android.widget.TextView I;

    /* renamed from: J, reason: collision with root package name */
    public android.view.ViewGroup f230704J;
    public if2.d0 K;
    public boolean L;
    public final android.view.View.OnLayoutChangeListener M;
    public boolean N;
    public kotlinx.coroutines.r2 P;
    public android.animation.ValueAnimator Q;
    public android.animation.ValueAnimator R;
    public com.tencent.mm.plugin.finder.view.e3 S;
    public com.tencent.mm.plugin.webview.ui.tools.widget.q1 T;
    public final java.util.HashMap U;
    public jz5.l V;

    /* renamed from: m, reason: collision with root package name */
    public kotlinx.coroutines.r2 f230705m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.view.RecyclerHorizontalViewPager f230706n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f230707o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f230708p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f230709q;

    /* renamed from: r, reason: collision with root package name */
    public in5.c f230710r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f230711s;

    /* renamed from: t, reason: collision with root package name */
    public int f230712t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.Object f230713u;

    /* renamed from: v, reason: collision with root package name */
    public long f230714v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f230715w;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.ArrayList f230716x;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.ArrayList f230717y;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.ArrayList f230718z;
    public static final java.lang.String W = c50.l0.f38610a;
    public static final java.lang.String X = c50.l0.f38611b;
    public static final int Y = 50;
    public static final int Z = 90;

    /* renamed from: p0, reason: collision with root package name */
    public static final int f230698p0 = 1;

    /* renamed from: x0, reason: collision with root package name */
    public static final java.util.HashMap f230700x0 = new java.util.HashMap();

    /* renamed from: y0, reason: collision with root package name */
    public static final int f230702y0 = 40;

    /* renamed from: l1, reason: collision with root package name */
    public static final int f230697l1 = 108;

    /* renamed from: p1, reason: collision with root package name */
    public static final int f230699p1 = 108;

    /* renamed from: x1, reason: collision with root package name */
    public static final int f230701x1 = 65535;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lt(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f230711s = "";
        this.f230712t = -1;
        this.f230713u = new java.lang.Object();
        this.f230716x = new java.util.ArrayList();
        this.f230717y = new java.util.ArrayList();
        this.f230718z = new java.util.ArrayList();
        this.C = new java.util.LinkedList();
        this.M = new df2.ps(this);
        this.U = new java.util.HashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:219:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x074a  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x07d0  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x07e5  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0800  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0806  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0813  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x083d  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x084b  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x085f  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x086c  */
    /* JADX WARN: Removed duplicated region for block: B:352:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:353:0x082b  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0803  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x07d8  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x070f  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0693  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0695  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Z6(df2.lt r49, android.content.Context r50, dk2.h r51) {
        /*
            Method dump skipped, instructions count: 2248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.lt.Z6(df2.lt, android.content.Context, dk2.h):void");
    }

    public static final void a7(df2.lt ltVar, java.lang.String str, r45.bm1 bm1Var) {
        android.view.ViewGroup viewGroup;
        java.lang.String str2;
        java.lang.Class cls;
        int i17;
        java.lang.String str3;
        com.tencent.mm.plugin.webview.util.WebViewControllerPreloadMrg webViewControllerPreloadMrg;
        boolean z17;
        ltVar.getClass();
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.HashMap hashMap = ltVar.U;
        java.lang.Long l17 = (java.lang.Long) hashMap.get(bm1Var.getString(0));
        if (currentTimeMillis - (l17 != null ? l17.longValue() : 0L) >= bm1Var.getInteger(10) * 1000 && (viewGroup = ltVar.f230704J) != null) {
            if (str != null) {
                try {
                    ((yg0.u3) ((zg0.c3) i95.n0.c(zg0.c3.class))).getClass();
                    webViewControllerPreloadMrg = com.tencent.mm.plugin.webview.util.WebViewControllerPreloadMrg.f187731a;
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    str2 = "Finder.LivePromoteBannerController";
                    cls = zg0.c3.class;
                    i17 = 0;
                }
                if (webViewControllerPreloadMrg.c(str)) {
                    ((yg0.u3) ((zg0.c3) i95.n0.c(zg0.c3.class))).getClass();
                    if (com.tencent.mm.plugin.webview.util.WebViewControllerPreloadMrg.f187732b.size() > 0) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.WebViewControllerPreloadMrg", "banner canPreload, do not cache more than 2 WebViewController!!!");
                        z17 = false;
                    } else {
                        z17 = true;
                    }
                    if (z17) {
                        zg0.q2 Ai = ((yg0.e4) ((zg0.g3) i95.n0.c(zg0.g3.class))).Ai(al5.l2.a(new android.content.MutableContextWrapper(viewGroup.getContext())), new zg0.k2(null, false, false, false, false, 0, false, 105, null), null);
                        java.lang.String string = bm1Var.getString(0);
                        if (string == null) {
                            string = "";
                        }
                        ltVar.V = new jz5.l(str, string);
                        com.tencent.mars.xlog.Log.i("Finder.LivePromoteBannerController", "banner cacheInfo set id: " + bm1Var.getString(0) + " url " + str);
                        i95.m c17 = i95.n0.c(zg0.c3.class);
                        kotlin.jvm.internal.o.f(c17, "getService(...)");
                        str2 = "Finder.LivePromoteBannerController";
                        cls = zg0.c3.class;
                        i17 = 0;
                        try {
                            com.tencent.mm.plugin.webview.util.WebViewControllerPreloadMrg.a(webViewControllerPreloadMrg, str, (com.tencent.mm.plugin.webview.core.r0) Ai, true, -1, -1, 80, false, 64, null);
                            java.lang.String string2 = bm1Var.getString(0);
                            if (string2 == null) {
                                string2 = "";
                            }
                            hashMap.put(string2, java.lang.Long.valueOf(currentTimeMillis));
                            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                            java.lang.Object[] objArr = new java.lang.Object[6];
                            java.lang.String string3 = bm1Var.getString(0);
                            if (string3 == null) {
                                string3 = "";
                            }
                            objArr[0] = string3;
                            objArr[1] = 0;
                            objArr[2] = 0;
                            objArr[3] = 0;
                            objArr[4] = 0;
                            objArr[5] = 1;
                            g0Var.d(27755, objArr);
                            str3 = str2;
                        } catch (java.lang.Throwable th7) {
                            th = th7;
                            str3 = str2;
                            com.tencent.mars.xlog.Log.printErrStackTrace(str3, th, "", new java.lang.Object[i17]);
                            ((yg0.u3) ((zg0.c3) i95.n0.c(cls))).wi();
                            com.tencent.mars.xlog.Log.i(str3, "end load wv");
                        }
                        com.tencent.mars.xlog.Log.i(str3, "end load wv");
                    }
                }
            }
            str3 = "Finder.LivePromoteBannerController";
            com.tencent.mars.xlog.Log.i(str3, "end load wv");
        }
    }

    public static final void b7(df2.lt ltVar, java.util.ArrayList arrayList) {
        android.content.Context context;
        java.lang.String str;
        ltVar.getClass();
        ae2.in inVar = ae2.in.f3688a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.D4).getValue()).r()).intValue() != 0) {
            com.tencent.mars.xlog.Log.i("Finder.LivePromoteBannerController", "fetchSideBarInfo live side bar switch close!");
            pm0.v.b0(arrayList, df2.vr.f231625d);
            return;
        }
        if (ltVar.m7()) {
            com.tencent.mars.xlog.Log.i("Finder.LivePromoteBannerController", "disableSidebarBanner");
            pm0.v.b0(arrayList, df2.wr.f231705d);
            return;
        }
        com.tencent.mm.plugin.finder.live.view.ub ubVar = ltVar.f291099e;
        com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout = ubVar instanceof com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout ? (com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout) ubVar : null;
        if (finderLiveVisitorPluginLayout != null ? finderLiveVisitorPluginLayout.getIsPresentedInTimeLineUI() : false) {
            com.tencent.mars.xlog.Log.i("Finder.LivePromoteBannerController", "disable live side bar in mixed flow liveroom");
            pm0.v.b0(arrayList, df2.xr.f231800d);
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.LivePromoteBannerController", "fetchSideBarInfo, origin size:" + arrayList.size());
        android.view.ViewGroup viewGroup = ltVar.f230704J;
        if (viewGroup == null || (context = viewGroup.getContext()) == null) {
            return;
        }
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(pl2.x.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            dk2.h hVar = (dk2.h) it.next();
            com.tencent.mm.protocal.protobuf.NativeInfo native_info = hVar.f233541d.getNative_info();
            if (native_info != null && native_info.getNative_type() == 9) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("banner necessary_params:");
                com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = hVar.f233541d;
                com.tencent.mm.protocal.protobuf.NativeInfo native_info2 = finderJumpInfo.getNative_info();
                sb6.append(native_info2 != null ? native_info2.getNecessary_params() : null);
                com.tencent.mars.xlog.Log.i("Finder.LivePromoteBannerController", sb6.toString());
                if (zl2.r4.f473950a.w1()) {
                    arrayList2.add(hVar);
                } else {
                    try {
                        com.tencent.mm.protocal.protobuf.NativeInfo native_info3 = finderJumpInfo.getNative_info();
                        if (native_info3 == null || (str = native_info3.getNecessary_params()) == null) {
                            str = "";
                        }
                        hVar.f233543f = pm0.b0.h(android.util.Base64.decode(new org.json.JSONObject(str).optString("last_buffer"), 0));
                    } catch (java.lang.Throwable th6) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("Finder.LivePromoteBannerController", th6, "", new java.lang.Object[0]);
                        arrayList2.add(hVar);
                    }
                }
            }
        }
        if (hashMap.size() > 0) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("begin call netscene, size:");
            sb7.append(hashMap.size());
            sb7.append(", hashCodes:");
            java.util.Set keySet = hashMap.keySet();
            kotlin.jvm.internal.o.f(keySet, "<get-keys>(...)");
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(keySet, 10));
            java.util.Iterator it6 = keySet.iterator();
            while (it6.hasNext()) {
                arrayList3.add(java.lang.Integer.valueOf(((com.tencent.mm.modelbase.m1) it6.next()).hashCode()));
            }
            sb7.append(kz5.n0.g0(arrayList3, ",", null, null, 0, null, null, 62, null));
            com.tencent.mars.xlog.Log.i("Finder.LivePromoteBannerController", sb7.toString());
            java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(hashMap.size());
            df2.yr yrVar = new df2.yr(hashMap, countDownLatch);
            gm0.j1.d().a(6479, yrVar);
            java.util.Set keySet2 = hashMap.keySet();
            kotlin.jvm.internal.o.f(keySet2, "<get-keys>(...)");
            java.util.Iterator it7 = keySet2.iterator();
            while (it7.hasNext()) {
                gm0.j1.d().g((com.tencent.mm.modelbase.m1) it7.next());
            }
            countDownLatch.await();
            gm0.j1.d().q(6479, yrVar);
            com.tencent.mars.xlog.Log.i("Finder.LivePromoteBannerController", "finish call netscene");
        }
        com.tencent.mars.xlog.Log.i("Finder.LivePromoteBannerController", "invalid size:" + arrayList2.size());
        arrayList.removeAll(arrayList2);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c7(df2.lt r18, int r19) {
        /*
            Method dump skipped, instructions count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.lt.c7(df2.lt, int):void");
    }

    public static final void d7(df2.lt ltVar) {
        ltVar.o7(null);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.t1 t1Var = ml2.t1.H1;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String b17 = b52.b.b();
        if (b17 == null) {
            b17 = "";
        }
        zy2.zb.T8(zbVar, t1Var, linkedHashMap, b17, null, null, null, false, 120, null);
    }

    public static final void e7(df2.lt ltVar, dk2.h hVar, boolean z17) {
        android.view.ViewGroup viewGroup = ltVar.f230704J;
        if (viewGroup != null) {
            kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(viewGroup.getContext(), 1, true);
            h0Var.f310123d = k0Var;
            k0Var.f211872n = new df2.vs(viewGroup);
            k0Var.f211881s = new df2.ws(hVar, ltVar, z17, h0Var);
            k0Var.p(new df2.xs(ltVar));
            ((com.tencent.mm.ui.widget.dialog.k0) h0Var.f310123d).q(viewGroup.getContext().getString(com.tencent.mm.R.string.dce), 17);
            ((com.tencent.mm.ui.widget.dialog.k0) h0Var.f310123d).v();
        }
    }

    public static final void f7(df2.lt ltVar, java.util.List list) {
        synchronized (ltVar.f230713u) {
            ((mm2.c1) ltVar.business(mm2.c1.class)).f328802f3.clear();
            com.tencent.mars.xlog.Log.i("Finder.LivePromoteBannerController", "result or jump_infos size is %d", java.lang.Integer.valueOf(list.size()));
            if (!list.isEmpty()) {
                ((mm2.c1) ltVar.business(mm2.c1.class)).f328802f3.addAll(list);
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    dk2.h hVar = (dk2.h) it.next();
                    com.tencent.mars.xlog.Log.i("Finder.LivePromoteBannerController", "wording:%s, businessType:%d, jumpType:%d, extInfo:%s", hVar.f233541d.getWording(), java.lang.Integer.valueOf(hVar.f233541d.getBusiness_type()), java.lang.Integer.valueOf(hVar.f233541d.getJumpinfo_type()), hVar.f233541d.getExt_info());
                }
            }
        }
    }

    public static final void g7(df2.lt ltVar, java.util.Set set, dk2.h hVar, com.tencent.mm.sdk.platformtools.o4 o4Var, com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        mm2.o6 o6Var = new mm2.o6(mm2.p6.f329353f, new df2.or(set, hVar, o4Var, ltVar, finderObject), new df2.pr(ltVar), null, 8, null);
        mm2.w6 w6Var = (mm2.w6) ltVar.business(mm2.w6.class);
        w6Var.getClass();
        pm0.v.X(new mm2.r6(w6Var, o6Var));
        ltVar.D = o6Var;
    }

    public final void h7(dk2.h hVar) {
        java.lang.String str;
        r45.bm1 bm1Var;
        if (hVar == null || (bm1Var = hVar.f233545h) == null || (str = bm1Var.getString(0)) == null) {
            str = "";
        }
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        java.util.ArrayList arrayList = this.f230718z;
        if (arrayList.contains(str)) {
            return;
        }
        java.lang.String n76 = n7(hVar, 1);
        android.view.ViewGroup viewGroup = this.f230704J;
        if ((viewGroup != null && viewGroup.getVisibility() == 8) && f230701x1 == 65535 && android.text.TextUtils.isEmpty(this.f230711s)) {
            com.tencent.mars.xlog.Log.i("Finder.LivePromoteBannerController", "reportBannerAction 1");
            t7(n76);
            arrayList.add(str);
        } else if (android.text.TextUtils.isEmpty(this.f230711s)) {
            com.tencent.mars.xlog.Log.i("Finder.LivePromoteBannerController", "reportBannerAction 2");
            t7(n76);
            arrayList.add(str);
        } else {
            if (r26.i0.q(this.f230711s, str, false, 2, null)) {
                return;
            }
            com.tencent.mars.xlog.Log.i("Finder.LivePromoteBannerController", "reportBannerAction 3");
            t7(n76);
            arrayList.add(str);
        }
    }

    public final com.tencent.mm.pluginsdk.ui.span.f0 i7(java.lang.String str, java.lang.String str2, final int i17) {
        com.tencent.mm.pluginsdk.ui.span.f0 f0Var = new com.tencent.mm.pluginsdk.ui.span.f0(str);
        if (!(str2 == null || str2.length() == 0)) {
            int L = r26.n0.L(f0Var, str2, 0, false, 6, null);
            f0Var.c(new android.text.style.StyleSpan() { // from class: com.tencent.mm.plugin.finder.live.controller.LivePromoteBannerController$generateMMSS$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // android.text.style.StyleSpan, android.text.style.CharacterStyle
                public void updateDrawState(android.text.TextPaint textPaint) {
                    super.updateDrawState(textPaint);
                    com.tencent.mm.ui.bk.r0(textPaint, 0.8f);
                    int i18 = i17;
                    if (i18 == -1 || textPaint == null) {
                        return;
                    }
                    textPaint.setColor(i18);
                }
            }, L, str2.length() + L, 33);
        }
        return f0Var;
    }

    @Override // if2.b, if2.m0
    public boolean k() {
        return ((mm2.c1) business(mm2.c1.class)).f328801f2 != 2;
    }

    public final java.lang.String k7(java.lang.String str, int i17) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (str == null) {
            str = "";
        }
        jSONObject.putOpt("bannerid", str);
        jSONObject.putOpt("type", java.lang.Integer.valueOf(i17));
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        return jSONObject2;
    }

    public final int l7(dk2.h hVar) {
        r45.bm1 bm1Var;
        r45.bm1 bm1Var2;
        r45.bm1 bm1Var3;
        r45.bm1 bm1Var4;
        boolean z17 = false;
        if ((hVar == null || (bm1Var4 = hVar.f233545h) == null || bm1Var4.getInteger(15) != 1) ? false : true) {
            if ((hVar == null || (bm1Var3 = hVar.f233545h) == null || bm1Var3.getInteger(1) != 1) ? false : true) {
                return 4;
            }
        }
        if ((hVar == null || (bm1Var2 = hVar.f233545h) == null || bm1Var2.getInteger(15) != 1) ? false : true) {
            return 3;
        }
        if (hVar != null && (bm1Var = hVar.f233545h) != null && bm1Var.getInteger(1) == 1) {
            z17 = true;
        }
        return z17 ? 2 : 1;
    }

    public final boolean m7() {
        dk2.ef efVar = dk2.ef.f233372a;
        km2.n nVar = dk2.ef.H;
        if (nVar == null) {
            return false;
        }
        r45.ta4 e17 = nVar.e();
        return e17 != null && e17.getBoolean(33);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        if ((r2 != null && r2.getNative_type() == 29) != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String n7(dk2.h r8, int r9) {
        /*
            r7 = this;
            r0 = 0
            r1 = 1
            if (r8 == 0) goto L11
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r2 = r8.f233541d
            if (r2 == 0) goto L11
            int r2 = r2.getJumpinfo_type()
            r3 = 3
            if (r2 != r3) goto L11
            r2 = r1
            goto L12
        L11:
            r2 = r0
        L12:
            if (r2 == 0) goto L2a
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r2 = r8.f233541d
            com.tencent.mm.protocal.protobuf.NativeInfo r2 = r2.getNative_info()
            if (r2 == 0) goto L26
            int r2 = r2.getNative_type()
            r3 = 29
            if (r2 != r3) goto L26
            r2 = r1
            goto L27
        L26:
            r2 = r0
        L27:
            if (r2 == 0) goto L2a
            goto L2b
        L2a:
            r1 = r0
        L2b:
            r2 = 0
            if (r1 == 0) goto L9b
            java.lang.String r1 = ""
            if (r8 == 0) goto L42
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r3 = r8.f233541d
            if (r3 == 0) goto L42
            com.tencent.mm.protocal.protobuf.NativeInfo r3 = r3.getNative_info()
            if (r3 == 0) goto L42
            java.lang.String r3 = r3.getNecessary_params()
            if (r3 != 0) goto L43
        L42:
            r3 = r1
        L43:
            java.lang.String r4 = "jump native necessary_params:%s"
            java.lang.Object[] r5 = new java.lang.Object[]{r3}
            java.lang.String r6 = "Finder.LivePromoteBannerController"
            com.tencent.mars.xlog.Log.i(r6, r4, r5)
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> L54
            r4.<init>(r3)     // Catch: org.json.JSONException -> L54
            goto L5b
        L54:
            r3 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r0]
            com.tencent.mars.xlog.Log.printErrStackTrace(r6, r3, r1, r4)
            r4 = r2
        L5b:
            if (r4 == 0) goto L64
            java.lang.String r3 = "queryWord"
            java.lang.String r3 = r4.optString(r3, r1)
            goto L65
        L64:
            r3 = r2
        L65:
            if (r3 != 0) goto L68
            r3 = r1
        L68:
            if (r8 == 0) goto L72
            r45.bm1 r8 = r8.f233545h
            if (r8 == 0) goto L72
            java.lang.String r2 = r8.getString(r0)
        L72:
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            if (r2 != 0) goto L7a
            goto L7b
        L7a:
            r1 = r2
        L7b:
            java.lang.String r0 = "bannerid"
            r8.putOpt(r0, r1)
            java.lang.String r0 = "type"
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r8.putOpt(r0, r9)
            java.lang.String r9 = "search_word"
            r8.putOpt(r9, r3)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "toString(...)"
            kotlin.jvm.internal.o.f(r8, r9)
            goto La9
        L9b:
            if (r8 == 0) goto La5
            r45.bm1 r8 = r8.f233545h
            if (r8 == 0) goto La5
            java.lang.String r2 = r8.getString(r0)
        La5:
            java.lang.String r8 = r7.k7(r2, r9)
        La9:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.lt.n7(dk2.h, int):java.lang.String");
    }

    public final void o7(yz5.a aVar) {
        android.content.Context context;
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = this.E;
        android.view.ViewGroup viewGroup = constraintLayout != null ? (android.view.ViewGroup) constraintLayout.findViewById(com.tencent.mm.R.id.r2k) : null;
        android.view.ViewGroup viewGroup2 = this.f230704J;
        int[] t17 = viewGroup2 != null ? pm0.v.t(viewGroup2) : null;
        int[] t18 = viewGroup != null ? pm0.v.t(viewGroup) : null;
        int width = viewGroup != null ? viewGroup.getWidth() : 0;
        int height = viewGroup != null ? viewGroup.getHeight() : 0;
        android.view.ViewGroup viewGroup3 = this.f230704J;
        if (viewGroup3 == null || (context = viewGroup3.getContext()) == null) {
            return;
        }
        int i17 = context.getResources().getDisplayMetrics().widthPixels;
        float b17 = i65.a.b(context, 414);
        float f17 = i17;
        android.animation.ValueAnimator duration = android.animation.ValueAnimator.ofFloat((b17 <= f17 || b17 <= 0.0f || f17 <= 0.0f) ? 1.0f : f17 / b17, 0.2f).setDuration(300L);
        duration.addUpdateListener(new df2.zr(viewGroup, t17, t18, this, width, height));
        duration.addListener(new df2.as(this, aVar));
        this.Q = duration;
        duration.start();
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveDeactivate() {
        super.onLiveDeactivate();
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveEnd() {
        super.onLiveEnd();
        if2.d0 d0Var = this.K;
        if (d0Var != null) {
            d0Var.d(8);
        }
        com.tencent.mm.plugin.finder.view.e3 e3Var = this.S;
        if (e3Var != null) {
            e3Var.h();
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveMsg(r45.r71 r71Var) {
        super.onLiveMsg(r71Var);
        if (((mm2.c1) business(mm2.c1.class)).f328808g3 != null) {
            com.tencent.mm.plugin.finder.live.view.ub ubVar = this.f291099e;
            com.tencent.mm.plugin.finder.live.view.k0 k0Var = ubVar instanceof com.tencent.mm.plugin.finder.live.view.k0 ? (com.tencent.mm.plugin.finder.live.view.k0) ubVar : null;
            if (k0Var != null) {
                com.tencent.mm.plugin.finder.live.util.y.n(k0Var, null, null, new df2.lr(this, null), 3, null);
            }
        }
        kotlinx.coroutines.r2 r2Var = this.P;
        if ((r2Var == null || ((kotlinx.coroutines.c3) r2Var).isCancelled()) ? false : true) {
            kotlinx.coroutines.r2 r2Var2 = this.P;
            if ((r2Var2 == null || ((kotlinx.coroutines.c3) r2Var2).A()) ? false : true) {
                return;
            }
        }
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        this.P = com.tencent.mm.plugin.finder.live.util.y.o(this, kotlinx.coroutines.internal.b0.f310484a, null, new df2.qr(this, null), 2, null);
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveStart(r45.hc1 hc1Var) {
        android.content.Intent intent;
        byte[] byteArrayExtra;
        android.content.Intent intent2;
        super.onLiveStart(hc1Var);
        y7();
        com.tencent.mm.ui.MMActivity N6 = N6();
        if (N6 != null && (intent = N6.getIntent()) != null && (byteArrayExtra = intent.getByteArrayExtra("FINDER_JUMP_INFO_WITH_OUTSIDE")) != null) {
            if (!(!(byteArrayExtra.length == 0))) {
                byteArrayExtra = null;
            }
            if (byteArrayExtra != null) {
                com.tencent.mm.ui.MMActivity N62 = N6();
                if (N62 != null && (intent2 = N62.getIntent()) != null) {
                    intent2.removeExtra("FINDER_JUMP_INFO_WITH_OUTSIDE");
                }
                com.tencent.mm.protobuf.f parseFrom = new r45.uc1().parseFrom(byteArrayExtra);
                kotlin.jvm.internal.o.e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderJumpInfoWithOutside");
                r45.uc1 uc1Var = (r45.uc1) parseFrom;
                com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) uc1Var.getCustom(1);
                if (finderJumpInfo == null) {
                    finderJumpInfo = new com.tencent.mm.protocal.protobuf.FinderJumpInfo();
                }
                dk2.h hVar = new dk2.h(finderJumpInfo);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> list = uc1Var.getList(0);
                kotlin.jvm.internal.o.f(list, "getObjects(...)");
                for (com.tencent.mm.protocal.protobuf.FinderObject finderObject : list) {
                    kotlin.jvm.internal.o.d(finderObject);
                    arrayList.add(new km2.m(finderObject));
                }
                hVar.f233542e.addAll(arrayList);
                com.tencent.mm.plugin.finder.live.view.ub ubVar = this.f291099e;
                com.tencent.mm.plugin.finder.live.view.k0 k0Var = ubVar instanceof com.tencent.mm.plugin.finder.live.view.k0 ? (com.tencent.mm.plugin.finder.live.view.k0) ubVar : null;
                this.f230705m = k0Var != null ? com.tencent.mm.plugin.finder.live.util.y.n(k0Var, null, null, new df2.ss(this, hVar, null), 3, null) : null;
            }
        }
        z7();
    }

    /* JADX WARN: Type inference failed for: r4v7, types: [com.tencent.mm.plugin.finder.live.controller.LivePromoteBannerController$initView$5] */
    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        android.content.Context context;
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        ae2.in inVar = ae2.in.f3688a;
        ((lb2.k) ae2.in.f3930y6).getClass();
        com.tencent.mars.xlog.Log.i("Finder.LivePromoteBannerController", "onViewMount value=");
        if (((mm2.c1) business(mm2.c1.class)).M7()) {
            return;
        }
        android.content.Context context2 = pluginLayout.getContext();
        kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        if (((androidx.appcompat.app.AppCompatActivity) context2).getIntent().hasExtra("KEY_MINI_APP_AD_FLOW_INFO")) {
            return;
        }
        this.f230704J = (android.view.ViewGroup) S6(com.tencent.mm.R.id.fj9);
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) T6(com.tencent.mm.R.id.r2p, com.tencent.mm.R.id.r2q);
        this.E = constraintLayout;
        android.widget.TextView textView = constraintLayout != null ? (android.widget.TextView) constraintLayout.findViewById(com.tencent.mm.R.id.c9z) : null;
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = this.E;
        android.widget.TextView textView2 = constraintLayout2 != null ? (android.widget.TextView) constraintLayout2.findViewById(com.tencent.mm.R.id.obc) : null;
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout3 = this.E;
        android.widget.TextView textView3 = constraintLayout3 != null ? (android.widget.TextView) constraintLayout3.findViewById(com.tencent.mm.R.id.nqr) : null;
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout4 = this.E;
        android.widget.ImageView imageView = constraintLayout4 != null ? (android.widget.ImageView) constraintLayout4.findViewById(com.tencent.mm.R.id.bys) : null;
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout5 = this.E;
        android.widget.TextView textView4 = constraintLayout5 != null ? (android.widget.TextView) constraintLayout5.findViewById(com.tencent.mm.R.id.r59) : null;
        android.view.ViewGroup viewGroup = this.f230704J;
        if (viewGroup != null && (context = viewGroup.getContext()) != null) {
            d92.f fVar = d92.f.f227470a;
            d92.f.a(fVar, context, textView2, 20.0f, 0.0f, 8, null);
            d92.f.a(fVar, context, textView3, 15.0f, 0.0f, 8, null);
            android.widget.TextView textView5 = textView4;
            d92.f.a(fVar, context, textView, 17.0f, 0.0f, 8, null);
            d92.f.a(fVar, context, textView5, 14.0f, 0.0f, 8, null);
            if (textView3 != null) {
                java.lang.String string = context.getResources().getString(com.tencent.mm.R.string.m5b);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                java.lang.String string2 = context.getResources().getString(com.tencent.mm.R.string.m5h);
                kotlin.jvm.internal.o.f(string2, "getString(...)");
                textView3.setText(i7(string, string2, -1));
            }
            if (textView5 != null) {
                java.lang.String string3 = context.getResources().getString(com.tencent.mm.R.string.m5f);
                kotlin.jvm.internal.o.f(string3, "getString(...)");
                java.lang.String string4 = context.getResources().getString(com.tencent.mm.R.string.m5h);
                kotlin.jvm.internal.o.f(string4, "getString(...)");
                textView5.setText(i7(string3, string4, android.graphics.Color.parseColor("#667B3413")));
            }
            if (textView != null) {
                com.tencent.mm.ui.fk.a(textView);
            }
            if (textView2 != null) {
                com.tencent.mm.ui.fk.a(textView2);
            }
        }
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout6 = this.E;
        if (constraintLayout6 != null) {
            constraintLayout6.setOnClickListener(df2.cs.f229908d);
        }
        if (textView != null) {
            textView.setOnClickListener(new df2.es(this));
        }
        if (imageView != null) {
            imageView.setOnClickListener(new df2.fs(this));
        }
        android.view.ViewGroup viewGroup2 = this.f230704J;
        if (viewGroup2 != null) {
            viewGroup2.addOnLayoutChangeListener(this.M);
            this.f230706n = (com.tencent.mm.view.RecyclerHorizontalViewPager) viewGroup2.findViewById(com.tencent.mm.R.id.f483352af4);
            this.H = (com.tencent.mm.ui.widget.RoundedCornerFrameLayout) viewGroup2.findViewById(com.tencent.mm.R.id.mw7);
            android.widget.TextView textView6 = (android.widget.TextView) viewGroup2.findViewById(com.tencent.mm.R.id.mw8);
            this.I = textView6;
            if (textView6 != null) {
                textView6.setTextSize(0, i65.a.a(viewGroup2.getContext(), 14.0f));
            }
            this.G = (com.tencent.mm.ui.widget.RoundCornerConstraintLayout) viewGroup2.findViewById(com.tencent.mm.R.id.k3t);
            this.F = (android.widget.FrameLayout) viewGroup2.findViewById(com.tencent.mm.R.id.k3u);
            com.tencent.mm.view.RecyclerHorizontalViewPager recyclerHorizontalViewPager = this.f230706n;
            if (recyclerHorizontalViewPager != null) {
                recyclerHorizontalViewPager.setHasFixedSize(false);
            }
            com.tencent.mm.view.RecyclerHorizontalViewPager recyclerHorizontalViewPager2 = this.f230706n;
            if (recyclerHorizontalViewPager2 != null) {
                recyclerHorizontalViewPager2.setItemViewCacheSize(0);
            }
            com.tencent.mm.view.RecyclerHorizontalViewPager recyclerHorizontalViewPager3 = this.f230706n;
            if (recyclerHorizontalViewPager3 != null) {
                recyclerHorizontalViewPager3.setDisallowInterceptWhenHorizontalScroll(true);
            }
            android.content.Context context3 = viewGroup2.getContext();
            kotlin.jvm.internal.o.f(context3, "getContext(...)");
            com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager = new com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager(context3);
            finderLinearLayoutManager.f132639x = 160.0f;
            finderLinearLayoutManager.f11881u = 0;
            finderLinearLayoutManager.setItemPrefetchEnabled(false);
            finderLinearLayoutManager.Q(0);
            com.tencent.mm.view.RecyclerHorizontalViewPager recyclerHorizontalViewPager4 = this.f230706n;
            if (recyclerHorizontalViewPager4 != null) {
                recyclerHorizontalViewPager4.setLayoutManager(finderLinearLayoutManager);
            }
            com.tencent.mm.view.RecyclerHorizontalViewPager recyclerHorizontalViewPager5 = this.f230706n;
            if (recyclerHorizontalViewPager5 != null) {
                recyclerHorizontalViewPager5.setPageChangeListener(new df2.hs(this));
            }
            com.tencent.mm.view.RecyclerHorizontalViewPager recyclerHorizontalViewPager6 = this.f230706n;
            if (recyclerHorizontalViewPager6 != null) {
                recyclerHorizontalViewPager6.setOnTouchListener(new df2.is(this));
            }
            com.tencent.mm.view.RecyclerHorizontalViewPager recyclerHorizontalViewPager7 = this.f230706n;
            if (recyclerHorizontalViewPager7 != null) {
                recyclerHorizontalViewPager7.setOnInterceptTouchEvent(new df2.js(this));
            }
            com.tencent.mm.view.RecyclerHorizontalViewPager recyclerHorizontalViewPager8 = this.f230706n;
            android.view.ViewGroup.LayoutParams layoutParams = recyclerHorizontalViewPager8 != null ? recyclerHorizontalViewPager8.getLayoutParams() : null;
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            layoutParams.width = i65.a.b(viewGroup2.getContext(), f230697l1);
            layoutParams.height = i65.a.b(viewGroup2.getContext(), f230702y0);
            com.tencent.mm.view.RecyclerHorizontalViewPager recyclerHorizontalViewPager9 = this.f230706n;
            if (recyclerHorizontalViewPager9 != null) {
                recyclerHorizontalViewPager9.setLayoutParams(layoutParams);
            }
            com.tencent.mm.view.RecyclerHorizontalViewPager recyclerHorizontalViewPager10 = this.f230706n;
            if (recyclerHorizontalViewPager10 != null) {
                recyclerHorizontalViewPager10.setCanMakeCancelAsUp(false);
            }
            df2.ks ksVar = new df2.ks(this, new in5.s() { // from class: com.tencent.mm.plugin.finder.live.controller.LivePromoteBannerController$initView$5
                @Override // in5.s
                public in5.r getItemConvert(int type) {
                    return new cl2.j();
                }
            }, this.f230717y);
            ksVar.f293105o = new df2.ms(this, viewGroup2);
            ksVar.f293104n = new df2.ns(this);
            this.f230707o = ksVar;
            android.widget.FrameLayout frameLayout = this.F;
            if (frameLayout != null) {
                frameLayout.setOnClickListener(new df2.os(this, viewGroup2));
            }
            com.tencent.mm.view.RecyclerHorizontalViewPager recyclerHorizontalViewPager11 = this.f230706n;
            if (recyclerHorizontalViewPager11 != null) {
                recyclerHorizontalViewPager11.setAdapter(this.f230707o);
            }
            if2.d0 d0Var = new if2.d0(viewGroup2, this);
            this.K = d0Var;
            this.f291103i = new df2.bs(d0Var);
            d0Var.d(8);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(viewGroup2.findViewById(com.tencent.mm.R.id.f484780fi3), "finder_live_more_banner");
            if (((com.tencent.mm.plugin.finder.live.view.k0) pluginLayout).getLiveRole() == 0) {
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(viewGroup2.findViewById(com.tencent.mm.R.id.f484780fi3), new df2.ts(this));
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(viewGroup2.findViewById(com.tencent.mm.R.id.f484780fi3), 8, 25561);
            }
            android.view.ViewGroup.LayoutParams layoutParams2 = viewGroup2.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).setMarginEnd((int) (U6() ? viewGroup2.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479718db) : viewGroup2.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479688cn)));
            android.view.View findViewById = viewGroup2.findViewById(com.tencent.mm.R.id.f484780fi3);
            if (((mm2.c1) business(mm2.c1.class)).O7()) {
                findViewById.setPadding(findViewById.getPaddingLeft(), findViewById.getPaddingTop(), findViewById.getPaddingRight(), 0);
            }
        }
        if (!((mm2.c1) business(mm2.c1.class)).T5) {
            ((yg0.u3) ((zg0.c3) i95.n0.c(zg0.c3.class))).wi();
        }
        android.content.Context context4 = pluginLayout.getContext();
        kotlin.jvm.internal.o.f(context4, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context4 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context4).a(pl2.x.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        if (((mm2.c1) business(mm2.c1.class)).a8()) {
            y7();
        }
        z7();
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        android.content.Intent intent;
        kn0.p pVar;
        android.content.Context context;
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        this.U.clear();
        com.tencent.mars.xlog.Log.i("Finder.LivePromoteBannerController", "unMount");
        android.view.ViewGroup viewGroup = this.f230704J;
        if (viewGroup != null && (context = viewGroup.getContext()) != null) {
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            pl2.x xVar = (pl2.x) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(pl2.x.class);
            if (!xVar.f356683f) {
                in5.c cVar = this.A;
                dk2.h hVar = cVar instanceof dk2.h ? (dk2.h) cVar : null;
                if (hVar != null && xVar.f356686i.contains(hVar)) {
                    pl2.s sVar = xVar.f356684g;
                    if (sVar != null) {
                        sVar.k();
                    }
                    xVar.O6(false);
                }
            }
        }
        in0.q e17 = dk2.ef.f233372a.e();
        boolean z17 = ((e17 == null || (pVar = e17.D) == null) ? false : pVar.f309589i) && ((mm2.c1) business(mm2.c1.class)).f328870q5 == 3;
        ((mm2.c1) business(mm2.c1.class)).getClass();
        if (!z17 && !((mm2.c1) business(mm2.c1.class)).T5) {
            com.tencent.mars.xlog.Log.i("Finder.LivePromoteBannerController", "landscape click don't clear webview controller");
            zg0.c3 c3Var = (zg0.c3) i95.n0.c(zg0.c3.class);
            if (c3Var != null) {
                ((yg0.u3) c3Var).wi();
            }
        }
        this.f230709q = false;
        this.f230708p = false;
        this.f230714v = 0L;
        this.f230712t = -1;
        this.f230710r = null;
        this.A = null;
        this.f230711s = "";
        this.f230716x.clear();
        this.f230718z.clear();
        this.f230717y.clear();
        this.L = false;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f230707o;
        if (wxRecyclerAdapter != null) {
            wxRecyclerAdapter.notifyDataSetChanged();
        }
        f230703y1 = null;
        this.f230715w = false;
        com.tencent.mm.ui.MMActivity N6 = N6();
        if (N6 != null && (intent = N6.getIntent()) != null) {
            intent.removeExtra("FINDER_JUMP_INFO_WITH_OUTSIDE");
        }
        kotlinx.coroutines.r2 r2Var = this.B;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        kotlinx.coroutines.r2 r2Var2 = this.P;
        if (r2Var2 != null) {
            kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
        }
        kotlinx.coroutines.r2 r2Var3 = this.f230705m;
        if (r2Var3 != null) {
            kotlinx.coroutines.p2.a(r2Var3, null, 1, null);
        }
        ((mm2.c1) business(mm2.c1.class)).f328820i3 = false;
        android.view.ViewGroup viewGroup2 = this.f230704J;
        if (viewGroup2 != null) {
            viewGroup2.removeOnLayoutChangeListener(this.M);
        }
        this.f230704J = null;
        this.f230706n = null;
        this.F = null;
        this.E = null;
        this.G = null;
        this.H = null;
        this.I = null;
        this.K = null;
        this.f230707o = null;
        com.tencent.mm.plugin.finder.view.e3 e3Var = this.S;
        if (e3Var != null) {
            e3Var.h();
        }
        android.animation.ValueAnimator valueAnimator = this.Q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        android.animation.ValueAnimator valueAnimator2 = this.R;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
    }

    public final boolean p7(dk2.h hVar) {
        java.lang.String str;
        boolean z17;
        r45.bm1 bm1Var = hVar != null ? hVar.f233545h : null;
        rl2.f fVar = (rl2.f) ((jz5.n) ((com.tencent.mm.feature.finder.live.v4) i95.n0.c(com.tencent.mm.feature.finder.live.v4.class)).f67001y).getValue();
        if (bm1Var == null || (str = bm1Var.getString(0)) == null) {
            str = "";
        }
        fVar.getClass();
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        if (fVar.f397195f.contains(str)) {
            return true;
        }
        synchronized (fVar) {
            ce2.f fVar2 = new ce2.f();
            fVar2.field_dislikeBannerId = str;
            z17 = fVar.get(fVar2, new java.lang.String[0]);
        }
        return z17;
    }

    public final boolean q7(dk2.h hVar) {
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo;
        com.tencent.mm.protocal.protobuf.NativeInfo native_info;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo2;
        com.tencent.mm.protocal.protobuf.NativeInfo native_info2;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo3;
        if ((hVar == null || (finderJumpInfo3 = hVar.f233541d) == null || finderJumpInfo3.getJumpinfo_type() != 3) ? false : true) {
            if ((hVar == null || (finderJumpInfo2 = hVar.f233541d) == null || (native_info2 = finderJumpInfo2.getNative_info()) == null || native_info2.getNative_type() != 5) ? false : true) {
                return true;
            }
            if ((hVar == null || (finderJumpInfo = hVar.f233541d) == null || (native_info = finderJumpInfo.getNative_info()) == null || native_info.getNative_type() != 9) ? false : true) {
                return true;
            }
        }
        return false;
    }

    public final boolean r7(int i17) {
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo;
        java.util.ArrayList arrayList = this.f230717y;
        if (arrayList.size() <= 0) {
            return false;
        }
        java.lang.Object obj = arrayList.get(i17 % arrayList.size());
        dk2.h hVar = obj instanceof dk2.h ? (dk2.h) obj : null;
        if (!((hVar == null || (finderJumpInfo = hVar.f233541d) == null || finderJumpInfo.getJumpinfo_type() != 3) ? false : true)) {
            return false;
        }
        com.tencent.mm.protocal.protobuf.NativeInfo native_info = hVar.f233541d.getNative_info();
        return native_info != null && native_info.getNative_type() == 28;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0054 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[LOOP:0: B:2:0x0006->B:37:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s7() {
        /*
            r9 = this;
            java.util.ArrayList r0 = r9.f230717y
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L55
            java.lang.Object r1 = r0.next()
            r5 = r1
            in5.c r5 = (in5.c) r5
            boolean r6 = r5 instanceof dk2.h
            if (r6 == 0) goto L1e
            r7 = r5
            dk2.h r7 = (dk2.h) r7
            goto L1f
        L1e:
            r7 = r2
        L1f:
            if (r7 == 0) goto L2e
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r7 = r7.f233541d
            if (r7 == 0) goto L2e
            int r7 = r7.getJumpinfo_type()
            r8 = 3
            if (r7 != r8) goto L2e
            r7 = r3
            goto L2f
        L2e:
            r7 = r4
        L2f:
            if (r7 == 0) goto L51
            if (r6 == 0) goto L36
            r2 = r5
            dk2.h r2 = (dk2.h) r2
        L36:
            if (r2 == 0) goto L4c
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r2 = r2.f233541d
            if (r2 == 0) goto L4c
            com.tencent.mm.protocal.protobuf.NativeInfo r2 = r2.getNative_info()
            if (r2 == 0) goto L4c
            int r2 = r2.getNative_type()
            r5 = 29
            if (r2 != r5) goto L4c
            r2 = r3
            goto L4d
        L4c:
            r2 = r4
        L4d:
            if (r2 == 0) goto L51
            r2 = r3
            goto L52
        L51:
            r2 = r4
        L52:
            if (r2 == 0) goto L6
            r2 = r1
        L55:
            if (r2 == 0) goto L58
            goto L59
        L58:
            r3 = r4
        L59:
            if (r3 == 0) goto L6b
            java.lang.Class<tg0.o1> r0 = tg0.o1.class
            i95.m r0 = i95.n0.c(r0)
            tg0.o1 r0 = (tg0.o1) r0
            sg0.y3 r0 = (sg0.y3) r0
            r0.getClass()
            su4.r2.o()
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.lt.s7():void");
    }

    public final void t7(java.lang.String actionResult) {
        com.tencent.mars.xlog.Log.i("Finder.LivePromoteBannerController", "reportBannerAction  result:%s", actionResult);
        if (zl2.r4.f473950a.w1()) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.N, actionResult, null, 4, null);
        } else {
            ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
            r0Var.getClass();
            kotlin.jvm.internal.o.g(actionResult, "actionResult");
            ml2.r0.hj(r0Var, ml2.b4.M, actionResult, 0L, null, null, null, null, null, 252, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x009b, code lost:
    
        if ((r10 != null && r10.getId() == 0) != false) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u7() {
        /*
            Method dump skipped, instructions count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.lt.u7():void");
    }

    public final void v7() {
        android.content.Context context;
        r45.bm1 bm1Var;
        android.view.ViewGroup viewGroup;
        android.view.ViewGroup viewGroup2;
        android.view.ViewGroup viewGroup3;
        android.view.ViewGroup viewGroup4;
        android.view.ViewGroup viewGroup5 = this.f230704J;
        if (viewGroup5 == null || (context = viewGroup5.getContext()) == null) {
            return;
        }
        com.tencent.mm.plugin.finder.view.e3 e3Var = new com.tencent.mm.plugin.finder.view.e3(context);
        this.S = e3Var;
        e3Var.f(com.tencent.mm.R.layout.br9);
        com.tencent.mm.plugin.finder.view.e3 e3Var2 = this.S;
        if (e3Var2 != null) {
            e3Var2.a();
        }
        com.tencent.mm.plugin.finder.view.e3 e3Var3 = this.S;
        java.lang.String str = null;
        android.widget.TextView textView = (e3Var3 == null || (viewGroup4 = e3Var3.f131975y) == null) ? null : (android.widget.TextView) viewGroup4.findViewById(com.tencent.mm.R.id.c9z);
        com.tencent.mm.plugin.finder.view.e3 e3Var4 = this.S;
        android.widget.TextView textView2 = (e3Var4 == null || (viewGroup3 = e3Var4.f131975y) == null) ? null : (android.widget.TextView) viewGroup3.findViewById(com.tencent.mm.R.id.f487056nc4);
        com.tencent.mm.plugin.finder.view.e3 e3Var5 = this.S;
        android.widget.TextView textView3 = (e3Var5 == null || (viewGroup2 = e3Var5.f131975y) == null) ? null : (android.widget.TextView) viewGroup2.findViewById(com.tencent.mm.R.id.nqr);
        com.tencent.mm.plugin.finder.view.e3 e3Var6 = this.S;
        android.widget.TextView textView4 = (e3Var6 == null || (viewGroup = e3Var6.f131975y) == null) ? null : (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.r59);
        if (textView != null) {
            textView.setOnClickListener(new df2.ys(this));
        }
        d92.f fVar = d92.f.f227470a;
        d92.f.a(fVar, context, textView2, 20.0f, 0.0f, 8, null);
        d92.f.a(fVar, context, textView3, 15.0f, 0.0f, 8, null);
        d92.f.a(fVar, context, textView, 17.0f, 0.0f, 8, null);
        d92.f.a(fVar, context, textView4, 14.0f, 0.0f, 8, null);
        if (textView3 != null) {
            java.lang.String string = context.getResources().getString(com.tencent.mm.R.string.m5b);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            java.lang.String string2 = context.getResources().getString(com.tencent.mm.R.string.m5h);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            textView3.setText(i7(string, string2, -1));
        }
        if (textView4 != null) {
            java.lang.String string3 = context.getResources().getString(com.tencent.mm.R.string.m5a);
            kotlin.jvm.internal.o.f(string3, "getString(...)");
            java.lang.String string4 = context.getResources().getString(com.tencent.mm.R.string.m5h);
            kotlin.jvm.internal.o.f(string4, "getString(...)");
            textView4.setText(i7(string3, string4, android.graphics.Color.parseColor("#997B3413")));
        }
        if (textView2 != null) {
            com.tencent.mm.ui.fk.a(textView2);
        }
        if (textView != null) {
            com.tencent.mm.ui.fk.a(textView);
        }
        com.tencent.mm.plugin.finder.view.e3 e3Var7 = this.S;
        if (e3Var7 != null) {
            e3Var7.i();
        }
        com.tencent.mm.plugin.finder.view.e3 e3Var8 = this.S;
        if (e3Var8 != null) {
            e3Var8.f131968r = new df2.zs(this);
        }
        in5.c cVar = this.f230710r;
        dk2.h hVar = cVar instanceof dk2.h ? (dk2.h) cVar : null;
        if (hVar != null && (bm1Var = hVar.f233545h) != null) {
            str = bm1Var.getString(0);
        }
        t7(k7(str, 6));
    }

    public final void w7(java.lang.String query) {
        kotlin.jvm.internal.o.g(query, "query");
        su4.j2 j2Var = new su4.j2();
        android.view.ViewGroup viewGroup = this.f230704J;
        j2Var.f412938a = viewGroup != null ? viewGroup.getContext() : null;
        j2Var.f412939b = 130;
        j2Var.f412941d = query;
        j2Var.f412940c = 0;
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        j2Var.f412942e = su4.r2.f(130);
        j2Var.f412943f = true;
        j2Var.f412945h = true;
        j2Var.f412946i = false;
        j2Var.B = true;
        j2Var.A = false;
        j2Var.f412951n = 2;
        j2Var.f412958u = false;
        j2Var.f412952o = i65.a.d(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.color.aaw);
        j2Var.f412953p = false;
        ((com.tencent.mm.plugin.websearch.h2) ((su4.a1) i95.n0.c(su4.a1.class))).Vi(j2Var);
        x7();
    }

    public final void x7() {
        kotlinx.coroutines.r2 r2Var = this.B;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        if (this.f230717y.size() > 1) {
            com.tencent.mm.plugin.finder.live.view.ub ubVar = this.f291099e;
            com.tencent.mm.plugin.finder.live.view.k0 k0Var = ubVar instanceof com.tencent.mm.plugin.finder.live.view.k0 ? (com.tencent.mm.plugin.finder.live.view.k0) ubVar : null;
            this.B = k0Var != null ? com.tencent.mm.plugin.finder.live.util.y.n(k0Var, kotlinx.coroutines.q1.f310570c, null, new df2.ft(this, null), 2, null) : null;
        } else {
            com.tencent.mm.view.RecyclerHorizontalViewPager recyclerHorizontalViewPager = this.f230706n;
            if (recyclerHorizontalViewPager != null) {
                recyclerHorizontalViewPager.setFrozeTouch(true);
            }
            this.B = null;
        }
    }

    public final void y7() {
        if (this.f230708p) {
            com.tencent.mars.xlog.Log.i("Finder.LivePromoteBannerController", "startPollingBannerData is done");
            return;
        }
        if (!this.f230716x.isEmpty()) {
            com.tencent.mars.xlog.Log.i("Finder.LivePromoteBannerController", "bannerJumpInfosList is not empty, return");
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.LivePromoteBannerController", "startPollingBannerData");
        this.f230708p = true;
        r45.hy2 hy2Var = new r45.hy2();
        dk2.ef efVar = dk2.ef.f233372a;
        dk2.ef.f233392k.e(3, hy2Var, new df2.jt(this, r45.iy2.class), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x07e3 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:479:0x027b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z7() {
        /*
            Method dump skipped, instructions count: 2020
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.lt.z7():void");
    }
}
