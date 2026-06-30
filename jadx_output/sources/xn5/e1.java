package xn5;

/* loaded from: classes13.dex */
public final class e1 implements xn5.z {

    /* renamed from: a, reason: collision with root package name */
    public static final xn5.e1 f455663a = new xn5.e1();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f455664b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.mm.view.x2c.X2CMergeView f455665c = new com.tencent.mm.view.x2c.X2CMergeView(com.tencent.mm.sdk.platformtools.x2.f193071a);

    /* renamed from: d, reason: collision with root package name */
    public static final android.os.Handler f455666d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.HashMap f455667e;

    /* renamed from: f, reason: collision with root package name */
    public static com.tencent.mm.sdk.platformtools.o4 f455668f;

    static {
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("X2C_LAYOUT_THREAD");
        handlerThread.start();
        f455666d = new android.os.Handler(handlerThread.getLooper());
        f455667e = new java.util.HashMap();
    }

    @Override // xn5.z
    public android.view.View a(android.content.Context context, int i17, android.view.ViewGroup viewGroup, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f455664b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(context.hashCode());
        sb6.append('_');
        sb6.append(i17);
        sb6.append('_');
        sb6.append(viewGroup != null ? 1 : 0);
        xn5.a1 a1Var = (xn5.a1) concurrentHashMap.get(sb6.toString());
        if (a1Var != null) {
            java.util.List list = a1Var.f455646a;
            if (true ^ list.isEmpty()) {
                xn5.b1 b1Var = (xn5.b1) fp.l.b(list);
                android.view.View view = b1Var.f455651a;
                if (viewGroup != null) {
                    xn5.p0 p0Var = xn5.q0.f455702a;
                    android.view.ViewGroup.LayoutParams generateLayoutParams = viewGroup.generateLayoutParams(xn5.q0.f455705d);
                    java.lang.Object tag = view.getTag(com.tencent.mm.R.id.psd);
                    kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) tag;
                    kotlin.jvm.internal.o.d(generateLayoutParams);
                    generateLayoutParams.width = ((android.view.ViewGroup.LayoutParams) marginLayoutParams).width;
                    generateLayoutParams.height = ((android.view.ViewGroup.LayoutParams) marginLayoutParams).height;
                    if (generateLayoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
                        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) generateLayoutParams;
                        marginLayoutParams2.rightMargin = marginLayoutParams.rightMargin;
                        marginLayoutParams2.topMargin = marginLayoutParams.topMargin;
                        marginLayoutParams2.leftMargin = marginLayoutParams.leftMargin;
                        marginLayoutParams2.bottomMargin = marginLayoutParams.bottomMargin;
                        marginLayoutParams2.setMarginStart(marginLayoutParams.getMarginStart());
                        marginLayoutParams2.setMarginEnd(marginLayoutParams.getMarginEnd());
                    }
                    view.setLayoutParams(generateLayoutParams);
                    if (z17) {
                        viewGroup.addView(view);
                    }
                }
                return b1Var.f455651a;
            }
        }
        return null;
    }

    @Override // xn5.z
    public void b(r45.hg7 preloadData) {
        kotlin.jvm.internal.o.g(preloadData, "preloadData");
        f455666d.post(new xn5.f1(new xn5.z0(preloadData)));
    }

    @Override // xn5.z
    public void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.X2C.X2CLayoutCachePool", "clearLayoutCache");
        f455666d.removeCallbacksAndMessages(null);
        f455664b.clear();
    }

    @Override // xn5.z
    public void d(final android.content.Context context, androidx.lifecycle.y lifecycleOwner, final java.lang.String actName) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(lifecycleOwner, "lifecycleOwner");
        kotlin.jvm.internal.o.g(actName, "actName");
        java.lang.String str = com.tencent.mm.sdk.platformtools.t8.u1(actName, context.getClass().getSimpleName()) + '_' + c01.id.c();
        f455666d.post(new xn5.f1(new xn5.y0(str, new java.lang.ref.WeakReference(context), actName)));
        com.tencent.mars.xlog.Log.i("MicroMsg.X2C.X2CLayoutCachePool", "onCreate ".concat(str));
        lifecycleOwner.mo133getLifecycle().a(new androidx.lifecycle.f() { // from class: com.tencent.mm.view.x2c.X2CLayoutCachePool$preload$1
            @Override // androidx.lifecycle.f, androidx.lifecycle.h
            public void onDestroy(androidx.lifecycle.y owner) {
                kotlin.jvm.internal.o.g(owner, "owner");
                xn5.e1 e1Var = xn5.e1.f455663a;
                android.content.Context context2 = context;
                kotlin.jvm.internal.o.g(context2, "context");
                java.lang.String actName2 = actName;
                kotlin.jvm.internal.o.g(actName2, "actName");
                java.lang.String str2 = com.tencent.mm.sdk.platformtools.t8.u1(actName2, context2.getClass().getSimpleName()) + '_' + c01.id.c();
                android.os.Handler handler = xn5.e1.f455666d;
                int hashCode = context2.hashCode();
                java.lang.String u17 = com.tencent.mm.sdk.platformtools.t8.u1(actName2, context2.getClass().getSimpleName());
                kotlin.jvm.internal.o.f(u17, "nullOrNilAs(...)");
                handler.post(new xn5.f1(new xn5.x0(str2, hashCode, u17)));
                com.tencent.mars.xlog.Log.i("MicroMsg.X2C.X2CLayoutCachePool", "onDestroy ".concat(str2));
            }
        });
    }

    public final com.tencent.mm.sdk.platformtools.o4 e() {
        com.tencent.mm.sdk.platformtools.o4 o4Var;
        if (f455668f == null) {
            com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("X2CPreloadLayoutData");
            f455668f = M;
            java.lang.String t17 = M != null ? M.t("BuildInfo.TIME") : null;
            boolean z17 = bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.x2c.RepairerConfigX2CClearLayoutStrategy()) == 1;
            if ((!kotlin.jvm.internal.o.b(t17, com.tencent.mm.sdk.platformtools.z.f193107c) || z17) && (o4Var = f455668f) != null) {
                o4Var.d();
            }
            com.tencent.mm.sdk.platformtools.o4 o4Var2 = f455668f;
            if (o4Var2 != null) {
                o4Var2.D("BuildInfo.TIME", com.tencent.mm.sdk.platformtools.z.f193107c);
            }
        }
        return f455668f;
    }
}
