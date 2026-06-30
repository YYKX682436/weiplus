package xe2;

/* loaded from: classes3.dex */
public final class q0 extends we2.z {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f453894c;

    /* renamed from: d, reason: collision with root package name */
    public int f453895d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f453894c = "LiveHotCommentMsgInterceptor";
    }

    @Override // we2.z
    public void d(java.util.LinkedList msgList) {
        kotlin.jvm.internal.o.g(msgList, "msgList");
        r45.ch1 ch1Var = (r45.ch1) kz5.n0.k0(msgList);
        if (ch1Var == null) {
            return;
        }
        com.tencent.mm.protobuf.g byteString = ch1Var.getByteString(4);
        java.lang.String str = this.f453894c;
        if (byteString == null) {
            com.tencent.mars.xlog.Log.e(str, "empty msgPayload");
            return;
        }
        java.lang.String string = ch1Var.getString(2);
        if (string == null) {
            com.tencent.mars.xlog.Log.e(str, "empty clientMsgId");
            return;
        }
        r45.ai1 ai1Var = new r45.ai1();
        ai1Var.parseFrom(byteString.g());
        if (this.f453895d >= ai1Var.getInteger(0)) {
            com.tencent.mars.xlog.Log.i(str, "drop outdated app msg");
            return;
        }
        com.tencent.mars.xlog.Log.i(str, "receive hot comment msg:" + pm0.b0.g(ai1Var) + ", id:" + string);
        this.f453895d = ai1Var.getInteger(0);
        ((mm2.x4) this.f445267a.a(mm2.x4.class)).f329545z.postValue(new jz5.l(ai1Var, string));
    }

    @Override // we2.z
    public int[] g() {
        return new int[]{20082};
    }
}
