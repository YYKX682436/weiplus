package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class df implements l01.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.lf f203790d;

    public df(com.tencent.mm.ui.chatting.viewitems.ff ffVar, com.tencent.mm.ui.chatting.viewitems.lf lfVar) {
        this.f203790d = lfVar;
    }

    @Override // l01.u
    public void b() {
    }

    @Override // l01.u
    public void d() {
    }

    @Override // l01.i0
    public java.lang.String key() {
        return java.lang.String.format(java.util.Locale.ENGLISH, "CHATTING_ITEM_APPMSG_APPBRAND_COVER[%d %d]", 240, 192);
    }

    @Override // l01.u
    public void onBitmapLoaded(android.graphics.Bitmap bitmap) {
        com.tencent.mm.ui.chatting.viewitems.lf lfVar = this.f203790d;
        if (bitmap == null || bitmap.isRecycled()) {
            lfVar.f204477p.setVisibility(4);
            lfVar.f204478q.setVisibility(0);
        } else {
            lfVar.f204477p.setImageBitmap(bitmap);
            lfVar.f204477p.setVisibility(0);
            lfVar.f204478q.setVisibility(4);
        }
    }
}
