package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class c7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 f173767d;

    public c7(com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2) {
        this.f173767d = textStatusDoWhatActivityV2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2$initCustomStatusView$1$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2 = this.f173767d;
        textStatusDoWhatActivityV2.d7().f473346h.f363912b++;
        textStatusDoWhatActivityV2.N = "userdefine";
        android.widget.ImageView imageView = textStatusDoWhatActivityV2.F;
        if (imageView != null) {
            imageView.setImageDrawable(null);
        }
        com.tencent.mm.ui.widget.MMEditText mMEditText = textStatusDoWhatActivityV2.C;
        if (mMEditText != null) {
            mMEditText.setText("");
        }
        bk4.f.V(textStatusDoWhatActivityV2.c7(), textStatusDoWhatActivityV2.F, textStatusDoWhatActivityV2.N, null, null, null, false, false, 124, null);
        textStatusDoWhatActivityV2.Z6();
        textStatusDoWhatActivityV2.hideVKB();
        textStatusDoWhatActivityV2.g7();
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2$initCustomStatusView$1$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
