package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class y1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f206022d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.z1 f206023e;

    public y1(com.tencent.mm.ui.chatting.viewitems.z1 z1Var, android.graphics.Bitmap bitmap) {
        this.f206023e = z1Var;
        this.f206022d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f206023e.f206108a.f205743f.setImageBitmap(this.f206022d);
    }
}
