package kg;

/* loaded from: classes16.dex */
public final class x extends com.google.protobuf.l6 implements com.google.protobuf.r8 {
    public static final int BGM_CLIP_FIELD_NUMBER = 3;
    public static final int COORDINATING_DESC_FIELD_NUMBER = 1;
    public static final int LYRIC_OVERLAY_DESC_FIELD_NUMBER = 4;
    public static final int MAIN_CLIPS_FIELD_NUMBER = 2;
    public static final int STICKER_OVERLAY_DESCS_FIELD_NUMBER = 5;
    public static final int TEXT_OVERLAY_DESCS_FIELD_NUMBER = 6;
    private static final long serialVersionUID = 0;
    private kg.j bgmClip_;
    private kg.h0 coordinatingDesc_;
    private kg.b1 lyricOverlayDesc_;
    private java.util.List<kg.p> mainClips_;
    private byte memoizedIsInitialized;
    private java.util.List<kg.k1> stickerOverlayDescs_;
    private java.util.List<kg.o1> textOverlayDescs_;
    private static final kg.x DEFAULT_INSTANCE = new kg.x();
    private static final com.google.protobuf.e9 PARSER = new kg.v();

    public /* synthetic */ x(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var, kg.b bVar) {
        this(d0Var, t4Var);
    }

    public static /* synthetic */ boolean access$26400() {
        return com.google.protobuf.l6.alwaysUseFieldBuilders;
    }

    public static /* synthetic */ kg.h0 access$26602(kg.x xVar, kg.h0 h0Var) {
        xVar.coordinatingDesc_ = h0Var;
        return h0Var;
    }

    public static /* synthetic */ java.util.List access$26700(kg.x xVar) {
        return xVar.mainClips_;
    }

    public static /* synthetic */ java.util.List access$26702(kg.x xVar, java.util.List list) {
        xVar.mainClips_ = list;
        return list;
    }

    public static /* synthetic */ kg.j access$26802(kg.x xVar, kg.j jVar) {
        xVar.bgmClip_ = jVar;
        return jVar;
    }

    public static /* synthetic */ kg.b1 access$26902(kg.x xVar, kg.b1 b1Var) {
        xVar.lyricOverlayDesc_ = b1Var;
        return b1Var;
    }

    public static /* synthetic */ java.util.List access$27000(kg.x xVar) {
        return xVar.stickerOverlayDescs_;
    }

    public static /* synthetic */ java.util.List access$27002(kg.x xVar, java.util.List list) {
        xVar.stickerOverlayDescs_ = list;
        return list;
    }

    public static /* synthetic */ java.util.List access$27100(kg.x xVar) {
        return xVar.textOverlayDescs_;
    }

    public static /* synthetic */ java.util.List access$27102(kg.x xVar, java.util.List list) {
        xVar.textOverlayDescs_ = list;
        return list;
    }

    public static /* synthetic */ boolean access$27200() {
        return com.google.protobuf.l6.alwaysUseFieldBuilders;
    }

    public static /* synthetic */ boolean access$27300() {
        return com.google.protobuf.l6.alwaysUseFieldBuilders;
    }

    public static /* synthetic */ boolean access$27400() {
        return com.google.protobuf.l6.alwaysUseFieldBuilders;
    }

    public static /* synthetic */ com.google.protobuf.wa access$27500(kg.x xVar) {
        return xVar.unknownFields;
    }

    public static /* synthetic */ com.google.protobuf.e9 access$27600() {
        return PARSER;
    }

    public static kg.x getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final com.google.protobuf.r3 getDescriptor() {
        return kg.q2.O;
    }

    public static kg.w newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static kg.x parseDelimitedFrom(java.io.InputStream inputStream) {
        return (kg.x) com.google.protobuf.l6.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static kg.x parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (kg.x) PARSER.parseFrom(byteBuffer);
    }

