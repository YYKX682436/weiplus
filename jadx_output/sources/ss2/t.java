package ss2;

/* loaded from: classes3.dex */
public final class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ss2.a0 f411984d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f411985e;

    public t(ss2.a0 a0Var, int i17) {
        this.f411984d = a0Var;
        this.f411985e = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/question/QAPostMediaWidget$refreshImageThumbView$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - qd2.h.f361767a >= 500) {
            z17 = false;
        } else {
            com.tencent.mars.xlog.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f361767a);
            z17 = true;
        }
        qd2.h.f361767a = currentTimeMillis;
        if (z17) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/question/QAPostMediaWidget$refreshImageThumbView$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            ss2.a0.c(this.f411984d, this.f411985e);
            yj0.a.h(this, "com/tencent/mm/plugin/finder/question/QAPostMediaWidget$refreshImageThumbView$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
