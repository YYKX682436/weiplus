package wd4;

/* loaded from: classes4.dex */
public final class r2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog f445018d;

    public r2(com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog snsGroupDialog) {
        this.f445018d = snsGroupDialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$initView$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/sheet/SnsGroupDialog$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog.M;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$jumpToSnsLabelUI", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog snsGroupDialog = this.f445018d;
        snsGroupDialog.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("jumpToSnsLabelUI", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        snsGroupDialog.H = true;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("jumpToSnsLabelUI mLocalId:");
        int i18 = snsGroupDialog.f170462s;
        sb6.append(i18);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsGroupDialog", sb6.toString());
        gc4.k kVar = gc4.k.f270459a;
        android.content.Context context = snsGroupDialog.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        kVar.a(context, i18, snsGroupDialog.f170464u);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpToSnsLabelUI", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$jumpToSnsLabelUI", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        snsGroupDialog.dismiss();
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/sheet/SnsGroupDialog$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$initView$1");
    }
}
