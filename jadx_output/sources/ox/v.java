package ox;

/* loaded from: classes11.dex */
public final class v implements rv.e3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rv.e3 f349523a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l81.b1 f349524b;

    public v(rv.e3 e3Var, l81.b1 b1Var) {
        this.f349523a = e3Var;
        this.f349524b = b1Var;
    }

    @Override // rv.e3
    public final void a(com.tencent.pigeon.biz.BizPublishResultPiegonInfo bizPublishResultPiegonInfo, org.json.JSONObject jSONObject) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BizPublishRichEditorService", "launchNewImageEditorWithOpenBundle done, publish result: " + bizPublishResultPiegonInfo.getSuccess());
        rv.e3 e3Var = this.f349523a;
        if (e3Var != null) {
            e3Var.a(bizPublishResultPiegonInfo, jSONObject);
            return;
        }
        android.webkit.ValueCallback valueCallback = this.f349524b.f317037o;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(jSONObject.toString());
        }
    }
}
