package com.tencent.wechat.mm.biz;

/* loaded from: classes2.dex */
public class o2 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f218415d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f218416e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f218417f;

    /* renamed from: g, reason: collision with root package name */
    public int f218418g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f218419h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f218420i;

    /* renamed from: m, reason: collision with root package name */
    public int f218421m;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f218423o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f218424p;

    /* renamed from: q, reason: collision with root package name */
    public int f218425q;

    /* renamed from: r, reason: collision with root package name */
    public int f218426r;

    /* renamed from: s, reason: collision with root package name */
    public int f218427s;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f218422n = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    public final boolean[] f218428t = new boolean[14];

    static {
        new com.tencent.wechat.mm.biz.o2();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.biz.o2 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.biz.o2) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.biz.o2)) {
            return false;
        }
        com.tencent.wechat.mm.biz.o2 o2Var = (com.tencent.wechat.mm.biz.o2) fVar;
        return n51.f.a(this.f218415d, o2Var.f218415d) && n51.f.a(this.f218416e, o2Var.f218416e) && n51.f.a(this.f218417f, o2Var.f218417f) && n51.f.a(java.lang.Integer.valueOf(this.f218418g), java.lang.Integer.valueOf(o2Var.f218418g)) && n51.f.a(this.f218419h, o2Var.f218419h) && n51.f.a(this.f218420i, o2Var.f218420i) && n51.f.a(java.lang.Integer.valueOf(this.f218421m), java.lang.Integer.valueOf(o2Var.f218421m)) && n51.f.a(this.f218422n, o2Var.f218422n) && n51.f.a(this.f218423o, o2Var.f218423o) && n51.f.a(this.f218424p, o2Var.f218424p) && n51.f.a(java.lang.Integer.valueOf(this.f218425q), java.lang.Integer.valueOf(o2Var.f218425q)) && n51.f.a(java.lang.Integer.valueOf(this.f218426r), java.lang.Integer.valueOf(o2Var.f218426r)) && n51.f.a(java.lang.Integer.valueOf(this.f218427s), java.lang.Integer.valueOf(o2Var.f218427s));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.biz.o2();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f218422n;
        boolean[] zArr = this.f218428t;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f218415d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f218416e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f218417f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            if (zArr[4]) {
                fVar.e(4, this.f218418g);
            }
            com.tencent.mm.protobuf.g gVar = this.f218419h;
            if (gVar != null && zArr[5]) {
                fVar.b(5, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f218420i;
            if (gVar2 != null && zArr[6]) {
                fVar.b(6, gVar2);
            }
            if (zArr[7]) {
                fVar.e(7, this.f218421m);
            }
            fVar.g(8, 8, linkedList);
            java.lang.String str4 = this.f218423o;
            if (str4 != null && zArr[9]) {
                fVar.j(9, str4);
            }
            java.lang.String str5 = this.f218424p;
            if (str5 != null && zArr[10]) {
                fVar.j(10, str5);
            }
            if (zArr[11]) {
                fVar.e(11, this.f218425q);
            }
            if (zArr[12]) {
                fVar.e(12, this.f218426r);
            }
            if (!zArr[13]) {
                return 0;
            }
            fVar.e(13, this.f218427s);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f218415d;
            int j17 = (str6 == null || !zArr[1]) ? 0 : 0 + b36.f.j(1, str6);
            java.lang.String str7 = this.f218416e;
            if (str7 != null && zArr[2]) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f218417f;
            if (str8 != null && zArr[3]) {
                j17 += b36.f.j(3, str8);
            }
            if (zArr[4]) {
                j17 += b36.f.e(4, this.f218418g);
            }
            com.tencent.mm.protobuf.g gVar3 = this.f218419h;
            if (gVar3 != null && zArr[5]) {
                j17 += b36.f.b(5, gVar3);
            }
            com.tencent.mm.protobuf.g gVar4 = this.f218420i;
            if (gVar4 != null && zArr[6]) {
                j17 += b36.f.b(6, gVar4);
            }
            if (zArr[7]) {
                j17 += b36.f.e(7, this.f218421m);
            }
            int g17 = j17 + b36.f.g(8, 8, linkedList);
            java.lang.String str9 = this.f218423o;
            if (str9 != null && zArr[9]) {
                g17 += b36.f.j(9, str9);
            }
            java.lang.String str10 = this.f218424p;
            if (str10 != null && zArr[10]) {
                g17 += b36.f.j(10, str10);
            }
            if (zArr[11]) {
                g17 += b36.f.e(11, this.f218425q);
            }
            if (zArr[12]) {
                g17 += b36.f.e(12, this.f218426r);
            }
            return zArr[13] ? g17 + b36.f.e(13, this.f218427s) : g17;
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
                this.f218415d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f218416e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f218417f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f218418g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f218419h = aVar2.d(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f218420i = aVar2.d(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f218421m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    com.tencent.wechat.mm.biz.n2 n2Var = new com.tencent.wechat.mm.biz.n2();
                    if (bArr != null && bArr.length > 0) {
                        n2Var.parseFrom(bArr);
                    }
                    linkedList.add(n2Var);
                }
                zArr[8] = true;
                return 0;
            case 9:
                this.f218423o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f218424p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f218425q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f218426r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f218427s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            default:
                return -1;
        }
    }
}
