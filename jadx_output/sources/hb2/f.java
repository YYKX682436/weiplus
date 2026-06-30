package hb2;

/* loaded from: classes8.dex */
public final class f extends hb2.w0 {

    /* renamed from: e, reason: collision with root package name */
    public static final hb2.f f280040e = new hb2.f();

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f280041f = "Finder.FinderModFeedReproduce";

    @Override // hb2.w0
    public com.tencent.mm.protobuf.g c(java.lang.Object obj) {
        r45.vh2 cmdBufItem = (r45.vh2) obj;
        kotlin.jvm.internal.o.g(cmdBufItem, "cmdBufItem");
        return com.tencent.mm.protobuf.g.b(cmdBufItem.toByteArray());
    }

    @Override // hb2.w0
    public int i() {
        return 9;
    }

    @Override // hb2.w0
    public java.lang.String k() {
        return f280041f;
    }

    @Override // hb2.w0
    public void l(java.lang.String username, java.lang.Object obj, r45.ix0 cmdRef) {
        r45.vh2 cmdBufItem = (r45.vh2) obj;
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(cmdBufItem, "cmdBufItem");
        kotlin.jvm.internal.o.g(cmdRef, "cmdRef");
        cmdRef.getInteger(1);
    }
}
