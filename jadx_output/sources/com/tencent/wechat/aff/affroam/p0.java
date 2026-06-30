package com.tencent.wechat.aff.affroam;

/* loaded from: classes7.dex */
public class p0 extends com.tencent.mm.protobuf.f {

    /* renamed from: m, reason: collision with root package name */
    public static final com.tencent.wechat.aff.affroam.p0 f215945m = new com.tencent.wechat.aff.affroam.p0();

    /* renamed from: d, reason: collision with root package name */
    public long f215946d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f215947e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f215948f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f215949g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f215950h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f215951i = 0;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.affroam.p0)) {
            return false;
        }
        com.tencent.wechat.aff.affroam.p0 p0Var = (com.tencent.wechat.aff.affroam.p0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f215946d), java.lang.Long.valueOf(p0Var.f215946d)) && n51.f.a(java.lang.Long.valueOf(this.f215947e), java.lang.Long.valueOf(p0Var.f215947e)) && n51.f.a(java.lang.Long.valueOf(this.f215948f), java.lang.Long.valueOf(p0Var.f215948f)) && n51.f.a(java.lang.Long.valueOf(this.f215949g), java.lang.Long.valueOf(p0Var.f215949g)) && n51.f.a(java.lang.Long.valueOf(this.f215950h), java.lang.Long.valueOf(p0Var.f215950h)) && n51.f.a(java.lang.Long.valueOf(this.f215951i), java.lang.Long.valueOf(p0Var.f215951i));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.affroam.p0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f215946d);
            fVar.h(2, this.f215947e);
            fVar.h(3, this.f215948f);
            fVar.h(4, this.f215949g);
            fVar.h(5, this.f215950h);
            fVar.h(6, this.f215951i);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.f215946d) + 0 + b36.f.h(2, this.f215947e) + b36.f.h(3, this.f215948f) + b36.f.h(4, this.f215949g) + b36.f.h(5, this.f215950h) + b36.f.h(6, this.f215951i);
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
                this.f215946d = aVar2.i(intValue);
                return 0;
            case 2:
                this.f215947e = aVar2.i(intValue);
                return 0;
            case 3:
                this.f215948f = aVar2.i(intValue);
                return 0;
            case 4:
                this.f215949g = aVar2.i(intValue);
                return 0;
            case 5:
                this.f215950h = aVar2.i(intValue);
                return 0;
            case 6:
                this.f215951i = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.affroam.p0) super.parseFrom(bArr);
    }
}
