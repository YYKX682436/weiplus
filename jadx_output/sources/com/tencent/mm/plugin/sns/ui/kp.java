package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes.dex */
public class kp implements com.tencent.mm.plugin.sns.ui.lp {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f169645a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f169646b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View.OnClickListener f169647c;

    public kp(com.tencent.mm.plugin.sns.ui.SnsSettingUI snsSettingUI, java.lang.String str, java.lang.String str2, android.view.View.OnClickListener onClickListener) {
        this.f169645a = null;
        this.f169646b = null;
        this.f169647c = null;
        this.f169645a = str;
        this.f169646b = str2;
        this.f169647c = onClickListener;
    }

    @Override // com.tencent.mm.plugin.sns.ui.lp
    public java.lang.String a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "com.tencent.mm.plugin.sns.ui.SnsSettingUI$ClickItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "com.tencent.mm.plugin.sns.ui.SnsSettingUI$ClickItem");
        return this.f169645a;
    }

    @Override // com.tencent.mm.plugin.sns.ui.lp
    public void b(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showAlert", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$ClickItem");
        this.f169647c.onClick(view);
        db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "ClickItem Done", 1).show();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showAlert", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$ClickItem");
    }

    @Override // com.tencent.mm.plugin.sns.ui.lp
    public java.lang.String value() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("value", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$ClickItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("value", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$ClickItem");
        return this.f169646b;
    }
}
