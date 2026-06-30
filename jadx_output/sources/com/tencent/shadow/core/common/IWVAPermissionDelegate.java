package com.tencent.shadow.core.common;

/* loaded from: classes7.dex */
public interface IWVAPermissionDelegate {
    int checkPermission(java.lang.String str, int i17, int i18);

    int checkSelfPermission(java.lang.String str);

    void requestPermissions(java.lang.String[] strArr, int i17, com.tencent.shadow.core.common.IWVAPermissionListener iWVAPermissionListener);
}
