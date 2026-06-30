package com.tencent.tav.decoder.factory;

/* loaded from: classes16.dex */
public class AVResampleFactory {
    private static final java.lang.String TAG = "AVResampleFactory";
    private static com.tencent.tav.decoder.factory.AVResampleFactory instance;
    private boolean tavResampleEnable;

    public AVResampleFactory() {
        this.tavResampleEnable = false;
        try {
            java.lang.Class.forName("com.tencent.tavkit.resample.TAVResample");
            this.tavResampleEnable = true;
        } catch (java.lang.ClassNotFoundException e17) {
            com.tencent.tav.decoder.logger.Logger.w(TAG, "newAVResample: " + e17);
        }
    }

    public static synchronized com.tencent.tav.decoder.factory.AVResampleFactory getInstance() {
        com.tencent.tav.decoder.factory.AVResampleFactory aVResampleFactory;
        synchronized (com.tencent.tav.decoder.factory.AVResampleFactory.class) {
            if (instance == null) {
                instance = new com.tencent.tav.decoder.factory.AVResampleFactory();
            }
            aVResampleFactory = instance;
        }
        return aVResampleFactory;
    }

    public static synchronized void setInstance(com.tencent.tav.decoder.factory.AVResampleFactory aVResampleFactory) {
        synchronized (com.tencent.tav.decoder.factory.AVResampleFactory.class) {
            instance = aVResampleFactory;
        }
    }

    public boolean isResampleEnable() {
        return this.tavResampleEnable;
    }

    public com.tencent.tav.coremedia.IAVResample newAVResample(int i17, int i18, int i19, int i27) {
        return null;
    }
}
