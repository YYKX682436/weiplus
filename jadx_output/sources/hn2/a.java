package hn2;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final hn2.a f282498a = new hn2.a();

    public final void a(hn2.l holder, boolean z17, boolean z18, nm2.a aVar) {
        kotlin.jvm.internal.o.g(holder, "holder");
        android.content.Context context = holder.getF119781w().getContext();
        int color = context.getResources().getColor(com.tencent.mm.R.color.ajy);
        int color2 = context.getResources().getColor(com.tencent.mm.R.color.f479043ak3);
        int ordinal = (!z17 ? hn2.b.f282499d : !z18 ? hn2.b.f282500e : aVar instanceof nm2.c ? hn2.b.f282501f : aVar instanceof nm2.b ? hn2.b.f282502g : hn2.b.f282500e).ordinal();
        if (ordinal == 0) {
            android.view.View auditionPlayView = holder.getAuditionPlayView();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(auditionPlayView, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/common/FinderLiveAuditionUIHelper", "applyUIState", "(Lcom/tencent/mm/plugin/finder/live/widget/singlist/common/IFinderLiveAuditionViewHolder;Lcom/tencent/mm/plugin/finder/live/widget/singlist/common/FinderLiveAuditionUIState;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            auditionPlayView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(auditionPlayView, "com/tencent/mm/plugin/finder/live/widget/singlist/common/FinderLiveAuditionUIHelper", "applyUIState", "(Lcom/tencent/mm/plugin/finder/live/widget/singlist/common/IFinderLiveAuditionViewHolder;Lcom/tencent/mm/plugin/finder/live/widget/singlist/common/FinderLiveAuditionUIState;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View f119783y = holder.getF119783y();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(f119783y, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/common/FinderLiveAuditionUIHelper", "applyUIState", "(Lcom/tencent/mm/plugin/finder/live/widget/singlist/common/IFinderLiveAuditionViewHolder;Lcom/tencent/mm/plugin/finder/live/widget/singlist/common/FinderLiveAuditionUIState;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            f119783y.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(f119783y, "com/tencent/mm/plugin/finder/live/widget/singlist/common/FinderLiveAuditionUIHelper", "applyUIState", "(Lcom/tencent/mm/plugin/finder/live/widget/singlist/common/IFinderLiveAuditionViewHolder;Lcom/tencent/mm/plugin/finder/live/widget/singlist/common/FinderLiveAuditionUIState;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            holder.getAuditionPlayingAnim().setVisibility(8);
            holder.getAuditionPlayingAnim().n();
            android.view.View f119781w = holder.getF119781w();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(f119781w, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/common/FinderLiveAuditionUIHelper", "applyUIState", "(Lcom/tencent/mm/plugin/finder/live/widget/singlist/common/IFinderLiveAuditionViewHolder;Lcom/tencent/mm/plugin/finder/live/widget/singlist/common/FinderLiveAuditionUIState;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            f119781w.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(f119781w, "com/tencent/mm/plugin/finder/live/widget/singlist/common/FinderLiveAuditionUIHelper", "applyUIState", "(Lcom/tencent/mm/plugin/finder/live/widget/singlist/common/IFinderLiveAuditionViewHolder;Lcom/tencent/mm/plugin/finder/live/widget/singlist/common/FinderLiveAuditionUIState;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            holder.getF119781w().setBackgroundColor(color);
            return;
        }
        if (ordinal == 1) {
            android.view.View auditionPlayView2 = holder.getAuditionPlayView();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(auditionPlayView2, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/common/FinderLiveAuditionUIHelper", "applyUIState", "(Lcom/tencent/mm/plugin/finder/live/widget/singlist/common/IFinderLiveAuditionViewHolder;Lcom/tencent/mm/plugin/finder/live/widget/singlist/common/FinderLiveAuditionUIState;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            auditionPlayView2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(auditionPlayView2, "com/tencent/mm/plugin/finder/live/widget/singlist/common/FinderLiveAuditionUIHelper", "applyUIState", "(Lcom/tencent/mm/plugin/finder/live/widget/singlist/common/IFinderLiveAuditionViewHolder;Lcom/tencent/mm/plugin/finder/live/widget/singlist/common/FinderLiveAuditionUIState;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View f119783y2 = holder.getF119783y();
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(f119783y2, arrayList5.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/common/FinderLiveAuditionUIHelper", "applyUIState", "(Lcom/tencent/mm/plugin/finder/live/widget/singlist/common/IFinderLiveAuditionViewHolder;Lcom/tencent/mm/plugin/finder/live/widget/singlist/common/FinderLiveAuditionUIState;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            f119783y2.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(f119783y2, "com/tencent/mm/plugin/finder/live/widget/singlist/common/FinderLiveAuditionUIHelper", "applyUIState", "(Lcom/tencent/mm/plugin/finder/live/widget/singlist/common/IFinderLiveAuditionViewHolder;Lcom/tencent/mm/plugin/finder/live/widget/singlist/common/FinderLiveAuditionUIState;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            holder.getAuditionPlayingAnim().setVisibility(8);
            holder.getAuditionPlayingAnim().n();
            android.view.View f119781w2 = holder.getF119781w();
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(0);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(f119781w2, arrayList6.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/common/FinderLiveAuditionUIHelper", "applyUIState", "(Lcom/tencent/mm/plugin/finder/live/widget/singlist/common/IFinderLiveAuditionViewHolder;Lcom/tencent/mm/plugin/finder/live/widget/singlist/common/FinderLiveAuditionUIState;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            f119781w2.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(f119781w2, "com/tencent/mm/plugin/finder/live/widget/singlist/common/FinderLiveAuditionUIHelper", "applyUIState", "(Lcom/tencent/mm/plugin/finder/live/widget/singlist/common/IFinderLiveAuditionViewHolder;Lcom/tencent/mm/plugin/finder/live/widget/singlist/common/FinderLiveAuditionUIState;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            holder.getF119781w().setBackgroundColor(color);
            return;
        }
        if (ordinal == 2) {
            android.view.View auditionPlayView3 = holder.getAuditionPlayView();
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList7.add(8);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(auditionPlayView3, arrayList7.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/common/FinderLiveAuditionUIHelper", "applyUIState", "(Lcom/tencent/mm/plugin/finder/live/widget/singlist/common/IFinderLiveAuditionViewHolder;Lcom/tencent/mm/plugin/finder/live/widget/singlist/common/FinderLiveAuditionUIState;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            auditionPlayView3.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(auditionPlayView3, "com/tencent/mm/plugin/finder/live/widget/singlist/common/FinderLiveAuditionUIHelper", "applyUIState", "(Lcom/tencent/mm/plugin/finder/live/widget/singlist/common/IFinderLiveAuditionViewHolder;Lcom/tencent/mm/plugin/finder/live/widget/singlist/common/FinderLiveAuditionUIState;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View f119783y3 = holder.getF119783y();
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            arrayList8.add(0);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(f119783y3, arrayList8.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/common/FinderLiveAuditionUIHelper", "applyUIState", "(Lcom/tencent/mm/plugin/finder/live/widget/singlist/common/IFinderLiveAuditionViewHolder;Lcom/tencent/mm/plugin/finder/live/widget/singlist/common/FinderLiveAuditionUIState;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            f119783y3.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(f119783y3, "com/tencent/mm/plugin/finder/live/widget/singlist/common/FinderLiveAuditionUIHelper", "applyUIState", "(Lcom/tencent/mm/plugin/finder/live/widget/singlist/common/IFinderLiveAuditionViewHolder;Lcom/tencent/mm/plugin/finder/live/widget/singlist/common/FinderLiveAuditionUIState;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            holder.getAuditionPlayingAnim().setVisibility(8);
            holder.getAuditionPlayingAnim().n();
            android.view.View f119781w3 = holder.getF119781w();
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            arrayList9.add(0);
            java.util.Collections.reverse(arrayList9);
            yj0.a.d(f119781w3, arrayList9.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/common/FinderLiveAuditionUIHelper", "applyUIState", "(Lcom/tencent/mm/plugin/finder/live/widget/singlist/common/IFinderLiveAuditionViewHolder;Lcom/tencent/mm/plugin/finder/live/widget/singlist/common/FinderLiveAuditionUIState;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            f119781w3.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
            yj0.a.f(f119781w3, "com/tencent/mm/plugin/finder/live/widget/singlist/common/FinderLiveAuditionUIHelper", "applyUIState", "(Lcom/tencent/mm/plugin/finder/live/widget/singlist/common/IFinderLiveAuditionViewHolder;Lcom/tencent/mm/plugin/finder/live/widget/singlist/common/FinderLiveAuditionUIState;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            holder.getF119781w().setBackgroundColor(color2);
            return;
        }
        if (ordinal != 3) {
            return;
        }
        android.view.View auditionPlayView4 = holder.getAuditionPlayView();
        java.util.ArrayList arrayList10 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
        arrayList10.add(8);
        java.util.Collections.reverse(arrayList10);
        yj0.a.d(auditionPlayView4, arrayList10.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/common/FinderLiveAuditionUIHelper", "applyUIState", "(Lcom/tencent/mm/plugin/finder/live/widget/singlist/common/IFinderLiveAuditionViewHolder;Lcom/tencent/mm/plugin/finder/live/widget/singlist/common/FinderLiveAuditionUIState;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        auditionPlayView4.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
        yj0.a.f(auditionPlayView4, "com/tencent/mm/plugin/finder/live/widget/singlist/common/FinderLiveAuditionUIHelper", "applyUIState", "(Lcom/tencent/mm/plugin/finder/live/widget/singlist/common/IFinderLiveAuditionViewHolder;Lcom/tencent/mm/plugin/finder/live/widget/singlist/common/FinderLiveAuditionUIState;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View f119783y4 = holder.getF119783y();
        java.util.ArrayList arrayList11 = new java.util.ArrayList();
        arrayList11.add(8);
        java.util.Collections.reverse(arrayList11);
        yj0.a.d(f119783y4, arrayList11.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/common/FinderLiveAuditionUIHelper", "applyUIState", "(Lcom/tencent/mm/plugin/finder/live/widget/singlist/common/IFinderLiveAuditionViewHolder;Lcom/tencent/mm/plugin/finder/live/widget/singlist/common/FinderLiveAuditionUIState;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        f119783y4.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
        yj0.a.f(f119783y4, "com/tencent/mm/plugin/finder/live/widget/singlist/common/FinderLiveAuditionUIHelper", "applyUIState", "(Lcom/tencent/mm/plugin/finder/live/widget/singlist/common/IFinderLiveAuditionViewHolder;Lcom/tencent/mm/plugin/finder/live/widget/singlist/common/FinderLiveAuditionUIState;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        holder.getAuditionPlayingAnim().setVisibility(0);
        com.tencent.mm.view.MMPAGView auditionPlayingAnim = holder.getAuditionPlayingAnim();
        if (auditionPlayingAnim.f()) {
            auditionPlayingAnim = null;
        }
        if (auditionPlayingAnim != null) {
            auditionPlayingAnim.g();
        }
        android.view.View f119781w4 = holder.getF119781w();
        java.util.ArrayList arrayList12 = new java.util.ArrayList();
        arrayList12.add(0);
        java.util.Collections.reverse(arrayList12);
        yj0.a.d(f119781w4, arrayList12.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/common/FinderLiveAuditionUIHelper", "applyUIState", "(Lcom/tencent/mm/plugin/finder/live/widget/singlist/common/IFinderLiveAuditionViewHolder;Lcom/tencent/mm/plugin/finder/live/widget/singlist/common/FinderLiveAuditionUIState;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        f119781w4.setVisibility(((java.lang.Integer) arrayList12.get(0)).intValue());
        yj0.a.f(f119781w4, "com/tencent/mm/plugin/finder/live/widget/singlist/common/FinderLiveAuditionUIHelper", "applyUIState", "(Lcom/tencent/mm/plugin/finder/live/widget/singlist/common/IFinderLiveAuditionViewHolder;Lcom/tencent/mm/plugin/finder/live/widget/singlist/common/FinderLiveAuditionUIState;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        holder.getF119781w().setBackgroundColor(color2);
    }
}
