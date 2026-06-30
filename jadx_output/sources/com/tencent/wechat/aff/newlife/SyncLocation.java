package com.tencent.wechat.aff.newlife;

/* loaded from: classes8.dex */
public class SyncLocation extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.newlife.SyncLocation DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.SyncLocation();
    public float longitude = 0.0f;
    public float latitude = 0.0f;
    public int lbs_cache_time = 0;

    public static com.tencent.wechat.aff.newlife.SyncLocation create() {
        return new com.tencent.wechat.aff.newlife.SyncLocation();
    }

    public static com.tencent.wechat.aff.newlife.SyncLocation getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.newlife.SyncLocation newBuilder() {
        return new com.tencent.wechat.aff.newlife.SyncLocation();
    }

    public com.tencent.wechat.aff.newlife.SyncLocation build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.SyncLocation)) {
            return false;
        }
        com.tencent.wechat.aff.newlife.SyncLocation syncLocation = (com.tencent.wechat.aff.newlife.SyncLocation) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.longitude), java.lang.Float.valueOf(syncLocation.longitude)) && n51.f.a(java.lang.Float.valueOf(this.latitude), java.lang.Float.valueOf(syncLocation.latitude)) && n51.f.a(java.lang.Integer.valueOf(this.lbs_cache_time), java.lang.Integer.valueOf(syncLocation.lbs_cache_time));
    }

    public float getLatitude() {
        return this.latitude;
    }

    public int getLbsCacheTime() {
        return this.lbs_cache_time;
    }

    public int getLbs_cache_time() {
        return this.lbs_cache_time;
    }

    public float getLongitude() {
        return this.longitude;
    }

    public com.tencent.wechat.aff.newlife.SyncLocation mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.newlife.SyncLocation();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.d(1, this.longitude);
            fVar.d(2, this.latitude);
            fVar.e(3, this.lbs_cache_time);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.d(1, this.longitude) + 0 + b36.f.d(2, this.latitude) + b36.f.e(3, this.lbs_cache_time);
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
            this.longitude = aVar2.f(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.latitude = aVar2.f(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.lbs_cache_time = aVar2.g(intValue);
        return 0;
    }

    public com.tencent.wechat.aff.newlife.SyncLocation setLatitude(float f17) {
        this.latitude = f17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.SyncLocation setLbsCacheTime(int i17) {
        this.lbs_cache_time = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.SyncLocation setLbs_cache_time(int i17) {
        this.lbs_cache_time = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.SyncLocation setLongitude(float f17) {
        this.longitude = f17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.SyncLocation mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.newlife.SyncLocation parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.newlife.SyncLocation) super.parseFrom(bArr);
    }
}
