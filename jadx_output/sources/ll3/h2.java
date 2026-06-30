package ll3;

/* loaded from: classes10.dex */
public final class h2 {

    /* renamed from: a, reason: collision with root package name */
    public static final ll3.h2 f319180a = new ll3.h2();

    public final void a(android.content.Context context, b21.r wrapper, r45.hf2 hf2Var, com.tencent.mm.pluginsdk.model.app.a5 a5Var) {
        java.lang.String str;
        android.os.Bundle bundle;
        java.lang.String string;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(wrapper, "wrapper");
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String str2 = wrapper.f17358t;
        ((kt.c) i0Var).getClass();
        com.tencent.mm.pluginsdk.model.app.m h17 = com.tencent.mm.pluginsdk.model.app.w.h(str2);
        if (android.text.TextUtils.isEmpty(wrapper.f17358t) || h17 == null || android.text.TextUtils.isEmpty(h17.field_packageName)) {
            com.tencent.mars.xlog.Log.e("MusicUIUtil", "doJumpToAppSongPage do nothing");
            return;
        }
        com.tencent.mars.xlog.Log.i("MusicUIUtil", "doJumpToAppSongPage launch third party app, package name:%s", h17.field_packageName);
        com.tencent.mm.opensdk.modelmsg.WXMusicVideoObject wXMusicVideoObject = new com.tencent.mm.opensdk.modelmsg.WXMusicVideoObject();
        wXMusicVideoObject.musicUrl = wrapper.f17354p;
        wXMusicVideoObject.musicDataUrl = wrapper.f17352n;
        java.lang.String str3 = "";
        if (hf2Var == null || (str = hf2Var.getString(13)) == null) {
            str = "";
        }
        wXMusicVideoObject.identification = java.net.URLDecoder.decode(str);
        com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage(wXMusicVideoObject);
        wXMediaMessage.sdkVer = com.tencent.mm.opensdk.constants.Build.SDK_INT;
        if (hf2Var != null && (string = hf2Var.getString(12)) != null) {
            str3 = string;
        }
        wXMediaMessage.messageExt = java.net.URLDecoder.decode(str3);
        r45.bt4 bt4Var = (r45.bt4) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(context, 7, r45.bt4.class);
        if (bt4Var != null) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putString("current_page_biz_info", bt4Var.f371037e);
            bundle2.putString("current_page_source_info", "music_operation_webview");
            bundle = bundle2;
        } else {
            bundle = null;
        }
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).fj(context, wrapper.f17358t, wXMediaMessage, 0, a5Var, bundle);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0028, code lost:
    
        if ((r17.length() == 0) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.content.Context r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, b21.r r21, r45.hf2 r22, com.tencent.mm.pluginsdk.model.app.a5 r23) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ll3.h2.b(android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String, b21.r, r45.hf2, com.tencent.mm.pluginsdk.model.app.a5):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(android.content.Context r5, b21.r r6, r45.hf2 r7) {
        /*
            r4 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.g(r5, r0)
            java.lang.String r0 = "wrapper"
            kotlin.jvm.internal.o.g(r6, r0)
            r0 = 16
            r1 = 0
            if (r7 == 0) goto L15
            java.lang.String r2 = r7.getString(r0)
            goto L16
        L15:
            r2 = r1
        L16:
            boolean r2 = com.tencent.mm.sdk.platformtools.t8.K0(r2)
            if (r2 != 0) goto L33
            java.lang.String r2 = "MusicUIUtil"
            java.lang.String r3 = "use androdiDownloadUrl"
            com.tencent.mars.xlog.Log.i(r2, r3)
            java.lang.String r6 = r6.f17358t
            if (r7 == 0) goto L2c
            java.lang.String r1 = r7.getString(r0)
        L2c:
            kotlin.jvm.internal.o.d(r1)
            r4.d(r5, r6, r1)
            return
        L33:
            java.lang.String r7 = r6.f17358t
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L73
            java.lang.String r7 = r6.f17358t
            java.lang.String r0 = "wx5aa333606550dfd5"
            boolean r7 = kotlin.jvm.internal.o.b(r0, r7)
            if (r7 == 0) goto L49
            java.lang.String r7 = "https://y.qq.com/m/download/index.html?channelId=2005000732"
            goto L75
        L49:
            java.lang.String r7 = r6.f17358t
            java.lang.String r0 = "wx8dd6ecd81906fd84"
            boolean r7 = kotlin.jvm.internal.o.b(r0, r7)
            if (r7 == 0) goto L57
            java.lang.String r7 = "https://a.app.qq.com/o/simple.jsp?pkgname=com.netease.cloudmusic"
            goto L75
        L57:
            java.lang.String r7 = r6.f17358t
            java.lang.String r0 = "wx79f2c4418704b4f8"
            boolean r7 = kotlin.jvm.internal.o.b(r0, r7)
            if (r7 == 0) goto L65
            java.lang.String r7 = "https://a.app.qq.com/o/simple.jsp?pkgname=com.kugou.android"
            goto L75
        L65:
            java.lang.String r7 = r6.f17358t
            java.lang.String r0 = "wxc305711a2a7ad71c"
            boolean r7 = kotlin.jvm.internal.o.b(r0, r7)
            if (r7 == 0) goto L73
            java.lang.String r7 = "https://a.app.qq.com/o/simple.jsp?pkgname=cn.kuwo.player"
            goto L75
        L73:
            java.lang.String r7 = ""
        L75:
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.K0(r7)
            if (r0 != 0) goto L81
            java.lang.String r6 = r6.f17358t
            r4.d(r5, r6, r7)
            return
        L81:
            java.lang.String r7 = r6.f17354p
            if (r7 != 0) goto L87
            java.lang.String r7 = r6.f17352n
        L87:
            java.lang.String r6 = r6.f17358t
            kotlin.jvm.internal.o.d(r7)
            r4.d(r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ll3.h2.c(android.content.Context, b21.r, r45.hf2):void");
    }

    public final void d(android.content.Context context, java.lang.String str, java.lang.String url) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(url, "url");
        com.tencent.mars.xlog.Log.i("MusicUIUtil", "launch H5 appId: %s, url:%s", str, url);
        if (kotlin.jvm.internal.o.b(str, "wx5aa333606550dfd5")) {
            gw4.f fVar = new gw4.f(context);
            fVar.f276157b = "mmdownloadapp_G5AaIuNdPtZyH1oCL8";
            ((fw4.l) ((gw4.g) i95.n0.c(gw4.g.class))).wi(fVar, null);
        } else {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", url);
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
        }
    }
}
