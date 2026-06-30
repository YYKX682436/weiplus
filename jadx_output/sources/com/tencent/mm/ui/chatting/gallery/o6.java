package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class o6 implements com.tencent.mm.ui.widget.dialog.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f201237a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f201238b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f201239c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ImageGalleryUI f201240d;

    public o6(com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI, com.tencent.mm.storage.f9 f9Var, int i17, java.util.ArrayList arrayList) {
        this.f201240d = imageGalleryUI;
        this.f201237a = f9Var;
        this.f201238b = i17;
        this.f201239c = arrayList;
    }

    @Override // com.tencent.mm.ui.widget.dialog.d1
    public void onShow() {
        if (this.f201237a.isVideo() || this.f201237a.J2()) {
            h90.v vVar = (h90.v) i95.n0.c(h90.v.class);
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = this.f201240d;
            ((g90.s) vVar).aj(imageGalleryUI, this.f201237a, imageGalleryUI.T3, 1, this.f201238b, this.f201239c);
        }
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI2 = this.f201240d;
        int i17 = com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.f200588p4;
        imageGalleryUI2.C8(true);
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI3 = this.f201240d;
        oc5.g0 g0Var = imageGalleryUI3.f200669w2;
        if (g0Var != null) {
            long j17 = imageGalleryUI3.f200654r2;
            java.lang.Long l17 = g0Var.f344425i;
            if (l17 != null && l17.longValue() == j17) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageScanCodeManager", "onBottomSheetShowStart id: " + j17);
            java.lang.System.currentTimeMillis();
            g0Var.f344425i = java.lang.Long.valueOf(j17);
            ku5.u0 u0Var = ku5.t0.f312615d;
            oc5.a0 a0Var = new oc5.a0(g0Var, j17);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(a0Var, 200L, false);
        }
    }
}
