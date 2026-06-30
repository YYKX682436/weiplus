package hb2;

/* loaded from: classes.dex */
public final class w extends hb2.w0 {

    /* renamed from: e, reason: collision with root package name */
    public static final hb2.w f280108e = new hb2.w();

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f280109f = "Finder.FinderModWxUserSetting";

    @Override // hb2.w0
    public com.tencent.mm.protobuf.g c(java.lang.Object obj) {
        r45.g33 cmdBufItem = (r45.g33) obj;
        kotlin.jvm.internal.o.g(cmdBufItem, "cmdBufItem");
        return com.tencent.mm.protobuf.g.b(cmdBufItem.toByteArray());
    }

    @Override // hb2.w0
    public int i() {
        return 30;
    }

    @Override // hb2.w0
    public java.lang.String k() {
        return f280109f;
    }

    @Override // hb2.w0
    public void l(java.lang.String username, java.lang.Object obj, r45.ix0 cmdRef) {
        r45.g33 cmdBufItem = (r45.g33) obj;
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(cmdBufItem, "cmdBufItem");
        kotlin.jvm.internal.o.g(cmdRef, "cmdRef");
        com.tencent.mars.xlog.Log.i(f280109f, "[handleUpdateResult] retCode:" + cmdRef.getInteger(1) + " op_type:" + cmdBufItem.getInteger(0));
    }
}
