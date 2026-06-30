package com.tencent.wechat.aff.ilink_stream;

/* loaded from: classes7.dex */
public class b extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.wechat.aff.ilink_stream.c f217223d;

    /* renamed from: e, reason: collision with root package name */
    public long f217224e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f217225f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.wechat.aff.ilink_stream.t f217226g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.wechat.aff.ilink_stream.z f217227h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f217228i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f217229m = new boolean[7];

    static {
        new com.tencent.wechat.aff.ilink_stream.b();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.ilink_stream.b)) {
            return false;
        }
        com.tencent.wechat.aff.ilink_stream.b bVar = (com.tencent.wechat.aff.ilink_stream.b) fVar;
        return n51.f.a(this.f217223d, bVar.f217223d) && n51.f.a(java.lang.Long.valueOf(this.f217224e), java.lang.Long.valueOf(bVar.f217224e)) && n51.f.a(java.lang.Boolean.valueOf(this.f217225f), java.lang.Boolean.valueOf(bVar.f217225f)) && n51.f.a(this.f217226g, bVar.f217226g) && n51.f.a(this.f217227h, bVar.f217227h) && n51.f.a(java.lang.Boolean.valueOf(this.f217228i), java.lang.Boolean.valueOf(bVar.f217228i));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.ilink_stream.b();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f217229m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.wechat.aff.ilink_stream.c cVar = this.f217223d;
            if (cVar != null && zArr[1]) {
                fVar.e(1, cVar.f217253d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f217224e);
            }
            if (zArr[3]) {
                fVar.a(3, this.f217225f);
            }
            com.tencent.wechat.aff.ilink_stream.t tVar = this.f217226g;
            if (tVar != null && zArr[4]) {
                fVar.i(4, tVar.computeSize());
                this.f217226g.writeFields(fVar);
            }
            com.tencent.wechat.aff.ilink_stream.z zVar = this.f217227h;
            if (zVar != null && zArr[5]) {
                fVar.e(5, zVar.f217353d);
            }
            if (zArr[6]) {
                fVar.a(6, this.f217228i);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.wechat.aff.ilink_stream.c cVar2 = this.f217223d;
            if (cVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, cVar2.f217253d);
            }
            if (zArr[2]) {
                i18 += b36.f.h(2, this.f217224e);
            }
            if (zArr[3]) {
                i18 += b36.f.a(3, this.f217225f);
            }
            com.tencent.wechat.aff.ilink_stream.t tVar2 = this.f217226g;
            if (tVar2 != null && zArr[4]) {
                i18 += b36.f.i(4, tVar2.computeSize());
            }
            com.tencent.wechat.aff.ilink_stream.z zVar2 = this.f217227h;
            if (zVar2 != null && zArr[5]) {
                i18 += b36.f.e(5, zVar2.f217353d);
            }
            return zArr[6] ? i18 + b36.f.a(6, this.f217228i) : i18;
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
        com.tencent.wechat.aff.ilink_stream.c cVar3 = null;
        com.tencent.wechat.aff.ilink_stream.z zVar3 = null;
        switch (intValue) {
            case 1:
                int g17 = aVar2.g(intValue);
                if (g17 == 0) {
                    cVar3 = com.tencent.wechat.aff.ilink_stream.c.kStreamChannelModeDual;
                } else if (g17 == 1) {
                    cVar3 = com.tencent.wechat.aff.ilink_stream.c.kStreamChannelModeQuic;
                } else if (g17 == 2) {
                    cVar3 = com.tencent.wechat.aff.ilink_stream.c.kStreamChannelModeWSS;
                }
                this.f217223d = cVar3;
                zArr[1] = true;
                return 0;
            case 2:
                this.f217224e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f217225f = aVar2.c(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    com.tencent.wechat.aff.ilink_stream.t tVar3 = new com.tencent.wechat.aff.ilink_stream.t();
                    if (bArr != null && bArr.length > 0) {
                        tVar3.parseFrom(bArr);
                    }
                    this.f217226g = tVar3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                int g18 = aVar2.g(intValue);
                if (g18 == 0) {
                    zVar3 = com.tencent.wechat.aff.ilink_stream.z.kTransferStrategyDefaultMode;
                } else if (g18 == 1) {
                    zVar3 = com.tencent.wechat.aff.ilink_stream.z.kTransferStrategySpeedMode;
                } else if (g18 == 2) {
                    zVar3 = com.tencent.wechat.aff.ilink_stream.z.kTransferStrategyTrafficMode;
                } else if (g18 == 3) {
                    zVar3 = com.tencent.wechat.aff.ilink_stream.z.kTransferStrategyFullSpeedMode;
                }
                this.f217227h = zVar3;
                zArr[5] = true;
                return 0;
            case 6:
                this.f217228i = aVar2.c(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.ilink_stream.b) super.parseFrom(bArr);
    }
}
