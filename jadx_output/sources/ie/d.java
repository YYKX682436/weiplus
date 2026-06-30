package ie;

/* loaded from: classes7.dex */
public class d extends com.tencent.mm.plugin.appbrand.widget.input.u3 {
    public static ie.c H;
    public static boolean I;
    public ie.b E;
    public com.tencent.luggage.game.widget.input.WAGamePanelInputEditText F;
    public android.view.View.OnClickListener G;

    public d(android.content.Context context, boolean z17) {
        super(context, null, z17);
    }

    public static ie.d N(android.view.View view) {
        return (ie.d) view.getRootView().findViewById(com.tencent.mm.R.id.f483117x1);
    }

    public static ie.d O(android.view.View view, boolean z17) {
        com.tencent.mm.plugin.appbrand.widget.input.h1 d17 = com.tencent.mm.plugin.appbrand.widget.input.h1.d(view);
        com.tencent.mm.plugin.appbrand.widget.input.h1.e(view);
        com.tencent.mm.plugin.appbrand.widget.input.u3 y17 = com.tencent.mm.plugin.appbrand.widget.input.u3.y(view);
        if (y17 != null && (y17.getParent() instanceof android.view.ViewGroup)) {
            ((android.view.ViewGroup) y17.getParent()).removeView(y17);
        }
        ie.d N = N(view);
        if (I != z17 && N != null) {
            d17.removeView(N);
            N = null;
        }
        I = z17;
        if (N == null) {
            N = view instanceof ie.d ? (ie.d) view : new ie.d(view.getContext(), z17);
            d17.a(N, false);
        }
        return N;
    }

