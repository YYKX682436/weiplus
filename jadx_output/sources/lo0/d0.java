package lo0;

/* loaded from: classes14.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f319979d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f319980e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f319981f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f319982g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(java.lang.String str, java.util.Map map, java.util.List list, java.util.List list2) {
        super(1);
        this.f319979d = str;
        this.f319980e = map;
        this.f319981f = list;
        this.f319982g = list2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        org.json.JSONObject itemObj = (org.json.JSONObject) obj;
        kotlin.jvm.internal.o.g(itemObj, "itemObj");
        try {
            lo0.b0 b0Var = new lo0.b0(itemObj, this.f319979d, this.f319980e);
            this.f319981f.add(b0Var);
            lo0.b bVar = b0Var.f319973g;
            if (bVar != null) {
                this.f319982g.add(bVar);
            }
        } catch (lo0.u unused) {
        }
        return jz5.f0.f302826a;
    }
}
