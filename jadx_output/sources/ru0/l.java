package ru0;

/* loaded from: classes5.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f399686d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f399687e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f399688f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(long j17, float f17, java.util.ArrayList arrayList) {
        super(1);
        this.f399686d = j17;
        this.f399687e = f17;
        this.f399688f = arrayList;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        org.json.JSONObject sentence = (org.json.JSONObject) obj;
        kotlin.jvm.internal.o.g(sentence, "sentence");
        java.lang.String optString = sentence.optString("langid_lang");
        org.json.JSONArray optJSONArray = sentence.optJSONArray("sents");
        kotlin.jvm.internal.o.d(optString);
        if (optString.length() > 0) {
            if (optJSONArray != null) {
                kotlin.jvm.internal.o.d(optJSONArray);
                c75.c.d(optJSONArray, new ru0.k(this.f399686d, this.f399687e, optString, this.f399688f));
            }
        }
        return jz5.f0.f302826a;
    }
}
