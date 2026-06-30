package hn4;

/* loaded from: classes15.dex */
public class e extends fn4.d {
    public static androidx.recyclerview.widget.k3 e(fn4.b bVar) {
        android.view.View view;
        int i17 = 0;
        while (true) {
            if (i17 >= bVar.getRecyclerView().getChildCount()) {
                view = null;
                break;
            }
            view = bVar.getRecyclerView().getChildAt(i17);
            androidx.recyclerview.widget.k3 w07 = bVar.getRecyclerView().w0(view);
            if (view.getTag() != null && view.getTag().equals("video") && view.getTop() > 0 && w07.getAdapterPosition() >= 0) {
                break;
            }
            i17++;
        }
        if (view != null) {
            return bVar.getRecyclerView().w0(view);
        }
        return null;
    }

    @Override // fn4.d
    public void b(fn4.b bVar) {
        androidx.recyclerview.widget.RecyclerView recyclerView = bVar.getRecyclerView();
        androidx.recyclerview.widget.k3 e17 = e(bVar);
        if (e17 instanceof hn4.d0) {
            hn4.d0 d0Var = (hn4.d0) e17;
            int u17 = d0Var != null ? d0Var.u() : -1;
            if (u17 != bVar.Y2() && bVar.I2().f264576e) {
                bVar.I2().m();
            }
            bVar.t();
            for (int i17 = 0; i17 < recyclerView.getChildCount(); i17++) {
                android.view.View childAt = recyclerView.getChildAt(i17);
                if (childAt.getTag() != null) {
                    hn4.d0 d0Var2 = (hn4.d0) bVar.getRecyclerView().w0(childAt);
                    if (d0Var2.u() == u17) {
                        d0Var2.v();
                        d0Var2.m();
                        if (!bVar.I2().f264576e) {
                            hn4.z zVar = (hn4.z) d0Var2.f282550h;
                            android.view.View view = zVar.f264521s;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                            arrayList.add(8);
                            java.util.Collections.reverse(arrayList);
                            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer", "setListScrollPlayContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                            yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer", "setListScrollPlayContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            zVar.f264512g.setVisibility(0);
                            zVar.f264510e.setVisibility(8);
                            zVar.f264509d.setVisibility(8);
                            zVar.f264525w.setVisibility(8);
                        }
                    } else {
                        d0Var2.w();
                        hn4.z zVar2 = (hn4.z) d0Var2.f282550h;
                        android.view.View view2 = zVar2.f264521s;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                        arrayList2.add(0);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer", "setListScrollStopContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(view2, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer", "setListScrollStopContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        zVar2.f264512g.setVisibility(0);
                        zVar2.f264510e.setVisibility(8);
                        zVar2.f264509d.setVisibility(8);
                        zVar2.f264525w.setVisibility(8);
                        android.view.View view3 = zVar2.f264523u;
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        arrayList3.add(0);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer", "setListScrollStopContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                        yj0.a.f(view3, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer", "setListScrollStopContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        android.view.View view4 = zVar2.f264522t;
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        arrayList4.add(8);
                        java.util.Collections.reverse(arrayList4);
                        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer", "setListScrollStopContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                        yj0.a.f(view4, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer", "setListScrollStopContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        zVar2.f264515m.setVisibility(0);
                        zVar2.f264516n.setVisibility(8);
                        zVar2.f264519q.setVisibility(8);
                    }
                }
            }
        }
    }

    @Override // fn4.d
    public void c(fn4.b bVar) {
        androidx.recyclerview.widget.k3 e17 = e(bVar);
        if (e17 instanceof hn4.d0) {
            hn4.d0 d0Var = (hn4.d0) e17;
            if (!bVar.I2().f264576e) {
                if (bVar.s1().b()) {
                    d0Var.s(true);
                } else {
                    d0Var.f282550h.h();
                    bVar.I2().m();
                }
            }
            d0Var.m();
            bVar.X1(d0Var.u());
            bVar.o4().c();
        }
    }

    @Override // fn4.d
    public void d(fn4.b bVar, int i17) {
        android.view.View view = null;
        for (int i18 = 0; i18 < bVar.getRecyclerView().getChildCount(); i18++) {
            view = bVar.getRecyclerView().getChildAt(i18);
            if (bVar.getRecyclerView().u0(view) == i17) {
                break;
            }
        }
        if (view != null) {
            bVar.getRecyclerView().smoothScrollBy(0, bVar.d2().e(view) - bVar.l4());
        }
    }
}
