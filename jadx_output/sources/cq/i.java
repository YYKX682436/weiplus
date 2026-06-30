package cq;

/* loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f221210d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f221211e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.tencent.mm.protocal.protobuf.FinderObject finderObject, int i17) {
        super(1);
        this.f221210d = finderObject;
        this.f221211e = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return new cq.f(this.f221210d.getId(), this.f221211e);
    }
}
