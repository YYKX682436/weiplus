package com.tencent.mm.ui;

/* loaded from: classes3.dex */
public class k1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.MenuItem.OnMenuItemClickListener f209014d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.BaseActivity f209015e;

    public k1(com.tencent.mm.ui.BaseActivity baseActivity, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f209015e = baseActivity;
        this.f209014d = onMenuItemClickListener;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/BaseActivity$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f209014d.onMenuItemClick(new db5.h4(this.f209015e.f196594m, 0, 0));
        yj0.a.h(this, "com/tencent/mm/ui/BaseActivity$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
