package com.tencent.wechat.aff.udr;

/* loaded from: classes15.dex */
public interface i {
    boolean addToPeriod();

    java.util.ArrayList getParameter();

    java.lang.String getProjectId();

    java.util.ArrayList getProjectIdList();

    void haveSpecifiedResourceAsync(long j17, java.lang.String str, java.lang.String str2, int i17, int i18, int i19);

    void onCallBackCheckSuccessAsync(long j17, java.lang.String str, java.lang.String str2, int i17, com.tencent.wechat.aff.udr.r rVar);

    void onCallBackFailAsync(long j17, int i17, int i18, java.lang.String str, java.lang.String str2, int i19, com.tencent.wechat.aff.udr.r rVar);

    void onCallBackStartPeriodAsync(long j17, java.lang.String str);

    void onCallBackSuccessAsync(long j17, java.lang.String str, java.lang.String str2, int i17, com.tencent.wechat.aff.udr.r rVar);

    void postProcessAsync(long j17, com.tencent.wechat.aff.udr.x xVar);

    void setCallback(com.tencent.wechat.aff.udr.h hVar);
}
