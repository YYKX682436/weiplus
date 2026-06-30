package lo0;

/* loaded from: classes14.dex */
public final class m0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f320049d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f320050e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lo0.r0 f320051f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f320052g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f320053h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(java.lang.String str, java.util.Map map, lo0.r0 r0Var, java.util.List list, java.util.List list2) {
        super(1);
        this.f320049d = str;
        this.f320050e = map;
        this.f320051f = r0Var;
        this.f320052g = list;
        this.f320053h = list2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        org.json.JSONObject itemObj = (org.json.JSONObject) obj;
        kotlin.jvm.internal.o.g(itemObj, "itemObj");
        try {
            java.lang.String str = this.f320049d;
            java.util.Map map = this.f320050e;
            lo0.r0 r0Var = this.f320051f;
            if (r0Var == null) {
                r0Var = new lo0.r0(0, 0, 0, null, null, null);
            }
            lo0.k0 k0Var = new lo0.k0(itemObj, str, map, r0Var);
            this.f320052g.add(k0Var);
            java.util.List list = this.f320053h;
            lo0.b bVar = k0Var.f320041g;
            if (bVar != null) {
                list.add(bVar);
            }
            list.addAll(((java.util.LinkedHashMap) k0Var.f320042h.f319986b).values());
        } catch (lo0.u unused) {
        }
        return jz5.f0.f302826a;
    }
}
