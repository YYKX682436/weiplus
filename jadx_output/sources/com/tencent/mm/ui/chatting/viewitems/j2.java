package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class j2 implements l01.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.v1 f204223d;

    public j2(com.tencent.mm.ui.chatting.viewitems.c2 c2Var, com.tencent.mm.ui.chatting.viewitems.v1 v1Var) {
        this.f204223d = v1Var;
    }

    @Override // l01.u
    public void b() {
        com.tencent.mars.xlog.Log.w("MicroMsg.ChattingItemAppMsgFrom", "hy: decode recorder cover failed receiver!");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(808, 2);
    }

    @Override // l01.u
    public void d() {
        this.f204223d.T.setVisibility(4);
    }

    @Override // l01.i0
    public java.lang.String key() {
        return "CHAT#" + ik1.i0.a(this);
    }

    @Override // l01.u
    public void onBitmapLoaded(android.graphics.Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        com.tencent.mm.ui.chatting.viewitems.v1 v1Var = this.f204223d;
        v1Var.T.setImageBitmap(bitmap);
        v1Var.T.setVisibility(0);
    }
}
