package com.tencent.wechat.aff.newlife;

/* loaded from: classes8.dex */
public class FinderTabTipsDSLRenderTmpl extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl();
    public java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode> nodes = new java.util.LinkedList<>();

    /* loaded from: classes8.dex */
    public static class RenderNode extends com.tencent.mm.protobuf.f {
        private static final com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode();
        public int style = 0;
        public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderContent content = com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderContent.getDefaultInstance();
        public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr attr = com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.getDefaultInstance();

        /* loaded from: classes8.dex */
        public static class ContentAttr extends com.tencent.mm.protobuf.f {
            private static final com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.ContentAttr DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.ContentAttr();
            public boolean use_remark = false;
            public java.lang.String username = "";

            public static com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.ContentAttr create() {
                return new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.ContentAttr();
            }

            public static com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.ContentAttr getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.ContentAttr newBuilder() {
                return new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.ContentAttr();
            }

            public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.ContentAttr build() {
                return this;
            }

            @Override // com.tencent.mm.protobuf.f
            public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
                if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.ContentAttr)) {
                    return false;
                }
                com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.ContentAttr contentAttr = (com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.ContentAttr) fVar;
                return n51.f.a(java.lang.Boolean.valueOf(this.use_remark), java.lang.Boolean.valueOf(contentAttr.use_remark)) && n51.f.a(this.username, contentAttr.username);
            }

            public boolean getUseRemark() {
                return this.use_remark;
            }

            public boolean getUse_remark() {
                return this.use_remark;
            }

            public java.lang.String getUsername() {
                return this.username;
            }

            public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.ContentAttr mergeFrom(com.tencent.mm.protobuf.f fVar) {
                parseFrom(fVar.getData());
                return this;
            }

            @Override // com.tencent.mm.protobuf.f
            public com.tencent.mm.protobuf.f newInstance() {
                return new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.ContentAttr();
            }

            @Override // com.tencent.mm.protobuf.f
            public final int op(int i17, java.lang.Object... objArr) {
                if (i17 == 0) {
                    g36.f fVar = (g36.f) objArr[0];
                    fVar.a(1, this.use_remark);
                    java.lang.String str = this.username;
                    if (str != null) {
                        fVar.j(2, str);
                    }
                    return 0;
                }
                if (i17 == 1) {
                    int a17 = b36.f.a(1, this.use_remark) + 0;
                    java.lang.String str2 = this.username;
                    return str2 != null ? a17 + b36.f.j(2, str2) : a17;
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
                    this.use_remark = aVar2.c(intValue);
                    return 0;
                }
                if (intValue != 2) {
                    return -1;
                }
                this.username = aVar2.k(intValue);
                return 0;
            }

            public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.ContentAttr setUseRemark(boolean z17) {
                this.use_remark = z17;
                return this;
            }

            public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.ContentAttr setUse_remark(boolean z17) {
                this.use_remark = z17;
                return this;
            }

            public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.ContentAttr setUsername(java.lang.String str) {
                this.username = str;
                return this;
            }

            public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.ContentAttr mergeFrom(byte[] bArr) {
                parseFrom(bArr);
                return this;
            }

            @Override // com.tencent.mm.protobuf.f
            public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.ContentAttr parseFrom(byte[] bArr) {
                return (com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.ContentAttr) super.parseFrom(bArr);
            }
        }

        /* loaded from: classes8.dex */
        public static class Icon extends com.tencent.mm.protobuf.f {
            private static final com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.Icon DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.Icon();
            public java.lang.String icon_image_key = "";
            public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.IconUrl icon_url = com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.IconUrl.getDefaultInstance();

            public static com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.Icon create() {
                return new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.Icon();
            }

            public static com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.Icon getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.Icon newBuilder() {
                return new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.Icon();
            }

            public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.Icon build() {
                return this;
            }

            @Override // com.tencent.mm.protobuf.f
            public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
                if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.Icon)) {
                    return false;
                }
                com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.Icon icon = (com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.Icon) fVar;
                return n51.f.a(this.icon_image_key, icon.icon_image_key) && n51.f.a(this.icon_url, icon.icon_url);
            }

            public java.lang.String getIconImageKey() {
                return this.icon_image_key;
            }

            public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.IconUrl getIconUrl() {
                return this.icon_url;
            }

            public java.lang.String getIcon_image_key() {
                return this.icon_image_key;
            }

            public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.IconUrl getIcon_url() {
                return this.icon_url;
            }

            public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.Icon mergeFrom(com.tencent.mm.protobuf.f fVar) {
                parseFrom(fVar.getData());
                return this;
            }

            @Override // com.tencent.mm.protobuf.f
            public com.tencent.mm.protobuf.f newInstance() {
                return new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.Icon();
            }

            @Override // com.tencent.mm.protobuf.f
            public final int op(int i17, java.lang.Object... objArr) {
                if (i17 == 0) {
                    g36.f fVar = (g36.f) objArr[0];
                    java.lang.String str = this.icon_image_key;
                    if (str != null) {
                        fVar.j(1, str);
                    }
                    com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.IconUrl iconUrl = this.icon_url;
                    if (iconUrl != null) {
                        fVar.i(2, iconUrl.computeSize());
                        this.icon_url.writeFields(fVar);
                    }
                    return 0;
                }
                if (i17 == 1) {
                    java.lang.String str2 = this.icon_image_key;
                    int j17 = str2 != null ? 0 + b36.f.j(1, str2) : 0;
                    com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.IconUrl iconUrl2 = this.icon_url;
                    return iconUrl2 != null ? j17 + b36.f.i(2, iconUrl2.computeSize()) : j17;
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
                    this.icon_image_key = aVar2.k(intValue);
                    return 0;
                }
                if (intValue != 2) {
                    return -1;
                }
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.IconUrl iconUrl3 = new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.IconUrl();
                    if (bArr != null && bArr.length > 0) {
                        iconUrl3.parseFrom(bArr);
                    }
                    this.icon_url = iconUrl3;
                }
                return 0;
            }

            public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.Icon setIconImageKey(java.lang.String str) {
                this.icon_image_key = str;
                return this;
            }

            public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.Icon setIconUrl(com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.IconUrl iconUrl) {
                this.icon_url = iconUrl;
                return this;
            }

            public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.Icon setIcon_image_key(java.lang.String str) {
                this.icon_image_key = str;
                return this;
            }

            public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.Icon setIcon_url(com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.IconUrl iconUrl) {
                this.icon_url = iconUrl;
                return this;
            }

            public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.Icon mergeFrom(byte[] bArr) {
                parseFrom(bArr);
                return this;
            }

            @Override // com.tencent.mm.protobuf.f
            public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.Icon parseFrom(byte[] bArr) {
                return (com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.Icon) super.parseFrom(bArr);
            }
        }

        /* loaded from: classes8.dex */
        public static class IconUrl extends com.tencent.mm.protobuf.f {
            private static final com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.IconUrl DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.IconUrl();
            public java.lang.String icon_light_url = "";
            public java.lang.String icon_dark_url = "";

            public static com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.IconUrl create() {
                return new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.IconUrl();
            }

            public static com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.IconUrl getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.IconUrl newBuilder() {
                return new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.IconUrl();
            }

            public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.IconUrl build() {
                return this;
            }

            @Override // com.tencent.mm.protobuf.f
            public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
                if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.IconUrl)) {
                    return false;
                }
                com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.IconUrl iconUrl = (com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.IconUrl) fVar;
                return n51.f.a(this.icon_light_url, iconUrl.icon_light_url) && n51.f.a(this.icon_dark_url, iconUrl.icon_dark_url);
            }

            public java.lang.String getIconDarkUrl() {
                return this.icon_dark_url;
            }

            public java.lang.String getIconLightUrl() {
                return this.icon_light_url;
            }

            public java.lang.String getIcon_dark_url() {
                return this.icon_dark_url;
            }

            public java.lang.String getIcon_light_url() {
                return this.icon_light_url;
            }

            public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.IconUrl mergeFrom(com.tencent.mm.protobuf.f fVar) {
                parseFrom(fVar.getData());
                return this;
            }

            @Override // com.tencent.mm.protobuf.f
            public com.tencent.mm.protobuf.f newInstance() {
                return new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.IconUrl();
            }

            @Override // com.tencent.mm.protobuf.f
            public final int op(int i17, java.lang.Object... objArr) {
                if (i17 == 0) {
                    g36.f fVar = (g36.f) objArr[0];
                    java.lang.String str = this.icon_light_url;
                    if (str != null) {
                        fVar.j(1, str);
                    }
                    java.lang.String str2 = this.icon_dark_url;
                    if (str2 != null) {
                        fVar.j(2, str2);
                    }
                    return 0;
                }
                if (i17 == 1) {
                    java.lang.String str3 = this.icon_light_url;
                    int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
                    java.lang.String str4 = this.icon_dark_url;
                    return str4 != null ? j17 + b36.f.j(2, str4) : j17;
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
                    this.icon_light_url = aVar2.k(intValue);
                    return 0;
                }
                if (intValue != 2) {
                    return -1;
                }
                this.icon_dark_url = aVar2.k(intValue);
                return 0;
            }

            public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.IconUrl setIconDarkUrl(java.lang.String str) {
                this.icon_dark_url = str;
                return this;
            }

            public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.IconUrl setIconLightUrl(java.lang.String str) {
                this.icon_light_url = str;
                return this;
            }

            public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.IconUrl setIcon_dark_url(java.lang.String str) {
                this.icon_dark_url = str;
                return this;
            }

            public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.IconUrl setIcon_light_url(java.lang.String str) {
                this.icon_light_url = str;
                return this;
            }

            public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.IconUrl mergeFrom(byte[] bArr) {
                parseFrom(bArr);
                return this;
            }

            @Override // com.tencent.mm.protobuf.f
            public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.IconUrl parseFrom(byte[] bArr) {
                return (com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.IconUrl) super.parseFrom(bArr);
            }
        }

        /* loaded from: classes8.dex */
        public static class ReddotPendant extends com.tencent.mm.protobuf.f {
            private static final com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.ReddotPendant DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.ReddotPendant();
            public int static_icon = 0;
            public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.IconUrl image_url = com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.IconUrl.getDefaultInstance();

            public static com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.ReddotPendant create() {
                return new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.ReddotPendant();
            }

            public static com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.ReddotPendant getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.ReddotPendant newBuilder() {
                return new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.ReddotPendant();
            }

            public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.ReddotPendant build() {
                return this;
            }

            @Override // com.tencent.mm.protobuf.f
            public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
                if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.ReddotPendant)) {
                    return false;
                }
                com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.ReddotPendant reddotPendant = (com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.ReddotPendant) fVar;
                return n51.f.a(java.lang.Integer.valueOf(this.static_icon), java.lang.Integer.valueOf(reddotPendant.static_icon)) && n51.f.a(this.image_url, reddotPendant.image_url);
            }

            public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.IconUrl getImageUrl() {
                return this.image_url;
            }

            public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.IconUrl getImage_url() {
                return this.image_url;
            }

            public int getStaticIcon() {
                return this.static_icon;
            }

            public int getStatic_icon() {
                return this.static_icon;
            }

            public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.ReddotPendant mergeFrom(com.tencent.mm.protobuf.f fVar) {
                parseFrom(fVar.getData());
                return this;
            }

            @Override // com.tencent.mm.protobuf.f
            public com.tencent.mm.protobuf.f newInstance() {
                return new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.ReddotPendant();
            }

            @Override // com.tencent.mm.protobuf.f
            public final int op(int i17, java.lang.Object... objArr) {
                if (i17 == 0) {
                    g36.f fVar = (g36.f) objArr[0];
                    fVar.e(1, this.static_icon);
                    com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.IconUrl iconUrl = this.image_url;
                    if (iconUrl != null) {
                        fVar.i(2, iconUrl.computeSize());
                        this.image_url.writeFields(fVar);
                    }
                    return 0;
                }
                if (i17 == 1) {
                    int e17 = b36.f.e(1, this.static_icon) + 0;
                    com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.IconUrl iconUrl2 = this.image_url;
                    return iconUrl2 != null ? e17 + b36.f.i(2, iconUrl2.computeSize()) : e17;
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
                    this.static_icon = aVar2.g(intValue);
                    return 0;
                }
                if (intValue != 2) {
                    return -1;
                }
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.IconUrl iconUrl3 = new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.IconUrl();
                    if (bArr != null && bArr.length > 0) {
                        iconUrl3.parseFrom(bArr);
                    }
                    this.image_url = iconUrl3;
                }
                return 0;
            }

            public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.ReddotPendant setImageUrl(com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.IconUrl iconUrl) {
                this.image_url = iconUrl;
                return this;
            }

            public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.ReddotPendant setImage_url(com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.IconUrl iconUrl) {
                this.image_url = iconUrl;
                return this;
            }

            public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.ReddotPendant setStaticIcon(int i17) {
                this.static_icon = i17;
                return this;
            }

            public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.ReddotPendant setStatic_icon(int i17) {
                this.static_icon = i17;
                return this;
            }

            public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.ReddotPendant mergeFrom(byte[] bArr) {
                parseFrom(bArr);
                return this;
            }

            @Override // com.tencent.mm.protobuf.f
            public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.ReddotPendant parseFrom(byte[] bArr) {
                return (com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.ReddotPendant) super.parseFrom(bArr);
            }
        }

        /* loaded from: classes8.dex */
        public static class RenderAttr extends com.tencent.mm.protobuf.f {
            private static final com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr();
            public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.CommonAttr common = com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.CommonAttr.getDefaultInstance();
            public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.BusinessAttr business = com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.BusinessAttr.getDefaultInstance();

            /* loaded from: classes8.dex */
            public static class BorderAttr extends com.tencent.mm.protobuf.f {
                private static final com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.BorderAttr DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.BorderAttr();
                public int size = 0;
                public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderColor color = com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderColor.getDefaultInstance();

                public static com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.BorderAttr create() {
                    return new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.BorderAttr();
                }

                public static com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.BorderAttr getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.BorderAttr newBuilder() {
                    return new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.BorderAttr();
                }

                public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.BorderAttr build() {
                    return this;
                }

                @Override // com.tencent.mm.protobuf.f
                public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
                    if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.BorderAttr)) {
                        return false;
                    }
                    com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.BorderAttr borderAttr = (com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.BorderAttr) fVar;
                    return n51.f.a(java.lang.Integer.valueOf(this.size), java.lang.Integer.valueOf(borderAttr.size)) && n51.f.a(this.color, borderAttr.color);
                }

                public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderColor getColor() {
                    return this.color;
                }

                public int getSize() {
                    return this.size;
                }

                public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.BorderAttr mergeFrom(com.tencent.mm.protobuf.f fVar) {
                    parseFrom(fVar.getData());
                    return this;
                }

                @Override // com.tencent.mm.protobuf.f
                public com.tencent.mm.protobuf.f newInstance() {
                    return new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.BorderAttr();
                }

                @Override // com.tencent.mm.protobuf.f
                public final int op(int i17, java.lang.Object... objArr) {
                    if (i17 == 0) {
                        g36.f fVar = (g36.f) objArr[0];
                        fVar.e(1, this.size);
                        com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderColor renderColor = this.color;
                        if (renderColor != null) {
                            fVar.i(2, renderColor.computeSize());
                            this.color.writeFields(fVar);
                        }
                        return 0;
                    }
                    if (i17 == 1) {
                        int e17 = b36.f.e(1, this.size) + 0;
                        com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderColor renderColor2 = this.color;
                        return renderColor2 != null ? e17 + b36.f.i(2, renderColor2.computeSize()) : e17;
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
                        this.size = aVar2.g(intValue);
                        return 0;
                    }
                    if (intValue != 2) {
                        return -1;
                    }
                    java.util.LinkedList j17 = aVar2.j(intValue);
                    int size = j17.size();
                    for (int i18 = 0; i18 < size; i18++) {
                        byte[] bArr = (byte[]) j17.get(i18);
                        com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderColor renderColor3 = new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderColor();
                        if (bArr != null && bArr.length > 0) {
                            renderColor3.parseFrom(bArr);
                        }
                        this.color = renderColor3;
                    }
                    return 0;
                }

                public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.BorderAttr setColor(com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderColor renderColor) {
                    this.color = renderColor;
                    return this;
                }

                public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.BorderAttr setSize(int i17) {
                    this.size = i17;
                    return this;
                }

                public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.BorderAttr mergeFrom(byte[] bArr) {
                    parseFrom(bArr);
                    return this;
                }

                @Override // com.tencent.mm.protobuf.f
                public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.BorderAttr parseFrom(byte[] bArr) {
                    return (com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.BorderAttr) super.parseFrom(bArr);
                }
            }

            /* loaded from: classes8.dex */
            public static class BusinessAttr extends com.tencent.mm.protobuf.f {
                private static final com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.BusinessAttr DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.BusinessAttr();
                public int font_weight = 0;
                public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderColor background = com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderColor.getDefaultInstance();
                public float radius = 0.0f;
                public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.BorderAttr border = com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.BorderAttr.getDefaultInstance();
                public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.ReddotPendantAttr reddot_pendant = com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.ReddotPendantAttr.getDefaultInstance();
                public int text_align = 0;

                public static com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.BusinessAttr create() {
                    return new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.BusinessAttr();
                }

                public static com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.BusinessAttr getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.BusinessAttr newBuilder() {
                    return new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.BusinessAttr();
                }

                public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.BusinessAttr build() {
                    return this;
                }

                @Override // com.tencent.mm.protobuf.f
                public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
                    if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.BusinessAttr)) {
                        return false;
                    }
                    com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.BusinessAttr businessAttr = (com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.BusinessAttr) fVar;
                    return n51.f.a(java.lang.Integer.valueOf(this.font_weight), java.lang.Integer.valueOf(businessAttr.font_weight)) && n51.f.a(this.background, businessAttr.background) && n51.f.a(java.lang.Float.valueOf(this.radius), java.lang.Float.valueOf(businessAttr.radius)) && n51.f.a(this.border, businessAttr.border) && n51.f.a(this.reddot_pendant, businessAttr.reddot_pendant) && n51.f.a(java.lang.Integer.valueOf(this.text_align), java.lang.Integer.valueOf(businessAttr.text_align));
                }

                public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderColor getBackground() {
                    return this.background;
                }

                public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.BorderAttr getBorder() {
                    return this.border;
                }

                public int getFontWeight() {
                    return this.font_weight;
                }

                public int getFont_weight() {
                    return this.font_weight;
                }

                public float getRadius() {
                    return this.radius;
                }

                public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.ReddotPendantAttr getReddotPendant() {
                    return this.reddot_pendant;
                }

                public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.ReddotPendantAttr getReddot_pendant() {
                    return this.reddot_pendant;
                }

                public int getTextAlign() {
                    return this.text_align;
                }

                public int getText_align() {
                    return this.text_align;
                }

                public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.BusinessAttr mergeFrom(com.tencent.mm.protobuf.f fVar) {
                    parseFrom(fVar.getData());
                    return this;
                }

                @Override // com.tencent.mm.protobuf.f
                public com.tencent.mm.protobuf.f newInstance() {
                    return new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.BusinessAttr();
                }

                @Override // com.tencent.mm.protobuf.f
                public final int op(int i17, java.lang.Object... objArr) {
                    if (i17 == 0) {
                        g36.f fVar = (g36.f) objArr[0];
                        fVar.e(1, this.font_weight);
                        com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderColor renderColor = this.background;
                        if (renderColor != null) {
                            fVar.i(2, renderColor.computeSize());
                            this.background.writeFields(fVar);
                        }
                        fVar.d(3, this.radius);
                        com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.BorderAttr borderAttr = this.border;
                        if (borderAttr != null) {
                            fVar.i(4, borderAttr.computeSize());
                            this.border.writeFields(fVar);
                        }
                        com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.ReddotPendantAttr reddotPendantAttr = this.reddot_pendant;
                        if (reddotPendantAttr != null) {
                            fVar.i(5, reddotPendantAttr.computeSize());
                            this.reddot_pendant.writeFields(fVar);
                        }
                        fVar.e(6, this.text_align);
                        return 0;
                    }
                    if (i17 == 1) {
                        int e17 = b36.f.e(1, this.font_weight) + 0;
                        com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderColor renderColor2 = this.background;
                        if (renderColor2 != null) {
                            e17 += b36.f.i(2, renderColor2.computeSize());
                        }
                        int d17 = e17 + b36.f.d(3, this.radius);
                        com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.BorderAttr borderAttr2 = this.border;
                        if (borderAttr2 != null) {
                            d17 += b36.f.i(4, borderAttr2.computeSize());
                        }
                        com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.ReddotPendantAttr reddotPendantAttr2 = this.reddot_pendant;
                        if (reddotPendantAttr2 != null) {
                            d17 += b36.f.i(5, reddotPendantAttr2.computeSize());
                        }
                        return d17 + b36.f.e(6, this.text_align);
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
                            this.font_weight = aVar2.g(intValue);
                            return 0;
                        case 2:
                            java.util.LinkedList j17 = aVar2.j(intValue);
                            int size = j17.size();
                            for (int i18 = 0; i18 < size; i18++) {
                                byte[] bArr = (byte[]) j17.get(i18);
                                com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderColor renderColor3 = new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderColor();
                                if (bArr != null && bArr.length > 0) {
                                    renderColor3.parseFrom(bArr);
                                }
                                this.background = renderColor3;
                            }
                            return 0;
                        case 3:
                            this.radius = aVar2.f(intValue);
                            return 0;
                        case 4:
                            java.util.LinkedList j18 = aVar2.j(intValue);
                            int size2 = j18.size();
                            for (int i19 = 0; i19 < size2; i19++) {
                                byte[] bArr2 = (byte[]) j18.get(i19);
                                com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.BorderAttr borderAttr3 = new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.BorderAttr();
                                if (bArr2 != null && bArr2.length > 0) {
                                    borderAttr3.parseFrom(bArr2);
                                }
                                this.border = borderAttr3;
                            }
                            return 0;
                        case 5:
                            java.util.LinkedList j19 = aVar2.j(intValue);
                            int size3 = j19.size();
                            for (int i27 = 0; i27 < size3; i27++) {
                                byte[] bArr3 = (byte[]) j19.get(i27);
                                com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.ReddotPendantAttr reddotPendantAttr3 = new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.ReddotPendantAttr();
                                if (bArr3 != null && bArr3.length > 0) {
                                    reddotPendantAttr3.parseFrom(bArr3);
                                }
                                this.reddot_pendant = reddotPendantAttr3;
                            }
                            return 0;
                        case 6:
                            this.text_align = aVar2.g(intValue);
                            return 0;
                        default:
                            return -1;
                    }
                }

                public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.BusinessAttr setBackground(com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderColor renderColor) {
                    this.background = renderColor;
                    return this;
                }

                public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.BusinessAttr setBorder(com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.BorderAttr borderAttr) {
                    this.border = borderAttr;
                    return this;
                }

                public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.BusinessAttr setFontWeight(int i17) {
                    this.font_weight = i17;
                    return this;
                }

                public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.BusinessAttr setFont_weight(int i17) {
                    this.font_weight = i17;
                    return this;
                }

                public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.BusinessAttr setRadius(float f17) {
                    this.radius = f17;
                    return this;
                }

                public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.BusinessAttr setReddotPendant(com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.ReddotPendantAttr reddotPendantAttr) {
                    this.reddot_pendant = reddotPendantAttr;
                    return this;
                }

                public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.BusinessAttr setReddot_pendant(com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.ReddotPendantAttr reddotPendantAttr) {
                    this.reddot_pendant = reddotPendantAttr;
                    return this;
                }

                public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.BusinessAttr setTextAlign(int i17) {
                    this.text_align = i17;
                    return this;
                }

                public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.BusinessAttr setText_align(int i17) {
                    this.text_align = i17;
                    return this;
                }

                public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.BusinessAttr mergeFrom(byte[] bArr) {
                    parseFrom(bArr);
                    return this;
                }

                @Override // com.tencent.mm.protobuf.f
                public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.BusinessAttr parseFrom(byte[] bArr) {
                    return (com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.BusinessAttr) super.parseFrom(bArr);
                }
            }

            /* loaded from: classes8.dex */
            public static class CommonAttr extends com.tencent.mm.protobuf.f {
                private static final com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.CommonAttr DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.CommonAttr();
                public int size = 0;
                public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderColor color = com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderColor.getDefaultInstance();
                public int line = 0;
                public int vertical_align = 0;

                public static com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.CommonAttr create() {
                    return new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.CommonAttr();
                }

                public static com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.CommonAttr getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.CommonAttr newBuilder() {
                    return new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.CommonAttr();
                }

                public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.CommonAttr build() {
                    return this;
                }

                @Override // com.tencent.mm.protobuf.f
                public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
                    if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.CommonAttr)) {
                        return false;
                    }
                    com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.CommonAttr commonAttr = (com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.CommonAttr) fVar;
                    return n51.f.a(java.lang.Integer.valueOf(this.size), java.lang.Integer.valueOf(commonAttr.size)) && n51.f.a(this.color, commonAttr.color) && n51.f.a(java.lang.Integer.valueOf(this.line), java.lang.Integer.valueOf(commonAttr.line)) && n51.f.a(java.lang.Integer.valueOf(this.vertical_align), java.lang.Integer.valueOf(commonAttr.vertical_align));
                }

                public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderColor getColor() {
                    return this.color;
                }

                public int getLine() {
                    return this.line;
                }

                public int getSize() {
                    return this.size;
                }

                public int getVerticalAlign() {
                    return this.vertical_align;
                }

                public int getVertical_align() {
                    return this.vertical_align;
                }

                public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.CommonAttr mergeFrom(com.tencent.mm.protobuf.f fVar) {
                    parseFrom(fVar.getData());
                    return this;
                }

                @Override // com.tencent.mm.protobuf.f
                public com.tencent.mm.protobuf.f newInstance() {
                    return new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.CommonAttr();
                }

                @Override // com.tencent.mm.protobuf.f
                public final int op(int i17, java.lang.Object... objArr) {
                    if (i17 == 0) {
                        g36.f fVar = (g36.f) objArr[0];
                        fVar.e(1, this.size);
                        com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderColor renderColor = this.color;
                        if (renderColor != null) {
                            fVar.i(2, renderColor.computeSize());
                            this.color.writeFields(fVar);
                        }
                        fVar.e(3, this.line);
                        fVar.e(4, this.vertical_align);
                        return 0;
                    }
                    if (i17 == 1) {
                        int e17 = b36.f.e(1, this.size) + 0;
                        com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderColor renderColor2 = this.color;
                        if (renderColor2 != null) {
                            e17 += b36.f.i(2, renderColor2.computeSize());
                        }
                        return e17 + b36.f.e(3, this.line) + b36.f.e(4, this.vertical_align);
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
                        this.size = aVar2.g(intValue);
                        return 0;
                    }
                    if (intValue != 2) {
                        if (intValue == 3) {
                            this.line = aVar2.g(intValue);
                            return 0;
                        }
                        if (intValue != 4) {
                            return -1;
                        }
                        this.vertical_align = aVar2.g(intValue);
                        return 0;
                    }
                    java.util.LinkedList j17 = aVar2.j(intValue);
                    int size = j17.size();
                    for (int i18 = 0; i18 < size; i18++) {
                        byte[] bArr = (byte[]) j17.get(i18);
                        com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderColor renderColor3 = new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderColor();
                        if (bArr != null && bArr.length > 0) {
                            renderColor3.parseFrom(bArr);
                        }
                        this.color = renderColor3;
                    }
                    return 0;
                }

                public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.CommonAttr setColor(com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderColor renderColor) {
                    this.color = renderColor;
                    return this;
                }

                public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.CommonAttr setLine(int i17) {
                    this.line = i17;
                    return this;
                }

                public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.CommonAttr setSize(int i17) {
                    this.size = i17;
                    return this;
                }

                public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.CommonAttr setVerticalAlign(int i17) {
                    this.vertical_align = i17;
                    return this;
                }

                public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.CommonAttr setVertical_align(int i17) {
                    this.vertical_align = i17;
                    return this;
                }

                public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.CommonAttr mergeFrom(byte[] bArr) {
                    parseFrom(bArr);
                    return this;
                }

                @Override // com.tencent.mm.protobuf.f
                public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.CommonAttr parseFrom(byte[] bArr) {
                    return (com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.CommonAttr) super.parseFrom(bArr);
                }
            }

            /* loaded from: classes8.dex */
            public static class ReddotPendantAttr extends com.tencent.mm.protobuf.f {
                private static final com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.ReddotPendantAttr DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.ReddotPendantAttr();
                public int original_position = 0;
                public int thumbnail_position = 0;

                public static com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.ReddotPendantAttr create() {
                    return new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.ReddotPendantAttr();
                }

                public static com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.ReddotPendantAttr getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.ReddotPendantAttr newBuilder() {
                    return new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.ReddotPendantAttr();
                }

                public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.ReddotPendantAttr build() {
                    return this;
                }

                @Override // com.tencent.mm.protobuf.f
                public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
                    if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.ReddotPendantAttr)) {
                        return false;
                    }
                    com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.ReddotPendantAttr reddotPendantAttr = (com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.ReddotPendantAttr) fVar;
                    return n51.f.a(java.lang.Integer.valueOf(this.original_position), java.lang.Integer.valueOf(reddotPendantAttr.original_position)) && n51.f.a(java.lang.Integer.valueOf(this.thumbnail_position), java.lang.Integer.valueOf(reddotPendantAttr.thumbnail_position));
                }

                public int getOriginalPosition() {
                    return this.original_position;
                }

                public int getOriginal_position() {
                    return this.original_position;
                }

                public int getThumbnailPosition() {
                    return this.thumbnail_position;
                }

                public int getThumbnail_position() {
                    return this.thumbnail_position;
                }

                public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.ReddotPendantAttr mergeFrom(com.tencent.mm.protobuf.f fVar) {
                    parseFrom(fVar.getData());
                    return this;
                }

                @Override // com.tencent.mm.protobuf.f
                public com.tencent.mm.protobuf.f newInstance() {
                    return new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.ReddotPendantAttr();
                }

                @Override // com.tencent.mm.protobuf.f
                public final int op(int i17, java.lang.Object... objArr) {
                    if (i17 == 0) {
                        g36.f fVar = (g36.f) objArr[0];
                        fVar.e(1, this.original_position);
                        fVar.e(2, this.thumbnail_position);
                        return 0;
                    }
                    if (i17 == 1) {
                        return b36.f.e(1, this.original_position) + 0 + b36.f.e(2, this.thumbnail_position);
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
                        this.original_position = aVar2.g(intValue);
                        return 0;
                    }
                    if (intValue != 2) {
                        return -1;
                    }
                    this.thumbnail_position = aVar2.g(intValue);
                    return 0;
                }

                public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.ReddotPendantAttr setOriginalPosition(int i17) {
                    this.original_position = i17;
                    return this;
                }

                public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.ReddotPendantAttr setOriginal_position(int i17) {
                    this.original_position = i17;
                    return this;
                }

                public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.ReddotPendantAttr setThumbnailPosition(int i17) {
                    this.thumbnail_position = i17;
                    return this;
                }

                public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.ReddotPendantAttr setThumbnail_position(int i17) {
                    this.thumbnail_position = i17;
                    return this;
                }

                public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.ReddotPendantAttr mergeFrom(byte[] bArr) {
                    parseFrom(bArr);
                    return this;
                }

                @Override // com.tencent.mm.protobuf.f
                public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.ReddotPendantAttr parseFrom(byte[] bArr) {
                    return (com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.ReddotPendantAttr) super.parseFrom(bArr);
                }
            }

            public static com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr create() {
                return new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr();
            }

            public static com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr newBuilder() {
                return new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr();
            }

            public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr build() {
                return this;
            }

            @Override // com.tencent.mm.protobuf.f
            public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
                if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr)) {
                    return false;
                }
                com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr renderAttr = (com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr) fVar;
                return n51.f.a(this.common, renderAttr.common) && n51.f.a(this.business, renderAttr.business);
            }

            public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.BusinessAttr getBusiness() {
                return this.business;
            }

            public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.CommonAttr getCommon() {
                return this.common;
            }

            public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr mergeFrom(com.tencent.mm.protobuf.f fVar) {
                parseFrom(fVar.getData());
                return this;
            }

            @Override // com.tencent.mm.protobuf.f
            public com.tencent.mm.protobuf.f newInstance() {
                return new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr();
            }

            @Override // com.tencent.mm.protobuf.f
            public final int op(int i17, java.lang.Object... objArr) {
                if (i17 == 0) {
                    g36.f fVar = (g36.f) objArr[0];
                    com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.CommonAttr commonAttr = this.common;
                    if (commonAttr != null) {
                        fVar.i(1, commonAttr.computeSize());
                        this.common.writeFields(fVar);
                    }
                    com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.BusinessAttr businessAttr = this.business;
                    if (businessAttr != null) {
                        fVar.i(2, businessAttr.computeSize());
                        this.business.writeFields(fVar);
                    }
                    return 0;
                }
                if (i17 == 1) {
                    com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.CommonAttr commonAttr2 = this.common;
                    int i18 = commonAttr2 != null ? 0 + b36.f.i(1, commonAttr2.computeSize()) : 0;
                    com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.BusinessAttr businessAttr2 = this.business;
                    return businessAttr2 != null ? i18 + b36.f.i(2, businessAttr2.computeSize()) : i18;
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
                    java.util.LinkedList j17 = aVar2.j(intValue);
                    int size = j17.size();
                    for (int i19 = 0; i19 < size; i19++) {
                        byte[] bArr = (byte[]) j17.get(i19);
                        com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.CommonAttr commonAttr3 = new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.CommonAttr();
                        if (bArr != null && bArr.length > 0) {
                            commonAttr3.parseFrom(bArr);
                        }
                        this.common = commonAttr3;
                    }
                    return 0;
                }
                if (intValue != 2) {
                    return -1;
                }
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.BusinessAttr businessAttr3 = new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.BusinessAttr();
                    if (bArr2 != null && bArr2.length > 0) {
                        businessAttr3.parseFrom(bArr2);
                    }
                    this.business = businessAttr3;
                }
                return 0;
            }

            public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr setBusiness(com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.BusinessAttr businessAttr) {
                this.business = businessAttr;
                return this;
            }

            public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr setCommon(com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr.CommonAttr commonAttr) {
                this.common = commonAttr;
                return this;
            }

            public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr mergeFrom(byte[] bArr) {
                parseFrom(bArr);
                return this;
            }

            @Override // com.tencent.mm.protobuf.f
            public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr parseFrom(byte[] bArr) {
                return (com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr) super.parseFrom(bArr);
            }
        }

        /* loaded from: classes8.dex */
        public static class RenderColor extends com.tencent.mm.protobuf.f {
            private static final com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderColor DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderColor();
            public java.lang.String light = "";
            public java.lang.String dark = "";

            public static com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderColor create() {
                return new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderColor();
            }

            public static com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderColor getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderColor newBuilder() {
                return new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderColor();
            }

            public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderColor build() {
                return this;
            }

            @Override // com.tencent.mm.protobuf.f
            public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
                if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderColor)) {
                    return false;
                }
                com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderColor renderColor = (com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderColor) fVar;
                return n51.f.a(this.light, renderColor.light) && n51.f.a(this.dark, renderColor.dark);
            }

            public java.lang.String getDark() {
                return this.dark;
            }

            public java.lang.String getLight() {
                return this.light;
            }

            public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderColor mergeFrom(com.tencent.mm.protobuf.f fVar) {
                parseFrom(fVar.getData());
                return this;
            }

            @Override // com.tencent.mm.protobuf.f
            public com.tencent.mm.protobuf.f newInstance() {
                return new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderColor();
            }

            @Override // com.tencent.mm.protobuf.f
            public final int op(int i17, java.lang.Object... objArr) {
                if (i17 == 0) {
                    g36.f fVar = (g36.f) objArr[0];
                    java.lang.String str = this.light;
                    if (str != null) {
                        fVar.j(1, str);
                    }
                    java.lang.String str2 = this.dark;
                    if (str2 != null) {
                        fVar.j(2, str2);
                    }
                    return 0;
                }
                if (i17 == 1) {
                    java.lang.String str3 = this.light;
                    int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
                    java.lang.String str4 = this.dark;
                    return str4 != null ? j17 + b36.f.j(2, str4) : j17;
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
                    this.light = aVar2.k(intValue);
                    return 0;
                }
                if (intValue != 2) {
                    return -1;
                }
                this.dark = aVar2.k(intValue);
                return 0;
            }

            public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderColor setDark(java.lang.String str) {
                this.dark = str;
                return this;
            }

            public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderColor setLight(java.lang.String str) {
                this.light = str;
                return this;
            }

            public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderColor mergeFrom(byte[] bArr) {
                parseFrom(bArr);
                return this;
            }

            @Override // com.tencent.mm.protobuf.f
            public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderColor parseFrom(byte[] bArr) {
                return (com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderColor) super.parseFrom(bArr);
            }
        }

        /* loaded from: classes8.dex */
        public static class RenderContent extends com.tencent.mm.protobuf.f {
            private static final com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderContent DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderContent();
            public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderContent.ContentDetail original = com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderContent.ContentDetail.getDefaultInstance();
            public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderContent.ContentDetail thumbnail = com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderContent.ContentDetail.getDefaultInstance();

            /* loaded from: classes8.dex */
            public static class ContentDetail extends com.tencent.mm.protobuf.f {
                private static final com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderContent.ContentDetail DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderContent.ContentDetail();
                public java.lang.String text = "";
                public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.Icon icon = com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.Icon.getDefaultInstance();
                public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.ReddotPendant reddot_pendant = com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.ReddotPendant.getDefaultInstance();
                public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.ContentAttr content_attr = com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.ContentAttr.getDefaultInstance();

                public static com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderContent.ContentDetail create() {
                    return new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderContent.ContentDetail();
                }

                public static com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderContent.ContentDetail getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderContent.ContentDetail newBuilder() {
                    return new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderContent.ContentDetail();
                }

                public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderContent.ContentDetail build() {
                    return this;
                }

                @Override // com.tencent.mm.protobuf.f
                public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
                    if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderContent.ContentDetail)) {
                        return false;
                    }
                    com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderContent.ContentDetail contentDetail = (com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderContent.ContentDetail) fVar;
                    return n51.f.a(this.text, contentDetail.text) && n51.f.a(this.icon, contentDetail.icon) && n51.f.a(this.reddot_pendant, contentDetail.reddot_pendant) && n51.f.a(this.content_attr, contentDetail.content_attr);
                }

                public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.ContentAttr getContentAttr() {
                    return this.content_attr;
                }

                public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.ContentAttr getContent_attr() {
                    return this.content_attr;
                }

                public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.Icon getIcon() {
                    return this.icon;
                }

                public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.ReddotPendant getReddotPendant() {
                    return this.reddot_pendant;
                }

                public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.ReddotPendant getReddot_pendant() {
                    return this.reddot_pendant;
                }

                public java.lang.String getText() {
                    return this.text;
                }

                public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderContent.ContentDetail mergeFrom(com.tencent.mm.protobuf.f fVar) {
                    parseFrom(fVar.getData());
                    return this;
                }

                @Override // com.tencent.mm.protobuf.f
                public com.tencent.mm.protobuf.f newInstance() {
                    return new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderContent.ContentDetail();
                }

                @Override // com.tencent.mm.protobuf.f
                public final int op(int i17, java.lang.Object... objArr) {
                    if (i17 == 0) {
                        g36.f fVar = (g36.f) objArr[0];
                        java.lang.String str = this.text;
                        if (str != null) {
                            fVar.j(1, str);
                        }
                        com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.Icon icon = this.icon;
                        if (icon != null) {
                            fVar.i(2, icon.computeSize());
                            this.icon.writeFields(fVar);
                        }
                        com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.ReddotPendant reddotPendant = this.reddot_pendant;
                        if (reddotPendant != null) {
                            fVar.i(3, reddotPendant.computeSize());
                            this.reddot_pendant.writeFields(fVar);
                        }
                        com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.ContentAttr contentAttr = this.content_attr;
                        if (contentAttr != null) {
                            fVar.i(4, contentAttr.computeSize());
                            this.content_attr.writeFields(fVar);
                        }
                        return 0;
                    }
                    if (i17 == 1) {
                        java.lang.String str2 = this.text;
                        int j17 = str2 != null ? 0 + b36.f.j(1, str2) : 0;
                        com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.Icon icon2 = this.icon;
                        if (icon2 != null) {
                            j17 += b36.f.i(2, icon2.computeSize());
                        }
                        com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.ReddotPendant reddotPendant2 = this.reddot_pendant;
                        if (reddotPendant2 != null) {
                            j17 += b36.f.i(3, reddotPendant2.computeSize());
                        }
                        com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.ContentAttr contentAttr2 = this.content_attr;
                        return contentAttr2 != null ? j17 + b36.f.i(4, contentAttr2.computeSize()) : j17;
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
                        this.text = aVar2.k(intValue);
                        return 0;
                    }
                    if (intValue == 2) {
                        java.util.LinkedList j18 = aVar2.j(intValue);
                        int size = j18.size();
                        for (int i18 = 0; i18 < size; i18++) {
                            byte[] bArr = (byte[]) j18.get(i18);
                            com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.Icon icon3 = new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.Icon();
                            if (bArr != null && bArr.length > 0) {
                                icon3.parseFrom(bArr);
                            }
                            this.icon = icon3;
                        }
                        return 0;
                    }
                    if (intValue == 3) {
                        java.util.LinkedList j19 = aVar2.j(intValue);
                        int size2 = j19.size();
                        for (int i19 = 0; i19 < size2; i19++) {
                            byte[] bArr2 = (byte[]) j19.get(i19);
                            com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.ReddotPendant reddotPendant3 = new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.ReddotPendant();
                            if (bArr2 != null && bArr2.length > 0) {
                                reddotPendant3.parseFrom(bArr2);
                            }
                            this.reddot_pendant = reddotPendant3;
                        }
                        return 0;
                    }
                    if (intValue != 4) {
                        return -1;
                    }
                    java.util.LinkedList j27 = aVar2.j(intValue);
                    int size3 = j27.size();
                    for (int i27 = 0; i27 < size3; i27++) {
                        byte[] bArr3 = (byte[]) j27.get(i27);
                        com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.ContentAttr contentAttr3 = new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.ContentAttr();
                        if (bArr3 != null && bArr3.length > 0) {
                            contentAttr3.parseFrom(bArr3);
                        }
                        this.content_attr = contentAttr3;
                    }
                    return 0;
                }

                public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderContent.ContentDetail setContentAttr(com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.ContentAttr contentAttr) {
                    this.content_attr = contentAttr;
                    return this;
                }

                public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderContent.ContentDetail setContent_attr(com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.ContentAttr contentAttr) {
                    this.content_attr = contentAttr;
                    return this;
                }

                public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderContent.ContentDetail setIcon(com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.Icon icon) {
                    this.icon = icon;
                    return this;
                }

                public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderContent.ContentDetail setReddotPendant(com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.ReddotPendant reddotPendant) {
                    this.reddot_pendant = reddotPendant;
                    return this;
                }

                public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderContent.ContentDetail setReddot_pendant(com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.ReddotPendant reddotPendant) {
                    this.reddot_pendant = reddotPendant;
                    return this;
                }

                public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderContent.ContentDetail setText(java.lang.String str) {
                    this.text = str;
                    return this;
                }

                public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderContent.ContentDetail mergeFrom(byte[] bArr) {
                    parseFrom(bArr);
                    return this;
                }

                @Override // com.tencent.mm.protobuf.f
                public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderContent.ContentDetail parseFrom(byte[] bArr) {
                    return (com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderContent.ContentDetail) super.parseFrom(bArr);
                }
            }

            public static com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderContent create() {
                return new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderContent();
            }

            public static com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderContent getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderContent newBuilder() {
                return new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderContent();
            }

            public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderContent build() {
                return this;
            }

            @Override // com.tencent.mm.protobuf.f
            public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
                if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderContent)) {
                    return false;
                }
                com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderContent renderContent = (com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderContent) fVar;
                return n51.f.a(this.original, renderContent.original) && n51.f.a(this.thumbnail, renderContent.thumbnail);
            }

            public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderContent.ContentDetail getOriginal() {
                return this.original;
            }

            public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderContent.ContentDetail getThumbnail() {
                return this.thumbnail;
            }

            public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderContent mergeFrom(com.tencent.mm.protobuf.f fVar) {
                parseFrom(fVar.getData());
                return this;
            }

            @Override // com.tencent.mm.protobuf.f
            public com.tencent.mm.protobuf.f newInstance() {
                return new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderContent();
            }

            @Override // com.tencent.mm.protobuf.f
            public final int op(int i17, java.lang.Object... objArr) {
                if (i17 == 0) {
                    g36.f fVar = (g36.f) objArr[0];
                    com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderContent.ContentDetail contentDetail = this.original;
                    if (contentDetail != null) {
                        fVar.i(1, contentDetail.computeSize());
                        this.original.writeFields(fVar);
                    }
                    com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderContent.ContentDetail contentDetail2 = this.thumbnail;
                    if (contentDetail2 != null) {
                        fVar.i(2, contentDetail2.computeSize());
                        this.thumbnail.writeFields(fVar);
                    }
                    return 0;
                }
                if (i17 == 1) {
                    com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderContent.ContentDetail contentDetail3 = this.original;
                    int i18 = contentDetail3 != null ? 0 + b36.f.i(1, contentDetail3.computeSize()) : 0;
                    com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderContent.ContentDetail contentDetail4 = this.thumbnail;
                    return contentDetail4 != null ? i18 + b36.f.i(2, contentDetail4.computeSize()) : i18;
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
                    java.util.LinkedList j17 = aVar2.j(intValue);
                    int size = j17.size();
                    for (int i19 = 0; i19 < size; i19++) {
                        byte[] bArr = (byte[]) j17.get(i19);
                        com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderContent.ContentDetail contentDetail5 = new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderContent.ContentDetail();
                        if (bArr != null && bArr.length > 0) {
                            contentDetail5.parseFrom(bArr);
                        }
                        this.original = contentDetail5;
                    }
                    return 0;
                }
                if (intValue != 2) {
                    return -1;
                }
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderContent.ContentDetail contentDetail6 = new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderContent.ContentDetail();
                    if (bArr2 != null && bArr2.length > 0) {
                        contentDetail6.parseFrom(bArr2);
                    }
                    this.thumbnail = contentDetail6;
                }
                return 0;
            }

            public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderContent setOriginal(com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderContent.ContentDetail contentDetail) {
                this.original = contentDetail;
                return this;
            }

            public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderContent setThumbnail(com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderContent.ContentDetail contentDetail) {
                this.thumbnail = contentDetail;
                return this;
            }

            public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderContent mergeFrom(byte[] bArr) {
                parseFrom(bArr);
                return this;
            }

            @Override // com.tencent.mm.protobuf.f
            public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderContent parseFrom(byte[] bArr) {
                return (com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderContent) super.parseFrom(bArr);
            }
        }

        public static com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode create() {
            return new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode();
        }

        public static com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode newBuilder() {
            return new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode();
        }

        public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode build() {
            return this;
        }

        @Override // com.tencent.mm.protobuf.f
        public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
            if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode)) {
                return false;
            }
            com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode renderNode = (com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode) fVar;
            return n51.f.a(java.lang.Integer.valueOf(this.style), java.lang.Integer.valueOf(renderNode.style)) && n51.f.a(this.content, renderNode.content) && n51.f.a(this.attr, renderNode.attr);
        }

        public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr getAttr() {
            return this.attr;
        }

        public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderContent getContent() {
            return this.content;
        }

        public int getStyle() {
            return this.style;
        }

        public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode mergeFrom(com.tencent.mm.protobuf.f fVar) {
            parseFrom(fVar.getData());
            return this;
        }

        @Override // com.tencent.mm.protobuf.f
        public com.tencent.mm.protobuf.f newInstance() {
            return new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode();
        }

        @Override // com.tencent.mm.protobuf.f
        public final int op(int i17, java.lang.Object... objArr) {
            if (i17 == 0) {
                g36.f fVar = (g36.f) objArr[0];
                fVar.e(1, this.style);
                com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderContent renderContent = this.content;
                if (renderContent != null) {
                    fVar.i(2, renderContent.computeSize());
                    this.content.writeFields(fVar);
                }
                com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr renderAttr = this.attr;
                if (renderAttr != null) {
                    fVar.i(3, renderAttr.computeSize());
                    this.attr.writeFields(fVar);
                }
                return 0;
            }
            if (i17 == 1) {
                int e17 = b36.f.e(1, this.style) + 0;
                com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderContent renderContent2 = this.content;
                if (renderContent2 != null) {
                    e17 += b36.f.i(2, renderContent2.computeSize());
                }
                com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr renderAttr2 = this.attr;
                return renderAttr2 != null ? e17 + b36.f.i(3, renderAttr2.computeSize()) : e17;
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
                this.style = aVar2.g(intValue);
                return 0;
            }
            if (intValue == 2) {
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderContent renderContent3 = new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderContent();
                    if (bArr != null && bArr.length > 0) {
                        renderContent3.parseFrom(bArr);
                    }
                    this.content = renderContent3;
                }
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j18.get(i19);
                com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr renderAttr3 = new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr();
                if (bArr2 != null && bArr2.length > 0) {
                    renderAttr3.parseFrom(bArr2);
                }
                this.attr = renderAttr3;
            }
            return 0;
        }

        public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode setAttr(com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderAttr renderAttr) {
            this.attr = renderAttr;
            return this;
        }

        public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode setContent(com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode.RenderContent renderContent) {
            this.content = renderContent;
            return this;
        }

        public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode setStyle(int i17) {
            this.style = i17;
            return this;
        }

        public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode mergeFrom(byte[] bArr) {
            parseFrom(bArr);
            return this;
        }

        @Override // com.tencent.mm.protobuf.f
        public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode parseFrom(byte[] bArr) {
            return (com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode) super.parseFrom(bArr);
        }
    }

    public static com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl create() {
        return new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl();
    }

    public static com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl newBuilder() {
        return new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl();
    }

    public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl addAllElementNodes(java.util.Collection<com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode> collection) {
        this.nodes.addAll(collection);
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl addElementNodes(com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode renderNode) {
        this.nodes.add(renderNode);
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl) && n51.f.a(this.nodes, ((com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl) fVar).nodes);
    }

    public java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode> getNodes() {
        return this.nodes;
    }

    public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            ((g36.f) objArr[0]).g(1, 8, this.nodes);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, this.nodes) + 0;
        }
        if (i17 == 2) {
            this.nodes.clear();
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
            com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode renderNode = new com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode();
            if (bArr != null && bArr.length > 0) {
                renderNode.parseFrom(bArr);
            }
            this.nodes.add(renderNode);
        }
        return 0;
    }

    public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl setNodes(java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl.RenderNode> linkedList) {
        this.nodes = linkedList;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.newlife.FinderTabTipsDSLRenderTmpl) super.parseFrom(bArr);
    }
}
