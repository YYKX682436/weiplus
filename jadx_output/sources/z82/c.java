package z82;

/* loaded from: classes9.dex */
public class c implements com.tencent.mm.ui.widget.dialog.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.opensdk.modelmsg.WXMediaMessage f470723a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.favorite.ui.FavOpenApiEntry f470724b;

    public c(com.tencent.mm.plugin.favorite.ui.FavOpenApiEntry favOpenApiEntry, com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage) {
        this.f470724b = favOpenApiEntry;
        this.f470723a = wXMediaMessage;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j
    public void a(boolean z17, java.lang.String str, int i17) {
        com.tencent.mm.plugin.favorite.ui.FavOpenApiEntry favOpenApiEntry = this.f470724b;
        if (!z17) {
            favOpenApiEntry.finish();
            com.tencent.mm.pluginsdk.model.app.m5.c(favOpenApiEntry, com.tencent.mm.pluginsdk.model.app.m5.a(favOpenApiEntry.getIntent().getExtras(), 0), true, true);
            return;
        }
        int g17 = com.tencent.mm.sdk.platformtools.c2.g(favOpenApiEntry.getIntent(), com.tencent.mm.opensdk.constants.ConstantsAPI.SDK_VERSION, 0);
        com.tencent.mm.pluginsdk.model.app.m h17 = com.tencent.mm.pluginsdk.model.app.w.h(favOpenApiEntry.f101684f);
        com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage = this.f470723a;
        if (h17 != null) {
            java.lang.String str2 = h17.field_appId;
            java.lang.String str3 = h17.field_appName;
            boolean k17 = h17.k();
            int type = wXMediaMessage.getType();
            try {
                java.lang.String b17 = com.tencent.mm.pluginsdk.ui.tools.a.b(wXMediaMessage);
                java.lang.String b18 = fp.s0.b(b17 == null ? "" : b17, com.tencent.mapsdk.internal.rv.f51270c);
                java.lang.String a17 = com.tencent.mm.pluginsdk.ui.tools.a.a(wXMediaMessage);
                java.lang.String b19 = fp.s0.b(a17 == null ? "" : a17, com.tencent.mapsdk.internal.rv.f51270c);
                java.lang.String str4 = wXMediaMessage.title;
                if (str4 == null) {
                    str4 = "";
                }
                java.lang.String b27 = fp.s0.b(str4, com.tencent.mapsdk.internal.rv.f51270c);
                java.lang.String str5 = wXMediaMessage.description;
                if (str5 == null) {
                    str5 = "";
                }
                java.lang.String b28 = fp.s0.b(str5, com.tencent.mapsdk.internal.rv.f51270c);
                com.tencent.mars.xlog.Log.i("MicroMsg.ShareReport", g17 + "," + str2 + "," + str3 + "," + (k17 ? 1 : 0) + "," + type + ",3,1,," + b27 + "," + b28 + "," + b18 + "," + b19);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16492, java.lang.Integer.valueOf(g17), str2, str3, java.lang.Integer.valueOf(k17 ? 1 : 0), java.lang.Integer.valueOf(type), 3, 1, "", b27, b28, b18, "", "", "", b19);
            } catch (java.io.UnsupportedEncodingException unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ShareReport", "URLEncoder.encode Error");
            }
        }
        if (wXMediaMessage == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavOpenApiEntry", "deal fail, WXMediaMessage is null");
        } else {
            int type2 = wXMediaMessage.getType();
            if (type2 != 76) {
                if (type2 != 130) {
                    switch (type2) {
                        case 1:
                            com.tencent.mm.opensdk.modelmsg.WXTextObject wXTextObject = (com.tencent.mm.opensdk.modelmsg.WXTextObject) wXMediaMessage.mediaObject;
                            if (!com.tencent.mm.sdk.platformtools.t8.K0(wXTextObject.text)) {
                                o72.r2 r2Var = new o72.r2();
                                r2Var.field_type = 1;
                                favOpenApiEntry.W6(wXMediaMessage, r2Var);
                                r2Var.field_favProto.e(wXTextObject.text);
                                favOpenApiEntry.Y6(r2Var, wXMediaMessage);
                                com.tencent.mm.plugin.fav.ui.a0.a(r2Var);
                                break;
                            } else {
                                com.tencent.mars.xlog.Log.e("MicroMsg.FavOpenApiEntry", "addText null!");
                                break;
                            }
                        case 2:
                            com.tencent.mm.opensdk.modelmsg.WXImageObject wXImageObject = (com.tencent.mm.opensdk.modelmsg.WXImageObject) wXMediaMessage.mediaObject;
                            if (wXImageObject.imageData != null || com.tencent.mm.vfs.w6.j(wXImageObject.imagePath)) {
                                o72.r2 r2Var2 = new o72.r2();
                                r2Var2.field_type = 2;
                                favOpenApiEntry.W6(wXMediaMessage, r2Var2);
                                favOpenApiEntry.Y6(r2Var2, wXMediaMessage);
                                r2Var2.field_favProto.f370964f.add(favOpenApiEntry.V6(wXMediaMessage, wXImageObject.imagePath, wXImageObject.imageData, r2Var2.field_type));
                                com.tencent.mm.plugin.fav.ui.a0.a(r2Var2);
                                break;
                            }
                            break;
                        case 3:
                            com.tencent.mm.opensdk.modelmsg.WXMusicObject wXMusicObject = (com.tencent.mm.opensdk.modelmsg.WXMusicObject) wXMediaMessage.mediaObject;
                            if (!com.tencent.mm.sdk.platformtools.t8.K0(wXMusicObject.musicDataUrl) || !com.tencent.mm.sdk.platformtools.t8.K0(wXMusicObject.musicUrl) || !com.tencent.mm.sdk.platformtools.t8.K0(wXMusicObject.musicLowBandUrl)) {
                                o72.r2 r2Var3 = new o72.r2();
                                r2Var3.field_type = 7;
                                favOpenApiEntry.W6(wXMediaMessage, r2Var3);
                                r45.gp0 gp0Var = new r45.gp0();
                                gp0Var.K0(wXMusicObject.musicUrl);
                                gp0Var.J0(wXMusicObject.musicLowBandUrl);
                                gp0Var.I0(wXMusicObject.musicDataUrl);
                                gp0Var.O0(wXMediaMessage.title);
                                gp0Var.m0(wXMediaMessage.description);
                                favOpenApiEntry.X6(wXMediaMessage, gp0Var, r2Var3.field_type);
                                gp0Var.x0(true);
                                gp0Var.h0(r2Var3.field_type);
                                gp0Var.D0(wXMusicObject.songAlbumUrl);
                                gp0Var.E0(wXMusicObject.songLyric);
                                r2Var3.field_favProto.f370964f.add(gp0Var);
                                favOpenApiEntry.Y6(r2Var3, wXMediaMessage);
                                com.tencent.mm.plugin.fav.ui.a0.a(r2Var3);
                                break;
                            } else {
                                com.tencent.mars.xlog.Log.e("MicroMsg.FavOpenApiEntry", "addMusic, both url null");
                                break;
                            }
                            break;
                        case 4:
                            com.tencent.mm.opensdk.modelmsg.WXVideoObject wXVideoObject = (com.tencent.mm.opensdk.modelmsg.WXVideoObject) wXMediaMessage.mediaObject;
                            if (!com.tencent.mm.sdk.platformtools.t8.K0(wXVideoObject.videoLowBandUrl) || !com.tencent.mm.sdk.platformtools.t8.K0(wXVideoObject.videoUrl)) {
                                o72.r2 r2Var4 = new o72.r2();
                                r2Var4.field_type = 4;
                                favOpenApiEntry.W6(wXMediaMessage, r2Var4);
                                r45.gp0 gp0Var2 = new r45.gp0();
                                gp0Var2.K0(wXVideoObject.videoUrl);
                                gp0Var2.J0(wXVideoObject.videoLowBandUrl);
                                gp0Var2.O0(wXMediaMessage.title);
                                gp0Var2.m0(wXMediaMessage.description);
                                favOpenApiEntry.X6(wXMediaMessage, gp0Var2, r2Var4.field_type);
                                gp0Var2.x0(true);
                                gp0Var2.h0(r2Var4.field_type);
                                r2Var4.field_favProto.f370964f.add(gp0Var2);
                                favOpenApiEntry.Y6(r2Var4, wXMediaMessage);
                                com.tencent.mm.plugin.fav.ui.a0.a(r2Var4);
                                break;
                            } else {
                                com.tencent.mars.xlog.Log.e("MicroMsg.FavOpenApiEntry", "addVideo, both url null");
                                break;
                            }
                            break;
                        case 5:
                            com.tencent.mm.opensdk.modelmsg.WXWebpageObject wXWebpageObject = (com.tencent.mm.opensdk.modelmsg.WXWebpageObject) wXMediaMessage.mediaObject;
                            if (!com.tencent.mm.sdk.platformtools.t8.K0(wXWebpageObject.webpageUrl)) {
                                o72.r2 r2Var5 = new o72.r2();
                                r2Var5.field_sessionId = favOpenApiEntry.getIntent().getStringExtra("reportSessionId");
                                r2Var5.field_type = 5;
                                favOpenApiEntry.W6(wXMediaMessage, r2Var5);
                                favOpenApiEntry.Y6(r2Var5, wXMediaMessage);
                                r2Var5.field_favProto.f370962d.f(wXWebpageObject.webpageUrl);
                                if (wXMediaMessage.thumbData != null) {
                                    r45.gp0 gp0Var3 = new r45.gp0();
                                    gp0Var3.O0(wXMediaMessage.title);
                                    gp0Var3.m0(wXMediaMessage.description);
                                    favOpenApiEntry.X6(wXMediaMessage, gp0Var3, r2Var5.field_type);
                                    gp0Var3.x0(true);
                                    gp0Var3.h0(r2Var5.field_type);
                                    r2Var5.field_favProto.f370964f.add(gp0Var3);
                                }
                                com.tencent.mm.plugin.fav.ui.a0.a(r2Var5);
                                break;
                            } else {
                                com.tencent.mars.xlog.Log.e("MicroMsg.FavOpenApiEntry", "addUrl null!");
                                break;
                            }
                        case 6:
                            break;
                        default:
                            com.tencent.mars.xlog.Log.e("MicroMsg.FavOpenApiEntry", "unsupport type = " + type2);
                            break;
                    }
                }
                com.tencent.mm.opensdk.modelmsg.WXFileObject wXFileObject = (com.tencent.mm.opensdk.modelmsg.WXFileObject) wXMediaMessage.mediaObject;
                if (wXFileObject.fileData != null || com.tencent.mm.vfs.w6.j(wXFileObject.filePath)) {
                    o72.r2 r2Var6 = new o72.r2();
                    r2Var6.field_type = 8;
                    favOpenApiEntry.W6(wXMediaMessage, r2Var6);
                    favOpenApiEntry.Y6(r2Var6, wXMediaMessage);
                    r2Var6.field_favProto.f370964f.add(favOpenApiEntry.V6(wXMediaMessage, wXFileObject.filePath, wXFileObject.fileData, r2Var6.field_type));
                    com.tencent.mm.plugin.fav.ui.a0.a(r2Var6);
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.FavOpenApiEntry", "addFile data null");
                }
            } else {
                com.tencent.mm.opensdk.modelmsg.WXMusicVideoObject wXMusicVideoObject = (com.tencent.mm.opensdk.modelmsg.WXMusicVideoObject) wXMediaMessage.mediaObject;
                if (com.tencent.mm.sdk.platformtools.t8.K0(wXMusicVideoObject.musicUrl) && com.tencent.mm.sdk.platformtools.t8.K0(wXMusicVideoObject.musicDataUrl)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.FavOpenApiEntry", "addMusic, both url null");
                } else if (com.tencent.mm.sdk.platformtools.t8.K0(wXMusicVideoObject.hdAlbumThumbFilePath)) {
                    wXMediaMessage.mediaObject = wXMusicVideoObject;
                    favOpenApiEntry.U6(wXMediaMessage, null);
                } else {
                    ((ku5.t0) ku5.t0.f312615d).h(new dk5.f2(wXMusicVideoObject.hdAlbumThumbFilePath, new z82.d(favOpenApiEntry, wXMediaMessage, wXMusicVideoObject)), "MusicVideoShareUploadImage");
                }
            }
            favOpenApiEntry.finish();
        }
        com.tencent.mm.pluginsdk.model.app.m5.c(favOpenApiEntry, com.tencent.mm.pluginsdk.model.app.m5.a(favOpenApiEntry.getIntent().getExtras(), 0), true, false);
    }
}
