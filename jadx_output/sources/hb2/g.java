package hb2;

/* loaded from: classes2.dex */
public final class g extends hb2.w0 {

    /* renamed from: e, reason: collision with root package name */
    public static final hb2.g f280044e = new hb2.g();

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f280045f = "Finder.FinderModHelpPromotion";

    @Override // hb2.w0
    public com.tencent.mm.protobuf.g c(java.lang.Object obj) {
        r45.bi2 cmdBufItem = (r45.bi2) obj;
        kotlin.jvm.internal.o.g(cmdBufItem, "cmdBufItem");
        return com.tencent.mm.protobuf.g.b(cmdBufItem.toByteArray());
    }

    @Override // hb2.w0
    public int i() {
        return 36;
    }

    @Override // hb2.w0
    public java.lang.String k() {
        return f280045f;
    }

    @Override // hb2.w0
    public void l(java.lang.String username, java.lang.Object obj, r45.ix0 cmdRef) {
        r45.bi2 cmdBufItem = (r45.bi2) obj;
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(cmdBufItem, "cmdBufItem");
        kotlin.jvm.internal.o.g(cmdRef, "cmdRef");
        com.tencent.mars.xlog.Log.i(f280045f, "retCode:" + cmdRef.getInteger(1));
    }
}
