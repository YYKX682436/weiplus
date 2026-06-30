package z51;

/* loaded from: classes10.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z51.r f470210d;

    public q(z51.r rVar) {
        this.f470210d = rVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/player/component/LivePhotoTagViewPc$buildView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        z51.r rVar = this.f470210d;
        rVar.f("onClick tag to play");
        ((z51.p) rVar.a(z51.p.class)).i();
        y51.f fVar = rVar.f470215j;
        if (fVar != null) {
            fVar.a();
        }
        yj0.a.h(this, "com/tencent/mm/player/component/LivePhotoTagViewPc$buildView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
