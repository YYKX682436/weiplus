package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class k2 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f204296d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.l2 f204297e;

    public k2(com.tencent.mm.ui.chatting.viewitems.l2 l2Var, android.graphics.Bitmap bitmap) {
        this.f204297e = l2Var;
        this.f204296d = bitmap;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.tencent.mm.ui.chatting.viewitems.l2 l2Var = this.f204297e;
        l2Var.f204384a.f205767r.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = l2Var.f204384a.f205767r.getHeight();
        int width = l2Var.f204384a.f205767r.getWidth();
        if (height == 0) {
            height = i65.a.h(l2Var.f204385b.g(), com.tencent.mm.R.dimen.f480237s9);
        }
        if (width == 0) {
            width = i65.a.h(l2Var.f204385b.g(), com.tencent.mm.R.dimen.s_);
        }
        l2Var.f204384a.f205767r.setBackgroundDrawable(new android.graphics.drawable.BitmapDrawable(com.tencent.mm.sdk.platformtools.x.s(this.f204296d, com.tencent.mm.R.drawable.bzr, width, height)));
        return true;
    }
}
