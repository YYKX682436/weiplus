package fd2;

/* loaded from: classes2.dex */
public final class a {
    public a(kotlin.jvm.internal.i iVar) {
    }

    public final java.lang.Long a() {
        java.lang.Long l17 = fd2.j.f261272m;
        if (l17 != null) {
            return l17;
        }
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.sdk.platformtools.o4 o4Var = ((cq.k) c17).f221226g.f242285b;
        java.lang.Long valueOf = java.lang.Long.valueOf(o4Var != null ? o4Var.q("KEY_FINDER_ENABLE_AUTO_SCROLL_COUNT", 0L) : 0L);
        fd2.j.f261272m = valueOf;
        return valueOf;
    }

    public final boolean b(in5.s0 holder) {
        java.util.List data;
        kotlin.jvm.internal.o.g(holder, "holder");
        androidx.recyclerview.widget.f2 f2Var = holder.f293122f;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = f2Var instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) f2Var : null;
        if ((wxRecyclerAdapter == null || (data = wxRecyclerAdapter.getData()) == null || data.size() != 1) ? false : true) {
            androidx.recyclerview.widget.RecyclerView o17 = holder.o();
            android.view.ViewParent parent = o17 != null ? o17.getParent() : null;
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = parent instanceof com.tencent.mm.view.RefreshLoadMoreLayout ? (com.tencent.mm.view.RefreshLoadMoreLayout) parent : null;
            if ((refreshLoadMoreLayout == null || refreshLoadMoreLayout.isHasBottomMore) ? false : true) {
                return true;
            }
        }
        return false;
    }
}
