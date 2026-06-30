package kf3;

/* loaded from: classes5.dex */
public class t1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f307432d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f307433e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f307434f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kf3.u1 f307435g;

    public t1(kf3.u1 u1Var, java.lang.String str, java.lang.String str2, int i17) {
        this.f307435g = u1Var;
        this.f307432d = str;
        this.f307433e = str2;
        this.f307434f = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        int i18;
        int i19;
        com.tencent.mm.plugin.masssend.ui.MassSendMsgUI massSendMsgUI = this.f307435g.f307451a;
        java.lang.String str = this.f307433e;
        int i27 = com.tencent.mm.plugin.masssend.ui.MassSendMsgUI.f148539v;
        massSendMsgUI.getClass();
        boolean is2G = com.tencent.mars.comm.NetStatusUtil.is2G(massSendMsgUI);
        int shouldRemuxingVFS = com.tencent.mm.plugin.sight.base.SightVideoJNI.shouldRemuxingVFS(str, com.tencent.mm.plugin.appbrand.jsapi.appdownload.q1.CTRL_INDEX, 500, is2G ? 10485760 : 26214400, is2G ? 60000.0d : 300000.0d, 1000000);
        com.tencent.mars.xlog.Log.i("MicroMsg.MassSendMsgUI", "check remuxing, ret %d", java.lang.Integer.valueOf(shouldRemuxingVFS));
        boolean z17 = false;
        java.lang.String str2 = this.f307432d;
        if (shouldRemuxingVFS == 0) {
            java.lang.String rj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(null, bm5.f0.f22571s, str2, true);
            gp.d dVar = new gp.d();
            dVar.setDataSource(str);
            com.tencent.mars.xlog.Log.i("MicroMsg.MassSendMsgUI", "start remux, targetPath: %s", rj6);
            int P = com.tencent.mm.sdk.platformtools.t8.P(dVar.extractMetadata(18), 0);
            int P2 = com.tencent.mm.sdk.platformtools.t8.P(dVar.extractMetadata(19), 0);
            com.tencent.mm.modelcontrol.VideoTransPara videoTransPara = new com.tencent.mm.modelcontrol.VideoTransPara();
            com.tencent.mm.pointers.PInt pInt = new com.tencent.mm.pointers.PInt();
            com.tencent.mm.pointers.PInt pInt2 = new com.tencent.mm.pointers.PInt();
            com.tencent.mm.pointers.PInt pInt3 = new com.tencent.mm.pointers.PInt();
            com.tencent.mm.pointers.PInt pInt4 = new com.tencent.mm.pointers.PInt();
            com.tencent.mm.pointers.PInt pInt5 = new com.tencent.mm.pointers.PInt();
            ((be0.e) ((com.tencent.mm.feature.sight.api.o) i95.n0.c(com.tencent.mm.feature.sight.api.o.class))).getClass();
            com.tencent.mm.plugin.sight.base.e.f(str, pInt, pInt2, pInt3, pInt4, pInt5);
            videoTransPara.f71195h = pInt.value / 1000;
            videoTransPara.f71191d = pInt2.value;
            videoTransPara.f71192e = pInt3.value;
            videoTransPara.f71193f = pInt4.value;
            videoTransPara.f71194g = pInt5.value;
            com.tencent.mm.modelcontrol.VideoTransPara bj6 = d11.s.fj().bj(videoTransPara, null);
            int i28 = com.tencent.mm.plugin.sight.base.d.f162408c;
            if (bj6 == null) {
                int i29 = P;
                int i37 = P2;
                for (int i38 = 0; i38 < 3; i38++) {
                    if (i29 % 2 != 0) {
                        i29--;
                    }
                    if (i37 % 2 != 0) {
                        i37--;
                    }
                    if ((i29 >= i37 && (i29 <= 640 || i37 <= 480)) || (i29 <= i37 && (i29 <= 480 || i37 <= 640))) {
                        P = i29;
                        P2 = i37;
                        break;
                    } else {
                        i29 /= 2;
                        i37 /= 2;
                    }
                }
                i17 = i28;
                i19 = P2;
                i18 = P;
            } else {
                int i39 = bj6.f71191d;
                int i47 = bj6.f71192e;
                i17 = bj6.f71194g;
                i18 = i39;
                i19 = i47;
            }
            try {
                dVar.release();
            } catch (java.io.IOException unused) {
            }
            int remuxingVFS = com.tencent.mm.plugin.sight.base.SightVideoJNI.remuxingVFS(str, rj6, i18, i19, i17, com.tencent.mm.plugin.sight.base.d.f162407b, 8, 2, 25.0f, com.tencent.mm.plugin.sight.base.d.f162409d, null, 0, false, 0, 51);
            if (remuxingVFS < 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MassSendMsgUI", "remuxing video error");
                z17 = false;
            } else {
                massSendMsgUI.Y6(true, rj6);
                java.lang.String tj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(null, str2, false);
                if (!com.tencent.mm.vfs.w6.j(tj6)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MassSendMsgUI", "thumb not exist create one, thumbPath: %s", tj6);
                    try {
                        android.graphics.Bitmap D = com.tencent.mm.sdk.platformtools.x.D(rj6, 1, -1);
                        if (D != null) {
                            com.tencent.mm.sdk.platformtools.x.D0(D, 60, android.graphics.Bitmap.CompressFormat.JPEG, tj6, true);
                        }
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MassSendMsgUI", e17, "", new java.lang.Object[0]);
                        com.tencent.mars.xlog.Log.e("MicroMsg.MassSendMsgUI", "create thumb error: %s", e17.getMessage());
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.MassSendMsgUI", "do remux, targetPath: %s, outputWidth: %s, outputHeight: %s, retDuration: %s", rj6, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(remuxingVFS));
                z17 = true;
            }
        } else if (shouldRemuxingVFS == 1 || shouldRemuxingVFS == 2 || shouldRemuxingVFS == 3 || shouldRemuxingVFS == 4 || shouldRemuxingVFS == 5) {
            massSendMsgUI.Y6(true, ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(null, bm5.f0.f22571s, str2, false));
            z17 = true;
        }
        if (z17) {
            com.tencent.mm.sdk.platformtools.u3.h(new kf3.r1(this));
        } else {
            com.tencent.mm.sdk.platformtools.u3.h(new kf3.s1(this));
        }
    }
}
