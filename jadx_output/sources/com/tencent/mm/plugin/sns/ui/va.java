package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class va implements za4.q1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f170625a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f170626b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI f170627c;

    public va(com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI snsAdNativeLandingPagesPreviewUI, android.view.View view, android.content.Intent intent) {
        this.f170627c = snsAdNativeLandingPagesPreviewUI;
        this.f170625a = view;
        this.f170626b = intent;
    }

    public int a(boolean z17, java.lang.String str) {
        android.content.Intent intent = this.f170626b;
        com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI snsAdNativeLandingPagesPreviewUI = this.f170627c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI$2");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getUxCanvasInfo, isSucc=");
        sb6.append(z17);
        sb6.append(", canvasId=, canvasId, xml.len=");
        sb6.append(str == null ? 0 : str.length());
        com.tencent.mars.xlog.Log.i("SnsAdNativeLandingPagesPreviewUI", sb6.toString());
        try {
            android.view.View view = this.f170625a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesPreviewUI$2", "callback", "(ZLjava/lang/String;)I", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesPreviewUI$2", "callback", "(ZLjava/lang/String;)I", "android/view/View_EXEC_", "setVisibility", "(I)V");
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
                    com.tencent.mars.xlog.Log.e("SnsAdNativeLandingPagesPreviewUI", "protectOverSizeXml failed_3");
                    snsAdNativeLandingPagesPreviewUI.finish();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI$2");
                    return 0;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
                snsAdNativeLandingPagesPreviewUI.W6(intent, str);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAdNativeLandingPagesPreviewUI", "getUxCanvasInfo, exp=" + th6.toString());
        }
        snsAdNativeLandingPagesPreviewUI.finish();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI$2");
        return 0;
    }
}
