package i94;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final h94.a f289763a;

    public c(h94.a foldAdInfo) {
        kotlin.jvm.internal.o.g(foldAdInfo, "foldAdInfo");
        this.f289763a = foldAdInfo;
    }

    public final android.content.Intent a() {
        r45.gr0 gr0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getComplaintIntent", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackData");
        h94.a aVar = this.f289763a;
        r45.d43 b17 = aVar.b();
        java.lang.String str = (b17 == null || (gr0Var = b17.f372082r) == null) ? null : gr0Var.f375492d;
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mars.xlog.Log.e("WsFoldAdFeedbackData", "there is feedback item, but no url!!!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getComplaintIntent", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackData");
            return null;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("useJs", true);
        intent.putExtra("KPublisherId", "sns_" + aVar.c());
        intent.putExtra("prePublishId", "sns_" + aVar.c());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getComplaintIntent", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackData");
        return intent;
    }
}
