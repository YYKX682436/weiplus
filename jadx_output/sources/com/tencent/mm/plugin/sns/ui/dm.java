package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class dm implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.bm f168200d;

    public dm(com.tencent.mm.plugin.sns.ui.bm bmVar) {
        this.f168200d = bmVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsMsgUI$SnsMsgAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.sns.ui.bm bmVar = this.f168200d;
        ((com.tencent.mm.plugin.sns.ui.cm) bmVar.f167961v).b();
        db5.e6 e6Var = bmVar.f167958s;
        if (e6Var != null) {
            e6Var.a(view.getTag());
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsMsgUI$SnsMsgAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter$2");
    }
}
