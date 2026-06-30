package hb2;

/* loaded from: classes.dex */
public final class e extends hb2.w0 {

    /* renamed from: e, reason: collision with root package name */
    public static final hb2.e f280035e = new hb2.e();

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f280036f = "Finder.FinderModCollectionWatching";

    @Override // hb2.w0
    public com.tencent.mm.protobuf.g c(java.lang.Object obj) {
        r45.mh2 cmdBufItem = (r45.mh2) obj;
        kotlin.jvm.internal.o.g(cmdBufItem, "cmdBufItem");
        return com.tencent.mm.protobuf.g.b(cmdBufItem.toByteArray());
    }

    @Override // hb2.w0
    public int i() {
        return 34;
    }

    @Override // hb2.w0
    public java.lang.String k() {
        return f280036f;
    }

    @Override // hb2.w0
    public void l(java.lang.String username, java.lang.Object obj, r45.ix0 cmdRef) {
        r45.mh2 cmdBufItem = (r45.mh2) obj;
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(cmdBufItem, "cmdBufItem");
        kotlin.jvm.internal.o.g(cmdRef, "cmdRef");
        com.tencent.mars.xlog.Log.i(f280036f, "retcode:" + cmdRef.getInteger(1));
    }
}
