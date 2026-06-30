package com.tencent.mm.plugin.game.model;

/* loaded from: classes8.dex */
public class z3 {

    /* renamed from: a, reason: collision with root package name */
    public static com.tencent.mm.plugin.game.model.z3 f140570a;

    /* renamed from: b, reason: collision with root package name */
    public static com.tencent.tmassistantsdk.openSDK.ITMQQDownloaderOpenSDK f140571b;

    public static com.tencent.mm.plugin.game.model.z3 a() {
        if (f140570a == null) {
            synchronized (com.tencent.mm.plugin.game.model.z3.class) {
                if (f140570a == null) {
                    f140570a = new com.tencent.mm.plugin.game.model.z3();
                }
            }
        }
        return f140570a;
    }

    public com.tencent.tmassistantsdk.openSDK.ITMQQDownloaderOpenSDK b() {
        if (f140571b == null) {
            ((jf0.e) ((kf0.e) i95.n0.c(kf0.e.class))).getClass();
            com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDK tMQQDownloaderOpenSDK = com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDK.getInstance();
            f140571b = tMQQDownloaderOpenSDK;
            tMQQDownloaderOpenSDK.initQQDownloaderOpenSDK(com.tencent.mm.sdk.platformtools.x2.f193071a);
        }
        return f140571b;
    }
}
