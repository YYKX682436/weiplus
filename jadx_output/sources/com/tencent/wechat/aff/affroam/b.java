package com.tencent.wechat.aff.affroam;

/* loaded from: classes2.dex */
public class b extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f215783d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f215784e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f215785f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f215786g;

    /* renamed from: h, reason: collision with root package name */
    public long f215787h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f215788i;

    /* renamed from: m, reason: collision with root package name */
    public long f215789m;

    /* renamed from: n, reason: collision with root package name */
    public long f215790n;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f215793q;

    /* renamed from: r, reason: collision with root package name */
    public int f215794r;

    /* renamed from: s, reason: collision with root package name */
    public int f215795s;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f215791o = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f215792p = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    public final boolean[] f215796t = new boolean[14];

    static {
        new com.tencent.wechat.aff.affroam.b();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.aff.affroam.b parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.affroam.b) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.affroam.b)) {
            return false;
        }
        com.tencent.wechat.aff.affroam.b bVar = (com.tencent.wechat.aff.affroam.b) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f215783d), java.lang.Integer.valueOf(bVar.f215783d)) && n51.f.a(this.f215784e, bVar.f215784e) && n51.f.a(this.f215785f, bVar.f215785f) && n51.f.a(this.f215786g, bVar.f215786g) && n51.f.a(java.lang.Long.valueOf(this.f215787h), java.lang.Long.valueOf(bVar.f215787h)) && n51.f.a(this.f215788i, bVar.f215788i) && n51.f.a(java.lang.Long.valueOf(this.f215789m), java.lang.Long.valueOf(bVar.f215789m)) && n51.f.a(java.lang.Long.valueOf(this.f215790n), java.lang.Long.valueOf(bVar.f215790n)) && n51.f.a(this.f215791o, bVar.f215791o) && n51.f.a(this.f215792p, bVar.f215792p) && n51.f.a(this.f215793q, bVar.f215793q) && n51.f.a(java.lang.Integer.valueOf(this.f215794r), java.lang.Integer.valueOf(bVar.f215794r)) && n51.f.a(java.lang.Integer.valueOf(this.f215795s), java.lang.Integer.valueOf(bVar.f215795s));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.affroam.b();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f215792p;
        java.util.LinkedList linkedList2 = this.f215791o;
        boolean[] zArr = this.f215796t;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f215783d);
            }
            java.lang.String str = this.f215784e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f215785f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f215786g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            if (zArr[5]) {
                fVar.h(5, this.f215787h);
            }
            java.lang.String str4 = this.f215788i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            if (zArr[7]) {
                fVar.h(7, this.f215789m);
            }
            if (zArr[8]) {
                fVar.h(8, this.f215790n);
            }
            fVar.g(9, 1, linkedList2);
            fVar.g(10, 2, linkedList);
            java.lang.String str5 = this.f215793q;
            if (str5 != null && zArr[11]) {
                fVar.j(11, str5);
            }
            if (zArr[12]) {
                fVar.e(12, this.f215794r);
            }
            if (zArr[13]) {
                fVar.e(13, this.f215795s);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? b36.f.e(1, this.f215783d) + 0 : 0;
            java.lang.String str6 = this.f215784e;
            if (str6 != null && zArr[2]) {
                e17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f215785f;
            if (str7 != null && zArr[3]) {
                e17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f215786g;
            if (str8 != null && zArr[4]) {
                e17 += b36.f.j(4, str8);
            }
            if (zArr[5]) {
                e17 += b36.f.h(5, this.f215787h);
            }
            java.lang.String str9 = this.f215788i;
            if (str9 != null && zArr[6]) {
                e17 += b36.f.j(6, str9);
            }
            if (zArr[7]) {
                e17 += b36.f.h(7, this.f215789m);
            }
            if (zArr[8]) {
                e17 += b36.f.h(8, this.f215790n);
            }
            int g17 = e17 + b36.f.g(9, 1, linkedList2) + b36.f.g(10, 2, linkedList);
            java.lang.String str10 = this.f215793q;
            if (str10 != null && zArr[11]) {
                g17 += b36.f.j(11, str10);
            }
            if (zArr[12]) {
                g17 += b36.f.e(12, this.f215794r);
            }
            return zArr[13] ? g17 + b36.f.e(13, this.f215795s) : g17;
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
                this.f215783d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f215784e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f215785f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f215786g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f215787h = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f215788i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f215789m = aVar2.i(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f215790n = aVar2.i(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                linkedList2.add(aVar2.k(intValue));
                zArr[9] = true;
                return 0;
            case 10:
                linkedList.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                zArr[10] = true;
                return 0;
            case 11:
                this.f215793q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f215794r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f215795s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            default:
                return -1;
        }
    }
}
