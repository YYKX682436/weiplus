package com.tencent.wechat.aff.iam_scan;

/* loaded from: classes9.dex */
public class y extends com.tencent.mm.protobuf.f {

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.wechat.aff.iam_scan.y f217179g = new com.tencent.wechat.aff.iam_scan.y();

    /* renamed from: d, reason: collision with root package name */
    public boolean f217180d = false;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.wechat.aff.iam_scan.e f217181e = new com.tencent.wechat.aff.iam_scan.e();

    /* renamed from: f, reason: collision with root package name */
    public int f217182f = 0;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.iam_scan.y)) {
            return false;
        }
        com.tencent.wechat.aff.iam_scan.y yVar = (com.tencent.wechat.aff.iam_scan.y) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f217180d), java.lang.Boolean.valueOf(yVar.f217180d)) && n51.f.a(this.f217181e, yVar.f217181e) && n51.f.a(java.lang.Integer.valueOf(this.f217182f), java.lang.Integer.valueOf(yVar.f217182f));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.iam_scan.y();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f217180d);
            com.tencent.wechat.aff.iam_scan.e eVar = this.f217181e;
            if (eVar != null) {
                fVar.i(2, eVar.computeSize());
                this.f217181e.writeFields(fVar);
            }
            fVar.e(3, this.f217182f);
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f217180d) + 0;
            com.tencent.wechat.aff.iam_scan.e eVar2 = this.f217181e;
            if (eVar2 != null) {
                a17 += b36.f.i(2, eVar2.computeSize());
            }
            return a17 + b36.f.e(3, this.f217182f);
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
            this.f217180d = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            this.f217182f = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.tencent.wechat.aff.iam_scan.e eVar3 = new com.tencent.wechat.aff.iam_scan.e();
            if (bArr != null && bArr.length > 0) {
                eVar3.parseFrom(bArr);
            }
            this.f217181e = eVar3;
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.iam_scan.y) super.parseFrom(bArr);
    }
}
