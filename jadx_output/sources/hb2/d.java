package hb2;

/* loaded from: classes2.dex */
public final class d extends hb2.w0 {

    /* renamed from: e, reason: collision with root package name */
    public static final hb2.d f280030e = new hb2.d();

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f280031f = "Finder.FinderModBloclPosterSetting";

    @Override // hb2.w0
    public com.tencent.mm.protobuf.g c(java.lang.Object obj) {
        r45.lh2 cmdBufItem = (r45.lh2) obj;
        kotlin.jvm.internal.o.g(cmdBufItem, "cmdBufItem");
        return com.tencent.mm.protobuf.g.b(cmdBufItem.toByteArray());
    }

    @Override // hb2.w0
    public int i() {
        return 13;
    }

    @Override // hb2.w0
    public java.lang.String k() {
        return f280031f;
    }

    @Override // hb2.w0
    public void l(java.lang.String username, java.lang.Object obj, r45.ix0 cmdRef) {
        r45.lh2 cmdBufItem = (r45.lh2) obj;
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(cmdBufItem, "cmdBufItem");
        kotlin.jvm.internal.o.g(cmdRef, "cmdRef");
        com.tencent.mars.xlog.Log.i(f280031f, "opType=" + cmdBufItem.getInteger(1) + " retcode:" + cmdRef.getInteger(1));
    }
}
