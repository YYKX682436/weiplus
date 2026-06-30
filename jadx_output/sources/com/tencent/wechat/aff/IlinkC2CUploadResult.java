package com.tencent.wechat.aff;

/* loaded from: classes8.dex */
public class IlinkC2CUploadResult extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.IlinkC2CUploadResult DEFAULT_INSTANCE = new com.tencent.wechat.aff.IlinkC2CUploadResult();
    private com.tencent.mm.protobuf.g aeskey;
    private int error_code;
    private long file_size;
    private java.lang.String file_url;
    private com.tencent.mm.protobuf.g fileid;
    private final boolean[] hasSetFields = new boolean[8];
    private java.lang.String task_ident;
    private java.lang.String thumb_url;

    public static com.tencent.wechat.aff.IlinkC2CUploadResult create() {
        return new com.tencent.wechat.aff.IlinkC2CUploadResult();
    }

    public static com.tencent.wechat.aff.IlinkC2CUploadResult getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.IlinkC2CUploadResult newBuilder() {
        return new com.tencent.wechat.aff.IlinkC2CUploadResult();
    }

    public com.tencent.wechat.aff.IlinkC2CUploadResult build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.IlinkC2CUploadResult)) {
            return false;
        }
        com.tencent.wechat.aff.IlinkC2CUploadResult ilinkC2CUploadResult = (com.tencent.wechat.aff.IlinkC2CUploadResult) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.error_code), java.lang.Integer.valueOf(ilinkC2CUploadResult.error_code)) && n51.f.a(this.task_ident, ilinkC2CUploadResult.task_ident) && n51.f.a(java.lang.Long.valueOf(this.file_size), java.lang.Long.valueOf(ilinkC2CUploadResult.file_size)) && n51.f.a(this.file_url, ilinkC2CUploadResult.file_url) && n51.f.a(this.thumb_url, ilinkC2CUploadResult.thumb_url) && n51.f.a(this.fileid, ilinkC2CUploadResult.fileid) && n51.f.a(this.aeskey, ilinkC2CUploadResult.aeskey);
    }

    public com.tencent.mm.protobuf.g getAeskey() {
        return this.hasSetFields[7] ? this.aeskey : com.tencent.mm.protobuf.g.f192155b;
    }

    public int getErrorCode() {
        return this.error_code;
    }

    public long getFileSize() {
        return this.file_size;
    }

    public java.lang.String getFileUrl() {
        return this.hasSetFields[4] ? this.file_url : "";
    }

    public com.tencent.mm.protobuf.g getFileid() {
        return this.hasSetFields[6] ? this.fileid : com.tencent.mm.protobuf.g.f192155b;
    }

    public java.lang.String getTaskIdent() {
        return this.hasSetFields[2] ? this.task_ident : "";
    }

    public java.lang.String getThumbUrl() {
        return this.hasSetFields[5] ? this.thumb_url : "";
    }

    public boolean hasAeskey() {
        return hasFieldNumber(7);
    }

    public boolean hasErrorCode() {
        return hasFieldNumber(1);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasFileSize() {
        return hasFieldNumber(3);
    }

    public boolean hasFileUrl() {
        return hasFieldNumber(4);
    }

    public boolean hasFileid() {
        return hasFieldNumber(6);
    }

    public boolean hasTaskIdent() {
        return hasFieldNumber(2);
    }

    public boolean hasThumbUrl() {
        return hasFieldNumber(5);
    }

    public com.tencent.wechat.aff.IlinkC2CUploadResult mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.IlinkC2CUploadResult();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.hasSetFields[1]) {
                fVar.e(1, this.error_code);
            }
            java.lang.String str = this.task_ident;
            if (str != null && this.hasSetFields[2]) {
                fVar.j(2, str);
            }
            if (this.hasSetFields[3]) {
                fVar.h(3, this.file_size);
            }
            java.lang.String str2 = this.file_url;
            if (str2 != null && this.hasSetFields[4]) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.thumb_url;
            if (str3 != null && this.hasSetFields[5]) {
                fVar.j(5, str3);
            }
            com.tencent.mm.protobuf.g gVar = this.fileid;
            if (gVar != null && this.hasSetFields[6]) {
                fVar.b(6, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.aeskey;
            if (gVar2 != null && this.hasSetFields[7]) {
                fVar.b(7, gVar2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.hasSetFields[1] ? 0 + b36.f.e(1, this.error_code) : 0;
            java.lang.String str4 = this.task_ident;
            if (str4 != null && this.hasSetFields[2]) {
                e17 += b36.f.j(2, str4);
            }
            if (this.hasSetFields[3]) {
                e17 += b36.f.h(3, this.file_size);
            }
            java.lang.String str5 = this.file_url;
            if (str5 != null && this.hasSetFields[4]) {
                e17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.thumb_url;
            if (str6 != null && this.hasSetFields[5]) {
                e17 += b36.f.j(5, str6);
            }
            com.tencent.mm.protobuf.g gVar3 = this.fileid;
            if (gVar3 != null && this.hasSetFields[6]) {
                e17 += b36.f.b(6, gVar3);
            }
            com.tencent.mm.protobuf.g gVar4 = this.aeskey;
            return (gVar4 == null || !this.hasSetFields[7]) ? e17 : e17 + b36.f.b(7, gVar4);
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
                this.error_code = aVar2.g(intValue);
                this.hasSetFields[1] = true;
                return 0;
            case 2:
                this.task_ident = aVar2.k(intValue);
                this.hasSetFields[2] = true;
                return 0;
            case 3:
                this.file_size = aVar2.i(intValue);
                this.hasSetFields[3] = true;
                return 0;
            case 4:
                this.file_url = aVar2.k(intValue);
                this.hasSetFields[4] = true;
                return 0;
            case 5:
                this.thumb_url = aVar2.k(intValue);
                this.hasSetFields[5] = true;
                return 0;
            case 6:
                this.fileid = aVar2.d(intValue);
                this.hasSetFields[6] = true;
                return 0;
            case 7:
                this.aeskey = aVar2.d(intValue);
                this.hasSetFields[7] = true;
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.wechat.aff.IlinkC2CUploadResult setAeskey(com.tencent.mm.protobuf.g gVar) {
        this.aeskey = gVar;
        this.hasSetFields[7] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CUploadResult setErrorCode(int i17) {
        this.error_code = i17;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CUploadResult setFileSize(long j17) {
        this.file_size = j17;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CUploadResult setFileUrl(java.lang.String str) {
        this.file_url = str;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CUploadResult setFileid(com.tencent.mm.protobuf.g gVar) {
        this.fileid = gVar;
        this.hasSetFields[6] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CUploadResult setTaskIdent(java.lang.String str) {
        this.task_ident = str;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CUploadResult setThumbUrl(java.lang.String str) {
        this.thumb_url = str;
        this.hasSetFields[5] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CUploadResult mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.IlinkC2CUploadResult parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.IlinkC2CUploadResult) super.parseFrom(bArr);
    }
}
