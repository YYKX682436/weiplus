package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes5.dex */
public class k1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI f138092d;

    public k1(com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI fTSBaseVoiceSearchUI) {
        this.f138092d = fTSBaseVoiceSearchUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI fTSBaseVoiceSearchUI = this.f138092d;
        android.view.View view = fTSBaseVoiceSearchUI.C;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSBaseVoiceSearchUI$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/FTSBaseVoiceSearchUI$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        fTSBaseVoiceSearchUI.f137922o.setVisibility(0);
    }
}
