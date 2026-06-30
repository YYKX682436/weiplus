package ws0;

/* loaded from: classes10.dex */
public final class c implements com.tencent.mm.hardcoder.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ws0.g f448958a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.a f448959b;

    public c(ws0.g gVar, yz5.a aVar) {
        this.f448958a = gVar;
        this.f448959b = aVar;
    }

    @Override // com.tencent.mm.hardcoder.a
    public final void onGetParameters(int i17, org.json.JSONObject jSONObject) {
        if (i17 == 2) {
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("CameraRequestTags");
            ws0.g gVar = this.f448958a;
            gVar.f448967c = optJSONArray;
            gVar.f448968d = jSONObject.optJSONArray("CameraResultTags");
            gVar.f448969e = jSONObject.optJSONArray("CaptureSessionType");
            this.f448959b.invoke();
        }
    }
}
