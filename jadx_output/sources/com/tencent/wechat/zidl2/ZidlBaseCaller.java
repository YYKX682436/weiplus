package com.tencent.wechat.zidl2;

/* loaded from: classes11.dex */
public class ZidlBaseCaller {
    public long nativeHandler = 0;
    public long refCntManagerHandler = 0;
    public java.lang.String zidlCreateName;
    public java.lang.String zidlIdentity;
    public java.lang.String zidlSvrIdentity;

    /* loaded from: classes11.dex */
    public static class ObjConstructorKey {
    }

    public java.lang.String getIdentity() {
        return this.zidlIdentity;
    }

    public java.lang.String getSvrIdentity() {
        return this.zidlSvrIdentity;
    }

    public void readyForLifeCycle() {
    }

    public void setIdentity(java.lang.String str) {
        this.zidlIdentity = str;
    }

    public void setSvrIdentity(java.lang.String str) {
        this.zidlSvrIdentity = str;
    }
}
