package com.tencent.mm.wemedia;

/* loaded from: classes7.dex */
public interface WeMediaCallback {
    java.lang.String getAbTest(java.lang.String str);

    java.lang.String getAbsolutePath(java.lang.String str);

    boolean getExternalConfig(java.lang.String str, boolean z17);

    void reportEvent(java.lang.String str, java.lang.String str2, java.lang.String str3);
}
