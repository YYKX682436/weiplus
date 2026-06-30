package com.tencent.mm.ui.transmit;

@db5.a(3)
/* loaded from: classes9.dex */
public class SendAppMessageWrapperUI extends com.tencent.mm.ui.MMActivity {
    public static final /* synthetic */ int B = 0;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f211023i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f211024m;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f211028q;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f211018d = null;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.model.app.m f211019e = null;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f211020f = null;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.opensdk.modelmsg.WXMediaMessage f211021g = null;

    /* renamed from: h, reason: collision with root package name */
    public int f211022h = 0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f211025n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f211026o = false;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f211027p = "";

    /* renamed from: r, reason: collision with root package name */
    public boolean f211029r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f211030s = false;

    /* renamed from: t, reason: collision with root package name */
    public int f211031t = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f211032u = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f211033v = 0;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f211034w = "";

    /* renamed from: x, reason: collision with root package name */
    public boolean f211035x = false;

    /* renamed from: y, reason: collision with root package name */
    public boolean f211036y = false;

    /* renamed from: z, reason: collision with root package name */
    public int f211037z = 0;
    public final com.tencent.mm.sdk.platformtools.b4 A = new com.tencent.mm.sdk.platformtools.b4(new dk5.a5(this), true);

    static {
        org.apache.commons.logging.LogFactory.getLog(com.tencent.mm.ui.transmit.SendAppMessageWrapperUI.class);
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x04aa, code lost:
    
        if (r35.j1.l(r26.mController, r7.toString(), r26.f211019e.field_appId.equals("wx4310bbd51be7d979") ? "" : r26.f211018d, true, "", new dk5.t4(r26, r0)) != null) goto L133;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void T6(com.tencent.mm.ui.transmit.SendAppMessageWrapperUI r26) {
        /*
            Method dump skipped, instructions count: 2100
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.transmit.SendAppMessageWrapperUI.T6(com.tencent.mm.ui.transmit.SendAppMessageWrapperUI):void");
    }

    public static void U6(com.tencent.mm.ui.transmit.SendAppMessageWrapperUI sendAppMessageWrapperUI) {
        int i17 = sendAppMessageWrapperUI.f211022h;
        if (i17 == 0 || i17 == 3) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Select_Report_Args", com.tencent.mm.pluginsdk.model.app.m5.a(sendAppMessageWrapperUI.getIntent().getExtras(), -2));
            sendAppMessageWrapperUI.setResult(0, intent);
        } else {
            com.tencent.mm.pluginsdk.model.app.m5.c(sendAppMessageWrapperUI, com.tencent.mm.pluginsdk.model.app.m5.a(sendAppMessageWrapperUI.getIntent().getExtras(), -2), true, false);
        }
        sendAppMessageWrapperUI.finish();
    }

    public static void V6(com.tencent.mm.ui.transmit.SendAppMessageWrapperUI sendAppMessageWrapperUI) {
        sendAppMessageWrapperUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.SendAppMessageWrapperUI", "finishOKWhenCancel");
        sendAppMessageWrapperUI.f211035x = true;
        com.tencent.mm.pluginsdk.model.app.m5.c(sendAppMessageWrapperUI, com.tencent.mm.pluginsdk.model.app.m5.a(sendAppMessageWrapperUI.getIntent().getExtras(), 0), true, true);
        sendAppMessageWrapperUI.finish();
    }

    public final boolean W6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SendAppMessageWrapperUI", "blockInvalidToken block %b", java.lang.Boolean.valueOf(this.f211030s));
        return this.f211030s;
    }

    public final boolean X6(com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage) {
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        com.tencent.mm.opensdk.modelmsg.WXMusicVideoObject wXMusicVideoObject = (com.tencent.mm.opensdk.modelmsg.WXMusicVideoObject) wXMediaMessage.mediaObject;
        java.lang.String str = wXMusicVideoObject.hdAlbumThumbFilePath;
        java.lang.String g76 = g7(wXMediaMessage.thumbData);
        if (!g76.isEmpty()) {
            str = g76;
        }
        e15.b bVar = new e15.b();
        bVar.C(c01.od.c(wXMusicVideoObject.singerName, ""));
        bVar.z(c01.od.c(wXMusicVideoObject.albumName, ""));
        bVar.B(c01.od.c(wXMusicVideoObject.musicGenre, ""));
        bVar.A(c01.od.c(java.lang.Long.valueOf(wXMusicVideoObject.issueDate), ""));
        bVar.y(c01.od.b(java.lang.Integer.valueOf(wXMusicVideoObject.duration), 0));
        v05.b bVar2 = new v05.b();
        java.lang.String c17 = c01.od.c(wXMediaMessage.title, "");
        int i17 = bVar2.f368365d;
        bVar2.set(i17 + 2, c17);
        bVar2.set(i17 + 3, c01.od.c(wXMediaMessage.description, ""));
        bVar2.set(i17 + 9, c01.od.c(wXMusicVideoObject.musicUrl, ""));
        java.lang.String c18 = c01.od.c(wXMusicVideoObject.musicDataUrl, "");
        int i18 = bVar2.f432315e;
        bVar2.set(i18 + 2, c18);
        bVar2.set(i18 + 47, c01.od.c(wXMusicVideoObject.songLyric, ""));
        bVar2.set(i18 + 46, str);
        bVar2.set(i18 + 49, bVar);
        l15.c cVar = new l15.c();
        cVar.q(bVar2);
        oe5.c cVar2 = new oe5.c();
        cVar2.k(str);
        cVar2.l(cVar);
        n13.t tVar = new n13.t();
        tVar.f334133a = new dk5.t4(this, wXMediaMessage);
        tVar.f334136d = new dk5.s4(this, g76);
        n13.a0.td();
        tVar.f334135c = n13.y.f334141a;
        tVar.f334138f.f334139a = 4;
        return ((dk5.y) ((n13.a0) i95.n0.c(n13.a0.class))).wi(this, cVar2, this.f211020f, tVar);
    }

    public final void Y6(com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage, java.lang.String str, int i17) {
        int i18 = this.f211022h;
        if (i18 == 0 || i18 == 3) {
            c01.sc.d().a(38, 1);
            java.util.LinkedList linkedList = new java.util.LinkedList(com.tencent.mm.sdk.platformtools.t8.P1(this.f211020f.split(",")));
            int i19 = this.f211022h == 3 ? 1 : 0;
            dk5.f6 f6Var = new dk5.f6();
            f6Var.f234624a = this.f211036y;
            f6Var.f234625b = this.f211028q;
            f6Var.f234628e = this.f211037z;
            dk5.y6.l(this, getIntent(), this.f211019e, wXMediaMessage, linkedList, i19, this.f211026o, W6(), this.f211027p, this.f211033v, this.f211034w, 1, new dk5.z4(this, wXMediaMessage, str, i17, linkedList), f6Var);
            return;
        }
        if (p94.w0.g() != null) {
            p94.r0 g17 = p94.w0.g();
            com.tencent.mm.pluginsdk.model.app.m mVar = this.f211019e;
            java.lang.String str2 = mVar.field_appId;
            java.lang.String str3 = mVar.field_appName;
            com.tencent.mm.plugin.sns.model.o7 o7Var = (com.tencent.mm.plugin.sns.model.o7) g17;
            o7Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("shareAppMsg", "com.tencent.mm.plugin.sns.model.UploadManager");
            com.tencent.mm.plugin.sns.model.y7 s17 = o7Var.s(wXMediaMessage, str, str2, str3);
            if (s17 == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shareAppMsg", "com.tencent.mm.plugin.sns.model.UploadManager");
            } else {
                s17.R(wXMediaMessage.mediaTagName);
                s17.T(str2, wXMediaMessage.messageExt, wXMediaMessage.messageAction);
                if (i17 > q94.a.f360928a) {
                    s17.u(1, 1);
                }
                s17.i();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shareAppMsg", "com.tencent.mm.plugin.sns.model.UploadManager");
            }
            ((com.tencent.mm.plugin.sns.model.o7) p94.w0.g()).d();
        }
        com.tencent.mm.pluginsdk.model.app.m5.c(this, com.tencent.mm.pluginsdk.model.app.m5.a(getIntent().getExtras(), 0), true, false);
        finish();
    }

    public final void Z6(int i17, java.lang.Object obj, com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage, java.lang.String str, int i18, java.util.LinkedList linkedList) {
        if (i17 == 1) {
            com.tencent.mm.pluginsdk.ui.tools.h7.c(this.f211031t, this.f211019e, wXMediaMessage, linkedList);
        } else if (i17 == 2 || i17 == 3) {
            b7(str, linkedList, i18);
        }
    }

    public final void a7() {
        try {
            com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f211024m;
            if (u3Var == null || !u3Var.isShowing()) {
                return;
            }
            this.f211024m.dismiss();
        } catch (java.lang.Exception unused) {
        }
    }

    public final void b7(java.lang.String str, java.util.LinkedList linkedList, int i17) {
        java.lang.String string;
        boolean z17;
        if (this.f211019e.field_appId.equals("wx4310bbd51be7d979")) {
            string = null;
        } else {
            lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
            com.tencent.mm.pluginsdk.model.app.m mVar = this.f211019e;
            string = getString(com.tencent.mm.R.string.bay, ((kt.c) i0Var).Vi(this, mVar, mVar.field_appName));
        }
        if (!this.f211026o && W6()) {
            string = getString(com.tencent.mm.R.string.bax);
        } else if (string == null) {
            string = getString(com.tencent.mm.R.string.bax);
        }
        java.lang.String str2 = string;
        java.lang.String string2 = getString(com.tencent.mm.R.string.f490943bb5);
        dk5.b5 b5Var = new dk5.b5(this);
        dk5.c5 c5Var = new dk5.c5(this);
        ik5.a aVar = ik5.b.f291972a;
        if (ik5.b.f291972a == ik5.a.f291969e) {
            java.util.concurrent.atomic.AtomicInteger atomicInteger = ik5.b.f291974c;
            atomicInteger.incrementAndGet();
            z17 = atomicInteger.get() == ik5.b.f291973b;
            if (z17) {
                ik5.b.f291972a = ik5.a.f291970f;
                atomicInteger.set(0);
            }
        } else {
            z17 = true;
        }
        if (z17) {
            if (this.f211029r) {
                c5Var.a(true, str, i17);
            } else {
                fq1.h.a(this.mController, getString(com.tencent.mm.R.string.f490940bb2), str2, string2, c5Var, b5Var);
            }
        }
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SendAppMessageWrapperUI", "summerbig dealSucc, text is empty");
            return;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            f7((java.lang.String) it.next(), str);
        }
    }

    public final void c7(com.tencent.mm.opensdk.modelmsg.WXStateSceneDataObject wXStateSceneDataObject, java.lang.String str, java.lang.String str2, boolean z17, java.lang.String str3) {
        int i17;
        int i18;
        java.lang.String str4;
        int i19;
        int i27;
        com.tencent.mars.xlog.Log.i("MicroMsg.SendAppMessageWrapperUI", "handleSendStatus mediaPath: %s, filterJumpInfo: %s", str, java.lang.Boolean.valueOf(z17));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String str5 = wXStateSceneDataObject.stateTitle;
        java.lang.String str6 = this.f211023i;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str6 == null) {
            str6 = "";
        }
        java.lang.String concat = str6.concat("@opensdk");
        com.tencent.mars.xlog.Log.i("MicroMsg.SendAppMessageWrapperUI", "handleSendStatus() called with: sceneDataObject = [" + wXStateSceneDataObject + "], mediaPath = [" + str + "], jumpInfoThumb = [" + str2 + "], filterJumpInfo = [" + z17 + "], displayName = [" + str3 + "]");
        java.lang.String Zi = ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Zi(this, this.f211023i);
        if (Zi == null) {
            Zi = "";
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            Zi = str3;
        }
        java.lang.String str7 = this.f211019e.field_appIconUrl;
        if (str7 == null) {
            str7 = "";
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            str7 = str2;
        }
        if (this.f211021g.getType() == 1 || this.f211021g.getType() == 2 || this.f211021g.getType() == 38) {
            pj4.j0 j0Var = new pj4.j0();
            com.tencent.mm.opensdk.modelmsg.WXStateSceneDataObject.IWXStateJumpInfo iWXStateJumpInfo = wXStateSceneDataObject.stateJumpInfo;
            if (iWXStateJumpInfo instanceof com.tencent.mm.opensdk.modelmsg.WXStateJumpUrlInfo) {
                com.tencent.mm.opensdk.modelmsg.WXStateJumpUrlInfo wXStateJumpUrlInfo = (com.tencent.mm.opensdk.modelmsg.WXStateJumpUrlInfo) iWXStateJumpInfo;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(wXStateJumpUrlInfo.jumpUrl)) {
                    j0Var.f355139d = "3";
                    j0Var.f355141f = wXStateJumpUrlInfo.jumpUrl;
                    arrayList.add(j0Var);
                }
                i17 = 0;
            } else {
                if (z17 || !(iWXStateJumpInfo instanceof com.tencent.mm.opensdk.modelmsg.WXStateJumpMiniProgramInfo)) {
                    if (!z17 && (iWXStateJumpInfo instanceof com.tencent.mm.opensdk.modelmsg.WXStateJumpChannelProfileInfo)) {
                        com.tencent.mm.opensdk.modelmsg.WXStateJumpChannelProfileInfo wXStateJumpChannelProfileInfo = (com.tencent.mm.opensdk.modelmsg.WXStateJumpChannelProfileInfo) iWXStateJumpInfo;
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(wXStateJumpChannelProfileInfo.username)) {
                            try {
                                j0Var.f355139d = "8";
                                pj4.t1 t1Var = new pj4.t1();
                                t1Var.f355298d = wXStateJumpChannelProfileInfo.username;
                                t1Var.f355299e = str2;
                                j0Var.f355142g = android.util.Base64.encodeToString(t1Var.toByteArray(), 0);
                                arrayList.add(j0Var);
                                i17 = 0;
                                i18 = 1;
                            } catch (java.lang.Exception e17) {
                                i17 = 0;
                                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SendAppMessageWrapperUI", e17, "handleSendStatus set finder profile jump info exception", new java.lang.Object[0]);
                            }
                        }
                    }
                    i17 = 0;
                    i18 = i17;
                } else {
                    com.tencent.mm.opensdk.modelmsg.WXStateJumpMiniProgramInfo wXStateJumpMiniProgramInfo = (com.tencent.mm.opensdk.modelmsg.WXStateJumpMiniProgramInfo) iWXStateJumpInfo;
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(wXStateJumpMiniProgramInfo.username)) {
                        try {
                            j0Var.f355139d = "7";
                            org.json.JSONObject jSONObject = new org.json.JSONObject();
                            jSONObject.put(dm.i4.COL_USERNAME, wXStateJumpMiniProgramInfo.username + "@app");
                            jSONObject.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, wXStateJumpMiniProgramInfo.path);
                            jSONObject.put("versionType", wXStateJumpMiniProgramInfo.miniProgramType);
                            jSONObject.put("headImageURL", str2);
                            j0Var.f355141f = jSONObject.toString();
                            arrayList.add(j0Var);
                            i18 = 1;
                        } catch (java.lang.Exception e18) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SendAppMessageWrapperUI", e18, "handleSendStatus set miniProgram jump info exception", new java.lang.Object[0]);
                        }
                        i17 = 0;
                    }
                    i18 = 0;
                    i17 = 0;
                }
                if (i18 != 0) {
                    pj4.j0 j0Var2 = new pj4.j0();
                    j0Var2.f355139d = "3";
                    j0Var2.f355141f = "https://support.weixin.qq.com/security/readtemplate?t=w_security_center_website/upgrade&scene=1#wechat_redirect";
                    arrayList.add(j0Var2);
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SendAppMessageWrapperUI", "handleSendStatus jumpInfoList size: %s", java.lang.Integer.valueOf(arrayList.size()));
            if (this.f211021g.getType() != 1) {
                if (this.f211021g.getType() == 2) {
                    str4 = com.tencent.mm.sdk.platformtools.t8.K0(str) ? ((com.tencent.mm.opensdk.modelmsg.WXImageObject) this.f211021g.mediaObject).imagePath : str;
                    i19 = 1;
                } else if (this.f211021g.getType() == 38) {
                    str4 = ((com.tencent.mm.opensdk.modelmsg.WXVideoFileObject) this.f211021g.mediaObject).filePath;
                    i19 = 2;
                }
                i27 = i19;
            } else if (com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
                com.tencent.mm.opensdk.modelmsg.WXTextObject wXTextObject = (com.tencent.mm.opensdk.modelmsg.WXTextObject) this.f211021g.mediaObject;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(wXTextObject.text)) {
                    str5 = wXTextObject.text;
                }
            }
            str4 = str;
            i19 = i17;
            i27 = i19;
        } else {
            if (this.f211021g.getType() != 76) {
                return;
            }
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage = this.f211021g;
            com.tencent.mm.opensdk.modelmsg.WXMusicVideoObject wXMusicVideoObject = (com.tencent.mm.opensdk.modelmsg.WXMusicVideoObject) wXMediaMessage.mediaObject;
            str5 = wXStateSceneDataObject.stateTitle;
            Zi = wXMediaMessage.title;
            pj4.j0 j0Var3 = new pj4.j0();
            j0Var3.f355139d = "1";
            r45.hf2 hf2Var = new r45.hf2();
            hf2Var.set(0, this.f211021g.title);
            hf2Var.set(2, wXMusicVideoObject.musicDataUrl);
            hf2Var.set(4, wXMusicVideoObject.musicUrl);
            hf2Var.set(9, wXMusicVideoObject.musicGenre);
            hf2Var.set(3, this.f211023i);
            hf2Var.set(6, wXMusicVideoObject.songLyric);
            com.tencent.mm.opensdk.modelmsg.WXMusicVipInfo wXMusicVipInfo = wXMusicVideoObject.musicVipInfo;
            hf2Var.set(18, wXMusicVipInfo != null ? b21.m.e(wXMusicVipInfo.musicId) : "");
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = wXMusicVideoObject.singerName;
            objArr[1] = java.lang.Boolean.valueOf(wXMusicVideoObject.musicVipInfo != null);
            com.tencent.mars.xlog.Log.i("MicroMsg.SendAppMessageWrapperUI", "share music mv to status, singerName:%s, musicVipInfo is valid:%b", objArr);
            hf2Var.set(1, wXMusicVideoObject.singerName);
            hf2Var.set(7, wXMusicVideoObject.albumName);
            hf2Var.set(8, str);
            hf2Var.set(11, java.lang.Long.valueOf(wXMusicVideoObject.issueDate));
            hf2Var.set(13, wXMusicVideoObject.identification);
            hf2Var.set(12, this.f211021g.messageExt);
            hf2Var.set(14, java.lang.Integer.valueOf(wXMusicVideoObject.duration));
            hf2Var.set(17, new r45.if2());
            ((r45.if2) hf2Var.getCustom(17)).set(0, wXMusicVideoObject.musicOperationUrl);
            r45.xs4 xs4Var = new r45.xs4();
            xs4Var.set(14, this.f211021g.title);
            xs4Var.set(15, wXMusicVideoObject.songLyric);
            xs4Var.set(4, wXMusicVideoObject.singerName);
            xs4Var.set(5, wXMusicVideoObject.albumName);
            xs4Var.set(16, str);
            xs4Var.set(7, wXMusicVideoObject.musicGenre);
            xs4Var.set(8, java.lang.Long.valueOf(wXMusicVideoObject.issueDate));
            xs4Var.set(9, wXMusicVideoObject.identification);
            xs4Var.set(10, java.lang.Integer.valueOf(wXMusicVideoObject.duration));
            xs4Var.set(12, wXMusicVideoObject.musicOperationUrl);
            xs4Var.set(11, hf2Var.getString(18));
            xs4Var.set(6, this.f211021g.messageExt);
            ((na0.k) ((oa0.j) i95.n0.c(oa0.j.class))).getClass();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("\n<MusicVideoStatusOpenParams>\n");
            sb6.append(lm3.c0.c(hf2Var));
            sb6.append('\n');
            java.lang.String a17 = zy2.pc.a(xs4Var);
            kotlin.jvm.internal.o.f(a17, "makeContent(...)");
            sb6.append(a17);
            sb6.append("\n</MusicVideoStatusOpenParams>");
            j0Var3.f355141f = r26.b0.b(sb6.toString());
            arrayList.add(j0Var3);
            str7 = "http://wxapp.tc.qq.com/258/20304/stodownload?m=2009416463c227ad5a09b4fcf23bf985&filekey=30340201010420301e020201020402534804102009416463c227ad5a09b4fcf23bf9850202042e040d00000004627466730000000131&hy=SH&storeid=32303231303331383139353931363030306366646534303030303030303037636638353130393030303030313032&bizid=1023";
            str4 = str;
            i27 = 0;
        }
        bi4.c1 c1Var = new bi4.c1();
        c1Var.b(wXStateSceneDataObject.stateId);
        c1Var.a(str5);
        bi4.d1 d1Var = c1Var.f21034a;
        d1Var.f354938e = str4;
        d1Var.f354937d.f354974f = i27;
        c1Var.f(concat);
        c1Var.g(Zi);
        c1Var.e(str7);
        c1Var.h(wXStateSceneDataObject.token);
        c1Var.c(arrayList);
        arrayList.size();
        ((com.tencent.mm.feature.textstatus.StatusThirdShareFeatureService) ((xe0.g0) i95.n0.c(xe0.g0.class))).Ni(this, 3, d1Var);
    }

    public final void d7(boolean z17, boolean z18, android.os.Bundle bundle) {
        android.content.Intent b17;
        java.lang.String a17;
        if (this.f211026o || !W6()) {
            int i17 = this.f211031t;
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage = this.f211021g;
            com.tencent.mm.pluginsdk.model.app.m mVar = this.f211019e;
            b17 = m21.b.b(i17, wXMediaMessage, "", mVar.field_appId, mVar.field_appName, mVar.k(), bundle);
        } else {
            b17 = m21.b.b(this.f211031t, this.f211021g, "", "", "", this.f211019e.k(), bundle);
        }
        if (b17 == null) {
            finish();
            return;
        }
        if (this.f211021g.getType() == 5 || this.f211021g.getType() == 2 || this.f211021g.getType() == 38) {
            java.lang.String str = this.f211019e.field_appId;
            a17 = c01.n2.a("app_" + this.f211019e.field_appId);
            c01.l2 c17 = c01.n2.d().c(a17, true);
            c17.i("prePublishId", "app_" + this.f211019e.field_appId);
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject iMediaObject = this.f211021g.mediaObject;
            if (iMediaObject instanceof com.tencent.mm.opensdk.modelmsg.WXWebpageObject) {
                c17.i("url", ((com.tencent.mm.opensdk.modelmsg.WXWebpageObject) iMediaObject).webpageUrl);
            }
        } else {
            a17 = null;
        }
        if ("wx5dfbe0a95623607b".equals(this.f211019e.field_appId)) {
            if (this.f211021g.getType() == 5) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SendAppMessageWrapperUI", "report(17256) url, to timeline, appId : %s", this.f211019e.field_appId);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(17256, a17, 2);
            } else if (this.f211021g.getType() == 38) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SendAppMessageWrapperUI", "report(17256) video file, to timeline, appId : %s", this.f211019e.field_appId);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(17256, a17, 1);
            }
        }
        b17.putExtra("reportSessionId", a17);
        b17.putExtra("KSnsUploadFromSkipCompress", z18);
        b17.putExtra("SendAppMessageWrapper_TokenValid", this.f211026o);
        b17.putExtra("SendAppMessageWrapper_PkgName", this.f211027p);
        if (z17) {
            j45.l.n(this, "sns", ".ui.SnsUploadUI", b17, 1);
        } else {
            j45.l.j(this, "sns", ".ui.SnsUploadUI", b17, null);
        }
    }

    public final void e7(java.util.List list, java.lang.String str) {
        for (int i17 = 0; i17 < list.size(); i17++) {
            f7((java.lang.String) list.get(i17), str);
        }
    }

    public final boolean f7(java.lang.String str, java.lang.String str2) {
        java.util.HashMap hashMap;
        int i17 = 0;
        int i18 = 4;
        if (com.tencent.mm.storage.z3.R4(str)) {
            hashMap = com.tencent.mm.ui.i1.a(str2);
            if (hashMap != null) {
                i18 = 5;
                i17 = 1;
            }
        } else {
            hashMap = null;
        }
        if (w11.t1.a(str)) {
            w11.r1 a17 = w11.s1.a(str);
            a17.g(str);
            a17.e(str2);
            a17.h(c01.e2.C(str));
            a17.f442131f = i17;
            a17.f442133h = hashMap;
            a17.b();
        } else {
            w11.r1 a18 = w11.s1.a(str);
            a18.g(str);
            a18.e(str2);
            a18.h(c01.e2.C(str));
            a18.f442131f = i17;
            a18.f442133h = hashMap;
            a18.f442134i = i18;
            a18.a().a();
        }
        return true;
    }

    public final java.lang.String g7(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        com.tencent.mm.vfs.r7 r7Var = com.tencent.mm.vfs.q7.f213141a;
        com.tencent.mm.vfs.r6 h07 = lp0.b.h0("OpenSdk");
        if (!h07.m()) {
            h07.J();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(h07.n());
        sb6.append("/");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(java.lang.System.currentTimeMillis());
        java.lang.String sb7 = sb6.toString();
        int S = com.tencent.mm.vfs.w6.S(sb7, bArr, 0, bArr.length);
        if (S == 0) {
            return sb7;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.SendAppMessageWrapperUI", "saveBytesToTemp, failed to write temp file, ret = " + S);
        return "";
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    public final void h7(java.util.List list, com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage, com.tencent.mm.pluginsdk.model.app.a aVar) {
        if (com.tencent.mm.sdk.platformtools.t8.L0(list) || wXMediaMessage == null || wXMediaMessage.mediaObject == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SendAppMessageWrapperUI", "sendAppMsg: error toUserList:%s wxMediaMessage:%s", list, wXMediaMessage);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SendAppMessageWrapperUI", "sendWxMediaMessage() called with: toUserList = [" + list + "], wxMediaMessage = [" + wXMediaMessage + "]");
        for (int i17 = 0; i17 < list.size(); i17++) {
            java.lang.String str = (java.lang.String) list.get(i17);
            if (com.tencent.mm.sdk.platformtools.t8.K0(str) || wXMediaMessage.mediaObject == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.SendAppMessageWrapperUI", "sendAppMsg: error userName:%s wxMediaMessage:%s", str, wXMediaMessage);
            } else {
                com.tencent.mm.pluginsdk.model.app.m mVar = this.f211019e;
                com.tencent.mm.pluginsdk.model.app.k0.E(wXMediaMessage, mVar.field_appId, mVar.field_appName, str, 2, null, null, 0, aVar);
            }
        }
    }

    public final void i7(android.content.DialogInterface.OnCancelListener onCancelListener) {
        a7();
        this.f211024m = com.tencent.mm.ui.widget.dialog.u3.f(this, getString(com.tencent.mm.R.string.ggc), true, 0, onCancelListener);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
    }

    public final void j7(java.lang.String str, byte[] bArr, dk5.h2 h2Var) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) && bArr != null && bArr.length > 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SendAppMessageWrapperUI", "uploadMusicVideoImage upload thumbData: %s", java.lang.Integer.valueOf(bArr.length));
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            str = m11.b1.Di().L0(null, bm5.f0.f22564i, bArr, null);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            h2Var.a(null, true);
            return;
        }
        i7(null);
        ((ku5.t0) ku5.t0.f312615d).h(new dk5.f2(str, h2Var), "MusicVideoShareUploadImage");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.tencent.mars.xlog.Log.i("MicroMsg.SendAppMessageWrapperUI", "onActivityResult requestCode " + i17 + " resultCode " + i18);
        if (i17 == 1) {
            if (i18 == -1) {
                com.tencent.mm.pluginsdk.model.app.m5.c(this, com.tencent.mm.pluginsdk.model.app.m5.a(getIntent().getExtras(), 0), true, false);
            } else {
                com.tencent.mm.pluginsdk.model.app.m5.c(this, com.tencent.mm.pluginsdk.model.app.m5.a(getIntent().getExtras(), 0), true, true);
            }
            finish();
            return;
        }
        if (i17 != 2 || i18 != -1) {
            if (i17 == 3) {
                if (i18 == -1) {
                    com.tencent.mm.pluginsdk.model.app.m5.c(this, com.tencent.mm.pluginsdk.model.app.m5.a(getIntent().getExtras(), 0), true, false);
                } else {
                    com.tencent.mm.pluginsdk.model.app.m5.c(this, com.tencent.mm.pluginsdk.model.app.m5.a(getIntent().getExtras(), 0), true, true);
                }
                finish();
                return;
            }
            return;
        }
        com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject iMediaObject = this.f211021g.mediaObject;
        if (!(iMediaObject instanceof com.tencent.mm.opensdk.modelmsg.WXVideoFileObject)) {
            if (iMediaObject instanceof com.tencent.mm.opensdk.modelmsg.WXGameVideoFileObject) {
                com.tencent.mm.opensdk.modelmsg.WXGameVideoFileObject wXGameVideoFileObject = (com.tencent.mm.opensdk.modelmsg.WXGameVideoFileObject) iMediaObject;
                java.lang.String stringExtra = intent.getStringExtra("K_SEGMENTVIDEOPATH");
                wXGameVideoFileObject.filePath = stringExtra;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra) && com.tencent.mm.vfs.w6.j(wXGameVideoFileObject.filePath)) {
                    d7(true, false, null);
                    return;
                } else {
                    setResult(-5);
                    finish();
                    return;
                }
            }
            return;
        }
        com.tencent.mm.opensdk.modelmsg.WXVideoFileObject wXVideoFileObject = (com.tencent.mm.opensdk.modelmsg.WXVideoFileObject) iMediaObject;
        java.lang.String stringExtra2 = intent.getStringExtra("K_SEGMENTVIDEOPATH");
        wXVideoFileObject.filePath = stringExtra2;
        com.tencent.mars.xlog.Log.i("MicroMsg.SendAppMessageWrapperUI", "handleVideoFileMsgCompressResult videoPath: %s", stringExtra2);
        if (com.tencent.mm.sdk.platformtools.t8.K0(wXVideoFileObject.filePath) || !com.tencent.mm.vfs.w6.j(wXVideoFileObject.filePath)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SendAppMessageWrapperUI", "handleVideoFileMsgCompressResult videoFile invalid");
            setResult(-5);
            finish();
        } else {
            int i19 = this.f211022h;
            if (i19 == 1) {
                d7(true, false, null);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.SendAppMessageWrapperUI", "handleVideoFileMsgCompressResult unexpected scene: %s", java.lang.Integer.valueOf(i19));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0303 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0417  */
    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r22) {
        /*
            Method dump skipped, instructions count: 1431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.transmit.SendAppMessageWrapperUI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f211025n) {
            android.content.SharedPreferences sharedPreferences = getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0);
            setRequestedOrientation(1);
            sharedPreferences.edit().putBoolean("settings_landscape_mode", false).commit();
        }
    }

    @Override // android.app.Activity
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        hideVKB();
        return super.onTouchEvent(motionEvent);
    }
}
