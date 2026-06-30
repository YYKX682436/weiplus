package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class v0 extends com.tencent.mm.sdk.event.n {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f145660d;

    public v0() {
        super(0);
        this.f145660d = new java.util.ArrayList();
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        java.lang.String str;
        com.tencent.mm.autogen.events.C2CNYPredownloadImgEvent c2CNYPredownloadImgEvent = (com.tencent.mm.autogen.events.C2CNYPredownloadImgEvent) iEvent;
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyC2CNYPredownloadImgListener", "ljd:callback() acc not ready!");
        } else if (c2CNYPredownloadImgEvent instanceof com.tencent.mm.autogen.events.C2CNYPredownloadImgEvent) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyC2CNYPredownloadImgListener", "ljd:callback() receive C2CNYPredownloadImgEvent event!");
            gm0.j1.i();
            int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_NEWYEAR_HONGBAO_IMAGE_PRESTRAIN_FLAG_INT_SYNC, 1)).intValue();
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyC2CNYPredownloadImgListener", "prestrainFlag:" + intValue);
            if (intValue == 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyC2CNYPredownloadImgListener", "ljd:prestrainFlag is 0, do nothing!");
            } else {
                am.m1 m1Var = c2CNYPredownloadImgEvent.f54022g;
                java.lang.String str2 = m1Var.f7289a;
                java.lang.String str3 = m1Var.f7290b;
                int i17 = m1Var.f7291c;
                if (android.text.TextUtils.isEmpty(str2) || android.text.TextUtils.isEmpty(str3) || i17 <= 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyC2CNYPredownloadImgListener", "ljd:c2c new year msg image param is invalid!");
                } else if (com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                    java.util.ArrayList arrayList = this.f145660d;
                    if (arrayList.contains(str2)) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyC2CNYPredownloadImgListener", "ljd:imageid is exist!, do nothing!  imageid:" + str2);
                    } else {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        java.util.HashMap hashMap = com.tencent.mm.plugin.luckymoney.model.m5.f145452a;
                        if (com.tencent.mm.sdk.platformtools.t8.K0(str2) || !gm0.j1.a()) {
                            str = "";
                        } else {
                            gm0.j1.i();
                            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(java.lang.String.format("%s/%s/", gm0.j1.u().d(), "LuckyMoney"));
                            if (!r6Var.m() || !r6Var.y()) {
                                r6Var.J();
                            }
                            str = new com.tencent.mm.vfs.r6(r6Var, str2).o();
                        }
                        sb6.append(str);
                        sb6.append(".temp");
                        java.lang.String sb7 = sb6.toString();
                        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(sb7);
                        java.lang.String str4 = a17.f213279f;
                        if (str4 != null) {
                            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str4, false, false);
                            if (!str4.equals(l17)) {
                                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                            }
                        }
                        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
                        if (!m17.a() ? false : m17.f213266a.F(m17.f213267b)) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyC2CNYPredownloadImgListener", "ljd:imagePath file is exist! not download it!");
                        } else {
                            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyC2CNYPredownloadImgListener", "ljd:callback() imagePath:" + sb7 + " is not exist!");
                            arrayList.add(str2);
                            com.tencent.mm.plugin.luckymoney.model.u4 u4Var = new com.tencent.mm.plugin.luckymoney.model.u4();
                            com.tencent.mm.plugin.luckymoney.model.u0 u0Var = new com.tencent.mm.plugin.luckymoney.model.u0(this);
                            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearImageUploader", "ljd: downloadImage. imageId:%s", str2);
                            u4Var.f145658g = false;
                            java.lang.String b17 = com.tencent.mm.modelcdntran.i2.b("NewYearImg", java.lang.System.currentTimeMillis(), c01.z1.g().d1(), "");
                            java.lang.String str5 = b17 != null ? b17 : "";
                            u4Var.f145655d = str5;
                            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearImageUploader", "ljd: downloadImage. client id:%s", str5);
                            u4Var.f145657f = sb7;
                            u4Var.f145656e = u0Var;
                            dn.m mVar = new dn.m();
                            mVar.f241785d = "task_LuckyMoneyNewYearImageUploader_2";
                            mVar.f241786e = false;
                            mVar.f241787f = u4Var;
                            mVar.field_fullpath = sb7;
                            mVar.field_mediaId = u4Var.f145655d;
                            mVar.field_fileId = str2;
                            mVar.field_aesKey = str3;
                            mVar.field_totalLen = i17;
                            mVar.field_fileType = 5;
                            mVar.field_priority = 2;
                            mVar.field_needStorage = false;
                            mVar.field_isStreamMedia = false;
                            mVar.field_appType = 0;
                            mVar.field_bzScene = 0;
                            if (!((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).wi(mVar)) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyNewYearImageUploader", "ljd: cdntra addSendTask failed. imageId:%s", str2);
                            }
                        }
                    }
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyC2CNYPredownloadImgListener", "ljd:is not wifi network, do nothing!");
                }
            }
        }
        return false;
    }
}
