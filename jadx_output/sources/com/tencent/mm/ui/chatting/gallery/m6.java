package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class m6 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f201194d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f201195e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ImageGalleryUI f201196f;

    public m6(com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI, com.tencent.mm.storage.f9 f9Var, java.util.ArrayList arrayList) {
        this.f201196f = imageGalleryUI;
        this.f201194d = f9Var;
        this.f201195e = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r10v5 */
    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        ?? r102;
        boolean z17;
        boolean booleanValue;
        boolean z18;
        g4Var.clear();
        com.tencent.mm.storage.f9 f9Var = this.f201194d;
        boolean e17 = c01.ia.e(f9Var);
        java.util.ArrayList arrayList = this.f201195e;
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = this.f201196f;
        if (e17) {
            int i17 = com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.f200588p4;
            if (!imageGalleryUI.i9() || com.tencent.mm.storage.z3.K3(imageGalleryUI.f200599d)) {
                return;
            }
            g4Var.g(5, imageGalleryUI.getString(com.tencent.mm.R.string.b2b), com.tencent.mm.R.raw.icons_outlined_chats);
            arrayList.add(6);
            return;
        }
        if (!c01.ia.y(f9Var) && !c01.ia.C(f9Var)) {
            java.lang.String string = (com.tencent.mm.ui.chatting.gallery.k1.L(f9Var) || com.tencent.mm.ui.chatting.gallery.k1.G(f9Var) || com.tencent.mm.ui.chatting.gallery.k1.K(f9Var)) ? imageGalleryUI.getString(com.tencent.mm.R.string.i89) : (com.tencent.mm.ui.chatting.gallery.k1.N(f9Var) || com.tencent.mm.ui.chatting.gallery.k1.M(f9Var)) ? !f9Var.M2() ? imageGalleryUI.getString(com.tencent.mm.R.string.i8d) : null : imageGalleryUI.getString(com.tencent.mm.R.string.i8c);
            if (!f9Var.M2()) {
                g4Var.g(1, string, com.tencent.mm.R.raw.icons_outlined_download);
                arrayList.add(4);
            }
        }
        if (com.tencent.mm.ui.chatting.gallery.k1.L(f9Var) || com.tencent.mm.ui.chatting.gallery.k1.K(f9Var)) {
            if (imageGalleryUI.H2 != 1) {
                g4Var.g(6, imageGalleryUI.getString(com.tencent.mm.R.string.b2d), com.tencent.mm.R.raw.icons_outlined_pencil);
                arrayList.add(5);
            }
        }
        int i18 = com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.f200588p4;
        imageGalleryUI.getClass();
        if (((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Di() && f9Var.J2() && !imageGalleryUI.f200662u) {
            lc5.p pVar = imageGalleryUI.f200641o;
            long j17 = imageGalleryUI.f200654r2;
            if (pVar.f318024v != j17 || j17 == 0) {
                pVar.f318024v = j17;
                java.lang.Boolean valueOf = java.lang.Boolean.valueOf(((ov.f0) ((pv.c0) i95.n0.c(pv.c0.class))).wi(pv.b0.f358483h));
                pVar.f318025w = valueOf;
                kotlin.jvm.internal.o.d(valueOf);
                booleanValue = valueOf.booleanValue();
            } else {
                java.lang.Boolean bool = pVar.f318025w;
                if (bool != null) {
                    booleanValue = bool.booleanValue();
                } else {
                    z18 = false;
                    r102 = 1;
                    g4Var.k(22, imageGalleryUI.getString(com.tencent.mm.R.string.o_e), com.tencent.mm.R.raw.floating_window_regular, imageGalleryUI.getResources().getColor(com.tencent.mm.R.color.abw), z18, false);
                    arrayList.add(10);
                }
            }
            z18 = booleanValue;
            r102 = 1;
            g4Var.k(22, imageGalleryUI.getString(com.tencent.mm.R.string.o_e), com.tencent.mm.R.raw.floating_window_regular, imageGalleryUI.getResources().getColor(com.tencent.mm.R.color.abw), z18, false);
            arrayList.add(10);
        } else {
            r102 = 1;
        }
        if (imageGalleryUI.i9() && imageGalleryUI.f200605e3 != null && !com.tencent.mm.storage.z3.K3(imageGalleryUI.f200599d)) {
            g4Var.g(5, imageGalleryUI.getString(com.tencent.mm.R.string.b2b), com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.t8() ? com.tencent.mm.R.raw.icons_locate_to_chat_regular : com.tencent.mm.R.raw.icons_outlined_chats);
            arrayList.add(6);
        }
        if (imageGalleryUI.f200683z2 && !imageGalleryUI.Z && !imageGalleryUI.q8()) {
            g4Var.g(20, com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.t8() ? imageGalleryUI.getString(com.tencent.mm.R.string.o_2) : imageGalleryUI.getString(com.tencent.mm.R.string.n7s), com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.t8() ? com.tencent.mm.R.raw.icons_gallery_regular : com.tencent.mm.R.raw.icons_filled_photowall);
            arrayList.add(7);
        }
        if ((com.tencent.mm.plugin.scanner.k1.f158750b || imageGalleryUI.g8(r102)) && !com.tencent.mm.sdk.platformtools.t8.K0(imageGalleryUI.x2())) {
            g4Var.g(7, imageGalleryUI.getString(com.tencent.mm.R.string.b2f), com.tencent.mm.R.raw.icons_outlined_translate);
            com.tencent.mm.autogen.mmdata.rpt.GalleryTranslateReportStruct galleryTranslateReportStruct = new com.tencent.mm.autogen.mmdata.rpt.GalleryTranslateReportStruct();
            galleryTranslateReportStruct.f58316d = imageGalleryUI.M2 == 2 ? 1L : 0L;
            galleryTranslateReportStruct.f58317e = 2L;
            galleryTranslateReportStruct.f58318f = 4L;
            com.tencent.mm.storage.f9 w17 = imageGalleryUI.f200611g.w();
            imageGalleryUI.getClass();
            m11.b0 v17 = com.tencent.mm.ui.chatting.gallery.t2.v(w17);
            if (v17 != null) {
                galleryTranslateReportStruct.q(v17.f());
                galleryTranslateReportStruct.p(v17.d());
            }
            galleryTranslateReportStruct.k();
            arrayList.add(8);
        }
        if (imageGalleryUI.K2) {
            g4Var.g(12, imageGalleryUI.getString(com.tencent.mm.R.string.b2c), com.tencent.mm.R.raw.icons_outlined_ocr);
            ((kz3.o) imageGalleryUI.f200643o3).a(2, com.tencent.mm.storage.z3.R4(f9Var.Q0()) ? 2 : r102, imageGalleryUI.L2);
        }
        if ((!imageGalleryUI.f200648p2 || imageGalleryUI.f200615h == -1) ? false : r102) {
            return;
        }
        final a00.j jVar = (a00.j) i95.n0.c(a00.j.class);
        if (!((t02.e) ((a00.i) i95.n0.c(a00.i.class))).ij() || com.tencent.mm.sdk.platformtools.t8.K0(f9Var.Q0()) || f9Var.getMsgId() <= 0) {
            z17 = false;
        } else {
            boolean z19 = (com.tencent.mm.ui.chatting.gallery.k1.N(f9Var) || com.tencent.mm.ui.chatting.gallery.k1.M(f9Var)) ? r102 : false;
            g4Var.g(24, imageGalleryUI.getString(z19 ? com.tencent.mm.R.string.nh6 : com.tencent.mm.R.string.f491230nh5), z19 ? com.tencent.mm.R.raw.video_bubble_regular : com.tencent.mm.R.raw.picture_bubble_regular);
            z17 = r102;
        }
        if (imageGalleryUI.f200657s2 && imageGalleryUI.f200660t2 == imageGalleryUI.f200654r2) {
            return;
        }
        imageGalleryUI.f200657s2 = r102;
        imageGalleryUI.f200660t2 = imageGalleryUI.f200654r2;
        if (!z17) {
            v02.f0 f0Var = (v02.f0) jVar;
            f0Var.getClass();
            if (f9Var == null) {
                return;
            }
            if (com.tencent.mm.sdk.platformtools.x2.n()) {
                kotlinx.coroutines.l.d(f0Var.qj(), null, null, new v02.x(f0Var, f9Var, null), 3, null);
                return;
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.DupCheckReportFeatureService", "reportGalleryMenuExpWithoutButton with MsgInfo is not supported in non-main process");
                return;
            }
        }
        yz5.a aVar = new yz5.a() { // from class: com.tencent.mm.ui.chatting.gallery.m6$$a
            @Override // yz5.a
            public final java.lang.Object invoke() {
                ((v02.f0) a00.j.this).xj();
                return jz5.f0.f302826a;
            }
        };
        v02.f0 f0Var2 = (v02.f0) jVar;
        f0Var2.getClass();
        if (f9Var == null) {
            return;
        }
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            kotlinx.coroutines.l.d(f0Var2.qj(), null, null, new v02.a0(f0Var2, f9Var, aVar, null), 3, null);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.DupCheckReportFeatureService", "startJourney with MsgInfo is not supported in non-main process");
        }
    }
}
