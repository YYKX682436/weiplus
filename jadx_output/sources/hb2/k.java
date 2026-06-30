package hb2;

/* loaded from: classes.dex */
public final class k extends hb2.w0 {

    /* renamed from: e, reason: collision with root package name */
    public static final hb2.k f280062e = new hb2.k();

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f280063f = "Finder.FinderModMessageSetting";

    @Override // hb2.w0
    public com.tencent.mm.protobuf.g c(java.lang.Object obj) {
        r45.ii2 cmdBufItem = (r45.ii2) obj;
        kotlin.jvm.internal.o.g(cmdBufItem, "cmdBufItem");
        return com.tencent.mm.protobuf.g.b(cmdBufItem.toByteArray());
    }

    @Override // hb2.w0
    public int i() {
        return 8;
    }

    @Override // hb2.w0
    public java.lang.String k() {
        return f280063f;
    }

    @Override // hb2.w0
    public void l(java.lang.String username, java.lang.Object obj, r45.ix0 cmdRef) {
        r45.ii2 cmdBufItem = (r45.ii2) obj;
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(cmdBufItem, "cmdBufItem");
        kotlin.jvm.internal.o.g(cmdRef, "cmdRef");
        int integer = cmdRef.getInteger(1);
        com.tencent.mars.xlog.Log.i(f280063f, "opType=" + cmdBufItem.getInteger(0) + " retcode:" + integer);
        if (integer != 0) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1473L, 10L, 1L);
        }
    }
}
