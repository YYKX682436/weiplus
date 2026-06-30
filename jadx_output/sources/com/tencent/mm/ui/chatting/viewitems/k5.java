package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class k5 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public boolean f204307d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f204308e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f204309f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.l5 f204310g;

    public k5(com.tencent.mm.ui.chatting.viewitems.l5 l5Var, android.content.Context context, android.graphics.Bitmap bitmap) {
        this.f204310g = l5Var;
        this.f204308e = context;
        this.f204309f = bitmap;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        boolean z17 = this.f204307d;
        com.tencent.mm.ui.chatting.viewitems.l5 l5Var = this.f204310g;
        if (z17) {
            l5Var.f204395f.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
        l5Var.f204395f.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f204307d = true;
        android.content.Context context = this.f204308e;
        int b17 = i65.a.b(context, 24);
        android.graphics.Bitmap bitmap = this.f204309f;
        if (bitmap == null || bitmap.isRecycled()) {
            bitmap = com.tencent.mm.sdk.platformtools.x.q(context.getResources().getColor(com.tencent.mm.R.color.f478806hr), b17, b17);
        }
        int height = bitmap.getHeight();
        if (b17 > height) {
            b17 = height;
        }
        android.graphics.Bitmap X = com.tencent.mm.sdk.platformtools.x.X(com.tencent.mm.sdk.platformtools.x.I0(android.graphics.Bitmap.createScaledBitmap(bitmap, b17, b17, true), 0.9f), 20);
        int height2 = l5Var.f204395f.getHeight();
        int width = l5Var.f204395f.getWidth();
        if (height2 == 0) {
            height2 = i65.a.h(context, com.tencent.mm.R.dimen.f480237s9);
        }
        if (width == 0) {
            width = i65.a.h(context, com.tencent.mm.R.dimen.s_);
        }
        l5Var.f204395f.setBackgroundDrawable(new android.graphics.drawable.BitmapDrawable(l5Var.f204396g ? com.tencent.mm.sdk.platformtools.x.s(X, com.tencent.mm.R.drawable.bzr, width, height2) : com.tencent.mm.sdk.platformtools.x.s(X, com.tencent.mm.R.drawable.bzx, width, height2)));
        return true;
    }
}
