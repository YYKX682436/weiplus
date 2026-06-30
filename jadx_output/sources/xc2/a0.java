package xc2;

/* loaded from: classes2.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderJumpInfo f453067d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo) {
        super(1);
        this.f453067d = finderJumpInfo;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.protocal.protobuf.FinderJumpInfo it = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return java.lang.Boolean.valueOf(kotlin.jvm.internal.o.b(it.getJump_id(), this.f453067d.getJump_id()));
    }
}
