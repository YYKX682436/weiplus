package sj2;

/* loaded from: classes10.dex */
public final class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj2.l f408388d;

    public k(sj2.l lVar) {
        this.f408388d = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/widget/focus/FinderLiveMicFocusVideoCoverWidget$showContent$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (zl2.r4.f473950a.w1()) {
            this.f408388d.P();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/widget/focus/FinderLiveMicFocusVideoCoverWidget$showContent$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
