package com.tencent.shadow.core.common;

/* loaded from: classes16.dex */
public interface ILoggerFactory {
    com.tencent.shadow.core.common.Logger getLogger(java.lang.String str);

    long getNativeLogFunc();

    void init(boolean z17);
}
