package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class h4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f204077d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f204078e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.i4 f204079f;

    public h4(com.tencent.mm.ui.chatting.viewitems.i4 i4Var, android.graphics.Bitmap bitmap, java.lang.String str) {
        this.f204079f = i4Var;
        this.f204077d = bitmap;
        this.f204078e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Bitmap bitmap = this.f204077d;
        if (bitmap != null) {
            com.tencent.mm.ui.chatting.viewitems.i4 i4Var = this.f204079f;
            if (this.f204078e.equals(i4Var.f204163c.f204227f.getTag(com.tencent.mm.R.id.nvv))) {
                i4Var.f204163c.f204227f.setImageBitmap(com.tencent.mm.ui.chatting.viewitems.p4.f(bitmap, i4Var.f204161a, i4Var.f204162b, !i4Var.f204163c.f204230i));
            }
        }
    }
}
