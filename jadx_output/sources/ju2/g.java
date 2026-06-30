package ju2;

/* loaded from: classes2.dex */
public abstract class g {
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00dc, code lost:
    
        if ((r2 != null && r2.getVisibility() == 0) != false) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.tencent.mm.plugin.finder.convert.qe r8, in5.s0 r9, com.tencent.mm.plugin.finder.model.BaseFinderFeed r10, int r11) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ju2.g.a(com.tencent.mm.plugin.finder.convert.qe, in5.s0, com.tencent.mm.plugin.finder.model.BaseFinderFeed, int):void");
    }

    public static final void b(android.view.View view, com.tencent.mm.plugin.finder.model.BaseFinderFeed item) {
        kotlin.jvm.internal.o.g(item, "item");
        if (view != null) {
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderCommentInfo> likeList = item.getFeedObject().getFeedObject().getLikeList();
            hc2.v0.e(view, "friend_like_lst", 0, 0, false, false, null, new ju2.e(item, likeList != null ? kz5.n0.g0(likeList, "#", null, null, 0, null, ju2.f.f301815d, 30, null) : null), 62, null);
        }
    }
}
