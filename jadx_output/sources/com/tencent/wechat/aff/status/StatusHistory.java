package com.tencent.wechat.aff.status;

/* loaded from: classes2.dex */
public class StatusHistory extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.status.StatusHistory DEFAULT_INSTANCE = new com.tencent.wechat.aff.status.StatusHistory();
    public java.lang.String text_status_id = "";
    public java.lang.String topic_id = "";
    public java.lang.String ext_info = "";
    public int liked_count = 0;
    public int create_time = 0;
    public int referenced_count = 0;
    public long key = 0;
    public int comment_count = 0;

    public static com.tencent.wechat.aff.status.StatusHistory create() {
        return new com.tencent.wechat.aff.status.StatusHistory();
    }

    public static com.tencent.wechat.aff.status.StatusHistory getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.status.StatusHistory newBuilder() {
        return new com.tencent.wechat.aff.status.StatusHistory();
    }

    public com.tencent.wechat.aff.status.StatusHistory build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.status.StatusHistory)) {
            return false;
        }
        com.tencent.wechat.aff.status.StatusHistory statusHistory = (com.tencent.wechat.aff.status.StatusHistory) fVar;
        return n51.f.a(this.text_status_id, statusHistory.text_status_id) && n51.f.a(this.topic_id, statusHistory.topic_id) && n51.f.a(this.ext_info, statusHistory.ext_info) && n51.f.a(java.lang.Integer.valueOf(this.liked_count), java.lang.Integer.valueOf(statusHistory.liked_count)) && n51.f.a(java.lang.Integer.valueOf(this.create_time), java.lang.Integer.valueOf(statusHistory.create_time)) && n51.f.a(java.lang.Integer.valueOf(this.referenced_count), java.lang.Integer.valueOf(statusHistory.referenced_count)) && n51.f.a(java.lang.Long.valueOf(this.key), java.lang.Long.valueOf(statusHistory.key)) && n51.f.a(java.lang.Integer.valueOf(this.comment_count), java.lang.Integer.valueOf(statusHistory.comment_count));
    }

    public int getCommentCount() {
        return this.comment_count;
    }

    public int getComment_count() {
        return this.comment_count;
    }

    public int getCreateTime() {
        return this.create_time;
    }

    public int getCreate_time() {
        return this.create_time;
    }

    public java.lang.String getExtInfo() {
        return this.ext_info;
    }

    public java.lang.String getExt_info() {
        return this.ext_info;
    }

    public long getKey() {
        return this.key;
    }

    public int getLikedCount() {
        return this.liked_count;
    }

    public int getLiked_count() {
        return this.liked_count;
    }

    public int getReferencedCount() {
        return this.referenced_count;
    }

    public int getReferenced_count() {
        return this.referenced_count;
    }

    public java.lang.String getTextStatusId() {
        return this.text_status_id;
    }

    public java.lang.String getText_status_id() {
        return this.text_status_id;
    }

    public java.lang.String getTopicId() {
        return this.topic_id;
    }

    public java.lang.String getTopic_id() {
        return this.topic_id;
    }

    public com.tencent.wechat.aff.status.StatusHistory mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.status.StatusHistory();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.text_status_id;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.topic_id;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.ext_info;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.liked_count);
            fVar.e(5, this.create_time);
            fVar.e(6, this.referenced_count);
            fVar.h(7, this.key);
            fVar.e(8, this.comment_count);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.text_status_id;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.topic_id;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.ext_info;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            return j17 + b36.f.e(4, this.liked_count) + b36.f.e(5, this.create_time) + b36.f.e(6, this.referenced_count) + b36.f.h(7, this.key) + b36.f.e(8, this.comment_count);
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
                this.text_status_id = aVar2.k(intValue);
                return 0;
            case 2:
                this.topic_id = aVar2.k(intValue);
                return 0;
            case 3:
                this.ext_info = aVar2.k(intValue);
                return 0;
            case 4:
                this.liked_count = aVar2.g(intValue);
                return 0;
            case 5:
                this.create_time = aVar2.g(intValue);
                return 0;
            case 6:
                this.referenced_count = aVar2.g(intValue);
                return 0;
            case 7:
                this.key = aVar2.i(intValue);
                return 0;
            case 8:
                this.comment_count = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.wechat.aff.status.StatusHistory setCommentCount(int i17) {
        this.comment_count = i17;
        return this;
    }

    public com.tencent.wechat.aff.status.StatusHistory setComment_count(int i17) {
        this.comment_count = i17;
        return this;
    }

    public com.tencent.wechat.aff.status.StatusHistory setCreateTime(int i17) {
        this.create_time = i17;
        return this;
    }

    public com.tencent.wechat.aff.status.StatusHistory setCreate_time(int i17) {
        this.create_time = i17;
        return this;
    }

    public com.tencent.wechat.aff.status.StatusHistory setExtInfo(java.lang.String str) {
        this.ext_info = str;
        return this;
    }

    public com.tencent.wechat.aff.status.StatusHistory setExt_info(java.lang.String str) {
        this.ext_info = str;
        return this;
    }

    public com.tencent.wechat.aff.status.StatusHistory setKey(long j17) {
        this.key = j17;
        return this;
    }

    public com.tencent.wechat.aff.status.StatusHistory setLikedCount(int i17) {
        this.liked_count = i17;
        return this;
    }

    public com.tencent.wechat.aff.status.StatusHistory setLiked_count(int i17) {
        this.liked_count = i17;
        return this;
    }

    public com.tencent.wechat.aff.status.StatusHistory setReferencedCount(int i17) {
        this.referenced_count = i17;
        return this;
    }

    public com.tencent.wechat.aff.status.StatusHistory setReferenced_count(int i17) {
        this.referenced_count = i17;
        return this;
    }

    public com.tencent.wechat.aff.status.StatusHistory setTextStatusId(java.lang.String str) {
        this.text_status_id = str;
        return this;
    }

    public com.tencent.wechat.aff.status.StatusHistory setText_status_id(java.lang.String str) {
        this.text_status_id = str;
        return this;
    }

    public com.tencent.wechat.aff.status.StatusHistory setTopicId(java.lang.String str) {
        this.topic_id = str;
        return this;
    }

    public com.tencent.wechat.aff.status.StatusHistory setTopic_id(java.lang.String str) {
        this.topic_id = str;
        return this;
    }

    public com.tencent.wechat.aff.status.StatusHistory mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.status.StatusHistory parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.status.StatusHistory) super.parseFrom(bArr);
    }
}
