package com.tencent.wechat.aff.newlife;

/* loaded from: classes4.dex */
public class FinderJumpInfo extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.newlife.FinderJumpInfo DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.FinderJumpInfo();
    public int business_type = 0;
    public java.lang.String jump_id = "";
    public java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderJumpInfo.Style> style = new java.util.LinkedList<>();
    public int effective_duration = 0;

    /* loaded from: classes4.dex */
    public static class Style extends com.tencent.mm.protobuf.f {
        private static final com.tencent.wechat.aff.newlife.FinderJumpInfo.Style DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.FinderJumpInfo.Style();
        public int show_position = 0;
        public int show_style = 0;

        public static com.tencent.wechat.aff.newlife.FinderJumpInfo.Style create() {
            return new com.tencent.wechat.aff.newlife.FinderJumpInfo.Style();
        }

        public static com.tencent.wechat.aff.newlife.FinderJumpInfo.Style getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.tencent.wechat.aff.newlife.FinderJumpInfo.Style newBuilder() {
            return new com.tencent.wechat.aff.newlife.FinderJumpInfo.Style();
        }

        public com.tencent.wechat.aff.newlife.FinderJumpInfo.Style build() {
            return this;
        }

        @Override // com.tencent.mm.protobuf.f
        public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
            if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.FinderJumpInfo.Style)) {
                return false;
            }
            com.tencent.wechat.aff.newlife.FinderJumpInfo.Style style = (com.tencent.wechat.aff.newlife.FinderJumpInfo.Style) fVar;
            return n51.f.a(java.lang.Integer.valueOf(this.show_position), java.lang.Integer.valueOf(style.show_position)) && n51.f.a(java.lang.Integer.valueOf(this.show_style), java.lang.Integer.valueOf(style.show_style));
        }

        public int getShowPosition() {
            return this.show_position;
        }

        public int getShowStyle() {
            return this.show_style;
        }

        public int getShow_position() {
            return this.show_position;
        }

        public int getShow_style() {
            return this.show_style;
        }

        public com.tencent.wechat.aff.newlife.FinderJumpInfo.Style mergeFrom(com.tencent.mm.protobuf.f fVar) {
            parseFrom(fVar.getData());
            return this;
        }

        @Override // com.tencent.mm.protobuf.f
        public com.tencent.mm.protobuf.f newInstance() {
            return new com.tencent.wechat.aff.newlife.FinderJumpInfo.Style();
        }

        @Override // com.tencent.mm.protobuf.f
        public final int op(int i17, java.lang.Object... objArr) {
            if (i17 == 0) {
                g36.f fVar = (g36.f) objArr[0];
                fVar.e(2, this.show_position);
                fVar.e(3, this.show_style);
                return 0;
            }
            if (i17 == 1) {
                return b36.f.e(2, this.show_position) + 0 + b36.f.e(3, this.show_style);
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
            if (intValue == 2) {
                this.show_position = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            this.show_style = aVar2.g(intValue);
            return 0;
        }

        public com.tencent.wechat.aff.newlife.FinderJumpInfo.Style setShowPosition(int i17) {
            this.show_position = i17;
            return this;
        }

        public com.tencent.wechat.aff.newlife.FinderJumpInfo.Style setShowStyle(int i17) {
            this.show_style = i17;
            return this;
        }

        public com.tencent.wechat.aff.newlife.FinderJumpInfo.Style setShow_position(int i17) {
            this.show_position = i17;
            return this;
        }

        public com.tencent.wechat.aff.newlife.FinderJumpInfo.Style setShow_style(int i17) {
            this.show_style = i17;
            return this;
        }

        public com.tencent.wechat.aff.newlife.FinderJumpInfo.Style mergeFrom(byte[] bArr) {
            parseFrom(bArr);
            return this;
        }

        @Override // com.tencent.mm.protobuf.f
        public com.tencent.wechat.aff.newlife.FinderJumpInfo.Style parseFrom(byte[] bArr) {
            return (com.tencent.wechat.aff.newlife.FinderJumpInfo.Style) super.parseFrom(bArr);
        }
    }

    public static com.tencent.wechat.aff.newlife.FinderJumpInfo create() {
        return new com.tencent.wechat.aff.newlife.FinderJumpInfo();
    }

    public static com.tencent.wechat.aff.newlife.FinderJumpInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.newlife.FinderJumpInfo newBuilder() {
        return new com.tencent.wechat.aff.newlife.FinderJumpInfo();
    }

    public com.tencent.wechat.aff.newlife.FinderJumpInfo addAllElementStyle(java.util.Collection<com.tencent.wechat.aff.newlife.FinderJumpInfo.Style> collection) {
        this.style.addAll(collection);
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderJumpInfo addElementStyle(com.tencent.wechat.aff.newlife.FinderJumpInfo.Style style) {
        this.style.add(style);
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderJumpInfo build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.FinderJumpInfo)) {
            return false;
        }
        com.tencent.wechat.aff.newlife.FinderJumpInfo finderJumpInfo = (com.tencent.wechat.aff.newlife.FinderJumpInfo) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.business_type), java.lang.Integer.valueOf(finderJumpInfo.business_type)) && n51.f.a(this.jump_id, finderJumpInfo.jump_id) && n51.f.a(this.style, finderJumpInfo.style) && n51.f.a(java.lang.Integer.valueOf(this.effective_duration), java.lang.Integer.valueOf(finderJumpInfo.effective_duration));
    }

    public int getBusinessType() {
        return this.business_type;
    }

    public int getBusiness_type() {
        return this.business_type;
    }

    public int getEffectiveDuration() {
        return this.effective_duration;
    }

    public int getEffective_duration() {
        return this.effective_duration;
    }

    public java.lang.String getJumpId() {
        return this.jump_id;
    }

    public java.lang.String getJump_id() {
        return this.jump_id;
    }

    public java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderJumpInfo.Style> getStyle() {
        return this.style;
    }

    public com.tencent.wechat.aff.newlife.FinderJumpInfo mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.newlife.FinderJumpInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(2, this.business_type);
            java.lang.String str = this.jump_id;
            if (str != null) {
                fVar.j(19, str);
            }
            fVar.g(26, 8, this.style);
            fVar.e(28, this.effective_duration);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(2, this.business_type) + 0;
            java.lang.String str2 = this.jump_id;
            if (str2 != null) {
                e17 += b36.f.j(19, str2);
            }
            return e17 + b36.f.g(26, 8, this.style) + b36.f.e(28, this.effective_duration);
        }
        if (i17 == 2) {
            this.style.clear();
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
        if (intValue == 2) {
            this.business_type = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 19) {
            this.jump_id = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 26) {
            if (intValue != 28) {
                return -1;
            }
            this.effective_duration = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.tencent.wechat.aff.newlife.FinderJumpInfo.Style style = new com.tencent.wechat.aff.newlife.FinderJumpInfo.Style();
            if (bArr != null && bArr.length > 0) {
                style.parseFrom(bArr);
            }
            this.style.add(style);
        }
        return 0;
    }

    public com.tencent.wechat.aff.newlife.FinderJumpInfo setBusinessType(int i17) {
        this.business_type = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderJumpInfo setBusiness_type(int i17) {
        this.business_type = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderJumpInfo setEffectiveDuration(int i17) {
        this.effective_duration = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderJumpInfo setEffective_duration(int i17) {
        this.effective_duration = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderJumpInfo setJumpId(java.lang.String str) {
        this.jump_id = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderJumpInfo setJump_id(java.lang.String str) {
        this.jump_id = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderJumpInfo setStyle(java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderJumpInfo.Style> linkedList) {
        this.style = linkedList;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderJumpInfo mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.newlife.FinderJumpInfo parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.newlife.FinderJumpInfo) super.parseFrom(bArr);
    }
}
