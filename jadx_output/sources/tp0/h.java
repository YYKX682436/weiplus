package tp0;

/* loaded from: classes7.dex */
public final class h implements jc3.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tp0.i f421017a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f421018b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f421019c;

    public h(tp0.i iVar, java.lang.Object obj, org.json.JSONObject jSONObject) {
        this.f421017a = iVar;
        this.f421018b = obj;
        this.f421019c = jSONObject;
    }

    @Override // jc3.k
    public void a(lc3.z errInfo, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(errInfo, "errInfo");
        boolean b17 = kotlin.jvm.internal.o.b(errInfo, lc3.x.f317934a);
        tp0.i iVar = this.f421017a;
        if (b17) {
            iVar.getClass();
            java.lang.Object view = this.f421018b;
            kotlin.jvm.internal.o.g(view, "view");
            org.json.JSONObject data = this.f421019c;
            kotlin.jvm.internal.o.g(data, "data");
        }
        iVar.u(errInfo);
    }
}
