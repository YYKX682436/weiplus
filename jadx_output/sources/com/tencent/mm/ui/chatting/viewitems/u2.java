package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class u2 implements l01.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.v1 f205656d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f205657e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yb5.d f205658f;

    public u2(com.tencent.mm.ui.chatting.viewitems.o2 o2Var, com.tencent.mm.ui.chatting.viewitems.v1 v1Var, boolean z17, yb5.d dVar) {
        this.f205656d = v1Var;
        this.f205657e = z17;
        this.f205658f = dVar;
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
        com.tencent.mm.ui.chatting.viewitems.v1 v1Var = this.f205656d;
        if (bitmap == null || bitmap.isRecycled()) {
            v1Var.E.setVisibility(4);
            v1Var.G.setVisibility(0);
            v1Var.n(v1Var.F);
            return;
        }
        v1Var.E.setImageBitmap(bitmap);
        v1Var.E.setVisibility(0);
        v1Var.G.setVisibility(4);
        if (!this.f205657e) {
            v1Var.n(v1Var.F);
        } else {
            v1Var.F.setImageDrawable(i65.a.i(this.f205658f.g(), com.tencent.mm.R.raw.shortvideo_play_btn));
            v1Var.F.setVisibility(0);
        }
    }
}
