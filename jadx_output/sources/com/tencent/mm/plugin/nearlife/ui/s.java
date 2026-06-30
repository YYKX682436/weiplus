package com.tencent.mm.plugin.nearlife.ui;

/* loaded from: classes.dex */
public class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.nearlife.ui.NearLifeCreatePoiUI f152346d;

    public s(com.tencent.mm.plugin.nearlife.ui.NearLifeCreatePoiUI nearLifeCreatePoiUI) {
        this.f152346d = nearLifeCreatePoiUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/nearlife/ui/NearLifeCreatePoiUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.nearlife.ui.NearLifeCreatePoiUI nearLifeCreatePoiUI = this.f152346d;
        intent.setClass(nearLifeCreatePoiUI.getContext(), com.tencent.mm.plugin.nearlife.ui.SelectPoiCategoryUI.class);
        nearLifeCreatePoiUI.startActivityForResult(intent, 2);
        yj0.a.h(this, "com/tencent/mm/plugin/nearlife/ui/NearLifeCreatePoiUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
