package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class a2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f203251d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.b2 f203252e;

    public a2(com.tencent.mm.ui.chatting.viewitems.b2 b2Var, android.graphics.Bitmap bitmap) {
        this.f203252e = b2Var;
        this.f203251d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f203252e.f203449a.f205743f.setImageBitmap(this.f203251d);
    }
}
