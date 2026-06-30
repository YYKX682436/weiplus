package ru0;

/* loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f399694d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONArray f399695e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f399696f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f399697g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f399698h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f399699i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(boolean z17, org.json.JSONArray jSONArray, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.ArrayList arrayList) {
        super(2);
        this.f399694d = z17;
        this.f399695e = jSONArray;
        this.f399696f = str;
        this.f399697g = str2;
        this.f399698h = str3;
        this.f399699i = arrayList;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ru0.n nVar;
        int intValue = ((java.lang.Number) obj).intValue();
        org.json.JSONObject word = (org.json.JSONObject) obj2;
        kotlin.jvm.internal.o.g(word, "word");
        boolean z17 = false;
        if (!this.f399694d || word.optBoolean("stable_flag", false)) {
            org.json.JSONArray jSONArray = this.f399695e;
            int length = jSONArray.length();
            ru0.o oVar = new ru0.o(jSONArray);
            java.lang.String optString = word.optString(this.f399696f);
            long optLong = word.optLong(this.f399697g, 0L);
            long optLong2 = word.optLong(this.f399698h, 0L);
            kotlin.jvm.internal.o.d(optString);
            if (!(optString.length() > 0) || optLong2 < optLong) {
                nVar = null;
            } else {
                if (intValue > 0 && ru0.t.d(optString)) {
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(intValue - 1);
                    if (intValue != length - 1) {
                        intValue++;
                    }
                    java.lang.Iterable iterable = (java.lang.Iterable) oVar.invoke(valueOf, java.lang.Integer.valueOf(intValue));
                    if (!(iterable instanceof java.util.Collection) || !((java.util.Collection) iterable).isEmpty()) {
                        java.util.Iterator it = iterable.iterator();
                        while (it.hasNext()) {
                            if (!ru0.t.d((java.lang.String) it.next())) {
                                break;
                            }
                        }
                    }
                    z17 = true;
                    if (z17) {
                        nVar = new ru0.n(" ".concat(optString), optLong, optLong2);
                    }
                }
                nVar = new ru0.n(optString, optLong, optLong2);
            }
            if (nVar != null) {
                this.f399699i.add(nVar);
            }
        }
        return jz5.f0.f302826a;
    }
}
