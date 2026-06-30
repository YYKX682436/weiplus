package com.tencent.mm.plugin.sns.ui.item;

/* loaded from: classes.dex */
public class y0 implements xd4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.item.z0 f169431a;

    public y0(com.tencent.mm.plugin.sns.ui.item.z0 z0Var) {
        this.f169431a = z0Var;
    }

    @Override // xd4.e0
    public void a(java.lang.String str) {
        android.view.View view;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem$6");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
        com.tencent.mm.plugin.sns.ui.item.z0 z0Var = this.f169431a;
        java.lang.String str2 = z0Var.f169438w;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoTimeLineItem", "onDestroy UICallback %s, %s", str, str2);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
            java.lang.String str3 = z0Var.f169438w;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
            if (str.equals(str3) && (view = z0Var.f169439x) != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/item/VideoTimeLineItem$6", "onDestroy", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/item/VideoTimeLineItem$6", "onDestroy", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.tencent.mars.xlog.Log.i("MicroMsg.VideoTimeLineItem", "onDestroy show videoStatusIv");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem$6");
    }
}
