package com.tencent.mm.ui.chatting.view;

/* loaded from: classes9.dex */
public final class x0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.view.c1 f203146d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f203147e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.button.WeButton f203148f;

    public x0(com.tencent.mm.ui.chatting.view.c1 c1Var, java.util.List list, com.tencent.mm.ui.widget.button.WeButton weButton) {
        this.f203146d = c1Var;
        this.f203147e = list;
        this.f203148f = weButton;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/view/MMRemindDatePickerRemake$initView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.view.c1 c1Var = this.f203146d;
        c1Var.f202898n.f59196g = 3L;
        c1Var.c(this.f203147e, this.f203148f, 1, 3);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/view/MMRemindDatePickerRemake$initView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
