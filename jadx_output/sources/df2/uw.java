package df2;

/* loaded from: classes3.dex */
public final class uw extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.zf f231560d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.xw f231561e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f231562f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uw(dk2.zf zfVar, df2.xw xwVar, java.lang.String str) {
        super(0);
        this.f231560d = zfVar;
        this.f231561e = xwVar;
        this.f231562f = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.vk0 vk0Var;
        dk2.zf zfVar = this.f231560d;
        dk2.dg dgVar = zfVar instanceof dk2.dg ? (dk2.dg) zfVar : null;
        r45.d54 d54Var = r45.d54.LOADING;
        if (dgVar != null) {
            dgVar.t(d54Var);
        }
        if (zfVar != null && (vk0Var = (com.tencent.mm.plugin.finder.live.plugin.vk0) this.f231561e.R6(com.tencent.mm.plugin.finder.live.plugin.vk0.class)) != null) {
            java.lang.String str = this.f231562f;
            if (str == null) {
                java.util.LinkedList linkedList = new java.util.LinkedList();
                linkedList.add(zfVar);
                vk0Var.v1(linkedList);
            } else {
                vk0Var.w1(d54Var, str);
            }
        }
        return jz5.f0.f302826a;
    }
}
