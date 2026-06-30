package com.tencent.wechat.mm.finder_box;

/* loaded from: classes9.dex */
public class d1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f219356d;

    /* renamed from: e, reason: collision with root package name */
    public int f219357e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f219358f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f219359g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f219360h;

    /* renamed from: i, reason: collision with root package name */
    public int f219361i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f219362m;

    /* renamed from: n, reason: collision with root package name */
    public int f219363n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f219364o;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.wechat.mm.finder_box.c1 f219367r;

    /* renamed from: s, reason: collision with root package name */
    public int f219368s;

    /* renamed from: t, reason: collision with root package name */
    public int f219369t;

    /* renamed from: u, reason: collision with root package name */
    public int f219370u;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f219365p = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f219366q = new java.util.LinkedList();

    /* renamed from: v, reason: collision with root package name */
    public final boolean[] f219371v = new boolean[16];

    static {
        new com.tencent.wechat.mm.finder_box.d1();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.finder_box.d1)) {
            return false;
        }
        com.tencent.wechat.mm.finder_box.d1 d1Var = (com.tencent.wechat.mm.finder_box.d1) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f219356d), java.lang.Long.valueOf(d1Var.f219356d)) && n51.f.a(java.lang.Integer.valueOf(this.f219357e), java.lang.Integer.valueOf(d1Var.f219357e)) && n51.f.a(this.f219358f, d1Var.f219358f) && n51.f.a(this.f219359g, d1Var.f219359g) && n51.f.a(java.lang.Boolean.valueOf(this.f219360h), java.lang.Boolean.valueOf(d1Var.f219360h)) && n51.f.a(java.lang.Integer.valueOf(this.f219361i), java.lang.Integer.valueOf(d1Var.f219361i)) && n51.f.a(this.f219362m, d1Var.f219362m) && n51.f.a(java.lang.Integer.valueOf(this.f219363n), java.lang.Integer.valueOf(d1Var.f219363n)) && n51.f.a(this.f219364o, d1Var.f219364o) && n51.f.a(this.f219365p, d1Var.f219365p) && n51.f.a(this.f219366q, d1Var.f219366q) && n51.f.a(this.f219367r, d1Var.f219367r) && n51.f.a(java.lang.Integer.valueOf(this.f219368s), java.lang.Integer.valueOf(d1Var.f219368s)) && n51.f.a(java.lang.Integer.valueOf(this.f219369t), java.lang.Integer.valueOf(d1Var.f219369t)) && n51.f.a(java.lang.Integer.valueOf(this.f219370u), java.lang.Integer.valueOf(d1Var.f219370u));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.finder_box.d1();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f219366q;
        java.util.LinkedList linkedList2 = this.f219365p;
        boolean[] zArr = this.f219371v;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f219356d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f219357e);
            }
            java.lang.String str = this.f219358f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f219359g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            if (zArr[5]) {
                fVar.a(5, this.f219360h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f219361i);
            }
            java.lang.String str3 = this.f219362m;
            if (str3 != null && zArr[7]) {
                fVar.j(7, str3);
            }
            if (zArr[8]) {
                fVar.e(8, this.f219363n);
            }
            java.lang.String str4 = this.f219364o;
            if (str4 != null && zArr[9]) {
                fVar.j(9, str4);
            }
            fVar.g(10, 8, linkedList2);
            fVar.g(11, 8, linkedList);
            com.tencent.wechat.mm.finder_box.c1 c1Var = this.f219367r;
            if (c1Var != null && zArr[12]) {
                fVar.i(12, c1Var.computeSize());
                this.f219367r.writeFields(fVar);
            }
            if (zArr[13]) {
                fVar.e(13, this.f219368s);
            }
            if (zArr[14]) {
                fVar.e(14, this.f219369t);
            }
            if (zArr[15]) {
                fVar.e(15, this.f219370u);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? b36.f.h(1, this.f219356d) + 0 : 0;
            if (zArr[2]) {
                h17 += b36.f.e(2, this.f219357e);
            }
            java.lang.String str5 = this.f219358f;
            if (str5 != null && zArr[3]) {
                h17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f219359g;
            if (str6 != null && zArr[4]) {
                h17 += b36.f.j(4, str6);
            }
            if (zArr[5]) {
                h17 += b36.f.a(5, this.f219360h);
            }
            if (zArr[6]) {
                h17 += b36.f.e(6, this.f219361i);
            }
            java.lang.String str7 = this.f219362m;
            if (str7 != null && zArr[7]) {
                h17 += b36.f.j(7, str7);
            }
            if (zArr[8]) {
                h17 += b36.f.e(8, this.f219363n);
            }
            java.lang.String str8 = this.f219364o;
            if (str8 != null && zArr[9]) {
                h17 += b36.f.j(9, str8);
            }
            int g17 = h17 + b36.f.g(10, 8, linkedList2) + b36.f.g(11, 8, linkedList);
            com.tencent.wechat.mm.finder_box.c1 c1Var2 = this.f219367r;
            if (c1Var2 != null && zArr[12]) {
                g17 += b36.f.i(12, c1Var2.computeSize());
            }
            if (zArr[13]) {
                g17 += b36.f.e(13, this.f219368s);
            }
            if (zArr[14]) {
                g17 += b36.f.e(14, this.f219369t);
            }
            return zArr[15] ? g17 + b36.f.e(15, this.f219370u) : g17;
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
                this.f219356d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f219357e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f219358f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f219359g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f219360h = aVar2.c(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f219361i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f219362m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f219363n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f219364o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    com.tencent.wechat.mm.finder_box.e1 e1Var = new com.tencent.wechat.mm.finder_box.e1();
                    if (bArr != null && bArr.length > 0) {
                        e1Var.parseFrom(bArr);
                    }
                    linkedList2.add(e1Var);
                }
                zArr[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    com.tencent.wechat.mm.finder_box.e1 e1Var2 = new com.tencent.wechat.mm.finder_box.e1();
                    if (bArr2 != null && bArr2.length > 0) {
                        e1Var2.parseFrom(bArr2);
                    }
                    linkedList.add(e1Var2);
                }
                zArr[11] = true;
                return 0;
            case 12:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    com.tencent.wechat.mm.finder_box.c1 c1Var3 = new com.tencent.wechat.mm.finder_box.c1();
                    if (bArr3 != null && bArr3.length > 0) {
                        c1Var3.parseFrom(bArr3);
                    }
                    this.f219367r = c1Var3;
                }
                zArr[12] = true;
                return 0;
            case 13:
                this.f219368s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f219369t = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f219370u = aVar2.g(intValue);
                zArr[15] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.finder_box.d1) super.parseFrom(bArr);
    }
}
