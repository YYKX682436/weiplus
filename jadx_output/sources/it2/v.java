package it2;

/* loaded from: classes3.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ it2.x f294521d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f294522e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f294523f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f294524g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f294525h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f294526i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(it2.x xVar, yz5.l lVar, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17) {
        super(0);
        this.f294521d = xVar;
        this.f294522e = lVar;
        this.f294523f = str;
        this.f294524g = str2;
        this.f294525h = str3;
        this.f294526i = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        it2.x xVar = this.f294521d;
        xVar.Ai();
        java.lang.String Bi = xVar.Bi();
        yz5.l lVar = this.f294522e;
        if (Bi == null) {
            lVar.invoke(rs5.h.f399361i);
        } else {
            int andIncrement = it2.x.f294528s.getAndIncrement();
            xVar.f294538o.put(andIncrement, lVar);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start prepare resource ");
            java.lang.String str = this.f294523f;
            sb6.append(str);
            sb6.append(" with url: ");
            java.lang.String str2 = this.f294524g;
            sb6.append(str2);
            sb6.append(", md5: ");
            java.lang.String str3 = this.f294525h;
            sb6.append(str3);
            sb6.append(", callbackId: ");
            sb6.append(andIncrement);
            com.tencent.mars.xlog.Log.i("MagicRewardFeatureService", sb6.toString());
            java.lang.String jSONObject = new org.json.JSONObject(kz5.c1.k(new jz5.l("resourceName", str), new jz5.l("url", str2), new jz5.l("md5", str3), new jz5.l("force", java.lang.Boolean.valueOf(this.f294526i)), new jz5.l("callbackId", java.lang.Integer.valueOf(andIncrement)))).toString();
            kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
            xVar.wi("OnPrepareResource", jSONObject);
        }
        return jz5.f0.f302826a;
    }
}
