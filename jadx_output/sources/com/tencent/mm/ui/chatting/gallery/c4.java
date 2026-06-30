package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public final class c4 extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.g4 f200831a;

    public c4(com.tencent.mm.ui.chatting.gallery.g4 g4Var) {
        this.f200831a = g4Var;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(outline, "outline");
        outline.setAlpha(0.35f);
        int f17 = i65.a.f(this.f200831a.b(), com.tencent.mm.R.dimen.f479644bj);
        int i17 = -f17;
        outline.setRoundRect(i17, i17, view.getWidth() + f17, view.getHeight() + f17, i65.a.f(r0.b(), com.tencent.mm.R.dimen.f479688cn));
    }
}
