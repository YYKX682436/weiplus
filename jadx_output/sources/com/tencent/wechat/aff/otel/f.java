package com.tencent.wechat.aff.otel;

/* loaded from: classes9.dex */
public class f extends com.tencent.mm.protobuf.f {

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.wechat.aff.otel.f f217434g = new com.tencent.wechat.aff.otel.f();

    /* renamed from: d, reason: collision with root package name */
    public long f217435d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.wechat.aff.otel.c f217436e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f217437f = new boolean[3];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.otel.f)) {
            return false;
        }
        com.tencent.wechat.aff.otel.f fVar2 = (com.tencent.wechat.aff.otel.f) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f217435d), java.lang.Long.valueOf(fVar2.f217435d)) && n51.f.a(this.f217436e, fVar2.f217436e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.otel.f();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f217437f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f217435d);
            }
            com.tencent.wechat.aff.otel.c cVar = this.f217436e;
            if (cVar != null && zArr[2]) {
                fVar.i(2, cVar.computeSize());
                this.f217436e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f217435d) : 0;
            com.tencent.wechat.aff.otel.c cVar2 = this.f217436e;
            return (cVar2 == null || !zArr[2]) ? h17 : h17 + b36.f.i(2, cVar2.computeSize());
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
            this.f217435d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.tencent.wechat.aff.otel.c cVar3 = new com.tencent.wechat.aff.otel.c();
            if (bArr != null && bArr.length > 0) {
                cVar3.parseFrom(bArr);
            }
            this.f217436e = cVar3;
        }
        zArr[2] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.otel.f) super.parseFrom(bArr);
    }
}
