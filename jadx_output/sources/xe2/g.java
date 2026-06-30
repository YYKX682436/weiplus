package xe2;

/* loaded from: classes3.dex */
public final class g extends we2.z {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f453862c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f453862c = "LiveAudienceActionInfoInterceptor";
    }

    @Override // we2.z
    public void d(java.util.LinkedList msgList) {
        kotlin.jvm.internal.o.g(msgList, "msgList");
        r45.ch1 ch1Var = (r45.ch1) kz5.n0.k0(msgList);
        r45.nh1 nh1Var = new r45.nh1();
        if (ch1Var != null) {
            if (!(ch1Var.getByteString(4) != null)) {
                ch1Var = null;
            }
            if (ch1Var != null) {
                com.tencent.mm.protobuf.g byteString = ch1Var.getByteString(4);
                nh1Var.parseFrom(byteString != null ? byteString.g() : null);
            }
        }
        com.tencent.mars.xlog.Log.i(this.f453862c, "receive audience action msg:" + pm0.b0.g(nh1Var));
        ((kotlinx.coroutines.flow.h3) ((mm2.x4) this.f445267a.a(mm2.x4.class)).A).k(nh1Var);
    }

    @Override // we2.z
    public int[] g() {
        return new int[]{20084};
    }
}
