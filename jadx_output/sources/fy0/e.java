package fy0;

/* loaded from: classes5.dex */
public final class e implements fy0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView f267180a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bx0.h f267181b;

    public e(com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView baseTimelineView, bx0.h hVar) {
        this.f267180a = baseTimelineView;
        this.f267181b = hVar;
    }

    public void a(int i17, int i18, boolean z17) {
        androidx.recyclerview.widget.LinearLayoutManager layoutManager = this.f267180a.getLayoutManager();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(layoutManager, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/widgets/timelineview/BaseTimelineView$init$scrollHelper$1", "scrollToPositionWithOffset", "(IIZ)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        layoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.f(layoutManager, "com/tencent/mm/mj_publisher/finder/widgets/timelineview/BaseTimelineView$init$scrollHelper$1", "scrollToPositionWithOffset", "(IIZ)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
    }
}
