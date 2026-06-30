package el2;

/* loaded from: classes3.dex */
public final class d2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ el2.i2 f253776d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.f52 f253777e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(el2.i2 i2Var, r45.f52 f52Var) {
        super(0);
        this.f253776d = i2Var;
        this.f253777e = f52Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("liveId=");
        sb6.append(this.f253776d.Z6());
        sb6.append(", promoteId=");
        r45.f52 f52Var = this.f253777e;
        sb6.append(f52Var != null ? java.lang.Long.valueOf(f52Var.getLong(4)) : null);
        sb6.append(",isAnchor=");
        sb6.append(zl2.r4.f473950a.w1());
        sb6.append(", isAssistant=");
        mm2.c1 c1Var = (mm2.c1) dk2.ef.f233372a.i(mm2.c1.class);
        sb6.append(c1Var != null ? java.lang.Boolean.valueOf(c1Var.T) : null);
        return sb6.toString();
    }
}
