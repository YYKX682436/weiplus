package sc2;

/* loaded from: classes2.dex */
public final class t6 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final sc2.t6 f406267d = new sc2.t6();

    public t6() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.protocal.protobuf.FinderJumpInfo it = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.String jump_id = it.getJump_id();
        return jump_id == null ? "" : jump_id;
    }
}
