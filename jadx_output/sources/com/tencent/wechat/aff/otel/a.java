package com.tencent.wechat.aff.otel;

/* loaded from: classes9.dex */
public class a extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f217403d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.wechat.aff.otel.e f217404e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.wechat.aff.otel.c f217405f;

    /* renamed from: g, reason: collision with root package name */
    public long f217406g;

    /* renamed from: h, reason: collision with root package name */
    public long f217407h;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.wechat.aff.otel.g f217410n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f217411o;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f217408i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f217409m = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f217412p = new boolean[10];

    static {
        new com.tencent.wechat.aff.otel.a();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.otel.a)) {
            return false;
        }
        com.tencent.wechat.aff.otel.a aVar = (com.tencent.wechat.aff.otel.a) fVar;
        return n51.f.a(this.f217403d, aVar.f217403d) && n51.f.a(this.f217404e, aVar.f217404e) && n51.f.a(this.f217405f, aVar.f217405f) && n51.f.a(java.lang.Long.valueOf(this.f217406g), java.lang.Long.valueOf(aVar.f217406g)) && n51.f.a(java.lang.Long.valueOf(this.f217407h), java.lang.Long.valueOf(aVar.f217407h)) && n51.f.a(this.f217408i, aVar.f217408i) && n51.f.a(this.f217409m, aVar.f217409m) && n51.f.a(this.f217410n, aVar.f217410n) && n51.f.a(this.f217411o, aVar.f217411o);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.otel.a();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f217409m;
        java.util.LinkedList linkedList2 = this.f217408i;
        boolean[] zArr = this.f217412p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f217403d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            com.tencent.wechat.aff.otel.e eVar = this.f217404e;
            if (eVar != null && zArr[2]) {
                fVar.e(2, eVar.f217433d);
            }
            com.tencent.wechat.aff.otel.c cVar = this.f217405f;
            if (cVar != null && zArr[3]) {
                fVar.i(3, cVar.computeSize());
                this.f217405f.writeFields(fVar);
            }
            if (zArr[4]) {
                fVar.h(4, this.f217406g);
            }
            if (zArr[5]) {
                fVar.h(5, this.f217407h);
            }
            fVar.g(6, 8, linkedList2);
            fVar.g(7, 8, linkedList);
            com.tencent.wechat.aff.otel.g gVar = this.f217410n;
            if (gVar != null && zArr[8]) {
                fVar.e(8, gVar.f217442d);
            }
            java.lang.String str2 = this.f217411o;
            if (str2 == null || !zArr[9]) {
                return 0;
            }
            fVar.j(9, str2);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f217403d;
            int j17 = (str3 == null || !zArr[1]) ? 0 : 0 + b36.f.j(1, str3);
            com.tencent.wechat.aff.otel.e eVar2 = this.f217404e;
            if (eVar2 != null && zArr[2]) {
                j17 += b36.f.e(2, eVar2.f217433d);
            }
            com.tencent.wechat.aff.otel.c cVar2 = this.f217405f;
            if (cVar2 != null && zArr[3]) {
                j17 += b36.f.i(3, cVar2.computeSize());
            }
            if (zArr[4]) {
                j17 += b36.f.h(4, this.f217406g);
            }
            if (zArr[5]) {
                j17 += b36.f.h(5, this.f217407h);
            }
            int g17 = j17 + b36.f.g(6, 8, linkedList2) + b36.f.g(7, 8, linkedList);
            com.tencent.wechat.aff.otel.g gVar2 = this.f217410n;
            if (gVar2 != null && zArr[8]) {
                g17 += b36.f.e(8, gVar2.f217442d);
            }
            java.lang.String str4 = this.f217411o;
            return (str4 == null || !zArr[9]) ? g17 : g17 + b36.f.j(9, str4);
        }
        if (i17 == 2) {
            linkedList2.clear();
            linkedList.clear();
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
        com.tencent.wechat.aff.otel.e eVar3 = null;
        com.tencent.wechat.aff.otel.g gVar3 = null;
        switch (intValue) {
            case 1:
                this.f217403d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                int g18 = aVar2.g(intValue);
                if (g18 == 0) {
                    eVar3 = com.tencent.wechat.aff.otel.e.kSpanKindClient;
                } else if (g18 == 1) {
                    eVar3 = com.tencent.wechat.aff.otel.e.kSpanKindServer;
                } else if (g18 == 2) {
                    eVar3 = com.tencent.wechat.aff.otel.e.kSpanKindProducer;
                } else if (g18 == 3) {
                    eVar3 = com.tencent.wechat.aff.otel.e.kSpanKindConsumer;
                } else if (g18 == 4) {
                    eVar3 = com.tencent.wechat.aff.otel.e.kSpanKindInternal;
                }
                this.f217404e = eVar3;
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    com.tencent.wechat.aff.otel.c cVar3 = new com.tencent.wechat.aff.otel.c();
                    if (bArr != null && bArr.length > 0) {
                        cVar3.parseFrom(bArr);
                    }
                    this.f217405f = cVar3;
                }
                zArr[3] = true;
                return 0;
            case 4:
                this.f217406g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f217407h = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    com.tencent.wechat.aff.otel.b bVar = new com.tencent.wechat.aff.otel.b();
                    if (bArr2 != null && bArr2.length > 0) {
                        bVar.parseFrom(bArr2);
                    }
                    linkedList2.add(bVar);
                }
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j27.get(i27);
                    com.tencent.wechat.aff.otel.d dVar = new com.tencent.wechat.aff.otel.d();
                    if (bArr3 != null && bArr3.length > 0) {
                        dVar.parseFrom(bArr3);
                    }
                    linkedList.add(dVar);
                }
                zArr[7] = true;
                return 0;
            case 8:
                int g19 = aVar2.g(intValue);
                if (g19 == 0) {
                    gVar3 = com.tencent.wechat.aff.otel.g.kStatusUnset;
                } else if (g19 == 1) {
                    gVar3 = com.tencent.wechat.aff.otel.g.kStatusOk;
                } else if (g19 == 2) {
                    gVar3 = com.tencent.wechat.aff.otel.g.kStatusError;
                }
                this.f217410n = gVar3;
                zArr[8] = true;
                return 0;
            case 9:
                this.f217411o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.otel.a) super.parseFrom(bArr);
    }
}
