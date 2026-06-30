package hk5;

/* loaded from: classes5.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hk5.k f282004d;

    public g(hk5.k kVar) {
        this.f282004d = kVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean booleanValue;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/transmit/uic/preview/ForwardMsgPreviewAppBrandUIC$overrideConfirmButtons$confirmClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        hk5.k kVar = this.f282004d;
        if (kVar.f282011n) {
            yj0.a.h(this, "com/tencent/mm/ui/transmit/uic/preview/ForwardMsgPreviewAppBrandUIC$overrideConfirmButtons$confirmClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        hk5.c cVar = kVar.f282010m;
        if (cVar != null) {
            java.lang.String str = cVar.f281999a;
            java.lang.String str2 = cVar.f282000b;
            kVar.f282011n = true;
            kVar.W6().a().setEnabled(false);
            kVar.W6().i().setEnabled(false);
            android.widget.ImageView imageView = (android.widget.ImageView) kVar.W6().h().findViewById(com.tencent.mm.R.id.sdz);
            if (imageView != null) {
                android.view.ViewParent parent = imageView.getParent();
                androidx.constraintlayout.widget.ConstraintLayout constraintLayout = parent instanceof androidx.constraintlayout.widget.ConstraintLayout ? (androidx.constraintlayout.widget.ConstraintLayout) parent : null;
                if (constraintLayout != null) {
                    com.tencent.mm.ui.widget.ThreeDotsLoadingView threeDotsLoadingView = kVar.f282009i;
                    if (threeDotsLoadingView != null) {
                        constraintLayout.removeView(threeDotsLoadingView);
                    }
                    com.tencent.mm.ui.widget.ThreeDotsLoadingView threeDotsLoadingView2 = new com.tencent.mm.ui.widget.ThreeDotsLoadingView(kVar.getActivity());
                    threeDotsLoadingView2.setId(android.view.View.generateViewId());
                    androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(-2, -2);
                    layoutParams.f10893h = 0;
                    layoutParams.f10899k = 0;
                    layoutParams.f10906q = 0;
                    layoutParams.f10908s = 0;
                    threeDotsLoadingView2.setLayoutParams(layoutParams);
                    threeDotsLoadingView2.setVisibility(0);
                    threeDotsLoadingView2.e();
                    constraintLayout.addView(threeDotsLoadingView2);
                    kVar.f282009i = threeDotsLoadingView2;
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ForwardMsgPreviewAppBrandUIC", "uploadAndConfirm appId:" + str + " path:" + str2);
            com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.b0 b0Var = (com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.b0) i95.n0.c(com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.b0.class);
            hk5.j jVar = new hk5.j(kVar);
            com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.p pVar = (com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.p) b0Var;
            pVar.getClass();
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            java.lang.Boolean bool = pVar.f80330d;
            if (bool != null) {
                booleanValue = bool.booleanValue();
            } else {
                pVar.f80330d = java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_android_wxa_share_to_yuanbao, 0) == 1);
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandYuanbaoService", "enableShareToYuanbao: " + pVar.f80330d);
                java.lang.Boolean bool2 = pVar.f80330d;
                kotlin.jvm.internal.o.d(bool2);
                booleanValue = bool2.booleanValue();
            }
            if (!booleanValue) {
                jVar.a(new com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.c0(false, null, null, null, 0L, 30, null));
            } else if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandYuanbaoService", "getAndUploadPageContent fail, appId is null");
                jVar.a(new com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.c0(false, null, null, null, 0L, 30, null));
            } else if (com.tencent.mm.sdk.platformtools.x2.n()) {
                kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.e(pVar, str, jVar, str2, null), 3, null);
            } else {
                jVar.a(new com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.c0(false, null, null, null, 0L, 30, null));
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandYuanbaoService", "getAndUploadPageContent fail, process:" + bm5.f1.a() + " error");
            }
        } else {
            j75.f Q6 = kVar.Q6();
            if (Q6 != null) {
                Q6.B3(new wg5.d());
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/transmit/uic/preview/ForwardMsgPreviewAppBrandUIC$overrideConfirmButtons$confirmClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
