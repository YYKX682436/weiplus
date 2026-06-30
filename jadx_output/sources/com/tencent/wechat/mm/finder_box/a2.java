package com.tencent.wechat.mm.finder_box;

/* loaded from: classes2.dex */
public class a2 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f219267d;

    /* renamed from: e, reason: collision with root package name */
    public int f219268e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f219269f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f219270g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f219271h;

    /* renamed from: m, reason: collision with root package name */
    public int f219273m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f219274n;

    /* renamed from: o, reason: collision with root package name */
    public int f219275o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f219276p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f219277q;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f219272i = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public final boolean[] f219278r = new boolean[12];

    static {
        new com.tencent.wechat.mm.finder_box.a2();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.finder_box.a2 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.finder_box.a2) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.finder_box.a2)) {
            return false;
        }
        com.tencent.wechat.mm.finder_box.a2 a2Var = (com.tencent.wechat.mm.finder_box.a2) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f219267d), java.lang.Integer.valueOf(a2Var.f219267d)) && n51.f.a(java.lang.Integer.valueOf(this.f219268e), java.lang.Integer.valueOf(a2Var.f219268e)) && n51.f.a(this.f219269f, a2Var.f219269f) && n51.f.a(this.f219270g, a2Var.f219270g) && n51.f.a(this.f219271h, a2Var.f219271h) && n51.f.a(this.f219272i, a2Var.f219272i) && n51.f.a(java.lang.Integer.valueOf(this.f219273m), java.lang.Integer.valueOf(a2Var.f219273m)) && n51.f.a(this.f219274n, a2Var.f219274n) && n51.f.a(java.lang.Integer.valueOf(this.f219275o), java.lang.Integer.valueOf(a2Var.f219275o)) && n51.f.a(this.f219276p, a2Var.f219276p) && n51.f.a(this.f219277q, a2Var.f219277q);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.finder_box.a2();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f219272i;
        boolean[] zArr = this.f219278r;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f219267d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f219268e);
            }
            java.lang.String str = this.f219269f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f219270g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f219271h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            fVar.g(6, 8, linkedList);
            if (zArr[7]) {
                fVar.e(7, this.f219273m);
            }
            java.lang.String str4 = this.f219274n;
            if (str4 != null && zArr[8]) {
                fVar.j(8, str4);
            }
            if (zArr[9]) {
                fVar.e(9, this.f219275o);
            }
            com.tencent.mm.protobuf.g gVar = this.f219276p;
            if (gVar != null && zArr[10]) {
                fVar.b(10, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f219277q;
            if (gVar2 == null || !zArr[11]) {
                return 0;
            }
            fVar.b(11, gVar2);
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f219267d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f219268e);
            }
            java.lang.String str5 = this.f219269f;
            if (str5 != null && zArr[3]) {
                e17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f219270g;
            if (str6 != null && zArr[4]) {
                e17 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f219271h;
            if (str7 != null && zArr[5]) {
                e17 += b36.f.j(5, str7);
            }
            int g17 = e17 + b36.f.g(6, 8, linkedList);
            if (zArr[7]) {
                g17 += b36.f.e(7, this.f219273m);
            }
            java.lang.String str8 = this.f219274n;
            if (str8 != null && zArr[8]) {
                g17 += b36.f.j(8, str8);
            }
            if (zArr[9]) {
                g17 += b36.f.e(9, this.f219275o);
            }
            com.tencent.mm.protobuf.g gVar3 = this.f219276p;
            if (gVar3 != null && zArr[10]) {
                g17 += b36.f.b(10, gVar3);
            }
            com.tencent.mm.protobuf.g gVar4 = this.f219277q;
            return (gVar4 == null || !zArr[11]) ? g17 : g17 + b36.f.b(11, gVar4);
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
                this.f219267d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f219268e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f219269f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f219270g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f219271h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    com.tencent.wechat.mm.finder_box.a2 a2Var = new com.tencent.wechat.mm.finder_box.a2();
                    if (bArr != null && bArr.length > 0) {
                        a2Var.parseFrom(bArr);
                    }
                    linkedList.add(a2Var);
                }
                zArr[6] = true;
                return 0;
            case 7:
                this.f219273m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f219274n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f219275o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f219276p = aVar2.d(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f219277q = aVar2.d(intValue);
                zArr[11] = true;
                return 0;
            default:
                return -1;
        }
    }
}
