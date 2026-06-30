package vq4;

/* loaded from: classes12.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rh.c1 f439382d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(rh.c1 c1Var) {
        super(1);
        this.f439382d = c1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        org.json.JSONObject subJson = (org.json.JSONObject) obj;
        kotlin.jvm.internal.o.g(subJson, "$this$subJson");
        qh.b bVar = this.f439382d.f395330l;
        subJson.put("fg", bVar != null ? java.lang.Integer.valueOf(bVar.f363308a) : null);
        return jz5.f0.f302826a;
    }
}
