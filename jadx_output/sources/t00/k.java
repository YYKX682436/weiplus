package t00;

/* loaded from: classes.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f414303d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c00.n3 f414304e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(java.util.LinkedList linkedList, c00.n3 n3Var) {
        super(0);
        this.f414303d = linkedList;
        this.f414304e = n3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("kvData", "");
        com.tencent.mars.xlog.Log.i("MicroMsg.DeleteEcsSectionDataActionHandler", "onSuccess, sectionList: " + this.f414303d);
        this.f414304e.b(jSONObject);
        return jz5.f0.f302826a;
    }
}
