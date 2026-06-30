package ut2;

/* loaded from: classes3.dex */
public final class w0 extends st2.h2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f431133d;

    /* renamed from: e, reason: collision with root package name */
    public final cm2.m0 f431134e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(java.lang.ref.WeakReference holderRef, cm2.m0 item, com.tencent.mm.plugin.finder.live.view.k0 k0Var, java.lang.String appId) {
        super(k0Var, appId);
        kotlin.jvm.internal.o.g(holderRef, "holderRef");
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(appId, "appId");
        this.f431133d = holderRef;
        this.f431134e = item;
    }

    @Override // st2.h2, android.webkit.ValueCallback
    /* renamed from: a */
    public void onReceiveValue(java.lang.String data) {
        kotlin.jvm.internal.o.g(data, "data");
        super.onReceiveValue(data);
        try {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            org.json.JSONObject jSONObject = new org.json.JSONObject(data);
            jSONObject.optString("img_url");
            java.lang.String optString = jSONObject.optString("result");
            java.lang.String optString2 = jSONObject.optString("msg");
            if (optString2.length() == 0) {
                optString2 = context.getString(com.tencent.mm.R.string.f491440d36);
            }
            if (!kotlin.jvm.internal.o.b(optString, ya.b.SUCCESS)) {
                if (kotlin.jvm.internal.o.b(optString, "failure")) {
                    db5.t7.g(context, optString2);
                }
            } else {
                ut2.s3 s3Var = (ut2.s3) this.f431133d.get();
                if (s3Var != null) {
                    s3Var.Q(this.f431134e);
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(this.f412356a, e17, "parse data " + data + " failed", new java.lang.Object[0]);
        }
    }
}
