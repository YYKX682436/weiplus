package com.tencent.wechat.mm.brand_service;

/* loaded from: classes2.dex */
public class o extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f219095d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f219096e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f219097f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f219098g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f219099h;

    /* renamed from: i, reason: collision with root package name */
    public int f219100i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f219101m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f219102n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f219103o = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f219104p = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public int f219105q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f219106r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.wechat.mm.brand_service.c1 f219107s;

    static {
        new com.tencent.wechat.mm.brand_service.o();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.brand_service.o parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.brand_service.o) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.brand_service.o)) {
            return false;
        }
        com.tencent.wechat.mm.brand_service.o oVar = (com.tencent.wechat.mm.brand_service.o) fVar;
        return n51.f.a(this.f219095d, oVar.f219095d) && n51.f.a(this.f219096e, oVar.f219096e) && n51.f.a(this.f219097f, oVar.f219097f) && n51.f.a(this.f219098g, oVar.f219098g) && n51.f.a(this.f219099h, oVar.f219099h) && n51.f.a(java.lang.Integer.valueOf(this.f219100i), java.lang.Integer.valueOf(oVar.f219100i)) && n51.f.a(this.f219101m, oVar.f219101m) && n51.f.a(this.f219102n, oVar.f219102n) && n51.f.a(this.f219103o, oVar.f219103o) && n51.f.a(this.f219104p, oVar.f219104p) && n51.f.a(java.lang.Integer.valueOf(this.f219105q), java.lang.Integer.valueOf(oVar.f219105q)) && n51.f.a(this.f219106r, oVar.f219106r) && n51.f.a(this.f219107s, oVar.f219107s);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.brand_service.o();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f219104p;
        java.util.LinkedList linkedList2 = this.f219103o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f219095d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f219096e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f219097f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f219098g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f219099h;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            fVar.e(7, this.f219100i);
            java.lang.String str6 = this.f219101m;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            java.lang.String str7 = this.f219102n;
            if (str7 != null) {
                fVar.j(9, str7);
            }
            fVar.g(10, 8, linkedList2);
            fVar.g(11, 1, linkedList);
            fVar.e(12, this.f219105q);
            java.lang.String str8 = this.f219106r;
            if (str8 != null) {
                fVar.j(13, str8);
            }
            com.tencent.wechat.mm.brand_service.c1 c1Var = this.f219107s;
            if (c1Var != null) {
                fVar.i(14, c1Var.computeSize());
                this.f219107s.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f219095d;
            int j17 = str9 != null ? b36.f.j(1, str9) + 0 : 0;
            java.lang.String str10 = this.f219096e;
            if (str10 != null) {
                j17 += b36.f.j(2, str10);
            }
            java.lang.String str11 = this.f219097f;
            if (str11 != null) {
                j17 += b36.f.j(3, str11);
            }
            java.lang.String str12 = this.f219098g;
            if (str12 != null) {
                j17 += b36.f.j(4, str12);
            }
            java.lang.String str13 = this.f219099h;
            if (str13 != null) {
                j17 += b36.f.j(6, str13);
            }
            int e17 = j17 + b36.f.e(7, this.f219100i);
            java.lang.String str14 = this.f219101m;
            if (str14 != null) {
                e17 += b36.f.j(8, str14);
            }
            java.lang.String str15 = this.f219102n;
            if (str15 != null) {
                e17 += b36.f.j(9, str15);
            }
            int g17 = e17 + b36.f.g(10, 8, linkedList2) + b36.f.g(11, 1, linkedList) + b36.f.e(12, this.f219105q);
            java.lang.String str16 = this.f219106r;
            if (str16 != null) {
                g17 += b36.f.j(13, str16);
            }
            com.tencent.wechat.mm.brand_service.c1 c1Var2 = this.f219107s;
            return c1Var2 != null ? g17 + b36.f.i(14, c1Var2.computeSize()) : g17;
        }
        if (i17 == 2) {
            linkedList2.clear();
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
                this.f219095d = aVar2.k(intValue);
                return 0;
            case 2:
                this.f219096e = aVar2.k(intValue);
                return 0;
            case 3:
                this.f219097f = aVar2.k(intValue);
                return 0;
            case 4:
                this.f219098g = aVar2.k(intValue);
                return 0;
            case 5:
            default:
                return -1;
            case 6:
                this.f219099h = aVar2.k(intValue);
                return 0;
            case 7:
                this.f219100i = aVar2.g(intValue);
                return 0;
            case 8:
                this.f219101m = aVar2.k(intValue);
                return 0;
            case 9:
                this.f219102n = aVar2.k(intValue);
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    com.tencent.wechat.mm.brand_service.p pVar = new com.tencent.wechat.mm.brand_service.p();
                    if (bArr != null && bArr.length > 0) {
                        pVar.parseFrom(bArr);
                    }
                    linkedList2.add(pVar);
                }
                return 0;
            case 11:
                linkedList.add(aVar2.k(intValue));
                return 0;
            case 12:
                this.f219105q = aVar2.g(intValue);
                return 0;
            case 13:
                this.f219106r = aVar2.k(intValue);
                return 0;
            case 14:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    com.tencent.wechat.mm.brand_service.c1 c1Var3 = new com.tencent.wechat.mm.brand_service.c1();
                    if (bArr2 != null && bArr2.length > 0) {
                        c1Var3.parseFrom(bArr2);
                    }
                    this.f219107s = c1Var3;
                }
                return 0;
        }
    }
}
