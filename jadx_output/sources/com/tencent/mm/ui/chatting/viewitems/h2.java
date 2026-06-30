package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class h2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f204072d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.i2 f204073e;

    public h2(com.tencent.mm.ui.chatting.viewitems.i2 i2Var, android.graphics.Bitmap bitmap) {
        this.f204073e = i2Var;
        this.f204072d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Bitmap bitmap = this.f204072d;
        if (bitmap.isRecycled()) {
            return;
        }
        this.f204073e.f204157a.U.setImageBitmap(bitmap);
    }
}
