package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public final class z9 implements m34.e {

    /* renamed from: d, reason: collision with root package name */
    public int f201616d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.k1 f201617e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ja f201618f;

    public z9(com.tencent.mm.ui.chatting.gallery.k1 k1Var, com.tencent.mm.ui.chatting.gallery.ja jaVar) {
        this.f201617e = k1Var;
        this.f201618f = jaVar;
    }

    @Override // m34.e
    public void a(int i17) {
        com.tencent.mm.ui.chatting.gallery.k1 k1Var = this.f201617e;
        com.tencent.mm.ui.chatting.gallery.ta v17 = k1Var.v();
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = v17.f201438p;
        kotlin.jvm.internal.o.e(f4Var, "null cannot be cast to non-null type com.tencent.mm.plugin.thumbplayer.view.IThumbPlayerVideoView");
        pk4.d dVar = (pk4.d) f4Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.Imagegallery.handler.video.tp", "onSeekTo(" + i17 + ')');
        v17.d();
        v17.f201437o.setVisibility(8);
        boolean e17 = dVar.e();
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = k1Var.f201092g;
        com.tencent.mm.ui.chatting.gallery.ja jaVar = this.f201618f;
        if (e17) {
            dVar.setOnSeekCompleteCallback(new com.tencent.mm.ui.chatting.gallery.y9(jaVar, v17));
            dVar.a(i17 * 1000, true);
        } else {
            com.tencent.mm.storage.f9 w17 = k1Var.w();
            if (w17 != null && w17.isVideo()) {
                t21.d3.w(w17.z0(), i17 * 1000, dVar.getIsOnlineVideo());
            }
            int I7 = imageGalleryUI.I7();
            k1Var.f201098p.A(k1Var.y(I7), I7);
        }
        imageGalleryUI.getClass();
        com.tencent.mm.storage.f9 w18 = k1Var.w();
        if (w18 != null && w18.M2()) {
            imageGalleryUI.f200676y.c(w18, 13);
        }
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_c2c_video_seek_bar_new_enable, 1) == 1) {
            jaVar.A = i17 * 1000;
            jz5.l[] lVarArr = new jz5.l[6];
            lVarArr[0] = new jz5.l("playeridentifier", java.lang.Long.valueOf(yd5.p.f461127q));
            lVarArr[1] = new jz5.l("chat_username", imageGalleryUI.f200599d);
            lVarArr[2] = new jz5.l("msgid", java.lang.Long.valueOf(imageGalleryUI.Q1));
            lVarArr[3] = new jz5.l("chat_type", java.lang.Integer.valueOf(com.tencent.mm.storage.z3.N4(imageGalleryUI.f200599d) ? 2 : 1));
            lVarArr[4] = new jz5.l("report_scene", java.lang.Integer.valueOf(yd5.p.f461128r));
            lVarArr[5] = new jz5.l("drag_process_type", java.lang.Integer.valueOf(this.f201616d));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("video_drag_process", kz5.c1.k(lVarArr), 31762);
        }
        imageGalleryUI.a9(true, imageGalleryUI.I7());
    }

    @Override // m34.e
    public void b() {
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_c2c_video_seek_bar_new_enable, 1) == 1;
        com.tencent.mm.ui.chatting.gallery.ja jaVar = this.f201618f;
        com.tencent.mm.ui.chatting.gallery.k1 k1Var = this.f201617e;
        if (z17) {
            this.f201616d = k1Var.f201092g.x8() ? 1 : 2;
            if (k1Var.v() != null) {
                jaVar.B += java.lang.Math.abs(r0.f201438p.getCurrentPosition() - jaVar.A);
                jaVar.A = r0.f201438p.getCurrentPosition();
            }
        } else {
            com.tencent.mm.ui.chatting.gallery.ta v17 = k1Var.v();
            if (v17 != null) {
                v17.d();
                ((com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerViewContainer) v17.f201438p).pause();
                jaVar.L(v17, false);
                kotlinx.coroutines.r2 r2Var = jaVar.f201074o;
                if (r2Var != null) {
                    kotlinx.coroutines.p2.a(r2Var, null, 1, null);
                }
            }
        }
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = k1Var.f201092g;
        imageGalleryUI.a9(false, imageGalleryUI.I7());
        com.tencent.mars.xlog.Log.i("MicroMsg.Imagegallery.handler.video.tp", "onSeekPre");
    }

    @Override // m34.e
    public void d(int i17) {
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_c2c_video_seek_bar_new_enable, 1) == 1) {
            com.tencent.mm.ui.chatting.gallery.k1 k1Var = this.f201617e;
            com.tencent.mm.ui.chatting.gallery.ta v17 = k1Var.v();
            com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = v17.f201438p;
            kotlin.jvm.internal.o.e(f4Var, "null cannot be cast to non-null type com.tencent.mm.plugin.thumbplayer.view.IThumbPlayerVideoView");
            pk4.d dVar = (pk4.d) f4Var;
            v17.f201437o.setVisibility(8);
            dVar.a(i17 * 1000, false);
            k1Var.f201092g.o9(false);
            k1Var.f201092g.t9();
            if (dVar.isPlaying()) {
                dVar.pause();
                com.tencent.mm.ui.chatting.gallery.ja jaVar = this.f201618f;
                jaVar.L(v17, false);
                kotlinx.coroutines.r2 r2Var = jaVar.f201074o;
                if (r2Var != null) {
                    kotlinx.coroutines.p2.a(r2Var, null, 1, null);
                }
            }
        }
    }
}
