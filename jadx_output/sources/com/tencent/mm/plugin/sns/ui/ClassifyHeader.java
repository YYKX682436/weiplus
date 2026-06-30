package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes.dex */
public class ClassifyHeader extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f166252d;

    public ClassifyHeader(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        a(context);
    }

    public final void a(android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.ClassifyHeader");
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.f488610yk, this);
        this.f166252d = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.gyf);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.ClassifyHeader");
    }

    public void setDesc(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setDesc", "com.tencent.mm.plugin.sns.ui.ClassifyHeader");
        this.f166252d.setText(str + "");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDesc", "com.tencent.mm.plugin.sns.ui.ClassifyHeader");
    }

    public ClassifyHeader(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }
}
