package eh5;

/* loaded from: classes10.dex */
public final class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eh5.y f252972d;

    public t(eh5.y yVar) {
        this.f252972d = yVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/immersive/ImmersiveHeaderHalfScreenBaseDialog$onCreate$1$2$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f252972d.dismiss();
        yj0.a.h(this, "com/tencent/mm/ui/immersive/ImmersiveHeaderHalfScreenBaseDialog$onCreate$1$2$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
