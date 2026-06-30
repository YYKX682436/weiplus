package vq4;

/* loaded from: classes12.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rh.c1 f439383d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(rh.c1 c1Var) {
        super(1);
        this.f439383d = c1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        org.json.JSONObject subJson = (org.json.JSONObject) obj;
        kotlin.jvm.internal.o.g(subJson, "$this$subJson");
        rh.c1 c1Var = this.f439383d;
        qh.b bVar = c1Var.f395330l;
        subJson.put("top1", bVar != null ? bVar.f363316i : null);
        qh.b bVar2 = c1Var.f395330l;
        subJson.put("ratio1", bVar2 != null ? java.lang.Integer.valueOf(bVar2.f363317j) : null);
        qh.b bVar3 = c1Var.f395330l;
        subJson.put("top2", bVar3 != null ? bVar3.f363318k : null);
        qh.b bVar4 = c1Var.f395330l;
        subJson.put("ratio2", bVar4 != null ? java.lang.Integer.valueOf(bVar4.f363319l) : null);
        return jz5.f0.f302826a;
    }
}
