package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final class s2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.t2 f170440d;

    public s2(com.tencent.mm.plugin.sns.ui.t2 t2Var) {
        this.f170440d = t2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.FinderPicWidget$initView$1$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/FinderPicWidget$initView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.sns.ui.t2 t2Var = this.f170440d;
        intent.setClass(t2Var.f169957c, com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI.class);
        intent.putExtra("k_need_delete", false);
        intent.putExtra("sns_gallery_position", 0);
        intent.putExtra("key_from_scene", 7);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMediaPath$p", "com.tencent.mm.plugin.sns.ui.FinderPicWidget");
        java.lang.String str = t2Var.L;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMediaPath$p", "com.tencent.mm.plugin.sns.ui.FinderPicWidget");
        arrayList2.add(str);
        intent.putExtra("sns_gallery_temp_paths", arrayList2);
        t2Var.f169957c.startActivityForResult(intent, 7);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/FinderPicWidget$initView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.FinderPicWidget$initView$1$1");
    }
}
