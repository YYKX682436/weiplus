package com.tencent.wechat.aff.iam_scan;

/* loaded from: classes9.dex */
public class s extends com.tencent.mm.protobuf.f {

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.wechat.aff.iam_scan.s f217127g = new com.tencent.wechat.aff.iam_scan.s();

    /* renamed from: d, reason: collision with root package name */
    public boolean f217128d = false;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.wechat.aff.iam_scan.g f217129e = new com.tencent.wechat.aff.iam_scan.g();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f217130f = "";

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.iam_scan.s)) {
            return false;
        }
        com.tencent.wechat.aff.iam_scan.s sVar = (com.tencent.wechat.aff.iam_scan.s) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f217128d), java.lang.Boolean.valueOf(sVar.f217128d)) && n51.f.a(this.f217129e, sVar.f217129e) && n51.f.a(this.f217130f, sVar.f217130f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.iam_scan.s();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f217128d);
            com.tencent.wechat.aff.iam_scan.g gVar = this.f217129e;
            if (gVar != null) {
                fVar.i(2, gVar.computeSize());
                this.f217129e.writeFields(fVar);
            }
            java.lang.String str = this.f217130f;
            if (str != null) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f217128d) + 0;
            com.tencent.wechat.aff.iam_scan.g gVar2 = this.f217129e;
            if (gVar2 != null) {
                a17 += b36.f.i(2, gVar2.computeSize());
            }
            java.lang.String str2 = this.f217130f;
            return str2 != null ? a17 + b36.f.j(3, str2) : a17;
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
            this.f217128d = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            this.f217130f = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.tencent.wechat.aff.iam_scan.g gVar3 = new com.tencent.wechat.aff.iam_scan.g();
            if (bArr != null && bArr.length > 0) {
                gVar3.parseFrom(bArr);
            }
            this.f217129e = gVar3;
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.iam_scan.s) super.parseFrom(bArr);
    }
}
