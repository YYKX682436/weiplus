package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class ua implements za4.r1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f170570a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f170571b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f170572c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI f170573d;

    public ua(com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI snsAdNativeLandingPagesPreviewUI, long j17, android.view.View view, android.content.Intent intent) {
        this.f170573d = snsAdNativeLandingPagesPreviewUI;
        this.f170570a = j17;
        this.f170571b = view;
        this.f170572c = intent;
    }

    @Override // za4.r1
    public int a(boolean z17, java.lang.String str, java.util.Map map) {
        android.content.Intent intent = this.f170572c;
        com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI snsAdNativeLandingPagesPreviewUI = this.f170573d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI$1");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getAdCanvasInfo, isSucc=");
        sb6.append(z17);
        sb6.append(", pageId=");
        sb6.append(this.f170570a);
        sb6.append(", xml.len=");
        sb6.append(str == null ? 0 : str.length());
        com.tencent.mars.xlog.Log.i("SnsAdNativeLandingPagesPreviewUI", sb6.toString());
        try {
            android.view.View view = this.f170571b;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesPreviewUI$1", "callback", "(ZLjava/lang/String;Ljava/util/Map;)I", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesPreviewUI$1", "callback", "(ZLjava/lang/String;Ljava/util/Map;)I", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (android.text.TextUtils.isEmpty(str)) {
                int i17 = com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI.f166678h;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
                boolean z18 = snsAdNativeLandingPagesPreviewUI.f166680e;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
                if (z18) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
                    boolean z19 = snsAdNativeLandingPagesPreviewUI.f166681f;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
                    if (!z19) {
                        n54.i.d(false);
                    }
                }
            } else {
                intent.putExtra("sns_landing_pages_xml", str);
                int i18 = com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI.f166678h;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
                boolean Z6 = snsAdNativeLandingPagesPreviewUI.Z6(intent, str);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
                if (!Z6) {
                    com.tencent.mars.xlog.Log.e("SnsAdNativeLandingPagesPreviewUI", "protectOverSizeXml failed_2");
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1898, 21);
                    snsAdNativeLandingPagesPreviewUI.finish();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI$1");
                    return 0;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
                snsAdNativeLandingPagesPreviewUI.W6(intent, str);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAdNativeLandingPagesPreviewUI", "getAdCanvasInfo, exp=" + th6.toString());
        }
        snsAdNativeLandingPagesPreviewUI.finish();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI$1");
        return 0;
    }
}
