package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes.dex */
public class SnsNotifyBanner extends android.widget.RelativeLayout {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f167307f = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f167308d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f167309e;

    public SnsNotifyBanner(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        a();
    }

    public final void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.SnsNotifyBanner");
        android.view.View inflate = ((android.view.LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(com.tencent.mm.R.layout.csw, (android.view.ViewGroup) this, true);
        this.f167308d = inflate;
        this.f167309e = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.n6p);
        ((android.widget.ImageView) this.f167308d.findViewById(com.tencent.mm.R.id.n6o)).setOnClickListener(new com.tencent.mm.plugin.sns.ui.en(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.SnsNotifyBanner");
    }

    public void setOnClickNotify(com.tencent.mm.plugin.sns.ui.gn gnVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnClickNotify", "com.tencent.mm.plugin.sns.ui.SnsNotifyBanner");
        this.f167309e.setOnClickListener(new com.tencent.mm.plugin.sns.ui.fn(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnClickNotify", "com.tencent.mm.plugin.sns.ui.SnsNotifyBanner");
    }

    public SnsNotifyBanner(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }
}
