package com.tencent.mm.plugin.sns.ui.item;

/* loaded from: classes4.dex */
public class e implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder f169327a;

    public e(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem baseTimeLineItem, com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        this.f169327a = baseViewHolder;
    }

    @Override // za4.e0
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$5");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$5");
    }

    @Override // za4.e0
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$5");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$5");
    }

    @Override // za4.e0
    public void c(java.lang.String str) {
        android.graphics.Bitmap b17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$5");
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseTimeLineItem", "download img %s", str);
        com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder = this.f169327a;
        java.lang.String str2 = (java.lang.String) baseViewHolder.f169274i.getTag(com.tencent.mm.R.id.nae);
        if (!com.tencent.mm.sdk.platformtools.t8.N0(str2, str) && str.equals(za4.t0.l("adId", str2)) && (b17 = i64.m1.f289238c.b(str)) != null) {
            baseViewHolder.f169274i.setImageBitmap(b17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$5");
    }
}
