package com.tencent.wechat.aff.status;

/* loaded from: classes10.dex */
public class PStatusMedia extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.status.PStatusMedia DEFAULT_INSTANCE = new com.tencent.wechat.aff.status.PStatusMedia();
    public java.lang.String media_name = "";
    public int media_type = 0;
    public java.lang.String media_url = "";
    public java.lang.String media_aes_key = "";
    public java.lang.String media_thumb_url = "";
    public java.lang.String media_thumb_aes_key = "";
    public long media_duration_ms = 0;

    public static com.tencent.wechat.aff.status.PStatusMedia create() {
        return new com.tencent.wechat.aff.status.PStatusMedia();
    }

    public static com.tencent.wechat.aff.status.PStatusMedia getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.status.PStatusMedia newBuilder() {
        return new com.tencent.wechat.aff.status.PStatusMedia();
    }

    public com.tencent.wechat.aff.status.PStatusMedia build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.status.PStatusMedia)) {
            return false;
        }
        com.tencent.wechat.aff.status.PStatusMedia pStatusMedia = (com.tencent.wechat.aff.status.PStatusMedia) fVar;
        return n51.f.a(this.media_name, pStatusMedia.media_name) && n51.f.a(java.lang.Integer.valueOf(this.media_type), java.lang.Integer.valueOf(pStatusMedia.media_type)) && n51.f.a(this.media_url, pStatusMedia.media_url) && n51.f.a(this.media_aes_key, pStatusMedia.media_aes_key) && n51.f.a(this.media_thumb_url, pStatusMedia.media_thumb_url) && n51.f.a(this.media_thumb_aes_key, pStatusMedia.media_thumb_aes_key) && n51.f.a(java.lang.Long.valueOf(this.media_duration_ms), java.lang.Long.valueOf(pStatusMedia.media_duration_ms));
    }

    public java.lang.String getMediaAesKey() {
        return this.media_aes_key;
    }

    public long getMediaDurationMs() {
        return this.media_duration_ms;
    }

    public java.lang.String getMediaName() {
        return this.media_name;
    }

    public java.lang.String getMediaThumbAesKey() {
        return this.media_thumb_aes_key;
    }

    public java.lang.String getMediaThumbUrl() {
        return this.media_thumb_url;
    }

    public int getMediaType() {
        return this.media_type;
    }

    public java.lang.String getMediaUrl() {
        return this.media_url;
    }

    public java.lang.String getMedia_aes_key() {
        return this.media_aes_key;
    }

    public long getMedia_duration_ms() {
        return this.media_duration_ms;
    }

    public java.lang.String getMedia_name() {
        return this.media_name;
    }

    public java.lang.String getMedia_thumb_aes_key() {
        return this.media_thumb_aes_key;
    }

    public java.lang.String getMedia_thumb_url() {
        return this.media_thumb_url;
    }

    public int getMedia_type() {
        return this.media_type;
    }

    public java.lang.String getMedia_url() {
        return this.media_url;
    }

    public com.tencent.wechat.aff.status.PStatusMedia mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.status.PStatusMedia();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.media_name;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.media_type);
            java.lang.String str2 = this.media_url;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.media_aes_key;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.media_thumb_url;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.media_thumb_aes_key;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            fVar.h(7, this.media_duration_ms);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.media_name;
            int j17 = (str6 != null ? 0 + b36.f.j(1, str6) : 0) + b36.f.e(2, this.media_type);
            java.lang.String str7 = this.media_url;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.media_aes_key;
            if (str8 != null) {
                j17 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.media_thumb_url;
            if (str9 != null) {
                j17 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.media_thumb_aes_key;
            if (str10 != null) {
                j17 += b36.f.j(6, str10);
            }
            return j17 + b36.f.h(7, this.media_duration_ms);
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
                this.media_name = aVar2.k(intValue);
                return 0;
            case 2:
                this.media_type = aVar2.g(intValue);
                return 0;
            case 3:
                this.media_url = aVar2.k(intValue);
                return 0;
            case 4:
                this.media_aes_key = aVar2.k(intValue);
                return 0;
            case 5:
                this.media_thumb_url = aVar2.k(intValue);
                return 0;
            case 6:
                this.media_thumb_aes_key = aVar2.k(intValue);
                return 0;
            case 7:
                this.media_duration_ms = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.wechat.aff.status.PStatusMedia setMediaAesKey(java.lang.String str) {
        this.media_aes_key = str;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusMedia setMediaDurationMs(long j17) {
        this.media_duration_ms = j17;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusMedia setMediaName(java.lang.String str) {
        this.media_name = str;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusMedia setMediaThumbAesKey(java.lang.String str) {
        this.media_thumb_aes_key = str;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusMedia setMediaThumbUrl(java.lang.String str) {
        this.media_thumb_url = str;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusMedia setMediaType(int i17) {
        this.media_type = i17;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusMedia setMediaUrl(java.lang.String str) {
        this.media_url = str;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusMedia setMedia_aes_key(java.lang.String str) {
        this.media_aes_key = str;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusMedia setMedia_duration_ms(long j17) {
        this.media_duration_ms = j17;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusMedia setMedia_name(java.lang.String str) {
        this.media_name = str;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusMedia setMedia_thumb_aes_key(java.lang.String str) {
        this.media_thumb_aes_key = str;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusMedia setMedia_thumb_url(java.lang.String str) {
        this.media_thumb_url = str;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusMedia setMedia_type(int i17) {
        this.media_type = i17;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusMedia setMedia_url(java.lang.String str) {
        this.media_url = str;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusMedia mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.status.PStatusMedia parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.status.PStatusMedia) super.parseFrom(bArr);
    }
}
