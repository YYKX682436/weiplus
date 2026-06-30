package com.tencent.wechat.aff.iam_scan;

/* loaded from: classes9.dex */
public class i extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f217050d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f217051e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f217052f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f217053g = new boolean[4];

    static {
        new com.tencent.wechat.aff.iam_scan.i();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.aff.iam_scan.i parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.iam_scan.i) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.iam_scan.i)) {
            return false;
        }
        com.tencent.wechat.aff.iam_scan.i iVar = (com.tencent.wechat.aff.iam_scan.i) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f217050d), java.lang.Integer.valueOf(iVar.f217050d)) && n51.f.a(java.lang.Boolean.valueOf(this.f217051e), java.lang.Boolean.valueOf(iVar.f217051e)) && n51.f.a(java.lang.Boolean.valueOf(this.f217052f), java.lang.Boolean.valueOf(iVar.f217052f));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.iam_scan.i();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f217053g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f217050d);
            }
            if (zArr[2]) {
                fVar.a(2, this.f217051e);
            }
            if (zArr[3]) {
                fVar.a(3, this.f217052f);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f217050d) : 0;
            if (zArr[2]) {
                e17 += b36.f.a(2, this.f217051e);
            }
            return zArr[3] ? e17 + b36.f.a(3, this.f217052f) : e17;
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
            this.f217050d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f217051e = aVar2.c(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f217052f = aVar2.c(intValue);
        zArr[3] = true;
        return 0;
    }
}
