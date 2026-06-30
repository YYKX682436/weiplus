package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes.dex */
public class c1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mall.ui.MallIndexUI f148346d;

    public c1(com.tencent.mm.plugin.mall.ui.MallIndexUI mallIndexUI) {
        this.f148346d = mallIndexUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mall/ui/MallIndexUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexUI", "click settings btn");
        j45.l.h(this.f148346d.getContext(), "mall", ".ui.MallFunctionSettingsUI");
        yj0.a.h(this, "com/tencent/mm/plugin/mall/ui/MallIndexUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
