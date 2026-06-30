package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes11.dex */
public class xr implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI f171583d;

    public xr(com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI snsTagPartlyUI) {
        this.f171583d = snsTagPartlyUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$5");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsTagPartlyUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI snsTagPartlyUI = this.f171583d;
        if (com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI.T6(snsTagPartlyUI) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsTagPartlyUI", "The adapter is null..");
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsTagPartlyUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$5");
            return;
        }
        java.lang.Object tag = view.getTag();
        if (tag == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsTagPartlyUI", "The tag is null..");
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsTagPartlyUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$5");
        } else {
            if (!(tag instanceof java.lang.Integer)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SnsTagPartlyUI", "The tag is not a instance of Integer.");
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsTagPartlyUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$5");
                return;
            }
            com.tencent.mm.plugin.sns.storage.q2 q2Var = (com.tencent.mm.plugin.sns.storage.q2) com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI.T6(snsTagPartlyUI).getItem(((java.lang.Integer) tag).intValue());
            com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI snsTagPartlyUI2 = this.f171583d;
            snsTagPartlyUI2.f167456f = db5.e1.Q(snsTagPartlyUI2, null, null, true, true, new com.tencent.mm.plugin.sns.ui.wr(this));
            gm0.j1.i();
            gm0.j1.n().f273288b.g(new com.tencent.mm.plugin.sns.model.f3(3, q2Var.field_tagId, q2Var.field_tagName));
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsTagPartlyUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$5");
        }
    }
}
