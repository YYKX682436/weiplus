package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class c2 implements com.tencent.mm.ui.chatting.gallery.l8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f200828a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.k1 f200829b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.d2 f200830c;

    public c2(com.tencent.mm.ui.chatting.gallery.d2 d2Var, long j17, com.tencent.mm.ui.chatting.gallery.k1 k1Var) {
        this.f200830c = d2Var;
        this.f200828a = j17;
        this.f200829b = k1Var;
    }

    public void a(java.lang.Boolean bool) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AutoList", "isPlaying : " + bool);
        if (bool.booleanValue()) {
            return;
        }
        com.tencent.mm.ui.chatting.gallery.d2.a(this.f200830c, false, this.f200828a);
        com.tencent.mm.ui.chatting.gallery.g2 g2Var = this.f200829b.f201100r;
        if (g2Var != null) {
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = ((com.tencent.mm.ui.chatting.gallery.d5) g2Var).f200866a;
            if (imageGalleryUI.f200611g == null) {
                return;
            }
            imageGalleryUI.o9(false);
            imageGalleryUI.c9();
            imageGalleryUI.f200611g.onPageSelected(com.tencent.mm.ui.chatting.gallery.d2.f200849o);
        }
    }
}
