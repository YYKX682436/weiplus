package ru0;

/* loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONArray f399693d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(org.json.JSONArray jSONArray) {
        super(2);
        this.f399693d = jSONArray;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        org.json.JSONArray jSONArray = this.f399693d;
        java.lang.String optString = jSONArray.optJSONObject(intValue).optString(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT);
        kotlin.jvm.internal.o.f(optString, "optString(...)");
        java.lang.String optString2 = jSONArray.optJSONObject(intValue2).optString(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT);
        kotlin.jvm.internal.o.f(optString2, "optString(...)");
        return kz5.c0.i(optString, optString2);
    }
}
