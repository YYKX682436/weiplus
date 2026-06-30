package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class e7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 f173842d;

    public e7(com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2) {
        this.f173842d = textStatusDoWhatActivityV2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2$initCustomStatusView$1$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2 = this.f173842d;
        java.lang.Object value = ((jz5.n) textStatusDoWhatActivityV2.f173535J).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        ((androidx.core.widget.NestedScrollView) value).scrollTo(0, 0);
        textStatusDoWhatActivityV2.b7().f();
        if (!textStatusDoWhatActivityV2.b7().isExpand) {
            textStatusDoWhatActivityV2.P++;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2$initCustomStatusView$1$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
