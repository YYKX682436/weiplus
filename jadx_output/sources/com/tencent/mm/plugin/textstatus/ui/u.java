package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bk4.c2 f174333d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.LongTextView f174334e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f174335f;

    public u(bk4.c2 c2Var, com.tencent.mm.plugin.textstatus.ui.LongTextView longTextView, android.content.Context context) {
        this.f174333d = c2Var;
        this.f174334e = longTextView;
        this.f174335f = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/LongTextView$2$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f174333d.f21429t = true;
        int i17 = com.tencent.mm.plugin.textstatus.ui.LongTextView.E;
        this.f174334e.a(true);
        qj4.s.m(qj4.s.f363958a, this.f174335f, 83L, null, null, 0L, 0L, 0L, 0L, null, null, 0L, 2044, null);
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/LongTextView$2$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
