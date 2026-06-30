package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class l3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.o3 f169727d;

    public l3(com.tencent.mm.plugin.sns.ui.o3 o3Var) {
        this.f169727d = o3Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.GalleryFooter$5");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/GalleryFooter$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.sns.ui.o3 o3Var = this.f169727d;
        if (com.tencent.mm.plugin.sns.ui.o3.d(o3Var) != null) {
            ((com.tencent.mm.plugin.sns.ui.d0) com.tencent.mm.plugin.sns.ui.o3.d(o3Var)).getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onRemoveItem", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI$3");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onRemoveItem", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI$3");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/GalleryFooter$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.GalleryFooter$5");
    }
}
