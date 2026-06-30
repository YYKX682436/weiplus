package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes9.dex */
public class a1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ef3.d f148328d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mall.ui.MallIndexUI f148329e;

    public a1(com.tencent.mm.plugin.mall.ui.MallIndexUI mallIndexUI, ef3.d dVar) {
        this.f148329e = mallIndexUI;
        this.f148328d = dVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mall/ui/MallIndexUI$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.wallet_core.ui.r1.V(this.f148329e.getContext(), this.f148328d.f252405a, true);
        yj0.a.h(this, "com/tencent/mm/plugin/mall/ui/MallIndexUI$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
