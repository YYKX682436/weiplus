package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class ke implements wl5.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.TextPreviewUI f201913a;

    public ke(com.tencent.mm.ui.chatting.TextPreviewUI textPreviewUI) {
        this.f201913a = textPreviewUI;
    }

    @Override // wl5.t
    public void a(java.lang.CharSequence charSequence) {
        com.tencent.mm.ui.chatting.TextPreviewUI textPreviewUI = this.f201913a;
        textPreviewUI.f198332n = charSequence;
        if (textPreviewUI.D) {
            textPreviewUI.f198325d.setMovementMethod(null);
        }
    }
}
