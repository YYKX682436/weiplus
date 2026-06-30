package com.tencent.mm.plugin.luckymoney.model;

@j95.b
/* loaded from: classes9.dex */
public class w2 extends i95.w implements gb3.j {

    /* renamed from: d, reason: collision with root package name */
    public static final pq5.i f145676d = new pq5.i(new com.tencent.mm.plugin.luckymoney.model.a2());

    public static void tj(java.lang.Runnable runnable) {
        if (com.tencent.mm.sdk.platformtools.u3.e()) {
            runnable.run();
        } else {
            com.tencent.mm.sdk.platformtools.u3.h(runnable);
        }
    }

    public static void wi(com.tencent.mm.plugin.luckymoney.model.w2 w2Var, android.widget.ImageView imageView, java.lang.String str, int i17, int i18, long j17) {
        w2Var.getClass();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(19232, java.lang.Integer.valueOf(imageView == null ? 2 : 1), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18 + 1), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - j17), str);
    }

    public r45.jm5 Ai(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyEnvelopeLogic", "[checkCoverInfoXmlAvailable] coverInfoBase64 is null");
            return null;
        }
        r45.jm5 jm5Var = new r45.jm5();
        try {
            jm5Var.parseFrom(android.util.Base64.decode(str, 0));
            if (com.tencent.mm.sdk.platformtools.t8.K0(jm5Var.f377944p)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyEnvelopeLogic", "[checkCoverInfoXmlAvailable] coverInfoDetail.packet_id is null");
                return null;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "[checkCoverInfoXmlAvailable] success");
            return jm5Var;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyEnvelopeLogic", "[checkCoverInfoXmlAvailable] parse failed ： %s ", e17.getMessage());
            return null;
        }
    }

    public void Bi(r45.wv3 wv3Var, int i17, com.tencent.mm.plugin.luckymoney.model.v2 v2Var, int i18, int i19) {
        r45.xv3 xv3Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "get bitmap by url: %s", java.lang.Integer.valueOf(i17));
        if (wv3Var == null || (xv3Var = wv3Var.f389501g) == null) {
            return;
        }
        if (i17 != 0) {
            if (i17 == 1) {
                int b17 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.plugin.appbrand.jsapi.audio.a0.CTRL_INDEX);
                int b18 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 480);
                if (i18 <= 0 || i19 <= 0) {
                    fj(xv3Var.f390479f, xv3Var.f390482i, wv3Var.f389500f, b17, b18, false, v2Var);
                    return;
                } else {
                    hj(xv3Var.f390479f, xv3Var.f390482i, wv3Var.f389500f, i18, i19, false, false, 0, v2Var);
                    return;
                }
            }
            if (i17 == 2) {
                ij(xv3Var.f390480g, xv3Var.f390483m, wv3Var.f389500f, v2Var);
                return;
            }
            if (i17 == 3) {
                int dimensionPixelSize = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a4y);
                fj(xv3Var.f390477d, xv3Var.f390484n, wv3Var.f389500f, (int) (dimensionPixelSize / 0.2194f), dimensionPixelSize, false, v2Var);
                return;
            }
            if (i17 == 6) {
                ij(xv3Var.f390487q, xv3Var.f390488r, wv3Var.f389500f, v2Var);
                return;
            }
            if (i17 == 7) {
                int b19 = (int) (i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.plugin.appbrand.jsapi.audio.a0.CTRL_INDEX) * 1.1f);
                int i27 = (int) (b19 * 1.72f);
                if (i18 <= 0 || i19 <= 0) {
                    fj(xv3Var.f390485o, xv3Var.f390486p, wv3Var.f389500f, b19, i27, false, v2Var);
                    return;
                } else {
                    hj(xv3Var.f390485o, xv3Var.f390486p, wv3Var.f389500f, i18, i19, false, false, 0, v2Var);
                    return;
                }
            }
            if (i17 != 8) {
                if (i17 != 12) {
                    return;
                }
                int b27 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 68);
                int i28 = (int) (b27 / 0.5965f);
                if (i18 <= 0 || i19 <= 0) {
                    java.lang.String str = xv3Var.K;
                    fj(str, str, wv3Var.f389500f, b27, i28, false, v2Var);
                    return;
                } else {
                    java.lang.String str2 = xv3Var.K;
                    fj(str2, str2, wv3Var.f389500f, i18, i19, false, v2Var);
                    return;
                }
            }
        }
        ij(xv3Var.f390478e, xv3Var.f390481h, wv3Var.f389500f, v2Var);
    }

    public final android.graphics.Bitmap Di(com.tencent.mm.vfs.r6 r6Var, java.lang.String str) {
        boolean m17 = r6Var.m();
        boolean A = r6Var.A();
        java.lang.String p17 = com.tencent.mm.vfs.w6.p(r6Var.u());
        if (com.tencent.mm.sdk.platformtools.t8.K0(p17)) {
            return null;
        }
        boolean equals = p17.equals(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "get from file: %s, %s, %s", java.lang.Boolean.valueOf(m17), java.lang.Boolean.valueOf(A), java.lang.Boolean.valueOf(equals));
        if (m17 && A && equals) {
            return com.tencent.mm.sdk.platformtools.x.J(r6Var.o(), null);
        }
        if (!equals) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(991, 3);
        }
        if (!m17) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(991, 4);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Ni(r45.wv3 r8, int r9, com.tencent.mm.plugin.luckymoney.model.v2 r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.luckymoney.model.w2.Ni(r45.wv3, int, com.tencent.mm.plugin.luckymoney.model.v2, int, int):void");
    }

    public boolean Ri() {
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_lucky_money_check_coverinfo_bubble_switch, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "[getOpenDoCheckCoverInfoUpdateBubbleSwitch] svrOpen is : %s", java.lang.Boolean.valueOf(fj6));
        return fj6;
    }

    public boolean Ui() {
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_lucky_money_check_coverinfo_order_switch, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "[getOpenDoCheckCoverInfoUpdatePlaceOrderSwitch] svrOpen is : %s", java.lang.Boolean.valueOf(fj6));
        return fj6;
    }

    public final android.graphics.Bitmap Vi(com.tencent.mm.vfs.r6 r6Var, java.lang.String str, int i17, int i18) {
        boolean m17 = r6Var.m();
        boolean A = r6Var.A();
        if (m17 && A) {
            return com.tencent.mm.sdk.platformtools.x.j0(r6Var.o(), i18, i17, 0.0f);
        }
        return null;
    }

    public void Zi(android.widget.ImageView imageView, int i17, int i18, r45.wv3 wv3Var, boolean z17, int i19, com.tencent.mm.sdk.platformtools.n3 n3Var) {
        if (imageView == null || wv3Var == null || wv3Var.f389501g == null) {
            return;
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        imageView.setTag(com.tencent.mm.R.id.j1c, wv3Var.f389501g.f390478e);
        imageView.setTag(com.tencent.mm.R.id.j19, java.lang.Integer.valueOf(wv3Var.f389499e));
        Ni(wv3Var, i19, new com.tencent.mm.plugin.luckymoney.model.u1(this, i17, i18, z17, imageView, elapsedRealtime, n3Var), 0, 0);
    }

    public void aj(android.widget.ImageView imageView, r45.wv3 wv3Var, gb3.i iVar, int i17, int i18, int i19) {
        if (imageView == null || wv3Var == null || wv3Var.f389501g == null) {
            return;
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        imageView.setTag(com.tencent.mm.R.id.j1c, wv3Var.f389501g.f390479f);
        imageView.setTag(com.tencent.mm.R.id.j19, java.lang.Integer.valueOf(wv3Var.f389499e));
        Ni(wv3Var, 1, new com.tencent.mm.plugin.luckymoney.model.o1(this, iVar, i17, i18, i19, imageView, elapsedRealtime), i17, i18);
    }

    public void bj(android.widget.ImageView imageView, r45.wv3 wv3Var, gb3.i iVar, int i17, int i18) {
        if (imageView == null || wv3Var == null || wv3Var.f389501g == null) {
            return;
        }
        imageView.setTag(com.tencent.mm.R.id.j1c, wv3Var.f389501g.f390485o);
        imageView.setTag(com.tencent.mm.R.id.j19, java.lang.Integer.valueOf(wv3Var.f389499e));
        Ni(wv3Var, 7, new com.tencent.mm.plugin.luckymoney.model.r1(this, iVar, i17, i18, imageView), i17, i18);
    }

    public final void cj(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        hj(str, str2, str3, 0, 0, false, false, 0, null);
    }

    public final void fj(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, boolean z17, com.tencent.mm.plugin.luckymoney.model.v2 v2Var) {
        hj(str, str2, str3, 0, 0, z17, false, 0, v2Var);
    }

    public final void hj(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, boolean z17, boolean z18, int i19, com.tencent.mm.plugin.luckymoney.model.v2 v2Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "load image: %s, %s,width :%s , height :%s", str, str2, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            if (v2Var != null) {
                v2Var.a(null, 0, str);
                return;
            }
            return;
        }
        n11.a aVar = (n11.a) f145676d.a();
        if (i18 <= 0) {
            i18 = i65.a.k(com.tencent.mm.sdk.platformtools.x2.f193071a);
        }
        if (i17 <= 0) {
            i17 = i65.a.B(com.tencent.mm.sdk.platformtools.x2.f193071a);
        }
        o11.f fVar = new o11.f();
        fVar.f342083g = hb3.o.Ni().Zi();
        fVar.f342086j = i17;
        fVar.f342087k = i18;
        fVar.f342096t = z17;
        fVar.f342089m = z18;
        fVar.f342090n = i19;
        fVar.f342078b = true;
        aVar.i(str, null, fVar.a(), new com.tencent.mm.plugin.luckymoney.model.g1(this, str3, str2, v2Var));
    }

    public final void ij(java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.mm.plugin.luckymoney.model.v2 v2Var) {
        hj(str, str2, str3, 0, 0, false, false, 0, v2Var);
    }

    public void mj(android.widget.ImageView imageView, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, com.tencent.mm.sdk.platformtools.w1 w1Var) {
        if (imageView == null || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        imageView.setTag(com.tencent.mm.R.id.j1c, str);
        fj(str, str2, str3, i18, i17, true, new com.tencent.mm.plugin.luckymoney.model.j2(this, imageView, w1Var));
    }

    public void nj(android.widget.ImageView imageView, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, boolean z17, int i19, gb3.i iVar, int i27, int i28, int i29) {
        android.graphics.Bitmap bitmap;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "load story view");
        if (imageView == null || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        imageView.setTag(com.tencent.mm.R.id.j1c, str);
        imageView.setTag(com.tencent.mm.R.id.j19, java.lang.Integer.valueOf(i27));
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "subTypeID：%s，envelopeType：%s,index:%s", java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29));
        if (i27 > 0) {
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_lucky_money_envelope_load_local_photo_res_config, true)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "[static luckymoney resource] use local：LuckyMoneyEnvelopeLocalPhotoRes - subTypeID：%s，envelopeType：%s,index:%s ", java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29));
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "[getStoryBitmapBySubtype] subtypeID: %s, envelopeType: %s, index：%s", java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29));
                if (i28 == 4) {
                    bitmap = Vi(new com.tencent.mm.vfs.r6(com.tencent.mm.plugin.luckymoney.model.d4.c(i27), "detail_image_" + i29 + ".png"), "", i17, i18);
                } else if (i28 == 5) {
                    bitmap = Vi(new com.tencent.mm.vfs.r6(com.tencent.mm.plugin.luckymoney.model.d4.c(i27), "detail_video_thumb_" + i29 + ".png"), "", i17, i18);
                } else if (i28 == 2) {
                    bitmap = Vi(new com.tencent.mm.vfs.r6(com.tencent.mm.plugin.luckymoney.model.d4.b(i27), "detail.png"), "", i17, i18);
                } else {
                    java.lang.String str4 = com.tencent.mm.plugin.luckymoney.model.d4.f145227d;
                    ((yy.a) ((zy.r) i95.n0.c(zy.r.class))).wi(58);
                    com.tencent.mars.xlog.Log.w("MicroMsg.LuckyMoneyEnvelopeLogic", "[getStoryBitmapBySubtype] can't find subtype res: %s", java.lang.Integer.valueOf(i27));
                    bitmap = null;
                }
                if (bitmap == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyEnvelopeLogic", "[getStoryBitmapBySubtype] bitmap == null");
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(991, 5);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "[getStoryBitmapBySubtype] success");
                }
                if (bitmap != null) {
                    tj(new com.tencent.mm.plugin.luckymoney.model.k2(this, bitmap, i27, str, iVar, imageView, elapsedRealtime));
                    return;
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "[static luckymoney resource] use net：LuckyMoneyEnvelopeLocalPhotoRes - subTypeID：%s，envelopeType：%s,index:%s ", java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29));
        hj(str, str2, str3, i18, i17, false, z17, i19, new com.tencent.mm.plugin.luckymoney.model.m2(this, iVar, imageView, elapsedRealtime));
    }

    public void oj(android.widget.ImageView imageView, r45.wv3 wv3Var, int i17, int i18, gb3.i iVar) {
        if (imageView == null || wv3Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyEnvelopeLogic", "[loadThumbView] iv == null || hbEnvelopSource == null");
            if (iVar != null) {
                iVar.onComplete(false);
                return;
            }
            return;
        }
        r45.xv3 xv3Var = wv3Var.f389501g;
        if (xv3Var != null && !com.tencent.mm.sdk.platformtools.t8.K0(xv3Var.K)) {
            imageView.setTag(com.tencent.mm.R.id.j1c, wv3Var.f389501g.K);
            Ni(wv3Var, 12, new com.tencent.mm.plugin.luckymoney.model.l1(this, iVar, i17, i18, imageView), i17, i18);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyEnvelopeLogic", "hbEnvelopSource.sourceObject == null || thumbImageUrl is null");
            if (iVar != null) {
                iVar.onComplete(false);
            }
        }
    }

    public boolean pj(java.lang.String str, java.lang.String str2, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "[needUpdateCoverInfoDetail] status_flag: %s, packet_id : %s, pay_msg_id (sendid): %s", java.lang.Integer.valueOf(i17), str2, str);
        return (i17 & 4) != 0;
    }

    public void qj(r45.nm5 nm5Var, boolean z17) {
        if (nm5Var == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "do preload red packet: %s", nm5Var.f381508q);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(nm5Var.f381499e)) {
            cj(nm5Var.f381499e, nm5Var.f381500f, nm5Var.f381508q);
        }
        java.util.LinkedList linkedList = nm5Var.f381503i;
        if (linkedList == null || linkedList.isEmpty()) {
            return;
        }
        for (int i17 = 0; i17 < linkedList.size(); i17++) {
            r45.re6 re6Var = (r45.re6) linkedList.get(i17);
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            if (re6Var.f384774d == 1) {
                ij(re6Var.f384775e, re6Var.f384776f, nm5Var.f381508q, new com.tencent.mm.plugin.luckymoney.model.p2(this, elapsedRealtime));
            } else {
                ij(re6Var.f384779i, re6Var.f384780m, nm5Var.f381508q, new com.tencent.mm.plugin.luckymoney.model.q2(this, elapsedRealtime));
                if (z17 && (com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a) || com.tencent.mars.comm.NetStatusUtil.is4G(com.tencent.mm.sdk.platformtools.x2.f193071a))) {
                    java.lang.String str = re6Var.f384775e;
                    java.util.Set set = com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoManager.f145801o;
                    java.lang.String str2 = "MMVideo_" + str.hashCode();
                    java.lang.String a17 = com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoManager.a(re6Var.f384775e);
                    boolean z18 = com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoManager.b().getInt(str2, 0) == 1;
                    boolean j17 = com.tencent.mm.vfs.w6.j(a17);
                    com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "do story video preload: %s, %s", java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(j17));
                    if (!j17 && !z18) {
                        if (com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoManager.c(nm5Var.G, com.tencent.mm.plugin.luckymoney.model.d4.f(nm5Var.G, i17))) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "[static luckymoney resource] has local video，do not preload");
                            return;
                        }
                        com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoManager.g(str2, a17, re6Var.f384775e, re6Var.f384776f, true, null, new com.tencent.mm.plugin.luckymoney.model.r2(this));
                    }
                }
            }
        }
    }

    public float rj(int i17, r45.wv3 wv3Var, android.view.View view, android.view.View view2, kotlinx.coroutines.y0 y0Var, int i18, int i19, android.view.View view3, int i27) {
        int i28;
        float f17;
        int b17;
        if (view == null || view2 == null || !(view2 instanceof com.tencent.mm.chatting.component.ListScrollPAGView)) {
            return 0.0f;
        }
        com.tencent.mm.chatting.component.ListScrollPAGView listScrollPAGView = (com.tencent.mm.chatting.component.ListScrollPAGView) view2;
        if (i18 == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyEnvelopeLogic", "[renderEnvelopeCoverAtmosphereDynamic] coverWidth == 0, fix it");
            i28 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.plugin.appbrand.jsapi.audio.a0.CTRL_INDEX);
        } else {
            i28 = i18;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ((com.tencent.mm.plugin.luckymoney.model.w2) ((gb3.j) i95.n0.c(gb3.j.class))).getClass();
        float f18 = i28 * 1.6399f;
        int round = java.lang.Math.round(f18);
        int round2 = java.lang.Math.round(f18 * 1.2608f);
        layoutParams.width = round;
        layoutParams.height = round2;
        view.setLayoutParams(layoutParams);
        float f19 = i19;
        if (f19 == 0.0f) {
            java.util.HashMap hashMap = com.tencent.mm.plugin.luckymoney.model.m5.f145452a;
            if (round2 == 0 || view3 == null) {
                f19 = 0.0f;
            } else {
                int[] iArr = new int[2];
                view3.getLocationOnScreen(iArr);
                f19 = ((iArr[1] + view3.getHeight()) - round2) - i27;
            }
            if (f19 == 0.0f) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyEnvelopeLogic", "[renderEnvelopeCoverAtmosphereDynamic] atmosphereDynamicCoverY == 0, fix it");
                int i29 = com.tencent.mm.ui.bh.a(com.tencent.mm.sdk.platformtools.x2.f193071a).f197136b;
                if (view3 != null) {
                    f17 = i29 * 0.5f;
                    b17 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 48);
                } else {
                    f17 = i29 * 0.5f;
                    b17 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 64);
                }
                f19 = (f17 + b17) - round2;
            }
        }
        float f27 = f19;
        view.setY(f27);
        com.tencent.mm.plugin.luckymoney.model.n3.f145460a.b(wv3Var, i17, y0Var, new com.tencent.mm.plugin.luckymoney.model.f2(this, java.lang.System.currentTimeMillis(), view2, view, i17, listScrollPAGView, wv3Var));
        return f27;
    }

    public java.lang.String sj(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyEnvelopeLogic", "[replaceBetweenTags] Util.isNullOrNil(originalString) || Util.isNullOrNil(replaceContent), return originalString");
            return str;
        }
        try {
            int indexOf = str.indexOf(str2);
            int indexOf2 = str.indexOf(str3);
            if (indexOf != -1 && indexOf2 != -1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "[replaceBetweenTags] contain tag， replace success");
                return new java.lang.StringBuilder(str).replace(indexOf + str2.length(), indexOf2, str4).toString();
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyEnvelopeLogic", "[replaceBetweenTags] find failed : %s", th6.getMessage());
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyEnvelopeLogic", "[replaceBetweenTags] failed, return originalString");
        return str;
    }

    public void uj(android.view.ViewGroup viewGroup, android.view.View view, boolean z17) {
        if (viewGroup == null || view == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyEnvelopeLogic", "[setAllParentsNotClip] rootView == null || targetView == null");
            return;
        }
        while (view != null && view != viewGroup) {
            view = (android.view.View) view.getParent();
            if (view instanceof android.view.ViewGroup) {
                try {
                    ((android.view.ViewGroup) view).setClipChildren(false);
                    ((android.view.ViewGroup) view).setClipToPadding(false);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyEnvelopeLogic", "[setAllParentsNotClip] while targetView error ：%s", th6.toString());
                }
            }
        }
        try {
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
        } catch (java.lang.Throwable th7) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyEnvelopeLogic", "[setAllParentsNotClip] while rootView error ：%s", th7.toString());
        }
        if (!z17 || viewGroup.getParent() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyEnvelopeLogic", "[setAllParentsNotClip] rootView.getParent() == null || !needClipRootParent,return");
        } else {
            ((android.view.ViewGroup) viewGroup.getParent()).setClipToPadding(false);
            ((android.view.ViewGroup) viewGroup.getParent()).setClipChildren(false);
        }
    }

    public void vj(r45.wv3 wv3Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "trigger load envelope resources");
        if (wv3Var == null || wv3Var.f389501g == null) {
            return;
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        r45.xv3 xv3Var = wv3Var.f389501g;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(xv3Var.f390478e) && !com.tencent.mm.sdk.platformtools.t8.K0(xv3Var.f390481h)) {
            ij(xv3Var.f390478e, xv3Var.f390481h, wv3Var.f389500f, new com.tencent.mm.plugin.luckymoney.model.s2(this, elapsedRealtime));
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(xv3Var.f390480g) && !com.tencent.mm.sdk.platformtools.t8.K0(xv3Var.f390483m)) {
            ij(xv3Var.f390480g, xv3Var.f390483m, wv3Var.f389500f, new com.tencent.mm.plugin.luckymoney.model.t2(this, elapsedRealtime));
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(xv3Var.f390477d) && !com.tencent.mm.sdk.platformtools.t8.K0(xv3Var.f390484n)) {
            cj(xv3Var.f390477d, xv3Var.f390484n, wv3Var.f389500f);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(xv3Var.K)) {
            java.lang.String str = xv3Var.K;
            cj(str, str, wv3Var.f389500f);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(xv3Var.f390479f) && !com.tencent.mm.sdk.platformtools.t8.K0(xv3Var.f390482i)) {
            ij(xv3Var.f390479f, xv3Var.f390482i, wv3Var.f389500f, new com.tencent.mm.plugin.luckymoney.model.u2(this, elapsedRealtime));
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(xv3Var.f390487q) && !com.tencent.mm.sdk.platformtools.t8.K0(xv3Var.f390488r)) {
            cj(xv3Var.f390487q, xv3Var.f390488r, wv3Var.f389500f);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(xv3Var.f390485o) && !com.tencent.mm.sdk.platformtools.t8.K0(xv3Var.f390486p)) {
            cj(xv3Var.f390485o, xv3Var.f390486p, wv3Var.f389500f);
        }
        kotlinx.coroutines.y0 b17 = com.tencent.mm.wallet_core.model.z1.f214041a.b();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(xv3Var.f390492v)) {
            com.tencent.mm.plugin.luckymoney.model.n3 n3Var = com.tencent.mm.plugin.luckymoney.model.n3.f145460a;
            if (com.tencent.mm.sdk.platformtools.t8.K0(n3Var.d(wv3Var.f389499e, 3))) {
                java.lang.String str2 = xv3Var.f390492v;
                n3Var.a(str2, n3Var.c(str2, com.tencent.mm.plugin.luckymoney.model.n3.f145463d), b17, null);
            }
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(xv3Var.f390493w)) {
            com.tencent.mm.plugin.luckymoney.model.n3 n3Var2 = com.tencent.mm.plugin.luckymoney.model.n3.f145460a;
            if (com.tencent.mm.sdk.platformtools.t8.K0(n3Var2.d(wv3Var.f389499e, 0))) {
                java.lang.String str3 = xv3Var.f390493w;
                n3Var2.a(str3, n3Var2.c(str3, com.tencent.mm.plugin.luckymoney.model.n3.f145462c), b17, null);
            }
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(xv3Var.f390494x)) {
            com.tencent.mm.plugin.luckymoney.model.n3 n3Var3 = com.tencent.mm.plugin.luckymoney.model.n3.f145460a;
            if (com.tencent.mm.sdk.platformtools.t8.K0(n3Var3.d(wv3Var.f389499e, 1))) {
                java.lang.String str4 = xv3Var.f390494x;
                n3Var3.a(str4, n3Var3.c(str4, com.tencent.mm.plugin.luckymoney.model.n3.f145464e), b17, null);
            }
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(xv3Var.f390495y)) {
            com.tencent.mm.plugin.luckymoney.model.n3 n3Var4 = com.tencent.mm.plugin.luckymoney.model.n3.f145460a;
            if (com.tencent.mm.sdk.platformtools.t8.K0(n3Var4.d(wv3Var.f389499e, 2))) {
                java.lang.String str5 = xv3Var.f390495y;
                n3Var4.a(str5, n3Var4.c(str5, com.tencent.mm.plugin.luckymoney.model.n3.f145465f), b17, null);
            }
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(xv3Var.A)) {
            java.lang.String str6 = xv3Var.A;
            cj(str6, com.tencent.mm.sdk.platformtools.w2.a(str6), wv3Var.f389500f);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(xv3Var.E)) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(xv3Var.H)) {
                xv3Var.E = xv3Var.H;
            }
            com.tencent.mm.plugin.luckymoney.model.n3 n3Var5 = com.tencent.mm.plugin.luckymoney.model.n3.f145460a;
            if (com.tencent.mm.sdk.platformtools.t8.K0(n3Var5.d(wv3Var.f389499e, 9))) {
                java.lang.String str7 = xv3Var.E;
                n3Var5.a(str7, n3Var5.c(str7, com.tencent.mm.plugin.luckymoney.model.n3.f145466g), b17, null);
            }
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(xv3Var.F)) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(xv3Var.I)) {
                xv3Var.F = xv3Var.I;
            }
            com.tencent.mm.plugin.luckymoney.model.n3 n3Var6 = com.tencent.mm.plugin.luckymoney.model.n3.f145460a;
            if (com.tencent.mm.sdk.platformtools.t8.K0(n3Var6.d(wv3Var.f389499e, 10))) {
                java.lang.String str8 = xv3Var.F;
                n3Var6.a(str8, n3Var6.c(str8, com.tencent.mm.plugin.luckymoney.model.n3.f145467h), b17, null);
            }
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(xv3Var.G)) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(xv3Var.f390476J)) {
                xv3Var.G = xv3Var.f390476J;
            }
            com.tencent.mm.plugin.luckymoney.model.n3 n3Var7 = com.tencent.mm.plugin.luckymoney.model.n3.f145460a;
            if (com.tencent.mm.sdk.platformtools.t8.K0(n3Var7.d(wv3Var.f389499e, 11))) {
                java.lang.String str9 = xv3Var.G;
                n3Var7.a(str9, n3Var7.c(str9, com.tencent.mm.plugin.luckymoney.model.n3.f145468i), b17, null);
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(xv3Var.M)) {
            return;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(xv3Var.N)) {
            xv3Var.M = xv3Var.N;
        }
        com.tencent.mm.plugin.luckymoney.model.n3 n3Var8 = com.tencent.mm.plugin.luckymoney.model.n3.f145460a;
        if (com.tencent.mm.sdk.platformtools.t8.K0(n3Var8.d(wv3Var.f389499e, 13))) {
            java.lang.String str10 = xv3Var.M;
            n3Var8.a(str10, n3Var8.c(str10, com.tencent.mm.plugin.luckymoney.model.n3.f145469j), b17, null);
        }
    }

    public void wj(boolean z17, boolean z18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "trigger laod envelope after receive: %s, %s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_ENVELOPE_HAS_SOURCE_INT_SYNC, 1);
        if (z17) {
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            bk0.a.g().s(com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_FIRST_NEW_FLAG_STRING_SYNC, true);
        }
        gm0.j1.d().g(new com.tencent.mm.plugin.luckymoney.model.x5(0, "v1.0", 1));
        if (z18) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.luckymoney.model.n2(this));
        }
    }

    public void xj(ot0.j jVar, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "do trigger load red packet story: %s, %s", jVar.f348539k, java.lang.Boolean.valueOf(jVar.f348543o));
        cj(jVar.f348541m, jVar.f348542n, jVar.f348539k);
        if (com.tencent.mm.sdk.platformtools.t8.K0(jVar.f348539k) || !jVar.f348543o) {
            return;
        }
        dc3.a aVar = new dc3.a();
        aVar.field_packet_id = jVar.f348539k;
        boolean z17 = hb3.o.Ni().Vi().get(aVar, new java.lang.String[0]);
        if (java.lang.System.currentTimeMillis() - aVar.field_update_time > 86400000) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LuckyMoneyEnvelopeLogic", "need refetch story data");
            z17 = false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "trigger load red packet story resource: %s", java.lang.Boolean.valueOf(z17));
        if (z17) {
            return;
        }
        cc3.b bVar = new cc3.b();
        bVar.f213885c = new cc3.a(jVar.f348539k, false, str);
        bVar.d(new com.tencent.mm.plugin.luckymoney.model.o2(this), true, 50L);
    }
}
