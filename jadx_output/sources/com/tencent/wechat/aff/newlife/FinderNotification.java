package com.tencent.wechat.aff.newlife;

/* loaded from: classes2.dex */
public class FinderNotification extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.newlife.FinderNotification DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.FinderNotification();
    public com.tencent.mm.protobuf.g ext_info;
    public com.tencent.mm.protobuf.g feed_jump_info;
    public int notification_type;
    public java.lang.String udf_kv_json;
    public java.lang.String title = "";
    public java.lang.String content = "";
    public int sub_type = 0;
    public java.lang.String link = "";
    public java.lang.String miniapp_name = "";

    public FinderNotification() {
        com.tencent.mm.protobuf.g gVar = com.tencent.mm.protobuf.g.f192155b;
        this.ext_info = gVar;
        this.udf_kv_json = "";
        this.feed_jump_info = gVar;
        this.notification_type = 0;
    }

    public static com.tencent.wechat.aff.newlife.FinderNotification create() {
        return new com.tencent.wechat.aff.newlife.FinderNotification();
    }

    public static com.tencent.wechat.aff.newlife.FinderNotification getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.newlife.FinderNotification newBuilder() {
        return new com.tencent.wechat.aff.newlife.FinderNotification();
    }

    public com.tencent.wechat.aff.newlife.FinderNotification build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.FinderNotification)) {
            return false;
        }
        com.tencent.wechat.aff.newlife.FinderNotification finderNotification = (com.tencent.wechat.aff.newlife.FinderNotification) fVar;
        return n51.f.a(this.title, finderNotification.title) && n51.f.a(this.content, finderNotification.content) && n51.f.a(java.lang.Integer.valueOf(this.sub_type), java.lang.Integer.valueOf(finderNotification.sub_type)) && n51.f.a(this.link, finderNotification.link) && n51.f.a(this.miniapp_name, finderNotification.miniapp_name) && n51.f.a(this.ext_info, finderNotification.ext_info) && n51.f.a(this.udf_kv_json, finderNotification.udf_kv_json) && n51.f.a(this.feed_jump_info, finderNotification.feed_jump_info) && n51.f.a(java.lang.Integer.valueOf(this.notification_type), java.lang.Integer.valueOf(finderNotification.notification_type));
    }

    public java.lang.String getContent() {
        return this.content;
    }

    public com.tencent.mm.protobuf.g getExtInfo() {
        return this.ext_info;
    }

    public com.tencent.mm.protobuf.g getExt_info() {
        return this.ext_info;
    }

    public com.tencent.mm.protobuf.g getFeedJumpInfo() {
        return this.feed_jump_info;
    }

    public com.tencent.mm.protobuf.g getFeed_jump_info() {
        return this.feed_jump_info;
    }

    public java.lang.String getLink() {
        return this.link;
    }

    public java.lang.String getMiniappName() {
        return this.miniapp_name;
    }

    public java.lang.String getMiniapp_name() {
        return this.miniapp_name;
    }

    public int getNotificationType() {
        return this.notification_type;
    }

    public int getNotification_type() {
        return this.notification_type;
    }

    public int getSubType() {
        return this.sub_type;
    }

    public int getSub_type() {
        return this.sub_type;
    }

    public java.lang.String getTitle() {
        return this.title;
    }

    public java.lang.String getUdfKvJson() {
        return this.udf_kv_json;
    }

    public java.lang.String getUdf_kv_json() {
        return this.udf_kv_json;
    }

    public com.tencent.wechat.aff.newlife.FinderNotification mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.newlife.FinderNotification();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.title;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.content;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.sub_type);
            java.lang.String str3 = this.link;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.miniapp_name;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            com.tencent.mm.protobuf.g gVar = this.ext_info;
            if (gVar != null) {
                fVar.b(6, gVar);
            }
            java.lang.String str5 = this.udf_kv_json;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            com.tencent.mm.protobuf.g gVar2 = this.feed_jump_info;
            if (gVar2 != null) {
                fVar.b(8, gVar2);
            }
            fVar.e(9, this.notification_type);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.title;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.content;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            int e17 = j17 + b36.f.e(3, this.sub_type);
            java.lang.String str8 = this.link;
            if (str8 != null) {
                e17 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.miniapp_name;
            if (str9 != null) {
                e17 += b36.f.j(5, str9);
            }
            com.tencent.mm.protobuf.g gVar3 = this.ext_info;
            if (gVar3 != null) {
                e17 += b36.f.b(6, gVar3);
            }
            java.lang.String str10 = this.udf_kv_json;
            if (str10 != null) {
                e17 += b36.f.j(7, str10);
            }
            com.tencent.mm.protobuf.g gVar4 = this.feed_jump_info;
            if (gVar4 != null) {
                e17 += b36.f.b(8, gVar4);
            }
            return e17 + b36.f.e(9, this.notification_type);
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
                this.title = aVar2.k(intValue);
                return 0;
            case 2:
                this.content = aVar2.k(intValue);
                return 0;
            case 3:
                this.sub_type = aVar2.g(intValue);
                return 0;
            case 4:
                this.link = aVar2.k(intValue);
                return 0;
            case 5:
                this.miniapp_name = aVar2.k(intValue);
                return 0;
            case 6:
                this.ext_info = aVar2.d(intValue);
                return 0;
            case 7:
                this.udf_kv_json = aVar2.k(intValue);
                return 0;
            case 8:
                this.feed_jump_info = aVar2.d(intValue);
                return 0;
            case 9:
                this.notification_type = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.wechat.aff.newlife.FinderNotification setContent(java.lang.String str) {
        this.content = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderNotification setExtInfo(com.tencent.mm.protobuf.g gVar) {
        this.ext_info = gVar;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderNotification setExt_info(com.tencent.mm.protobuf.g gVar) {
        this.ext_info = gVar;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderNotification setFeedJumpInfo(com.tencent.mm.protobuf.g gVar) {
        this.feed_jump_info = gVar;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderNotification setFeed_jump_info(com.tencent.mm.protobuf.g gVar) {
        this.feed_jump_info = gVar;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderNotification setLink(java.lang.String str) {
        this.link = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderNotification setMiniappName(java.lang.String str) {
        this.miniapp_name = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderNotification setMiniapp_name(java.lang.String str) {
        this.miniapp_name = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderNotification setNotificationType(int i17) {
        this.notification_type = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderNotification setNotification_type(int i17) {
        this.notification_type = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderNotification setSubType(int i17) {
        this.sub_type = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderNotification setSub_type(int i17) {
        this.sub_type = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderNotification setTitle(java.lang.String str) {
        this.title = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderNotification setUdfKvJson(java.lang.String str) {
        this.udf_kv_json = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderNotification setUdf_kv_json(java.lang.String str) {
        this.udf_kv_json = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderNotification mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.newlife.FinderNotification parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.newlife.FinderNotification) super.parseFrom(bArr);
    }
}
