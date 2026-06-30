package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.LongTextView f174300d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bk4.c2 f174301e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f174302f;

    public t(com.tencent.mm.plugin.textstatus.ui.LongTextView longTextView, bk4.c2 c2Var, android.content.Context context) {
        this.f174300d = longTextView;
        this.f174301e = c2Var;
        this.f174302f = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/LongTextView$2$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.textstatus.ui.LongTextView.E;
        com.tencent.mm.plugin.textstatus.ui.LongTextView longTextView = this.f174300d;
        if (!longTextView.b(true)) {
            yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/LongTextView$2$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        this.f174301e.f21429t = true;
        com.tencent.mm.plugin.textstatus.ui.g4 suffixOnClickListener = longTextView.getSuffixOnClickListener();
        if (suffixOnClickListener != null) {
            ((cj4.g0) suffixOnClickListener).f41932a.X();
        }
        qj4.s.m(qj4.s.f363958a, this.f174302f, 81L, null, null, 0L, 0L, 0L, 0L, null, null, 0L, 2044, null);
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/LongTextView$2$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
