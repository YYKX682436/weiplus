package hb2;

/* loaded from: classes8.dex */
public final class y0 extends hb2.w0 {

    /* renamed from: e, reason: collision with root package name */
    public static final hb2.y0 f280116e = new hb2.y0();

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f280117f = "Finder.FinderWxMsgSessionMuteSetting";

    @Override // hb2.w0
    public com.tencent.mm.protobuf.g c(java.lang.Object obj) {
        r45.ji2 cmdBufItem = (r45.ji2) obj;
        kotlin.jvm.internal.o.g(cmdBufItem, "cmdBufItem");
        return com.tencent.mm.protobuf.g.b(cmdBufItem.toByteArray());
    }

    @Override // hb2.w0
    public int i() {
        return 10;
    }

    @Override // hb2.w0
    public java.lang.String k() {
        return f280117f;
    }

    @Override // hb2.w0
    public void l(java.lang.String username, java.lang.Object obj, r45.ix0 cmdRef) {
        r45.ji2 cmdBufItem = (r45.ji2) obj;
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(cmdBufItem, "cmdBufItem");
        kotlin.jvm.internal.o.g(cmdRef, "cmdRef");
        int integer = cmdRef.getInteger(1);
        com.tencent.mars.xlog.Log.i(f280117f, "sessionId=" + cmdBufItem.getString(1) + " retcode:" + integer);
        if (integer != 0) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1473L, 9L, 1L);
            return;
        }
        com.tencent.mm.plugin.finder.storage.dj0 pk6 = ((c61.l7) i95.n0.c(c61.l7.class)).pk();
        java.lang.String string = cmdBufItem.getString(1);
        if (string == null) {
            string = "";
        }
        pk6.P0(string, cmdBufItem.getInteger(0));
    }
}
