package com.tencent.wechat.aff.cara;

/* loaded from: classes16.dex */
public class CaraNativeDiscoverViewFeatureCenter extends com.tencent.wechat.zidl2.ZidlBaseCaller {
    private com.tencent.wechat.aff.cara.CaraNativeDiscoverViewFeatureCenter.Destructor destructor;

    /* loaded from: classes16.dex */
    public static class Destructor extends com.tencent.wechat.zidl2.DestructorThread.Destructor {
        long nativeHandler;
        public java.lang.String zidlIdentity;
        public java.lang.String zidlSvrIdentity;

        public Destructor(java.lang.Object obj, long j17) {
            super(obj);
        }

        public static native void jniDestroyCaraNativeDiscoverViewFeatureCenter(long j17, java.lang.String str, java.lang.String str2);

        @Override // com.tencent.wechat.zidl2.DestructorThread.Destructor
        public void destruct() {
            jniDestroyCaraNativeDiscoverViewFeatureCenter(this.nativeHandler, this.zidlIdentity, this.zidlSvrIdentity);
        }
    }

    public CaraNativeDiscoverViewFeatureCenter(com.tencent.wechat.zidl2.ZidlBaseCaller.ObjConstructorKey objConstructorKey, java.lang.String str, java.lang.String str2) {
        this.zidlCreateName = str;
        this.zidlSvrIdentity = str2;
        jniCreateCaraNativeDiscoverViewFeatureCenter(str, str2, null);
    }

    public static com.tencent.wechat.aff.cara.CaraNativeDiscoverViewFeatureCenter buildZidlObjForHolder(java.lang.String str, java.lang.String str2) {
        return new com.tencent.wechat.aff.cara.CaraNativeDiscoverViewFeatureCenter(new com.tencent.wechat.zidl2.ZidlBaseCaller.ObjConstructorKey(), str, str2);
    }

    private native void jniCreateCaraNativeDiscoverViewFeatureCenter(java.lang.String str, java.lang.String str2, java.lang.Object obj);

    private native java.lang.String jnianchorOfBadgeAtLiveCell(long j17);

    private native boolean jnibadgeAtChannelsCell(long j17);

    private native boolean jnibadgeAtDiscover(long j17);

    private native boolean jnibadgeAtLiveCell(long j17);

    private native boolean jnibadgeAtMomentsCell(long j17);

    private native boolean jnibadgeAtTopStoriesCell(long j17);

    private native java.lang.String jnititleOfBadgeAtLiveCell(long j17);

    private native int jniunreadAtChannelsCell(long j17);

    private native int jniunreadAtDiscover(long j17);

    private native int jniunreadAtLiveCell(long j17);

    private native int jniunreadAtMomentsCell(long j17);

    private native int jniunreadAtTopStoriesCell(long j17);

    public java.lang.String anchorOfBadgeAtLiveCell() {
        return jnianchorOfBadgeAtLiveCell(this.nativeHandler);
    }

    public boolean badgeAtChannelsCell() {
        return jnibadgeAtChannelsCell(this.nativeHandler);
    }

    public boolean badgeAtDiscover() {
        return jnibadgeAtDiscover(this.nativeHandler);
    }

    public boolean badgeAtLiveCell() {
        return jnibadgeAtLiveCell(this.nativeHandler);
    }

    public boolean badgeAtMomentsCell() {
        return jnibadgeAtMomentsCell(this.nativeHandler);
    }

    public boolean badgeAtTopStoriesCell() {
        return jnibadgeAtTopStoriesCell(this.nativeHandler);
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseCaller
    public void readyForLifeCycle() {
        com.tencent.wechat.aff.cara.CaraNativeDiscoverViewFeatureCenter.Destructor destructor = new com.tencent.wechat.aff.cara.CaraNativeDiscoverViewFeatureCenter.Destructor(this, this.nativeHandler);
        this.destructor = destructor;
        destructor.nativeHandler = this.nativeHandler;
        destructor.zidlIdentity = this.zidlIdentity;
        destructor.zidlSvrIdentity = this.zidlSvrIdentity;
    }

    public java.lang.String titleOfBadgeAtLiveCell() {
        return jnititleOfBadgeAtLiveCell(this.nativeHandler);
    }

    public int unreadAtChannelsCell() {
        return jniunreadAtChannelsCell(this.nativeHandler);
    }

    public int unreadAtDiscover() {
        return jniunreadAtDiscover(this.nativeHandler);
    }

    public int unreadAtLiveCell() {
        return jniunreadAtLiveCell(this.nativeHandler);
    }

    public int unreadAtMomentsCell() {
        return jniunreadAtMomentsCell(this.nativeHandler);
    }

    public int unreadAtTopStoriesCell() {
        return jniunreadAtTopStoriesCell(this.nativeHandler);
    }

    public CaraNativeDiscoverViewFeatureCenter() {
        this.zidlCreateName = "cara.CaraNativeDiscoverViewFeatureCenter@Create";
        jniCreateCaraNativeDiscoverViewFeatureCenter("cara.CaraNativeDiscoverViewFeatureCenter@Create", this.zidlSvrIdentity, null);
    }
}
