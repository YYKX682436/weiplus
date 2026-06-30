package com.tencent.thumbplayer.api.proxy;

/* loaded from: classes15.dex */
public class TPP2PProxyFactory {
    public static com.tencent.thumbplayer.api.proxy.ITPPreloadProxy createPreloadManager(android.content.Context context, int i17) {
        return new com.tencent.thumbplayer.datatransport.TPPreloadProxyImpl(context, i17);
    }
}
