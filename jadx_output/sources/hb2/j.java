package hb2;

/* loaded from: classes8.dex */
public final class j extends hb2.w0 {

    /* renamed from: e, reason: collision with root package name */
    public static final hb2.j f280059e = new hb2.j();

    @Override // hb2.w0
    public com.tencent.mm.protobuf.g c(java.lang.Object obj) {
        r45.yh2 cmdBufItem = (r45.yh2) obj;
        kotlin.jvm.internal.o.g(cmdBufItem, "cmdBufItem");
        return com.tencent.mm.protobuf.g.b(cmdBufItem.toByteArray());
    }

    @Override // hb2.w0
    public int i() {
        return 19;
    }

    @Override // hb2.w0
    public java.lang.String k() {
        return "Finder.FinderModMessageRedDot";
    }

    @Override // hb2.w0
    public void l(java.lang.String username, java.lang.Object obj, r45.ix0 cmdRef) {
        ya2.g gVar;
        ya2.b2 b17;
        r45.yh2 cmdBufItem = (r45.yh2) obj;
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(cmdBufItem, "cmdBufItem");
        kotlin.jvm.internal.o.g(cmdRef, "cmdRef");
        int integer = cmdRef.getInteger(1);
        com.tencent.mars.xlog.Log.i("Finder.FinderModMessageRedDot", "handleUpdateResult cmdBufItem retCode:" + integer + " username:" + username + " status:" + cmdBufItem.getLong(0) + " switch:" + cmdBufItem.getInteger(1));
        if (integer == -1 || (b17 = (gVar = ya2.h.f460484a).b(username)) == null) {
            return;
        }
        b17.field_messageStatus = cmdBufItem.getInteger(1) == 0 ? b17.field_messageStatus & (~cmdBufItem.getLong(0)) : b17.field_messageStatus | cmdBufItem.getLong(0);
        f280059e.getClass();
        com.tencent.mars.xlog.Log.i("Finder.FinderModMessageRedDot", "handleUpdateResult field_messageStatus" + b17.field_messageStatus);
        gVar.o(b17);
    }
}
