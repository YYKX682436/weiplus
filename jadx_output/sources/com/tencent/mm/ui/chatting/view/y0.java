package com.tencent.mm.ui.chatting.view;

/* loaded from: classes9.dex */
public final class y0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.view.c1 f203153d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f203154e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.button.WeButton f203155f;

    public y0(com.tencent.mm.ui.chatting.view.c1 c1Var, java.util.List list, com.tencent.mm.ui.widget.button.WeButton weButton) {
        this.f203153d = c1Var;
        this.f203154e = list;
        this.f203155f = weButton;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/view/MMRemindDatePickerRemake$initView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.view.c1 c1Var = this.f203153d;
        c1Var.f202898n.f59196g = 4L;
        c1Var.c(this.f203154e, this.f203155f, 1, 2);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/view/MMRemindDatePickerRemake$initView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
