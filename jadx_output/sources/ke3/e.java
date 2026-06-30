package ke3;

/* loaded from: classes7.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.magicbrush.scl.commonstarter.ui.MagicSclCommonStarterDemoUI f307010d;

    public e(com.tencent.mm.plugin.magicbrush.scl.commonstarter.ui.MagicSclCommonStarterDemoUI magicSclCommonStarterDemoUI) {
        this.f307010d = magicSclCommonStarterDemoUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.view.ViewGroup viewGroup;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/magicbrush/scl/commonstarter/ui/MagicSclCommonStarterDemoUI$initDynamicCardEnv$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.List list = com.tencent.mm.plugin.magicbrush.scl.commonstarter.ui.MagicSclCommonStarterDemoUI.f148127g;
        com.tencent.mm.plugin.magicbrush.scl.commonstarter.ui.MagicSclCommonStarterDemoUI magicSclCommonStarterDemoUI = this.f307010d;
        magicSclCommonStarterDemoUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclCommonStarterDemoUI", "cover");
        iq0.c cVar = magicSclCommonStarterDemoUI.f148129e;
        if (cVar != null && (viewGroup = magicSclCommonStarterDemoUI.f148128d) != null) {
            i95.m c17 = i95.n0.c(gq0.t.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            gq0.t.Qh((gq0.t) c17, cVar, null, "mock_123", "\n          {\n          \"type\": 1,\n          \"data\": \"{\\\"iconUrl\\\":\\\"https://dldir1v6.qq.com/weixin/checkresupdate/shopicon_51fca260daa5429ca68962e278c6eef5.png\\\",\\\"pagIconUrl\\\":\\\"\\\",\\\"iconType\\\":0,\\\"recommendReason\\\":\\\"商品\\\",\\\"wording\\\":\\\"古琴零基础入门年课\\\"}\"\n          }\n         ", new android.graphics.Rect(0, 0, viewGroup.getWidth(), viewGroup.getHeight()), hq0.m0.f283032d, 2, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/magicbrush/scl/commonstarter/ui/MagicSclCommonStarterDemoUI$initDynamicCardEnv$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
