package rh4;

/* loaded from: classes3.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f395784d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rh4.b0 f395785e;

    public t(rh4.b0 b0Var, java.util.ArrayList arrayList) {
        this.f395785e = b0Var;
        this.f395784d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        rh4.t tVar = this;
        java.util.ArrayList arrayList = tVar.f395784d;
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            rh4.b0 b0Var = tVar.f395785e;
            if (!hasNext) {
                arrayList.clear();
                b0Var.f395697l.remove(arrayList);
                return;
            }
            androidx.recyclerview.widget.k3 k3Var = (androidx.recyclerview.widget.k3) it.next();
            b0Var.getClass();
            android.view.View view = k3Var.itemView;
            android.view.ViewPropertyAnimator animate = view.animate();
            b0Var.f395700o.add(k3Var);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionWeAppItemAnimator", "animateAddImpl", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionWeAppItemAnimator", "animateAddImpl", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            animate.scaleX(1.0f).scaleY(1.0f).setDuration(b0Var.f12168c).setListener(new rh4.v(b0Var, k3Var, view, animate)).start();
            tVar = this;
        }
    }
}
