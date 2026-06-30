package vc4;

/* loaded from: classes4.dex */
public final class g implements tk.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter f435281a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xc4.p f435282b;

    public g(com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter improveItemFooter, xc4.p pVar) {
        this.f435281a = improveItemFooter;
        this.f435282b = pVar;
    }

    @Override // tk.p
    public void a(boolean z17, java.lang.String err_msg, org.json.JSONObject jSONObject) {
        boolean z18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter$loadBizPostView$callback$1");
        kotlin.jvm.internal.o.g(err_msg, "err_msg");
        if (!kotlin.jvm.internal.o.b("fail", jSONObject != null ? jSONObject.optString("status") : null)) {
            if (u46.l.e(jSONObject != null ? jSONObject.optString("err_msg") : null)) {
                z18 = true;
                java.lang.String str = "postSnsPhotoToBiz: hasClickPost=" + z18 + ", err_msg=" + err_msg + ", extraInfo=" + jSONObject;
                com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter improveItemFooter = this.f435281a;
                com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter.e(improveItemFooter, "MicroMsg.Improve.ItemFooter", str);
                com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter.f(improveItemFooter, this.f435282b, z18);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter$loadBizPostView$callback$1");
            }
        }
        z18 = false;
        java.lang.String str2 = "postSnsPhotoToBiz: hasClickPost=" + z18 + ", err_msg=" + err_msg + ", extraInfo=" + jSONObject;
        com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter improveItemFooter2 = this.f435281a;
        com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter.e(improveItemFooter2, "MicroMsg.Improve.ItemFooter", str2);
        com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter.f(improveItemFooter2, this.f435282b, z18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter$loadBizPostView$callback$1");
    }
}
