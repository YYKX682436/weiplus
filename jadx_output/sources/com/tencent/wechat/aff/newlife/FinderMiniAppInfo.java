package com.tencent.wechat.aff.newlife;

/* loaded from: classes4.dex */
public class FinderMiniAppInfo extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.newlife.FinderMiniAppInfo DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.FinderMiniAppInfo();
    public java.lang.String app_id = "";
    public java.lang.String path = "";
    public java.lang.String nick_name = "";
    public java.lang.String icon_url = "";

    public static com.tencent.wechat.aff.newlife.FinderMiniAppInfo create() {
        return new com.tencent.wechat.aff.newlife.FinderMiniAppInfo();
    }

    public static com.tencent.wechat.aff.newlife.FinderMiniAppInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.newlife.FinderMiniAppInfo newBuilder() {
        return new com.tencent.wechat.aff.newlife.FinderMiniAppInfo();
    }

    public com.tencent.wechat.aff.newlife.FinderMiniAppInfo build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.FinderMiniAppInfo)) {
            return false;
        }
        com.tencent.wechat.aff.newlife.FinderMiniAppInfo finderMiniAppInfo = (com.tencent.wechat.aff.newlife.FinderMiniAppInfo) fVar;
        return n51.f.a(this.app_id, finderMiniAppInfo.app_id) && n51.f.a(this.path, finderMiniAppInfo.path) && n51.f.a(this.nick_name, finderMiniAppInfo.nick_name) && n51.f.a(this.icon_url, finderMiniAppInfo.icon_url);
    }

    public java.lang.String getAppId() {
        return this.app_id;
    }

    public java.lang.String getApp_id() {
        return this.app_id;
    }

    public java.lang.String getIconUrl() {
        return this.icon_url;
    }

    public java.lang.String getIcon_url() {
        return this.icon_url;
    }

    public java.lang.String getNickName() {
        return this.nick_name;
    }

    public java.lang.String getNick_name() {
        return this.nick_name;
    }

    public java.lang.String getPath() {
        return this.path;
    }

    public com.tencent.wechat.aff.newlife.FinderMiniAppInfo mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.newlife.FinderMiniAppInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.app_id;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.path;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.nick_name;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.icon_url;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.app_id;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.path;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.nick_name;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.icon_url;
            return str8 != null ? j17 + b36.f.j(4, str8) : j17;
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
        if (intValue == 1) {
            this.app_id = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.path = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            this.nick_name = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.icon_url = aVar2.k(intValue);
        return 0;
    }

    public com.tencent.wechat.aff.newlife.FinderMiniAppInfo setAppId(java.lang.String str) {
        this.app_id = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderMiniAppInfo setApp_id(java.lang.String str) {
        this.app_id = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderMiniAppInfo setIconUrl(java.lang.String str) {
        this.icon_url = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderMiniAppInfo setIcon_url(java.lang.String str) {
        this.icon_url = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderMiniAppInfo setNickName(java.lang.String str) {
        this.nick_name = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderMiniAppInfo setNick_name(java.lang.String str) {
        this.nick_name = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderMiniAppInfo setPath(java.lang.String str) {
        this.path = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderMiniAppInfo mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.newlife.FinderMiniAppInfo parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.newlife.FinderMiniAppInfo) super.parseFrom(bArr);
    }
}
