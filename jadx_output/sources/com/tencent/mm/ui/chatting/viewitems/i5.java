package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class i5 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f204164d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.j5 f204165e;

    public i5(com.tencent.mm.ui.chatting.viewitems.j5 j5Var, android.graphics.Bitmap bitmap) {
        this.f204165e = j5Var;
        this.f204164d = bitmap;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.tencent.mm.ui.chatting.viewitems.j5 j5Var = this.f204165e;
        j5Var.f204232b.f204395f.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = j5Var.f204232b.f204395f.getHeight();
        int width = j5Var.f204232b.f204395f.getWidth();
        if (height == 0) {
            height = i65.a.h(j5Var.f204231a, com.tencent.mm.R.dimen.f480237s9);
        }
        if (width == 0) {
            width = i65.a.h(j5Var.f204231a, com.tencent.mm.R.dimen.s_);
        }
        boolean z17 = j5Var.f204232b.f204396g;
        android.graphics.Bitmap bitmap = this.f204164d;
        j5Var.f204232b.f204395f.setBackgroundDrawable(new android.graphics.drawable.BitmapDrawable(z17 ? com.tencent.mm.sdk.platformtools.x.s(bitmap, com.tencent.mm.R.drawable.bzr, width, height) : com.tencent.mm.sdk.platformtools.x.s(bitmap, com.tencent.mm.R.drawable.bzx, width, height)));
        return true;
    }
}
