package com.tencent.wechat.aff.newlife;

/* loaded from: classes8.dex */
public class AttributeTitle extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.newlife.AttributeTitle DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.AttributeTitle();
    public com.tencent.wechat.aff.newlife.AttributeTitle.Content content = com.tencent.wechat.aff.newlife.AttributeTitle.Content.getDefaultInstance();

    /* loaded from: classes8.dex */
    public static class Content extends com.tencent.mm.protobuf.f {
        private static final com.tencent.wechat.aff.newlife.AttributeTitle.Content DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.AttributeTitle.Content();
        public java.lang.String title = "";
        public com.tencent.wechat.aff.newlife.AttributeTitle.SubContent subContent = com.tencent.wechat.aff.newlife.AttributeTitle.SubContent.getDefaultInstance();
        public int redDotControl = 0;

        public static com.tencent.wechat.aff.newlife.AttributeTitle.Content create() {
            return new com.tencent.wechat.aff.newlife.AttributeTitle.Content();
        }

        public static com.tencent.wechat.aff.newlife.AttributeTitle.Content getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.tencent.wechat.aff.newlife.AttributeTitle.Content newBuilder() {
            return new com.tencent.wechat.aff.newlife.AttributeTitle.Content();
        }

        public com.tencent.wechat.aff.newlife.AttributeTitle.Content build() {
            return this;
        }

        @Override // com.tencent.mm.protobuf.f
        public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
            if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.AttributeTitle.Content)) {
                return false;
            }
            com.tencent.wechat.aff.newlife.AttributeTitle.Content content = (com.tencent.wechat.aff.newlife.AttributeTitle.Content) fVar;
            return n51.f.a(this.title, content.title) && n51.f.a(this.subContent, content.subContent) && n51.f.a(java.lang.Integer.valueOf(this.redDotControl), java.lang.Integer.valueOf(content.redDotControl));
        }

        public int getRedDotControl() {
            return this.redDotControl;
        }

        public com.tencent.wechat.aff.newlife.AttributeTitle.SubContent getSubContent() {
            return this.subContent;
        }

        public java.lang.String getTitle() {
            return this.title;
        }

        public com.tencent.wechat.aff.newlife.AttributeTitle.Content mergeFrom(com.tencent.mm.protobuf.f fVar) {
            parseFrom(fVar.getData());
            return this;
        }

        @Override // com.tencent.mm.protobuf.f
        public com.tencent.mm.protobuf.f newInstance() {
            return new com.tencent.wechat.aff.newlife.AttributeTitle.Content();
        }

        @Override // com.tencent.mm.protobuf.f
        public final int op(int i17, java.lang.Object... objArr) {
            if (i17 == 0) {
                g36.f fVar = (g36.f) objArr[0];
                java.lang.String str = this.title;
                if (str != null) {
                    fVar.j(1, str);
                }
                com.tencent.wechat.aff.newlife.AttributeTitle.SubContent subContent = this.subContent;
                if (subContent != null) {
                    fVar.i(2, subContent.computeSize());
                    this.subContent.writeFields(fVar);
                }
                fVar.e(3, this.redDotControl);
                return 0;
            }
            if (i17 == 1) {
                java.lang.String str2 = this.title;
                int j17 = str2 != null ? 0 + b36.f.j(1, str2) : 0;
                com.tencent.wechat.aff.newlife.AttributeTitle.SubContent subContent2 = this.subContent;
                if (subContent2 != null) {
                    j17 += b36.f.i(2, subContent2.computeSize());
                }
                return j17 + b36.f.e(3, this.redDotControl);
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
                this.title = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 2) {
                if (intValue != 3) {
                    return -1;
                }
                this.redDotControl = aVar2.g(intValue);
                return 0;
            }
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size = j18.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j18.get(i18);
                com.tencent.wechat.aff.newlife.AttributeTitle.SubContent subContent3 = new com.tencent.wechat.aff.newlife.AttributeTitle.SubContent();
                if (bArr != null && bArr.length > 0) {
                    subContent3.parseFrom(bArr);
                }
                this.subContent = subContent3;
            }
            return 0;
        }

        public com.tencent.wechat.aff.newlife.AttributeTitle.Content setRedDotControl(int i17) {
            this.redDotControl = i17;
            return this;
        }

        public com.tencent.wechat.aff.newlife.AttributeTitle.Content setSubContent(com.tencent.wechat.aff.newlife.AttributeTitle.SubContent subContent) {
            this.subContent = subContent;
            return this;
        }

        public com.tencent.wechat.aff.newlife.AttributeTitle.Content setTitle(java.lang.String str) {
            this.title = str;
            return this;
        }

        public com.tencent.wechat.aff.newlife.AttributeTitle.Content mergeFrom(byte[] bArr) {
            parseFrom(bArr);
            return this;
        }

        @Override // com.tencent.mm.protobuf.f
        public com.tencent.wechat.aff.newlife.AttributeTitle.Content parseFrom(byte[] bArr) {
            return (com.tencent.wechat.aff.newlife.AttributeTitle.Content) super.parseFrom(bArr);
        }
    }

    /* loaded from: classes8.dex */
    public static class SubContent extends com.tencent.mm.protobuf.f {
        private static final com.tencent.wechat.aff.newlife.AttributeTitle.SubContent DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.AttributeTitle.SubContent();
        public java.lang.String subTitle = "";
        public java.lang.String iconUrl = "";
        public java.lang.String lightColor = "";
        public java.lang.String darkColor = "";
        public java.lang.String iconLightColor = "";
        public java.lang.String iconDarkColor = "";

        public static com.tencent.wechat.aff.newlife.AttributeTitle.SubContent create() {
            return new com.tencent.wechat.aff.newlife.AttributeTitle.SubContent();
        }

        public static com.tencent.wechat.aff.newlife.AttributeTitle.SubContent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.tencent.wechat.aff.newlife.AttributeTitle.SubContent newBuilder() {
            return new com.tencent.wechat.aff.newlife.AttributeTitle.SubContent();
        }

        public com.tencent.wechat.aff.newlife.AttributeTitle.SubContent build() {
            return this;
        }

        @Override // com.tencent.mm.protobuf.f
        public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
            if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.AttributeTitle.SubContent)) {
                return false;
            }
            com.tencent.wechat.aff.newlife.AttributeTitle.SubContent subContent = (com.tencent.wechat.aff.newlife.AttributeTitle.SubContent) fVar;
            return n51.f.a(this.subTitle, subContent.subTitle) && n51.f.a(this.iconUrl, subContent.iconUrl) && n51.f.a(this.lightColor, subContent.lightColor) && n51.f.a(this.darkColor, subContent.darkColor) && n51.f.a(this.iconLightColor, subContent.iconLightColor) && n51.f.a(this.iconDarkColor, subContent.iconDarkColor);
        }

        public java.lang.String getDarkColor() {
            return this.darkColor;
        }

        public java.lang.String getIconDarkColor() {
            return this.iconDarkColor;
        }

        public java.lang.String getIconLightColor() {
            return this.iconLightColor;
        }

        public java.lang.String getIconUrl() {
            return this.iconUrl;
        }

        public java.lang.String getLightColor() {
            return this.lightColor;
        }

        public java.lang.String getSubTitle() {
            return this.subTitle;
        }

        public com.tencent.wechat.aff.newlife.AttributeTitle.SubContent mergeFrom(com.tencent.mm.protobuf.f fVar) {
            parseFrom(fVar.getData());
            return this;
        }

        @Override // com.tencent.mm.protobuf.f
        public com.tencent.mm.protobuf.f newInstance() {
            return new com.tencent.wechat.aff.newlife.AttributeTitle.SubContent();
        }

        @Override // com.tencent.mm.protobuf.f
        public final int op(int i17, java.lang.Object... objArr) {
            if (i17 == 0) {
                g36.f fVar = (g36.f) objArr[0];
                java.lang.String str = this.subTitle;
                if (str != null) {
                    fVar.j(1, str);
                }
                java.lang.String str2 = this.iconUrl;
                if (str2 != null) {
                    fVar.j(2, str2);
                }
                java.lang.String str3 = this.lightColor;
                if (str3 != null) {
                    fVar.j(3, str3);
                }
                java.lang.String str4 = this.darkColor;
                if (str4 != null) {
                    fVar.j(4, str4);
                }
                java.lang.String str5 = this.iconLightColor;
                if (str5 != null) {
                    fVar.j(5, str5);
                }
                java.lang.String str6 = this.iconDarkColor;
                if (str6 != null) {
                    fVar.j(6, str6);
                }
                return 0;
            }
            if (i17 == 1) {
                java.lang.String str7 = this.subTitle;
                int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
                java.lang.String str8 = this.iconUrl;
                if (str8 != null) {
                    j17 += b36.f.j(2, str8);
                }
                java.lang.String str9 = this.lightColor;
                if (str9 != null) {
                    j17 += b36.f.j(3, str9);
                }
                java.lang.String str10 = this.darkColor;
                if (str10 != null) {
                    j17 += b36.f.j(4, str10);
                }
                java.lang.String str11 = this.iconLightColor;
                if (str11 != null) {
                    j17 += b36.f.j(5, str11);
                }
                java.lang.String str12 = this.iconDarkColor;
                return str12 != null ? j17 + b36.f.j(6, str12) : j17;
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
                    this.subTitle = aVar2.k(intValue);
                    return 0;
                case 2:
                    this.iconUrl = aVar2.k(intValue);
                    return 0;
                case 3:
                    this.lightColor = aVar2.k(intValue);
                    return 0;
                case 4:
                    this.darkColor = aVar2.k(intValue);
                    return 0;
                case 5:
                    this.iconLightColor = aVar2.k(intValue);
                    return 0;
                case 6:
                    this.iconDarkColor = aVar2.k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }

        public com.tencent.wechat.aff.newlife.AttributeTitle.SubContent setDarkColor(java.lang.String str) {
            this.darkColor = str;
            return this;
        }

        public com.tencent.wechat.aff.newlife.AttributeTitle.SubContent setIconDarkColor(java.lang.String str) {
            this.iconDarkColor = str;
            return this;
        }

        public com.tencent.wechat.aff.newlife.AttributeTitle.SubContent setIconLightColor(java.lang.String str) {
            this.iconLightColor = str;
            return this;
        }

        public com.tencent.wechat.aff.newlife.AttributeTitle.SubContent setIconUrl(java.lang.String str) {
            this.iconUrl = str;
            return this;
        }

        public com.tencent.wechat.aff.newlife.AttributeTitle.SubContent setLightColor(java.lang.String str) {
            this.lightColor = str;
            return this;
        }

        public com.tencent.wechat.aff.newlife.AttributeTitle.SubContent setSubTitle(java.lang.String str) {
            this.subTitle = str;
            return this;
        }

        public com.tencent.wechat.aff.newlife.AttributeTitle.SubContent mergeFrom(byte[] bArr) {
            parseFrom(bArr);
            return this;
        }

        @Override // com.tencent.mm.protobuf.f
        public com.tencent.wechat.aff.newlife.AttributeTitle.SubContent parseFrom(byte[] bArr) {
            return (com.tencent.wechat.aff.newlife.AttributeTitle.SubContent) super.parseFrom(bArr);
        }
    }

    public static com.tencent.wechat.aff.newlife.AttributeTitle create() {
        return new com.tencent.wechat.aff.newlife.AttributeTitle();
    }

    public static com.tencent.wechat.aff.newlife.AttributeTitle getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.newlife.AttributeTitle newBuilder() {
        return new com.tencent.wechat.aff.newlife.AttributeTitle();
    }

    public com.tencent.wechat.aff.newlife.AttributeTitle build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof com.tencent.wechat.aff.newlife.AttributeTitle) && n51.f.a(this.content, ((com.tencent.wechat.aff.newlife.AttributeTitle) fVar).content);
    }

    public com.tencent.wechat.aff.newlife.AttributeTitle.Content getContent() {
        return this.content;
    }

    public com.tencent.wechat.aff.newlife.AttributeTitle mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.newlife.AttributeTitle();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.wechat.aff.newlife.AttributeTitle.Content content = this.content;
            if (content != null) {
                fVar.i(1, content.computeSize());
                this.content.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.wechat.aff.newlife.AttributeTitle.Content content2 = this.content;
            if (content2 != null) {
                return 0 + b36.f.i(1, content2.computeSize());
            }
            return 0;
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
        if (intValue != 1) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.tencent.wechat.aff.newlife.AttributeTitle.Content content3 = new com.tencent.wechat.aff.newlife.AttributeTitle.Content();
            if (bArr != null && bArr.length > 0) {
                content3.parseFrom(bArr);
            }
            this.content = content3;
        }
        return 0;
    }

    public com.tencent.wechat.aff.newlife.AttributeTitle setContent(com.tencent.wechat.aff.newlife.AttributeTitle.Content content) {
        this.content = content;
        return this;
    }

    public com.tencent.wechat.aff.newlife.AttributeTitle mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.newlife.AttributeTitle parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.newlife.AttributeTitle) super.parseFrom(bArr);
    }
}
