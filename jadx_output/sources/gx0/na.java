package gx0;

/* loaded from: classes5.dex */
public final class na implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw0.d f276762d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.ac f276763e;

    public na(cw0.d dVar, gx0.ac acVar) {
        this.f276762d = dVar;
        this.f276763e = acVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        android.view.View view;
        android.view.View view2;
        ex0.r rVar = (ex0.r) obj;
        ug.m mVar = rVar != null ? rVar.f257169c : null;
        ug.m mVar2 = ug.m.Narration;
        cw0.d dVar = this.f276762d;
        gx0.ac acVar = this.f276763e;
        if (mVar == mVar2) {
            kotlin.jvm.internal.o.e(rVar, "null cannot be cast to non-null type com.tencent.mm.mj_publisher.finder.movie_composing.timeline.viewmodel.NarrationSegmentViewModel");
            ex0.q qVar = (ex0.q) rVar;
            dVar.getClass();
            android.view.View findViewWithTag = dVar.getNarrationSegmentEditOptContainer$plugin_mj_template_release().findViewWithTag(fv0.a.f266947s);
            android.view.View findViewWithTag2 = dVar.getNarrationSegmentEditOptContainer$plugin_mj_template_release().findViewWithTag(cw0.a.f222602d);
            android.view.View findViewWithTag3 = dVar.getNarrationSegmentEditOptContainer$plugin_mj_template_release().findViewWithTag(fv0.a.f266949u);
            android.view.View findViewWithTag4 = dVar.getNarrationSegmentEditOptContainer$plugin_mj_template_release().findViewWithTag(fv0.a.f266950v);
            if (qVar.f257165t != vu0.u.f440164i) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                view = findViewWithTag4;
                view2 = findViewWithTag3;
                yj0.a.d(findViewWithTag, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/NarrationPanel", "showNarrationSegmentEditOption", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/timeline/viewmodel/NarrationSegmentViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewWithTag.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewWithTag, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/NarrationPanel", "showNarrationSegmentEditOption", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/timeline/viewmodel/NarrationSegmentViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewWithTag2, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/NarrationPanel", "showNarrationSegmentEditOption", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/timeline/viewmodel/NarrationSegmentViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewWithTag2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewWithTag2, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/NarrationPanel", "showNarrationSegmentEditOption", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/timeline/viewmodel/NarrationSegmentViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                view = findViewWithTag4;
                view2 = findViewWithTag3;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(findViewWithTag, arrayList3.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/NarrationPanel", "showNarrationSegmentEditOption", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/timeline/viewmodel/NarrationSegmentViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewWithTag.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(findViewWithTag, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/NarrationPanel", "showNarrationSegmentEditOption", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/timeline/viewmodel/NarrationSegmentViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(findViewWithTag2, arrayList4.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/NarrationPanel", "showNarrationSegmentEditOption", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/timeline/viewmodel/NarrationSegmentViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewWithTag2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(findViewWithTag2, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/NarrationPanel", "showNarrationSegmentEditOption", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/timeline/viewmodel/NarrationSegmentViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            boolean z17 = !qVar.I().isEmpty();
            kotlin.jvm.internal.o.d(view2);
            dVar.B(view2, z17);
            kotlin.jvm.internal.o.d(view);
            dVar.B(view, z17);
            dVar.getNarrationLayout$plugin_mj_template_release().setVisibility(8);
            android.widget.HorizontalScrollView horizontalScrollView = dVar.C;
            if (horizontalScrollView == null) {
                kotlin.jvm.internal.o.o("containerOfOptContainer");
                throw null;
            }
            horizontalScrollView.setVisibility(0);
            android.view.View view3 = dVar.E;
            if (view3 == null) {
                kotlin.jvm.internal.o.o("longPlayCursor");
                throw null;
            }
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view3, arrayList5.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/NarrationPanel", "showNarrationSegmentEditOption", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/timeline/viewmodel/NarrationSegmentViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/NarrationPanel", "showNarrationSegmentEditOption", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/timeline/viewmodel/NarrationSegmentViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            gx0.ac.a8(acVar, rVar);
            com.tencent.maas.moviecomposing.segments.Segment segment = qVar.f257167a;
            kotlin.jvm.internal.o.e(segment, "null cannot be cast to non-null type com.tencent.maas.moviecomposing.segments.NarrationSegment");
            jz5.g gVar = acVar.C;
            gx0.x4 x4Var = (gx0.x4) ((jz5.n) gVar).getValue();
            com.tencent.maas.base.MJID mjid = ((com.tencent.maas.moviecomposing.segments.NarrationSegment) segment).f48532a;
            kotlin.jvm.internal.o.f(mjid, "getSegmentID(...)");
            if (!x4Var.f7(mjid)) {
                du0.o.o7((gx0.x4) ((jz5.n) gVar).getValue(), mjid, false, !acVar.c8().isPlaying(), 2, null);
            }
        } else {
            dVar.getNarrationLayout$plugin_mj_template_release().setVisibility(0);
            android.widget.HorizontalScrollView horizontalScrollView2 = dVar.C;
            if (horizontalScrollView2 == null) {
                kotlin.jvm.internal.o.o("containerOfOptContainer");
                throw null;
            }
            horizontalScrollView2.setVisibility(8);
            android.view.View view4 = dVar.E;
            if (view4 == null) {
                kotlin.jvm.internal.o.o("longPlayCursor");
                throw null;
            }
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList6.add(0);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view4, arrayList6.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/NarrationPanel", "showNarrationLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/NarrationPanel", "showNarrationLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((gx0.x4) ((jz5.n) acVar.C).getValue()).U6(false);
        }
        acVar.i8();
    }
}
