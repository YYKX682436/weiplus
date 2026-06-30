package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class ce implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.TextPreviewUI f198533d;

    public ce(com.tencent.mm.ui.chatting.TextPreviewUI textPreviewUI) {
        this.f198533d = textPreviewUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.TextPreviewUI textPreviewUI = this.f198533d;
        com.tencent.mm.ui.chatting.hc hcVar = textPreviewUI.A;
        android.text.SpannableString spannableString = new android.text.SpannableString(textPreviewUI.f198327f);
        hcVar.a(spannableString, textPreviewUI.getContext().getResources().getColor(com.tencent.mm.R.color.Brand_Alpha_0_3));
        textPreviewUI.f198325d.setText(spannableString);
    }
}
