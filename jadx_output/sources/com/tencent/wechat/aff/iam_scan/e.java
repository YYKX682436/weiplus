package com.tencent.wechat.aff.iam_scan;

/* loaded from: classes9.dex */
public class e extends com.tencent.mm.protobuf.f {

    /* renamed from: i, reason: collision with root package name */
    public static final com.tencent.wechat.aff.iam_scan.e f216995i = new com.tencent.wechat.aff.iam_scan.e();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f216996d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public int f216997e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f216998f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f216999g = 0;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.wechat.aff.iam_scan.u0 f217000h = new com.tencent.wechat.aff.iam_scan.u0();

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.aff.iam_scan.e parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.iam_scan.e) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.iam_scan.e)) {
            return false;
        }
        com.tencent.wechat.aff.iam_scan.e eVar = (com.tencent.wechat.aff.iam_scan.e) fVar;
        return n51.f.a(this.f216996d, eVar.f216996d) && n51.f.a(java.lang.Integer.valueOf(this.f216997e), java.lang.Integer.valueOf(eVar.f216997e)) && n51.f.a(java.lang.Integer.valueOf(this.f216998f), java.lang.Integer.valueOf(eVar.f216998f)) && n51.f.a(java.lang.Integer.valueOf(this.f216999g), java.lang.Integer.valueOf(eVar.f216999g)) && n51.f.a(this.f217000h, eVar.f217000h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.iam_scan.e();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f216996d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            fVar.e(2, this.f216997e);
            fVar.e(3, this.f216998f);
            fVar.e(4, this.f216999g);
            com.tencent.wechat.aff.iam_scan.u0 u0Var = this.f217000h;
            if (u0Var != null) {
                fVar.i(5, u0Var.computeSize());
                this.f217000h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0 + b36.f.e(2, this.f216997e) + b36.f.e(3, this.f216998f) + b36.f.e(4, this.f216999g);
            com.tencent.wechat.aff.iam_scan.u0 u0Var2 = this.f217000h;
            return u0Var2 != null ? g17 + b36.f.i(5, u0Var2.computeSize()) : g17;
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
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                com.tencent.wechat.aff.iam_scan.i0 i0Var = new com.tencent.wechat.aff.iam_scan.i0();
                if (bArr != null && bArr.length > 0) {
                    i0Var.parseFrom(bArr);
                }
                linkedList.add(i0Var);
            }
            return 0;
        }
        if (intValue == 2) {
            this.f216997e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            this.f216998f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            this.f216999g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            com.tencent.wechat.aff.iam_scan.u0 u0Var3 = new com.tencent.wechat.aff.iam_scan.u0();
            if (bArr2 != null && bArr2.length > 0) {
                u0Var3.parseFrom(bArr2);
            }
            this.f217000h = u0Var3;
        }
        return 0;
    }
}
