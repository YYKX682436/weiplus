package com.tencent.mm.ui.chatting.component.biz;

/* loaded from: classes8.dex */
public class p extends android.view.ViewOutlineProvider {
    public p(com.tencent.mm.ui.chatting.component.biz.a aVar) {
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), i65.a.b(view.getContext(), 114) >> 1);
    }
}
