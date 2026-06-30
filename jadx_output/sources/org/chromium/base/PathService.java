package org.chromium.base;

@org.chromium.base.annotations.JNINamespace("base::android")
/* loaded from: classes16.dex */
public abstract class PathService {
    public static final int DIR_MODULE = 3;

    /* loaded from: classes16.dex */
    public interface Natives {
        void override(int i17, java.lang.String str);
    }

    private PathService() {
    }

    public static void override(int i17, java.lang.String str) {
        org.chromium.base.PathServiceJni.get().override(i17, str);
    }
}
