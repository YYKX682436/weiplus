package lo0;

/* loaded from: classes14.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f320010d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f320011e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lo0.r0 f320012f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f320013g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f320014h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(java.lang.String str, java.util.Map map, lo0.r0 r0Var, java.util.List list, java.util.List list2) {
        super(1);
        this.f320010d = str;
        this.f320011e = map;
        this.f320012f = r0Var;
        this.f320013g = list;
        this.f320014h = list2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        org.json.JSONObject detailItemObj = (org.json.JSONObject) obj;
        kotlin.jvm.internal.o.g(detailItemObj, "detailItemObj");
        try {
            lo0.h0 h0Var = new lo0.h0(detailItemObj, this.f320010d, this.f320011e, this.f320012f);
            this.f320013g.add(h0Var);
            lo0.b bVar = h0Var.f320005i;
            if (bVar != null) {
                this.f320014h.add(bVar);
            }
        } catch (lo0.u unused) {
        }
        return jz5.f0.f302826a;
    }
}
