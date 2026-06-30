package com.tencent.wechat.aff;

/* loaded from: classes8.dex */
public class IlinkC2CUpload extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.IlinkC2CUpload DEFAULT_INSTANCE = new com.tencent.wechat.aff.IlinkC2CUpload();
    private int app_type;
    private com.tencent.wechat.aff.IlinkEBizScene biz_scene;
    private java.lang.String debugip;
    private com.tencent.mm.protobuf.g file_data;
    private java.lang.String file_path;
    private int file_type;
    private final boolean[] hasSetFields = new boolean[13];
    private boolean is_storage_mode;
    private boolean need_report;
    private int sns_upload_version;
    private java.lang.String task_ident;
    private com.tencent.mm.protobuf.g thumb_filedata;
    private java.lang.String thumb_filepath;

    public static com.tencent.wechat.aff.IlinkC2CUpload create() {
        return new com.tencent.wechat.aff.IlinkC2CUpload();
    }

    public static com.tencent.wechat.aff.IlinkC2CUpload getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.IlinkC2CUpload newBuilder() {
        return new com.tencent.wechat.aff.IlinkC2CUpload();
    }

    public com.tencent.wechat.aff.IlinkC2CUpload build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.IlinkC2CUpload)) {
            return false;
        }
        com.tencent.wechat.aff.IlinkC2CUpload ilinkC2CUpload = (com.tencent.wechat.aff.IlinkC2CUpload) fVar;
        return n51.f.a(this.task_ident, ilinkC2CUpload.task_ident) && n51.f.a(java.lang.Integer.valueOf(this.file_type), java.lang.Integer.valueOf(ilinkC2CUpload.file_type)) && n51.f.a(this.file_path, ilinkC2CUpload.file_path) && n51.f.a(this.thumb_filepath, ilinkC2CUpload.thumb_filepath) && n51.f.a(this.biz_scene, ilinkC2CUpload.biz_scene) && n51.f.a(java.lang.Integer.valueOf(this.app_type), java.lang.Integer.valueOf(ilinkC2CUpload.app_type)) && n51.f.a(java.lang.Boolean.valueOf(this.is_storage_mode), java.lang.Boolean.valueOf(ilinkC2CUpload.is_storage_mode)) && n51.f.a(java.lang.Integer.valueOf(this.sns_upload_version), java.lang.Integer.valueOf(ilinkC2CUpload.sns_upload_version)) && n51.f.a(this.file_data, ilinkC2CUpload.file_data) && n51.f.a(this.thumb_filedata, ilinkC2CUpload.thumb_filedata) && n51.f.a(this.debugip, ilinkC2CUpload.debugip) && n51.f.a(java.lang.Boolean.valueOf(this.need_report), java.lang.Boolean.valueOf(ilinkC2CUpload.need_report));
    }

    public int getAppType() {
        return this.app_type;
    }

    public com.tencent.wechat.aff.IlinkEBizScene getBizScene() {
        return this.hasSetFields[5] ? this.biz_scene : com.tencent.wechat.aff.IlinkEBizScene.kC2CScene;
    }

    public java.lang.String getDebugip() {
        return this.hasSetFields[11] ? this.debugip : "";
    }

    public com.tencent.mm.protobuf.g getFileData() {
        return this.hasSetFields[9] ? this.file_data : com.tencent.mm.protobuf.g.f192155b;
    }

    public java.lang.String getFilePath() {
        return this.hasSetFields[3] ? this.file_path : "";
    }

    public int getFileType() {
        return this.file_type;
    }

    public boolean getIsStorageMode() {
        return this.is_storage_mode;
    }

    public boolean getNeedReport() {
        return this.need_report;
    }

    public int getSnsUploadVersion() {
        return this.sns_upload_version;
    }

    public java.lang.String getTaskIdent() {
        return this.hasSetFields[1] ? this.task_ident : "";
    }

    public com.tencent.mm.protobuf.g getThumbFiledata() {
        return this.hasSetFields[10] ? this.thumb_filedata : com.tencent.mm.protobuf.g.f192155b;
    }

    public java.lang.String getThumbFilepath() {
        return this.hasSetFields[4] ? this.thumb_filepath : "";
    }

    public boolean hasAppType() {
        return hasFieldNumber(6);
    }

    public boolean hasBizScene() {
        return hasFieldNumber(5);
    }

    public boolean hasDebugip() {
        return hasFieldNumber(11);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasFileData() {
        return hasFieldNumber(9);
    }

    public boolean hasFilePath() {
        return hasFieldNumber(3);
    }

    public boolean hasFileType() {
        return hasFieldNumber(2);
    }

    public boolean hasIsStorageMode() {
        return hasFieldNumber(7);
    }

    public boolean hasNeedReport() {
        return hasFieldNumber(12);
    }

    public boolean hasSnsUploadVersion() {
        return hasFieldNumber(8);
    }

    public boolean hasTaskIdent() {
        return hasFieldNumber(1);
    }

    public boolean hasThumbFiledata() {
        return hasFieldNumber(10);
    }

    public boolean hasThumbFilepath() {
        return hasFieldNumber(4);
    }

    public com.tencent.wechat.aff.IlinkC2CUpload mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.IlinkC2CUpload();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.task_ident;
            if (str != null && this.hasSetFields[1]) {
                fVar.j(1, str);
            }
            if (this.hasSetFields[2]) {
                fVar.e(2, this.file_type);
            }
            java.lang.String str2 = this.file_path;
            if (str2 != null && this.hasSetFields[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.thumb_filepath;
            if (str3 != null && this.hasSetFields[4]) {
                fVar.j(4, str3);
            }
            com.tencent.wechat.aff.IlinkEBizScene ilinkEBizScene = this.biz_scene;
            if (ilinkEBizScene != null && this.hasSetFields[5]) {
                fVar.e(5, ilinkEBizScene.value);
            }
            if (this.hasSetFields[6]) {
                fVar.e(6, this.app_type);
            }
            if (this.hasSetFields[7]) {
                fVar.a(7, this.is_storage_mode);
            }
            if (this.hasSetFields[8]) {
                fVar.e(8, this.sns_upload_version);
            }
            com.tencent.mm.protobuf.g gVar = this.file_data;
            if (gVar != null && this.hasSetFields[9]) {
                fVar.b(9, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.thumb_filedata;
            if (gVar2 != null && this.hasSetFields[10]) {
                fVar.b(10, gVar2);
            }
            java.lang.String str4 = this.debugip;
            if (str4 != null && this.hasSetFields[11]) {
                fVar.j(11, str4);
            }
            if (!this.hasSetFields[12]) {
                return 0;
            }
            fVar.a(12, this.need_report);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.task_ident;
            int j17 = (str5 == null || !this.hasSetFields[1]) ? 0 : 0 + b36.f.j(1, str5);
            if (this.hasSetFields[2]) {
                j17 += b36.f.e(2, this.file_type);
            }
            java.lang.String str6 = this.file_path;
            if (str6 != null && this.hasSetFields[3]) {
                j17 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.thumb_filepath;
            if (str7 != null && this.hasSetFields[4]) {
                j17 += b36.f.j(4, str7);
            }
            com.tencent.wechat.aff.IlinkEBizScene ilinkEBizScene2 = this.biz_scene;
            if (ilinkEBizScene2 != null && this.hasSetFields[5]) {
                j17 += b36.f.e(5, ilinkEBizScene2.value);
            }
            if (this.hasSetFields[6]) {
                j17 += b36.f.e(6, this.app_type);
            }
            if (this.hasSetFields[7]) {
                j17 += b36.f.a(7, this.is_storage_mode);
            }
            if (this.hasSetFields[8]) {
                j17 += b36.f.e(8, this.sns_upload_version);
            }
            com.tencent.mm.protobuf.g gVar3 = this.file_data;
            if (gVar3 != null && this.hasSetFields[9]) {
                j17 += b36.f.b(9, gVar3);
            }
            com.tencent.mm.protobuf.g gVar4 = this.thumb_filedata;
            if (gVar4 != null && this.hasSetFields[10]) {
                j17 += b36.f.b(10, gVar4);
            }
            java.lang.String str8 = this.debugip;
            if (str8 != null && this.hasSetFields[11]) {
                j17 += b36.f.j(11, str8);
            }
            return this.hasSetFields[12] ? j17 + b36.f.a(12, this.need_report) : j17;
        }
        if (i17 == 2) {
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
                this.task_ident = aVar2.k(intValue);
                this.hasSetFields[1] = true;
                return 0;
            case 2:
                this.file_type = aVar2.g(intValue);
                this.hasSetFields[2] = true;
                return 0;
            case 3:
                this.file_path = aVar2.k(intValue);
                this.hasSetFields[3] = true;
                return 0;
            case 4:
                this.thumb_filepath = aVar2.k(intValue);
                this.hasSetFields[4] = true;
                return 0;
            case 5:
                this.biz_scene = com.tencent.wechat.aff.IlinkEBizScene.forNumber(aVar2.g(intValue));
                this.hasSetFields[5] = true;
                return 0;
            case 6:
                this.app_type = aVar2.g(intValue);
                this.hasSetFields[6] = true;
                return 0;
            case 7:
                this.is_storage_mode = aVar2.c(intValue);
                this.hasSetFields[7] = true;
                return 0;
            case 8:
                this.sns_upload_version = aVar2.g(intValue);
                this.hasSetFields[8] = true;
                return 0;
            case 9:
                this.file_data = aVar2.d(intValue);
                this.hasSetFields[9] = true;
                return 0;
            case 10:
                this.thumb_filedata = aVar2.d(intValue);
                this.hasSetFields[10] = true;
                return 0;
            case 11:
                this.debugip = aVar2.k(intValue);
                this.hasSetFields[11] = true;
                return 0;
            case 12:
                this.need_report = aVar2.c(intValue);
                this.hasSetFields[12] = true;
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.wechat.aff.IlinkC2CUpload setAppType(int i17) {
        this.app_type = i17;
        this.hasSetFields[6] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CUpload setBizScene(com.tencent.wechat.aff.IlinkEBizScene ilinkEBizScene) {
        this.biz_scene = ilinkEBizScene;
        this.hasSetFields[5] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CUpload setDebugip(java.lang.String str) {
        this.debugip = str;
        this.hasSetFields[11] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CUpload setFileData(com.tencent.mm.protobuf.g gVar) {
        this.file_data = gVar;
        this.hasSetFields[9] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CUpload setFilePath(java.lang.String str) {
        this.file_path = str;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CUpload setFileType(int i17) {
        this.file_type = i17;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CUpload setIsStorageMode(boolean z17) {
        this.is_storage_mode = z17;
        this.hasSetFields[7] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CUpload setNeedReport(boolean z17) {
        this.need_report = z17;
        this.hasSetFields[12] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CUpload setSnsUploadVersion(int i17) {
        this.sns_upload_version = i17;
        this.hasSetFields[8] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CUpload setTaskIdent(java.lang.String str) {
        this.task_ident = str;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CUpload setThumbFiledata(com.tencent.mm.protobuf.g gVar) {
        this.thumb_filedata = gVar;
        this.hasSetFields[10] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CUpload setThumbFilepath(java.lang.String str) {
        this.thumb_filepath = str;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CUpload mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.IlinkC2CUpload parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.IlinkC2CUpload) super.parseFrom(bArr);
    }
}
