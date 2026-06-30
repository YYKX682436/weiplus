package zp2;

/* loaded from: classes2.dex */
public abstract class b {
    public final java.util.ArrayList a(int i17, int i18, androidx.recyclerview.widget.RecyclerView recyclerView, com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter) {
        r45.d94 d94Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (i17 <= i18) {
            while (true) {
                in5.c cVar = (in5.c) kz5.n0.a0(wxRecyclerAdapter.getData(), i17);
                if (cVar != null) {
                    boolean z17 = false;
                    if (cVar instanceof wp2.b) {
                        wp2.b bVar = (wp2.b) cVar;
                        d94Var = bVar.f448388t;
                        r45.d94 d94Var2 = new r45.d94();
                        d94Var2.set(0, java.lang.Long.valueOf(bVar.getFeedObject().getFeedObject().getId()));
                        bVar.f448388t = d94Var2;
                    } else {
                        d94Var = null;
                    }
                    if (d94Var != null) {
                        arrayList.add(d94Var);
                        z17 = true;
                    }
                    if (!z17) {
                        java.lang.Object w07 = wxRecyclerAdapter.w0(cVar.h());
                        zp2.a aVar = w07 instanceof zp2.a ? (zp2.a) w07 : null;
                        if (aVar != null) {
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            androidx.recyclerview.widget.RecyclerView b17 = aVar.b();
                            if (b17 != null) {
                                arrayList2 = b(b17);
                            }
                            if (arrayList2.size() > 0) {
                                arrayList.addAll(arrayList2);
                            }
                        }
                    }
                }
                if (i17 == i18) {
                    break;
                }
                i17++;
            }
        }
        return arrayList;
    }

    public final java.util.ArrayList b(androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter : null;
        if (wxRecyclerAdapter != null) {
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager) {
                androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) layoutManager;
                arrayList.addAll(a(linearLayoutManager.w(), linearLayoutManager.y(), recyclerView, wxRecyclerAdapter));
            } else if (layoutManager instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager) {
                androidx.recyclerview.widget.StaggeredGridLayoutManager staggeredGridLayoutManager = (androidx.recyclerview.widget.StaggeredGridLayoutManager) layoutManager;
                arrayList.addAll(a(staggeredGridLayoutManager.u(new int[staggeredGridLayoutManager.f11920d])[0], staggeredGridLayoutManager.v(new int[staggeredGridLayoutManager.f11920d])[staggeredGridLayoutManager.f11920d - 1], recyclerView, wxRecyclerAdapter));
            }
        }
        return arrayList;
    }
}
