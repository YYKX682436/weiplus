package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class qa implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.sa f201301d;

    public qa(com.tencent.mm.ui.chatting.gallery.sa saVar) {
        this.f201301d = saVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI;
        java.util.HashMap hashMap;
        java.util.HashMap hashMap2;
        java.util.HashMap hashMap3;
        java.util.HashMap hashMap4;
        java.util.HashMap hashMap5;
        java.util.HashMap hashMap6;
        com.tencent.mm.ui.chatting.gallery.sa saVar = this.f201301d;
        boolean z17 = true;
        saVar.f201371d.f201424b.f201092g.g9(true);
        com.tencent.mm.ui.chatting.gallery.ta taVar = saVar.f201371d;
        com.tencent.mm.ui.chatting.gallery.k1 k1Var = taVar.f201424b;
        int i17 = taVar.f201425c;
        ((com.tencent.mm.ui.chatting.gallery.ja) k1Var.f201098p).getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Imagegallery.handler.video.tp", "removePlayingCache");
        saVar.f201371d.f201424b.f201092g.getClass();
        com.tencent.mm.ui.chatting.gallery.ja jaVar = (com.tencent.mm.ui.chatting.gallery.ja) saVar.f201371d.f201424b.f201098p;
        jaVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Imagegallery.handler.video.tp", "onVideoCompletion");
        com.tencent.mm.ui.chatting.gallery.k1 k1Var2 = jaVar.f200886d;
        com.tencent.mm.ui.chatting.gallery.ta v17 = k1Var2 != null ? k1Var2.v() : null;
        if (v17 == null) {
            return;
        }
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = v17.f201438p;
        pk4.d dVar = f4Var instanceof pk4.d ? (pk4.d) f4Var : null;
        if (dVar == null) {
            return;
        }
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_c2c_video_seek_bar_new_enable, 1) == 1) {
            com.tencent.mm.pluginsdk.ui.tools.f4 f4Var2 = v17.f201438p;
            kotlin.jvm.internal.o.e(f4Var2, "null cannot be cast to non-null type com.tencent.mm.plugin.thumbplayer.view.IThumbPlayerVideoView");
            float f17 = ((pk4.d) f4Var2).getF();
            long duration = v17.f201438p.getDuration() - jaVar.A;
            jaVar.B += duration;
            yd5.p pVar = jaVar.C;
            java.util.ArrayList arrayList = (pVar == null || (hashMap6 = pVar.f461139k) == null) ? null : (java.util.ArrayList) hashMap6.get(java.lang.Float.valueOf(f17));
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
            }
            arrayList.add(java.lang.Long.valueOf(duration));
            yd5.p pVar2 = jaVar.C;
            if (pVar2 != null && (hashMap5 = pVar2.f461139k) != null) {
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis() - jaVar.f201084y;
            jaVar.f201085z += currentTimeMillis;
            yd5.p pVar3 = jaVar.C;
            java.util.ArrayList arrayList2 = (pVar3 == null || (hashMap4 = pVar3.f461140l) == null) ? null : (java.util.ArrayList) hashMap4.get(java.lang.Float.valueOf(f17));
            if (arrayList2 == null) {
                arrayList2 = new java.util.ArrayList();
            }
            arrayList2.add(java.lang.Long.valueOf(currentTimeMillis));
            yd5.p pVar4 = jaVar.C;
            if (pVar4 != null && (hashMap3 = pVar4.f461140l) != null) {
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            yd5.p pVar5 = jaVar.C;
            if (pVar5 != null && (hashMap2 = pVar5.f461139k) != null) {
                for (java.util.Map.Entry entry : hashMap2.entrySet()) {
                    java.util.Iterator it = ((java.lang.Iterable) entry.getValue()).iterator();
                    while (it.hasNext()) {
                        long longValue = ((java.lang.Number) it.next()).longValue();
                        if (sb6.length() > 0) {
                            sb6.append("#");
                        }
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                        sb7.append(((java.lang.Number) entry.getKey()).floatValue());
                        sb7.append('|');
                        sb7.append(longValue);
                        sb6.append(sb7.toString());
                    }
                }
            }
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            yd5.p pVar6 = jaVar.C;
            if (pVar6 != null && (hashMap = pVar6.f461140l) != null) {
                for (java.util.Map.Entry entry2 : hashMap.entrySet()) {
                    java.util.Iterator it6 = ((java.lang.Iterable) entry2.getValue()).iterator();
                    while (it6.hasNext()) {
                        long longValue2 = ((java.lang.Number) it6.next()).longValue();
                        if (sb8.length() > 0 ? z17 : false) {
                            sb8.append("#");
                        }
                        java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
                        sb9.append(((java.lang.Number) entry2.getKey()).floatValue());
                        sb9.append('|');
                        sb9.append(longValue2);
                        sb8.append(sb9.toString());
                        z17 = true;
                    }
                }
            }
            yd5.p pVar7 = jaVar.C;
            if (pVar7 != null) {
                pVar7.f461141m = jaVar.f201085z;
            }
            if (pVar7 != null) {
                pVar7.f461142n = jaVar.B;
            }
            com.tencent.mm.ui.chatting.gallery.k1 k1Var3 = jaVar.f200886d;
            if (k1Var3 == null || (imageGalleryUI = k1Var3.f201092g) == null) {
                imageGalleryUI = null;
            }
            jz5.l[] lVarArr = new jz5.l[11];
            lVarArr[0] = new jz5.l("playeridentifier", java.lang.Long.valueOf(yd5.p.f461127q));
            yd5.p pVar8 = jaVar.C;
            lVarArr[1] = new jz5.l("chat_username", pVar8 != null ? pVar8.f461136h : null);
            lVarArr[2] = new jz5.l("msgid", pVar8 != null ? java.lang.Long.valueOf(pVar8.f461138j) : null);
            yd5.p pVar9 = jaVar.C;
            lVarArr[3] = new jz5.l("chat_type", pVar9 != null ? java.lang.Integer.valueOf(pVar9.f461137i) : null);
            lVarArr[4] = new jz5.l("report_scene", java.lang.Integer.valueOf(yd5.p.f461128r));
            lVarArr[5] = new jz5.l("video_stay_time_ms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - (imageGalleryUI != null ? imageGalleryUI.P1 : 0L)));
            lVarArr[6] = new jz5.l("speed_paly_process_list", sb6.toString());
            lVarArr[7] = new jz5.l("speed_paly_real_list", sb8.toString());
            yd5.p pVar10 = jaVar.C;
            lVarArr[8] = new jz5.l("play_real_time_ms", pVar10 != null ? java.lang.Long.valueOf(pVar10.f461141m) : null);
            yd5.p pVar11 = jaVar.C;
            lVarArr[9] = new jz5.l("play_process_time_ms", pVar11 != null ? java.lang.Long.valueOf(pVar11.f461142n) : null);
            yd5.p pVar12 = jaVar.C;
            lVarArr[10] = new jz5.l("video_time_ms", pVar12 != null ? java.lang.Long.valueOf(pVar12.f461143o) : null);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("video_end_play", kz5.c1.k(lVarArr), 31762);
            jaVar.C = null;
            yd5.p.f461127q = java.lang.System.currentTimeMillis();
            jaVar.f200886d.f201092g.o9(false);
            z17 = true;
        }
        jaVar.L(v17, z17);
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI2 = jaVar.f200886d.f201092g;
        imageGalleryUI2.U7();
        imageGalleryUI2.L1.a(0);
        v17.g(false, 0.0f);
        t21.d3.w(jaVar.f201079t, 0, dVar.getIsOnlineVideo());
        dVar.stop();
        jaVar.R(false);
    }
}
