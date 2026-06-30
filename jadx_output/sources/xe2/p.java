package xe2;

/* loaded from: classes3.dex */
public final class p extends we2.z {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
    }

    @Override // we2.z
    public void d(java.util.LinkedList msgList) {
        kotlin.jvm.internal.o.g(msgList, "msgList");
        r45.ch1 ch1Var = (r45.ch1) kz5.n0.k0(msgList);
        r45.dk1 dk1Var = new r45.dk1();
        if (ch1Var != null) {
            if (!(ch1Var.getByteString(4) != null)) {
                ch1Var = null;
            }
            if (ch1Var != null) {
                com.tencent.mm.protobuf.g byteString = ch1Var.getByteString(4);
                dk1Var.parseFrom(byteString != null ? byteString.g() : null);
            }
        }
    }

    @Override // we2.z
    public int[] g() {
        return new int[]{20061};
    }
}
