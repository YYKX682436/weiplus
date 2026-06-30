package com.tencent.thumbplayer.api;

/* loaded from: classes15.dex */
public class TPPlayerFactory {
    private static final java.lang.String LOG_TAG = "TPPlayerFactory";

    public static com.tencent.thumbplayer.api.richmedia.ITPRichMediaAsyncRequester createRichMediaASyncRequester(android.content.Context context) {
        try {
            return new com.tencent.thumbplayer.richmedia.async.TPRichMediaAsyncRequester(context.getApplicationContext());
        } catch (java.lang.UnsupportedOperationException e17) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(LOG_TAG, "Failed to create rich media async requester:" + e17.getMessage());
            return null;
        }
    }

    public static com.tencent.thumbplayer.api.richmedia.ITPRichMediaSynchronizer createRichMediaSynchronizer(android.content.Context context) {
        try {
            return new com.tencent.thumbplayer.richmedia.TPRichMediaSynchronizer(context.getApplicationContext());
        } catch (java.lang.UnsupportedOperationException e17) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(LOG_TAG, "Failed to create rich media synchronizer:" + e17.getMessage());
            return null;
        }
    }

    public static com.tencent.thumbplayer.api.ITPPlayer createTPPlayer(android.content.Context context) {
        return (com.tencent.thumbplayer.api.ITPPlayer) new com.tencent.thumbplayer.tplayer.TPPlayerProxy(new com.tencent.thumbplayer.tplayer.TPPlayer(context)).getProxyInstance();
    }

    public static com.tencent.thumbplayer.api.TPSurface createTPSurface(android.graphics.SurfaceTexture surfaceTexture) {
        return new com.tencent.thumbplayer.api.TPSurface(surfaceTexture);
    }

    public static com.tencent.thumbplayer.api.ITPPlayer createTPPlayer(android.content.Context context, com.tencent.thumbplayer.log.TPLoggerContext tPLoggerContext) {
        return (com.tencent.thumbplayer.api.ITPPlayer) new com.tencent.thumbplayer.tplayer.TPPlayerProxy(new com.tencent.thumbplayer.tplayer.TPPlayer(context, null, null, tPLoggerContext)).getProxyInstance();
    }

    public static com.tencent.thumbplayer.api.ITPPlayer createTPPlayer(android.content.Context context, android.os.Looper looper) {
        return (com.tencent.thumbplayer.api.ITPPlayer) new com.tencent.thumbplayer.tplayer.TPPlayerProxy(new com.tencent.thumbplayer.tplayer.TPPlayer(context, looper)).getProxyInstance();
    }

    public static com.tencent.thumbplayer.api.ITPPlayer createTPPlayer(android.content.Context context, android.os.Looper looper, android.os.Looper looper2) {
        return (com.tencent.thumbplayer.api.ITPPlayer) new com.tencent.thumbplayer.tplayer.TPPlayerProxy(new com.tencent.thumbplayer.tplayer.TPPlayer(context, looper, looper2)).getProxyInstance();
    }

    public static com.tencent.thumbplayer.api.ITPPlayer createTPPlayer(android.content.Context context, android.os.Looper looper, android.os.Looper looper2, com.tencent.thumbplayer.log.TPLoggerContext tPLoggerContext) {
        return (com.tencent.thumbplayer.api.ITPPlayer) new com.tencent.thumbplayer.tplayer.TPPlayerProxy(new com.tencent.thumbplayer.tplayer.TPPlayer(context, looper, looper2, tPLoggerContext)).getProxyInstance();
    }
}
