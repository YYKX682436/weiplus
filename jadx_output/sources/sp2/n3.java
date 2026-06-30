package sp2;

/* loaded from: classes2.dex */
public final class n3 {

    /* renamed from: a, reason: collision with root package name */
    public static final sp2.n3 f411116a = new sp2.n3();

    public final java.util.ArrayList a(int i17, int i18, androidx.recyclerview.widget.RecyclerView recyclerView, com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter, java.util.ArrayList arrayList) {
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (i17 <= i18) {
            while (true) {
                so2.j5 j5Var = (so2.j5) kz5.n0.a0(wxRecyclerAdapter.getData(), i17);
                if (j5Var != null) {
                    sp2.n3 n3Var = f411116a;
                    boolean z17 = true;
                    if (j5Var instanceof wp2.b) {
                        bq2.b b17 = n3Var.b(arrayList, j5Var, i17, recyclerView, wxRecyclerAdapter);
                        if (b17 != null) {
                            arrayList2.add(b17);
                        }
                    } else if (j5Var instanceof so2.h1) {
                        bq2.b b18 = n3Var.b(arrayList, j5Var, i17, recyclerView, wxRecyclerAdapter);
                        if (b18 != null) {
                            arrayList2.add(b18);
                        }
                    } else if (j5Var instanceof vp2.c) {
                        bq2.b b19 = n3Var.b(arrayList, j5Var, i17, recyclerView, wxRecyclerAdapter);
                        if (b19 != null) {
                            arrayList2.add(b19);
                        }
                    } else if (j5Var instanceof vp2.i0) {
                        bq2.b b27 = n3Var.b(arrayList, j5Var, i17, recyclerView, wxRecyclerAdapter);
                        if (b27 != null) {
                            arrayList2.add(b27);
                        }
                    } else if (j5Var instanceof vp2.s) {
                        bq2.b b28 = n3Var.b(arrayList, j5Var, i17, recyclerView, wxRecyclerAdapter);
                        if (b28 != null) {
                            arrayList2.add(b28);
                        }
                    } else {
                        z17 = false;
                    }
                    if (!z17) {
                        java.lang.Object w07 = wxRecyclerAdapter.w0(j5Var.h());
                        bq2.a aVar = w07 instanceof bq2.a ? (bq2.a) w07 : null;
                        if (aVar != null) {
                            java.util.ArrayList a17 = aVar.a(arrayList);
                            if (a17.size() > 0) {
                                arrayList2.addAll(a17);
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
        return arrayList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0128, code lost:
    
        if (r5.getBoolean(5) == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0140, code lost:
    
        if (r5.getBoolean(5) == false) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x015a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x000e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final bq2.b b(java.util.ArrayList r16, so2.j5 r17, int r18, androidx.recyclerview.widget.RecyclerView r19, com.tencent.mm.view.recyclerview.WxRecyclerAdapter r20) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sp2.n3.b(java.util.ArrayList, so2.j5, int, androidx.recyclerview.widget.RecyclerView, com.tencent.mm.view.recyclerview.WxRecyclerAdapter):bq2.b");
    }

    public final java.util.ArrayList c(androidx.recyclerview.widget.RecyclerView recyclerView, com.tencent.mm.view.recyclerview.WxRecyclerAdapter adapter, java.util.ArrayList collectScene) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(collectScene, "collectScene");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager) {
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) layoutManager;
            arrayList.addAll(a(linearLayoutManager.w(), linearLayoutManager.y(), recyclerView, adapter, collectScene));
        } else if (layoutManager instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager) {
            androidx.recyclerview.widget.StaggeredGridLayoutManager staggeredGridLayoutManager = (androidx.recyclerview.widget.StaggeredGridLayoutManager) layoutManager;
            arrayList.addAll(a(staggeredGridLayoutManager.u(new int[staggeredGridLayoutManager.f11920d])[0], staggeredGridLayoutManager.v(new int[staggeredGridLayoutManager.f11920d])[staggeredGridLayoutManager.f11920d - 1], recyclerView, adapter, collectScene));
        }
        return arrayList;
    }
}
