package tm2;

/* loaded from: classes3.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.s {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tm2.s2 f420546d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.hc1 f420547e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(tm2.s2 s2Var, r45.hc1 hc1Var) {
        super(5);
        this.f420546d = s2Var;
        this.f420547e = hc1Var;
    }

    @Override // yz5.s
    public java.lang.Object v(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        km2.m data;
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        int intValue = ((java.lang.Number) obj2).intValue();
        ((java.lang.Number) obj3).intValue();
        java.lang.String str = (java.lang.String) obj4;
        tm2.s2 s2Var = this.f420546d;
        if (booleanValue) {
            fm2.b bVar = s2Var.f19601c;
            if (bVar != null) {
                qo0.c.a(bVar, qo0.b.f365386n, null, 2, null);
            }
            fm2.b bVar2 = s2Var.f19601c;
            if (bVar2 != null && (data = bVar2.getData()) != null && (liveRoomControllerStore = data.f309131f) != null) {
                if2.z.f291153a.h(liveRoomControllerStore, this.f420547e);
            }
            dk2.ef.f233372a.J(1);
        } else {
            pm0.v.X(new tm2.l(s2Var, str, intValue));
        }
        return jz5.f0.f302826a;
    }
}
