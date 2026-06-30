package wc4;

/* loaded from: classes3.dex */
public final class d implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f444517a;

    public d(java.lang.String str) {
        this.f444517a = str;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDynamicParams", "com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView$publishSuccess$2$1");
        java.util.Map k17 = kz5.c1.k(new jz5.l("sns_tips_status", 3), new jz5.l("sns_feed_id", this.f444517a));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDynamicParams", "com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView$publishSuccess$2$1");
        return k17;
    }
}
