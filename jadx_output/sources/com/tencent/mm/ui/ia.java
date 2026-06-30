package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class ia implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.MenuItem f208914d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.eb f208915e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.ga f208916f;

    public ia(com.tencent.mm.ui.ga gaVar, android.view.MenuItem menuItem, com.tencent.mm.ui.eb ebVar) {
        this.f208916f = gaVar;
        this.f208914d = menuItem;
        this.f208915e = ebVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/MMActivityController$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f208916f.l(this.f208914d, this.f208915e);
        yj0.a.h(this, "com/tencent/mm/ui/MMActivityController$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
