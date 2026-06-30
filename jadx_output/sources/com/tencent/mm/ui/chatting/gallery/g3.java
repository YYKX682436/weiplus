package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class g3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f200944d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.h3 f200945e;

    public g3(com.tencent.mm.ui.chatting.gallery.h3 h3Var, android.graphics.Bitmap bitmap) {
        this.f200945e = h3Var;
        this.f200944d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.gallery.h3 h3Var = this.f200945e;
        ((jt0.i) h3Var.f200981e.f201132p).put(h3Var.f200980d + "", this.f200944d);
    }
}
