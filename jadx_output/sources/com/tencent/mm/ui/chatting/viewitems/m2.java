package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class m2 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public boolean f204546d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.v1 f204547e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yb5.d f204548f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f204549g;

    public m2(com.tencent.mm.ui.chatting.viewitems.c2 c2Var, com.tencent.mm.ui.chatting.viewitems.v1 v1Var, yb5.d dVar, android.graphics.Bitmap bitmap) {
        this.f204547e = v1Var;
        this.f204548f = dVar;
        this.f204549g = bitmap;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        boolean z17 = this.f204546d;
        com.tencent.mm.ui.chatting.viewitems.v1 v1Var = this.f204547e;
        if (z17) {
            v1Var.f205767r.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
        v1Var.f205767r.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f204546d = true;
        yb5.d dVar = this.f204548f;
        int b17 = i65.a.b(dVar.g(), 24);
        android.graphics.Bitmap bitmap = this.f204549g;
        if (bitmap == null || bitmap.isRecycled()) {
            bitmap = com.tencent.mm.sdk.platformtools.x.q(dVar.g().getResources().getColor(com.tencent.mm.R.color.f478806hr), b17, b17);
        }
        int height = bitmap.getHeight();
        if (b17 > height) {
            b17 = height;
        }
        android.graphics.Bitmap X = com.tencent.mm.sdk.platformtools.x.X(com.tencent.mm.sdk.platformtools.x.I0(android.graphics.Bitmap.createScaledBitmap(bitmap, b17, b17, true), 0.9f), 20);
        int height2 = v1Var.f205767r.getHeight();
        int width = v1Var.f205767r.getWidth();
        if (height2 == 0) {
            height2 = i65.a.h(dVar.g(), com.tencent.mm.R.dimen.f480237s9);
        }
        if (width == 0) {
            width = i65.a.h(dVar.g(), com.tencent.mm.R.dimen.s_);
        }
        v1Var.f205767r.setBackgroundDrawable(new android.graphics.drawable.BitmapDrawable(com.tencent.mm.sdk.platformtools.x.s(X, com.tencent.mm.R.drawable.bzr, width, height2)));
        return true;
    }
}
