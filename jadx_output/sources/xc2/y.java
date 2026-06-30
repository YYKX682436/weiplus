package xc2;

/* loaded from: classes2.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final xc2.y f453340d = new xc2.y();

    public y() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.protocal.protobuf.FinderJumpInfo it = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return java.lang.Boolean.valueOf(it.getBusiness_type() == 49);
    }
}
