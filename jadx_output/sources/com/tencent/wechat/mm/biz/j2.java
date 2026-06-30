package com.tencent.wechat.mm.biz;

/* loaded from: classes4.dex */
public class j2 extends com.tencent.mm.protobuf.f {

    /* renamed from: o, reason: collision with root package name */
    public static final com.tencent.wechat.mm.biz.j2 f218218o = new com.tencent.wechat.mm.biz.j2();

    /* renamed from: d, reason: collision with root package name */
    public boolean f218219d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f218221f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.wechat.mm.biz.g2 f218222g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f218223h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f218224i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f218225m;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f218220e = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f218226n = new boolean[8];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.biz.j2)) {
            return false;
        }
        com.tencent.wechat.mm.biz.j2 j2Var = (com.tencent.wechat.mm.biz.j2) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f218219d), java.lang.Boolean.valueOf(j2Var.f218219d)) && n51.f.a(this.f218220e, j2Var.f218220e) && n51.f.a(this.f218221f, j2Var.f218221f) && n51.f.a(this.f218222g, j2Var.f218222g) && n51.f.a(this.f218223h, j2Var.f218223h) && n51.f.a(this.f218224i, j2Var.f218224i) && n51.f.a(this.f218225m, j2Var.f218225m);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.biz.j2();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f218220e;
        boolean[] zArr = this.f218226n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f218219d);
            }
            fVar.g(2, 8, linkedList);
            java.lang.String str = this.f218221f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            com.tencent.wechat.mm.biz.g2 g2Var = this.f218222g;
            if (g2Var != null && zArr[4]) {
                fVar.i(4, g2Var.computeSize());
                this.f218222g.writeFields(fVar);
            }
            java.lang.String str2 = this.f218223h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f218224i;
            if (str3 != null && zArr[6]) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f218225m;
            if (str4 != null && zArr[7]) {
                fVar.j(7, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = (zArr[1] ? 0 + b36.f.a(1, this.f218219d) : 0) + b36.f.g(2, 8, linkedList);
            java.lang.String str5 = this.f218221f;
            if (str5 != null && zArr[3]) {
                a17 += b36.f.j(3, str5);
            }
            com.tencent.wechat.mm.biz.g2 g2Var2 = this.f218222g;
            if (g2Var2 != null && zArr[4]) {
                a17 += b36.f.i(4, g2Var2.computeSize());
            }
            java.lang.String str6 = this.f218223h;
            if (str6 != null && zArr[5]) {
                a17 += b36.f.j(5, str6);
            }
            java.lang.String str7 = this.f218224i;
            if (str7 != null && zArr[6]) {
                a17 += b36.f.j(6, str7);
            }
            java.lang.String str8 = this.f218225m;
            return (str8 == null || !zArr[7]) ? a17 : a17 + b36.f.j(7, str8);
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
                this.f218219d = aVar2.c(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    com.tencent.wechat.mm.biz.i2 i2Var = new com.tencent.wechat.mm.biz.i2();
                    if (bArr != null && bArr.length > 0) {
                        i2Var.parseFrom(bArr);
                    }
                    linkedList.add(i2Var);
                }
                zArr[2] = true;
                return 0;
            case 3:
                this.f218221f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    com.tencent.wechat.mm.biz.g2 g2Var3 = new com.tencent.wechat.mm.biz.g2();
                    if (bArr2 != null && bArr2.length > 0) {
                        g2Var3.parseFrom(bArr2);
                    }
                    this.f218222g = g2Var3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                this.f218223h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f218224i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f218225m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.biz.j2) super.parseFrom(bArr);
    }
}
