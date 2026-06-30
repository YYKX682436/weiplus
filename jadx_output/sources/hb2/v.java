package hb2;

/* loaded from: classes.dex */
public final class v extends hb2.w0 {

    /* renamed from: e, reason: collision with root package name */
    public static final hb2.v f280102e = new hb2.v();

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f280103f = "FinderModTeenagerSetting";

    @Override // hb2.w0
    public com.tencent.mm.protobuf.g c(java.lang.Object obj) {
        r45.qn2 cmdBufItem = (r45.qn2) obj;
        kotlin.jvm.internal.o.g(cmdBufItem, "cmdBufItem");
        return com.tencent.mm.protobuf.g.b(cmdBufItem.toByteArray());
    }

    @Override // hb2.w0
    public int i() {
        return 25;
    }

    @Override // hb2.w0
    public java.lang.String k() {
        return f280103f;
    }

    @Override // hb2.w0
    public void l(java.lang.String username, java.lang.Object obj, r45.ix0 cmdRef) {
        r45.qn2 cmdBufItem = (r45.qn2) obj;
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(cmdBufItem, "cmdBufItem");
        kotlin.jvm.internal.o.g(cmdRef, "cmdRef");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleUpdateResult: ret=");
        sb6.append(cmdRef.getInteger(1));
        sb6.append(", flag=");
        long j17 = cmdBufItem.getLong(2);
        r26.a.a(2);
        java.lang.String l17 = java.lang.Long.toString(j17, 2);
        kotlin.jvm.internal.o.f(l17, "toString(...)");
        sb6.append(l17);
        sb6.append(", birth_year=");
        sb6.append(cmdBufItem.getInteger(0));
        sb6.append(", birth_month=");
        sb6.append(cmdBufItem.getInteger(1));
        com.tencent.mars.xlog.Log.i(f280103f, sb6.toString());
    }
}
