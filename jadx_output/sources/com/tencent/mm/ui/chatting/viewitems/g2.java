package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class g2 implements l01.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.v1 f204010d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f204011e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yb5.d f204012f;

    public g2(com.tencent.mm.ui.chatting.viewitems.c2 c2Var, com.tencent.mm.ui.chatting.viewitems.v1 v1Var, boolean z17, yb5.d dVar) {
        this.f204010d = v1Var;
        this.f204011e = z17;
        this.f204012f = dVar;
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
        com.tencent.mm.ui.chatting.viewitems.v1 v1Var = this.f204010d;
        if (bitmap == null || bitmap.isRecycled()) {
            v1Var.E.setVisibility(4);
            v1Var.G.setVisibility(0);
            v1Var.n(v1Var.F);
            return;
        }
        v1Var.E.setImageBitmap(bitmap);
        v1Var.E.setVisibility(0);
        v1Var.G.setVisibility(4);
        if (!this.f204011e) {
            v1Var.n(v1Var.F);
        } else {
            v1Var.F.setImageDrawable(i65.a.i(this.f204012f.g(), com.tencent.mm.R.raw.shortvideo_play_btn));
            v1Var.F.setVisibility(0);
        }
    }
}
