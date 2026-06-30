package i81;

/* loaded from: classes7.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f289592a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Set f289593b;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(":appbrand0", com.tencent.mm.plugin.appbrand.ad.ui.AppBrandAdUI.class);
        hashMap.put(":appbrand1", com.tencent.mm.plugin.appbrand.ad.ui.AppBrandAdUI1.class);
        hashMap.put(":appbrand2", com.tencent.mm.plugin.appbrand.ad.ui.AppBrandAdUI2.class);
        hashMap.put(":appbrand3", com.tencent.mm.plugin.appbrand.ad.ui.AppBrandAdUI3.class);
        hashMap.put(":appbrand4", com.tencent.mm.plugin.appbrand.ad.ui.AppBrandAdUI4.class);
        f289592a = java.util.Collections.unmodifiableMap(hashMap);
        java.util.HashSet hashSet = new java.util.HashSet();
        f289593b = hashSet;
        hashSet.add(com.tencent.mm.plugin.appbrand.ad.jsapi.n.NAME);
        hashSet.add(com.tencent.mm.plugin.appbrand.ad.jsapi.m.NAME);
        hashSet.add(com.tencent.mm.plugin.appbrand.ad.jsapi.k.NAME);
        hashSet.add(com.tencent.mm.plugin.appbrand.ad.jsapi.i.NAME);
        hashSet.add(com.tencent.mm.plugin.appbrand.ad.jsapi.g.NAME);
        hashSet.add(com.tencent.mm.plugin.appbrand.ad.jsapi.s.NAME);
        hashSet.add(if1.o.NAME);
        hashSet.add(if1.q.NAME);
        hashSet.add(if1.n.NAME);
        hashSet.add(if1.p.NAME);
        hashSet.add(if1.m.NAME);
    }

    public static boolean a(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC) {
        boolean z17 = true;
        if (com.tencent.mm.plugin.appbrand.o6.f86162n3) {
            int h17 = bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.ad.RepairerConfigAppBrandAdOpen());
            if (h17 != 0 && h17 == 1) {
                return true;
            }
        }
        if (!i81.d.b()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAdUtils[AppBrandSplashAd]", "isAdContact, showad experiment closed");
            return false;
        }
        boolean z18 = appBrandInitConfigWC.g() ? appBrandInitConfigWC.f77300m2 : appBrandInitConfigWC.f77299l2;
        if (i81.d.a()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAdUtils[AppBrandSplashAd]", "isAdContact, set to all show ad");
        } else {
            z17 = z18;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAdUtils[AppBrandSplashAd]", "isAdContact, appId:%s, canShowAd:%s", appBrandInitConfigWC.f77278d, java.lang.Boolean.valueOf(z17));
        return z17;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(com.tencent.mm.plugin.appbrand.o6 r10, com.tencent.mm.plugin.appbrand.task.e0 r11, boolean r12) {
        /*
            int r11 = r11.ordinal()
            r0 = 3
            r1 = 2
            r2 = 1
            if (r11 == 0) goto L12
            if (r11 == r2) goto L10
            if (r11 == r1) goto Le
            goto L12
        Le:
            r11 = r0
            goto L13
        L10:
            r11 = r1
            goto L13
        L12:
            r11 = r2
        L13:
            com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime r3 = com.tencent.mm.plugin.appbrand.report.quality.e.a(r10)
            if (r3 != 0) goto L2b
            com.tencent.mm.plugin.appbrand.report.quality.QualitySession r3 = new com.tencent.mm.plugin.appbrand.report.quality.QualitySession
            java.lang.String r5 = ""
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r6 = r10.u0()
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r7 = r10.l2()
            r8 = 0
            r4 = r3
            r4.<init>(r5, r6, r7, r8)
        L2b:
            com.tencent.mm.plugin.report.service.g0 r10 = com.tencent.mm.plugin.report.service.g0.INSTANCE
            r4 = 7
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            java.lang.String r6 = r3.f88135e
            r4[r5] = r6
            int r5 = r3.f88139i
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r2] = r5
            int r5 = r3.f88136f
            if (r5 == r2) goto L4d
            if (r5 == r1) goto L4a
            if (r5 == r0) goto L47
            r2 = 0
            goto L4f
        L47:
            cm.e0 r2 = cm.e0.demo
            goto L4f
        L4a:
            cm.e0 r2 = cm.e0.debug
            goto L4f
        L4d:
            cm.e0 r2 = cm.e0.release
        L4f:
            r4[r1] = r2
            int r1 = r3.f88137g
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4[r0] = r1
            int r0 = r3.f88138h
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 4
            r4[r1] = r0
            r0 = 5
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r4[r0] = r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            r12 = 6
            r4[r12] = r11
            r11 = 21052(0x523c, float:2.95E-41)
            r10.d(r11, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i81.j.b(com.tencent.mm.plugin.appbrand.o6, com.tencent.mm.plugin.appbrand.task.e0, boolean):void");
    }

    public static void c(i81.q qVar) {
        if (!com.tencent.mm.plugin.appbrand.AppBrandRuntimeWCAccessible.isGame(qVar.getRuntime())) {
            mi1.i iVar = qVar.getFakeActionBar().f289523f;
            iVar.setCapsuleContentAreaMarginEnd(iVar.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480020lt));
            return;
        }
        android.view.View actionView = qVar.getFakeActionBar().getActionView();
        kotlin.jvm.internal.o.g(actionView, "<this>");
        android.content.Context context = actionView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        mi1.f3.a(actionView, context, false);
        mi1.i iVar2 = qVar.getFakeActionBar().f289523f;
        kotlin.jvm.internal.o.g(iVar2, "<this>");
        android.content.Context context2 = iVar2.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        mi1.f3.c(iVar2, context2, false);
    }
}
