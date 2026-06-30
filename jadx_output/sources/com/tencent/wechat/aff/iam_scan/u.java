package com.tencent.wechat.aff.iam_scan;

/* loaded from: classes9.dex */
public class u extends com.tencent.mm.protobuf.f {

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.wechat.aff.iam_scan.u f217135g = new com.tencent.wechat.aff.iam_scan.u();

    /* renamed from: d, reason: collision with root package name */
    public int f217136d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f217137e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f217138f = 0;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.iam_scan.u)) {
            return false;
        }
        com.tencent.wechat.aff.iam_scan.u uVar = (com.tencent.wechat.aff.iam_scan.u) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f217136d), java.lang.Integer.valueOf(uVar.f217136d)) && n51.f.a(java.lang.Integer.valueOf(this.f217137e), java.lang.Integer.valueOf(uVar.f217137e)) && n51.f.a(java.lang.Integer.valueOf(this.f217138f), java.lang.Integer.valueOf(uVar.f217138f));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.iam_scan.u();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f217136d);
            fVar.e(2, this.f217137e);
            fVar.e(3, this.f217138f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f217136d) + 0 + b36.f.e(2, this.f217137e) + b36.f.e(3, this.f217138f);
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
            this.f217136d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f217137e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f217138f = aVar2.g(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.iam_scan.u) super.parseFrom(bArr);
    }
}
