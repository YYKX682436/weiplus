package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes4.dex */
public abstract class a {
    public static java.lang.String a(com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage) {
        if (wXMediaMessage == null) {
            return null;
        }
        com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject iMediaObject = wXMediaMessage.mediaObject;
        return iMediaObject instanceof com.tencent.mm.opensdk.modelmsg.WXMusicObject ? ((com.tencent.mm.opensdk.modelmsg.WXMusicObject) iMediaObject).songAlbumUrl : "";
    }

    public static java.lang.String b(com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage) {
        if (wXMediaMessage == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AbsShareReportUtil", "sendImgMsg msg not img");
            return null;
        }
        com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject iMediaObject = wXMediaMessage.mediaObject;
        return iMediaObject instanceof com.tencent.mm.opensdk.modelmsg.WXImageObject ? ((com.tencent.mm.opensdk.modelmsg.WXImageObject) iMediaObject).imagePath : iMediaObject instanceof com.tencent.mm.opensdk.modelmsg.WXVideoFileObject ? ((com.tencent.mm.opensdk.modelmsg.WXVideoFileObject) iMediaObject).filePath : iMediaObject instanceof com.tencent.mm.opensdk.modelmsg.WXMusicObject ? ((com.tencent.mm.opensdk.modelmsg.WXMusicObject) iMediaObject).musicUrl : iMediaObject instanceof com.tencent.mm.opensdk.modelmsg.WXVideoObject ? ((com.tencent.mm.opensdk.modelmsg.WXVideoObject) iMediaObject).videoUrl : iMediaObject instanceof com.tencent.mm.opensdk.modelmsg.WXWebpageObject ? ((com.tencent.mm.opensdk.modelmsg.WXWebpageObject) iMediaObject).webpageUrl : "";
    }
}
