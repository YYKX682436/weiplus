package com.tencent.wechat.aff.newlife;

/* loaded from: classes4.dex */
public class FinderReddotFreqInfo extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.newlife.FinderReddotFreqInfo DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.FinderReddotFreqInfo();
    public java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderReddotFreqInfo.ExposeInfo> expose_infos = new java.util.LinkedList<>();
    public com.tencent.wechat.aff.newlife.FinderReddotFreqConfig finder_reddot_freq_config = com.tencent.wechat.aff.newlife.FinderReddotFreqConfig.getDefaultInstance();

    /* loaded from: classes4.dex */
    public static class ExposeInfo extends com.tencent.mm.protobuf.f {
        private static final com.tencent.wechat.aff.newlife.FinderReddotFreqInfo.ExposeInfo DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.FinderReddotFreqInfo.ExposeInfo();
        public java.lang.String path = "";
        public int accum_expose_count = 0;
        public int accum_penalty_count = 0;
        public int business_type = 0;
        public boolean is_penalized = false;
        public boolean is_next_penalized = false;

        public static com.tencent.wechat.aff.newlife.FinderReddotFreqInfo.ExposeInfo create() {
            return new com.tencent.wechat.aff.newlife.FinderReddotFreqInfo.ExposeInfo();
        }

        public static com.tencent.wechat.aff.newlife.FinderReddotFreqInfo.ExposeInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.tencent.wechat.aff.newlife.FinderReddotFreqInfo.ExposeInfo newBuilder() {
            return new com.tencent.wechat.aff.newlife.FinderReddotFreqInfo.ExposeInfo();
        }

        public com.tencent.wechat.aff.newlife.FinderReddotFreqInfo.ExposeInfo build() {
            return this;
        }

        @Override // com.tencent.mm.protobuf.f
        public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
            if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.FinderReddotFreqInfo.ExposeInfo)) {
                return false;
            }
            com.tencent.wechat.aff.newlife.FinderReddotFreqInfo.ExposeInfo exposeInfo = (com.tencent.wechat.aff.newlife.FinderReddotFreqInfo.ExposeInfo) fVar;
            return n51.f.a(this.path, exposeInfo.path) && n51.f.a(java.lang.Integer.valueOf(this.accum_expose_count), java.lang.Integer.valueOf(exposeInfo.accum_expose_count)) && n51.f.a(java.lang.Integer.valueOf(this.accum_penalty_count), java.lang.Integer.valueOf(exposeInfo.accum_penalty_count)) && n51.f.a(java.lang.Integer.valueOf(this.business_type), java.lang.Integer.valueOf(exposeInfo.business_type)) && n51.f.a(java.lang.Boolean.valueOf(this.is_penalized), java.lang.Boolean.valueOf(exposeInfo.is_penalized)) && n51.f.a(java.lang.Boolean.valueOf(this.is_next_penalized), java.lang.Boolean.valueOf(exposeInfo.is_next_penalized));
        }

        public int getAccumExposeCount() {
            return this.accum_expose_count;
        }

        public int getAccumPenaltyCount() {
            return this.accum_penalty_count;
        }

        public int getAccum_expose_count() {
            return this.accum_expose_count;
        }

        public int getAccum_penalty_count() {
            return this.accum_penalty_count;
        }

        public int getBusinessType() {
            return this.business_type;
        }

        public int getBusiness_type() {
            return this.business_type;
        }

        public boolean getIsNextPenalized() {
            return this.is_next_penalized;
        }

        public boolean getIsPenalized() {
            return this.is_penalized;
        }

        public boolean getIs_next_penalized() {
            return this.is_next_penalized;
        }

        public boolean getIs_penalized() {
            return this.is_penalized;
        }

        public java.lang.String getPath() {
            return this.path;
        }

        public com.tencent.wechat.aff.newlife.FinderReddotFreqInfo.ExposeInfo mergeFrom(com.tencent.mm.protobuf.f fVar) {
            parseFrom(fVar.getData());
            return this;
        }

        @Override // com.tencent.mm.protobuf.f
        public com.tencent.mm.protobuf.f newInstance() {
            return new com.tencent.wechat.aff.newlife.FinderReddotFreqInfo.ExposeInfo();
        }

        @Override // com.tencent.mm.protobuf.f
        public final int op(int i17, java.lang.Object... objArr) {
            if (i17 == 0) {
                g36.f fVar = (g36.f) objArr[0];
                java.lang.String str = this.path;
                if (str != null) {
                    fVar.j(1, str);
                }
                fVar.e(2, this.accum_expose_count);
                fVar.e(3, this.accum_penalty_count);
                fVar.e(4, this.business_type);
                fVar.a(5, this.is_penalized);
                fVar.a(6, this.is_next_penalized);
                return 0;
            }
            if (i17 == 1) {
                java.lang.String str2 = this.path;
                return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.accum_expose_count) + b36.f.e(3, this.accum_penalty_count) + b36.f.e(4, this.business_type) + b36.f.a(5, this.is_penalized) + b36.f.a(6, this.is_next_penalized);
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
                    this.path = aVar2.k(intValue);
                    return 0;
                case 2:
                    this.accum_expose_count = aVar2.g(intValue);
                    return 0;
                case 3:
                    this.accum_penalty_count = aVar2.g(intValue);
                    return 0;
                case 4:
                    this.business_type = aVar2.g(intValue);
                    return 0;
                case 5:
                    this.is_penalized = aVar2.c(intValue);
                    return 0;
                case 6:
                    this.is_next_penalized = aVar2.c(intValue);
                    return 0;
                default:
                    return -1;
            }
        }

        public com.tencent.wechat.aff.newlife.FinderReddotFreqInfo.ExposeInfo setAccumExposeCount(int i17) {
            this.accum_expose_count = i17;
            return this;
        }

        public com.tencent.wechat.aff.newlife.FinderReddotFreqInfo.ExposeInfo setAccumPenaltyCount(int i17) {
            this.accum_penalty_count = i17;
            return this;
        }

        public com.tencent.wechat.aff.newlife.FinderReddotFreqInfo.ExposeInfo setAccum_expose_count(int i17) {
            this.accum_expose_count = i17;
            return this;
        }

        public com.tencent.wechat.aff.newlife.FinderReddotFreqInfo.ExposeInfo setAccum_penalty_count(int i17) {
            this.accum_penalty_count = i17;
            return this;
        }

        public com.tencent.wechat.aff.newlife.FinderReddotFreqInfo.ExposeInfo setBusinessType(int i17) {
            this.business_type = i17;
            return this;
        }

        public com.tencent.wechat.aff.newlife.FinderReddotFreqInfo.ExposeInfo setBusiness_type(int i17) {
            this.business_type = i17;
            return this;
        }

        public com.tencent.wechat.aff.newlife.FinderReddotFreqInfo.ExposeInfo setIsNextPenalized(boolean z17) {
            this.is_next_penalized = z17;
            return this;
        }

        public com.tencent.wechat.aff.newlife.FinderReddotFreqInfo.ExposeInfo setIsPenalized(boolean z17) {
            this.is_penalized = z17;
            return this;
        }

        public com.tencent.wechat.aff.newlife.FinderReddotFreqInfo.ExposeInfo setIs_next_penalized(boolean z17) {
            this.is_next_penalized = z17;
            return this;
        }

        public com.tencent.wechat.aff.newlife.FinderReddotFreqInfo.ExposeInfo setIs_penalized(boolean z17) {
            this.is_penalized = z17;
            return this;
        }

        public com.tencent.wechat.aff.newlife.FinderReddotFreqInfo.ExposeInfo setPath(java.lang.String str) {
            this.path = str;
            return this;
        }

        public com.tencent.wechat.aff.newlife.FinderReddotFreqInfo.ExposeInfo mergeFrom(byte[] bArr) {
            parseFrom(bArr);
            return this;
        }

        @Override // com.tencent.mm.protobuf.f
        public com.tencent.wechat.aff.newlife.FinderReddotFreqInfo.ExposeInfo parseFrom(byte[] bArr) {
            return (com.tencent.wechat.aff.newlife.FinderReddotFreqInfo.ExposeInfo) super.parseFrom(bArr);
        }
    }

    public static com.tencent.wechat.aff.newlife.FinderReddotFreqInfo create() {
        return new com.tencent.wechat.aff.newlife.FinderReddotFreqInfo();
    }

    public static com.tencent.wechat.aff.newlife.FinderReddotFreqInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.newlife.FinderReddotFreqInfo newBuilder() {
        return new com.tencent.wechat.aff.newlife.FinderReddotFreqInfo();
    }

    public com.tencent.wechat.aff.newlife.FinderReddotFreqInfo addAllElementExposeInfos(java.util.Collection<com.tencent.wechat.aff.newlife.FinderReddotFreqInfo.ExposeInfo> collection) {
        this.expose_infos.addAll(collection);
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderReddotFreqInfo addAllElementExpose_infos(java.util.Collection<com.tencent.wechat.aff.newlife.FinderReddotFreqInfo.ExposeInfo> collection) {
        this.expose_infos.addAll(collection);
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderReddotFreqInfo addElementExposeInfos(com.tencent.wechat.aff.newlife.FinderReddotFreqInfo.ExposeInfo exposeInfo) {
        this.expose_infos.add(exposeInfo);
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderReddotFreqInfo addElementExpose_infos(com.tencent.wechat.aff.newlife.FinderReddotFreqInfo.ExposeInfo exposeInfo) {
        this.expose_infos.add(exposeInfo);
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderReddotFreqInfo build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.FinderReddotFreqInfo)) {
            return false;
        }
        com.tencent.wechat.aff.newlife.FinderReddotFreqInfo finderReddotFreqInfo = (com.tencent.wechat.aff.newlife.FinderReddotFreqInfo) fVar;
        return n51.f.a(this.expose_infos, finderReddotFreqInfo.expose_infos) && n51.f.a(this.finder_reddot_freq_config, finderReddotFreqInfo.finder_reddot_freq_config);
    }

    public java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderReddotFreqInfo.ExposeInfo> getExposeInfos() {
        return this.expose_infos;
    }

    public java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderReddotFreqInfo.ExposeInfo> getExpose_infos() {
        return this.expose_infos;
    }

    public com.tencent.wechat.aff.newlife.FinderReddotFreqConfig getFinderReddotFreqConfig() {
        return this.finder_reddot_freq_config;
    }

    public com.tencent.wechat.aff.newlife.FinderReddotFreqConfig getFinder_reddot_freq_config() {
        return this.finder_reddot_freq_config;
    }

    public com.tencent.wechat.aff.newlife.FinderReddotFreqInfo mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.newlife.FinderReddotFreqInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, this.expose_infos);
            com.tencent.wechat.aff.newlife.FinderReddotFreqConfig finderReddotFreqConfig = this.finder_reddot_freq_config;
            if (finderReddotFreqConfig != null) {
                fVar.i(2, finderReddotFreqConfig.computeSize());
                this.finder_reddot_freq_config.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, this.expose_infos) + 0;
            com.tencent.wechat.aff.newlife.FinderReddotFreqConfig finderReddotFreqConfig2 = this.finder_reddot_freq_config;
            return finderReddotFreqConfig2 != null ? g17 + b36.f.i(2, finderReddotFreqConfig2.computeSize()) : g17;
        }
        if (i17 == 2) {
            this.expose_infos.clear();
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
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                com.tencent.wechat.aff.newlife.FinderReddotFreqInfo.ExposeInfo exposeInfo = new com.tencent.wechat.aff.newlife.FinderReddotFreqInfo.ExposeInfo();
                if (bArr != null && bArr.length > 0) {
                    exposeInfo.parseFrom(bArr);
                }
                this.expose_infos.add(exposeInfo);
            }
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            com.tencent.wechat.aff.newlife.FinderReddotFreqConfig finderReddotFreqConfig3 = new com.tencent.wechat.aff.newlife.FinderReddotFreqConfig();
            if (bArr2 != null && bArr2.length > 0) {
                finderReddotFreqConfig3.parseFrom(bArr2);
            }
            this.finder_reddot_freq_config = finderReddotFreqConfig3;
        }
        return 0;
    }

    public com.tencent.wechat.aff.newlife.FinderReddotFreqInfo setExposeInfos(java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderReddotFreqInfo.ExposeInfo> linkedList) {
        this.expose_infos = linkedList;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderReddotFreqInfo setExpose_infos(java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderReddotFreqInfo.ExposeInfo> linkedList) {
        this.expose_infos = linkedList;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderReddotFreqInfo setFinderReddotFreqConfig(com.tencent.wechat.aff.newlife.FinderReddotFreqConfig finderReddotFreqConfig) {
        this.finder_reddot_freq_config = finderReddotFreqConfig;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderReddotFreqInfo setFinder_reddot_freq_config(com.tencent.wechat.aff.newlife.FinderReddotFreqConfig finderReddotFreqConfig) {
        this.finder_reddot_freq_config = finderReddotFreqConfig;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderReddotFreqInfo mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.newlife.FinderReddotFreqInfo parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.newlife.FinderReddotFreqInfo) super.parseFrom(bArr);
    }
}
