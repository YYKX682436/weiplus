package kl2;

/* loaded from: classes3.dex */
public final class w implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kl2.e0 f308825d;

    public w(kl2.e0 e0Var) {
        this.f308825d = e0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.LinkedList<r45.uw4> list;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/quota/widget/RestrictConsumeSettingHelper$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kl2.e0 e0Var = this.f308825d;
        e0Var.f308760c.invoke();
        r45.f82 f82Var = e0Var.f308766i;
        if (f82Var != null) {
            kl2.v vVar = (kl2.v) ((jz5.n) e0Var.f308768k).getValue();
            vVar.getClass();
            vVar.w();
            vVar.f308824p = f82Var;
            java.util.LinkedList linkedList = vVar.f308822n;
            linkedList.clear();
            r45.ql1 ql1Var = (r45.ql1) f82Var.getCustom(2);
            long j17 = ql1Var != null ? ql1Var.getLong(1) : 0L;
            r45.f82 f82Var2 = vVar.f308824p;
            if (f82Var2 != null && (list = f82Var2.getList(1)) != null) {
                for (r45.uw4 uw4Var : list) {
                    boolean z17 = false;
                    long j18 = uw4Var.getLong(0);
                    if (j17 == uw4Var.getLong(0)) {
                        z17 = true;
                    }
                    linkedList.add(new kl2.t(j18, z17));
                }
            }
            vVar.f308823o.notifyDataSetChanged();
        }
        ll2.e.b(ll2.e.f319133a, "audience.more.morefunction.rewardlimitamount", false, false, 6, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/quota/widget/RestrictConsumeSettingHelper$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
