package gp2;

/* loaded from: classes10.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gp2.l0 f274213d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(gp2.l0 l0Var) {
        super(1);
        this.f274213d = l0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean z17;
        int intValue = ((java.lang.Number) obj).intValue();
        gp2.l0 l0Var = this.f274213d;
        com.tencent.mars.xlog.Log.i(l0Var.t(), "invokeOnTouchMoveCallback pos:" + intValue);
        androidx.recyclerview.widget.RecyclerView recyclerView = l0Var.f274243b;
        if (recyclerView != null) {
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager");
            android.view.View findViewByPosition = ((com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager) layoutManager).findViewByPosition(intValue);
            if (findViewByPosition != null) {
                if (l0Var.f274245d && !l0Var.B) {
                    in5.c cVar = (in5.c) l0Var.f274244c.get(intValue - l0Var.s());
                    if (cVar instanceof so2.h1) {
                        r45.nw1 liveInfo = ((so2.h1) cVar).getFeedObject().getFeedObject().getLiveInfo();
                        z17 = !(liveInfo != null && liveInfo.getInteger(2) == 1);
                    } else {
                        z17 = false;
                    }
                    if (!z17) {
                        android.view.KeyEvent.Callback findViewWithTag = findViewByPosition.findViewWithTag("nearby-live-preview-view-tag");
                        ws5.f fVar = findViewWithTag instanceof ws5.f ? (ws5.f) findViewWithTag : null;
                        if ((fVar != null ? fVar.getF130744m() : true) && !iq.b.p()) {
                            gp2.w0 w0Var = new gp2.w0(findViewByPosition, intValue, l0Var.A(intValue));
                            android.view.View view = w0Var.f274340b;
                            if (view != null) {
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                                arrayList.add(0);
                                java.util.Collections.reverse(arrayList);
                                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/live/play/PlayAudioTipsViewAdapter", "showAudioTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                                yj0.a.f(view, "com/tencent/mm/plugin/finder/nearby/live/play/PlayAudioTipsViewAdapter", "showAudioTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            }
                            boolean z18 = w0Var.f274339a;
                            android.view.View view2 = w0Var.f274341c;
                            android.view.View view3 = w0Var.f274344f;
                            if (z18) {
                                if (view2 != null) {
                                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                                    arrayList2.add(0);
                                    java.util.Collections.reverse(arrayList2);
                                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/nearby/live/play/PlayAudioTipsViewAdapter", "showAudioTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                                    yj0.a.f(view2, "com/tencent/mm/plugin/finder/nearby/live/play/PlayAudioTipsViewAdapter", "showAudioTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                }
                                android.view.View view4 = w0Var.f274342d;
                                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                                arrayList3.add(0);
                                java.util.Collections.reverse(arrayList3);
                                yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/finder/nearby/live/play/PlayAudioTipsViewAdapter", "showAudioTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                                yj0.a.f(view4, "com/tencent/mm/plugin/finder/nearby/live/play/PlayAudioTipsViewAdapter", "showAudioTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                boolean a17 = w0Var.a();
                                android.view.View view5 = w0Var.f274343e;
                                if (a17) {
                                    if (view5 != null) {
                                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                                        arrayList4.add(0);
                                        java.util.Collections.reverse(arrayList4);
                                        yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/plugin/finder/nearby/live/play/PlayAudioTipsViewAdapter", "showAudioTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                                        yj0.a.f(view5, "com/tencent/mm/plugin/finder/nearby/live/play/PlayAudioTipsViewAdapter", "showAudioTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    }
                                } else if (view5 != null) {
                                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                                    arrayList5.add(8);
                                    java.util.Collections.reverse(arrayList5);
                                    yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/finder/nearby/live/play/PlayAudioTipsViewAdapter", "showAudioTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                                    yj0.a.f(view5, "com/tencent/mm/plugin/finder/nearby/live/play/PlayAudioTipsViewAdapter", "showAudioTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                }
                                if (view3 != null) {
                                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                                    arrayList6.add(8);
                                    java.util.Collections.reverse(arrayList6);
                                    yj0.a.d(view3, arrayList6.toArray(), "com/tencent/mm/plugin/finder/nearby/live/play/PlayAudioTipsViewAdapter", "showAudioTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    view3.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                                    yj0.a.f(view3, "com/tencent/mm/plugin/finder/nearby/live/play/PlayAudioTipsViewAdapter", "showAudioTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                }
                            } else {
                                if (view3 != null) {
                                    java.util.ArrayList arrayList7 = new java.util.ArrayList();
                                    java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                                    arrayList7.add(0);
                                    java.util.Collections.reverse(arrayList7);
                                    yj0.a.d(view3, arrayList7.toArray(), "com/tencent/mm/plugin/finder/nearby/live/play/PlayAudioTipsViewAdapter", "showAudioTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    view3.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                                    yj0.a.f(view3, "com/tencent/mm/plugin/finder/nearby/live/play/PlayAudioTipsViewAdapter", "showAudioTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                }
                                android.view.View view6 = w0Var.f274345g;
                                if (view6 != null) {
                                    java.util.ArrayList arrayList8 = new java.util.ArrayList();
                                    java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
                                    arrayList8.add(0);
                                    java.util.Collections.reverse(arrayList8);
                                    yj0.a.d(view6, arrayList8.toArray(), "com/tencent/mm/plugin/finder/nearby/live/play/PlayAudioTipsViewAdapter", "showAudioTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    view6.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                                    yj0.a.f(view6, "com/tencent/mm/plugin/finder/nearby/live/play/PlayAudioTipsViewAdapter", "showAudioTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                }
                                boolean a18 = w0Var.a();
                                android.view.View view7 = w0Var.f274346h;
                                if (a18) {
                                    if (view7 != null) {
                                        java.util.ArrayList arrayList9 = new java.util.ArrayList();
                                        java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
                                        arrayList9.add(0);
                                        java.util.Collections.reverse(arrayList9);
                                        yj0.a.d(view7, arrayList9.toArray(), "com/tencent/mm/plugin/finder/nearby/live/play/PlayAudioTipsViewAdapter", "showAudioTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        view7.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
                                        yj0.a.f(view7, "com/tencent/mm/plugin/finder/nearby/live/play/PlayAudioTipsViewAdapter", "showAudioTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    }
                                } else if (view7 != null) {
                                    java.util.ArrayList arrayList10 = new java.util.ArrayList();
                                    java.lang.ThreadLocal threadLocal7 = zj0.c.f473285a;
                                    arrayList10.add(8);
                                    java.util.Collections.reverse(arrayList10);
                                    yj0.a.d(view7, arrayList10.toArray(), "com/tencent/mm/plugin/finder/nearby/live/play/PlayAudioTipsViewAdapter", "showAudioTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    view7.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
                                    yj0.a.f(view7, "com/tencent/mm/plugin/finder/nearby/live/play/PlayAudioTipsViewAdapter", "showAudioTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                }
                                if (view2 != null) {
                                    java.util.ArrayList arrayList11 = new java.util.ArrayList();
                                    java.lang.ThreadLocal threadLocal8 = zj0.c.f473285a;
                                    arrayList11.add(8);
                                    java.util.Collections.reverse(arrayList11);
                                    yj0.a.d(view2, arrayList11.toArray(), "com/tencent/mm/plugin/finder/nearby/live/play/PlayAudioTipsViewAdapter", "showAudioTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    view2.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
                                    yj0.a.f(view2, "com/tencent/mm/plugin/finder/nearby/live/play/PlayAudioTipsViewAdapter", "showAudioTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                }
                            }
                        }
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
