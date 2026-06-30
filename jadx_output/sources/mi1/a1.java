package mi1;

/* loaded from: classes7.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public static final mi1.a1 f326508a = new mi1.a1();

    public static final java.util.Map a(com.tencent.mm.plugin.appbrand.e9 e9Var) {
        if (e9Var == null) {
            return null;
        }
        com.tencent.mm.plugin.appbrand.ui.bd bdVar = (com.tencent.mm.plugin.appbrand.ui.bd) e9Var.q(com.tencent.mm.plugin.appbrand.ui.bd.class);
        if (bdVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CapsuleBarUtils", "getBoundingRectFallback with appId[%s] NULL IMenuButtonLayoutPropertiesService", e9Var.getAppId());
            return null;
        }
        int E6 = bdVar.E6(e9Var);
        com.tencent.mm.plugin.appbrand.ui.zd zdVar = (com.tencent.mm.plugin.appbrand.ui.zd) bdVar;
        android.content.Context context = (android.content.Context) zdVar.f90375f.getValue();
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = zdVar.f90373d;
        if (context == null) {
            context = appBrandRuntime.f74795d;
        }
        int b17 = a06.d.b(context.getResources().getDisplayMetrics().density * 96);
        android.content.Context context2 = (android.content.Context) zdVar.f90375f.getValue();
        if (context2 == null) {
            context2 = appBrandRuntime.f74795d;
        }
        int dimensionPixelSize = context2.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480036m8);
        com.tencent.mm.plugin.appbrand.ui.ad a76 = bdVar.a7();
        int i17 = com.tencent.mm.plugin.appbrand.utils.f5.b(e9Var)[0];
        int i18 = E6 + (a76 != null ? a76.f89511b : 0);
        int i19 = dimensionPixelSize + i18;
        int i27 = i17 - (a76 != null ? a76.f89512c : 0);
        java.util.Map c17 = f326508a.c(new android.graphics.Rect(i27 - b17, i18, i27, i19));
        com.tencent.mars.xlog.Log.i("MicroMsg.CapsuleBarUtils", "getBoundingRectFallback with appId[%s] return %s", e9Var.getAppId(), c17);
        return c17;
    }

    public static final java.util.Map b(com.tencent.mm.plugin.appbrand.page.v5 pageView) {
        com.tencent.mm.plugin.appbrand.page.capsulebar.AppBrandCapsuleBarPlaceHolderView capsuleView;
        com.tencent.mm.plugin.appbrand.page.capsulebar.AppBrandCapsuleBarPlaceHolderView capsuleView2;
        com.tencent.mm.plugin.appbrand.page.capsulebar.AppBrandCapsuleBarPlaceHolderView capsuleView3;
        kotlin.jvm.internal.o.g(pageView, "pageView");
        int[] iArr = new int[2];
        al1.b r17 = pageView.r1();
        if (r17 != null && (capsuleView3 = r17.getCapsuleView()) != null) {
            capsuleView3.getLocationInWindow(iArr);
        }
        al1.b r18 = pageView.r1();
        int width = (r18 == null || (capsuleView2 = r18.getCapsuleView()) == null) ? 0 : capsuleView2.getWidth();
        al1.b r19 = pageView.r1();
        int height = (r19 == null || (capsuleView = r19.getCapsuleView()) == null) ? 0 : capsuleView.getHeight();
        int i17 = iArr[1];
        int i18 = iArr[0];
        int i19 = i18 + width;
        int i27 = height + i17;
        if (i18 == 0 || width == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CapsuleBarUtils", "getBoundingRectLegacy with appId[%s] left==0, return null", pageView.getAppId());
            return null;
        }
        java.util.Map c17 = f326508a.c(new android.graphics.Rect(i18, i17, i19, i27));
        com.tencent.mars.xlog.Log.i("MicroMsg.CapsuleBarUtils", "getBoundingRectLegacy with appId[%s] return %s", pageView.getAppId(), c17);
        return c17;
    }

    public static final mi1.z0 d(com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime) {
        kotlin.jvm.internal.o.g(runtime, "runtime");
        mi1.v vVar = runtime.f74821z;
        if (vVar == null) {
            return mi1.z0.f326739e;
        }
        mi1.f b17 = vVar.b();
        if (!(runtime.f74821z.d().f91034e != null) || b17.d() == Integer.MIN_VALUE) {
            return b17.j() != Integer.MIN_VALUE ? e(b17.j()) : mi1.z0.f326739e;
        }
        int d17 = b17.d();
        return d17 == 1 ? mi1.z0.f326744m : d17 == 0 ? mi1.z0.f326745n : mi1.z0.f326739e;
    }

    public static final mi1.z0 e(int i17) {
        return i17 == 1 ? mi1.z0.f326741g : i17 == 2 ? mi1.z0.f326742h : i17 == 3 ? mi1.z0.f326743i : mi1.z0.f326739e;
    }

    public final java.util.Map c(android.graphics.Rect rect) {
        rect.left = ik1.w.e(rect.left);
        rect.top = ik1.w.e(rect.top);
        rect.right = ik1.w.e(rect.right);
        rect.bottom = ik1.w.e(rect.bottom);
        java.util.HashMap hashMap = new java.util.HashMap(6);
        hashMap.put("left", java.lang.Integer.valueOf(rect.left));
        hashMap.put("top", java.lang.Integer.valueOf(rect.top));
        hashMap.put("right", java.lang.Integer.valueOf(rect.right));
        hashMap.put("bottom", java.lang.Integer.valueOf(rect.bottom));
        hashMap.put("width", java.lang.Integer.valueOf(rect.width()));
        hashMap.put("height", java.lang.Integer.valueOf(rect.height()));
        return hashMap;
    }
}
