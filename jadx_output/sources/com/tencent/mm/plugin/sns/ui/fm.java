package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class fm implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.jm f168351d;

    public fm(com.tencent.mm.plugin.sns.ui.bm bmVar, com.tencent.mm.plugin.sns.ui.jm jmVar) {
        this.f168351d = jmVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View view;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter$4");
        com.tencent.mm.plugin.sns.ui.jm jmVar = this.f168351d;
        android.widget.TextView textView = jmVar.f169524c;
        if (textView != null && jmVar.f169525d != null && (view = (android.view.View) textView.getParent()) != null) {
            android.widget.TextView textView2 = jmVar.f169524c;
            android.widget.TextView textView3 = jmVar.f169525d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("executeFoldingLogic", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper");
            ad4.c0.f3175a.a(view, textView2, textView3, 0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("executeFoldingLogic", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter$4");
    }
}
