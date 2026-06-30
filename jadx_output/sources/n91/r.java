package n91;

/* loaded from: classes7.dex */
public final class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f335895d;

    public r(com.tencent.mm.plugin.appbrand.o6 o6Var) {
        this.f335895d = o6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r14) {
        /*
            r13 = this;
            java.lang.String r0 = "com/tencent/mm/plugin/appbrand/custom_loading/CustomLoadingUtil$getOnTitleClickListener$1"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.add(r14)
            java.lang.Object[] r5 = r4.toArray()
            r4.clear()
            r4 = r13
            yj0.a.b(r0, r1, r2, r3, r4, r5)
            com.tencent.mm.plugin.appbrand.o6 r14 = r13.f335895d
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r14 = r14.u0()
            com.tencent.mm.plugin.appbrand.o6 r0 = r13.f335895d
            android.app.Activity r1 = r0.r0()
            java.lang.String r0 = "(Landroid/view/View;)V"
            java.lang.String r9 = "onClick"
            java.lang.String r10 = "android/view/View$OnClickListener"
            java.lang.String r11 = "com/tencent/mm/plugin/appbrand/custom_loading/CustomLoadingUtil$getOnTitleClickListener$1"
            if (r1 != 0) goto L35
            yj0.a.h(r13, r11, r10, r9, r0)
            return
        L35:
            k91.z5 r2 = new k91.z5
            r2.<init>()
            com.tencent.mm.plugin.appbrand.o6 r3 = r13.f335895d
            com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC r3 = r3.E0()
            com.tencent.mm.plugin.appbrand.o6 r4 = r13.f335895d
            com.tencent.mm.plugin.appbrand.page.n7 r4 = r4.N2()
            kotlin.jvm.internal.o.d(r4)
            com.tencent.mm.plugin.appbrand.o6 r5 = r13.f335895d
            java.lang.String r6 = "embedWxa"
            kotlin.jvm.internal.o.g(r5, r6)
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r6 = r5.u0()
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r6 = r6.L1
            java.lang.String r7 = "halfScreenConfig"
            kotlin.jvm.internal.o.f(r6, r7)
            boolean r7 = r6.c()
            r8 = 1
            if (r7 == 0) goto L6a
            k91.x2 r7 = k91.x2.f305817e
            k91.x2 r6 = r6.D
            if (r6 != r7) goto L6a
            r6 = r8
            goto L6b
        L6a:
            r6 = 0
        L6b:
            r7 = 0
            if (r6 == 0) goto L80
            com.tencent.mm.plugin.appbrand.hc r6 = r5.f74796e
            if (r6 != 0) goto L73
            goto L80
        L73:
            boolean r12 = r6.n(r5)
            if (r12 == 0) goto L80
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r5 = r6.i(r5)
            r7 = r5
            com.tencent.mm.plugin.appbrand.o6 r7 = (com.tencent.mm.plugin.appbrand.o6) r7
        L80:
            java.lang.String r5 = r3.f305842e
            r2.f305863a = r5
            java.lang.String r5 = ""
            if (r7 != 0) goto L8a
            r6 = r5
            goto L8c
        L8a:
            java.lang.String r6 = r7.f74803n
        L8c:
            r2.f305865c = r6
            r6 = 3
            r2.f305872j = r6
            com.tencent.mm.plugin.appbrand.page.fb r6 = r4.a2()
            if (r6 != 0) goto L98
            goto L9c
        L98:
            java.lang.String r5 = r4.X1()
        L9c:
            r2.f305873k = r5
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r4 = r3.f305852r
            int r4 = r4.f75399d
            r2.f305870h = r4
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r3 = r3.f305852r
            int r3 = r3.pkgVersion
            r2.f305869g = r3
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            java.lang.String r3 = "key_is_embed_wxa"
            r7.putBoolean(r3, r8)
            java.lang.String r14 = r14.f47278x
            r3 = 11
            java.lang.String r4 = ""
            r5 = 1
            com.tencent.mm.plugin.appbrand.config.WxaExposedParams r6 = r2.a()
            com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate r8 = com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate.a(r1)
            r2 = r14
            com.tencent.mm.plugin.appbrand.ui.AppBrandProfileUI.V6(r1, r2, r3, r4, r5, r6, r7, r8)
            yj0.a.h(r13, r11, r10, r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n91.r.onClick(android.view.View):void");
    }
}
