package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class m1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.q1 f209086d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.BaseActivity f209087e;

    public m1(com.tencent.mm.ui.BaseActivity baseActivity, com.tencent.mm.ui.q1 q1Var) {
        this.f209087e = baseActivity;
        this.f209086d = q1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/BaseActivity$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.MenuItem menuItem = this.f209087e.f196600s;
        android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f209086d.f209534h;
        if (onMenuItemClickListener != null) {
            onMenuItemClickListener.onMenuItemClick(menuItem);
        }
        yj0.a.h(this, "com/tencent/mm/ui/BaseActivity$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
