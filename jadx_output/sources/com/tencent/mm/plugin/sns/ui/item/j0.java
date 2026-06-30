package com.tencent.mm.plugin.sns.ui.item;

/* loaded from: classes4.dex */
public class j0 implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.PhotosContent f169355a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.ADXml f169356b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.view.View f169357c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.item.m0 f169358d;

    public j0(com.tencent.mm.plugin.sns.ui.item.m0 m0Var, com.tencent.mm.plugin.sns.ui.PhotosContent photosContent, com.tencent.mm.plugin.sns.storage.ADXml aDXml, android.view.View view) {
        this.f169358d = m0Var;
        this.f169355a = photosContent;
        this.f169356b = aDXml;
        this.f169357c = view;
    }

    @Override // za4.e0
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem$2");
    }

    @Override // za4.e0
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem$2");
    }

    @Override // za4.e0
    public void c(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem$2");
        com.tencent.mm.plugin.sns.ui.MaskImageView maskImageView = (com.tencent.mm.plugin.sns.ui.MaskImageView) this.f169355a.findViewById(com.tencent.mm.R.id.jdt);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem");
        com.tencent.mm.plugin.sns.ui.item.m0 m0Var = this.f169358d;
        m0Var.f169381r = maskImageView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem");
        if (com.tencent.mm.plugin.sns.ui.item.m0.F(m0Var) != null) {
            com.tencent.mm.plugin.sns.ui.item.m0.F(m0Var).setVisibility(0);
            com.tencent.mm.plugin.sns.ui.item.m0.F(m0Var).setImageBitmap(com.tencent.mm.sdk.platformtools.x.J(str, null));
            com.tencent.mm.plugin.sns.storage.ADXml aDXml = this.f169356b;
            float o17 = za4.z0.o(aDXml.adMediaIconWidth, 1, aDXml.adBasicRemWidth, aDXml.adBasicRootFontSize);
            float o18 = za4.z0.o(aDXml.adMediaIconHeight, 1, aDXml.adBasicRemWidth, aDXml.adBasicRootFontSize);
            float o19 = za4.z0.o(aDXml.adMediaIconPaddingRight, 1, aDXml.adBasicRemWidth, aDXml.adBasicRootFontSize);
            float o27 = za4.z0.o(aDXml.adMediaIconPaddingBottom, 1, aDXml.adBasicRemWidth, aDXml.adBasicRootFontSize);
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams((int) o17, (int) o18);
            android.view.View view = this.f169357c;
            layoutParams.setMargins((int) ((view.getRight() - o19) - o17), (int) ((view.getBottom() - o27) - o18), 0, 0);
            com.tencent.mm.plugin.sns.ui.item.m0.F(m0Var).setLayoutParams(layoutParams);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem$2");
    }
}
