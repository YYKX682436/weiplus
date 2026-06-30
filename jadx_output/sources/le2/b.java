package le2;

/* loaded from: classes8.dex */
public final class b extends hb2.w0 {

    /* renamed from: e, reason: collision with root package name */
    public static final le2.b f318141e = new le2.b();

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f318142f = "Finder.FinderLiveNotifyRejectService";

    @Override // hb2.w0
    public com.tencent.mm.protobuf.g c(java.lang.Object obj) {
        r45.zh2 cmdBufItem = (r45.zh2) obj;
        kotlin.jvm.internal.o.g(cmdBufItem, "cmdBufItem");
        return com.tencent.mm.protobuf.g.b(cmdBufItem.toByteArray());
    }

    @Override // hb2.w0
    public int i() {
        return 16;
    }

    @Override // hb2.w0
    public java.lang.String k() {
        return f318142f;
    }

    @Override // hb2.w0
    public void l(java.lang.String username, java.lang.Object obj, r45.ix0 cmdRef) {
        r45.zh2 cmdBufItem = (r45.zh2) obj;
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(cmdBufItem, "cmdBufItem");
        kotlin.jvm.internal.o.g(cmdRef, "cmdRef");
        cmdRef.getInteger(1);
    }
}