    public static void setGameInputEditBarLayoutFactory(ie.c cVar) {
        H = cVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.u3
    public void C() {
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.u3
    public void D() {
        int i17;
        android.widget.ImageButton imageButton;
        android.view.View b17 = this.E.b();
        if (!((this.F.getInputType() & 2) > 0)) {
            if (!((this.F.getInputType() & 131072) > 0) && ((imageButton = this.f91687t) == null || imageButton.getVisibility() != 0)) {
                i17 = 8;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(i17));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(b17, arrayList.toArray(), "com/tencent/luggage/game/widget/input/WAGameInputPanel", "onPreShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                b17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(b17, "com/tencent/luggage/game/widget/input/WAGameInputPanel", "onPreShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        i17 = 0;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(b17, arrayList2.toArray(), "com/tencent/luggage/game/widget/input/WAGameInputPanel", "onPreShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        b17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(b17, "com/tencent/luggage/game/widget/input/WAGameInputPanel", "onPreShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.u3
    public void E() {
        O(this, I);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0060 A[Catch: Exception -> 0x00bd, TryCatch #0 {Exception -> 0x00bd, blocks: (B:7:0x0008, B:9:0x001a, B:11:0x0044, B:14:0x0059, B:16:0x0060, B:17:0x0072, B:19:0x0078, B:23:0x0083, B:28:0x009d, B:29:0x008d, B:32:0x00ae), top: B:6:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0072 A[Catch: Exception -> 0x00bd, TryCatch #0 {Exception -> 0x00bd, blocks: (B:7:0x0008, B:9:0x001a, B:11:0x0044, B:14:0x0059, B:16:0x0060, B:17:0x0072, B:19:0x0078, B:23:0x0083, B:28:0x009d, B:29:0x008d, B:32:0x00ae), top: B:6:0x0008 }] */
    @Override // com.tencent.mm.plugin.appbrand.widget.input.u3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void I() {
        /*
            r8 = this;
            com.tencent.mm.plugin.appbrand.widget.input.x4 r0 = r8.f91693z
            android.app.Activity r1 = r0.getHostActivity()
            if (r1 == 0) goto Lc9
            com.tencent.mm.plugin.appbrand.widget.input.h1 r1 = com.tencent.mm.plugin.appbrand.widget.input.h1.d(r8)     // Catch: java.lang.Exception -> Lbd
            ql1.a r1 = r1.getOnLayoutListener()     // Catch: java.lang.Exception -> Lbd
            com.tencent.mm.plugin.appbrand.widget.input.l2 r1 = (com.tencent.mm.plugin.appbrand.widget.input.l2) r1     // Catch: java.lang.Exception -> Lbd
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> Lbd
            r3 = 30
            r4 = 1
            r5 = 0
            if (r2 < r3) goto L58
            android.app.Activity r2 = r0.getHostActivity()     // Catch: java.lang.Exception -> Lbd
            android.view.WindowManager r2 = r2.getWindowManager()     // Catch: java.lang.Exception -> Lbd
            android.view.WindowMetrics r2 = r2.getCurrentWindowMetrics()     // Catch: java.lang.Exception -> Lbd
            android.app.Activity r3 = r0.getHostActivity()     // Catch: java.lang.Exception -> Lbd
            android.view.WindowManager r3 = r3.getWindowManager()     // Catch: java.lang.Exception -> Lbd
            android.view.WindowMetrics r3 = r3.getMaximumWindowMetrics()     // Catch: java.lang.Exception -> Lbd
            android.graphics.Rect r6 = r2.getBounds()     // Catch: java.lang.Exception -> Lbd
            int r6 = r6.width()     // Catch: java.lang.Exception -> Lbd
            android.graphics.Rect r7 = r3.getBounds()     // Catch: java.lang.Exception -> Lbd
            int r7 = r7.width()     // Catch: java.lang.Exception -> Lbd
            if (r6 < r7) goto L56
            android.graphics.Rect r2 = r2.getBounds()     // Catch: java.lang.Exception -> Lbd
            int r2 = r2.height()     // Catch: java.lang.Exception -> Lbd
            android.graphics.Rect r3 = r3.getBounds()     // Catch: java.lang.Exception -> Lbd
            int r3 = r3.height()     // Catch: java.lang.Exception -> Lbd
            if (r2 >= r3) goto L58
        L56:
            r2 = r4
            goto L59
        L58:
            r2 = r5
        L59:
            r8.setMiniGameInSplitOrFloatWindow(r2)     // Catch: java.lang.Exception -> Lbd
            r3 = 16
            if (r2 == 0) goto L72
            android.app.Activity r0 = r0.getHostActivity()     // Catch: java.lang.Exception -> Lbd
            android.view.Window r0 = r0.getWindow()     // Catch: java.lang.Exception -> Lbd
            r0.setSoftInputMode(r3)     // Catch: java.lang.Exception -> Lbd
            r1.i(r4)     // Catch: java.lang.Exception -> Lbd
            r8.d(r4)     // Catch: java.lang.Exception -> Lbd
            goto Lc9
        L72:
            android.app.Activity r2 = r0.getHostActivity()     // Catch: java.lang.Exception -> Lbd
            if (r2 == 0) goto L80
            boolean r2 = r2.isInMultiWindowMode()     // Catch: java.lang.Exception -> Lbd
            if (r2 == 0) goto L80
            r2 = r4
            goto L81
        L80:
            r2 = r5
        L81:
            if (r2 != 0) goto Lae
            android.app.Activity r2 = r0.getHostActivity()     // Catch: java.lang.Exception -> Lbd
            boolean r6 = r2 instanceof android.app.Activity     // Catch: java.lang.Exception -> Lbd
            r7 = 2
            if (r6 != 0) goto L8d
            goto L9a
        L8d:
            android.content.res.Resources r2 = r2.getResources()     // Catch: java.lang.Exception -> Lbd
            android.content.res.Configuration r2 = r2.getConfiguration()     // Catch: java.lang.Exception -> Lbd
            int r2 = r2.orientation     // Catch: java.lang.Exception -> Lbd
            if (r2 != r7) goto L9a
            r5 = r4
        L9a:
            if (r5 == 0) goto L9d
            goto Lae
        L9d:
            android.app.Activity r0 = r0.getHostActivity()     // Catch: java.lang.Exception -> Lbd
            android.view.Window r0 = r0.getWindow()     // Catch: java.lang.Exception -> Lbd
            r2 = 48
            r0.setSoftInputMode(r2)     // Catch: java.lang.Exception -> Lbd
            r1.i(r7)     // Catch: java.lang.Exception -> Lbd
            goto Lc9
        Lae:
            android.app.Activity r0 = r0.getHostActivity()     // Catch: java.lang.Exception -> Lbd
            android.view.Window r0 = r0.getWindow()     // Catch: java.lang.Exception -> Lbd
            r0.setSoftInputMode(r3)     // Catch: java.lang.Exception -> Lbd
            r1.i(r4)     // Catch: java.lang.Exception -> Lbd
            goto Lc9
        Lbd:
            r0 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "MicroMsg.WAGameInputPanel"
            java.lang.String r2 = "show() fix SoftInputMode for game, get exception:%s"
            com.tencent.mars.xlog.Log.e(r1, r2, r0)
        Lc9:
            com.tencent.luggage.game.widget.input.WAGamePanelInputEditText r0 = r8.F
            r8.f91691x = r0
            r0.requestFocus()
            super.I()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ie.d.I():void");
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.u3
    public void L() {
        this.E.a(false);
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.u3, com.tencent.mm.plugin.appbrand.widget.input.k2
    public void a(boolean z17) {
        super.a(z17);
        if (z17) {
            return;
        }
        vj5.n.b(this.f91693z.getHostActivity()).e();
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.u3, com.tencent.mm.plugin.appbrand.widget.input.k2
    public void d(int i17) {
        android.view.WindowInsets b17;
        int stableInsetBottom;
        if (i17 > 0 && 2 == ((com.tencent.mm.plugin.appbrand.widget.input.l2) com.tencent.mm.plugin.appbrand.widget.input.h1.d(this).getOnLayoutListener()).f91528a) {
            android.app.Activity hostActivity = this.f91693z.getHostActivity();
            if (com.tencent.mm.plugin.appbrand.ui.na.j(hostActivity) && (b17 = com.tencent.mm.ui.qk.b(hostActivity)) != null) {
                if (android.os.Build.VERSION.SDK_INT >= 30) {
                    int i18 = b17.getInsets(android.view.WindowInsets.Type.navigationBars() | android.view.WindowInsets.Type.ime()).bottom;
                    if (i18 <= 0 || i17 < i18) {
                        stableInsetBottom = b17.getInsets(android.view.WindowInsets.Type.navigationBars()).bottom;
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WAGameInputPanel", "refreshHeight height:%d already covers combinedBottom:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
                        stableInsetBottom = 0;
                    }
                } else {
                    stableInsetBottom = b17.getStableInsetBottom();
                }
                i17 += stableInsetBottom;
            }
        }
        super.d(i17);
    }

    public void setOnConfirmClickListener(android.view.View.OnClickListener onClickListener) {
        this.G = onClickListener;
    }

    public void setOnEmoticonOperationListener(ol1.t tVar) {
        ol1.o oVar = this.f91684q;
        if (oVar != null) {
            oVar.setOnEmoticonOperationListener(tVar);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.u3
    public final int u() {
        return com.tencent.mm.R.id.f483117x1;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.u3
    public android.view.View x() {
        ie.b bVar = new ie.b(getContext());
        this.F = (com.tencent.luggage.game.widget.input.WAGamePanelInputEditText) bVar.findViewById(com.tencent.mm.R.id.f485116gl4);
        bVar.b().setOnClickListener(new ie.a(this));
        this.f91691x = this.F;
        this.f91687t = H(bVar);
        boolean z17 = this.f91688u;
        android.view.View findViewById = bVar.findViewById(com.tencent.mm.R.id.f486966n15);
        if (findViewById != null) {
            int i17 = z17 ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/luggage/game/widget/input/WAGameInputPanel$EditBar", "setSmileySwitchBtnVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/luggage/game/widget/input/WAGameInputPanel$EditBar", "setSmileySwitchBtnVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.content.Context context = getContext();
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) bVar.findViewById(com.tencent.mm.R.id.f485114gl2);
        com.tencent.mm.ui.widget.imageview.WeImageButton weImageButton = (com.tencent.mm.ui.widget.imageview.WeImageButton) bVar.findViewById(com.tencent.mm.R.id.f486966n15);
        if (I) {
            linearLayout.setBackground(i65.a.i(context, com.tencent.mm.R.color.f478515x));
            weImageButton.setIconColor(i65.a.d(context, com.tencent.mm.R.color.BW_100_Alpha_0_8));
        } else {
            linearLayout.setBackground(i65.a.i(context, com.tencent.mm.R.color.BW_97));
            weImageButton.setIconColor(i65.a.d(context, com.tencent.mm.R.color.FG_0));
        }
        this.E = bVar;
        return bVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.u3
    public com.tencent.luggage.game.widget.input.WAGamePanelInputEditText getAttachedEditText() {
        return (com.tencent.luggage.game.widget.input.WAGamePanelInputEditText) super.getAttachedEditText();
    }
}