    public static com.google.protobuf.e9 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kg.x)) {
            return super.equals(obj);
        }
        kg.x xVar = (kg.x) obj;
        if (hasCoordinatingDesc() != xVar.hasCoordinatingDesc()) {
            return false;
        }
        if ((hasCoordinatingDesc() && !getCoordinatingDesc().equals(xVar.getCoordinatingDesc())) || !getMainClipsList().equals(xVar.getMainClipsList()) || hasBgmClip() != xVar.hasBgmClip()) {
            return false;
        }
        if ((!hasBgmClip() || getBgmClip().equals(xVar.getBgmClip())) && hasLyricOverlayDesc() == xVar.hasLyricOverlayDesc()) {
            return (!hasLyricOverlayDesc() || getLyricOverlayDesc().equals(xVar.getLyricOverlayDesc())) && getStickerOverlayDescsList().equals(xVar.getStickerOverlayDescsList()) && getTextOverlayDescsList().equals(xVar.getTextOverlayDescsList()) && this.unknownFields.equals(xVar.unknownFields);
        }
        return false;
    }

    public kg.j getBgmClip() {
        kg.j jVar = this.bgmClip_;
        return jVar == null ? kg.j.getDefaultInstance() : jVar;
    }

    public kg.k getBgmClipOrBuilder() {
        return getBgmClip();
    }

    public kg.h0 getCoordinatingDesc() {
        kg.h0 h0Var = this.coordinatingDesc_;
        return h0Var == null ? kg.h0.getDefaultInstance() : h0Var;
    }

    public kg.i0 getCoordinatingDescOrBuilder() {
        return getCoordinatingDesc();
    }

    public kg.b1 getLyricOverlayDesc() {
        kg.b1 b1Var = this.lyricOverlayDesc_;
        return b1Var == null ? kg.b1.getDefaultInstance() : b1Var;
    }

    public kg.c1 getLyricOverlayDescOrBuilder() {
        return getLyricOverlayDesc();
    }

    public kg.p getMainClips(int i17) {
        return this.mainClips_.get(i17);
    }

    public int getMainClipsCount() {
        return this.mainClips_.size();
    }

    public java.util.List<kg.p> getMainClipsList() {
        return this.mainClips_;
    }

    public kg.q getMainClipsOrBuilder(int i17) {
        return this.mainClips_.get(i17);
    }

    public java.util.List<? extends kg.q> getMainClipsOrBuilderList() {
        return this.mainClips_;
    }

    public com.google.protobuf.e9 getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public int getSerializedSize() {
        int i17 = this.memoizedSize;
        if (i17 != -1) {
            return i17;
        }
        int n17 = this.coordinatingDesc_ != null ? com.google.protobuf.k0.n(1, getCoordinatingDesc()) + 0 : 0;
        for (int i18 = 0; i18 < this.mainClips_.size(); i18++) {
            n17 += com.google.protobuf.k0.n(2, this.mainClips_.get(i18));
        }
        if (this.bgmClip_ != null) {
            n17 += com.google.protobuf.k0.n(3, getBgmClip());
        }
        if (this.lyricOverlayDesc_ != null) {
            n17 += com.google.protobuf.k0.n(4, getLyricOverlayDesc());
        }
        for (int i19 = 0; i19 < this.stickerOverlayDescs_.size(); i19++) {
            n17 += com.google.protobuf.k0.n(5, this.stickerOverlayDescs_.get(i19));
        }
        for (int i27 = 0; i27 < this.textOverlayDescs_.size(); i27++) {
            n17 += com.google.protobuf.k0.n(6, this.textOverlayDescs_.get(i27));
        }
        int serializedSize = n17 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public kg.k1 getStickerOverlayDescs(int i17) {
        return this.stickerOverlayDescs_.get(i17);
    }

    public int getStickerOverlayDescsCount() {
        return this.stickerOverlayDescs_.size();
    }

    public java.util.List<kg.k1> getStickerOverlayDescsList() {
        return this.stickerOverlayDescs_;
    }

    public kg.l1 getStickerOverlayDescsOrBuilder(int i17) {
        return this.stickerOverlayDescs_.get(i17);
    }

    public java.util.List<? extends kg.l1> getStickerOverlayDescsOrBuilderList() {
        return this.stickerOverlayDescs_;
    }

    public kg.o1 getTextOverlayDescs(int i17) {
        return this.textOverlayDescs_.get(i17);
    }

    public int getTextOverlayDescsCount() {
        return this.textOverlayDescs_.size();
    }

    public java.util.List<kg.o1> getTextOverlayDescsList() {
        return this.textOverlayDescs_;
    }

    public kg.p1 getTextOverlayDescsOrBuilder(int i17) {
        return this.textOverlayDescs_.get(i17);
    }

    public java.util.List<? extends kg.p1> getTextOverlayDescsOrBuilderList() {
        return this.textOverlayDescs_;
    }

    @Override // com.google.protobuf.r8
    public final com.google.protobuf.wa getUnknownFields() {
        return this.unknownFields;
    }

    public boolean hasBgmClip() {
        return this.bgmClip_ != null;
    }

    public boolean hasCoordinatingDesc() {
        return this.coordinatingDesc_ != null;
    }

    public boolean hasLyricOverlayDesc() {
        return this.lyricOverlayDesc_ != null;
    }

    @Override // com.google.protobuf.c
    public int hashCode() {
        int i17 = this.memoizedHashCode;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX + getDescriptor().hashCode();
        if (hasCoordinatingDesc()) {
            hashCode = (((hashCode * 37) + 1) * 53) + getCoordinatingDesc().hashCode();
        }
        if (getMainClipsCount() > 0) {
            hashCode = (((hashCode * 37) + 2) * 53) + getMainClipsList().hashCode();
        }
        if (hasBgmClip()) {
            hashCode = (((hashCode * 37) + 3) * 53) + getBgmClip().hashCode();
        }
        if (hasLyricOverlayDesc()) {
            hashCode = (((hashCode * 37) + 4) * 53) + getLyricOverlayDesc().hashCode();
        }
        if (getStickerOverlayDescsCount() > 0) {
            hashCode = (((hashCode * 37) + 5) * 53) + getStickerOverlayDescsList().hashCode();
        }
        if (getTextOverlayDescsCount() > 0) {
            hashCode = (((hashCode * 37) + 6) * 53) + getTextOverlayDescsList().hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = kg.q2.P;
        j6Var.c(kg.x.class, kg.w.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.p8
    public final boolean isInitialized() {
        byte b17 = this.memoizedIsInitialized;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new kg.x();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        if (this.coordinatingDesc_ != null) {
            k0Var.J(1, getCoordinatingDesc());
        }
        for (int i17 = 0; i17 < this.mainClips_.size(); i17++) {
            k0Var.J(2, this.mainClips_.get(i17));
        }
        if (this.bgmClip_ != null) {
            k0Var.J(3, getBgmClip());
        }
        if (this.lyricOverlayDesc_ != null) {
            k0Var.J(4, getLyricOverlayDesc());
        }
        for (int i18 = 0; i18 < this.stickerOverlayDescs_.size(); i18++) {
            k0Var.J(5, this.stickerOverlayDescs_.get(i18));
        }
        for (int i19 = 0; i19 < this.textOverlayDescs_.size(); i19++) {
            k0Var.J(6, this.textOverlayDescs_.get(i19));
        }
        this.unknownFields.writeTo(k0Var);
    }

    public /* synthetic */ x(com.google.protobuf.q5 q5Var, kg.b bVar) {
        this(q5Var);
    }

    public static kg.w newBuilder(kg.x xVar) {
        kg.w builder = DEFAULT_INSTANCE.toBuilder();
        builder.h(xVar);
        return builder;
    }

    public static kg.x parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.t4 t4Var) {
        return (kg.x) PARSER.parseFrom(byteBuffer, t4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public x(com.google.protobuf.q5 q5Var) {
        super(q5Var);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static kg.x parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (kg.x) com.google.protobuf.l6.parseDelimitedWithIOException(PARSER, inputStream, t4Var);
    }

    public static kg.x parseFrom(com.google.protobuf.y yVar) {
        return (kg.x) PARSER.parseFrom(yVar);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public kg.x getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public kg.w toBuilder() {
        if (this == DEFAULT_INSTANCE) {
            return new kg.w(null);
        }
        kg.w wVar = new kg.w(null);
        wVar.h(this);
        return wVar;
    }

    public static kg.x parseFrom(com.google.protobuf.y yVar, com.google.protobuf.t4 t4Var) {
        return (kg.x) PARSER.parseFrom(yVar, t4Var);
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public kg.w newBuilderForType() {
        return newBuilder();
    }

    private x() {
        this.memoizedIsInitialized = (byte) -1;
        this.mainClips_ = java.util.Collections.emptyList();
        this.stickerOverlayDescs_ = java.util.Collections.emptyList();
        this.textOverlayDescs_ = java.util.Collections.emptyList();
    }

    public static kg.x parseFrom(byte[] bArr) {
        return (kg.x) PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.l6
    public kg.w newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new kg.w(r5Var, null);
    }

    public static kg.x parseFrom(byte[] bArr, com.google.protobuf.t4 t4Var) {
        return (kg.x) PARSER.parseFrom(bArr, t4Var);
    }

    public static kg.x parseFrom(java.io.InputStream inputStream) {
        return (kg.x) com.google.protobuf.l6.parseWithIOException(PARSER, inputStream);
    }

    public static kg.x parseFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (kg.x) com.google.protobuf.l6.parseWithIOException(PARSER, inputStream, t4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public x(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        this();
        t4Var.getClass();
        com.google.protobuf.sa b17 = com.google.protobuf.wa.b();
        boolean z17 = false;
        char c17 = 0;
        while (!z17) {
            try {
                try {
                    try {
                        int F = d0Var.F();
                        if (F != 0) {
                            if (F == 10) {
                                kg.h0 h0Var = this.coordinatingDesc_;
                                kg.g0 builder = h0Var != null ? h0Var.toBuilder() : null;
                                kg.h0 h0Var2 = (kg.h0) d0Var.v(kg.h0.parser(), t4Var);
                                this.coordinatingDesc_ = h0Var2;
                                if (builder != null) {
                                    builder.e(h0Var2);
                                    this.coordinatingDesc_ = builder.buildPartial();
                                }
                            } else if (F == 18) {
                                int i17 = (c17 == true ? 1 : 0) & 1;
                                c17 = c17;
                                if (i17 == 0) {
                                    this.mainClips_ = new java.util.ArrayList();
                                    c17 = (c17 == true ? 1 : 0) | 1;
                                }
                                this.mainClips_.add((kg.p) d0Var.v(kg.p.parser(), t4Var));
                            } else if (F == 26) {
                                kg.j jVar = this.bgmClip_;
                                kg.i builder2 = jVar != null ? jVar.toBuilder() : null;
                                kg.j jVar2 = (kg.j) d0Var.v(kg.j.parser(), t4Var);
                                this.bgmClip_ = jVar2;
                                if (builder2 != null) {
                                    builder2.e(jVar2);
                                    this.bgmClip_ = builder2.buildPartial();
                                }
                            } else if (F == 34) {
                                kg.b1 b1Var = this.lyricOverlayDesc_;
                                kg.a1 builder3 = b1Var != null ? b1Var.toBuilder() : null;
                                kg.b1 b1Var2 = (kg.b1) d0Var.v(kg.b1.parser(), t4Var);
                                this.lyricOverlayDesc_ = b1Var2;
                                if (builder3 != null) {
                                    builder3.f(b1Var2);
                                    this.lyricOverlayDesc_ = builder3.buildPartial();
                                }
                            } else if (F == 42) {
                                int i18 = (c17 == true ? 1 : 0) & 2;
                                c17 = c17;
                                if (i18 == 0) {
                                    this.stickerOverlayDescs_ = new java.util.ArrayList();
                                    c17 = (c17 == true ? 1 : 0) | 2;
                                }
                                this.stickerOverlayDescs_.add((kg.k1) d0Var.v(kg.k1.parser(), t4Var));
                            } else if (F != 50) {
                                if (!parseUnknownField(d0Var, b17, t4Var, F)) {
                                }
                            } else {
                                int i19 = (c17 == true ? 1 : 0) & 4;
                                c17 = c17;
                                if (i19 == 0) {
                                    this.textOverlayDescs_ = new java.util.ArrayList();
                                    c17 = (c17 == true ? 1 : 0) | 4;
                                }
                                this.textOverlayDescs_.add((kg.o1) d0Var.v(kg.o1.parser(), t4Var));
                            }
                        }
                        z17 = true;
                    } catch (com.google.protobuf.y6 e17) {
                        e17.f45739d = this;
                        throw e17;
                    }
                } catch (java.io.IOException e18) {
                    com.google.protobuf.y6 y6Var = new com.google.protobuf.y6(e18);
                    y6Var.f45739d = this;
                    throw y6Var;
                }
            } finally {
                if (((c17 == true ? 1 : 0) & 1) != 0) {
                    this.mainClips_ = java.util.Collections.unmodifiableList(this.mainClips_);
                }
                if (((c17 == true ? 1 : 0) & 2) != 0) {
                    this.stickerOverlayDescs_ = java.util.Collections.unmodifiableList(this.stickerOverlayDescs_);
                }
                if (((c17 == true ? 1 : 0) & 4) != 0) {
                    this.textOverlayDescs_ = java.util.Collections.unmodifiableList(this.textOverlayDescs_);
                }
                this.unknownFields = b17.build();
                makeExtensionsImmutable();
            }
        }
    }

    public static kg.x parseFrom(com.google.protobuf.d0 d0Var) {
        return (kg.x) com.google.protobuf.l6.parseWithIOException(PARSER, d0Var);
    }

    public static kg.x parseFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        return (kg.x) com.google.protobuf.l6.parseWithIOException(PARSER, d0Var, t4Var);
    }
}
