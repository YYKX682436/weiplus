package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class v2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f205825d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.w2 f205826e;

    public v2(com.tencent.mm.ui.chatting.viewitems.w2 w2Var, android.graphics.Bitmap bitmap) {
        this.f205826e = w2Var;
        this.f205825d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Bitmap bitmap = this.f205825d;
        if (bitmap.isRecycled()) {
            return;
        }
        this.f205826e.f205897a.U.setImageBitmap(bitmap);
    }
}
