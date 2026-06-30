package za3;

/* loaded from: classes8.dex */
public final class s extends androidx.appcompat.app.i0 {

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f471007f;

    /* renamed from: g, reason: collision with root package name */
    public final z80.p0 f471008g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f471009h;

    /* renamed from: i, reason: collision with root package name */
    public xj.m f471010i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.List f471011m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.List f471012n;

    /* renamed from: o, reason: collision with root package name */
    public za3.n f471013o;

    /* renamed from: p, reason: collision with root package name */
    public int f471014p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f471015q;

    /* renamed from: r, reason: collision with root package name */
    public final za3.d f471016r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f471017s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f471018t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f471019u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(android.content.Context context, z80.p0 jumpData, java.util.Map reportParam) {
        super(context, com.tencent.mm.R.style.f494143fd);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(jumpData, "jumpData");
        kotlin.jvm.internal.o.g(reportParam, "reportParam");
        this.f471007f = context;
        this.f471008g = jumpData;
        this.f471009h = reportParam;
        this.f471016r = new za3.d(context);
        this.f471017s = "";
    }

    public static final void D(za3.s sVar, java.lang.String str, boolean z17) {
        sVar.getClass();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("is_installation", java.lang.Integer.valueOf(z17 ? 1 : 0));
        linkedHashMap.put("navigation_software_id", java.lang.Integer.valueOf(sVar.F(str)));
        linkedHashMap.toString();
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        iy1.c cVar = iy1.c.MainUI;
        ((cy1.a) rVar).Gj(50243, "click_the_navigation_software", kz5.c1.m(kz5.b1.e(new jz5.l("click_navigation_sid", sVar.f471017s)), linkedHashMap), 34048);
    }

