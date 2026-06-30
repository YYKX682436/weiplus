package q23;

/* loaded from: classes4.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q23.j f359815d;

    public i(q23.j jVar) {
        this.f359815d = jVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/livephoto/ui/PreviewLiveSwitcherTagView$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        q23.j jVar = this.f359815d;
        android.view.View.OnClickListener onClickListener = jVar.f359820e;
        if (onClickListener != null) {
            onClickListener.onClick(jVar.f359817b);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/gallery/livephoto/ui/PreviewLiveSwitcherTagView$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
