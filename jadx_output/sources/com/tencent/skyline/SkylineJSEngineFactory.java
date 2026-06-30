package com.tencent.skyline;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/tencent/skyline/SkylineJSEngineFactory;", "", "Lcom/tencent/skyline/ISkylineJSEngineCallback;", "callback", "Ljz5/f0;", "createJSEngine", "Lcom/tencent/skyline/ISkylineJSEngineFactory;", "sSkylineJSEngineFactory", "Lcom/tencent/skyline/ISkylineJSEngineFactory;", "getSSkylineJSEngineFactory", "()Lcom/tencent/skyline/ISkylineJSEngineFactory;", "setSSkylineJSEngineFactory", "(Lcom/tencent/skyline/ISkylineJSEngineFactory;)V", "<init>", "()V", "skyline_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes16.dex */
public final class SkylineJSEngineFactory {
    public static final com.tencent.skyline.SkylineJSEngineFactory INSTANCE = new com.tencent.skyline.SkylineJSEngineFactory();
    private static com.tencent.skyline.ISkylineJSEngineFactory sSkylineJSEngineFactory = new com.tencent.skyline.ISkylineJSEngineFactory() { // from class: com.tencent.skyline.SkylineJSEngineFactory$sSkylineJSEngineFactory$1
        @Override // com.tencent.skyline.ISkylineJSEngineFactory
        public void createJSEngine(com.tencent.skyline.ISkylineJSEngineCallback callback) {
            kotlin.jvm.internal.o.g(callback, "callback");
            callback.onDone(false, -1L, -1L);
        }
    };

    private SkylineJSEngineFactory() {
    }

    public final void createJSEngine(com.tencent.skyline.ISkylineJSEngineCallback callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.skyline.ISkylineJSEngineFactory iSkylineJSEngineFactory = sSkylineJSEngineFactory;
        if (iSkylineJSEngineFactory != null) {
            iSkylineJSEngineFactory.createJSEngine(callback);
        }
    }

    public final com.tencent.skyline.ISkylineJSEngineFactory getSSkylineJSEngineFactory() {
        return sSkylineJSEngineFactory;
    }

    public final void setSSkylineJSEngineFactory(com.tencent.skyline.ISkylineJSEngineFactory iSkylineJSEngineFactory) {
        sSkylineJSEngineFactory = iSkylineJSEngineFactory;
    }
}
