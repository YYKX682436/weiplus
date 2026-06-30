package tp0;

/* loaded from: classes7.dex */
public final class a implements jc3.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tp0.c f421006a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f421007b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f421008c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jc3.m f421009d;

    public a(tp0.c cVar, java.lang.Object obj, org.json.JSONObject jSONObject, jc3.m mVar) {
        this.f421006a = cVar;
        this.f421007b = obj;
        this.f421008c = jSONObject;
        this.f421009d = mVar;
    }

    @Override // jc3.k
    public void a(lc3.z errInfo, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(errInfo, "errInfo");
        tp0.c cVar = this.f421006a;
        cVar.u(errInfo);
        cVar.y(this.f421007b, this.f421008c, this.f421009d);
    }
}
