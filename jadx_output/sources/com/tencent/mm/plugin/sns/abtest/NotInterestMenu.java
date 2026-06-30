package com.tencent.mm.plugin.sns.abtest;

/* loaded from: classes4.dex */
public class NotInterestMenu extends android.widget.LinearLayout {

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f162560f = {com.tencent.mm.R.string.jaq, com.tencent.mm.R.string.jao, com.tencent.mm.R.string.jap};

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f162561d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f162562e;

    public NotInterestMenu(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f162562e = null;
        this.f162562e = context;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.abtest.NotInterestMenu");
        com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.f489351c83, this);
        android.widget.ListView listView = (android.widget.ListView) findViewById(com.tencent.mm.R.id.kdw);
        this.f162561d = listView;
        listView.setAdapter((android.widget.ListAdapter) new com.tencent.mm.plugin.sns.abtest.d(this));
        this.f162561d.setOnItemClickListener(new com.tencent.mm.plugin.sns.abtest.b(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.abtest.NotInterestMenu");
    }

    public void setOnClickMenuListener(com.tencent.mm.plugin.sns.abtest.e eVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnClickMenuListener", "com.tencent.mm.plugin.sns.abtest.NotInterestMenu");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnClickMenuListener", "com.tencent.mm.plugin.sns.abtest.NotInterestMenu");
    }

    public void setOnSelectMenuItemListener(com.tencent.mm.plugin.sns.abtest.f fVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnSelectMenuItemListener", "com.tencent.mm.plugin.sns.abtest.NotInterestMenu");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnSelectMenuItemListener", "com.tencent.mm.plugin.sns.abtest.NotInterestMenu");
    }

    public void setSnsInfo(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsInfo", "com.tencent.mm.plugin.sns.abtest.NotInterestMenu");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsInfo", "com.tencent.mm.plugin.sns.abtest.NotInterestMenu");
    }
}
