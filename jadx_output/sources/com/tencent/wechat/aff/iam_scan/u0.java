package com.tencent.wechat.aff.iam_scan;

/* loaded from: classes9.dex */
public class u0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f217139d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f217140e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f217141f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f217142g = 0;

    static {
        new com.tencent.wechat.aff.iam_scan.u0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.aff.iam_scan.u0 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.iam_scan.u0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.iam_scan.u0)) {
            return false;
        }
        com.tencent.wechat.aff.iam_scan.u0 u0Var = (com.tencent.wechat.aff.iam_scan.u0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f217139d), java.lang.Integer.valueOf(u0Var.f217139d)) && n51.f.a(java.lang.Integer.valueOf(this.f217140e), java.lang.Integer.valueOf(u0Var.f217140e)) && n51.f.a(java.lang.Integer.valueOf(this.f217141f), java.lang.Integer.valueOf(u0Var.f217141f)) && n51.f.a(java.lang.Integer.valueOf(this.f217142g), java.lang.Integer.valueOf(u0Var.f217142g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.iam_scan.u0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f217139d);
            fVar.e(2, this.f217140e);
            fVar.e(3, this.f217141f);
            fVar.e(4, this.f217142g);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f217139d) + 0 + b36.f.e(2, this.f217140e) + b36.f.e(3, this.f217141f) + b36.f.e(4, this.f217142g);
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
            this.f217139d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f217140e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            this.f217141f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f217142g = aVar2.g(intValue);
        return 0;
    }
}
