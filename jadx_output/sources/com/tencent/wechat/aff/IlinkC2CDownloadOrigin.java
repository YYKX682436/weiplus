package com.tencent.wechat.aff;

/* loaded from: classes16.dex */
public class IlinkC2CDownloadOrigin extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.IlinkC2CDownloadOrigin DEFAULT_INSTANCE = new com.tencent.wechat.aff.IlinkC2CDownloadOrigin();
    private com.tencent.mm.protobuf.g aeskey;
    private long apptype;
    private com.tencent.mm.protobuf.g arg_info;
    private com.tencent.mm.protobuf.g authkey;
    private int backup_length;
    private int backup_offset;
    private com.tencent.mm.protobuf.g bakup_url;
    private com.tencent.mm.protobuf.g bigfile_signture;
    private long bizid;
    private int blocksize;
    private int certificate_policy;
    private long chatnum;
    private int chattype;
    private int concurrent_count;
    private java.lang.String custom_request_header;
    private java.lang.String debugip;
    private int download_behavior;
    private int expect_image_format;
    private java.lang.String expected_filemd5;
    private long expected_filesize;
    private com.tencent.mm.protobuf.g fakeBigfileSignature;
    private com.tencent.mm.protobuf.g fakeBigfileSignatureAeskey;
    private com.tencent.mm.protobuf.g feed_id_;
    private int feed_pic_count_;
    private com.tencent.mm.protobuf.g fileid;
    private java.lang.String filekey;
    private long filesize_hint;
    private long filesize_max;
    private long filetype;
    private com.tencent.mm.protobuf.g flowtag;
    private int group_capacity;
    private com.tencent.mm.protobuf.g group_key;
    private com.tencent.mm.protobuf.g hls_videoflag;
    private com.tencent.mm.protobuf.g host;
    private com.tencent.mm.protobuf.g http_method;
    private com.tencent.mm.protobuf.g initial_decrypt_iv;
    private long initial_length;
    private long initial_offset;
    private boolean is_cold_snsdata;
    private boolean is_hlsvideo;
    private boolean is_hot_snsvideo;
    private boolean is_silent_task;
    private boolean isautostart;
    private int islargesvide;
    private boolean issmallvideo;
    private boolean isstoragemode;
    private int max_http_redirect_count;
    private int max_pcdn_connections;
    private int max_retry_count;
    private com.tencent.mm.protobuf.g msg_extra;
    private int msg_type_;
    private boolean needreport;
    private int pcdn_appid;
    private long predownload_minsize;
    private int predownload_ratio;
    private int queue_timeout_seconds;
    private com.tencent.wechat.aff.IlinkC2CQuicTaskParams quic_task_params;
    private com.tencent.mm.protobuf.g referer;
    private int request_video_format;
    private com.tencent.mm.protobuf.g request_videoflag;
    private java.lang.String savepath;
    private long sns_decrypt_key;
    private com.tencent.mm.protobuf.g sns_scene;
    private com.tencent.mm.protobuf.g snsvideo_extradata;
    private java.lang.String statefile;
    private long statefile_keep_hours;
    private long task_start_time;
    private int transfor_timeout_seconds;
    private com.tencent.mm.protobuf.g url;
    private boolean use_cronet;
    private boolean use_multithread;
    private boolean use_newdns;
    private int videoflag_policy;
    private int videomode;
    private java.util.LinkedList<com.tencent.wechat.aff.IlinkC2CBatchSnsReqImageData> batch_image_req_datas = new java.util.LinkedList<>();
    private java.util.LinkedList<com.tencent.wechat.aff.IlinkC2CCdnKv> verify_headers = new java.util.LinkedList<>();
    private final boolean[] hasSetFields = new boolean[77];

    public static com.tencent.wechat.aff.IlinkC2CDownloadOrigin create() {
        return new com.tencent.wechat.aff.IlinkC2CDownloadOrigin();
    }

    public static com.tencent.wechat.aff.IlinkC2CDownloadOrigin getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.IlinkC2CDownloadOrigin newBuilder() {
        return new com.tencent.wechat.aff.IlinkC2CDownloadOrigin();
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin addAllElementBatchImageReqDatas(java.util.Collection<com.tencent.wechat.aff.IlinkC2CBatchSnsReqImageData> collection) {
        this.batch_image_req_datas.addAll(collection);
        this.hasSetFields[57] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin addAllElementVerifyHeaders(java.util.Collection<com.tencent.wechat.aff.IlinkC2CCdnKv> collection) {
        this.verify_headers.addAll(collection);
        this.hasSetFields[68] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin addElementBatchImageReqDatas(com.tencent.wechat.aff.IlinkC2CBatchSnsReqImageData ilinkC2CBatchSnsReqImageData) {
        this.batch_image_req_datas.add(ilinkC2CBatchSnsReqImageData);
        this.hasSetFields[57] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin addElementVerifyHeaders(com.tencent.wechat.aff.IlinkC2CCdnKv ilinkC2CCdnKv) {
        this.verify_headers.add(ilinkC2CCdnKv);
        this.hasSetFields[68] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.IlinkC2CDownloadOrigin)) {
            return false;
        }
        com.tencent.wechat.aff.IlinkC2CDownloadOrigin ilinkC2CDownloadOrigin = (com.tencent.wechat.aff.IlinkC2CDownloadOrigin) fVar;
        return n51.f.a(this.filekey, ilinkC2CDownloadOrigin.filekey) && n51.f.a(this.debugip, ilinkC2CDownloadOrigin.debugip) && n51.f.a(this.authkey, ilinkC2CDownloadOrigin.authkey) && n51.f.a(this.arg_info, ilinkC2CDownloadOrigin.arg_info) && n51.f.a(java.lang.Boolean.valueOf(this.needreport), java.lang.Boolean.valueOf(ilinkC2CDownloadOrigin.needreport)) && n51.f.a(java.lang.Integer.valueOf(this.queue_timeout_seconds), java.lang.Integer.valueOf(ilinkC2CDownloadOrigin.queue_timeout_seconds)) && n51.f.a(java.lang.Integer.valueOf(this.transfor_timeout_seconds), java.lang.Integer.valueOf(ilinkC2CDownloadOrigin.transfor_timeout_seconds)) && n51.f.a(java.lang.Long.valueOf(this.statefile_keep_hours), java.lang.Long.valueOf(ilinkC2CDownloadOrigin.statefile_keep_hours)) && n51.f.a(this.statefile, ilinkC2CDownloadOrigin.statefile) && n51.f.a(this.expected_filemd5, ilinkC2CDownloadOrigin.expected_filemd5) && n51.f.a(java.lang.Long.valueOf(this.expected_filesize), java.lang.Long.valueOf(ilinkC2CDownloadOrigin.expected_filesize)) && n51.f.a(this.savepath, ilinkC2CDownloadOrigin.savepath) && n51.f.a(java.lang.Long.valueOf(this.filesize_max), java.lang.Long.valueOf(ilinkC2CDownloadOrigin.filesize_max)) && n51.f.a(this.aeskey, ilinkC2CDownloadOrigin.aeskey) && n51.f.a(java.lang.Long.valueOf(this.filetype), java.lang.Long.valueOf(ilinkC2CDownloadOrigin.filetype)) && n51.f.a(java.lang.Long.valueOf(this.apptype), java.lang.Long.valueOf(ilinkC2CDownloadOrigin.apptype)) && n51.f.a(java.lang.Long.valueOf(this.bizid), java.lang.Long.valueOf(ilinkC2CDownloadOrigin.bizid)) && n51.f.a(java.lang.Integer.valueOf(this.concurrent_count), java.lang.Integer.valueOf(ilinkC2CDownloadOrigin.concurrent_count)) && n51.f.a(java.lang.Boolean.valueOf(this.use_multithread), java.lang.Boolean.valueOf(ilinkC2CDownloadOrigin.use_multithread)) && n51.f.a(this.custom_request_header, ilinkC2CDownloadOrigin.custom_request_header) && n51.f.a(java.lang.Long.valueOf(this.filesize_hint), java.lang.Long.valueOf(ilinkC2CDownloadOrigin.filesize_hint)) && n51.f.a(java.lang.Integer.valueOf(this.download_behavior), java.lang.Integer.valueOf(ilinkC2CDownloadOrigin.download_behavior)) && n51.f.a(this.flowtag, ilinkC2CDownloadOrigin.flowtag) && n51.f.a(java.lang.Long.valueOf(this.chatnum), java.lang.Long.valueOf(ilinkC2CDownloadOrigin.chatnum)) && n51.f.a(java.lang.Boolean.valueOf(this.issmallvideo), java.lang.Boolean.valueOf(ilinkC2CDownloadOrigin.issmallvideo)) && n51.f.a(java.lang.Integer.valueOf(this.islargesvide), java.lang.Integer.valueOf(ilinkC2CDownloadOrigin.islargesvide)) && n51.f.a(java.lang.Integer.valueOf(this.request_video_format), java.lang.Integer.valueOf(ilinkC2CDownloadOrigin.request_video_format)) && n51.f.a(java.lang.Integer.valueOf(this.videoflag_policy), java.lang.Integer.valueOf(ilinkC2CDownloadOrigin.videoflag_policy)) && n51.f.a(this.request_videoflag, ilinkC2CDownloadOrigin.request_videoflag) && n51.f.a(java.lang.Integer.valueOf(this.predownload_ratio), java.lang.Integer.valueOf(ilinkC2CDownloadOrigin.predownload_ratio)) && n51.f.a(java.lang.Long.valueOf(this.predownload_minsize), java.lang.Long.valueOf(ilinkC2CDownloadOrigin.predownload_minsize)) && n51.f.a(java.lang.Boolean.valueOf(this.is_hot_snsvideo), java.lang.Boolean.valueOf(ilinkC2CDownloadOrigin.is_hot_snsvideo)) && n51.f.a(java.lang.Integer.valueOf(this.videomode), java.lang.Integer.valueOf(ilinkC2CDownloadOrigin.videomode)) && n51.f.a(this.msg_extra, ilinkC2CDownloadOrigin.msg_extra) && n51.f.a(java.lang.Boolean.valueOf(this.is_hlsvideo), java.lang.Boolean.valueOf(ilinkC2CDownloadOrigin.is_hlsvideo)) && n51.f.a(this.hls_videoflag, ilinkC2CDownloadOrigin.hls_videoflag) && n51.f.a(this.initial_decrypt_iv, ilinkC2CDownloadOrigin.initial_decrypt_iv) && n51.f.a(this.fileid, ilinkC2CDownloadOrigin.fileid) && n51.f.a(this.bigfile_signture, ilinkC2CDownloadOrigin.bigfile_signture) && n51.f.a(this.fakeBigfileSignature, ilinkC2CDownloadOrigin.fakeBigfileSignature) && n51.f.a(this.fakeBigfileSignatureAeskey, ilinkC2CDownloadOrigin.fakeBigfileSignatureAeskey) && n51.f.a(java.lang.Boolean.valueOf(this.isstoragemode), java.lang.Boolean.valueOf(ilinkC2CDownloadOrigin.isstoragemode)) && n51.f.a(java.lang.Boolean.valueOf(this.isautostart), java.lang.Boolean.valueOf(ilinkC2CDownloadOrigin.isautostart)) && n51.f.a(java.lang.Boolean.valueOf(this.is_silent_task), java.lang.Boolean.valueOf(ilinkC2CDownloadOrigin.is_silent_task)) && n51.f.a(java.lang.Integer.valueOf(this.chattype), java.lang.Integer.valueOf(ilinkC2CDownloadOrigin.chattype)) && n51.f.a(java.lang.Integer.valueOf(this.blocksize), java.lang.Integer.valueOf(ilinkC2CDownloadOrigin.blocksize)) && n51.f.a(java.lang.Integer.valueOf(this.expect_image_format), java.lang.Integer.valueOf(ilinkC2CDownloadOrigin.expect_image_format)) && n51.f.a(java.lang.Integer.valueOf(this.max_retry_count), java.lang.Integer.valueOf(ilinkC2CDownloadOrigin.max_retry_count)) && n51.f.a(java.lang.Boolean.valueOf(this.is_cold_snsdata), java.lang.Boolean.valueOf(ilinkC2CDownloadOrigin.is_cold_snsdata)) && n51.f.a(this.url, ilinkC2CDownloadOrigin.url) && n51.f.a(this.sns_scene, ilinkC2CDownloadOrigin.sns_scene) && n51.f.a(java.lang.Long.valueOf(this.sns_decrypt_key), java.lang.Long.valueOf(ilinkC2CDownloadOrigin.sns_decrypt_key)) && n51.f.a(this.snsvideo_extradata, ilinkC2CDownloadOrigin.snsvideo_extradata) && n51.f.a(java.lang.Integer.valueOf(this.msg_type_), java.lang.Integer.valueOf(ilinkC2CDownloadOrigin.msg_type_)) && n51.f.a(this.feed_id_, ilinkC2CDownloadOrigin.feed_id_) && n51.f.a(java.lang.Integer.valueOf(this.feed_pic_count_), java.lang.Integer.valueOf(ilinkC2CDownloadOrigin.feed_pic_count_)) && n51.f.a(this.batch_image_req_datas, ilinkC2CDownloadOrigin.batch_image_req_datas) && n51.f.a(this.referer, ilinkC2CDownloadOrigin.referer) && n51.f.a(this.quic_task_params, ilinkC2CDownloadOrigin.quic_task_params) && n51.f.a(java.lang.Long.valueOf(this.task_start_time), java.lang.Long.valueOf(ilinkC2CDownloadOrigin.task_start_time)) && n51.f.a(this.http_method, ilinkC2CDownloadOrigin.http_method) && n51.f.a(java.lang.Boolean.valueOf(this.use_newdns), java.lang.Boolean.valueOf(ilinkC2CDownloadOrigin.use_newdns)) && n51.f.a(java.lang.Boolean.valueOf(this.use_cronet), java.lang.Boolean.valueOf(ilinkC2CDownloadOrigin.use_cronet)) && n51.f.a(java.lang.Integer.valueOf(this.certificate_policy), java.lang.Integer.valueOf(ilinkC2CDownloadOrigin.certificate_policy)) && n51.f.a(this.host, ilinkC2CDownloadOrigin.host) && n51.f.a(java.lang.Integer.valueOf(this.max_http_redirect_count), java.lang.Integer.valueOf(ilinkC2CDownloadOrigin.max_http_redirect_count)) && n51.f.a(this.bakup_url, ilinkC2CDownloadOrigin.bakup_url) && n51.f.a(this.verify_headers, ilinkC2CDownloadOrigin.verify_headers) && n51.f.a(java.lang.Integer.valueOf(this.pcdn_appid), java.lang.Integer.valueOf(ilinkC2CDownloadOrigin.pcdn_appid)) && n51.f.a(java.lang.Integer.valueOf(this.max_pcdn_connections), java.lang.Integer.valueOf(ilinkC2CDownloadOrigin.max_pcdn_connections)) && n51.f.a(java.lang.Integer.valueOf(this.backup_offset), java.lang.Integer.valueOf(ilinkC2CDownloadOrigin.backup_offset)) && n51.f.a(java.lang.Integer.valueOf(this.backup_length), java.lang.Integer.valueOf(ilinkC2CDownloadOrigin.backup_length)) && n51.f.a(java.lang.Long.valueOf(this.initial_offset), java.lang.Long.valueOf(ilinkC2CDownloadOrigin.initial_offset)) && n51.f.a(java.lang.Long.valueOf(this.initial_length), java.lang.Long.valueOf(ilinkC2CDownloadOrigin.initial_length)) && n51.f.a(this.group_key, ilinkC2CDownloadOrigin.group_key) && n51.f.a(java.lang.Integer.valueOf(this.group_capacity), java.lang.Integer.valueOf(ilinkC2CDownloadOrigin.group_capacity));
    }

    public com.tencent.mm.protobuf.g getAeskey() {
        return this.hasSetFields[14] ? this.aeskey : com.tencent.mm.protobuf.g.f192155b;
    }

    public long getApptype() {
        return this.apptype;
    }

    public com.tencent.mm.protobuf.g getArgInfo() {
        return this.hasSetFields[4] ? this.arg_info : com.tencent.mm.protobuf.g.f192155b;
    }

    public com.tencent.mm.protobuf.g getAuthkey() {
        return this.hasSetFields[3] ? this.authkey : com.tencent.mm.protobuf.g.f192155b;
    }

    public int getBackupLength() {
        return this.backup_length;
    }

    public int getBackupOffset() {
        return this.backup_offset;
    }

    public com.tencent.mm.protobuf.g getBakupUrl() {
        return this.hasSetFields[67] ? this.bakup_url : com.tencent.mm.protobuf.g.f192155b;
    }

    public java.util.LinkedList<com.tencent.wechat.aff.IlinkC2CBatchSnsReqImageData> getBatchImageReqDatas() {
        return this.batch_image_req_datas;
    }

    public com.tencent.mm.protobuf.g getBigfileSignture() {
        return this.hasSetFields[39] ? this.bigfile_signture : com.tencent.mm.protobuf.g.f192155b;
    }

    public long getBizid() {
        return this.bizid;
    }

    public int getBlocksize() {
        return this.blocksize;
    }

    public int getCertificatePolicy() {
        return this.certificate_policy;
    }

    public long getChatnum() {
        return this.chatnum;
    }

    public int getChattype() {
        return this.chattype;
    }

    public int getConcurrentCount() {
        return this.concurrent_count;
    }

    public java.lang.String getCustomRequestHeader() {
        return this.hasSetFields[20] ? this.custom_request_header : "";
    }

    public java.lang.String getDebugip() {
        return this.hasSetFields[2] ? this.debugip : "";
    }

    public int getDownloadBehavior() {
        return this.download_behavior;
    }

    public int getExpectImageFormat() {
        return this.expect_image_format;
    }

    public java.lang.String getExpectedFilemd5() {
        return this.hasSetFields[10] ? this.expected_filemd5 : "";
    }

    public long getExpectedFilesize() {
        return this.expected_filesize;
    }

    public com.tencent.mm.protobuf.g getFakeBigfileSignature() {
        return this.hasSetFields[40] ? this.fakeBigfileSignature : com.tencent.mm.protobuf.g.f192155b;
    }

    public com.tencent.mm.protobuf.g getFakeBigfileSignatureAeskey() {
        return this.hasSetFields[41] ? this.fakeBigfileSignatureAeskey : com.tencent.mm.protobuf.g.f192155b;
    }

    public com.tencent.mm.protobuf.g getFeedId_() {
        return this.hasSetFields[55] ? this.feed_id_ : com.tencent.mm.protobuf.g.f192155b;
    }

    public int getFeedPicCount_() {
        return this.feed_pic_count_;
    }

    public com.tencent.mm.protobuf.g getFileid() {
        return this.hasSetFields[38] ? this.fileid : com.tencent.mm.protobuf.g.f192155b;
    }

    public java.lang.String getFilekey() {
        return this.hasSetFields[1] ? this.filekey : "";
    }

    public long getFilesizeHint() {
        return this.filesize_hint;
    }

    public long getFilesizeMax() {
        return this.filesize_max;
    }

    public long getFiletype() {
        return this.filetype;
    }

    public com.tencent.mm.protobuf.g getFlowtag() {
        return this.hasSetFields[23] ? this.flowtag : com.tencent.mm.protobuf.g.f192155b;
    }

    public int getGroupCapacity() {
        return this.group_capacity;
    }

    public com.tencent.mm.protobuf.g getGroupKey() {
        return this.hasSetFields[75] ? this.group_key : com.tencent.mm.protobuf.g.f192155b;
    }

    public com.tencent.mm.protobuf.g getHlsVideoflag() {
        return this.hasSetFields[36] ? this.hls_videoflag : com.tencent.mm.protobuf.g.f192155b;
    }

    public com.tencent.mm.protobuf.g getHost() {
        return this.hasSetFields[65] ? this.host : com.tencent.mm.protobuf.g.f192155b;
    }

    public com.tencent.mm.protobuf.g getHttpMethod() {
        return this.hasSetFields[61] ? this.http_method : com.tencent.mm.protobuf.g.f192155b;
    }

    public com.tencent.mm.protobuf.g getInitialDecryptIv() {
        return this.hasSetFields[37] ? this.initial_decrypt_iv : com.tencent.mm.protobuf.g.f192155b;
    }

    public long getInitialLength() {
        return this.initial_length;
    }

    public long getInitialOffset() {
        return this.initial_offset;
    }

    public boolean getIsColdSnsdata() {
        return this.is_cold_snsdata;
    }

    public boolean getIsHlsvideo() {
        return this.is_hlsvideo;
    }

    public boolean getIsHotSnsvideo() {
        return this.is_hot_snsvideo;
    }

    public boolean getIsSilentTask() {
        return this.is_silent_task;
    }

    public boolean getIsautostart() {
        return this.isautostart;
    }

    public int getIslargesvide() {
        return this.islargesvide;
    }

    public boolean getIssmallvideo() {
        return this.issmallvideo;
    }

    public boolean getIsstoragemode() {
        return this.isstoragemode;
    }

    public int getMaxHttpRedirectCount() {
        return this.max_http_redirect_count;
    }

    public int getMaxPcdnConnections() {
        return this.max_pcdn_connections;
    }

    public int getMaxRetryCount() {
        return this.max_retry_count;
    }

    public com.tencent.mm.protobuf.g getMsgExtra() {
        return this.hasSetFields[34] ? this.msg_extra : com.tencent.mm.protobuf.g.f192155b;
    }

    public int getMsgType_() {
        return this.msg_type_;
    }

    public boolean getNeedreport() {
        return this.needreport;
    }

    public int getPcdnAppid() {
        return this.pcdn_appid;
    }

    public long getPredownloadMinsize() {
        return this.predownload_minsize;
    }

    public int getPredownloadRatio() {
        return this.predownload_ratio;
    }

    public int getQueueTimeoutSeconds() {
        return this.queue_timeout_seconds;
    }

    public com.tencent.wechat.aff.IlinkC2CQuicTaskParams getQuicTaskParams() {
        return this.hasSetFields[59] ? this.quic_task_params : com.tencent.wechat.aff.IlinkC2CQuicTaskParams.create();
    }

    public com.tencent.mm.protobuf.g getReferer() {
        return this.hasSetFields[58] ? this.referer : com.tencent.mm.protobuf.g.f192155b;
    }

    public int getRequestVideoFormat() {
        return this.request_video_format;
    }

    public com.tencent.mm.protobuf.g getRequestVideoflag() {
        return this.hasSetFields[29] ? this.request_videoflag : com.tencent.mm.protobuf.g.f192155b;
    }

    public java.lang.String getSavepath() {
        return this.hasSetFields[12] ? this.savepath : "";
    }

    public long getSnsDecryptKey() {
        return this.sns_decrypt_key;
    }

    public com.tencent.mm.protobuf.g getSnsScene() {
        return this.hasSetFields[51] ? this.sns_scene : com.tencent.mm.protobuf.g.f192155b;
    }

    public com.tencent.mm.protobuf.g getSnsvideoExtradata() {
        return this.hasSetFields[53] ? this.snsvideo_extradata : com.tencent.mm.protobuf.g.f192155b;
    }

    public java.lang.String getStatefile() {
        return this.hasSetFields[9] ? this.statefile : "";
    }

    public long getStatefileKeepHours() {
        return this.statefile_keep_hours;
    }

    public long getTaskStartTime() {
        return this.task_start_time;
    }

    public int getTransforTimeoutSeconds() {
        return this.transfor_timeout_seconds;
    }

    public com.tencent.mm.protobuf.g getUrl() {
        return this.hasSetFields[50] ? this.url : com.tencent.mm.protobuf.g.f192155b;
    }

    public boolean getUseCronet() {
        return this.use_cronet;
    }

    public boolean getUseMultithread() {
        return this.use_multithread;
    }

    public boolean getUseNewdns() {
        return this.use_newdns;
    }

    public java.util.LinkedList<com.tencent.wechat.aff.IlinkC2CCdnKv> getVerifyHeaders() {
        return this.verify_headers;
    }

    public int getVideoflagPolicy() {
        return this.videoflag_policy;
    }

    public int getVideomode() {
        return this.videomode;
    }

    public boolean hasAeskey() {
        return hasFieldNumber(14);
    }

    public boolean hasApptype() {
        return hasFieldNumber(16);
    }

    public boolean hasArgInfo() {
        return hasFieldNumber(4);
    }

    public boolean hasAuthkey() {
        return hasFieldNumber(3);
    }

    public boolean hasBackupLength() {
        return hasFieldNumber(72);
    }

    public boolean hasBackupOffset() {
        return hasFieldNumber(71);
    }

    public boolean hasBakupUrl() {
        return hasFieldNumber(67);
    }

    public boolean hasBatchImageReqDatas() {
        return hasFieldNumber(57);
    }

    public boolean hasBigfileSignture() {
        return hasFieldNumber(39);
    }

    public boolean hasBizid() {
        return hasFieldNumber(17);
    }

    public boolean hasBlocksize() {
        return hasFieldNumber(46);
    }

    public boolean hasCertificatePolicy() {
        return hasFieldNumber(64);
    }

    public boolean hasChatnum() {
        return hasFieldNumber(24);
    }

    public boolean hasChattype() {
        return hasFieldNumber(45);
    }

    public boolean hasConcurrentCount() {
        return hasFieldNumber(18);
    }

    public boolean hasCustomRequestHeader() {
        return hasFieldNumber(20);
    }

    public boolean hasDebugip() {
        return hasFieldNumber(2);
    }

    public boolean hasDownloadBehavior() {
        return hasFieldNumber(22);
    }

    public boolean hasExpectImageFormat() {
        return hasFieldNumber(47);
    }

    public boolean hasExpectedFilemd5() {
        return hasFieldNumber(10);
    }

    public boolean hasExpectedFilesize() {
        return hasFieldNumber(11);
    }

    public boolean hasFakeBigfileSignature() {
        return hasFieldNumber(40);
    }

    public boolean hasFakeBigfileSignatureAeskey() {
        return hasFieldNumber(41);
    }

    public boolean hasFeedId_() {
        return hasFieldNumber(55);
    }

    public boolean hasFeedPicCount_() {
        return hasFieldNumber(56);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasFileid() {
        return hasFieldNumber(38);
    }

    public boolean hasFilekey() {
        return hasFieldNumber(1);
    }

    public boolean hasFilesizeHint() {
        return hasFieldNumber(21);
    }

    public boolean hasFilesizeMax() {
        return hasFieldNumber(13);
    }

    public boolean hasFiletype() {
        return hasFieldNumber(15);
    }

    public boolean hasFlowtag() {
        return hasFieldNumber(23);
    }

    public boolean hasGroupCapacity() {
        return hasFieldNumber(76);
    }

    public boolean hasGroupKey() {
        return hasFieldNumber(75);
    }

    public boolean hasHlsVideoflag() {
        return hasFieldNumber(36);
    }

    public boolean hasHost() {
        return hasFieldNumber(65);
    }

    public boolean hasHttpMethod() {
        return hasFieldNumber(61);
    }

    public boolean hasInitialDecryptIv() {
        return hasFieldNumber(37);
    }

    public boolean hasInitialLength() {
        return hasFieldNumber(74);
    }

    public boolean hasInitialOffset() {
        return hasFieldNumber(73);
    }

    public boolean hasIsColdSnsdata() {
        return hasFieldNumber(49);
    }

    public boolean hasIsHlsvideo() {
        return hasFieldNumber(35);
    }

    public boolean hasIsHotSnsvideo() {
        return hasFieldNumber(32);
    }

    public boolean hasIsSilentTask() {
        return hasFieldNumber(44);
    }

    public boolean hasIsautostart() {
        return hasFieldNumber(43);
    }

    public boolean hasIslargesvide() {
        return hasFieldNumber(26);
    }

    public boolean hasIssmallvideo() {
        return hasFieldNumber(25);
    }

    public boolean hasIsstoragemode() {
        return hasFieldNumber(42);
    }

    public boolean hasMaxHttpRedirectCount() {
        return hasFieldNumber(66);
    }

    public boolean hasMaxPcdnConnections() {
        return hasFieldNumber(70);
    }

    public boolean hasMaxRetryCount() {
        return hasFieldNumber(48);
    }

    public boolean hasMsgExtra() {
        return hasFieldNumber(34);
    }

    public boolean hasMsgType_() {
        return hasFieldNumber(54);
    }

    public boolean hasNeedreport() {
        return hasFieldNumber(5);
    }

    public boolean hasPcdnAppid() {
        return hasFieldNumber(69);
    }

    public boolean hasPredownloadMinsize() {
        return hasFieldNumber(31);
    }

    public boolean hasPredownloadRatio() {
        return hasFieldNumber(30);
    }

    public boolean hasQueueTimeoutSeconds() {
        return hasFieldNumber(6);
    }

    public boolean hasQuicTaskParams() {
        return hasFieldNumber(59);
    }

    public boolean hasReferer() {
        return hasFieldNumber(58);
    }

    public boolean hasRequestVideoFormat() {
        return hasFieldNumber(27);
    }

    public boolean hasRequestVideoflag() {
        return hasFieldNumber(29);
    }

    public boolean hasSavepath() {
        return hasFieldNumber(12);
    }

    public boolean hasSnsDecryptKey() {
        return hasFieldNumber(52);
    }

    public boolean hasSnsScene() {
        return hasFieldNumber(51);
    }

    public boolean hasSnsvideoExtradata() {
        return hasFieldNumber(53);
    }

    public boolean hasStatefile() {
        return hasFieldNumber(9);
    }

    public boolean hasStatefileKeepHours() {
        return hasFieldNumber(8);
    }

    public boolean hasTaskStartTime() {
        return hasFieldNumber(60);
    }

    public boolean hasTransforTimeoutSeconds() {
        return hasFieldNumber(7);
    }

    public boolean hasUrl() {
        return hasFieldNumber(50);
    }

    public boolean hasUseCronet() {
        return hasFieldNumber(63);
    }

    public boolean hasUseMultithread() {
        return hasFieldNumber(19);
    }

    public boolean hasUseNewdns() {
        return hasFieldNumber(62);
    }

    public boolean hasVerifyHeaders() {
        return hasFieldNumber(68);
    }

    public boolean hasVideoflagPolicy() {
        return hasFieldNumber(28);
    }

    public boolean hasVideomode() {
        return hasFieldNumber(33);
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.IlinkC2CDownloadOrigin();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.filekey;
            if (str != null && this.hasSetFields[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.debugip;
            if (str2 != null && this.hasSetFields[2]) {
                fVar.j(2, str2);
            }
            com.tencent.mm.protobuf.g gVar = this.authkey;
            if (gVar != null && this.hasSetFields[3]) {
                fVar.b(3, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.arg_info;
            if (gVar2 != null && this.hasSetFields[4]) {
                fVar.b(4, gVar2);
            }
            if (this.hasSetFields[5]) {
                fVar.a(5, this.needreport);
            }
            if (this.hasSetFields[6]) {
                fVar.f(6, this.queue_timeout_seconds);
            }
            if (this.hasSetFields[7]) {
                fVar.f(7, this.transfor_timeout_seconds);
            }
            if (this.hasSetFields[8]) {
                fVar.h(8, this.statefile_keep_hours);
            }
            java.lang.String str3 = this.statefile;
            if (str3 != null && this.hasSetFields[9]) {
                fVar.j(9, str3);
            }
            java.lang.String str4 = this.expected_filemd5;
            if (str4 != null && this.hasSetFields[10]) {
                fVar.j(10, str4);
            }
            if (this.hasSetFields[11]) {
                fVar.h(11, this.expected_filesize);
            }
            java.lang.String str5 = this.savepath;
            if (str5 != null && this.hasSetFields[12]) {
                fVar.j(12, str5);
            }
            if (this.hasSetFields[13]) {
                fVar.h(13, this.filesize_max);
            }
            com.tencent.mm.protobuf.g gVar3 = this.aeskey;
            if (gVar3 != null && this.hasSetFields[14]) {
                fVar.b(14, gVar3);
            }
            if (this.hasSetFields[15]) {
                fVar.h(15, this.filetype);
            }
            if (this.hasSetFields[16]) {
                fVar.h(16, this.apptype);
            }
            if (this.hasSetFields[17]) {
                fVar.h(17, this.bizid);
            }
            if (this.hasSetFields[18]) {
                fVar.f(18, this.concurrent_count);
            }
            if (this.hasSetFields[19]) {
                fVar.a(19, this.use_multithread);
            }
            java.lang.String str6 = this.custom_request_header;
            if (str6 != null && this.hasSetFields[20]) {
                fVar.j(20, str6);
            }
            if (this.hasSetFields[21]) {
                fVar.h(21, this.filesize_hint);
            }
            if (this.hasSetFields[22]) {
                fVar.f(22, this.download_behavior);
            }
            com.tencent.mm.protobuf.g gVar4 = this.flowtag;
            if (gVar4 != null && this.hasSetFields[23]) {
                fVar.b(23, gVar4);
            }
            if (this.hasSetFields[24]) {
                fVar.h(24, this.chatnum);
            }
            if (this.hasSetFields[25]) {
                fVar.a(25, this.issmallvideo);
            }
            if (this.hasSetFields[26]) {
                fVar.f(26, this.islargesvide);
            }
            if (this.hasSetFields[27]) {
                fVar.f(27, this.request_video_format);
            }
            if (this.hasSetFields[28]) {
                fVar.f(28, this.videoflag_policy);
            }
            com.tencent.mm.protobuf.g gVar5 = this.request_videoflag;
            if (gVar5 != null && this.hasSetFields[29]) {
                fVar.b(29, gVar5);
            }
            if (this.hasSetFields[30]) {
                fVar.f(30, this.predownload_ratio);
            }
            if (this.hasSetFields[31]) {
                fVar.h(31, this.predownload_minsize);
            }
            if (this.hasSetFields[32]) {
                fVar.a(32, this.is_hot_snsvideo);
            }
            if (this.hasSetFields[33]) {
                fVar.f(33, this.videomode);
            }
            com.tencent.mm.protobuf.g gVar6 = this.msg_extra;
            if (gVar6 != null && this.hasSetFields[34]) {
                fVar.b(34, gVar6);
            }
            if (this.hasSetFields[35]) {
                fVar.a(35, this.is_hlsvideo);
            }
            com.tencent.mm.protobuf.g gVar7 = this.hls_videoflag;
            if (gVar7 != null && this.hasSetFields[36]) {
                fVar.b(36, gVar7);
            }
            com.tencent.mm.protobuf.g gVar8 = this.initial_decrypt_iv;
            if (gVar8 != null && this.hasSetFields[37]) {
                fVar.b(37, gVar8);
            }
            com.tencent.mm.protobuf.g gVar9 = this.fileid;
            if (gVar9 != null && this.hasSetFields[38]) {
                fVar.b(38, gVar9);
            }
            com.tencent.mm.protobuf.g gVar10 = this.bigfile_signture;
            if (gVar10 != null && this.hasSetFields[39]) {
                fVar.b(39, gVar10);
            }
            com.tencent.mm.protobuf.g gVar11 = this.fakeBigfileSignature;
            if (gVar11 != null && this.hasSetFields[40]) {
                fVar.b(40, gVar11);
            }
            com.tencent.mm.protobuf.g gVar12 = this.fakeBigfileSignatureAeskey;
            if (gVar12 != null && this.hasSetFields[41]) {
                fVar.b(41, gVar12);
            }
            if (this.hasSetFields[42]) {
                fVar.a(42, this.isstoragemode);
            }
            if (this.hasSetFields[43]) {
                fVar.a(43, this.isautostart);
            }
            if (this.hasSetFields[44]) {
                fVar.a(44, this.is_silent_task);
            }
            if (this.hasSetFields[45]) {
                fVar.f(45, this.chattype);
            }
            if (this.hasSetFields[46]) {
                fVar.f(46, this.blocksize);
            }
            if (this.hasSetFields[47]) {
                fVar.f(47, this.expect_image_format);
            }
            if (this.hasSetFields[48]) {
                fVar.f(48, this.max_retry_count);
            }
            if (this.hasSetFields[49]) {
                fVar.a(49, this.is_cold_snsdata);
            }
            com.tencent.mm.protobuf.g gVar13 = this.url;
            if (gVar13 != null && this.hasSetFields[50]) {
                fVar.b(50, gVar13);
            }
            com.tencent.mm.protobuf.g gVar14 = this.sns_scene;
            if (gVar14 != null && this.hasSetFields[51]) {
                fVar.b(51, gVar14);
            }
            if (this.hasSetFields[52]) {
                fVar.h(52, this.sns_decrypt_key);
            }
            com.tencent.mm.protobuf.g gVar15 = this.snsvideo_extradata;
            if (gVar15 != null && this.hasSetFields[53]) {
                fVar.b(53, gVar15);
            }
            if (this.hasSetFields[54]) {
                fVar.f(54, this.msg_type_);
            }
            com.tencent.mm.protobuf.g gVar16 = this.feed_id_;
            if (gVar16 != null && this.hasSetFields[55]) {
                fVar.b(55, gVar16);
            }
            if (this.hasSetFields[56]) {
                fVar.f(56, this.feed_pic_count_);
            }
            fVar.g(57, 8, this.batch_image_req_datas);
            com.tencent.mm.protobuf.g gVar17 = this.referer;
            if (gVar17 != null && this.hasSetFields[58]) {
                fVar.b(58, gVar17);
            }
            com.tencent.wechat.aff.IlinkC2CQuicTaskParams ilinkC2CQuicTaskParams = this.quic_task_params;
            if (ilinkC2CQuicTaskParams != null && this.hasSetFields[59]) {
                fVar.i(59, ilinkC2CQuicTaskParams.computeSize());
                this.quic_task_params.writeFields(fVar);
            }
            if (this.hasSetFields[60]) {
                fVar.h(60, this.task_start_time);
            }
            com.tencent.mm.protobuf.g gVar18 = this.http_method;
            if (gVar18 != null && this.hasSetFields[61]) {
                fVar.b(61, gVar18);
            }
            if (this.hasSetFields[62]) {
                fVar.a(62, this.use_newdns);
            }
            if (this.hasSetFields[63]) {
                fVar.a(63, this.use_cronet);
            }
            if (this.hasSetFields[64]) {
                fVar.f(64, this.certificate_policy);
            }
            com.tencent.mm.protobuf.g gVar19 = this.host;
            if (gVar19 != null && this.hasSetFields[65]) {
                fVar.b(65, gVar19);
            }
            if (this.hasSetFields[66]) {
                fVar.f(66, this.max_http_redirect_count);
            }
            com.tencent.mm.protobuf.g gVar20 = this.bakup_url;
            if (gVar20 != null && this.hasSetFields[67]) {
                fVar.b(67, gVar20);
            }
            fVar.g(68, 8, this.verify_headers);
            if (this.hasSetFields[69]) {
                fVar.f(69, this.pcdn_appid);
            }
            if (this.hasSetFields[70]) {
                fVar.f(70, this.max_pcdn_connections);
            }
            if (this.hasSetFields[71]) {
                fVar.f(71, this.backup_offset);
            }
            if (this.hasSetFields[72]) {
                fVar.f(72, this.backup_length);
            }
            if (this.hasSetFields[73]) {
                fVar.h(73, this.initial_offset);
            }
            if (this.hasSetFields[74]) {
                fVar.h(74, this.initial_length);
            }
            com.tencent.mm.protobuf.g gVar21 = this.group_key;
            if (gVar21 != null && this.hasSetFields[75]) {
                fVar.b(75, gVar21);
            }
            if (this.hasSetFields[76]) {
                fVar.f(76, this.group_capacity);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.filekey;
            if (str7 != null && this.hasSetFields[1]) {
                i18 = b36.f.j(1, str7) + 0;
            }
            java.lang.String str8 = this.debugip;
            if (str8 != null && this.hasSetFields[2]) {
                i18 += b36.f.j(2, str8);
            }
            com.tencent.mm.protobuf.g gVar22 = this.authkey;
            if (gVar22 != null && this.hasSetFields[3]) {
                i18 += b36.f.b(3, gVar22);
            }
            com.tencent.mm.protobuf.g gVar23 = this.arg_info;
            if (gVar23 != null && this.hasSetFields[4]) {
                i18 += b36.f.b(4, gVar23);
            }
            if (this.hasSetFields[5]) {
                i18 += b36.f.a(5, this.needreport);
            }
            if (this.hasSetFields[6]) {
                i18 += b36.f.f(6, this.queue_timeout_seconds);
            }
            if (this.hasSetFields[7]) {
                i18 += b36.f.f(7, this.transfor_timeout_seconds);
            }
            if (this.hasSetFields[8]) {
                i18 += b36.f.h(8, this.statefile_keep_hours);
            }
            java.lang.String str9 = this.statefile;
            if (str9 != null && this.hasSetFields[9]) {
                i18 += b36.f.j(9, str9);
            }
            java.lang.String str10 = this.expected_filemd5;
            if (str10 != null && this.hasSetFields[10]) {
                i18 += b36.f.j(10, str10);
            }
            if (this.hasSetFields[11]) {
                i18 += b36.f.h(11, this.expected_filesize);
            }
            java.lang.String str11 = this.savepath;
            if (str11 != null && this.hasSetFields[12]) {
                i18 += b36.f.j(12, str11);
            }
            if (this.hasSetFields[13]) {
                i18 += b36.f.h(13, this.filesize_max);
            }
            com.tencent.mm.protobuf.g gVar24 = this.aeskey;
            if (gVar24 != null && this.hasSetFields[14]) {
                i18 += b36.f.b(14, gVar24);
            }
            if (this.hasSetFields[15]) {
                i18 += b36.f.h(15, this.filetype);
            }
            if (this.hasSetFields[16]) {
                i18 += b36.f.h(16, this.apptype);
            }
            if (this.hasSetFields[17]) {
                i18 += b36.f.h(17, this.bizid);
            }
            if (this.hasSetFields[18]) {
                i18 += b36.f.f(18, this.concurrent_count);
            }
            if (this.hasSetFields[19]) {
                i18 += b36.f.a(19, this.use_multithread);
            }
            java.lang.String str12 = this.custom_request_header;
            if (str12 != null && this.hasSetFields[20]) {
                i18 += b36.f.j(20, str12);
            }
            if (this.hasSetFields[21]) {
                i18 += b36.f.h(21, this.filesize_hint);
            }
            if (this.hasSetFields[22]) {
                i18 += b36.f.f(22, this.download_behavior);
            }
            com.tencent.mm.protobuf.g gVar25 = this.flowtag;
            if (gVar25 != null && this.hasSetFields[23]) {
                i18 += b36.f.b(23, gVar25);
            }
            if (this.hasSetFields[24]) {
                i18 += b36.f.h(24, this.chatnum);
            }
            if (this.hasSetFields[25]) {
                i18 += b36.f.a(25, this.issmallvideo);
            }
            if (this.hasSetFields[26]) {
                i18 += b36.f.f(26, this.islargesvide);
            }
            if (this.hasSetFields[27]) {
                i18 += b36.f.f(27, this.request_video_format);
            }
            if (this.hasSetFields[28]) {
                i18 += b36.f.f(28, this.videoflag_policy);
            }
            com.tencent.mm.protobuf.g gVar26 = this.request_videoflag;
            if (gVar26 != null && this.hasSetFields[29]) {
                i18 += b36.f.b(29, gVar26);
            }
            if (this.hasSetFields[30]) {
                i18 += b36.f.f(30, this.predownload_ratio);
            }
            if (this.hasSetFields[31]) {
                i18 += b36.f.h(31, this.predownload_minsize);
            }
            if (this.hasSetFields[32]) {
                i18 += b36.f.a(32, this.is_hot_snsvideo);
            }
            if (this.hasSetFields[33]) {
                i18 += b36.f.f(33, this.videomode);
            }
            com.tencent.mm.protobuf.g gVar27 = this.msg_extra;
            if (gVar27 != null && this.hasSetFields[34]) {
                i18 += b36.f.b(34, gVar27);
            }
            if (this.hasSetFields[35]) {
                i18 += b36.f.a(35, this.is_hlsvideo);
            }
            com.tencent.mm.protobuf.g gVar28 = this.hls_videoflag;
            if (gVar28 != null && this.hasSetFields[36]) {
                i18 += b36.f.b(36, gVar28);
            }
            com.tencent.mm.protobuf.g gVar29 = this.initial_decrypt_iv;
            if (gVar29 != null && this.hasSetFields[37]) {
                i18 += b36.f.b(37, gVar29);
            }
            com.tencent.mm.protobuf.g gVar30 = this.fileid;
            if (gVar30 != null && this.hasSetFields[38]) {
                i18 += b36.f.b(38, gVar30);
            }
            com.tencent.mm.protobuf.g gVar31 = this.bigfile_signture;
            if (gVar31 != null && this.hasSetFields[39]) {
                i18 += b36.f.b(39, gVar31);
            }
            com.tencent.mm.protobuf.g gVar32 = this.fakeBigfileSignature;
            if (gVar32 != null && this.hasSetFields[40]) {
                i18 += b36.f.b(40, gVar32);
            }
            com.tencent.mm.protobuf.g gVar33 = this.fakeBigfileSignatureAeskey;
            if (gVar33 != null && this.hasSetFields[41]) {
                i18 += b36.f.b(41, gVar33);
            }
            if (this.hasSetFields[42]) {
                i18 += b36.f.a(42, this.isstoragemode);
            }
            if (this.hasSetFields[43]) {
                i18 += b36.f.a(43, this.isautostart);
            }
            if (this.hasSetFields[44]) {
                i18 += b36.f.a(44, this.is_silent_task);
            }
            if (this.hasSetFields[45]) {
                i18 += b36.f.f(45, this.chattype);
            }
            if (this.hasSetFields[46]) {
                i18 += b36.f.f(46, this.blocksize);
            }
            if (this.hasSetFields[47]) {
                i18 += b36.f.f(47, this.expect_image_format);
            }
            if (this.hasSetFields[48]) {
                i18 += b36.f.f(48, this.max_retry_count);
            }
            if (this.hasSetFields[49]) {
                i18 += b36.f.a(49, this.is_cold_snsdata);
            }
            com.tencent.mm.protobuf.g gVar34 = this.url;
            if (gVar34 != null && this.hasSetFields[50]) {
                i18 += b36.f.b(50, gVar34);
            }
            com.tencent.mm.protobuf.g gVar35 = this.sns_scene;
            if (gVar35 != null && this.hasSetFields[51]) {
                i18 += b36.f.b(51, gVar35);
            }
            if (this.hasSetFields[52]) {
                i18 += b36.f.h(52, this.sns_decrypt_key);
            }
            com.tencent.mm.protobuf.g gVar36 = this.snsvideo_extradata;
            if (gVar36 != null && this.hasSetFields[53]) {
                i18 += b36.f.b(53, gVar36);
            }
            if (this.hasSetFields[54]) {
                i18 += b36.f.f(54, this.msg_type_);
            }
            com.tencent.mm.protobuf.g gVar37 = this.feed_id_;
            if (gVar37 != null && this.hasSetFields[55]) {
                i18 += b36.f.b(55, gVar37);
            }
            if (this.hasSetFields[56]) {
                i18 += b36.f.f(56, this.feed_pic_count_);
            }
            int g17 = i18 + b36.f.g(57, 8, this.batch_image_req_datas);
            com.tencent.mm.protobuf.g gVar38 = this.referer;
            if (gVar38 != null && this.hasSetFields[58]) {
                g17 += b36.f.b(58, gVar38);
            }
            com.tencent.wechat.aff.IlinkC2CQuicTaskParams ilinkC2CQuicTaskParams2 = this.quic_task_params;
            if (ilinkC2CQuicTaskParams2 != null && this.hasSetFields[59]) {
                g17 += b36.f.i(59, ilinkC2CQuicTaskParams2.computeSize());
            }
            if (this.hasSetFields[60]) {
                g17 += b36.f.h(60, this.task_start_time);
            }
            com.tencent.mm.protobuf.g gVar39 = this.http_method;
            if (gVar39 != null && this.hasSetFields[61]) {
                g17 += b36.f.b(61, gVar39);
            }
            if (this.hasSetFields[62]) {
                g17 += b36.f.a(62, this.use_newdns);
            }
            if (this.hasSetFields[63]) {
                g17 += b36.f.a(63, this.use_cronet);
            }
            if (this.hasSetFields[64]) {
                g17 += b36.f.f(64, this.certificate_policy);
            }
            com.tencent.mm.protobuf.g gVar40 = this.host;
            if (gVar40 != null && this.hasSetFields[65]) {
                g17 += b36.f.b(65, gVar40);
            }
            if (this.hasSetFields[66]) {
                g17 += b36.f.f(66, this.max_http_redirect_count);
            }
            com.tencent.mm.protobuf.g gVar41 = this.bakup_url;
            if (gVar41 != null && this.hasSetFields[67]) {
                g17 += b36.f.b(67, gVar41);
            }
            int g18 = g17 + b36.f.g(68, 8, this.verify_headers);
            if (this.hasSetFields[69]) {
                g18 += b36.f.f(69, this.pcdn_appid);
            }
            if (this.hasSetFields[70]) {
                g18 += b36.f.f(70, this.max_pcdn_connections);
            }
            if (this.hasSetFields[71]) {
                g18 += b36.f.f(71, this.backup_offset);
            }
            if (this.hasSetFields[72]) {
                g18 += b36.f.f(72, this.backup_length);
            }
            if (this.hasSetFields[73]) {
                g18 += b36.f.h(73, this.initial_offset);
            }
            if (this.hasSetFields[74]) {
                g18 += b36.f.h(74, this.initial_length);
            }
            com.tencent.mm.protobuf.g gVar42 = this.group_key;
            if (gVar42 != null && this.hasSetFields[75]) {
                g18 += b36.f.b(75, gVar42);
            }
            return this.hasSetFields[76] ? g18 + b36.f.f(76, this.group_capacity) : g18;
        }
        if (i17 == 2) {
            this.batch_image_req_datas.clear();
            this.verify_headers.clear();
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                this.filekey = aVar2.k(intValue);
                this.hasSetFields[1] = true;
                return 0;
            case 2:
                this.debugip = aVar2.k(intValue);
                this.hasSetFields[2] = true;
                return 0;
            case 3:
                this.authkey = aVar2.d(intValue);
                this.hasSetFields[3] = true;
                return 0;
            case 4:
                this.arg_info = aVar2.d(intValue);
                this.hasSetFields[4] = true;
                return 0;
            case 5:
                this.needreport = aVar2.c(intValue);
                this.hasSetFields[5] = true;
                return 0;
            case 6:
                this.queue_timeout_seconds = aVar2.h(intValue);
                this.hasSetFields[6] = true;
                return 0;
            case 7:
                this.transfor_timeout_seconds = aVar2.h(intValue);
                this.hasSetFields[7] = true;
                return 0;
            case 8:
                this.statefile_keep_hours = aVar2.i(intValue);
                this.hasSetFields[8] = true;
                return 0;
            case 9:
                this.statefile = aVar2.k(intValue);
                this.hasSetFields[9] = true;
                return 0;
            case 10:
                this.expected_filemd5 = aVar2.k(intValue);
                this.hasSetFields[10] = true;
                return 0;
            case 11:
                this.expected_filesize = aVar2.i(intValue);
                this.hasSetFields[11] = true;
                return 0;
            case 12:
                this.savepath = aVar2.k(intValue);
                this.hasSetFields[12] = true;
                return 0;
            case 13:
                this.filesize_max = aVar2.i(intValue);
                this.hasSetFields[13] = true;
                return 0;
            case 14:
                this.aeskey = aVar2.d(intValue);
                this.hasSetFields[14] = true;
                return 0;
            case 15:
                this.filetype = aVar2.i(intValue);
                this.hasSetFields[15] = true;
                return 0;
            case 16:
                this.apptype = aVar2.i(intValue);
                this.hasSetFields[16] = true;
                return 0;
            case 17:
                this.bizid = aVar2.i(intValue);
                this.hasSetFields[17] = true;
                return 0;
            case 18:
                this.concurrent_count = aVar2.h(intValue);
                this.hasSetFields[18] = true;
                return 0;
            case 19:
                this.use_multithread = aVar2.c(intValue);
                this.hasSetFields[19] = true;
                return 0;
            case 20:
                this.custom_request_header = aVar2.k(intValue);
                this.hasSetFields[20] = true;
                return 0;
            case 21:
                this.filesize_hint = aVar2.i(intValue);
                this.hasSetFields[21] = true;
                return 0;
            case 22:
                this.download_behavior = aVar2.h(intValue);
                this.hasSetFields[22] = true;
                return 0;
            case 23:
                this.flowtag = aVar2.d(intValue);
                this.hasSetFields[23] = true;
                return 0;
            case 24:
                this.chatnum = aVar2.i(intValue);
                this.hasSetFields[24] = true;
                return 0;
            case 25:
                this.issmallvideo = aVar2.c(intValue);
                this.hasSetFields[25] = true;
                return 0;
            case 26:
                this.islargesvide = aVar2.h(intValue);
                this.hasSetFields[26] = true;
                return 0;
            case 27:
                this.request_video_format = aVar2.h(intValue);
                this.hasSetFields[27] = true;
                return 0;
            case 28:
                this.videoflag_policy = aVar2.h(intValue);
                this.hasSetFields[28] = true;
                return 0;
            case 29:
                this.request_videoflag = aVar2.d(intValue);
                this.hasSetFields[29] = true;
                return 0;
            case 30:
                this.predownload_ratio = aVar2.h(intValue);
                this.hasSetFields[30] = true;
                return 0;
            case 31:
                this.predownload_minsize = aVar2.i(intValue);
                this.hasSetFields[31] = true;
                return 0;
            case 32:
                this.is_hot_snsvideo = aVar2.c(intValue);
                this.hasSetFields[32] = true;
                return 0;
            case 33:
                this.videomode = aVar2.h(intValue);
                this.hasSetFields[33] = true;
                return 0;
            case 34:
                this.msg_extra = aVar2.d(intValue);
                this.hasSetFields[34] = true;
                return 0;
            case 35:
                this.is_hlsvideo = aVar2.c(intValue);
                this.hasSetFields[35] = true;
                return 0;
            case 36:
                this.hls_videoflag = aVar2.d(intValue);
                this.hasSetFields[36] = true;
                return 0;
            case 37:
                this.initial_decrypt_iv = aVar2.d(intValue);
                this.hasSetFields[37] = true;
                return 0;
            case 38:
                this.fileid = aVar2.d(intValue);
                this.hasSetFields[38] = true;
                return 0;
            case 39:
                this.bigfile_signture = aVar2.d(intValue);
                this.hasSetFields[39] = true;
                return 0;
            case 40:
                this.fakeBigfileSignature = aVar2.d(intValue);
                this.hasSetFields[40] = true;
                return 0;
            case 41:
                this.fakeBigfileSignatureAeskey = aVar2.d(intValue);
                this.hasSetFields[41] = true;
                return 0;
            case 42:
                this.isstoragemode = aVar2.c(intValue);
                this.hasSetFields[42] = true;
                return 0;
            case com.tencent.mm.opensdk.constants.ConstantsAPI.COMMAND_GETA8KEY /* 43 */:
                this.isautostart = aVar2.c(intValue);
                this.hasSetFields[43] = true;
                return 0;
            case 44:
                this.is_silent_task = aVar2.c(intValue);
                this.hasSetFields[44] = true;
                return 0;
            case 45:
                this.chattype = aVar2.h(intValue);
                this.hasSetFields[45] = true;
                return 0;
            case 46:
                this.blocksize = aVar2.h(intValue);
                this.hasSetFields[46] = true;
                return 0;
            case 47:
                this.expect_image_format = aVar2.h(intValue);
                this.hasSetFields[47] = true;
                return 0;
            case 48:
                this.max_retry_count = aVar2.h(intValue);
                this.hasSetFields[48] = true;
                return 0;
            case com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject.TYPE_OPENSDK_WEWORK_OBJECT /* 49 */:
                this.is_cold_snsdata = aVar2.c(intValue);
                this.hasSetFields[49] = true;
                return 0;
            case 50:
                this.url = aVar2.d(intValue);
                this.hasSetFields[50] = true;
                return 0;
            case 51:
                this.sns_scene = aVar2.d(intValue);
                this.hasSetFields[51] = true;
                return 0;
            case 52:
                this.sns_decrypt_key = aVar2.i(intValue);
                this.hasSetFields[52] = true;
                return 0;
            case 53:
                this.snsvideo_extradata = aVar2.d(intValue);
                this.hasSetFields[53] = true;
                return 0;
            case 54:
                this.msg_type_ = aVar2.h(intValue);
                this.hasSetFields[54] = true;
                return 0;
            case 55:
                this.feed_id_ = aVar2.d(intValue);
                this.hasSetFields[55] = true;
                return 0;
            case 56:
                this.feed_pic_count_ = aVar2.h(intValue);
                this.hasSetFields[56] = true;
                return 0;
            case com.tencent.mm.plugin.appbrand.jsapi.pay.y1.CTRL_INDEX /* 57 */:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    com.tencent.wechat.aff.IlinkC2CBatchSnsReqImageData ilinkC2CBatchSnsReqImageData = new com.tencent.wechat.aff.IlinkC2CBatchSnsReqImageData();
                    if (bArr != null && bArr.length > 0) {
                        ilinkC2CBatchSnsReqImageData.parseFrom(bArr);
                    }
                    this.batch_image_req_datas.add(ilinkC2CBatchSnsReqImageData);
                }
                this.hasSetFields[57] = true;
                return 0;
            case 58:
                this.referer = aVar2.d(intValue);
                this.hasSetFields[58] = true;
                return 0;
            case com.tencent.mm.plugin.appbrand.jsapi.k9.CTRL_INDEX /* 59 */:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    com.tencent.wechat.aff.IlinkC2CQuicTaskParams ilinkC2CQuicTaskParams3 = new com.tencent.wechat.aff.IlinkC2CQuicTaskParams();
                    if (bArr2 != null && bArr2.length > 0) {
                        ilinkC2CQuicTaskParams3.parseFrom(bArr2);
                    }
                    this.quic_task_params = ilinkC2CQuicTaskParams3;
                }
                this.hasSetFields[59] = true;
                return 0;
            case 60:
                this.task_start_time = aVar2.i(intValue);
                this.hasSetFields[60] = true;
                return 0;
            case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_TYPE_INITLIB /* 61 */:
                this.http_method = aVar2.d(intValue);
                this.hasSetFields[61] = true;
                return 0;
            case 62:
                this.use_newdns = aVar2.c(intValue);
                this.hasSetFields[62] = true;
                return 0;
            case 63:
                this.use_cronet = aVar2.c(intValue);
                this.hasSetFields[63] = true;
                return 0;
            case 64:
                this.certificate_policy = aVar2.h(intValue);
                this.hasSetFields[64] = true;
                return 0;
            case 65:
                this.host = aVar2.d(intValue);
                this.hasSetFields[65] = true;
                return 0;
            case 66:
                this.max_http_redirect_count = aVar2.h(intValue);
                this.hasSetFields[66] = true;
                return 0;
            case 67:
                this.bakup_url = aVar2.d(intValue);
                this.hasSetFields[67] = true;
                return 0;
            case 68:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    com.tencent.wechat.aff.IlinkC2CCdnKv ilinkC2CCdnKv = new com.tencent.wechat.aff.IlinkC2CCdnKv();
                    if (bArr3 != null && bArr3.length > 0) {
                        ilinkC2CCdnKv.parseFrom(bArr3);
                    }
                    this.verify_headers.add(ilinkC2CCdnKv);
                }
                this.hasSetFields[68] = true;
                return 0;
            case 69:
                this.pcdn_appid = aVar2.h(intValue);
                this.hasSetFields[69] = true;
                return 0;
            case 70:
                this.max_pcdn_connections = aVar2.h(intValue);
                this.hasSetFields[70] = true;
                return 0;
            case 71:
                this.backup_offset = aVar2.h(intValue);
                this.hasSetFields[71] = true;
                return 0;
            case 72:
                this.backup_length = aVar2.h(intValue);
                this.hasSetFields[72] = true;
                return 0;
            case com.tencent.mm.plugin.appbrand.jsapi.share.k.CTRL_INDEX /* 73 */:
                this.initial_offset = aVar2.i(intValue);
                this.hasSetFields[73] = true;
                return 0;
            case 74:
                this.initial_length = aVar2.i(intValue);
                this.hasSetFields[74] = true;
                return 0;
            case 75:
                this.group_key = aVar2.d(intValue);
                this.hasSetFields[75] = true;
                return 0;
            case com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
                this.group_capacity = aVar2.h(intValue);
                this.hasSetFields[76] = true;
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setAeskey(com.tencent.mm.protobuf.g gVar) {
        this.aeskey = gVar;
        this.hasSetFields[14] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setApptype(long j17) {
        this.apptype = j17;
        this.hasSetFields[16] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setArgInfo(com.tencent.mm.protobuf.g gVar) {
        this.arg_info = gVar;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setAuthkey(com.tencent.mm.protobuf.g gVar) {
        this.authkey = gVar;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setBackupLength(int i17) {
        this.backup_length = i17;
        this.hasSetFields[72] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setBackupOffset(int i17) {
        this.backup_offset = i17;
        this.hasSetFields[71] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setBakupUrl(com.tencent.mm.protobuf.g gVar) {
        this.bakup_url = gVar;
        this.hasSetFields[67] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setBatchImageReqDatas(java.util.LinkedList<com.tencent.wechat.aff.IlinkC2CBatchSnsReqImageData> linkedList) {
        this.batch_image_req_datas = linkedList;
        this.hasSetFields[57] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setBigfileSignture(com.tencent.mm.protobuf.g gVar) {
        this.bigfile_signture = gVar;
        this.hasSetFields[39] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setBizid(long j17) {
        this.bizid = j17;
        this.hasSetFields[17] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setBlocksize(int i17) {
        this.blocksize = i17;
        this.hasSetFields[46] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setCertificatePolicy(int i17) {
        this.certificate_policy = i17;
        this.hasSetFields[64] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setChatnum(long j17) {
        this.chatnum = j17;
        this.hasSetFields[24] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setChattype(int i17) {
        this.chattype = i17;
        this.hasSetFields[45] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setConcurrentCount(int i17) {
        this.concurrent_count = i17;
        this.hasSetFields[18] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setCustomRequestHeader(java.lang.String str) {
        this.custom_request_header = str;
        this.hasSetFields[20] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setDebugip(java.lang.String str) {
        this.debugip = str;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setDownloadBehavior(int i17) {
        this.download_behavior = i17;
        this.hasSetFields[22] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setExpectImageFormat(int i17) {
        this.expect_image_format = i17;
        this.hasSetFields[47] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setExpectedFilemd5(java.lang.String str) {
        this.expected_filemd5 = str;
        this.hasSetFields[10] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setExpectedFilesize(long j17) {
        this.expected_filesize = j17;
        this.hasSetFields[11] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setFakeBigfileSignature(com.tencent.mm.protobuf.g gVar) {
        this.fakeBigfileSignature = gVar;
        this.hasSetFields[40] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setFakeBigfileSignatureAeskey(com.tencent.mm.protobuf.g gVar) {
        this.fakeBigfileSignatureAeskey = gVar;
        this.hasSetFields[41] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setFeedId_(com.tencent.mm.protobuf.g gVar) {
        this.feed_id_ = gVar;
        this.hasSetFields[55] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setFeedPicCount_(int i17) {
        this.feed_pic_count_ = i17;
        this.hasSetFields[56] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setFileid(com.tencent.mm.protobuf.g gVar) {
        this.fileid = gVar;
        this.hasSetFields[38] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setFilekey(java.lang.String str) {
        this.filekey = str;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setFilesizeHint(long j17) {
        this.filesize_hint = j17;
        this.hasSetFields[21] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setFilesizeMax(long j17) {
        this.filesize_max = j17;
        this.hasSetFields[13] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setFiletype(long j17) {
        this.filetype = j17;
        this.hasSetFields[15] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setFlowtag(com.tencent.mm.protobuf.g gVar) {
        this.flowtag = gVar;
        this.hasSetFields[23] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setGroupCapacity(int i17) {
        this.group_capacity = i17;
        this.hasSetFields[76] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setGroupKey(com.tencent.mm.protobuf.g gVar) {
        this.group_key = gVar;
        this.hasSetFields[75] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setHlsVideoflag(com.tencent.mm.protobuf.g gVar) {
        this.hls_videoflag = gVar;
        this.hasSetFields[36] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setHost(com.tencent.mm.protobuf.g gVar) {
        this.host = gVar;
        this.hasSetFields[65] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setHttpMethod(com.tencent.mm.protobuf.g gVar) {
        this.http_method = gVar;
        this.hasSetFields[61] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setInitialDecryptIv(com.tencent.mm.protobuf.g gVar) {
        this.initial_decrypt_iv = gVar;
        this.hasSetFields[37] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setInitialLength(long j17) {
        this.initial_length = j17;
        this.hasSetFields[74] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setInitialOffset(long j17) {
        this.initial_offset = j17;
        this.hasSetFields[73] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setIsColdSnsdata(boolean z17) {
        this.is_cold_snsdata = z17;
        this.hasSetFields[49] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setIsHlsvideo(boolean z17) {
        this.is_hlsvideo = z17;
        this.hasSetFields[35] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setIsHotSnsvideo(boolean z17) {
        this.is_hot_snsvideo = z17;
        this.hasSetFields[32] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setIsSilentTask(boolean z17) {
        this.is_silent_task = z17;
        this.hasSetFields[44] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setIsautostart(boolean z17) {
        this.isautostart = z17;
        this.hasSetFields[43] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setIslargesvide(int i17) {
        this.islargesvide = i17;
        this.hasSetFields[26] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setIssmallvideo(boolean z17) {
        this.issmallvideo = z17;
        this.hasSetFields[25] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setIsstoragemode(boolean z17) {
        this.isstoragemode = z17;
        this.hasSetFields[42] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setMaxHttpRedirectCount(int i17) {
        this.max_http_redirect_count = i17;
        this.hasSetFields[66] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setMaxPcdnConnections(int i17) {
        this.max_pcdn_connections = i17;
        this.hasSetFields[70] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setMaxRetryCount(int i17) {
        this.max_retry_count = i17;
        this.hasSetFields[48] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setMsgExtra(com.tencent.mm.protobuf.g gVar) {
        this.msg_extra = gVar;
        this.hasSetFields[34] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setMsgType_(int i17) {
        this.msg_type_ = i17;
        this.hasSetFields[54] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setNeedreport(boolean z17) {
        this.needreport = z17;
        this.hasSetFields[5] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setPcdnAppid(int i17) {
        this.pcdn_appid = i17;
        this.hasSetFields[69] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setPredownloadMinsize(long j17) {
        this.predownload_minsize = j17;
        this.hasSetFields[31] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setPredownloadRatio(int i17) {
        this.predownload_ratio = i17;
        this.hasSetFields[30] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setQueueTimeoutSeconds(int i17) {
        this.queue_timeout_seconds = i17;
        this.hasSetFields[6] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setQuicTaskParams(com.tencent.wechat.aff.IlinkC2CQuicTaskParams ilinkC2CQuicTaskParams) {
        this.quic_task_params = ilinkC2CQuicTaskParams;
        this.hasSetFields[59] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setReferer(com.tencent.mm.protobuf.g gVar) {
        this.referer = gVar;
        this.hasSetFields[58] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setRequestVideoFormat(int i17) {
        this.request_video_format = i17;
        this.hasSetFields[27] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setRequestVideoflag(com.tencent.mm.protobuf.g gVar) {
        this.request_videoflag = gVar;
        this.hasSetFields[29] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setSavepath(java.lang.String str) {
        this.savepath = str;
        this.hasSetFields[12] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setSnsDecryptKey(long j17) {
        this.sns_decrypt_key = j17;
        this.hasSetFields[52] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setSnsScene(com.tencent.mm.protobuf.g gVar) {
        this.sns_scene = gVar;
        this.hasSetFields[51] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setSnsvideoExtradata(com.tencent.mm.protobuf.g gVar) {
        this.snsvideo_extradata = gVar;
        this.hasSetFields[53] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setStatefile(java.lang.String str) {
        this.statefile = str;
        this.hasSetFields[9] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setStatefileKeepHours(long j17) {
        this.statefile_keep_hours = j17;
        this.hasSetFields[8] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setTaskStartTime(long j17) {
        this.task_start_time = j17;
        this.hasSetFields[60] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setTransforTimeoutSeconds(int i17) {
        this.transfor_timeout_seconds = i17;
        this.hasSetFields[7] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setUrl(com.tencent.mm.protobuf.g gVar) {
        this.url = gVar;
        this.hasSetFields[50] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setUseCronet(boolean z17) {
        this.use_cronet = z17;
        this.hasSetFields[63] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setUseMultithread(boolean z17) {
        this.use_multithread = z17;
        this.hasSetFields[19] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setUseNewdns(boolean z17) {
        this.use_newdns = z17;
        this.hasSetFields[62] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setVerifyHeaders(java.util.LinkedList<com.tencent.wechat.aff.IlinkC2CCdnKv> linkedList) {
        this.verify_headers = linkedList;
        this.hasSetFields[68] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setVideoflagPolicy(int i17) {
        this.videoflag_policy = i17;
        this.hasSetFields[28] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin setVideomode(int i17) {
        this.videomode = i17;
        this.hasSetFields[33] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.IlinkC2CDownloadOrigin parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.IlinkC2CDownloadOrigin) super.parseFrom(bArr);
    }
}
