package hw2;

/* loaded from: classes3.dex */
public final class c0 implements android.view.View.OnClickListener, yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.video.plugin.view.SubRecordFinishView f285508d;

    /* renamed from: e, reason: collision with root package name */
    public final ju3.d0 f285509e;

    public c0(com.tencent.mm.plugin.finder.video.plugin.view.SubRecordFinishView view, ju3.d0 status) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(status, "status");
        this.f285508d = view;
        this.f285509e = status;
        view.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/video/plugin/FinderSubRecordFinishPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1371L, 190L, (2 & 2) != 0 ? 1L : 0L, false);
        ju3.d0.k(this.f285509e, ju3.c0.f301891o, null, 2, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/video/plugin/FinderSubRecordFinishPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // yt3.r2
    public void setVisibility(int i17) {
        this.f285508d.setVisibility(i17);
    }
}
