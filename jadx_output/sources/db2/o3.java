package db2;

/* loaded from: classes2.dex */
public abstract class o3 {
    public static final void a(db2.c3 c3Var, int i17, java.lang.String tag) {
        kotlin.jvm.internal.o.g(c3Var, "<this>");
        kotlin.jvm.internal.o.g(tag, "tag");
        com.tencent.mars.xlog.Log.i(tag, "saveConfigWhenEnterFinderStreamEnter: tabType=" + i17 + ", headWording=" + c3Var.getString(3) + ", endWording=" + c3Var.getString(4) + ", prefetch_last_feed_count=" + c3Var.getInteger(8) + ", flow_card_prefetch_last_feed_count=" + c3Var.getInteger(25));
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_TIMELINE_HEADER_WORDING_STRING_SYNC, c3Var.getString(3));
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_TIMELINE_FOOTER_WORDING_STRING_SYNC, c3Var.getString(4));
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_TIMELINE_PRELOAD_NUM_INT_SYNC, java.lang.Integer.valueOf(c3Var.getInteger(8)));
        if (c3Var.getInteger(25) > 0) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_TWO_FLOW_PRELOAD_NUM_INT_SYNC, java.lang.Integer.valueOf(c3Var.getInteger(25)));
        }
    }
}
