package vu0;

/* loaded from: classes5.dex */
public final class i implements com.tencent.maas.speech.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vu0.k f440095a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f440096b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f440097c;

    public i(vu0.k kVar, java.lang.String str, java.lang.String str2) {
        this.f440095a = kVar;
        this.f440096b = str;
        this.f440097c = str2;
    }

    @Override // com.tencent.maas.speech.d
    public final void a(java.nio.ByteBuffer byteBuffer, com.tencent.maas.instamovie.base.MJError mJError, int i17, int i18) {
        org.json.JSONArray optJSONArray;
        org.json.JSONObject a17 = vu0.k.a(this.f440095a, this.f440096b, byteBuffer, mJError, i17, i18);
        if (a17 != null) {
            java.lang.String str = this.f440097c;
            kotlin.jvm.internal.o.d(str);
            vu0.k kVar = this.f440095a;
            kVar.getClass();
            boolean b17 = kotlin.jvm.internal.o.b(a17.optString("voice_id"), str);
            java.lang.String str2 = this.f440096b;
            vu0.h hVar = kVar.f440110e;
            if (b17) {
                hVar.c(str2, vu0.u.f440163h);
            }
            org.json.JSONObject optJSONObject = a17.optJSONObject(com.tencent.tinker.loader.shareutil.ShareConstants.RES_PATH);
            org.json.JSONObject optJSONObject2 = (optJSONObject == null || (optJSONArray = optJSONObject.optJSONArray("sentences")) == null) ? null : optJSONArray.optJSONObject(0);
            java.util.List a18 = optJSONObject2 != null ? ru0.a.a(optJSONObject2, false) : kz5.p0.f313996d;
            a18.toString();
            hVar.a(str2, a18, true);
        }
    }
}
