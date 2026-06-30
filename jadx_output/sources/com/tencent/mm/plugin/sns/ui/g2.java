package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final class g2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.h2 f168396d;

    public g2(com.tencent.mm.plugin.sns.ui.h2 h2Var) {
        this.f168396d = h2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.ExceprtWidget$initView$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/ExceprtWidget$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        com.tencent.mm.plugin.sns.ui.h2 h2Var = this.f168396d;
        java.lang.String o17 = com.tencent.mm.plugin.sns.ui.h2.o(h2Var);
        if (o17 == null) {
            kotlin.jvm.internal.o.o(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
            throw null;
        }
        arrayList2.add(o17);
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(h2Var.f169957c, com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI.class);
        intent.putExtra("sns_gallery_position", 0);
        intent.putExtra("sns_gallery_temp_paths", arrayList2);
        intent.putExtra("key_from_scene", 7);
        intent.putExtra("k_need_delete", h2Var.f169957c.getIntent().getBooleanExtra("k_need_delete", true));
        h2Var.f169957c.startActivityForResult(intent, 7);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/ExceprtWidget$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.ExceprtWidget$initView$2");
    }
}
