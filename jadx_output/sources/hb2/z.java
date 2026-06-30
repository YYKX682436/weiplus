package hb2;

/* loaded from: classes10.dex */
public final class z extends hb2.w0 {

    /* renamed from: e, reason: collision with root package name */
    public static final hb2.z f280118e = new hb2.z();

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f280119f = "Finder.FinderModifyCommentService";

    @Override // hb2.w0
    public com.tencent.mm.protobuf.g c(java.lang.Object obj) {
        r45.nh2 modComment = (r45.nh2) obj;
        kotlin.jvm.internal.o.g(modComment, "modComment");
        return com.tencent.mm.protobuf.g.b(modComment.toByteArray());
    }

    @Override // hb2.w0
    public int i() {
        return 26;
    }

    @Override // hb2.w0
    public java.lang.String k() {
        return f280119f;
    }

    @Override // hb2.w0
    public void l(java.lang.String username, java.lang.Object obj, r45.ix0 cmdRef) {
        com.tencent.mm.plugin.finder.storage.FinderItem h17;
        int i17;
        r45.nh2 cmdBufItem = (r45.nh2) obj;
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(cmdBufItem, "cmdBufItem");
        kotlin.jvm.internal.o.g(cmdRef, "cmdRef");
        int integer = cmdRef.getInteger(1);
        com.tencent.mars.xlog.Log.i(f280119f, "retCode %d", java.lang.Integer.valueOf(integer));
        if (integer != 0) {
            android.content.Context ll6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).ll();
            int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            ll6.getString(com.tencent.mm.R.string.cwg);
            return;
        }
        if ((cmdBufItem.getInteger(0) == 1 || cmdBufItem.getInteger(0) == 2) && (h17 = bu2.j.f24534a.h(cmdBufItem.getLong(1))) != null) {
            for (com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo : h17.getCommentList()) {
                if (cmdBufItem.getInteger(0) == 2 && finderCommentInfo.getCommentId() == cmdBufItem.getLong(2)) {
                    finderCommentInfo.setDisplayFlag(finderCommentInfo.getDisplayFlag() & (-257));
                }
                if (cmdBufItem.getInteger(0) == 1) {
                    if (finderCommentInfo.getCommentId() == cmdBufItem.getLong(2)) {
                        finderCommentInfo.setDisplayFlag(finderCommentInfo.getDisplayFlag() | 256);
                    } else {
                        finderCommentInfo.setDisplayFlag(finderCommentInfo.getDisplayFlag() & (-257));
                    }
                }
            }
            bu2.j.f24534a.n(h17, bu2.i.f24530k);
        }
        com.tencent.mm.plugin.finder.storage.l Ij = ((c61.l7) i95.n0.c(c61.l7.class)).Ij();
        long j17 = cmdBufItem.getLong(1);
        long j18 = cmdBufItem.getLong(2);
        int integer2 = cmdBufItem.getInteger(0);
        if (integer2 == 1) {
            i17 = com.tencent.mm.plugin.finder.storage.wj0.T;
        } else if (integer2 != 2) {
            com.tencent.mars.xlog.Log.w("modOpTypeToActionType", "Unhandled opType: " + integer2);
            i17 = -1;
        } else {
            i17 = com.tencent.mm.plugin.finder.storage.wj0.U;
        }
        Ij.D0(j17, j18, -1L, i17, null);
    }
}
