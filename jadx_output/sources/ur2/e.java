package ur2;

/* loaded from: classes10.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ur2.o f430394d;

    public e(ur2.o oVar) {
        this.f430394d = oVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/post/shorttitle/PostShortTitleHalfScreen$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ur2.o oVar = this.f430394d;
        oVar.a();
        yz5.a aVar = oVar.f430410g;
        if (aVar != null) {
            aVar.invoke();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/post/shorttitle/PostShortTitleHalfScreen$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
