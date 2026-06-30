package p10;

/* loaded from: classes7.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.nirvana.ui.MagicEcsNirvanaUI f350957d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f350958e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.HashSet f350959f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ double f350960g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f350961h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.tencent.mm.feature.ecs.nirvana.ui.MagicEcsNirvanaUI magicEcsNirvanaUI, java.util.List list, java.util.HashSet hashSet, double d17, boolean z17) {
        super(0);
        this.f350957d = magicEcsNirvanaUI;
        this.f350958e = list;
        this.f350959f = hashSet;
        this.f350960g = d17;
        this.f350961h = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.feature.ecs.nirvana.ui.MagicEcsNirvanaUI magicEcsNirvanaUI = this.f350957d;
        java.lang.String str = magicEcsNirvanaUI.f65843o;
        if (str == null) {
            kotlin.jvm.internal.o.o("bizName");
            throw null;
        }
        p10.g0 g0Var = new p10.g0(magicEcsNirvanaUI);
        java.util.List list = this.f350958e;
        java.util.HashSet hashSet = this.f350959f;
        p10.h0 h0Var = new p10.h0(magicEcsNirvanaUI);
        double d17 = this.f350960g;
        boolean z17 = this.f350961h;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("use_skwasm_mode", this.f350961h);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        return new iq0.h(str, null, g0Var, list, hashSet, h0Var, d17, "ilinkres_4274070d", z17, jSONObject2);
    }
}
