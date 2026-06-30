package dk2;

/* loaded from: classes.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f234139d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.xn1 f234140e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.ng1 f234141f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f234142g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ek2.f f234143h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(dk2.r4 r4Var, r45.xn1 xn1Var, r45.ng1 ng1Var, int i17, ek2.f fVar) {
        super(0);
        this.f234139d = r4Var;
        this.f234140e = xn1Var;
        this.f234141f = ng1Var;
        this.f234142g = i17;
        this.f234143h = fVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        java.util.Map map = ((mm2.y2) this.f234139d.m(mm2.y2.class)).A;
        kotlin.jvm.internal.o.f(map, "<get-invitedVisitorExpiredMap>(...)");
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) this.f234140e.getCustom(0);
        if (finderContact == null || (str = finderContact.getUsername()) == null) {
            str = "";
        }
        r45.ng1 ng1Var = this.f234141f;
        map.put(str, new dk2.b8(ng1Var.getLong(1) * 1000, this.f234142g));
        ek2.f fVar = this.f234143h;
        if (fVar != null) {
            fVar.a(ng1Var);
        }
        return jz5.f0.f302826a;
    }
}
