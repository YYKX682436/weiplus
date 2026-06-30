package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class h3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f200980d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.k3 f200981e;

    public h3(com.tencent.mm.ui.chatting.gallery.k3 k3Var, int i17) {
        this.f200981e = k3Var;
        this.f200980d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.storage.f9 b17;
        com.tencent.mm.ui.chatting.gallery.f2 B;
        com.tencent.mm.ui.chatting.gallery.k3 k3Var = this.f200981e;
        com.tencent.mm.ui.chatting.gallery.g1 g1Var = k3Var.f201129m;
        if (g1Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ImageGalleryLazyLoader", "loader is null!");
            return;
        }
        com.tencent.mm.ui.chatting.gallery.t2 t2Var = (com.tencent.mm.ui.chatting.gallery.t2) g1Var;
        com.tencent.mm.ui.chatting.gallery.k1 k1Var = t2Var.f200886d;
        android.graphics.Bitmap bitmap = null;
        if (k1Var != null && (b17 = k1Var.f201093h.b(this.f200980d)) != null && (B = com.tencent.mm.ui.chatting.gallery.k1.B(b17)) != com.tencent.mm.ui.chatting.gallery.f2.video && B != com.tencent.mm.ui.chatting.gallery.f2.sight) {
            java.util.HashMap hashMap = t2Var.f201389n;
            java.lang.String str = (java.lang.String) hashMap.get(b17);
            if (str == null) {
                str = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).mj(b17, b17.z0(), true);
                hashMap.put(b17, str);
            }
            java.lang.String concat = str.concat("hd");
            bitmap = com.tencent.mm.vfs.w6.j(concat) ? com.tencent.mm.ui.chatting.gallery.t2.r(concat) : com.tencent.mm.ui.chatting.gallery.t2.r(str);
        }
        if (bitmap == null) {
            return;
        }
        k3Var.f201139w.post(new com.tencent.mm.ui.chatting.gallery.g3(this, bitmap));
    }
}
