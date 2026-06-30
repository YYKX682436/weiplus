package xe2;

/* loaded from: classes3.dex */
public final class i1 extends we2.z {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f453870c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f453870c = "LivePromoteStatusInterceptor";
    }

    @Override // we2.z
    public void d(java.util.LinkedList msgList) {
        kotlin.jvm.internal.o.g(msgList, "msgList");
        r45.ch1 ch1Var = (r45.ch1) kz5.n0.k0(msgList);
        r45.sj1 sj1Var = new r45.sj1();
        if (ch1Var != null) {
            if (!(ch1Var.getByteString(4) != null)) {
                ch1Var = null;
            }
            if (ch1Var != null) {
                com.tencent.mm.protobuf.g byteString = ch1Var.getByteString(4);
                sj1Var.parseFrom(byteString != null ? byteString.g() : null);
            }
        }
        com.tencent.mars.xlog.Log.i(this.f453870c, "recive promote msg: " + pm0.b0.g(sj1Var));
        if (zl2.q4.f473933a.E()) {
            db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "收到留资dimiss通知", 0).show();
        }
        ((mm2.f6) this.f445267a.a(mm2.f6.class)).H.postValue(sj1Var);
    }

    @Override // we2.z
    public int[] g() {
        return new int[]{20085};
    }
}
