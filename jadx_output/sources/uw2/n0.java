package uw2;

/* loaded from: classes3.dex */
public final class n0 extends rs.k {
    @Override // rs.k
    public void D(androidx.recyclerview.widget.k3 k3Var) {
        kotlin.jvm.internal.o.d(k3Var);
        android.view.View itemView = k3Var.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        android.view.ViewPropertyAnimator animate = itemView.animate();
        this.f399283o.add(k3Var);
        animate.alpha(1.0f).translationY(0.0f).setStartDelay(0L).setDuration(260L).setListener(new uw2.l0(this, k3Var, itemView, animate)).start();
    }

    @Override // rs.k
    public void E(androidx.recyclerview.widget.k3 k3Var) {
        kotlin.jvm.internal.o.d(k3Var);
        android.view.View itemView = k3Var.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(0.3f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(itemView, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/animation/RefreshItemAnimation", "animateRemoveImpl", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        itemView.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(itemView, "com/tencent/mm/plugin/finder/view/animation/RefreshItemAnimation", "animateRemoveImpl", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.ViewPropertyAnimator animate = itemView.animate();
        this.f399285q.add(k3Var);
        animate.setDuration(200L).alpha(0.0f).translationY(k3Var.itemView.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479723df)).setStartDelay(0L).setListener(new uw2.m0(this, k3Var, itemView, animate)).start();
    }

    @Override // androidx.recyclerview.widget.n2
    public long l() {
        return 0L;
    }

    @Override // androidx.recyclerview.widget.n2
    public long m() {
        return 260L;
    }

    @Override // androidx.recyclerview.widget.n2
    public long n() {
        return 200L;
    }

    @Override // rs.k, androidx.recyclerview.widget.o3
    public boolean t(androidx.recyclerview.widget.k3 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        J(holder);
        if (holder.getItemViewType() == -3) {
            return true;
        }
        android.view.View view = holder.itemView;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(0.56f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/animation/RefreshItemAnimation", "animateAdd", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/view/animation/RefreshItemAnimation", "animateAdd", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view2 = holder.itemView;
        view2.setTranslationY(-view2.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479723df));
        this.f399277i.add(holder);
        return true;
    }

    @Override // rs.k, androidx.recyclerview.widget.o3
    public boolean w(androidx.recyclerview.widget.k3 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        J(holder);
        this.f399276h.add(holder);
        return true;
    }
}
