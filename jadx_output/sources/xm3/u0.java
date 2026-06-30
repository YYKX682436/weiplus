package xm3;

/* loaded from: classes.dex */
public abstract class u0 {
    public static final com.tencent.mm.plugin.mvvmlist.MvvmList a(com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView) {
        kotlin.jvm.internal.o.g(wxRecyclerView, "<this>");
        xm3.t0 b17 = b(wxRecyclerView);
        if (b17 != null) {
            return b17.I;
        }
        return null;
    }

    public static final xm3.t0 b(com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView) {
        kotlin.jvm.internal.o.g(wxRecyclerView, "<this>");
        androidx.recyclerview.widget.f2 adapter = wxRecyclerView.getAdapter();
        if (adapter instanceof xm3.t0) {
            return (xm3.t0) adapter;
        }
        return null;
    }

    public static final com.tencent.mm.view.recyclerview.WxLinearLayoutManager c(com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView) {
        kotlin.jvm.internal.o.g(wxRecyclerView, "<this>");
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = wxRecyclerView.getLayoutManager();
        if (layoutManager instanceof com.tencent.mm.view.recyclerview.WxLinearLayoutManager) {
            return (com.tencent.mm.view.recyclerview.WxLinearLayoutManager) layoutManager;
        }
        return null;
    }
}
