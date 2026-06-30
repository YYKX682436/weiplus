package ia2;

/* loaded from: classes2.dex */
public final class f extends hx2.h {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.ref.WeakReference f289918b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity f289919c;

    public f(com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity finderFlutterPOIActivity) {
        this.f289919c = finderFlutterPOIActivity;
        this.f289918b = new java.lang.ref.WeakReference(finderFlutterPOIActivity);
    }

    @Override // hx2.i
    public void b(gx2.q layout) {
        java.lang.ref.WeakReference weakReference;
        kotlin.jvm.internal.o.g(layout, "layout");
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderFlutterPOIActivity", "onDrawerClose");
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity finderFlutterPOIActivity = (com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity) this.f289918b.get();
        ((cy1.a) rVar).w8((finderFlutterPOIActivity == null || (weakReference = finderFlutterPOIActivity.f101780t) == null) ? null : (com.tencent.mm.ui.vas.VASCommonFragment) weakReference.get());
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // hx2.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(gx2.q r14) {
        /*
            r13 = this;
            java.lang.String r0 = "layout"
            kotlin.jvm.internal.o.g(r14, r0)
            java.lang.String r0 = "MicroMsg.FinderFlutterPOIActivity"
            java.lang.String r1 = "onDrawerExpand"
            com.tencent.mars.xlog.Log.i(r0, r1)
            java.lang.ref.WeakReference r0 = r13.f289918b
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity r0 = (com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity) r0
            if (r0 != 0) goto L19
            return
        L19:
            ia2.n0 r1 = r0.f101782v
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L3d
            com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader r1 = r1.f289960n
            if (r1 == 0) goto L2c
            r45.bp2 r1 = r1.f107546s
            if (r1 == 0) goto L2c
            java.util.LinkedList r1 = r1.getList(r2)
            goto L2d
        L2c:
            r1 = 0
        L2d:
            if (r1 == 0) goto L38
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L36
            goto L38
        L36:
            r1 = r2
            goto L39
        L38:
            r1 = r3
        L39:
            if (r1 != r3) goto L3d
            r1 = r3
            goto L3e
        L3d:
            r1 = r2
        L3e:
            if (r1 == 0) goto L47
            boolean r1 = r0.W
            if (r1 != 0) goto L47
            com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity.c7(r0)
        L47:
            com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity r1 = r13.f289919c
            ia2.n0 r4 = r1.f101782v
            if (r4 == 0) goto L54
            boolean r4 = r0.D
            if (r4 != 0) goto L54
            r0.q7(r3)
        L54:
            android.view.View r0 = r1.K
            if (r0 != 0) goto L59
            goto L9f
        L59:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.ThreadLocal r4 = zj0.c.f473285a
            r4 = 0
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r3.add(r4)
            java.util.Collections.reverse(r3)
            java.lang.Object[] r6 = r3.toArray()
            java.lang.String r7 = "com/tencent/mm/plugin/finder/activity/poi/flutter/FinderFlutterPOIActivity$CallbackComponent"
            java.lang.String r8 = "onDrawerExpand"
            java.lang.String r9 = "(Lcom/tencent/mm/plugin/finder/view/drawer/FinderCustomDrawer;)V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setAlpha"
            java.lang.String r12 = "(F)V"
            r5 = r0
            yj0.a.d(r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.Object r2 = r3.get(r2)
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r0.setAlpha(r2)
            java.lang.String r6 = "com/tencent/mm/plugin/finder/activity/poi/flutter/FinderFlutterPOIActivity$CallbackComponent"
            java.lang.String r7 = "onDrawerExpand"
            java.lang.String r8 = "(Lcom/tencent/mm/plugin/finder/view/drawer/FinderCustomDrawer;)V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setAlpha"
            java.lang.String r11 = "(F)V"
            yj0.a.f(r5, r6, r7, r8, r9, r10, r11)
        L9f:
            yz5.q r0 = r1.Q
            if (r0 == 0) goto Lc2
            float r2 = r14.getBorderPeek()
            float r14 = r14.getBorderExpand()
            float r2 = r2 - r14
            java.lang.Float r14 = java.lang.Float.valueOf(r2)
            r2 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            boolean r1 = r1.C
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.Object r14 = r0.invoke(r14, r2, r1)
            java.lang.Boolean r14 = (java.lang.Boolean) r14
        Lc2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ia2.f.c(gx2.q):void");
    }

    @Override // hx2.i
    public void d(gx2.q layout) {
        gx2.q qVar;
        java.lang.ref.WeakReference weakReference;
        kotlin.jvm.internal.o.g(layout, "layout");
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderFlutterPOIActivity", "onDrawerOpen");
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        java.lang.ref.WeakReference weakReference2 = this.f289918b;
        com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity finderFlutterPOIActivity = (com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity) weakReference2.get();
        ((cy1.a) rVar).D2((finderFlutterPOIActivity == null || (weakReference = finderFlutterPOIActivity.f101780t) == null) ? null : (com.tencent.mm.ui.vas.VASCommonFragment) weakReference.get());
        com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity finderFlutterPOIActivity2 = (com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity) weakReference2.get();
        if (finderFlutterPOIActivity2 == null || (qVar = finderFlutterPOIActivity2.f101776J) == null) {
            return;
        }
        if (qVar.f277373y1) {
            qVar.postInvalidate();
        }
        qVar.f277373y1 = false;
    }

    @Override // hx2.i
    public void e(gx2.q layout) {
        com.tencent.pigeon.finder.POIFlutterAPI pOIFlutterAPI;
        kotlin.jvm.internal.o.g(layout, "layout");
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderFlutterPOIActivity", "onDrawerPeek");
        com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity finderFlutterPOIActivity = (com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity) this.f289918b.get();
        if (finderFlutterPOIActivity == null) {
            return;
        }
        int i17 = com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity.H1;
        ia2.n0 n0Var = finderFlutterPOIActivity.f101782v;
        if (n0Var != null && (pOIFlutterAPI = n0Var.f289955f) != null) {
            pOIFlutterAPI.scrollToTop(ia2.q0.a("scrollToTop"));
        }
        com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity finderFlutterPOIActivity2 = this.f289919c;
        if (finderFlutterPOIActivity2.f101782v != null && !finderFlutterPOIActivity.D) {
            finderFlutterPOIActivity.q7(false);
        }
        android.view.View view = finderFlutterPOIActivity2.K;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/activity/poi/flutter/FinderFlutterPOIActivity$CallbackComponent", "onDrawerPeek", "(Lcom/tencent/mm/plugin/finder/view/drawer/FinderCustomDrawer;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/activity/poi/flutter/FinderFlutterPOIActivity$CallbackComponent", "onDrawerPeek", "(Lcom/tencent/mm/plugin/finder/view/drawer/FinderCustomDrawer;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        yz5.q qVar = finderFlutterPOIActivity2.Q;
        if (qVar != null) {
        }
    }

    @Override // hx2.i
    public void g(gx2.q layout, float f17, java.lang.String source) {
        kotlin.jvm.internal.o.g(layout, "layout");
        kotlin.jvm.internal.o.g(source, "source");
        super.g(layout, f17, source);
        boolean b17 = kotlin.jvm.internal.o.b(source, "onScroll");
        boolean b18 = kotlin.jvm.internal.o.b(source, "resetTranslation");
        float borderPeek = layout.getBorderPeek() - f17;
        float borderPeek2 = layout.getBorderPeek();
        int i17 = com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity.H1;
        com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity finderFlutterPOIActivity = this.f289919c;
        finderFlutterPOIActivity.getClass();
        float borderExpand = borderPeek2 - layout.getBorderExpand();
        if (borderPeek > 0.0d) {
            float f18 = borderPeek / borderExpand;
            r3 = f18 >= 0.0f ? f18 : 0.0f;
            if (r3 > 1.0f) {
                r3 = 1.0f;
            }
        }
        com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity finderFlutterPOIActivity2 = (com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity) this.f289918b.get();
        if (finderFlutterPOIActivity2 != null) {
            com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity.h7(finderFlutterPOIActivity2, r3, b17, b18);
        }
        if (b17) {
            android.view.View view = finderFlutterPOIActivity.K;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Float.valueOf(1 - r3));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/activity/poi/flutter/FinderFlutterPOIActivity$CallbackComponent", "onTranslationChange", "(Lcom/tencent/mm/plugin/finder/view/drawer/FinderCustomDrawer;FLjava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/activity/poi/flutter/FinderFlutterPOIActivity$CallbackComponent", "onTranslationChange", "(Lcom/tencent/mm/plugin/finder/view/drawer/FinderCustomDrawer;FLjava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            yz5.q qVar = finderFlutterPOIActivity.Q;
            if (qVar != null) {
            }
        }
    }
}
