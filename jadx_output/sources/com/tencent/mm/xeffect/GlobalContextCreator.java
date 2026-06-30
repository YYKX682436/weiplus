package com.tencent.mm.xeffect;

/* loaded from: classes.dex */
public class GlobalContextCreator {
    private static native boolean nCheckCreateGlobalContext(java.lang.String str);

    private static native void nDestroyGlobalContext();

    private static native boolean nIsContextReady();
}
