package com.tencent.wechat.aff.newlife;

/* loaded from: classes8.dex */
public class ExposeRecord extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.newlife.ExposeRecord DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.ExposeRecord();
    public int reddot_status = 0;
    public int action_count = 0;
    public int expose_count = 0;
    public int stay_time_sec = 0;
    public long enter_timestamp = 0;

    public static com.tencent.wechat.aff.newlife.ExposeRecord create() {
        return new com.tencent.wechat.aff.newlife.ExposeRecord();
    }

    public static com.tencent.wechat.aff.newlife.ExposeRecord getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.newlife.ExposeRecord newBuilder() {
        return new com.tencent.wechat.aff.newlife.ExposeRecord();
    }

    public com.tencent.wechat.aff.newlife.ExposeRecord build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.ExposeRecord)) {
            return false;
        }
        com.tencent.wechat.aff.newlife.ExposeRecord exposeRecord = (com.tencent.wechat.aff.newlife.ExposeRecord) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.reddot_status), java.lang.Integer.valueOf(exposeRecord.reddot_status)) && n51.f.a(java.lang.Integer.valueOf(this.action_count), java.lang.Integer.valueOf(exposeRecord.action_count)) && n51.f.a(java.lang.Integer.valueOf(this.expose_count), java.lang.Integer.valueOf(exposeRecord.expose_count)) && n51.f.a(java.lang.Integer.valueOf(this.stay_time_sec), java.lang.Integer.valueOf(exposeRecord.stay_time_sec)) && n51.f.a(java.lang.Long.valueOf(this.enter_timestamp), java.lang.Long.valueOf(exposeRecord.enter_timestamp));
    }

    public int getActionCount() {
        return this.action_count;
    }

    public int getAction_count() {
        return this.action_count;
    }

    public long getEnterTimestamp() {
        return this.enter_timestamp;
    }

    public long getEnter_timestamp() {
        return this.enter_timestamp;
    }

    public int getExposeCount() {
        return this.expose_count;
    }

    public int getExpose_count() {
        return this.expose_count;
    }

    public int getReddotStatus() {
        return this.reddot_status;
    }

    public int getReddot_status() {
        return this.reddot_status;
    }

    public int getStayTimeSec() {
        return this.stay_time_sec;
    }

    public int getStay_time_sec() {
        return this.stay_time_sec;
    }

    public com.tencent.wechat.aff.newlife.ExposeRecord mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.newlife.ExposeRecord();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.reddot_status);
            fVar.e(2, this.action_count);
            fVar.e(3, this.expose_count);
            fVar.e(4, this.stay_time_sec);
            fVar.h(5, this.enter_timestamp);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.reddot_status) + 0 + b36.f.e(2, this.action_count) + b36.f.e(3, this.expose_count) + b36.f.e(4, this.stay_time_sec) + b36.f.h(5, this.enter_timestamp);
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
            this.reddot_status = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.action_count = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            this.expose_count = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            this.stay_time_sec = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.enter_timestamp = aVar2.i(intValue);
        return 0;
    }

    public com.tencent.wechat.aff.newlife.ExposeRecord setActionCount(int i17) {
        this.action_count = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.ExposeRecord setAction_count(int i17) {
        this.action_count = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.ExposeRecord setEnterTimestamp(long j17) {
        this.enter_timestamp = j17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.ExposeRecord setEnter_timestamp(long j17) {
        this.enter_timestamp = j17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.ExposeRecord setExposeCount(int i17) {
        this.expose_count = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.ExposeRecord setExpose_count(int i17) {
        this.expose_count = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.ExposeRecord setReddotStatus(int i17) {
        this.reddot_status = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.ExposeRecord setReddot_status(int i17) {
        this.reddot_status = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.ExposeRecord setStayTimeSec(int i17) {
        this.stay_time_sec = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.ExposeRecord setStay_time_sec(int i17) {
        this.stay_time_sec = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.ExposeRecord mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.newlife.ExposeRecord parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.newlife.ExposeRecord) super.parseFrom(bArr);
    }
}
