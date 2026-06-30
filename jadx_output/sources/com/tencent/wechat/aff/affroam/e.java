package com.tencent.wechat.aff.affroam;

/* loaded from: classes7.dex */
public class e extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f215814d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f215815e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f215816f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f215817g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f215818h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f215819i = 0;

    static {
        new com.tencent.wechat.aff.affroam.e();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.affroam.e)) {
            return false;
        }
        com.tencent.wechat.aff.affroam.e eVar = (com.tencent.wechat.aff.affroam.e) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f215814d), java.lang.Long.valueOf(eVar.f215814d)) && n51.f.a(java.lang.Long.valueOf(this.f215815e), java.lang.Long.valueOf(eVar.f215815e)) && n51.f.a(java.lang.Long.valueOf(this.f215816f), java.lang.Long.valueOf(eVar.f215816f)) && n51.f.a(java.lang.Long.valueOf(this.f215817g), java.lang.Long.valueOf(eVar.f215817g)) && n51.f.a(java.lang.Integer.valueOf(this.f215818h), java.lang.Integer.valueOf(eVar.f215818h)) && n51.f.a(java.lang.Long.valueOf(this.f215819i), java.lang.Long.valueOf(eVar.f215819i));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.affroam.e();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f215814d);
            fVar.h(2, this.f215815e);
            fVar.h(3, this.f215816f);
            fVar.h(4, this.f215817g);
            fVar.e(5, this.f215818h);
            fVar.h(6, this.f215819i);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.f215814d) + 0 + b36.f.h(2, this.f215815e) + b36.f.h(3, this.f215816f) + b36.f.h(4, this.f215817g) + b36.f.e(5, this.f215818h) + b36.f.h(6, this.f215819i);
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
        switch (intValue) {
            case 1:
                this.f215814d = aVar2.i(intValue);
                return 0;
            case 2:
                this.f215815e = aVar2.i(intValue);
                return 0;
            case 3:
                this.f215816f = aVar2.i(intValue);
                return 0;
            case 4:
                this.f215817g = aVar2.i(intValue);
                return 0;
            case 5:
                this.f215818h = aVar2.g(intValue);
                return 0;
            case 6:
                this.f215819i = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.affroam.e) super.parseFrom(bArr);
    }
}
