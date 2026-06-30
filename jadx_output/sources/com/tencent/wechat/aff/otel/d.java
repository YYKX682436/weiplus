package com.tencent.wechat.aff.otel;

/* loaded from: classes9.dex */
public class d extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f217423d;

    /* renamed from: e, reason: collision with root package name */
    public long f217424e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f217425f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f217426g = new boolean[4];

    static {
        new com.tencent.wechat.aff.otel.d();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.aff.otel.d parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.otel.d) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.otel.d)) {
            return false;
        }
        com.tencent.wechat.aff.otel.d dVar = (com.tencent.wechat.aff.otel.d) fVar;
        return n51.f.a(this.f217423d, dVar.f217423d) && n51.f.a(java.lang.Long.valueOf(this.f217424e), java.lang.Long.valueOf(dVar.f217424e)) && n51.f.a(this.f217425f, dVar.f217425f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.otel.d();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f217425f;
        boolean[] zArr = this.f217426g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f217423d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.h(2, this.f217424e);
            }
            fVar.g(3, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f217423d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            if (zArr[2]) {
                i18 += b36.f.h(2, this.f217424e);
            }
            return i18 + b36.f.g(3, 8, linkedList);
        }
        if (i17 == 2) {
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
        if (intValue == 1) {
            this.f217423d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f217424e = aVar2.i(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            com.tencent.wechat.aff.otel.b bVar = new com.tencent.wechat.aff.otel.b();
            if (bArr != null && bArr.length > 0) {
                bVar.parseFrom(bArr);
            }
            linkedList.add(bVar);
        }
        zArr[3] = true;
        return 0;
    }
}
