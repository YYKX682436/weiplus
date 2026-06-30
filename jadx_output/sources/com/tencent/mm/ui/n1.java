package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class n1 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.q1 f209396d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.BaseActivity f209397e;

    public n1(com.tencent.mm.ui.BaseActivity baseActivity, com.tencent.mm.ui.q1 q1Var) {
        this.f209397e = baseActivity;
        this.f209396d = q1Var;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/BaseActivity$6", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        int i17 = com.tencent.mm.ui.BaseActivity.f196587y;
        this.f209397e.getClass();
        android.view.View.OnLongClickListener onLongClickListener = this.f209396d.f209535i;
        boolean onLongClick = onLongClickListener != null ? onLongClickListener.onLongClick(view) : false;
        yj0.a.i(onLongClick, this, "com/tencent/mm/ui/BaseActivity$6", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return onLongClick;
    }
}
