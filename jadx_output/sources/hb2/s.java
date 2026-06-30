package hb2;

/* loaded from: classes2.dex */
public final class s extends hb2.w0 {

    /* renamed from: e, reason: collision with root package name */
    public static final hb2.s f280088e = new hb2.s();

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f280089f = "Finder.FinderModProfileStickySetting";

    @Override // hb2.w0
    public com.tencent.mm.protobuf.g c(java.lang.Object obj) {
        r45.mi2 cmdBufItem = (r45.mi2) obj;
        kotlin.jvm.internal.o.g(cmdBufItem, "cmdBufItem");
        return com.tencent.mm.protobuf.g.b(cmdBufItem.toByteArray());
    }

    @Override // hb2.w0
    public int i() {
        return 12;
    }

    @Override // hb2.w0
    public java.lang.String k() {
        return f280089f;
    }

    @Override // hb2.w0
    public void l(java.lang.String username, java.lang.Object obj, r45.ix0 cmdRef) {
        r45.mi2 cmdBufItem = (r45.mi2) obj;
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(cmdBufItem, "cmdBufItem");
        kotlin.jvm.internal.o.g(cmdRef, "cmdRef");
        int integer = cmdRef.getInteger(1);
        com.tencent.mars.xlog.Log.i(f280089f, "retcode:" + integer);
        if (integer == 0) {
            int e17 = cmdBufItem.getInteger(1) == 0 ? c01.id.e() : 0;
            com.tencent.mm.plugin.finder.storage.FinderItem h17 = bu2.j.f24534a.h(cmdBufItem.getLong(0));
            if (h17 != null) {
                h17.setStickyTime(e17);
            }
            com.tencent.mm.autogen.events.FeedStickyEvent feedStickyEvent = new com.tencent.mm.autogen.events.FeedStickyEvent();
            feedStickyEvent.f54251g.f6828a = 1000;
            cmdBufItem.getLong(0);
            feedStickyEvent.e();
        }
    }
}
