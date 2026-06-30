package com.tencent.wechat.aff.newlife;

/* loaded from: classes4.dex */
public class FinderSyncClientStatus extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.newlife.FinderSyncClientStatus DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.FinderSyncClientStatus();
    public boolean hasDiscoveryReddot = false;
    public com.tencent.wechat.aff.newlife.ReddotSession reddot_session = com.tencent.wechat.aff.newlife.ReddotSession.getDefaultInstance();
    public com.tencent.wechat.aff.newlife.FinderNewLifePrefetchInfo finder_newlife_prefetch_info = com.tencent.wechat.aff.newlife.FinderNewLifePrefetchInfo.getDefaultInstance();
    public com.tencent.wechat.aff.newlife.FinderReddotFreqInfo finder_reddot_freq_info = com.tencent.wechat.aff.newlife.FinderReddotFreqInfo.getDefaultInstance();
    public boolean is_in_flow = false;

    public static com.tencent.wechat.aff.newlife.FinderSyncClientStatus create() {
        return new com.tencent.wechat.aff.newlife.FinderSyncClientStatus();
    }

    public static com.tencent.wechat.aff.newlife.FinderSyncClientStatus getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.newlife.FinderSyncClientStatus newBuilder() {
        return new com.tencent.wechat.aff.newlife.FinderSyncClientStatus();
    }

    public com.tencent.wechat.aff.newlife.FinderSyncClientStatus build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.FinderSyncClientStatus)) {
            return false;
        }
        com.tencent.wechat.aff.newlife.FinderSyncClientStatus finderSyncClientStatus = (com.tencent.wechat.aff.newlife.FinderSyncClientStatus) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.hasDiscoveryReddot), java.lang.Boolean.valueOf(finderSyncClientStatus.hasDiscoveryReddot)) && n51.f.a(this.reddot_session, finderSyncClientStatus.reddot_session) && n51.f.a(this.finder_newlife_prefetch_info, finderSyncClientStatus.finder_newlife_prefetch_info) && n51.f.a(this.finder_reddot_freq_info, finderSyncClientStatus.finder_reddot_freq_info) && n51.f.a(java.lang.Boolean.valueOf(this.is_in_flow), java.lang.Boolean.valueOf(finderSyncClientStatus.is_in_flow));
    }

    public com.tencent.wechat.aff.newlife.FinderNewLifePrefetchInfo getFinderNewlifePrefetchInfo() {
        return this.finder_newlife_prefetch_info;
    }

    public com.tencent.wechat.aff.newlife.FinderReddotFreqInfo getFinderReddotFreqInfo() {
        return this.finder_reddot_freq_info;
    }

    public com.tencent.wechat.aff.newlife.FinderNewLifePrefetchInfo getFinder_newlife_prefetch_info() {
        return this.finder_newlife_prefetch_info;
    }

    public com.tencent.wechat.aff.newlife.FinderReddotFreqInfo getFinder_reddot_freq_info() {
        return this.finder_reddot_freq_info;
    }

    public boolean getHasDiscoveryReddot() {
        return this.hasDiscoveryReddot;
    }

    public boolean getIsInFlow() {
        return this.is_in_flow;
    }

    public boolean getIs_in_flow() {
        return this.is_in_flow;
    }

    public com.tencent.wechat.aff.newlife.ReddotSession getReddotSession() {
        return this.reddot_session;
    }

    public com.tencent.wechat.aff.newlife.ReddotSession getReddot_session() {
        return this.reddot_session;
    }

    public com.tencent.wechat.aff.newlife.FinderSyncClientStatus mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.newlife.FinderSyncClientStatus();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.hasDiscoveryReddot);
            com.tencent.wechat.aff.newlife.ReddotSession reddotSession = this.reddot_session;
            if (reddotSession != null) {
                fVar.i(4, reddotSession.computeSize());
                this.reddot_session.writeFields(fVar);
            }
            com.tencent.wechat.aff.newlife.FinderNewLifePrefetchInfo finderNewLifePrefetchInfo = this.finder_newlife_prefetch_info;
            if (finderNewLifePrefetchInfo != null) {
                fVar.i(9, finderNewLifePrefetchInfo.computeSize());
                this.finder_newlife_prefetch_info.writeFields(fVar);
            }
            com.tencent.wechat.aff.newlife.FinderReddotFreqInfo finderReddotFreqInfo = this.finder_reddot_freq_info;
            if (finderReddotFreqInfo != null) {
                fVar.i(12, finderReddotFreqInfo.computeSize());
                this.finder_reddot_freq_info.writeFields(fVar);
            }
            fVar.a(13, this.is_in_flow);
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.hasDiscoveryReddot) + 0;
            com.tencent.wechat.aff.newlife.ReddotSession reddotSession2 = this.reddot_session;
            if (reddotSession2 != null) {
                a17 += b36.f.i(4, reddotSession2.computeSize());
            }
            com.tencent.wechat.aff.newlife.FinderNewLifePrefetchInfo finderNewLifePrefetchInfo2 = this.finder_newlife_prefetch_info;
            if (finderNewLifePrefetchInfo2 != null) {
                a17 += b36.f.i(9, finderNewLifePrefetchInfo2.computeSize());
            }
            com.tencent.wechat.aff.newlife.FinderReddotFreqInfo finderReddotFreqInfo2 = this.finder_reddot_freq_info;
            if (finderReddotFreqInfo2 != null) {
                a17 += b36.f.i(12, finderReddotFreqInfo2.computeSize());
            }
            return a17 + b36.f.a(13, this.is_in_flow);
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
            this.hasDiscoveryReddot = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                com.tencent.wechat.aff.newlife.ReddotSession reddotSession3 = new com.tencent.wechat.aff.newlife.ReddotSession();
                if (bArr != null && bArr.length > 0) {
                    reddotSession3.parseFrom(bArr);
                }
                this.reddot_session = reddotSession3;
            }
            return 0;
        }
        if (intValue == 9) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j18.get(i19);
                com.tencent.wechat.aff.newlife.FinderNewLifePrefetchInfo finderNewLifePrefetchInfo3 = new com.tencent.wechat.aff.newlife.FinderNewLifePrefetchInfo();
                if (bArr2 != null && bArr2.length > 0) {
                    finderNewLifePrefetchInfo3.parseFrom(bArr2);
                }
                this.finder_newlife_prefetch_info = finderNewLifePrefetchInfo3;
            }
            return 0;
        }
        if (intValue != 12) {
            if (intValue != 13) {
                return -1;
            }
            this.is_in_flow = aVar2.c(intValue);
            return 0;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr3 = (byte[]) j19.get(i27);
            com.tencent.wechat.aff.newlife.FinderReddotFreqInfo finderReddotFreqInfo3 = new com.tencent.wechat.aff.newlife.FinderReddotFreqInfo();
            if (bArr3 != null && bArr3.length > 0) {
                finderReddotFreqInfo3.parseFrom(bArr3);
            }
            this.finder_reddot_freq_info = finderReddotFreqInfo3;
        }
        return 0;
    }

    public com.tencent.wechat.aff.newlife.FinderSyncClientStatus setFinderNewlifePrefetchInfo(com.tencent.wechat.aff.newlife.FinderNewLifePrefetchInfo finderNewLifePrefetchInfo) {
        this.finder_newlife_prefetch_info = finderNewLifePrefetchInfo;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderSyncClientStatus setFinderReddotFreqInfo(com.tencent.wechat.aff.newlife.FinderReddotFreqInfo finderReddotFreqInfo) {
        this.finder_reddot_freq_info = finderReddotFreqInfo;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderSyncClientStatus setFinder_newlife_prefetch_info(com.tencent.wechat.aff.newlife.FinderNewLifePrefetchInfo finderNewLifePrefetchInfo) {
        this.finder_newlife_prefetch_info = finderNewLifePrefetchInfo;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderSyncClientStatus setFinder_reddot_freq_info(com.tencent.wechat.aff.newlife.FinderReddotFreqInfo finderReddotFreqInfo) {
        this.finder_reddot_freq_info = finderReddotFreqInfo;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderSyncClientStatus setHasDiscoveryReddot(boolean z17) {
        this.hasDiscoveryReddot = z17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderSyncClientStatus setIsInFlow(boolean z17) {
        this.is_in_flow = z17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderSyncClientStatus setIs_in_flow(boolean z17) {
        this.is_in_flow = z17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderSyncClientStatus setReddotSession(com.tencent.wechat.aff.newlife.ReddotSession reddotSession) {
        this.reddot_session = reddotSession;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderSyncClientStatus setReddot_session(com.tencent.wechat.aff.newlife.ReddotSession reddotSession) {
        this.reddot_session = reddotSession;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderSyncClientStatus mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.newlife.FinderSyncClientStatus parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.newlife.FinderSyncClientStatus) super.parseFrom(bArr);
    }
}
