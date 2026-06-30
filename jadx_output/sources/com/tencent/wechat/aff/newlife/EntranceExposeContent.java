package com.tencent.wechat.aff.newlife;

/* loaded from: classes8.dex */
public class EntranceExposeContent extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.newlife.EntranceExposeContent DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.EntranceExposeContent();
    public com.tencent.wechat.aff.newlife.ExposeRecord friend_record = com.tencent.wechat.aff.newlife.ExposeRecord.getDefaultInstance();
    public com.tencent.wechat.aff.newlife.ExposeRecord finder_record = com.tencent.wechat.aff.newlife.ExposeRecord.getDefaultInstance();
    public com.tencent.wechat.aff.newlife.ExposeRecord live_record = com.tencent.wechat.aff.newlife.ExposeRecord.getDefaultInstance();
    public int report_time = 0;

    public static com.tencent.wechat.aff.newlife.EntranceExposeContent create() {
        return new com.tencent.wechat.aff.newlife.EntranceExposeContent();
    }

    public static com.tencent.wechat.aff.newlife.EntranceExposeContent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.newlife.EntranceExposeContent newBuilder() {
        return new com.tencent.wechat.aff.newlife.EntranceExposeContent();
    }

    public com.tencent.wechat.aff.newlife.EntranceExposeContent build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.EntranceExposeContent)) {
            return false;
        }
        com.tencent.wechat.aff.newlife.EntranceExposeContent entranceExposeContent = (com.tencent.wechat.aff.newlife.EntranceExposeContent) fVar;
        return n51.f.a(this.friend_record, entranceExposeContent.friend_record) && n51.f.a(this.finder_record, entranceExposeContent.finder_record) && n51.f.a(this.live_record, entranceExposeContent.live_record) && n51.f.a(java.lang.Integer.valueOf(this.report_time), java.lang.Integer.valueOf(entranceExposeContent.report_time));
    }

    public com.tencent.wechat.aff.newlife.ExposeRecord getFinderRecord() {
        return this.finder_record;
    }

    public com.tencent.wechat.aff.newlife.ExposeRecord getFinder_record() {
        return this.finder_record;
    }

    public com.tencent.wechat.aff.newlife.ExposeRecord getFriendRecord() {
        return this.friend_record;
    }

    public com.tencent.wechat.aff.newlife.ExposeRecord getFriend_record() {
        return this.friend_record;
    }

    public com.tencent.wechat.aff.newlife.ExposeRecord getLiveRecord() {
        return this.live_record;
    }

    public com.tencent.wechat.aff.newlife.ExposeRecord getLive_record() {
        return this.live_record;
    }

    public int getReportTime() {
        return this.report_time;
    }

    public int getReport_time() {
        return this.report_time;
    }

    public com.tencent.wechat.aff.newlife.EntranceExposeContent mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.newlife.EntranceExposeContent();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.wechat.aff.newlife.ExposeRecord exposeRecord = this.friend_record;
            if (exposeRecord != null) {
                fVar.i(1, exposeRecord.computeSize());
                this.friend_record.writeFields(fVar);
            }
            com.tencent.wechat.aff.newlife.ExposeRecord exposeRecord2 = this.finder_record;
            if (exposeRecord2 != null) {
                fVar.i(2, exposeRecord2.computeSize());
                this.finder_record.writeFields(fVar);
            }
            com.tencent.wechat.aff.newlife.ExposeRecord exposeRecord3 = this.live_record;
            if (exposeRecord3 != null) {
                fVar.i(3, exposeRecord3.computeSize());
                this.live_record.writeFields(fVar);
            }
            fVar.e(4, this.report_time);
            return 0;
        }
        if (i17 == 1) {
            com.tencent.wechat.aff.newlife.ExposeRecord exposeRecord4 = this.friend_record;
            int i18 = exposeRecord4 != null ? 0 + b36.f.i(1, exposeRecord4.computeSize()) : 0;
            com.tencent.wechat.aff.newlife.ExposeRecord exposeRecord5 = this.finder_record;
            if (exposeRecord5 != null) {
                i18 += b36.f.i(2, exposeRecord5.computeSize());
            }
            com.tencent.wechat.aff.newlife.ExposeRecord exposeRecord6 = this.live_record;
            if (exposeRecord6 != null) {
                i18 += b36.f.i(3, exposeRecord6.computeSize());
            }
            return i18 + b36.f.e(4, this.report_time);
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
                com.tencent.wechat.aff.newlife.ExposeRecord exposeRecord7 = new com.tencent.wechat.aff.newlife.ExposeRecord();
                if (bArr != null && bArr.length > 0) {
                    exposeRecord7.parseFrom(bArr);
                }
                this.friend_record = exposeRecord7;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                com.tencent.wechat.aff.newlife.ExposeRecord exposeRecord8 = new com.tencent.wechat.aff.newlife.ExposeRecord();
                if (bArr2 != null && bArr2.length > 0) {
                    exposeRecord8.parseFrom(bArr2);
                }
                this.finder_record = exposeRecord8;
            }
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            this.report_time = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            com.tencent.wechat.aff.newlife.ExposeRecord exposeRecord9 = new com.tencent.wechat.aff.newlife.ExposeRecord();
            if (bArr3 != null && bArr3.length > 0) {
                exposeRecord9.parseFrom(bArr3);
            }
            this.live_record = exposeRecord9;
        }
        return 0;
    }

    public com.tencent.wechat.aff.newlife.EntranceExposeContent setFinderRecord(com.tencent.wechat.aff.newlife.ExposeRecord exposeRecord) {
        this.finder_record = exposeRecord;
        return this;
    }

    public com.tencent.wechat.aff.newlife.EntranceExposeContent setFinder_record(com.tencent.wechat.aff.newlife.ExposeRecord exposeRecord) {
        this.finder_record = exposeRecord;
        return this;
    }

    public com.tencent.wechat.aff.newlife.EntranceExposeContent setFriendRecord(com.tencent.wechat.aff.newlife.ExposeRecord exposeRecord) {
        this.friend_record = exposeRecord;
        return this;
    }

    public com.tencent.wechat.aff.newlife.EntranceExposeContent setFriend_record(com.tencent.wechat.aff.newlife.ExposeRecord exposeRecord) {
        this.friend_record = exposeRecord;
        return this;
    }

    public com.tencent.wechat.aff.newlife.EntranceExposeContent setLiveRecord(com.tencent.wechat.aff.newlife.ExposeRecord exposeRecord) {
        this.live_record = exposeRecord;
        return this;
    }

    public com.tencent.wechat.aff.newlife.EntranceExposeContent setLive_record(com.tencent.wechat.aff.newlife.ExposeRecord exposeRecord) {
        this.live_record = exposeRecord;
        return this;
    }

    public com.tencent.wechat.aff.newlife.EntranceExposeContent setReportTime(int i17) {
        this.report_time = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.EntranceExposeContent setReport_time(int i17) {
        this.report_time = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.EntranceExposeContent mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.newlife.EntranceExposeContent parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.newlife.EntranceExposeContent) super.parseFrom(bArr);
    }
}
