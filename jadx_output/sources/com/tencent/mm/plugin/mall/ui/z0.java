package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes9.dex */
public class z0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ef3.d f148518d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mall.ui.MallIndexUI f148519e;

    public z0(com.tencent.mm.plugin.mall.ui.MallIndexUI mallIndexUI, ef3.d dVar) {
        this.f148519e = mallIndexUI;
        this.f148518d = dVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mall/ui/MallIndexUI$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        new android.content.Intent();
        com.tencent.mm.wallet_core.ui.r1.Z(this.f148519e, this.f148518d.f252405a);
        yj0.a.h(this, "com/tencent/mm/plugin/mall/ui/MallIndexUI$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
