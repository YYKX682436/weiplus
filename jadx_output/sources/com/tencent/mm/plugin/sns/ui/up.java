package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class up implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.TimeLineObject f170590d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f170591e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI f170592f;

    public up(com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI snsSightPlayerUI, com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject, java.lang.String str) {
        this.f170592f = snsSightPlayerUI;
        this.f170590d = timeLineObject;
        this.f170591e = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsSightPlayerUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i64.o1 o1Var = i64.o1.Sight;
        int i17 = o1Var.f289269d;
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = this.f170590d;
        com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI snsSightPlayerUI = this.f170592f;
        if (i17 != 0) {
            i64.s1.b(i64.n1.DetailInVideo, timeLineObject.Id, com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI.T6(snsSightPlayerUI) == null ? "" : com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI.T6(snsSightPlayerUI).uxInfo, 1, o1Var.f289269d, timeLineObject.UserName, null, timeLineObject.Id, 0L, 0, 0);
        }
        android.content.Intent intent = new android.content.Intent();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("key_snsad_statextstr", timeLineObject.statExtStr);
        com.tencent.mm.plugin.sns.storage.ADInfo T6 = com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI.T6(snsSightPlayerUI);
        java.lang.String str = this.f170591e;
        if (T6 != null) {
            str = ca4.z0.b(str, com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI.T6(snsSightPlayerUI).uxInfo);
        }
        intent.putExtra("jsapiargs", bundle);
        intent.putExtra("rawUrl", str);
        intent.putExtra("useJs", true);
        ca4.z0.x0(new com.tencent.mm.modelsns.SnsAdClick(com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI.U6(snsSightPlayerUI), 5, com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI.a7(snsSightPlayerUI).field_snsId, 18, 0));
        new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new com.tencent.mm.plugin.sns.ui.tp(this, intent));
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsSightPlayerUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$2");
    }
}
