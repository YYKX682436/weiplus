package com.tencent.wechat.aff.iam_scan;

/* loaded from: classes9.dex */
public class i0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f217054d = "";

    /* renamed from: e, reason: collision with root package name */
    public int f217055e = 0;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f217056f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f217057g = "";

    /* renamed from: h, reason: collision with root package name */
    public int f217058h = 0;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f217059i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public int f217060m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f217061n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f217062o = 0;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f217063p = com.tencent.mm.protobuf.g.f192155b;

    static {
        new com.tencent.wechat.aff.iam_scan.i0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.aff.iam_scan.i0 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.iam_scan.i0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.iam_scan.i0)) {
            return false;
        }
        com.tencent.wechat.aff.iam_scan.i0 i0Var = (com.tencent.wechat.aff.iam_scan.i0) fVar;
        return n51.f.a(this.f217054d, i0Var.f217054d) && n51.f.a(java.lang.Integer.valueOf(this.f217055e), java.lang.Integer.valueOf(i0Var.f217055e)) && n51.f.a(this.f217056f, i0Var.f217056f) && n51.f.a(this.f217057g, i0Var.f217057g) && n51.f.a(java.lang.Integer.valueOf(this.f217058h), java.lang.Integer.valueOf(i0Var.f217058h)) && n51.f.a(this.f217059i, i0Var.f217059i) && n51.f.a(java.lang.Integer.valueOf(this.f217060m), java.lang.Integer.valueOf(i0Var.f217060m)) && n51.f.a(java.lang.Integer.valueOf(this.f217061n), java.lang.Integer.valueOf(i0Var.f217061n)) && n51.f.a(java.lang.Integer.valueOf(this.f217062o), java.lang.Integer.valueOf(i0Var.f217062o)) && n51.f.a(this.f217063p, i0Var.f217063p);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.iam_scan.i0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f217059i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f217054d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f217055e);
            java.lang.String str2 = this.f217056f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f217057g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f217058h);
            fVar.g(6, 8, linkedList);
            fVar.e(7, this.f217060m);
            fVar.e(8, this.f217061n);
            fVar.e(9, this.f217062o);
            com.tencent.mm.protobuf.g gVar = this.f217063p;
            if (gVar != null) {
                fVar.b(10, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f217054d;
            int j17 = (str4 != null ? 0 + b36.f.j(1, str4) : 0) + b36.f.e(2, this.f217055e);
            java.lang.String str5 = this.f217056f;
            if (str5 != null) {
                j17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f217057g;
            if (str6 != null) {
                j17 += b36.f.j(4, str6);
            }
            int e17 = j17 + b36.f.e(5, this.f217058h) + b36.f.g(6, 8, linkedList) + b36.f.e(7, this.f217060m) + b36.f.e(8, this.f217061n) + b36.f.e(9, this.f217062o);
            com.tencent.mm.protobuf.g gVar2 = this.f217063p;
            return gVar2 != null ? e17 + b36.f.b(10, gVar2) : e17;
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
        switch (intValue) {
            case 1:
                this.f217054d = aVar2.k(intValue);
                return 0;
            case 2:
                this.f217055e = aVar2.g(intValue);
                return 0;
            case 3:
                this.f217056f = aVar2.k(intValue);
                return 0;
            case 4:
                this.f217057g = aVar2.k(intValue);
                return 0;
            case 5:
                this.f217058h = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    com.tencent.wechat.aff.iam_scan.v vVar = new com.tencent.wechat.aff.iam_scan.v();
                    if (bArr != null && bArr.length > 0) {
                        vVar.parseFrom(bArr);
                    }
                    linkedList.add(vVar);
                }
                return 0;
            case 7:
                this.f217060m = aVar2.g(intValue);
                return 0;
            case 8:
                this.f217061n = aVar2.g(intValue);
                return 0;
            case 9:
                this.f217062o = aVar2.g(intValue);
                return 0;
            case 10:
                this.f217063p = aVar2.d(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
