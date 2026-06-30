package kd2;

/* loaded from: classes10.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kd2.q f306705d;

    public a(kd2.q qVar) {
        this.f306705d = qVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/floatball/BaseFinderMiniViewHelper$addLiveMiniView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        kd2.q qVar = this.f306705d;
        if (currentTimeMillis - qVar.f306793q <= 1000) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/floatball/BaseFinderMiniViewHelper$addLiveMiniView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        qVar.f306793q = currentTimeMillis;
        qVar.j0().onClick(view);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/floatball/BaseFinderMiniViewHelper$addLiveMiniView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
