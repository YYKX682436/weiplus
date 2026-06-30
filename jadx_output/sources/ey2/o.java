package ey2;

/* loaded from: classes2.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ey2.u f257440d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ey2.u uVar) {
        super(1);
        this.f257440d = uVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.protocal.protobuf.FinderObject it = (com.tencent.mm.protocal.protobuf.FinderObject) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return java.lang.Boolean.valueOf(((ey2.i2) ((jz5.n) this.f257440d.f257534p).getValue()).P6(4, it.getId()));
    }
}
