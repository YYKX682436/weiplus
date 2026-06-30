package hb2;

/* loaded from: classes10.dex */
public final class y extends hb2.w0 {

    /* renamed from: e, reason: collision with root package name */
    public static final hb2.y f280114e = new hb2.y();

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f280115f = "Finder.FinderModifyBlackListService";

    @Override // hb2.w0
    public com.tencent.mm.protobuf.g c(java.lang.Object obj) {
        r45.kh2 cmdBufItem = (r45.kh2) obj;
        kotlin.jvm.internal.o.g(cmdBufItem, "cmdBufItem");
        return com.tencent.mm.protobuf.g.b(cmdBufItem.toByteArray());
    }

    @Override // hb2.w0
    public int i() {
        return 3;
    }

    @Override // hb2.w0
    public java.lang.String k() {
        return f280115f;
    }

    @Override // hb2.w0
    public void l(java.lang.String username, java.lang.Object obj, r45.ix0 cmdRef) {
        r45.kh2 cmdBufItem = (r45.kh2) obj;
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(cmdBufItem, "cmdBufItem");
        kotlin.jvm.internal.o.g(cmdRef, "cmdRef");
        if (cmdBufItem.getLong(2) == 0 || cmdBufItem.getInteger(0) != 1) {
            return;
        }
        com.tencent.mars.xlog.Log.i(f280115f, "handle BlackListOpAdd:id:" + cmdBufItem.getLong(1));
        com.tencent.mm.autogen.events.FinderCommentChangeEvent finderCommentChangeEvent = new com.tencent.mm.autogen.events.FinderCommentChangeEvent();
        long j17 = cmdBufItem.getLong(1);
        am.ta taVar = finderCommentChangeEvent.f54263g;
        taVar.f7993a = j17;
        taVar.f7994b = cmdBufItem.getLong(2);
        taVar.f7995c = com.tencent.mm.plugin.finder.storage.wj0.V;
        finderCommentChangeEvent.e();
    }

    public void n(long j17, long j18, java.lang.String feedNonceId, boolean z17, zy2.gc gcVar) {
        kotlin.jvm.internal.o.g(feedNonceId, "feedNonceId");
        r45.kh2 kh2Var = new r45.kh2();
        kh2Var.set(7, java.lang.Long.valueOf(j17));
        kh2Var.set(1, java.lang.Long.valueOf(j18));
        kh2Var.set(5, feedNonceId);
        if (z17) {
            kh2Var.set(0, 1);
        } else {
            kh2Var.set(0, 2);
        }
        hb2.w0.m(this, kh2Var, gcVar, false, false, null, null, 60, null);
    }

    public void o(long j17, long j18, java.lang.String feedNonceId, boolean z17, zy2.gc gcVar) {
        kotlin.jvm.internal.o.g(feedNonceId, "feedNonceId");
        r45.kh2 kh2Var = new r45.kh2();
        kh2Var.set(2, java.lang.Long.valueOf(j17));
        kh2Var.set(1, java.lang.Long.valueOf(j18));
        kh2Var.set(5, feedNonceId);
        if (z17) {
            kh2Var.set(0, 1);
        } else {
            kh2Var.set(0, 2);
        }
        hb2.w0.m(this, kh2Var, gcVar, false, false, null, null, 60, null);
    }

    public void q(java.lang.String username, boolean z17, zy2.gc gcVar) {
        kotlin.jvm.internal.o.g(username, "username");
        r45.kh2 kh2Var = new r45.kh2();
        kh2Var.set(3, username);
        if (z17) {
            kh2Var.set(0, 1);
        } else {
            kh2Var.set(0, 2);
        }
        hb2.w0.m(this, kh2Var, gcVar, false, false, null, null, 60, null);
    }

    public void r(java.lang.String username, boolean z17, zy2.gc gcVar) {
        kotlin.jvm.internal.o.g(username, "username");
        r45.kh2 kh2Var = new r45.kh2();
        kh2Var.set(3, username);
        if (z17) {
            kh2Var.set(0, 1);
        } else {
            kh2Var.set(0, 2);
        }
        hb2.w0.m(this, kh2Var, gcVar, false, false, null, null, 60, null);
    }

    public void s(com.tencent.mm.protobuf.g bytes, boolean z17, zy2.gc gcVar) {
        kotlin.jvm.internal.o.g(bytes, "bytes");
        r45.kh2 kh2Var = new r45.kh2();
        if (z17) {
            kh2Var.set(0, 1);
        } else {
            kh2Var.set(0, 2);
        }
        kh2Var.set(9, bytes);
        hb2.w0.m(this, kh2Var, gcVar, false, false, null, null, 60, null);
    }
}
