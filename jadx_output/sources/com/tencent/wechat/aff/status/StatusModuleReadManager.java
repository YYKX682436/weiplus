package com.tencent.wechat.aff.status;

/* loaded from: classes16.dex */
public class StatusModuleReadManager extends com.tencent.wechat.zidl2.ZidlBaseCaller {
    private static com.tencent.wechat.aff.status.StatusModuleReadManager instance = new com.tencent.wechat.aff.status.StatusModuleReadManager();
    com.tencent.wechat.aff.status.ZIDL_qp5oaPRwK jniCaller = new com.tencent.wechat.aff.status.ZIDL_qp5oaPRwK();

    /* loaded from: classes16.dex */
    public interface getStatusReadListCallback {
        void complete(com.tencent.wechat.aff.status.GetStatusReadListResponse getStatusReadListResponse);
    }

    /* loaded from: classes16.dex */
    public interface insertReadRecordCallback {
        void complete(boolean z17);
    }

    /* loaded from: classes8.dex */
    public interface markStatusReadCallback {
        void complete(com.tencent.wechat.aff.status.MarkStatusReadResponse markStatusReadResponse);
    }

    /* loaded from: classes16.dex */
    public interface readReadRecordListFromDBCallback {
        void complete(com.tencent.wechat.aff.status.GetStatusReadListResponse getStatusReadListResponse);
    }

    private StatusModuleReadManager() {
        this.zidlCreateName = "status.StatusModuleReadManager@Get";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_status", "aff_biz");
        this.jniCaller.ZIDL_qp5oaPRwC(this, this.zidlCreateName, this.zidlSvrIdentity);
    }

    public static com.tencent.wechat.aff.status.StatusModuleReadManager buildZidlObjForHolder(java.lang.String str, java.lang.String str2, long j17) {
        return getInstance();
    }

    public static com.tencent.wechat.aff.status.StatusModuleReadManager getInstance() {
        return instance;
    }

    public void getStatusReadListAsync(com.tencent.wechat.aff.status.GetStatusReadListRequest getStatusReadListRequest, com.tencent.wechat.aff.status.StatusModuleReadManager.getStatusReadListCallback getstatusreadlistcallback) {
        this.jniCaller.ZIDL_BV(this.nativeHandler, getstatusreadlistcallback, getStatusReadListRequest.toByteArrayOrNull());
    }

    public void insertReadRecordAsync(com.tencent.wechat.aff.status.StatusReadUserRecord statusReadUserRecord, com.tencent.wechat.aff.status.StatusModuleReadManager.insertReadRecordCallback insertreadrecordcallback) {
        this.jniCaller.ZIDL_DV(this.nativeHandler, insertreadrecordcallback, statusReadUserRecord.toByteArrayOrNull());
    }

    public void markStatusReadAsync(com.tencent.wechat.aff.status.MarkStatusReadRequest markStatusReadRequest, com.tencent.wechat.aff.status.StatusModuleReadManager.markStatusReadCallback markstatusreadcallback) {
        this.jniCaller.ZIDL_AV(this.nativeHandler, markstatusreadcallback, markStatusReadRequest.toByteArrayOrNull());
    }

    public void readReadRecordListFromDBAsync(com.tencent.wechat.aff.status.GetStatusReadListRequest getStatusReadListRequest, com.tencent.wechat.aff.status.StatusModuleReadManager.readReadRecordListFromDBCallback readreadrecordlistfromdbcallback) {
        this.jniCaller.ZIDL_CV(this.nativeHandler, readreadrecordlistfromdbcallback, getStatusReadListRequest.toByteArrayOrNull());
    }
}
