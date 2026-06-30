package ke3;

/* loaded from: classes7.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.magicbrush.scl.commonstarter.ui.MagicSclCommonStarterDemoUI f307008d;

    public c(com.tencent.mm.plugin.magicbrush.scl.commonstarter.ui.MagicSclCommonStarterDemoUI magicSclCommonStarterDemoUI) {
        this.f307008d = magicSclCommonStarterDemoUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/magicbrush/scl/commonstarter/ui/MagicSclCommonStarterDemoUI$initDynamicCardEnv$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.magicbrush.scl.commonstarter.ui.MagicSclCommonStarterDemoUI magicSclCommonStarterDemoUI = this.f307008d;
        if (magicSclCommonStarterDemoUI.f148129e == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclCommonStarterDemoUI", "bizHandle is null");
        } else {
            gq0.t tVar = (gq0.t) i95.n0.c(gq0.t.class);
            kotlin.jvm.internal.o.d(tVar);
            iq0.c cVar = magicSclCommonStarterDemoUI.f148129e;
            kotlin.jvm.internal.o.d(cVar);
            ((nq0.p) tVar).bj(cVar, "mb.JSBridge.invoke(\"insertFrameSet\", \n            {\n              \"frameSetName\": \"mock_123\",\n              \"bizName\": \"MagicSclNativeDemo\",\n              \"viewId\": -100,\n              \"frameSetRootPath\": \"frames\",\n              \"frameSetData\": \n          {\n          \"type\": 1,\n          \"data\": \"{\\\"iconUrl\\\":\\\"https://dldir1v6.qq.com/weixin/checkresupdate/shopicon_51fca260daa5429ca68962e278c6eef5.png\\\",\\\"pagIconUrl\\\":\\\"\\\",\\\"iconType\\\":0,\\\"recommendReason\\\":\\\"商品\\\",\\\"wording\\\":\\\"古琴零基础入门年课\\\"}\"\n          }\n         ,\n              \"frameJson\": {\n                \"subBizType\": 0,\n                \"viewParam\": {\n                  \"position\": { \"left\": 0, \"top\": 0, \"width\": 400, \"height\": 889 }\n                }\n              }\n            }\n        )", null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/magicbrush/scl/commonstarter/ui/MagicSclCommonStarterDemoUI$initDynamicCardEnv$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
