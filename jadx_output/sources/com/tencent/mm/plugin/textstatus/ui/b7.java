package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class b7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 f173748d;

    public b7(com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2) {
        this.f173748d = textStatusDoWhatActivityV2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        android.text.Editable text;
        java.lang.String obj;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2$initCustomStatusView$1$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2 = this.f173748d;
        if (textStatusDoWhatActivityV2.Y6()) {
            com.tencent.mm.ui.widget.MMEditText mMEditText = textStatusDoWhatActivityV2.C;
            if (mMEditText == null || (text = mMEditText.getText()) == null || (obj = text.toString()) == null || (str = r26.n0.u0(obj).toString()) == null) {
                str = "";
            }
            textStatusDoWhatActivityV2.getClass();
            textStatusDoWhatActivityV2.f173541i = str;
            textStatusDoWhatActivityV2.d7().f473346h.f363913c++;
            com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 textStatusDoWhatActivityV22 = this.f173748d;
            com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2.X6(textStatusDoWhatActivityV22, textStatusDoWhatActivityV22.N, false, textStatusDoWhatActivityV22.S, 2, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2$initCustomStatusView$1$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
