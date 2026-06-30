package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class d7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.CustomStatusView f173806d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 f173807e;

    public d7(com.tencent.mm.plugin.textstatus.ui.CustomStatusView customStatusView, com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2) {
        this.f173806d = customStatusView;
        this.f173807e = textStatusDoWhatActivityV2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2$initCustomStatusView$1$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean z17 = this.f173806d.isExpand;
        com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2 = this.f173807e;
        if (z17) {
            com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2.V6(textStatusDoWhatActivityV2);
            textStatusDoWhatActivityV2.Q++;
        } else {
            com.tencent.mm.plugin.textstatus.ui.h6 h6Var = com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2.C1;
            textStatusDoWhatActivityV2.b7().f();
            textStatusDoWhatActivityV2.P++;
        }
        textStatusDoWhatActivityV2.d7().f473346h.f363911a++;
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2$initCustomStatusView$1$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
