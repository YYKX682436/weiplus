package rc2;

/* loaded from: classes2.dex */
public final class f extends com.tencent.mm.ui.component.UIComponent implements zy2.y6 {

    /* renamed from: d, reason: collision with root package name */
    public in5.s0 f393941d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f393942e;

    /* renamed from: f, reason: collision with root package name */
    public kotlinx.coroutines.r2 f393943f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f393942e = new java.util.ArrayList();
    }

    public static final android.graphics.Rect O6(rc2.f fVar, r45.jl6 jl6Var, android.graphics.Rect rect) {
        fVar.getClass();
        float width = rect.width();
        float height = rect.height();
        android.graphics.Rect rect2 = new android.graphics.Rect(rect.left + ((int) (((java.lang.Number) jl6Var.getList(0).get(0)).floatValue() * width)), rect.top + ((int) (((java.lang.Number) jl6Var.getList(0).get(1)).floatValue() * height)), rect.left + ((int) (((java.lang.Number) jl6Var.getList(0).get(2)).floatValue() * width)), rect.top + ((int) (((java.lang.Number) jl6Var.getList(0).get(3)).floatValue() * height)));
        fVar.U6(rect2, "textBox");
        return rect2;
    }

    public static final void P6(rc2.f fVar, android.view.View view, android.graphics.Rect rect) {
        boolean z17;
        fVar.getClass();
        if (view != null) {
            if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
                z17 = true;
            } else {
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                z17 = false;
            }
            if (z17) {
                if (!(view instanceof android.view.ViewGroup)) {
                    com.tencent.mars.xlog.Log.w("FinderFeedAlphaManagerUIC", "drawRect: view is not ViewGroup, cannot add overlay");
                    return;
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("rect_overlay");
                sb6.append(java.lang.System.currentTimeMillis());
                sb6.append('_');
                java.util.ArrayList arrayList = (java.util.ArrayList) fVar.f393942e;
                sb6.append(arrayList.size());
                java.lang.String sb7 = sb6.toString();
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                rc2.b bVar = new rc2.b(rect, view, viewGroup.getContext());
                bVar.setTag(sb7);
                bVar.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
                viewGroup.addView(bVar);
                bVar.invalidate();
                arrayList.add(sb7);
                com.tencent.mars.xlog.Log.i("FinderFeedAlphaManagerUIC", "drawRect: added overlay view with tag " + sb7 + ", total overlays: " + arrayList.size());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Q6(android.view.View view, java.util.List list) {
        if ((view instanceof rc2.g) && ((rc2.g) view).getF106305w()) {
            list.add(view);
        }
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.View childAt = viewGroup.getChildAt(i17);
                kotlin.jvm.internal.o.d(childAt);
                Q6(childAt, list);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void R6(android.view.View view, java.util.List list) {
        if ((view instanceof rc2.g) && ((rc2.g) view).getF106306x()) {
            list.add(view);
        }
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.View childAt = viewGroup.getChildAt(i17);
                kotlin.jvm.internal.o.d(childAt);
                R6(childAt, list);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void S6() {
        java.util.ArrayList<android.view.View> arrayList;
        boolean z17;
        android.view.View view;
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.L9).getValue()).r()).booleanValue()) {
            com.tencent.mars.xlog.Log.i("FinderFeedAlphaManagerUIC", "dismissAlphaStatus");
            in5.s0 s0Var = this.f393941d;
            if (s0Var == null || (view = s0Var.itemView) == null) {
                arrayList = null;
            } else {
                arrayList = new java.util.ArrayList();
                Q6(view, arrayList);
            }
            if (arrayList != null) {
                z17 = false;
                for (android.view.View view2 : arrayList) {
                    if (view2 instanceof rc2.g) {
                        if (!(((rc2.g) view2).getF106307y() == 1.0f)) {
                            z17 = true;
                        }
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList2.add(java.lang.Float.valueOf(1.0f));
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/alpha/FinderFeedAlphaManagerUIC", "dismissAlphaStatus", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                        yj0.a.f(view2, "com/tencent/mm/plugin/finder/feed/alpha/FinderFeedAlphaManagerUIC", "dismissAlphaStatus", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        ((rc2.g) view2).setAlphaClickable(true);
                    }
                }
            } else {
                z17 = false;
            }
            if (z17) {
                W6(false);
            }
        }
    }

    public final android.graphics.Rect T6(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "<this>");
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i17 = iArr[0];
        return new android.graphics.Rect(i17, iArr[1], view.getWidth() + i17, iArr[1] + view.getHeight());
    }

    public final void U6(android.graphics.Rect rect, java.lang.String from) {
        kotlin.jvm.internal.o.g(rect, "<this>");
        kotlin.jvm.internal.o.g(from, "from");
        com.tencent.mars.xlog.Log.i("FinderFeedAlphaManagerUIC", "rect: " + from + ", left: " + rect.left + ", right: " + rect.right + ", top: " + rect.top + ", bottom: " + rect.bottom);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [android.view.View] */
    public final void V6() {
        java.util.List list = this.f393942e;
        if (list.isEmpty()) {
            com.tencent.mars.xlog.Log.i("FinderFeedAlphaManagerUIC", "removeAllDrawRects: no overlays to remove");
            return;
        }
        in5.s0 s0Var = this.f393941d;
        android.view.ViewGroup viewGroup = s0Var != null ? s0Var.itemView : null;
        if (viewGroup == null) {
            com.tencent.mars.xlog.Log.w("FinderFeedAlphaManagerUIC", "removeAllDrawRects: itemView is null");
            list.clear();
            return;
        }
        if (!(viewGroup instanceof android.view.ViewGroup)) {
            com.tencent.mars.xlog.Log.w("FinderFeedAlphaManagerUIC", "removeAllDrawRects: itemView is not ViewGroup");
            list.clear();
            return;
        }
        int i17 = 0;
        for (java.lang.String str : kz5.n0.S0(list)) {
            android.view.View findViewWithTag = viewGroup.findViewWithTag(str);
            if (!(findViewWithTag instanceof android.view.View)) {
                findViewWithTag = null;
            }
            if (findViewWithTag != null) {
                viewGroup.removeView(findViewWithTag);
                i17++;
                com.tencent.mars.xlog.Log.i("FinderFeedAlphaManagerUIC", "removeAllDrawRects: removed overlay with tag " + str);
            }
        }
        list.clear();
        com.tencent.mars.xlog.Log.i("FinderFeedAlphaManagerUIC", "removeAllDrawRects: removed " + i17 + " overlays");
    }

    public final void W6(boolean z17) {
        in5.s0 s0Var = this.f393941d;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = s0Var != null ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) s0Var.f293125i : null;
        if (baseFinderFeed == null) {
            return;
        }
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        jz5.l[] lVarArr = new jz5.l[6];
        lVarArr[0] = new jz5.l("is_transparent", java.lang.Integer.valueOf(z17 ? 1 : 0));
        lVarArr[1] = new jz5.l("feed_id", pm0.v.u(baseFinderFeed.getFeedObject().getFeedObject().getId()));
        lVarArr[2] = new jz5.l("finder_context_id", V6 != null ? V6.getString(1) : null);
        lVarArr[3] = new jz5.l("finder_tab_context_id", V6 != null ? V6.getString(2) : null);
        lVarArr[4] = new jz5.l("extra_info", V6 != null ? V6.getString(11) : null);
        lVarArr[5] = new jz5.l("comment_scene", V6 != null ? java.lang.Integer.valueOf(V6.getInteger(5)) : null);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("trigger_lower_half_screen_translucent", null, kz5.c1.k(lVarArr), 1, false);
    }

    public final void X6() {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.L9).getValue()).r()).booleanValue()) {
            kotlinx.coroutines.r2 r2Var = this.f393943f;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            this.f393943f = pf5.e.launchUI$default(this, null, null, new rc2.e(this, null), 3, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Y6(android.view.View view, int i17) {
        android.view.View view2;
        if (view == null) {
            in5.s0 s0Var = this.f393941d;
            view2 = s0Var != null ? s0Var.p(com.tencent.mm.R.id.ghd) : null;
            if (view2 == null) {
                return;
            }
        } else {
            view2 = view;
        }
        java.lang.Object parent = view2.getParent();
        android.view.View view3 = parent instanceof android.view.View ? (android.view.View) parent : null;
        if (view3 == null) {
            return;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view3.findViewById(com.tencent.mm.R.id.f484486ee3);
        int childCount = viewGroup.getChildCount();
        for (int i18 = 0; i18 < childCount; i18++) {
            android.view.View childAt = viewGroup.getChildAt(i18);
            if (childAt.getId() != com.tencent.mm.R.id.r8c) {
                if (i17 != 0) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Float.valueOf(0.0f));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(childAt, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/alpha/FinderFeedAlphaManagerUIC", "setAlphaForSeekStatusChange", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    childAt.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                    yj0.a.f(childAt, "com/tencent/mm/plugin/finder/feed/alpha/FinderFeedAlphaManagerUIC", "setAlphaForSeekStatusChange", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                } else if (childAt instanceof rc2.g) {
                    float f106307y = ((rc2.g) childAt).getF106307y();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(java.lang.Float.valueOf(f106307y));
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(childAt, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/alpha/FinderFeedAlphaManagerUIC", "setAlphaForSeekStatusChange", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    childAt.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                    yj0.a.f(childAt, "com/tencent/mm/plugin/finder/feed/alpha/FinderFeedAlphaManagerUIC", "setAlphaForSeekStatusChange", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                } else {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                    arrayList3.add(java.lang.Float.valueOf(1.0f));
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(childAt, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/alpha/FinderFeedAlphaManagerUIC", "setAlphaForSeekStatusChange", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    childAt.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
                    yj0.a.f(childAt, "com/tencent/mm/plugin/finder/feed/alpha/FinderFeedAlphaManagerUIC", "setAlphaForSeekStatusChange", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                }
            }
        }
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) view3.findViewById(com.tencent.mm.R.id.qma);
        int childCount2 = viewGroup2.getChildCount();
        for (int i19 = 0; i19 < childCount2; i19++) {
            android.view.View childAt2 = viewGroup2.getChildAt(i19);
            if (childAt2.getId() == com.tencent.mm.R.id.f484896qk3) {
                com.tencent.mars.xlog.Log.i("FinderFeedNewSeekBarLayout", "finder_new_seek_bar_layout alpha: " + childAt2.getAlpha() + ", visibility: " + childAt2.getVisibility() + ", parentAlpha: " + viewGroup2.getAlpha());
            } else if (i17 != 0) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                arrayList4.add(java.lang.Float.valueOf(0.0f));
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(childAt2, arrayList4.toArray(), "com/tencent/mm/plugin/finder/feed/alpha/FinderFeedAlphaManagerUIC", "setAlphaForSeekStatusChange", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                childAt2.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
                yj0.a.f(childAt2, "com/tencent/mm/plugin/finder/feed/alpha/FinderFeedAlphaManagerUIC", "setAlphaForSeekStatusChange", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            } else if (childAt2 instanceof rc2.g) {
                float f106307y2 = ((rc2.g) childAt2).getF106307y();
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
                arrayList5.add(java.lang.Float.valueOf(f106307y2));
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(childAt2, arrayList5.toArray(), "com/tencent/mm/plugin/finder/feed/alpha/FinderFeedAlphaManagerUIC", "setAlphaForSeekStatusChange", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                childAt2.setAlpha(((java.lang.Float) arrayList5.get(0)).floatValue());
                yj0.a.f(childAt2, "com/tencent/mm/plugin/finder/feed/alpha/FinderFeedAlphaManagerUIC", "setAlphaForSeekStatusChange", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            } else {
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
                arrayList6.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(childAt2, arrayList6.toArray(), "com/tencent/mm/plugin/finder/feed/alpha/FinderFeedAlphaManagerUIC", "setAlphaForSeekStatusChange", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                childAt2.setAlpha(((java.lang.Float) arrayList6.get(0)).floatValue());
                yj0.a.f(childAt2, "com/tencent/mm/plugin/finder/feed/alpha/FinderFeedAlphaManagerUIC", "setAlphaForSeekStatusChange", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
        }
        android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) view3.findViewById(com.tencent.mm.R.id.g1y);
        if (i17 == 0) {
            viewGroup3.setAlpha(1.0f);
        } else {
            viewGroup3.setAlpha(0.0f);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        final androidx.appcompat.app.AppCompatActivity activity = getActivity();
        new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ActivityToggleAnimEndEvent>(activity) { // from class: com.tencent.mm.plugin.finder.feed.alpha.FinderFeedAlphaManagerUIC$onCreateAfter$1
            {
                this.__eventId = 2063121603;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ActivityToggleAnimEndEvent activityToggleAnimEndEvent) {
                com.tencent.mm.autogen.events.ActivityToggleAnimEndEvent event = activityToggleAnimEndEvent;
                kotlin.jvm.internal.o.g(event, "event");
                rc2.f fVar = rc2.f.this;
                if (fVar.getActivity().hashCode() != event.f53967g.f6715a) {
                    return false;
                }
                com.tencent.mars.xlog.Log.i("FinderFeedAlphaManagerUIC", "ActivityToggleAnimEndEvent: notify setAlphaForOcrBox");
                pm0.v.X(new rc2.c(fVar));
                return false;
            }
        }.alive();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f393942e = new java.util.ArrayList();
    }
}
