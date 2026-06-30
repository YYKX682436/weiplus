package le2;

/* loaded from: classes8.dex */
public final class a extends hb2.w0 {

    /* renamed from: e, reason: collision with root package name */
    public static final le2.a f318139e = new le2.a();

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f318140f = "Finder.FinderLiveCustomNotifyRejectService";

    @Override // hb2.w0
    public com.tencent.mm.protobuf.g c(java.lang.Object obj) {
        r45.ph2 cmdBufItem = (r45.ph2) obj;
        kotlin.jvm.internal.o.g(cmdBufItem, "cmdBufItem");
        return com.tencent.mm.protobuf.g.b(cmdBufItem.toByteArray());
    }

    @Override // hb2.w0
    public int i() {
        return 28;
    }

    @Override // hb2.w0
    public java.lang.String k() {
        return f318140f;
    }

    @Override // hb2.w0
    public void l(java.lang.String username, java.lang.Object obj, r45.ix0 cmdRef) {
        r45.ph2 cmdBufItem = (r45.ph2) obj;
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(cmdBufItem, "cmdBufItem");
        kotlin.jvm.internal.o.g(cmdRef, "cmdRef");
        com.tencent.mars.xlog.Log.i(f318140f, "retcode:" + cmdRef.getInteger(1));
    }
}
