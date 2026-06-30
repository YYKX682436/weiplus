package el2;

/* loaded from: classes3.dex */
public final class b0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ el2.i0 f253749d;

    public b0(el2.i0 i0Var) {
        this.f253749d = i0Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        al2.g gVar = (al2.g) obj;
        r45.jg1 jg1Var = gVar.f5843e;
        el2.i0 i0Var = this.f253749d;
        if (jg1Var != null) {
            i0Var.f253810J = jg1Var;
        }
        int i17 = gVar.f5839a;
        java.lang.String str = gVar.f5844f;
        int i18 = gVar.f5840b;
        if (i18 == 1) {
            if (i17 != 0) {
                if (str == null || str.length() == 0) {
                    str = i0Var.f118183e.getString(com.tencent.mm.R.string.dgq);
                }
                kotlin.jvm.internal.o.d(str);
                db5.t7.makeText(i0Var.f118183e, str, 0).show();
                i0Var.m0(true);
                return;
            }
            java.util.LinkedList linkedList = gVar.f5841c;
            if (linkedList != null) {
                bm2.v0 v0Var = i0Var.Q;
                v0Var.getClass();
                v0Var.f22362e = linkedList;
                v0Var.notifyDataSetChanged();
            }
            i0Var.f253810J = gVar.f5843e;
            if (i0Var.P()) {
                if (linkedList != null && linkedList.size() == 0) {
                    android.view.View view = i0Var.N;
                    if (view != null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(0);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/view/promote/FinderLiveAnchorPromoteView", "showOrHideEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/view/promote/FinderLiveAnchorPromoteView", "showOrHideEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = i0Var.R;
                    if (wxRecyclerView != null) {
                        wxRecyclerView.setVisibility(8);
                    }
                } else {
                    android.view.View view2 = i0Var.N;
                    if (view2 != null) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                        arrayList2.add(8);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/view/promote/FinderLiveAnchorPromoteView", "showOrHideEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/plugin/view/promote/FinderLiveAnchorPromoteView", "showOrHideEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = i0Var.R;
                    if (wxRecyclerView2 != null) {
                        wxRecyclerView2.setVisibility(0);
                    }
                }
                r45.jg1 jg1Var2 = i0Var.f253810J;
                if (jg1Var2 != null) {
                    com.tencent.mm.plugin.finder.live.view.gb gbVar = (com.tencent.mm.plugin.finder.live.view.gb) ((jz5.n) i0Var.V).getValue();
                    wt2.a aVar = i0Var.I;
                    if (aVar != null) {
                        gbVar.f0(aVar, jg1Var2, i0Var.Q.f22362e);
                        return;
                    } else {
                        kotlin.jvm.internal.o.o("presenter");
                        throw null;
                    }
                }
                return;
            }
            return;
        }
        r45.z42 z42Var = gVar.f5842d;
        if (i18 == 2) {
            ((com.tencent.mm.plugin.finder.live.view.gb) ((jz5.n) i0Var.V).getValue()).s(true);
            android.content.Context context = i0Var.f118183e;
            if (i17 != -200146) {
                if (i17 == 0) {
                    i0Var.k0().f0();
                    i0Var.m0(false);
                    i0Var.p0();
                    return;
                } else {
                    if (str == null || str.length() == 0) {
                        str = context.getString(com.tencent.mm.R.string.e8m);
                    }
                    kotlin.jvm.internal.o.d(str);
                    db5.t7.makeText(context, str, 0).show();
                    i0Var.m0(true);
                    return;
                }
            }
            if (z42Var != null && z42Var.getInteger(1) == 7) {
                com.tencent.mm.plugin.finder.live.view.c4 k07 = i0Var.k0();
                java.lang.String string = context.getString(com.tencent.mm.R.string.e9l);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                k07.getClass();
                android.widget.TextView textView = k07.L;
                if (textView != null) {
                    textView.setText(string);
                }
                android.widget.TextView textView2 = k07.L;
                if (textView2 != null) {
                    textView2.setTextColor(k07.f118183e.getResources().getColor(com.tencent.mm.R.color.Red_100));
                }
                android.widget.TextView textView3 = k07.L;
                if (textView3 != null) {
                    textView3.setOnClickListener(null);
                }
                android.widget.TextView textView4 = k07.L;
                if (textView4 != null) {
                    textView4.setVisibility(0);
                }
            } else {
                db5.t7.makeText(context, context.getString(com.tencent.mm.R.string.e8t), 0).show();
            }
            i0Var.m0(true);
            return;
        }
        if (i18 != 3) {
            if (i18 != 4) {
                return;
            }
            if (i17 == 0) {
                if (z42Var != null && z42Var.getBoolean(3)) {
                    android.content.Context context2 = i0Var.f118183e;
                    db5.t7.i(context2, context2.getResources().getString(com.tencent.mm.R.string.e9j), com.tencent.mm.R.raw.icons_filled_done);
                }
                el2.i0.n0(i0Var, false, 1, null);
                return;
            }
            if (str != null && str.length() != 0) {
                r2 = false;
            }
            if (r2) {
                str = i0Var.f118183e.getString(com.tencent.mm.R.string.dgq);
            }
            kotlin.jvm.internal.o.d(str);
            db5.t7.makeText(i0Var.f118183e, str, 0).show();
            return;
        }
        if (i17 != 0) {
            if (str != null && str.length() != 0) {
                r2 = false;
            }
            if (r2) {
                str = i0Var.f118183e.getString(com.tencent.mm.R.string.dgq);
            }
            kotlin.jvm.internal.o.d(str);
            db5.t7.makeText(i0Var.f118183e, str, 0).show();
            return;
        }
        if (z42Var != null) {
            bm2.v0 v0Var2 = i0Var.Q;
            v0Var2.getClass();
            java.util.LinkedList linkedList2 = v0Var2.f22362e;
            if (!(linkedList2 == null || linkedList2.isEmpty())) {
                java.util.LinkedList linkedList3 = v0Var2.f22362e;
                if (linkedList3 != null) {
                    java.util.Iterator it = linkedList3.iterator();
                    int i19 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i19 = -1;
                            break;
                        } else {
                            if (z42Var.getLong(0) == ((r45.z42) it.next()).getLong(0)) {
                                break;
                            } else {
                                i19++;
                            }
                        }
                    }
                    java.util.LinkedList linkedList4 = v0Var2.f22362e;
                    if (linkedList4 != null) {
                    }
                    v0Var2.notifyItemRemoved(i19);
                }
                java.util.LinkedList linkedList5 = v0Var2.f22362e;
                if (linkedList5 != null) {
                    linkedList5.isEmpty();
                }
            }
            com.tencent.mm.plugin.finder.live.view.k7 l07 = i0Var.l0();
            l07.s(true);
            bm2.x5 x5Var = l07.Q;
            if (x5Var != null) {
                java.util.LinkedList linkedList6 = x5Var.f22432f;
                if (linkedList6 != null) {
                    linkedList6.clear();
                }
                x5Var.notifyDataSetChanged();
            }
            i0Var.m0(false);
            i0Var.p0();
        }
    }
}
