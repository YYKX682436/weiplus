package com.tencent.mm.plugin.nearlife.ui;

/* loaded from: classes.dex */
public class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.nearlife.ui.NearLifeCreatePoiUI f152345d;

    public r(com.tencent.mm.plugin.nearlife.ui.NearLifeCreatePoiUI nearLifeCreatePoiUI) {
        this.f152345d = nearLifeCreatePoiUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/nearlife/ui/NearLifeCreatePoiUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("ui_title", com.tencent.mm.R.string.h9u);
        com.tencent.mm.plugin.nearlife.ui.NearLifeCreatePoiUI nearLifeCreatePoiUI = this.f152345d;
        com.tencent.mm.modelgeo.Addr addr = nearLifeCreatePoiUI.f152269g;
        if (addr != null) {
            intent.putExtra("extra_province", addr.f71213f);
            intent.putExtra("extra_city", nearLifeCreatePoiUI.f152269g.f71214g);
        }
        j45.l.n(nearLifeCreatePoiUI.getContext(), "address", ".ui.WalletMultiRcptSelectUI", intent, 1);
        yj0.a.h(this, "com/tencent/mm/plugin/nearlife/ui/NearLifeCreatePoiUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
