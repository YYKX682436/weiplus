package id2;

/* loaded from: classes.dex */
public final class i5 extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f290621d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ id2.p5 f290622e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5(yz5.l lVar, id2.p5 p5Var) {
        super(4);
        this.f290621d = lVar;
        this.f290622e = p5Var;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        pm0.v.X(new id2.h5(((java.lang.Number) obj).intValue(), ((java.lang.Number) obj2).intValue(), this.f290621d, (com.tencent.mm.modelbase.m1) obj4, this.f290622e));
        return jz5.f0.f302826a;
    }
}
