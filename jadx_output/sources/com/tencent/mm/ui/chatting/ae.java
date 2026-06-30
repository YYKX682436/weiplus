package com.tencent.mm.ui.chatting;

/* loaded from: classes3.dex */
public class ae extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.TextPreviewUI f198463a;

    public ae(com.tencent.mm.ui.chatting.TextPreviewUI textPreviewUI) {
        this.f198463a = textPreviewUI;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        if (view == null || outline == null) {
            return;
        }
        outline.setAlpha(0.35f);
        int f17 = i65.a.f(this.f198463a.getContext(), com.tencent.mm.R.dimen.f479644bj);
        int i17 = -f17;
        outline.setRoundRect(i17, i17, view.getWidth() + f17, view.getHeight() + f17, i65.a.f(r0.getContext(), com.tencent.mm.R.dimen.f479688cn));
    }
}
