package mi5;

/* loaded from: classes.dex */
public final class f1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oe5.d f326834d;

    public f1(oe5.d dVar) {
        this.f326834d = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/msgviewfactory/view/ForwardTingSpaceView$onUpdateViewModel$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        oe5.d dVar = this.f326834d;
        if (dVar.getBoolean(dVar.f43702d + 6)) {
            yj0.a.h(this, "com/tencent/mm/ui/msgviewfactory/view/ForwardTingSpaceView$onUpdateViewModel$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            yj0.a.h(this, "com/tencent/mm/ui/msgviewfactory/view/ForwardTingSpaceView$onUpdateViewModel$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
