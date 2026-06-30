package sj2;

/* loaded from: classes10.dex */
public final class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj2.l f408387d;

    public j(sj2.l lVar) {
        this.f408387d = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/widget/focus/FinderLiveMicFocusVideoCoverWidget$onFocusHeaderShow$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        sj2.l lVar = this.f408387d;
        if (lVar.G()) {
            wj2.w.U(lVar, 0, 1, null);
        } else {
            lVar.X();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/widget/focus/FinderLiveMicFocusVideoCoverWidget$onFocusHeaderShow$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
