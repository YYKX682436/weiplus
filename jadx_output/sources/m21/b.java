package m21;

/* loaded from: classes9.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static java.util.Set f322983a;

    public static int a(int i17) {
        int i18 = 1;
        if (i17 != 1) {
            i18 = 2;
            if (i17 != 2) {
                i18 = 3;
                if (i17 != 3) {
                    i18 = 4;
                    if (i17 != 4) {
                        if (i17 != 38) {
                            return i17 != 76 ? -1 : 5;
                        }
                        return 6;
                    }
                }
            }
        }
        return i18;
    }

    public static android.content.Intent b(int i17, com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, android.os.Bundle bundle) {
        char c17;
        java.lang.String str4;
        java.lang.String str5 = wXMediaMessage.description;
        com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject iMediaObject = wXMediaMessage.mediaObject;
        int type = iMediaObject.type();
        int a17 = a(3);
        if (type == 36) {
            c17 = 0;
        } else if (type == 76) {
            c17 = '*';
        } else if (type != 101) {
            if (type != 130) {
                if (type != 38 && type != 39) {
                    switch (type) {
                        case 1:
                            c17 = 2;
                            break;
                        case 2:
                            c17 = 1;
                            break;
                        case 3:
                            c17 = 4;
                            break;
                        case 4:
                            c17 = 5;
                            break;
                        case 5:
                        case 6:
                        case 7:
                            break;
                        default:
                            c17 = 65535;
                            break;
                    }
                } else {
                    c17 = 15;
                }
            }
            c17 = 3;
        } else {
            c17 = 'e';
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KThrid_app", true);
        iMediaObject.type();
        intent.putExtra("Ksnsupload_appid", str2);
        intent.putExtra("Ksnsupload_appname", str3);
        intent.putExtra("Ksnsupload_open_sdk_version", i17);
        intent.putExtra("KSnsAction", true);
        intent.putExtra("need_result", true);
        intent.putExtra("Ksnsupload_app_is_game", z17);
        android.os.Bundle bundle2 = new android.os.Bundle();
        com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req req = new com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req();
        req.message = wXMediaMessage;
        req.toBundle(bundle2);
        intent.putExtra("Ksnsupload_timeline", bundle2);
        if (c17 == 65535) {
            return null;
        }
        int type2 = iMediaObject.type();
        str4 = "";
        if (type2 == 36) {
            com.tencent.mm.opensdk.modelmsg.WXMiniProgramObject wXMiniProgramObject = (com.tencent.mm.opensdk.modelmsg.WXMiniProgramObject) req.message.mediaObject;
            intent.putExtra("Ksnsupload_link", wXMiniProgramObject.webpageUrl);
            intent.putExtra("Ksnsupload_contentattribute", 0);
            intent.putExtra("ksnsis_appbrand", true);
            intent.putExtra("Ksnsupload_source", 5);
            intent.putExtra("Ksnsupload_type", 1);
            intent.putExtra("KsnsUpload_BrandUsername", wXMiniProgramObject.userName);
            intent.putExtra("KsnsUpload_BrandPath", wXMiniProgramObject.path);
            intent.putExtra("KsnsUpload_BrandVersionType", wXMiniProgramObject.miniprogramType);
            java.lang.String str6 = wXMediaMessage.title;
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            intent.putExtra("Ksnsupload_title", str6 != null ? str6 : "");
            intent.putExtra("Ksnsupload_imgbuf", wXMediaMessage.thumbData);
            return intent;
        }
        if (type2 == 76) {
            java.lang.String str7 = ((com.tencent.mm.opensdk.modelmsg.WXMusicVideoObject) iMediaObject).musicUrl;
            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str7 == null) {
                str7 = "";
            }
            if (a(76) == -1) {
                return null;
            }
            intent.putExtra("Ksnsupload_link", str7);
            intent.putExtra("Ksnsupload_title", "");
            intent.putExtra("Ksnsupload_type", 25);
            intent.putExtra("ksnsis_music", true);
            if (bundle != null) {
                intent.putExtra("music_mv_cover_url", bundle.getString("music_mv_cover_url", ""));
            }
            return intent;
        }
        if (type2 == 101) {
            com.tencent.mm.opensdk.modelmsg.WXNativeGamePageObject wXNativeGamePageObject = (com.tencent.mm.opensdk.modelmsg.WXNativeGamePageObject) iMediaObject;
            java.lang.String string = bundle.getString("kWXEntryActivity_bundle_game_share_card_msgid");
            com.tencent.mm.plugin.gamesharecard.LiteAppBizDataInfo liteAppBizDataInfo = (com.tencent.mm.plugin.gamesharecard.LiteAppBizDataInfo) bundle.getParcelable("kWXEntryActivity_bundle_game_share_card_liteapp");
            if (liteAppBizDataInfo == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ShareSnsImpl", "johnjh sns gamepageobject or liteappbizdatainfo is null");
                return null;
            }
            java.lang.String str8 = wXMediaMessage.title;
            boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            intent.putExtra("Ksnsupload_title", str8 != null ? str8 : "");
            intent.putExtra("Ksnsupload_imgbuf", wXMediaMessage.thumbData);
            intent.putExtra("Ksnsupload_type", 34);
            intent.putExtra("ksnsis_gamesharecard", true);
            if (wXNativeGamePageObject.isVideo) {
                intent.putExtra("ksnsUpload_gameShareIsVideo", 1);
            } else {
                intent.putExtra("ksnsUpload_gameShareIsVideo", 0);
            }
            intent.putExtra("ksnsUpload_gameShareData", wXNativeGamePageObject.shareData);
            intent.putExtra("ksnsUpload_gameShareDuration", wXNativeGamePageObject.videoDuration);
            intent.putExtra("ksnsUpload_gameShareId", string);
            intent.putExtra("KsnsUpload_LiteAppId", liteAppBizDataInfo.f142116d);
            intent.putExtra("KsnsUpload_LiteAppPath", liteAppBizDataInfo.f142117e);
            intent.putExtra("KsnsUpload_LiteAppQuery", liteAppBizDataInfo.f142118f);
            intent.putExtra("ksnsUpload_gameShareLiteAppBizData", liteAppBizDataInfo.f142119g);
            intent.putExtra("ksnsUpload_gameShareLiteAppPriority", liteAppBizDataInfo.f142121i);
            return intent;
        }
        if (type2 != 130) {
            if (type2 == 38) {
                intent.putExtra("KBlockAdd", true);
                intent.putExtra("Ksnsupload_type", 14);
                java.lang.String str9 = ((com.tencent.mm.opensdk.modelmsg.WXVideoFileObject) iMediaObject).filePath;
                java.lang.String p17 = com.tencent.mm.vfs.w6.p(str9);
                if (com.tencent.mm.sdk.platformtools.t8.K0("") || !com.tencent.mm.vfs.w6.j("")) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    c01.d9.b();
                    sb6.append(((n34.q2) ((p94.e0) i95.n0.c(p94.e0.class))).Ai());
                    sb6.append(p17);
                    str4 = sb6.toString();
                    try {
                        com.tencent.mm.autogen.events.SnsGetVideoThumbEvent snsGetVideoThumbEvent = new com.tencent.mm.autogen.events.SnsGetVideoThumbEvent();
                        snsGetVideoThumbEvent.f54814g.f8326a = str9;
                        snsGetVideoThumbEvent.e();
                        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) snsGetVideoThumbEvent.f54815h.f8403a;
                        if (bitmap == null) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.ShareSnsImpl", "thumb null , videoPath %s ", str9);
                            return null;
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.ShareSnsImpl", "getBitmap1 %d %d", java.lang.Integer.valueOf(bitmap.getWidth()), java.lang.Integer.valueOf(bitmap.getHeight()));
                        com.tencent.mm.sdk.platformtools.x.D0(bitmap, 80, android.graphics.Bitmap.CompressFormat.JPEG, str4, true);
                        android.graphics.BitmapFactory.Options n07 = com.tencent.mm.sdk.platformtools.x.n0(str4);
                        com.tencent.mars.xlog.Log.i("MicroMsg.ShareSnsImpl", "getBitmap2 %d %d", java.lang.Integer.valueOf(n07.outWidth), java.lang.Integer.valueOf(n07.outHeight));
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.ShareSnsImpl", "savebitmap error %s", e17.getMessage());
                    }
                }
                intent.putExtra("KSightPath", str9);
                intent.putExtra("KSightThumbPath", str4);
                intent.putExtra("sight_md5", p17);
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_open_timeline_after_thirdapp_post_video, true)) {
                    intent.putExtra("K_go_to_SnsTimeLineUI", true);
                }
                return intent;
            }
            if (type2 == 39) {
                com.tencent.mm.opensdk.modelmsg.WXGameVideoFileObject wXGameVideoFileObject = (com.tencent.mm.opensdk.modelmsg.WXGameVideoFileObject) iMediaObject;
                intent.putExtra("KBlockAdd", true);
                intent.putExtra("Ksnsupload_type", 14);
                java.lang.String str10 = wXGameVideoFileObject.filePath;
                java.lang.String str11 = wXGameVideoFileObject.videoUrl;
                java.lang.String str12 = wXGameVideoFileObject.thumbUrl;
                com.tencent.mars.xlog.Log.i("MicroMsg.ShareSnsImpl", "videoPath %s,thumbPath %s,cdnUrl %s,cdnThumbUrl %s", str10, "", str11, str12);
                java.lang.String p18 = com.tencent.mm.vfs.w6.p(str10);
                if (com.tencent.mm.sdk.platformtools.t8.K0("") || !com.tencent.mm.vfs.w6.j("")) {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                    c01.d9.b();
                    sb7.append(((n34.q2) ((p94.e0) i95.n0.c(p94.e0.class))).Ai());
                    sb7.append(p18);
                    str4 = sb7.toString();
                    try {
                        com.tencent.mm.autogen.events.SnsGetVideoThumbEvent snsGetVideoThumbEvent2 = new com.tencent.mm.autogen.events.SnsGetVideoThumbEvent();
                        snsGetVideoThumbEvent2.f54814g.f8326a = str10;
                        snsGetVideoThumbEvent2.e();
                        android.graphics.Bitmap bitmap2 = (android.graphics.Bitmap) snsGetVideoThumbEvent2.f54815h.f8403a;
                        if (bitmap2 == null) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.ShareSnsImpl", "thumb null , videoPath %s ", str10);
                            return null;
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.ShareSnsImpl", "getBitmap1 %d %d", java.lang.Integer.valueOf(bitmap2.getWidth()), java.lang.Integer.valueOf(bitmap2.getHeight()));
                        com.tencent.mm.sdk.platformtools.x.D0(bitmap2, 80, android.graphics.Bitmap.CompressFormat.JPEG, str4, true);
                        android.graphics.BitmapFactory.Options n08 = com.tencent.mm.sdk.platformtools.x.n0(str4);
                        com.tencent.mars.xlog.Log.i("MicroMsg.ShareSnsImpl", "getBitmap2 %d %d", java.lang.Integer.valueOf(n08.outWidth), java.lang.Integer.valueOf(n08.outHeight));
                    } catch (java.lang.Exception e18) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.ShareSnsImpl", "savebitmap error %s", e18.getMessage());
                    }
                }
                intent.putExtra("KSightPath", str10);
                intent.putExtra("KSightThumbPath", str4);
                intent.putExtra("sight_md5", p18);
                intent.putExtra("KSightCdnUrl", str11);
                intent.putExtra("KSightCdnThumbUrl", str12);
                return intent;
            }
            switch (type2) {
                case 1:
                    intent.putExtra("Kdescription", ((com.tencent.mm.opensdk.modelmsg.WXTextObject) iMediaObject).text);
                    intent.putExtra("Ksnsupload_type", 8);
                    return intent;
                case 2:
                    intent.putExtra("KBlockAdd", true);
                    intent.putExtra("Ksnsupload_type", 0);
                    intent.putExtra("sns_kemdia_path", ((com.tencent.mm.opensdk.modelmsg.WXImageObject) iMediaObject).imagePath);
                    return intent;
                case 3:
                    com.tencent.mm.opensdk.modelmsg.WXMusicObject wXMusicObject = (com.tencent.mm.opensdk.modelmsg.WXMusicObject) iMediaObject;
                    java.lang.String str13 = !com.tencent.mm.sdk.platformtools.t8.K0(wXMusicObject.musicUrl) ? wXMusicObject.musicUrl : wXMusicObject.musicLowBandUrl;
                    if (str13 == null) {
                        str13 = "";
                    }
                    if (a17 == -1) {
                        return null;
                    }
                    intent.putExtra("Ksnsupload_link", str13);
                    intent.putExtra("Ksnsupload_title", "");
                    intent.putExtra("Ksnsupload_type", 2);
                    intent.putExtra("ksnsis_music", true);
                    return intent;
                case 4:
                    com.tencent.mm.opensdk.modelmsg.WXVideoObject wXVideoObject = (com.tencent.mm.opensdk.modelmsg.WXVideoObject) iMediaObject;
                    java.lang.String str14 = !com.tencent.mm.sdk.platformtools.t8.K0(wXVideoObject.videoUrl) ? wXVideoObject.videoUrl : wXVideoObject.videoLowBandUrl;
                    if (str14 == null) {
                        str14 = "";
                    }
                    if (a17 == -1) {
                        return null;
                    }
                    intent.putExtra("Ksnsupload_link", str14);
                    intent.putExtra("Ksnsupload_title", "");
                    intent.putExtra("Ksnsupload_type", 1);
                    intent.putExtra("ksnsis_video", true);
                    return intent;
                case 5:
                    intent.putExtra("Ksnsupload_link", ((com.tencent.mm.opensdk.modelmsg.WXWebpageObject) iMediaObject).webpageUrl);
                    java.lang.String str15 = wXMediaMessage.title;
                    boolean z28 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    intent.putExtra("Ksnsupload_title", str15 != null ? str15 : "");
                    intent.putExtra("Ksnsupload_imgbuf", wXMediaMessage.thumbData);
                    intent.putExtra("Ksnsupload_type", 1);
                    return intent;
                case 6:
                    break;
                case 7:
                    return null;
                default:
                    com.tencent.mars.xlog.Log.e("MicroMsg.ShareSnsImpl", "none type not support!");
                    return null;
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.ShareSnsImpl", "file is not support!");
        return null;
    }
}
