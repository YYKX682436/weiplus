package yb1;

/* loaded from: classes7.dex */
public final class s implements vh0.i1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.chatbot.JsApiGenRedPackageCover f460680a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f460681b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f460682c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f460683d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vh0.n1 f460684e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f460685f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f460686g;

    public s(com.tencent.mm.plugin.appbrand.jsapi.chatbot.JsApiGenRedPackageCover jsApiGenRedPackageCover, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, java.lang.String str, vh0.n1 n1Var, kotlin.jvm.internal.h0 h0Var, java.lang.String str2) {
        this.f460680a = jsApiGenRedPackageCover;
        this.f460681b = lVar;
        this.f460682c = i17;
        this.f460683d = str;
        this.f460684e = n1Var;
        this.f460685f = h0Var;
        this.f460686g = str2;
    }

    @Override // vh0.i1
    public void onResult(java.lang.Object obj) {
        if (!((java.lang.Boolean) obj).booleanValue()) {
            com.tencent.mm.plugin.appbrand.jsapi.chatbot.JsApiGenRedPackageCover.H(this.f460680a, this.f460681b, this.f460682c, com.tencent.mm.plugin.appbrand.jsapi.chatbot.JsApiGenRedPackageCover.f80280g, null, 8, null);
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putCharSequence("override_session_id", this.f460683d);
        if (((vh0.f3) this.f460684e).aj((android.content.Context) this.f460685f.f310123d, 12, this.f460686g, true, new yb1.r(this.f460680a, this.f460681b, this.f460682c), bundle) == vh0.l1.NOT_A_CHATBOT) {
            com.tencent.mm.plugin.appbrand.jsapi.chatbot.JsApiGenRedPackageCover.H(this.f460680a, this.f460681b, this.f460682c, com.tencent.mm.plugin.appbrand.jsapi.chatbot.JsApiGenRedPackageCover.f80283m, null, 8, null);
        }
    }
}
