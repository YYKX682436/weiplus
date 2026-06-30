package l52;

/* loaded from: classes4.dex */
public abstract class k {
    public static final android.view.View a(android.view.View view, int i17) {
        kotlin.jvm.internal.o.g(view, "<this>");
        if (view instanceof android.widget.AbsListView) {
            return ((android.widget.AbsListView) view).getChildAt(i17);
        }
        if (view instanceof androidx.recyclerview.widget.RecyclerView) {
            return ((androidx.recyclerview.widget.RecyclerView) view).getChildAt(i17);
        }
        return null;
    }

    public static final java.lang.Object b(android.view.View view, int i17) {
        java.lang.Object item;
        kotlin.jvm.internal.o.g(view, "<this>");
        if (view instanceof android.widget.AbsListView) {
            android.widget.ListAdapter listAdapter = (android.widget.ListAdapter) ((android.widget.AbsListView) view).getAdapter();
            if (listAdapter == null || (item = listAdapter.getItem(i17)) == null) {
                return null;
            }
        } else {
            if (!(view instanceof androidx.recyclerview.widget.RecyclerView)) {
                return null;
            }
            java.lang.Object adapter = ((androidx.recyclerview.widget.RecyclerView) view).getAdapter();
            com.tencent.mm.pluginsdk.ui.tools.u3 u3Var = adapter instanceof com.tencent.mm.pluginsdk.ui.tools.u3 ? (com.tencent.mm.pluginsdk.ui.tools.u3) adapter : null;
            if (u3Var == null || (item = u3Var.getItem(i17)) == null) {
                return null;
            }
        }
        return item;
    }

    public static final int c(android.view.View view) {
        androidx.recyclerview.widget.f2 adapter;
        kotlin.jvm.internal.o.g(view, "<this>");
        if (view instanceof android.widget.AbsListView) {
            android.widget.ListAdapter listAdapter = (android.widget.ListAdapter) ((android.widget.AbsListView) view).getAdapter();
            if (listAdapter != null) {
                return listAdapter.getCount();
            }
            return 0;
        }
        if (!(view instanceof androidx.recyclerview.widget.RecyclerView) || (adapter = ((androidx.recyclerview.widget.RecyclerView) view).getAdapter()) == null) {
            return 0;
        }
        return adapter.getItemCount();
    }

    public static final int d(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "<this>");
        if (view instanceof android.widget.AbsListView) {
            return ((android.widget.AbsListView) view).getLastVisiblePosition();
        }
        if (view instanceof androidx.recyclerview.widget.RecyclerView) {
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = ((androidx.recyclerview.widget.RecyclerView) view).getLayoutManager();
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null) {
                return linearLayoutManager.y();
            }
        }
        return -1;
    }

    public static final boolean e(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "<this>");
        if (view instanceof android.widget.AbsListView) {
            if (((android.widget.AbsListView) view).getAdapter() != null) {
                return true;
            }
        } else if ((view instanceof androidx.recyclerview.widget.RecyclerView) && ((androidx.recyclerview.widget.RecyclerView) view).getAdapter() != null) {
            return true;
        }
        return false;
    }
}
