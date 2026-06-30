package com.tencent.mm.ui.contact;

/* loaded from: classes.dex */
public final class q8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.s8 f207139d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f207140e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.v8 f207141f;

    public q8(com.tencent.mm.ui.contact.s8 s8Var, int i17, com.tencent.mm.ui.contact.v8 v8Var) {
        this.f207139d = s8Var;
        this.f207140e = i17;
        this.f207141f = v8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/RecentForwardConverter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.contact.u8 u8Var = this.f207139d.f207175e;
        if (u8Var != null) {
            u8Var.a(this.f207140e, this.f207141f.f207220d.f207231a);
        }
        yj0.a.h(this, "com/tencent/mm/ui/contact/RecentForwardConverter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
