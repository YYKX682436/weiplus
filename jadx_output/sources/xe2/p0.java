package xe2;

/* loaded from: classes3.dex */
public final class p0 extends we2.z {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f453893c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f453893c = "LiveHotCommentAnimationMsgInterceptor";
    }

    @Override // we2.z
    public void d(java.util.LinkedList msgList) {
        df2.k9 k9Var;
        kotlin.jvm.internal.o.g(msgList, "msgList");
        r45.ch1 ch1Var = (r45.ch1) kz5.n0.k0(msgList);
        r45.ii1 ii1Var = null;
        if (ch1Var != null) {
            if (!(ch1Var.getByteString(4) != null)) {
                ch1Var = null;
            }
            if (ch1Var != null) {
                r45.ii1 ii1Var2 = new r45.ii1();
                com.tencent.mm.protobuf.g byteString = ch1Var.getByteString(4);
                byte[] g17 = byteString != null ? byteString.g() : null;
                if (g17 != null) {
                    try {
                        ii1Var2.parseFrom(g17);
                        ii1Var = ii1Var2;
                    } catch (java.lang.Exception e17) {
                        com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                    }
                }
            }
        }
        if (ii1Var != null) {
            com.tencent.mars.xlog.Log.i(this.f453893c, "receive hot comment animation msg:" + pm0.b0.g(ii1Var));
            dk2.ef efVar = dk2.ef.f233372a;
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = dk2.ef.f233371J;
            if (liveRoomControllerStore == null || (k9Var = (df2.k9) liveRoomControllerStore.controller(df2.k9.class)) == null) {
                return;
            }
            k9Var.Z6(ii1Var);
        }
    }

    @Override // we2.z
    public int[] g() {
        return new int[]{20083};
    }
}
