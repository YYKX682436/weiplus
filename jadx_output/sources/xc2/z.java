package xc2;

/* loaded from: classes2.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc2.t f453349d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(xc2.t tVar) {
        super(1);
        this.f453349d = tVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.protocal.protobuf.FinderJumpInfo it = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return java.lang.Boolean.valueOf(!this.f453349d.f453305g.contains(java.lang.Integer.valueOf(it.hashCode())));
    }
}
