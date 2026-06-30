package hb2;

/* loaded from: classes.dex */
public final class r extends hb2.w0 {

    /* renamed from: e, reason: collision with root package name */
    public static final hb2.r f280085e = new hb2.r();

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f280086f = "Finder.FinderModPlayHistorySetting";

    @Override // hb2.w0
    public com.tencent.mm.protobuf.g c(java.lang.Object obj) {
        r45.li2 cmdBufItem = (r45.li2) obj;
        kotlin.jvm.internal.o.g(cmdBufItem, "cmdBufItem");
        return com.tencent.mm.protobuf.g.b(cmdBufItem.toByteArray());
    }

    @Override // hb2.w0
    public int i() {
        return 29;
    }

    @Override // hb2.w0
    public java.lang.String k() {
        return f280086f;
    }

    @Override // hb2.w0
    public void l(java.lang.String username, java.lang.Object obj, r45.ix0 cmdRef) {
        r45.li2 cmdBufItem = (r45.li2) obj;
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(cmdBufItem, "cmdBufItem");
        kotlin.jvm.internal.o.g(cmdRef, "cmdRef");
        com.tencent.mars.xlog.Log.i(f280086f, "opType=" + cmdBufItem.getInteger(0) + " retCode:" + cmdRef.getInteger(1));
    }
}
