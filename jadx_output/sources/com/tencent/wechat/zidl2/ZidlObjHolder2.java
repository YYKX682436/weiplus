package com.tencent.wechat.zidl2;

/* loaded from: classes15.dex */
public class ZidlObjHolder2 {
    private com.tencent.wechat.zidl2.ZidlObjHolder2.Destructor destructor;
    private java.lang.String identity;
    private long manager;
    private java.lang.String name;

    /* loaded from: classes15.dex */
    public static class Destructor extends com.tencent.wechat.zidl2.DestructorThread.Destructor {
        long refCntManager;

        public Destructor(java.lang.Object obj, long j17) {
            super(obj);
            this.refCntManager = j17;
        }

        @Override // com.tencent.wechat.zidl2.DestructorThread.Destructor
        public void destruct() {
            com.tencent.wechat.zidl2.ZidlUtil.jniRelease(this.refCntManager);
        }
    }

    public ZidlObjHolder2() {
        this.name = "";
        this.identity = "";
        this.manager = 0L;
    }

    public java.lang.String getIdentity() {
        return this.identity;
    }

    public long getManager() {
        return this.manager;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public void setIdentity(java.lang.String str) {
        this.identity = str;
    }

    public void setManager(long j17) {
        this.manager = j17;
    }

    public void setName(java.lang.String str) {
        this.name = str;
    }

    public ZidlObjHolder2(java.lang.String str, java.lang.String str2, long j17) {
        this.name = str;
        this.identity = str2;
        this.manager = j17;
        if (j17 != 0) {
            com.tencent.wechat.zidl2.ZidlUtil.jniAddRef(j17);
            this.destructor = new com.tencent.wechat.zidl2.ZidlObjHolder2.Destructor(this, this.manager);
        }
    }
}
