package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class de implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.TextPreviewUI f200447d;

    public de(com.tencent.mm.ui.chatting.TextPreviewUI textPreviewUI) {
        this.f200447d = textPreviewUI;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.tencent.mm.ui.chatting.TextPreviewUI textPreviewUI = this.f200447d;
        textPreviewUI.f198325d.getViewTreeObserver().removeOnPreDrawListener(this);
        if (textPreviewUI.f198325d.getLineCount() != 1) {
            return false;
        }
        textPreviewUI.f198325d.setGravity(1);
        return false;
    }
}
