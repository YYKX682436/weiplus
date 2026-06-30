package u94;

/* loaded from: classes4.dex */
public class g implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f425859d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f425860e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f425861f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f425862g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ u94.p f425863h;

    public g(u94.p pVar, java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17) {
        this.f425863h = pVar;
        this.f425859d = str;
        this.f425860e = str2;
        this.f425861f = snsInfo;
        this.f425862g = i17;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public void onDismiss() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDismiss", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController$1");
        com.tencent.mars.xlog.Log.i("HalfSubscribeController", "onDismiss");
        u94.p pVar = this.f425863h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController");
        boolean z17 = pVar.f425883a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController");
        if (!z17) {
            o94.c.b(this.f425861f, this.f425862g, new com.tencent.mm.plugin.sns.storage.x2(this.f425859d, this.f425860e, 0, -1));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDismiss", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController$1");
    }
}
