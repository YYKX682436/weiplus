package xe2;

/* loaded from: classes3.dex */
public final class a extends we2.z {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
    }

    @Override // we2.z
    public void d(java.util.LinkedList msgList) {
        kotlin.jvm.internal.o.g(msgList, "msgList");
        if (zl2.r4.f473950a.w1()) {
            r45.ch1 ch1Var = (r45.ch1) kz5.n0.Z(msgList);
            r45.uh1 uh1Var = new r45.uh1();
            if (ch1Var != null) {
                if (!(ch1Var.getByteString(4) != null)) {
                    ch1Var = null;
                }
                if (ch1Var != null) {
                    com.tencent.mm.protobuf.g byteString = ch1Var.getByteString(4);
                    uh1Var.parseFrom(byteString != null ? byteString.g() : null);
                }
            }
            if (uh1Var.getInteger(0) == 2) {
                dk2.ef efVar = dk2.ef.f233372a;
                com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
                if (k0Var != null) {
                    qo0.c.a(k0Var, qo0.b.f365434x3, null, 2, null);
                }
            }
        }
    }

    @Override // we2.z
    public int[] g() {
        return new int[]{20045};
    }
}
