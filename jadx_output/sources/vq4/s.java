package vq4;

/* loaded from: classes12.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rh.c1 f439380d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f439381e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(rh.c1 c1Var, boolean z17) {
        super(1);
        this.f439380d = c1Var;
        this.f439381e = z17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        org.json.JSONObject subJson = (org.json.JSONObject) obj;
        kotlin.jvm.internal.o.g(subJson, "$this$subJson");
        rh.c1 c1Var = this.f439380d;
        qh.b bVar = c1Var.f395330l;
        subJson.put("charge", bVar != null ? java.lang.Integer.valueOf(bVar.f363312e) : null);
        if (this.f439381e) {
            qh.b bVar2 = c1Var.f395330l;
            subJson.put("screenOff", bVar2 != null ? java.lang.Integer.valueOf(bVar2.f363314g) : null);
        }
        return jz5.f0.f302826a;
    }
}
