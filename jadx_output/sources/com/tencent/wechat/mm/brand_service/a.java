package com.tencent.wechat.mm.brand_service;

/* loaded from: classes11.dex */
public interface a {
    boolean checkBrandListDBHasStartCompression();

    boolean checkBrandNotiListDBHasStartCompression();

    void forceInitBrsAffEnv();

    boolean getAllowEmptyListResortSwitch();

    java.lang.String getDigest(com.tencent.wechat.mm.brand_service.j jVar);

    int getLocalCanvasPkgVersion();

    long getSyncServerTimeMs();

    boolean getUserNameIsFollowed(java.lang.String str);

    boolean registerDIct(int i17);
}
