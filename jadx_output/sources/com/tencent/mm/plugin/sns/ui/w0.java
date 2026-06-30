package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.AtContactWidget f170728d;

    public w0(com.tencent.mm.plugin.sns.ui.AtContactWidget atContactWidget) {
        this.f170728d = atContactWidget;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.AtContactWidget$2");
        int i17 = (int) (com.tencent.mm.sdk.platformtools.x.l0().density * 36.0f);
        if (i17 != 0) {
            int i18 = com.tencent.mm.plugin.sns.ui.AtContactWidget.f166238p;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
            com.tencent.mm.plugin.sns.ui.AtContactWidget atContactWidget = this.f170728d;
            android.view.View view = atContactWidget.f166240e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
            int width = view.getWidth();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = atContactWidget.f166241f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
            int width2 = width - weImageView.getWidth();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
            android.widget.TextView textView = atContactWidget.f166243h;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
            int width3 = ((width2 - textView.getWidth()) - ((int) (com.tencent.mm.sdk.platformtools.x.l0().density * 32.0f))) / i17;
            if (width3 > 0 && width3 < 5) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
                com.tencent.mm.plugin.sns.ui.PreviewContactView previewContactView = atContactWidget.f166244i;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
                previewContactView.setLineNum(width3);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
                com.tencent.mm.plugin.sns.ui.PreviewContactView previewContactView2 = atContactWidget.f166244i;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
                android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) previewContactView2.getLayoutParams();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
                com.tencent.mm.plugin.sns.ui.PreviewContactView previewContactView3 = atContactWidget.f166244i;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
                previewContactView3.setLayoutParams(layoutParams);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.AtContactWidget$2");
    }
}
