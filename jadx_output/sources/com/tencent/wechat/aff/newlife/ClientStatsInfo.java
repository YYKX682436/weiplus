package com.tencent.wechat.aff.newlife;

/* loaded from: classes8.dex */
public class ClientStatsInfo extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.newlife.ClientStatsInfo DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.ClientStatsInfo();
    public int expose_count = 0;
    public java.lang.String oob = "";
    public long first_expose_time = 0;
    public int had_sync_for_cold_time = 0;
    public long last_expose_time = 0;

    public static com.tencent.wechat.aff.newlife.ClientStatsInfo create() {
        return new com.tencent.wechat.aff.newlife.ClientStatsInfo();
    }

    public static com.tencent.wechat.aff.newlife.ClientStatsInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.newlife.ClientStatsInfo newBuilder() {
        return new com.tencent.wechat.aff.newlife.ClientStatsInfo();
    }

    public com.tencent.wechat.aff.newlife.ClientStatsInfo build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.ClientStatsInfo)) {
            return false;
        }
        com.tencent.wechat.aff.newlife.ClientStatsInfo clientStatsInfo = (com.tencent.wechat.aff.newlife.ClientStatsInfo) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.expose_count), java.lang.Integer.valueOf(clientStatsInfo.expose_count)) && n51.f.a(this.oob, clientStatsInfo.oob) && n51.f.a(java.lang.Long.valueOf(this.first_expose_time), java.lang.Long.valueOf(clientStatsInfo.first_expose_time)) && n51.f.a(java.lang.Integer.valueOf(this.had_sync_for_cold_time), java.lang.Integer.valueOf(clientStatsInfo.had_sync_for_cold_time)) && n51.f.a(java.lang.Long.valueOf(this.last_expose_time), java.lang.Long.valueOf(clientStatsInfo.last_expose_time));
    }

    public int getExposeCount() {
        return this.expose_count;
    }

    public int getExpose_count() {
        return this.expose_count;
    }

    public long getFirstExposeTime() {
        return this.first_expose_time;
    }

    public long getFirst_expose_time() {
        return this.first_expose_time;
    }

    public int getHadSyncForColdTime() {
        return this.had_sync_for_cold_time;
    }

    public int getHad_sync_for_cold_time() {
        return this.had_sync_for_cold_time;
    }

    public long getLastExposeTime() {
        return this.last_expose_time;
    }

    public long getLast_expose_time() {
        return this.last_expose_time;
    }

    public java.lang.String getOob() {
        return this.oob;
    }

    public com.tencent.wechat.aff.newlife.ClientStatsInfo mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.newlife.ClientStatsInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.expose_count);
            java.lang.String str = this.oob;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.h(3, this.first_expose_time);
            fVar.e(100, this.had_sync_for_cold_time);
            fVar.h(101, this.last_expose_time);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.expose_count) + 0;
            java.lang.String str2 = this.oob;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            return e17 + b36.f.h(3, this.first_expose_time) + b36.f.e(100, this.had_sync_for_cold_time) + b36.f.h(101, this.last_expose_time);
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
            this.expose_count = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.oob = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            this.first_expose_time = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 100) {
            this.had_sync_for_cold_time = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 101) {
            return -1;
        }
        this.last_expose_time = aVar2.i(intValue);
        return 0;
    }

    public com.tencent.wechat.aff.newlife.ClientStatsInfo setExposeCount(int i17) {
        this.expose_count = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.ClientStatsInfo setExpose_count(int i17) {
        this.expose_count = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.ClientStatsInfo setFirstExposeTime(long j17) {
        this.first_expose_time = j17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.ClientStatsInfo setFirst_expose_time(long j17) {
        this.first_expose_time = j17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.ClientStatsInfo setHadSyncForColdTime(int i17) {
        this.had_sync_for_cold_time = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.ClientStatsInfo setHad_sync_for_cold_time(int i17) {
        this.had_sync_for_cold_time = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.ClientStatsInfo setLastExposeTime(long j17) {
        this.last_expose_time = j17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.ClientStatsInfo setLast_expose_time(long j17) {
        this.last_expose_time = j17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.ClientStatsInfo setOob(java.lang.String str) {
        this.oob = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.ClientStatsInfo mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.newlife.ClientStatsInfo parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.newlife.ClientStatsInfo) super.parseFrom(bArr);
    }
}
