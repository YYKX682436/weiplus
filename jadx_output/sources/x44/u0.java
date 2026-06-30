package x44;

/* loaded from: classes4.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w44.b f451892d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f451893e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f451894f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f451895g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f451896h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f451897i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f451898m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f451899n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f451900o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ x44.v0 f451901p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(w44.b bVar, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, x44.v0 v0Var) {
        super(2);
        this.f451892d = bVar;
        this.f451893e = str;
        this.f451894f = str2;
        this.f451895g = str3;
        this.f451896h = i17;
        this.f451897i = str4;
        this.f451898m = str5;
        this.f451899n = str6;
        this.f451900o = str7;
        this.f451901p = v0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenBusinessChat$doAction$2");
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String subBizName = (java.lang.String) obj2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenBusinessChat$doAction$2");
        kotlin.jvm.internal.o.g(subBizName, "subBizName");
        if (intValue == 0) {
            x44.y2 y2Var = x44.y2.f451936a;
            android.app.Activity a17 = this.f451892d.a();
            java.lang.String username = this.f451893e;
            kotlin.jvm.internal.o.f(username, "$username");
            java.lang.String appId = this.f451894f;
            kotlin.jvm.internal.o.f(appId, "$appId");
            java.lang.String sessionFrom = this.f451895g;
            kotlin.jvm.internal.o.f(sessionFrom, "$sessionFrom");
            int i17 = this.f451896h;
            java.lang.String sendMessageTitle = this.f451897i;
            kotlin.jvm.internal.o.f(sendMessageTitle, "$sendMessageTitle");
            java.lang.String sendMessagePath = this.f451898m;
            kotlin.jvm.internal.o.f(sendMessagePath, "$sendMessagePath");
            java.lang.String sendMessageImg = this.f451899n;
            kotlin.jvm.internal.o.f(sendMessageImg, "$sendMessageImg");
            y2Var.a(a17, username, appId, sessionFrom, i17, sendMessageTitle, sendMessagePath, sendMessageImg, this.f451900o, subBizName);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$makeReturnOK", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenBusinessChat");
            x44.v0 v0Var = this.f451901p;
            org.json.JSONObject l17 = v0Var.l();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$makeReturnOK", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenBusinessChat");
            v0Var.b(l17);
        } else {
            com.tencent.mars.xlog.Log.e("SnsAdJs.ServiceChat", "the service chat code is " + intValue);
            x44.v0 v0Var2 = this.f451901p;
            v0Var2.b(w44.d.k(v0Var2, 300001, ": the service chat error code is " + intValue, null, 4, null));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenBusinessChat$doAction$2");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenBusinessChat$doAction$2");
        return f0Var;
    }
}
