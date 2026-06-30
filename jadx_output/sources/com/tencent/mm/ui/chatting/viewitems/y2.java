package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class y2 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f206024d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.z2 f206025e;

    public y2(com.tencent.mm.ui.chatting.viewitems.z2 z2Var, android.graphics.Bitmap bitmap) {
        this.f206025e = z2Var;
        this.f206024d = bitmap;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.tencent.mm.ui.chatting.viewitems.z2 z2Var = this.f206025e;
        z2Var.f206109a.f205767r.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = z2Var.f206109a.f205767r.getHeight();
        int width = z2Var.f206109a.f205767r.getWidth();
        if (height == 0) {
            height = i65.a.h(z2Var.f206110b.g(), com.tencent.mm.R.dimen.f480237s9);
        }
        if (width == 0) {
            width = i65.a.h(z2Var.f206110b.g(), com.tencent.mm.R.dimen.s_);
        }
        z2Var.f206109a.f205767r.setBackgroundDrawable(new android.graphics.drawable.BitmapDrawable(com.tencent.mm.sdk.platformtools.x.s(this.f206024d, com.tencent.mm.R.drawable.bzx, width, height)));
        return true;
    }
}
