package com.tencent.wechat.aff.newlife;

/* loaded from: classes8.dex */
public class FinderSyncClientInfo extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.newlife.FinderSyncClientInfo DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.FinderSyncClientInfo();
    public int finder_entrance_title_length_limit = 0;
    public int finder_entrance_single_title_length_limit = 0;
    public com.tencent.wechat.aff.newlife.LongVideoClientInfo longvideo_client_info = com.tencent.wechat.aff.newlife.LongVideoClientInfo.getDefaultInstance();

    public static com.tencent.wechat.aff.newlife.FinderSyncClientInfo create() {
        return new com.tencent.wechat.aff.newlife.FinderSyncClientInfo();
    }

    public static com.tencent.wechat.aff.newlife.FinderSyncClientInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.newlife.FinderSyncClientInfo newBuilder() {
        return new com.tencent.wechat.aff.newlife.FinderSyncClientInfo();
    }

    public com.tencent.wechat.aff.newlife.FinderSyncClientInfo build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.FinderSyncClientInfo)) {
            return false;
        }
        com.tencent.wechat.aff.newlife.FinderSyncClientInfo finderSyncClientInfo = (com.tencent.wechat.aff.newlife.FinderSyncClientInfo) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.finder_entrance_title_length_limit), java.lang.Integer.valueOf(finderSyncClientInfo.finder_entrance_title_length_limit)) && n51.f.a(java.lang.Integer.valueOf(this.finder_entrance_single_title_length_limit), java.lang.Integer.valueOf(finderSyncClientInfo.finder_entrance_single_title_length_limit)) && n51.f.a(this.longvideo_client_info, finderSyncClientInfo.longvideo_client_info);
    }

    public int getFinderEntranceSingleTitleLengthLimit() {
        return this.finder_entrance_single_title_length_limit;
    }

    public int getFinderEntranceTitleLengthLimit() {
        return this.finder_entrance_title_length_limit;
    }

    public int getFinder_entrance_single_title_length_limit() {
        return this.finder_entrance_single_title_length_limit;
    }

    public int getFinder_entrance_title_length_limit() {
        return this.finder_entrance_title_length_limit;
    }

    public com.tencent.wechat.aff.newlife.LongVideoClientInfo getLongvideoClientInfo() {
        return this.longvideo_client_info;
    }

    public com.tencent.wechat.aff.newlife.LongVideoClientInfo getLongvideo_client_info() {
        return this.longvideo_client_info;
    }

    public com.tencent.wechat.aff.newlife.FinderSyncClientInfo mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.newlife.FinderSyncClientInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.finder_entrance_title_length_limit);
            fVar.e(2, this.finder_entrance_single_title_length_limit);
            com.tencent.wechat.aff.newlife.LongVideoClientInfo longVideoClientInfo = this.longvideo_client_info;
            if (longVideoClientInfo != null) {
                fVar.i(101, longVideoClientInfo.computeSize());
                this.longvideo_client_info.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.finder_entrance_title_length_limit) + 0 + b36.f.e(2, this.finder_entrance_single_title_length_limit);
            com.tencent.wechat.aff.newlife.LongVideoClientInfo longVideoClientInfo2 = this.longvideo_client_info;
            return longVideoClientInfo2 != null ? e17 + b36.f.i(101, longVideoClientInfo2.computeSize()) : e17;
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
            this.finder_entrance_title_length_limit = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.finder_entrance_single_title_length_limit = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 101) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.tencent.wechat.aff.newlife.LongVideoClientInfo longVideoClientInfo3 = new com.tencent.wechat.aff.newlife.LongVideoClientInfo();
            if (bArr != null && bArr.length > 0) {
                longVideoClientInfo3.parseFrom(bArr);
            }
            this.longvideo_client_info = longVideoClientInfo3;
        }
        return 0;
    }

    public com.tencent.wechat.aff.newlife.FinderSyncClientInfo setFinderEntranceSingleTitleLengthLimit(int i17) {
        this.finder_entrance_single_title_length_limit = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderSyncClientInfo setFinderEntranceTitleLengthLimit(int i17) {
        this.finder_entrance_title_length_limit = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderSyncClientInfo setFinder_entrance_single_title_length_limit(int i17) {
        this.finder_entrance_single_title_length_limit = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderSyncClientInfo setFinder_entrance_title_length_limit(int i17) {
        this.finder_entrance_title_length_limit = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderSyncClientInfo setLongvideoClientInfo(com.tencent.wechat.aff.newlife.LongVideoClientInfo longVideoClientInfo) {
        this.longvideo_client_info = longVideoClientInfo;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderSyncClientInfo setLongvideo_client_info(com.tencent.wechat.aff.newlife.LongVideoClientInfo longVideoClientInfo) {
        this.longvideo_client_info = longVideoClientInfo;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderSyncClientInfo mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.newlife.FinderSyncClientInfo parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.newlife.FinderSyncClientInfo) super.parseFrom(bArr);
    }
}
