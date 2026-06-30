package ke3;

/* loaded from: classes7.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.magicbrush.scl.commonstarter.ui.MagicSclCommonStarterDemoUI f307006d;

    public a(com.tencent.mm.plugin.magicbrush.scl.commonstarter.ui.MagicSclCommonStarterDemoUI magicSclCommonStarterDemoUI) {
        this.f307006d = magicSclCommonStarterDemoUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/magicbrush/scl/commonstarter/ui/MagicSclCommonStarterDemoUI$initDynamicCardEnv$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.List list = com.tencent.mm.plugin.magicbrush.scl.commonstarter.ui.MagicSclCommonStarterDemoUI.f148127g;
        com.tencent.mm.plugin.magicbrush.scl.commonstarter.ui.MagicSclCommonStarterDemoUI magicSclCommonStarterDemoUI = this.f307006d;
        magicSclCommonStarterDemoUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclCommonStarterDemoUI", "start");
        ke3.i iVar = new ke3.i(new ke3.l(magicSclCommonStarterDemoUI), magicSclCommonStarterDemoUI);
        i95.m c17 = i95.n0.c(gq0.t.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        iq0.c de6 = gq0.t.de((gq0.t) c17, iVar, null, 2, null);
        magicSclCommonStarterDemoUI.f148129e = de6;
        if (de6 != null) {
            i95.m c18 = i95.n0.c(gq0.t.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            gq0.t.bh((gq0.t) c18, de6, null, 2, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/magicbrush/scl/commonstarter/ui/MagicSclCommonStarterDemoUI$initDynamicCardEnv$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
