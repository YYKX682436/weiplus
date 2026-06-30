package vm1;

/* loaded from: classes11.dex */
public final class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f438033d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vm1.x0 f438034e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f438035f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bw5.lp0 f438036g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ byte[] f438037h;

    public n0(long j17, vm1.x0 x0Var, android.app.Activity activity, bw5.lp0 lp0Var, byte[] bArr) {
        this.f438033d = j17;
        this.f438034e = x0Var;
        this.f438035f = activity;
        this.f438036g = lp0Var;
        this.f438037h = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        bw5.d60 d60Var;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        bw5.z90 j17;
        java.lang.String d17;
        bw5.z90 j18;
        bw5.z90 j19;
        bw5.z90 j27;
        bw5.z90 j28;
        bw5.z90 j29;
        bw5.z90 j37;
        bw5.z90 j38;
        long j39 = this.f438033d;
        str = "";
        bw5.lp0 tingItem = this.f438036g;
        android.app.Activity activity = this.f438035f;
        vm1.x0 x0Var = this.f438034e;
        if (j39 == 1) {
            wm1.h b17 = x0Var.b();
            kotlin.jvm.internal.o.f(tingItem, "$tingItem");
            b17.getClass();
            kotlin.jvm.internal.o.g(activity, "context");
            java.lang.Object[] objArr = new java.lang.Object[2];
            bw5.v70 d18 = tingItem.d();
            objArr[0] = d18 != null ? d18.getListenId() : null;
            bw5.v70 d19 = tingItem.d();
            objArr[1] = (d19 == null || (j38 = d19.j()) == null) ? null : j38.o();
            com.tencent.mars.xlog.Log.i("MicroMsg.BizAudioShareHelper", "shareMusicToChat listenId: %s, songName: %s", objArr);
            bw5.v70 d27 = tingItem.d();
            if (!il4.l.i(d27 != null ? d27.f34189e : 0)) {
                java.lang.String d28 = b17.d(tingItem);
                if (d28 == null) {
                    return;
                }
                java.lang.String Ri = ((dl4.m0) ((ff0.t) i95.n0.c(ff0.t.class))).Ri(rk4.j5.d(tingItem));
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Retr_Msg_Type", 2);
                intent.putExtra("Retr_Msg_content", d28);
                intent.putExtra("Multi_Retr", true);
                intent.putExtra("Retr_go_to_chattingUI", false);
                intent.putExtra("Retr_show_success_tips", true);
                intent.putExtra("Retr_Msg_thumb_path", Ri);
                intent.putExtra("Retr_Msg_thumb_url", rk4.j5.d(tingItem));
                j45.l.v(activity, ".ui.transmit.MsgRetransmitUI", intent, 1001);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.BizAudioShareHelper", "shareLocalFileToChat fileName: " + tingItem.d().i().b() + ", filePath: " + tingItem.d().i().getFilePath());
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage(new com.tencent.mm.opensdk.modelmsg.WXFileObject(tingItem.d().i().getFilePath()));
            wXMediaMessage.title = tingItem.d().i().b();
            com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req req = new com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req();
            req.scene = 0;
            req.transaction = null;
            req.message = wXMediaMessage;
            android.os.Bundle bundle = new android.os.Bundle();
            req.toBundle(bundle);
            bundle.putInt(com.tencent.mm.opensdk.constants.ConstantsAPI.SDK_VERSION, com.tencent.mm.opensdk.constants.Build.SDK_INT);
            bundle.putString(com.tencent.mm.opensdk.constants.ConstantsAPI.APP_PACKAGE, "com.tencent.mm.openapi");
            bundle.putString("SendAppMessageWrapper_AppId", "");
            bundle.putBoolean("SendAppMessageWrapper_NoNeedStayInWeixin", true);
            android.content.Intent intent2 = new android.content.Intent();
            intent2.setClassName(activity, "com.tencent.mm.ui.transmit.SendAppMessageWrapperUI");
            intent2.putExtras(bundle);
            android.content.Intent intent3 = new android.content.Intent();
            intent3.setClassName(activity, "com.tencent.mm.ui.transmit.SelectConversationUI");
            intent3.putExtra("Select_Conv_NextStep", intent2);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent3);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/audio/helper/BizAudioShareHelper", "shareLocalFileToChat", "(Landroid/content/Context;Lcom/tencent/wechat/aff/proto/TingItem;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activity, "com/tencent/mm/plugin/audio/helper/BizAudioShareHelper", "shareLocalFileToChat", "(Landroid/content/Context;Lcom/tencent/wechat/aff/proto/TingItem;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        if (j39 == 2) {
            wm1.h b18 = x0Var.b();
            kotlin.jvm.internal.o.f(tingItem, "$tingItem");
            b18.getClass();
            kotlin.jvm.internal.o.g(activity, "context");
            bw5.v70 d29 = tingItem.d();
            int i17 = d29 != null ? d29.f34189e : 0;
            com.tencent.mm.opensdk.modelmsg.WXMusicVideoObject wXMusicVideoObject = new com.tencent.mm.opensdk.modelmsg.WXMusicVideoObject();
            wXMusicVideoObject.musicUrl = rk4.j5.l(tingItem);
            wXMusicVideoObject.musicDataUrl = rk4.j5.k(tingItem);
            wXMusicVideoObject.singerName = rk4.j5.c(tingItem);
            bw5.v70 d37 = tingItem.d();
            wXMusicVideoObject.songLyric = (d37 == null || (j37 = d37.j()) == null) ? null : j37.g();
            bw5.v70 d38 = tingItem.d();
            if (d38 == null || (j29 = d38.j()) == null || (str3 = j29.b()) == null) {
                str3 = "";
            }
            wXMusicVideoObject.albumName = str3;
            bw5.v70 d39 = tingItem.d();
            if (d39 == null || (j28 = d39.j()) == null || (str4 = j28.e()) == null) {
                str4 = "";
            }
            wXMusicVideoObject.musicGenre = str4;
            bw5.v70 d47 = tingItem.d();
            wXMusicVideoObject.issueDate = (d47 == null || (j27 = d47.j()) == null) ? 0L : j27.f35895r;
            bw5.v70 d48 = tingItem.d();
            if (d48 == null || (j19 = d48.j()) == null || (str5 = j19.f()) == null) {
                str5 = "";
            }
            wXMusicVideoObject.identification = str5;
            wXMusicVideoObject.duration = rk4.j5.e(tingItem);
            com.tencent.mm.opensdk.modelmsg.WXMusicVipInfo wXMusicVipInfo = new com.tencent.mm.opensdk.modelmsg.WXMusicVipInfo();
            bw5.v70 d49 = tingItem.d();
            if (d49 == null || (j18 = d49.j()) == null || (str6 = j18.j()) == null) {
                str6 = "";
            }
            wXMusicVipInfo.musicId = str6;
            wXMusicVideoObject.musicVipInfo = wXMusicVipInfo;
            java.lang.String str7 = wXMusicVideoObject.musicUrl;
            if (((str7 == null || str7.length() == 0) ? 1 : 0) != 0) {
                wXMusicVideoObject.musicUrl = rk4.m.f396835b;
            }
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage2 = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage();
            wXMediaMessage2.mediaObject = wXMusicVideoObject;
            wXMediaMessage2.title = rk4.j5.j(tingItem);
            wXMediaMessage2.description = wXMusicVideoObject.singerName;
            wXMediaMessage2.thumbData = null;
            bw5.v70 d57 = tingItem.d();
            if (d57 != null && (j17 = d57.j()) != null && (d17 = j17.d()) != null) {
                str = d17;
            }
            wXMediaMessage2.messageExt = str;
            android.content.Intent intent4 = new android.content.Intent();
            android.os.Bundle bundle2 = new android.os.Bundle();
            rk4.j5.d(tingItem);
            java.lang.String str8 = wXMusicVideoObject.musicVipInfo.musicId;
            com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req req2 = new com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req();
            req2.message = wXMediaMessage2;
            req2.toBundle(bundle2);
            intent4.putExtra("Ksnsupload_timeline", bundle2);
            if (il4.l.k(i17)) {
                intent4.putExtra("Ksnsupload_appid", rk4.j5.a(tingItem));
            }
            intent4.putExtra("music_mv_cover_url", rk4.j5.d(tingItem));
            intent4.putExtra("Ksnsupload_musicid", tingItem.d().getListenId());
            intent4.putExtra("Ksnsupload_appname", com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.n4u));
            java.lang.String a17 = c01.n2.a("music_player");
            c01.n2.d().c(a17, true).i("prePublishId", "music_player");
            intent4.putExtra("reportSessionId", a17);
            intent4.putExtra("Ksnsupload_music_share_object_xml", ((m21.r) ((ee0.t4) ((fe0.n4) i95.n0.c(fe0.n4.class))).wi(b18.c(tingItem))).a());
            intent4.putExtra("Ksnsupload_type", 37);
            intent4.putExtra("need_result", true);
            intent4.putExtra("Ksnsupload_source", 1);
            j45.l.v(activity, ".plugin.sns.ui.SnsUploadUI", intent4, 1002);
            return;
        }
        if (j39 == 3) {
            wm1.h b19 = x0Var.b();
            kotlin.jvm.internal.o.f(tingItem, "$tingItem");
            b19.getClass();
            kotlin.jvm.internal.o.g(activity, "context");
            bw5.v70 d58 = tingItem.d();
            if (!il4.l.i(d58 != null ? d58.f34189e : 0)) {
                ((dl4.m0) ((ff0.t) i95.n0.c(ff0.t.class))).Bi(rk4.j5.d(tingItem), new wm1.e(tingItem, activity, b19));
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.BizAudioShareHelper", "favLocalFile fileName: " + tingItem.d().i().b() + ", filePath: " + tingItem.d().i().getFilePath());
            com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
            doFavoriteEvent.f54090g.f6323i = activity;
            o72.c5 c5Var = (o72.c5) i95.n0.c(o72.c5.class);
            java.lang.String filePath = tingItem.d().i().getFilePath();
            java.lang.String b27 = tingItem.d().i().b();
            ((com.tencent.mm.pluginsdk.model.b2) c5Var).getClass();
            com.tencent.mm.pluginsdk.model.a2.k(doFavoriteEvent, 36, filePath, b27, "", "");
            pm0.v.X(new wm1.d(doFavoriteEvent));
            return;
        }
        if (j39 == 4) {
            try {
                d60Var = new bw5.d60().parseFrom(this.f438037h);
            } catch (java.lang.Exception unused) {
                d60Var = null;
            }
            wm1.h b28 = x0Var.b();
            kotlin.jvm.internal.o.f(tingItem, "$tingItem");
            b28.getClass();
            kotlin.jvm.internal.o.g(activity, "activity");
            if (d60Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BizAudioShareHelper", "setMusicToStatus commentInfo is null");
                return;
            }
            try {
                r45.wd6 wd6Var = new r45.wd6();
                bw5.v70 d59 = tingItem.d();
                wd6Var.f389078d = d59 != null ? d59.getListenId() : null;
                wd6Var.f389079e = d60Var.hasFieldNumber(206) ? d60Var.W : "";
                str2 = android.util.Base64.encodeToString(wd6Var.toByteArray(), 2);
                kotlin.jvm.internal.o.d(str2);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BizAudioShareHelper", "getStatusFooterJumpListen exp: " + e17.getMessage());
                str2 = "";
            }
            if (r26.n0.N(str2)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BizAudioShareHelper", "statusFooterJumpListen is null");
                return;
            }
            pj4.j0 j0Var = new pj4.j0();
            j0Var.f355139d = "15";
            j0Var.f355142g = str2;
            java.util.List k17 = kz5.c0.k(j0Var);
            if (tingItem.d().f34189e == 1) {
                bw5.v70 d66 = tingItem.d();
                if (d66 != null && d66.hasFieldNumber(106)) {
                    bw5.v70 d67 = tingItem.d();
                    if ((d67 != null ? d67.j() : null) != null) {
                        pj4.j0 j0Var2 = new pj4.j0();
                        j0Var2.f355139d = "1";
                        j0Var2.f355141f = ((nm3.e) ((qk.z8) i95.n0.c(qk.z8.class))).wi(tingItem);
                        k17.add(j0Var2);
                    }
                }
            }
            pj4.j0 j0Var3 = new pj4.j0();
            j0Var3.f355139d = "3";
            j0Var3.f355141f = "https://support.weixin.qq.com/security/readtemplate?t=w_security_center_website/upgrade&scene=1#wechat_redirect";
            k17.add(j0Var3);
            xe0.g0 g0Var = (xe0.g0) i95.n0.c(xe0.g0.class);
            bi4.c1 c1Var = new bi4.c1();
            c1Var.b(d60Var.hasFieldNumber(205) ? d60Var.V : "");
            java.lang.String Ni = ((dl4.m0) ((ff0.t) i95.n0.c(ff0.t.class))).Ni(rk4.j5.d(tingItem));
            bi4.d1 d1Var = c1Var.f21034a;
            d1Var.f354938e = Ni;
            c1Var.f("listen@inner");
            c1Var.g(d60Var.hasFieldNumber(204) ? d60Var.U : "");
            c1Var.e(d60Var.hasFieldNumber(203) ? d60Var.T : "");
            c1Var.h(d60Var.hasFieldNumber(201) ? d60Var.S : "");
            c1Var.c(k17);
            d1Var.f354940g = false;
            ((com.tencent.mm.feature.textstatus.StatusThirdShareFeatureService) g0Var).Ni(activity, 1003, d1Var);
        }
    }
}
