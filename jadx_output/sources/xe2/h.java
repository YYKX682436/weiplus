package xe2;

/* loaded from: classes3.dex */
public final class h extends we2.z {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f453865c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f453865c = "LiveAudienceInterceptor";
    }

    @Override // we2.z
    public void d(java.util.LinkedList msgList) {
        kotlin.jvm.internal.o.g(msgList, "msgList");
        r45.ch1 ch1Var = (r45.ch1) kz5.n0.k0(msgList);
        r45.kk1 kk1Var = new r45.kk1();
        if (ch1Var != null) {
            if (!(ch1Var.getByteString(4) != null)) {
                ch1Var = null;
            }
            if (ch1Var != null) {
                com.tencent.mm.protobuf.g byteString = ch1Var.getByteString(4);
                kk1Var.parseFrom(byteString != null ? byteString.g() : null);
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("from msg audience: ");
        r45.ou0 ou0Var = (r45.ou0) kk1Var.getCustom(0);
        sb6.append(ou0Var != null ? java.lang.Integer.valueOf(ou0Var.getInteger(2)) : null);
        com.tencent.mars.xlog.Log.i(this.f453865c, sb6.toString());
    }

    @Override // we2.z
    public int[] g() {
        return new int[]{20097};
    }
}