    public final void E() {
        this.f471010i = ((wj.j0) ((xj.i) i95.n0.c(xj.i.class))).Ui(wj.t0.G);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0034 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int F(java.lang.String r2) {
        /*
            r1 = this;
            int r0 = r2.hashCode()
            switch(r0) {
                case -103524794: goto L29;
                case 40719148: goto L1e;
                case 744792033: goto L13;
                case 1254578009: goto L8;
                default: goto L7;
            }
        L7:
            goto L34
        L8:
            java.lang.String r0 = "com.autonavi.minimap"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L11
            goto L34
        L11:
            r2 = 3
            goto L35
        L13:
            java.lang.String r0 = "com.baidu.BaiduMap"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L1c
            goto L34
        L1c:
            r2 = 4
            goto L35
        L1e:
            java.lang.String r0 = "com.google.android.apps.maps"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L27
            goto L34
        L27:
            r2 = 2
            goto L35
        L29:
            java.lang.String r0 = "com.tencent.map"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L32
            goto L34
        L32:
            r2 = 1
            goto L35
        L34:
            r2 = 0
        L35:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: za3.s.F(java.lang.String):int");
    }

    public final void G(boolean z17, boolean z18) {
        long currentTimeMillis;
        long q17 = com.tencent.mm.sdk.platformtools.o4.M("PoiNavigationAppSheetView").q("mmkvkey_navigate_map_ad_frequance_config", 0L);
        com.tencent.mars.xlog.Log.i("PoiNavigationAppSheetView", "updateAdFreqConfig, expireTime:" + q17 + ", validDaysConfig:" + ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Di(e42.c0.clicfg_android_navigate_ad_frequance_config_valid_days, 30.0f) + ", exposedDaysConfig:" + ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Di(e42.c0.clicfg_android_navigate_ad_frequance_config_exposed_days, 30.0f));
        if (z17 && ((int) q17) == 0) {
            currentTimeMillis = (java.lang.System.currentTimeMillis() / 1000) + (r3 * 24 * 3600);
        } else {
            if (!z18) {
                return;
            }
            currentTimeMillis = (java.lang.System.currentTimeMillis() / 1000) + (r5 * 24 * 3600);
            if (currentTimeMillis <= q17) {
                return;
            }
        }
        com.tencent.mm.sdk.platformtools.o4.M("PoiNavigationAppSheetView").B("mmkvkey_navigate_map_ad_frequance_config", currentTimeMillis);
    }

    @Override // androidx.appcompat.app.i0, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        boolean z17;
        xj.m mVar;
        java.util.List list;
        super.onCreate(bundle);
        setContentView(com.tencent.mm.R.layout.elr);
        boolean z18 = true;
        setCanceledOnTouchOutside(true);
        this.f471017s = gm0.j1.b().j() + '_' + java.lang.System.currentTimeMillis();
        pt0.e0 e0Var = pt0.f0.f358209b1;
        z80.p0 p0Var = this.f471008g;
        e0Var.n(p0Var.f470658d, p0Var.f470657c);
        com.tencent.mm.plugin.location.model.LocationInfo locationInfo = p0Var.f470655a;
        va3.w.b(locationInfo);
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_android_poi_navigate_txmap_ad, 0);
        boolean z19 = Ni == 0;
        int Ni2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_poi_navigation_list_style, 0);
        com.tencent.mars.xlog.Log.i("PoiNavigationAppSheetView", "map list style config: " + Ni2);
        java.util.List e17 = this.f471016r.e(locationInfo, z19, !(Ni2 == 1 || Ni2 == 2));
        this.f471011m = e17;
        java.util.Iterator it = ((java.util.ArrayList) e17).iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            } else if (kotlin.jvm.internal.o.b(((com.tencent.mm.plugin.location.ui.impl.f0) it.next()).f144813e, "com.tencent.map")) {
                break;
            } else {
                i17++;
            }
        }
        this.f471019u = i17 > -1;
        android.content.Context context = this.f471007f;
        if (Ni == 0 && !com.tencent.mm.sdk.platformtools.a0.c() && !this.f471019u && (list = this.f471011m) != null) {
            java.lang.String r17 = i65.a.r(context, com.tencent.mm.R.string.juc);
            kotlin.jvm.internal.o.f(r17, "getString(...)");
            ((java.util.ArrayList) list).add(0, new com.tencent.mm.plugin.location.ui.impl.f0(false, false, r17, null, "com.tencent.map", i65.a.i(context, com.tencent.mm.R.drawable.c8m), null));
        }
        com.tencent.mars.xlog.Log.i("PoiNavigationAppSheetView", "ad config: " + Ni);
        if (Ni > 1) {
            if (Ni == 4) {
                E();
            } else if (Ni == 2 && !this.f471019u) {
                E();
            } else if (Ni == 3 && this.f471019u) {
                E();
            }
        }
        g32.b0 b0Var = (g32.b0) i95.n0.c(g32.b0.class);
        long j17 = p0Var.f470657c;
        java.lang.String str = p0Var.f470658d;
        final g32.d dVar = (g32.d) b0Var;
        dVar.getClass();
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mm.plugin.exdevice.model.z0 z0Var = new com.tencent.mm.plugin.exdevice.model.z0(j17, str);
        z0Var.h();
        java.util.List e18 = z0Var.e(j17, "", "", "", str);
        z0Var.f99122h = j17;
        z0Var.f99123i = str;
        z0Var.f99124m = "";
        z0Var.f99125n = "";
        z0Var.f99126o = "";
        java.util.List list2 = z0Var.f99136y;
        java.util.ArrayList arrayList2 = (java.util.ArrayList) e18;
        if (!arrayList2.isEmpty()) {
            arrayList2.forEach(new java.util.function.Consumer() { // from class: g32.d$$a
                @Override // java.util.function.Consumer
                public final void accept(java.lang.Object obj) {
                    java.util.Map map = (java.util.Map) obj;
                    com.tencent.mm.plugin.exdevice.api.IExdeviceSendPoiMessageExportApi$ExDeviceInfo iExdeviceSendPoiMessageExportApi$ExDeviceInfo = new com.tencent.mm.plugin.exdevice.api.IExdeviceSendPoiMessageExportApi$ExDeviceInfo();
                    iExdeviceSendPoiMessageExportApi$ExDeviceInfo.f98798e = (java.lang.String) map.get("deviceID");
                    iExdeviceSendPoiMessageExportApi$ExDeviceInfo.f98797d = (java.lang.String) map.get("displayName");
                    iExdeviceSendPoiMessageExportApi$ExDeviceInfo.f98799f = (java.lang.String) map.get("iconUrl");
                    java.lang.String str2 = (java.lang.String) map.get("ability");
                    if (str2 == null || !str2.contains("wxmsg_poi")) {
                        return;
                    }
                    arrayList.add(iExdeviceSendPoiMessageExportApi$ExDeviceInfo);
                }
            });
        }
        if (list2 != null) {
            java.util.ArrayList arrayList3 = (java.util.ArrayList) list2;
            if (!arrayList3.isEmpty()) {
                arrayList3.forEach(new java.util.function.Consumer() { // from class: g32.d$$b
                    @Override // java.util.function.Consumer
                    public final void accept(java.lang.Object obj) {
                        boolean z27;
                        r45.pf4 pf4Var = (r45.pf4) obj;
                        g32.d.this.getClass();
                        com.tencent.mm.plugin.exdevice.api.IExdeviceSendPoiMessageExportApi$ExDeviceInfo iExdeviceSendPoiMessageExportApi$ExDeviceInfo = new com.tencent.mm.plugin.exdevice.api.IExdeviceSendPoiMessageExportApi$ExDeviceInfo();
                        iExdeviceSendPoiMessageExportApi$ExDeviceInfo.f98798e = pf4Var.f383004e;
                        iExdeviceSendPoiMessageExportApi$ExDeviceInfo.f98797d = pf4Var.f383005f;
                        iExdeviceSendPoiMessageExportApi$ExDeviceInfo.f98799f = pf4Var.f383006g;
                        java.util.LinkedList linkedList = pf4Var.f383007h;
                        if (linkedList != null && !linkedList.isEmpty()) {
                            java.util.Iterator it6 = linkedList.iterator();
                            while (it6.hasNext()) {
                                if (((java.lang.Integer) it6.next()).intValue() == 2) {
                                    z27 = true;
                                    break;
                                }
                            }
                        }
                        z27 = false;
                        if (z27) {
                            arrayList.add(iExdeviceSendPoiMessageExportApi$ExDeviceInfo);
                        }
                    }
                });
            }
        }
        this.f471012n = arrayList;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (this.f471010i != null) {
            int F = F("com.tencent.map");
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(F);
            sb7.append(':');
            sb7.append(this.f471019u ? 1 : 0);
            arrayList4.add(sb7.toString());
            sb6.append("com.tencent.map|");
        }
        java.util.List list3 = this.f471011m;
        if (list3 != null) {
            java.util.Iterator it6 = ((java.util.ArrayList) list3).iterator();
            while (it6.hasNext()) {
                com.tencent.mm.plugin.location.ui.impl.f0 f0Var = (com.tencent.mm.plugin.location.ui.impl.f0) it6.next();
                java.lang.String str2 = f0Var.f144813e;
                if (str2 == null) {
                    str2 = "";
                }
                arrayList4.add(F(str2) + ":1");
                java.lang.String str3 = f0Var.f144813e;
                if (str3 == null) {
                    str3 = "";
                }
                sb6.append(str3);
                sb6.append("|");
            }
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("navigate_the_software_status", kz5.n0.g0(arrayList4, "#", null, null, 0, null, null, 62, null));
        linkedHashMap.toString();
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        iy1.c cVar = iy1.c.MainUI;
        ((cy1.a) rVar).Gj(50243, "view_exp", kz5.c1.m(kz5.b1.e(new jz5.l("click_navigation_sid", this.f471017s)), linkedHashMap), 34048);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12809, 3, sb6.toString(), "");
        android.view.Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
            window.setLayout(-1, -2);
            window.getDecorView().setPadding(0, 0, 0, 0);
            window.setWindowAnimations(com.tencent.mm.R.style.f494074dp);
            window.addFlags(Integer.MIN_VALUE);
            window.setNavigationBarColor(0);
        }
        int i18 = (int) (context.getResources().getDisplayMetrics().heightPixels * 0.7d);
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) findViewById(com.tencent.mm.R.id.ssk);
        android.view.ViewGroup.LayoutParams layoutParams = constraintLayout != null ? constraintLayout.getLayoutParams() : null;
        if (layoutParams != null) {
            layoutParams.height = i18;
        }
        if (constraintLayout != null) {
            constraintLayout.setLayoutParams(layoutParams);
        }
        if (constraintLayout != null) {
            constraintLayout.setOnClickListener(new za3.o(this));
        }
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.f485653uc5);
        if (linearLayout != null) {
            linearLayout.setOnClickListener(za3.p.f471001d);
        }
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.u7e);
        if (imageView != null) {
            imageView.setColorFilter(context.getColor(com.tencent.mm.R.color.abw));
        }
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.shu);
        if (findViewById != null) {
            findViewById.setOnClickListener(new za3.q(this));
        }
        if (this.f471010i == null) {
            com.tencent.mars.xlog.Log.i("PoiNavigationAppSheetView", "adinfo is null");
            z17 = false;
        } else {
            long q17 = com.tencent.mm.sdk.platformtools.o4.M("PoiNavigationAppSheetView").q("mmkvkey_navigate_map_ad_frequance_config", 0L);
            long currentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
            com.tencent.mars.xlog.Log.i("PoiNavigationAppSheetView", "shouldShowAd, expireTime:" + q17 + ", curTime:" + currentTimeMillis);
            z17 = !(1 <= q17 && q17 < currentTimeMillis);
        }
        if (z17 && (mVar = this.f471010i) != null) {
            java.util.List list4 = this.f471011m;
            if (list4 != null) {
                ((java.util.ArrayList) list4).add(0, new com.tencent.mm.plugin.location.ui.impl.f0(false, true, mVar.f454754b, mVar.f454755c, null, null, mVar.f454756d));
            }
            G(true, false);
            dy1.r rVar2 = (dy1.r) i95.n0.c(dy1.r.class);
            java.util.Map t17 = kz5.c1.t(this.f471009h);
            t17.put("view_id", "tencent_maps_promote_btn");
            ((cy1.a) rVar2).Ej("view_exp", t17, 27051);
            i95.m c17 = i95.n0.c(xj.i.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            xj.i.gg((xj.i) c17, mVar.f454753a, wj.w0.f446541d, null, 4, null);
            java.util.List list5 = this.f471011m;
            if (!(list5 == null || ((java.util.ArrayList) list5).isEmpty())) {
                java.util.List list6 = this.f471011m;
                kotlin.jvm.internal.o.d(list6);
                java.util.Iterator it7 = ((java.util.ArrayList) list6).iterator();
                int i19 = 0;
                while (true) {
                    if (!it7.hasNext()) {
                        i19 = -1;
                        break;
                    } else if (kotlin.jvm.internal.o.b(((com.tencent.mm.plugin.location.ui.impl.f0) it7.next()).f144813e, "com.tencent.map")) {
                        break;
                    } else {
                        i19++;
                    }
                }
                this.f471014p = i19;
                if (i19 > -1) {
                    java.util.List list7 = this.f471011m;
                    kotlin.jvm.internal.o.d(list7);
                    if (i19 < ((java.util.ArrayList) list7).size()) {
                        java.util.List list8 = this.f471011m;
                        kotlin.jvm.internal.o.d(list8);
                    }
                }
            }
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById(com.tencent.mm.R.id.ueh);
        java.util.List list9 = this.f471011m;
        if (list9 == null) {
            list9 = new java.util.ArrayList();
        }
        za3.n nVar = new za3.n(context, list9);
        this.f471013o = nVar;
        nVar.f470996f = new za3.r(this);
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new com.tencent.mm.plugin.location.ui.PoiNavigationAppSheetView$initView$7(context));
        }
        if (recyclerView != null) {
            recyclerView.setAdapter(this.f471013o);
        }
        za3.n nVar2 = this.f471013o;
        if (nVar2 != null) {
            java.util.List<com.tencent.mm.plugin.exdevice.api.IExdeviceSendPoiMessageExportApi$ExDeviceInfo> list10 = this.f471012n;
            if (list10 == null) {
                list10 = new java.util.ArrayList();
            }
            for (com.tencent.mm.plugin.exdevice.api.IExdeviceSendPoiMessageExportApi$ExDeviceInfo iExdeviceSendPoiMessageExportApi$ExDeviceInfo : list10) {
                java.lang.String name = iExdeviceSendPoiMessageExportApi$ExDeviceInfo.f98797d;
                kotlin.jvm.internal.o.f(name, "name");
                com.tencent.mm.plugin.location.ui.impl.f0 f0Var2 = new com.tencent.mm.plugin.location.ui.impl.f0(true, false, name, null, null, null, iExdeviceSendPoiMessageExportApi$ExDeviceInfo.f98799f);
                f0Var2.f144816h = iExdeviceSendPoiMessageExportApi$ExDeviceInfo;
                nVar2.f470995e.add(f0Var2);
            }
            nVar2.notifyDataSetChanged();
        }
        this.f471015q = (android.widget.TextView) findViewById(com.tencent.mm.R.id.qxd);
        if (this.f471010i == null) {
            java.util.List list11 = this.f471011m;
            if (list11 == null || ((java.util.ArrayList) list11).isEmpty()) {
                java.util.List list12 = this.f471012n;
                if (list12 != null && !((java.util.ArrayList) list12).isEmpty()) {
                    z18 = false;
                }
                if (z18) {
                    android.widget.TextView textView = this.f471015q;
                    if (textView == null) {
                        return;
                    }
                    textView.setVisibility(0);
                    return;
                }
            }
        }
        android.widget.TextView textView2 = this.f471015q;
        if (textView2 == null) {
            return;
        }
        textView2.setVisibility(8);
    }

    @Override // androidx.appcompat.app.i0, android.app.Dialog
    public void onStop() {
        xj.m mVar;
        super.onStop();
        if (this.f471018t || (mVar = this.f471010i) == null) {
            return;
        }
        i95.m c17 = i95.n0.c(xj.i.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        xj.i.gg((xj.i) c17, mVar.f454753a, wj.w0.f446542e, null, 4, null);
        this.f471018t = true;
    }
}
