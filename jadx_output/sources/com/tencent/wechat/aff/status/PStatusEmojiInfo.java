package com.tencent.wechat.aff.status;

/* loaded from: classes10.dex */
public class PStatusEmojiInfo extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.status.PStatusEmojiInfo DEFAULT_INSTANCE = new com.tencent.wechat.aff.status.PStatusEmojiInfo();
    public java.lang.String Md5 = "";
    public java.lang.String Url = "";
    public java.lang.String ThumbUrl = "";
    public java.lang.String DesignerID = "";
    public java.lang.String EncryptUrl = "";
    public java.lang.String AesKey = "";
    public java.lang.String ProductID = "";
    public java.lang.String ExternUrl = "";
    public java.lang.String ExternMd5 = "";
    public java.lang.String ActivityID = "";
    public java.lang.String AttachedText = "";
    public java.lang.String AttachedTextColor = "";
    public java.lang.String LensId = "";
    public java.lang.String EmojiAttr = "";

    public static com.tencent.wechat.aff.status.PStatusEmojiInfo create() {
        return new com.tencent.wechat.aff.status.PStatusEmojiInfo();
    }

    public static com.tencent.wechat.aff.status.PStatusEmojiInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.status.PStatusEmojiInfo newBuilder() {
        return new com.tencent.wechat.aff.status.PStatusEmojiInfo();
    }

    public com.tencent.wechat.aff.status.PStatusEmojiInfo build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.status.PStatusEmojiInfo)) {
            return false;
        }
        com.tencent.wechat.aff.status.PStatusEmojiInfo pStatusEmojiInfo = (com.tencent.wechat.aff.status.PStatusEmojiInfo) fVar;
        return n51.f.a(this.Md5, pStatusEmojiInfo.Md5) && n51.f.a(this.Url, pStatusEmojiInfo.Url) && n51.f.a(this.ThumbUrl, pStatusEmojiInfo.ThumbUrl) && n51.f.a(this.DesignerID, pStatusEmojiInfo.DesignerID) && n51.f.a(this.EncryptUrl, pStatusEmojiInfo.EncryptUrl) && n51.f.a(this.AesKey, pStatusEmojiInfo.AesKey) && n51.f.a(this.ProductID, pStatusEmojiInfo.ProductID) && n51.f.a(this.ExternUrl, pStatusEmojiInfo.ExternUrl) && n51.f.a(this.ExternMd5, pStatusEmojiInfo.ExternMd5) && n51.f.a(this.ActivityID, pStatusEmojiInfo.ActivityID) && n51.f.a(this.AttachedText, pStatusEmojiInfo.AttachedText) && n51.f.a(this.AttachedTextColor, pStatusEmojiInfo.AttachedTextColor) && n51.f.a(this.LensId, pStatusEmojiInfo.LensId) && n51.f.a(this.EmojiAttr, pStatusEmojiInfo.EmojiAttr);
    }

    public java.lang.String getActivityID() {
        return this.ActivityID;
    }

    public java.lang.String getAesKey() {
        return this.AesKey;
    }

    public java.lang.String getAttachedText() {
        return this.AttachedText;
    }

    public java.lang.String getAttachedTextColor() {
        return this.AttachedTextColor;
    }

    public java.lang.String getDesignerID() {
        return this.DesignerID;
    }

    public java.lang.String getEmojiAttr() {
        return this.EmojiAttr;
    }

    public java.lang.String getEncryptUrl() {
        return this.EncryptUrl;
    }

    public java.lang.String getExternMd5() {
        return this.ExternMd5;
    }

    public java.lang.String getExternUrl() {
        return this.ExternUrl;
    }

    public java.lang.String getLensId() {
        return this.LensId;
    }

    public java.lang.String getMd5() {
        return this.Md5;
    }

    public java.lang.String getProductID() {
        return this.ProductID;
    }

    public java.lang.String getThumbUrl() {
        return this.ThumbUrl;
    }

    public java.lang.String getUrl() {
        return this.Url;
    }

    public com.tencent.wechat.aff.status.PStatusEmojiInfo mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.status.PStatusEmojiInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.Md5;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.Url;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.ThumbUrl;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.DesignerID;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.EncryptUrl;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.AesKey;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.ProductID;
            if (str7 != null) {
                fVar.j(7, str7);
            }
            java.lang.String str8 = this.ExternUrl;
            if (str8 != null) {
                fVar.j(8, str8);
            }
            java.lang.String str9 = this.ExternMd5;
            if (str9 != null) {
                fVar.j(9, str9);
            }
            java.lang.String str10 = this.ActivityID;
            if (str10 != null) {
                fVar.j(10, str10);
            }
            java.lang.String str11 = this.AttachedText;
            if (str11 != null) {
                fVar.j(11, str11);
            }
            java.lang.String str12 = this.AttachedTextColor;
            if (str12 != null) {
                fVar.j(12, str12);
            }
            java.lang.String str13 = this.LensId;
            if (str13 != null) {
                fVar.j(13, str13);
            }
            java.lang.String str14 = this.EmojiAttr;
            if (str14 != null) {
                fVar.j(14, str14);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str15 = this.Md5;
            int j17 = str15 != null ? b36.f.j(1, str15) + 0 : 0;
            java.lang.String str16 = this.Url;
            if (str16 != null) {
                j17 += b36.f.j(2, str16);
            }
            java.lang.String str17 = this.ThumbUrl;
            if (str17 != null) {
                j17 += b36.f.j(3, str17);
            }
            java.lang.String str18 = this.DesignerID;
            if (str18 != null) {
                j17 += b36.f.j(4, str18);
            }
            java.lang.String str19 = this.EncryptUrl;
            if (str19 != null) {
                j17 += b36.f.j(5, str19);
            }
            java.lang.String str20 = this.AesKey;
            if (str20 != null) {
                j17 += b36.f.j(6, str20);
            }
            java.lang.String str21 = this.ProductID;
            if (str21 != null) {
                j17 += b36.f.j(7, str21);
            }
            java.lang.String str22 = this.ExternUrl;
            if (str22 != null) {
                j17 += b36.f.j(8, str22);
            }
            java.lang.String str23 = this.ExternMd5;
            if (str23 != null) {
                j17 += b36.f.j(9, str23);
            }
            java.lang.String str24 = this.ActivityID;
            if (str24 != null) {
                j17 += b36.f.j(10, str24);
            }
            java.lang.String str25 = this.AttachedText;
            if (str25 != null) {
                j17 += b36.f.j(11, str25);
            }
            java.lang.String str26 = this.AttachedTextColor;
            if (str26 != null) {
                j17 += b36.f.j(12, str26);
            }
            java.lang.String str27 = this.LensId;
            if (str27 != null) {
                j17 += b36.f.j(13, str27);
            }
            java.lang.String str28 = this.EmojiAttr;
            return str28 != null ? j17 + b36.f.j(14, str28) : j17;
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
                this.Md5 = aVar2.k(intValue);
                return 0;
            case 2:
                this.Url = aVar2.k(intValue);
                return 0;
            case 3:
                this.ThumbUrl = aVar2.k(intValue);
                return 0;
            case 4:
                this.DesignerID = aVar2.k(intValue);
                return 0;
            case 5:
                this.EncryptUrl = aVar2.k(intValue);
                return 0;
            case 6:
                this.AesKey = aVar2.k(intValue);
                return 0;
            case 7:
                this.ProductID = aVar2.k(intValue);
                return 0;
            case 8:
                this.ExternUrl = aVar2.k(intValue);
                return 0;
            case 9:
                this.ExternMd5 = aVar2.k(intValue);
                return 0;
            case 10:
                this.ActivityID = aVar2.k(intValue);
                return 0;
            case 11:
                this.AttachedText = aVar2.k(intValue);
                return 0;
            case 12:
                this.AttachedTextColor = aVar2.k(intValue);
                return 0;
            case 13:
                this.LensId = aVar2.k(intValue);
                return 0;
            case 14:
                this.EmojiAttr = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.wechat.aff.status.PStatusEmojiInfo setActivityID(java.lang.String str) {
        this.ActivityID = str;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusEmojiInfo setAesKey(java.lang.String str) {
        this.AesKey = str;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusEmojiInfo setAttachedText(java.lang.String str) {
        this.AttachedText = str;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusEmojiInfo setAttachedTextColor(java.lang.String str) {
        this.AttachedTextColor = str;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusEmojiInfo setDesignerID(java.lang.String str) {
        this.DesignerID = str;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusEmojiInfo setEmojiAttr(java.lang.String str) {
        this.EmojiAttr = str;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusEmojiInfo setEncryptUrl(java.lang.String str) {
        this.EncryptUrl = str;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusEmojiInfo setExternMd5(java.lang.String str) {
        this.ExternMd5 = str;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusEmojiInfo setExternUrl(java.lang.String str) {
        this.ExternUrl = str;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusEmojiInfo setLensId(java.lang.String str) {
        this.LensId = str;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusEmojiInfo setMd5(java.lang.String str) {
        this.Md5 = str;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusEmojiInfo setProductID(java.lang.String str) {
        this.ProductID = str;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusEmojiInfo setThumbUrl(java.lang.String str) {
        this.ThumbUrl = str;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusEmojiInfo setUrl(java.lang.String str) {
        this.Url = str;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusEmojiInfo mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.status.PStatusEmojiInfo parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.status.PStatusEmojiInfo) super.parseFrom(bArr);
    }
}
