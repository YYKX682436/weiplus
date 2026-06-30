package com.tencent.wechat.aff.iam_scan;

/* loaded from: classes9.dex */
public class q extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f217119d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.wechat.aff.iam_scan.i f217120e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f217121f = new boolean[3];

    static {
        new com.tencent.wechat.aff.iam_scan.q();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.iam_scan.q)) {
            return false;
        }
        com.tencent.wechat.aff.iam_scan.q qVar = (com.tencent.wechat.aff.iam_scan.q) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f217119d), java.lang.Long.valueOf(qVar.f217119d)) && n51.f.a(this.f217120e, qVar.f217120e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.iam_scan.q();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f217121f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f217119d);
            }
            com.tencent.wechat.aff.iam_scan.i iVar = this.f217120e;
            if (iVar != null && zArr[2]) {
                fVar.i(2, iVar.computeSize());
                this.f217120e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f217119d) : 0;
            com.tencent.wechat.aff.iam_scan.i iVar2 = this.f217120e;
            return (iVar2 == null || !zArr[2]) ? h17 : h17 + b36.f.i(2, iVar2.computeSize());
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
            this.f217119d = aVar2.i(intValue);
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
            com.tencent.wechat.aff.iam_scan.i iVar3 = new com.tencent.wechat.aff.iam_scan.i();
            if (bArr != null && bArr.length > 0) {
                iVar3.parseFrom(bArr);
            }
            this.f217120e = iVar3;
        }
        zArr[2] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.iam_scan.q) super.parseFrom(bArr);
    }
}
