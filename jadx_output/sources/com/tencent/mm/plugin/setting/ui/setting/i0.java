package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class i0 extends com.tencent.mm.plugin.setting.ui.setting.m implements com.tencent.mm.modelbase.u0 {
    public static final com.tencent.mm.plugin.setting.ui.setting.o B = new com.tencent.mm.plugin.setting.ui.setting.o(null);
    public static final jz5.g C;
    public static final java.util.List D;
    public static final java.util.Map E;
    public static final java.util.Map F;
    public static final java.util.List G;
    public com.tencent.mm.modelbase.m1 A;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f161123f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f161124g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f161125h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f161126i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f161127m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f161128n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.ViewGroup f161129o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.ViewGroup f161130p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f161131q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f161132r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f161133s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.setting.ui.setting.h f161134t;

    /* renamed from: u, reason: collision with root package name */
    public final yz5.a f161135u;

    /* renamed from: v, reason: collision with root package name */
    public int f161136v;

    /* renamed from: w, reason: collision with root package name */
    public yz5.a f161137w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.setting.ui.setting.k f161138x;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.Map f161139y;

    /* renamed from: z, reason: collision with root package name */
    public int f161140z;

    static {
        int g17 = bm5.o1.f22719a.g(bm5.h0.RepairerConfig_Global_ColorfulQRHardcodeStyle16_Int, 0);
        if (g17 != 0) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_QRCODE_NOW_SORT_INDEX_INT, 0);
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_QRCODE_HAS_SET_INT, 0);
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_QRCODE_OLD_STYLE_INT, java.lang.Integer.valueOf(g17));
            gm0.j1.u().c().w(66561, java.lang.Integer.valueOf(g17));
            com.tencent.mars.xlog.Log.i("MicroMsg.Setting.ColorSelfQRCodeGradientFgWhiteBgUIC", "repairerCode set");
        }
        C = jz5.h.b(com.tencent.mm.plugin.setting.ui.setting.n.f161341d);
        D = kz5.c0.i(java.lang.Integer.valueOf(md1.f1.CTRL_INDEX), 995, 996, 997, 800, java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.jsapi.share.r0.CTRL_INDEX), 802, 803, 804, 805);
        E = new java.util.LinkedHashMap();
        F = new java.util.LinkedHashMap();
        com.tencent.mm.plugin.setting.ui.setting.p[] pVarArr = new com.tencent.mm.plugin.setting.ui.setting.p[10];
        pVarArr[0] = new com.tencent.mm.plugin.setting.ui.setting.p(0, 997, 0, 0, 0, null, null, 0, 0, 504, null);
        pVarArr[1] = new com.tencent.mm.plugin.setting.ui.setting.p(1, 997, 0, 0, 0, null, null, 0, 0, 504, null);
        com.tencent.mm.plugin.setting.ui.setting.p pVar = new com.tencent.mm.plugin.setting.ui.setting.p(2, 995, 0, 0, 0, null, null, 0, 0, 504, null);
        int i17 = com.tencent.mm.sdk.platformtools.o4.M("qrcode").getInt("color1", 0);
        int i18 = com.tencent.mm.sdk.platformtools.o4.M("qrcode").getInt("color2", 0);
        if (i17 != 0 && i18 != 0) {
            pVar.f161411f = kz5.c0.k(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            pVar.f161410e = 2;
        }
        pVarArr[2] = pVar;
        com.tencent.mm.plugin.setting.ui.setting.p pVar2 = new com.tencent.mm.plugin.setting.ui.setting.p(3, 996, 1, 0, 0, null, null, 0, 0, 504, null);
        int i19 = com.tencent.mm.sdk.platformtools.o4.M("qrcode").getInt("color1", 0);
        int i27 = com.tencent.mm.sdk.platformtools.o4.M("qrcode").getInt("color2", 0);
        if (i19 != 0 && i27 != 0) {
            pVar2.f161411f = kz5.c0.k(java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
            pVar2.f161410e = 2;
        }
        pVarArr[3] = pVar2;
        pVarArr[4] = new com.tencent.mm.plugin.setting.ui.setting.p(4, 800, 0, 0, 0, null, null, android.graphics.Color.parseColor("#FF00A361"), android.graphics.Color.parseColor("#FF00A361"), 120, null);
        pVarArr[5] = new com.tencent.mm.plugin.setting.ui.setting.p(5, 803, 0, 0, 0, null, null, android.graphics.Color.parseColor("#FFCE5247"), android.graphics.Color.parseColor("#FF8D5EC7"), 120, null);
        pVarArr[6] = new com.tencent.mm.plugin.setting.ui.setting.p(6, 802, 0, 0, 0, null, null, android.graphics.Color.parseColor("#FFDB7E00"), android.graphics.Color.parseColor("#FFCE5247"), 120, null);
        pVarArr[7] = new com.tencent.mm.plugin.setting.ui.setting.p(7, 804, 0, 0, 0, null, null, android.graphics.Color.parseColor("#FF8D5EC7"), android.graphics.Color.parseColor("#FF4372D4"), 120, null);
        pVarArr[8] = new com.tencent.mm.plugin.setting.ui.setting.p(8, 805, 0, 0, 0, null, null, android.graphics.Color.parseColor("#FF4372D4"), android.graphics.Color.parseColor("#FF2394C5"), 120, null);
        pVarArr[9] = new com.tencent.mm.plugin.setting.ui.setting.p(9, com.tencent.mm.plugin.appbrand.jsapi.share.r0.CTRL_INDEX, 0, 0, 0, null, null, android.graphics.Color.parseColor("#FF00A361"), android.graphics.Color.parseColor("#FF7AAE34"), 120, null);
        G = kz5.c0.i(pVarArr);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        v24.g gVar = v24.g.f432918a;
        jz5.g gVar2 = v24.g.f432919b;
        com.tencent.mars.xlog.Log.i("MicroMsg.ColorfulQRConfig", "checkLocalGenFlag clientVersion last: %x, current: %x", java.lang.Integer.valueOf(((java.lang.Number) ((jz5.n) gVar2).getValue()).intValue()), java.lang.Integer.valueOf(o45.wf.f343029g));
        if (((java.lang.Number) ((jz5.n) gVar2).getValue()).intValue() != o45.wf.f343029g) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ColorfulQRConfig", "clientVersion changed and remove MMKV_Key_LocalGenFinishSuccess");
            com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("LocalGenFinishSuccess");
            M.remove("LocalGenFinishSuccess".concat(gVar.a()));
            M.putInt("LocalGenClientVersion", o45.wf.f343029g);
        }
        this.f161131q = "";
        this.f161133s = true;
        this.f161135u = com.tencent.mm.plugin.setting.ui.setting.c0.f160894d;
        this.f161139y = kz5.c1.k(new jz5.l(1, 0), new jz5.l(2, 1), new jz5.l(3, 1), new jz5.l(4, 10), new jz5.l(5, 11), new jz5.l(6, 12), new jz5.l(7, 13), new jz5.l(8, 14), new jz5.l(9, 15), new jz5.l(0, 9));
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0079, code lost:
    
        r10 = "s=".concat(r12);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String P6(com.tencent.mm.plugin.setting.ui.setting.i0 r10, java.lang.String r11, int r12) {
        /*
            r10.getClass()
            java.lang.String r10 = "s="
            java.lang.String r0 = "&s="
            jz5.g r1 = com.tencent.mm.plugin.setting.ui.setting.i0.C
            jz5.n r1 = (jz5.n) r1
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L19
            goto Lbd
        L19:
            jz5.g r1 = com.tencent.mm.plugin.setting.ui.setting.m.f161305e
            jz5.n r1 = (jz5.n) r1
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L2b
            goto Lbd
        L2b:
            java.lang.String r1 = ""
            switch(r12) {
                case 800: goto L38;
                case 801: goto L35;
                case 802: goto L35;
                case 803: goto L35;
                case 804: goto L35;
                case 805: goto L35;
                default: goto L30;
            }
        L30:
            switch(r12) {
                case 995: goto L41;
                case 996: goto L3e;
                case 997: goto L3b;
                default: goto L33;
            }
        L33:
            r12 = r1
            goto L43
        L35:
            java.lang.String r12 = "4"
            goto L43
        L38:
            java.lang.String r12 = "3"
            goto L43
        L3b:
            java.lang.String r12 = "2"
            goto L43
        L3e:
            java.lang.String r12 = "1"
            goto L43
        L41:
            java.lang.String r12 = "0"
        L43:
            r2 = 1
            r3 = 0
            if (r11 == 0) goto L50
            int r4 = r11.length()
            if (r4 != 0) goto L4e
            goto L50
        L4e:
            r4 = r3
            goto L51
        L50:
            r4 = r2
        L51:
            if (r4 == 0) goto L58
            if (r11 != 0) goto Lbd
            r11 = r1
            goto Lbd
        L58:
            int r1 = r12.length()
            if (r1 != 0) goto L60
            r1 = r2
            goto L61
        L60:
            r1 = r3
        L61:
            if (r1 == 0) goto L64
            goto Lbd
        L64:
            java.net.URI r1 = new java.net.URI     // Catch: java.lang.Exception -> Lb3
            r1.<init>(r11)     // Catch: java.lang.Exception -> Lb3
            java.lang.String r4 = r1.getQuery()     // Catch: java.lang.Exception -> Lb3
            if (r4 == 0) goto L77
            int r5 = r4.length()     // Catch: java.lang.Exception -> Lb3
            if (r5 != 0) goto L76
            goto L77
        L76:
            r2 = r3
        L77:
            if (r2 == 0) goto L7f
            java.lang.String r10 = r10.concat(r12)     // Catch: java.lang.Exception -> Lb3
        L7d:
            r8 = r10
            goto L92
        L7f:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lb3
            r10.<init>()     // Catch: java.lang.Exception -> Lb3
            r10.append(r4)     // Catch: java.lang.Exception -> Lb3
            r10.append(r0)     // Catch: java.lang.Exception -> Lb3
            r10.append(r12)     // Catch: java.lang.Exception -> Lb3
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Exception -> Lb3
            goto L7d
        L92:
            java.net.URI r10 = new java.net.URI     // Catch: java.lang.Exception -> Lb3
            java.lang.String r5 = r1.getScheme()     // Catch: java.lang.Exception -> Lb3
            java.lang.String r6 = r1.getAuthority()     // Catch: java.lang.Exception -> Lb3
            java.lang.String r7 = r1.getPath()     // Catch: java.lang.Exception -> Lb3
            java.lang.String r9 = r1.getFragment()     // Catch: java.lang.Exception -> Lb3
            r4 = r10
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> Lb3
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Exception -> Lb3
            java.lang.String r12 = "toString(...)"
            kotlin.jvm.internal.o.f(r10, r12)     // Catch: java.lang.Exception -> Lb3
            r11 = r10
            goto Lbd
        Lb3:
            r10 = move-exception
            java.lang.Object[] r12 = new java.lang.Object[r3]
            java.lang.String r0 = "MicroMsg.Setting.ColorSelfQRCodeGradientFgWhiteBgUIC"
            java.lang.String r1 = "addParameterToUrl exception"
            com.tencent.mars.xlog.Log.printErrStackTrace(r0, r10, r1, r12)
        Lbd:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.setting.ui.setting.i0.P6(com.tencent.mm.plugin.setting.ui.setting.i0, java.lang.String, int):java.lang.String");
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.m
    public void O6(boolean z17) {
        int U6 = U6("doChangeStyle errorExit: " + z17) + 1;
        if (U6 == 3) {
            U6++;
            com.tencent.mars.xlog.Log.i("MicroMsg.Setting.ColorSelfQRCodeGradientFgWhiteBgUIC", "doChangeStyle: newIdx: " + U6);
        }
        java.util.List list = G;
        boolean z18 = false;
        if (!(U6 >= 0 && U6 < list.size())) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Setting.ColorSelfQRCodeGradientFgWhiteBgUIC", "doChangeStyle: newIdx: 1");
            U6 = 1;
        }
        if (U6 >= 0 && U6 < list.size()) {
            z18 = true;
        }
        int i17 = !z18 ? 1 : U6;
        com.tencent.mars.xlog.Log.i("MicroMsg.Setting.ColorSelfQRCodeGradientFgWhiteBgUIC", "saveLastIndex: index: " + U6 + ", willSaveIndex: " + i17);
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_QRCODE_NOW_SORT_INDEX_INT, java.lang.Integer.valueOf(i17));
        Z6(z17, 1);
    }

    public final android.graphics.Bitmap Q6() {
        yz5.a aVar = this.f161137w;
        if (aVar != null) {
            kotlin.jvm.internal.o.d(aVar);
            return (android.graphics.Bitmap) aVar.invoke();
        }
        android.view.ViewGroup viewGroup = this.f161129o;
        kotlin.jvm.internal.o.d(viewGroup);
        android.graphics.Bitmap b07 = com.tencent.mm.sdk.platformtools.x.b0(null);
        viewGroup.setBackground(new android.graphics.drawable.BitmapDrawable(getResources(), b07));
        android.graphics.Bitmap b08 = com.tencent.mm.sdk.platformtools.x.b0(viewGroup);
        viewGroup.setBackgroundColor(0);
        b07.recycle();
        kotlin.jvm.internal.o.d(b08);
        return b08;
    }

    public void R6() {
        ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).Ni(getContext(), new com.tencent.mm.plugin.setting.ui.setting.x(this), new com.tencent.mm.plugin.setting.ui.setting.y(this));
    }

    public final void S6(com.tencent.mm.modelbase.m1 scene) {
        kotlin.jvm.internal.o.g(scene, "scene");
        this.f161140z++;
        com.tencent.mars.xlog.Log.i("MicroMsg.Setting.ColorSelfQRCodeGradientFgWhiteBgUIC", "[" + hashCode() + "] doScene %d ", java.lang.Integer.valueOf(this.f161140z));
        gm0.j1.d().g(scene);
        this.A = scene;
    }

    public void T6(boolean z17) {
        java.util.Set e17 = kz5.p1.e(997);
        java.lang.Object l17 = gm0.j1.u().c().l(66561, null);
        java.lang.Integer num = l17 instanceof java.lang.Integer ? (java.lang.Integer) l17 : null;
        int intValue = num != null ? num.intValue() : 0;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fetchQRCode useLocalGenQR: ");
        jz5.g gVar = com.tencent.mm.plugin.setting.ui.setting.m.f161305e;
        sb6.append(((java.lang.Boolean) ((jz5.n) gVar).getValue()).booleanValue());
        sb6.append(", curStyle: ");
        sb6.append(intValue);
        com.tencent.mars.xlog.Log.i("MicroMsg.Setting.ColorSelfQRCodeGradientFgWhiteBgUIC", sb6.toString());
        if (((java.lang.Boolean) ((jz5.n) gVar).getValue()).booleanValue()) {
            kd0.x2 x2Var = (kd0.x2) i95.n0.c(kd0.x2.class);
            java.lang.String str = this.f161131q;
            ((jd0.q2) x2Var).getClass();
            S6(new g21.a(str, md1.f1.CTRL_INDEX, 1));
        } else {
            java.util.Iterator it = e17.iterator();
            while (it.hasNext()) {
                int intValue2 = ((java.lang.Number) it.next()).intValue();
                kd0.x2 x2Var2 = (kd0.x2) i95.n0.c(kd0.x2.class);
                java.lang.String str2 = this.f161131q;
                java.lang.String f17 = v24.v.f432957a.f(intValue2);
                ((jd0.q2) x2Var2).getClass();
                S6(new g21.a(str2, intValue2, 1, f17));
            }
        }
        if (z17) {
            com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f161132r;
            if ((u3Var != null && u3Var.isShowing()) || !this.f161133s) {
                return;
            }
            this.f161132r = db5.e1.Q(getContext(), getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.f492749hq2), true, true, null);
        }
    }

    public final int U6(java.lang.String str) {
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_QRCODE_NOW_SORT_INDEX_INT, null);
        java.lang.Integer num = m17 instanceof java.lang.Integer ? (java.lang.Integer) m17 : null;
        int intValue = num != null ? num.intValue() : 1;
        if (intValue == 0) {
            intValue = 1;
        }
        if (intValue == 3) {
            intValue = 2;
        }
        int i17 = intValue >= 0 && intValue < G.size() ? intValue : 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.Setting.ColorSelfQRCodeGradientFgWhiteBgUIC", "[" + hashCode() + "] getLastIndex:" + i17 + " for " + str);
        return i17;
    }

    public int V6() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getLastStyle(): ");
        int U6 = U6("getLastStyle");
        java.util.List list = G;
        sb6.append(((com.tencent.mm.plugin.setting.ui.setting.p) list.get(U6)).f161407b);
        com.tencent.mars.xlog.Log.i("MicroMsg.Setting.ColorSelfQRCodeGradientFgWhiteBgUIC", sb6.toString());
        return ((com.tencent.mm.plugin.setting.ui.setting.p) list.get(U6("getLastStyle"))).f161407b;
    }

    public int W6() {
        java.lang.Integer num = (java.lang.Integer) this.f161139y.get(java.lang.Integer.valueOf(U6("index2pattern")));
        if (num != null) {
            return num.intValue();
        }
        return 1;
    }

    public final void X6(boolean z17, boolean z18) {
        java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        this.f161140z--;
        com.tencent.mars.xlog.Log.i("MicroMsg.Setting.ColorSelfQRCodeGradientFgWhiteBgUIC", "[" + hashCode() + "] onSceneEnd %d, needUpdate: " + z17, java.lang.Integer.valueOf(this.f161140z));
        if (this.f161140z <= 0) {
            com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f161132r;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            this.f161132r = null;
            Y6(false);
            if (z17) {
                Z6(true, z18 ? 3 : 2);
            }
        }
    }

    public final void Y6(boolean z17) {
        android.view.View loadingView;
        android.view.View view = this.f161128n;
        if (view != null) {
            int i17 = z17 ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/ColorSelfQRCodeGradientFgWhiteBgUIC", "showLoading", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/setting/ui/setting/ColorSelfQRCodeGradientFgWhiteBgUIC", "showLoading", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (z17) {
            com.tencent.mm.plugin.setting.ui.setting.k kVar = this.f161138x;
            if (kVar != null) {
                com.tencent.mm.plugin.setting.ui.qrcode.SelfQrCodeView selfQrCodeView = ((p14.r) kVar).f351245a;
                wd0.u1 u1Var = selfQrCodeView.D;
                com.tencent.mm.plugin.setting.ui.qrcode.SelfQrCodeView.k(selfQrCodeView);
                return;
            }
            return;
        }
        com.tencent.mm.plugin.setting.ui.setting.k kVar2 = this.f161138x;
        if (kVar2 != null) {
            com.tencent.mm.plugin.setting.ui.qrcode.SelfQrCodeView selfQrCodeView2 = ((p14.r) kVar2).f351245a;
            wd0.u1 u1Var2 = selfQrCodeView2.D;
            loadingView = selfQrCodeView2.getLoadingView();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(loadingView, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/qrcode/SelfQrCodeView$onQRCodeEventListener$2$1", "onDismissLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            loadingView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(loadingView, "com/tencent/mm/plugin/setting/ui/qrcode/SelfQrCodeView$onQRCodeEventListener$2$1", "onDismissLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Z6(boolean r27, int r28) {
        /*
            Method dump skipped, instructions count: 1032
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.setting.ui.setting.i0.Z6(boolean, int):void");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        gm0.j1.d().a(be1.r0.CTRL_INDEX, this);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        java.lang.String r17 = c01.z1.r();
        kotlin.jvm.internal.o.f(r17, "getUsernameFromUserInfo(...)");
        this.f161131q = r17;
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(this.f161123f, c01.z1.r(), null);
        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
        java.lang.Object l17 = gm0.j1.u().c().l(2, null);
        java.lang.String str = l17 instanceof java.lang.String ? (java.lang.String) l17 : null;
        if (str == null) {
            str = "";
        }
        ((sg3.a) v0Var).getClass();
        java.lang.String b17 = c01.a2.b(str);
        android.widget.TextView textView = this.f161126i;
        if (textView != null) {
            textView.setText(((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(getActivity(), b17, i65.a.h(getContext(), com.tencent.mm.R.dimen.f479853h2)));
        }
        android.widget.TextView textView2 = this.f161126i;
        com.tencent.mm.ui.bk.s0(textView2 != null ? textView2.getPaint() : null);
        c01.fb a17 = c01.fb.a();
        java.lang.String d17 = a17.d();
        if (d17 == null) {
            d17 = "";
        }
        java.lang.String c17 = a17.c();
        java.lang.String str2 = ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).Di(d17) + ' ' + (c17 != null ? c17 : "");
        android.widget.TextView textView3 = this.f161127m;
        if (textView3 != null) {
            textView3.setText(str2);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Setting.ColorSelfQRCodeGradientFgWhiteBgUIC", "onCreateAfter bitmap == null, try fetchQRCode");
        T6(false);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        this.f161123f = null;
        this.f161124g = null;
        this.f161125h = null;
        this.f161126i = null;
        this.f161127m = null;
        this.f161128n = null;
        this.f161130p = null;
        gm0.j1.d().q(be1.r0.CTRL_INDEX, this);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Setting.ColorSelfQRCodeGradientFgWhiteBgUIC", "onResume");
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        android.widget.TextView textView;
        if ((m1Var instanceof kd0.j2) && kotlin.jvm.internal.o.b(m1Var, this.A)) {
            kd0.j2 j2Var = (kd0.j2) m1Var;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[");
            sb6.append(hashCode());
            sb6.append("] onGetQRSceneEnd() called with: errType = ");
            sb6.append(i17);
            sb6.append(", errCode = ");
            sb6.append(i18);
            sb6.append(", errMsg = ");
            sb6.append(str);
            sb6.append(", respStyle = ");
            g21.a aVar = (g21.a) j2Var;
            sb6.append(aVar.f267789i);
            sb6.append('.');
            com.tencent.mars.xlog.Log.i("MicroMsg.Setting.ColorSelfQRCodeGradientFgWhiteBgUIC", sb6.toString());
            o25.s1 a17 = f14.g.a();
            android.app.Activity context = getContext();
            ((com.tencent.mm.app.o7) a17).getClass();
            if (com.tencent.mm.ui.pc.a(context, i17, i18, str, 7)) {
                X6(true, true);
                return;
            }
            if (i17 != 0 || i18 != 0) {
                X6(true, true);
                return;
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(aVar.f267786f) && (textView = this.f161125h) != null) {
                textView.setText(aVar.f267786f);
            }
            kotlin.jvm.internal.o.f(aVar.f267792o, "getQRUrl(...)");
            kotlinx.coroutines.l.d(getLifecycleScope(), null, null, new com.tencent.mm.plugin.setting.ui.setting.b0(j2Var, this, null), 3, null);
        }
    }
}
