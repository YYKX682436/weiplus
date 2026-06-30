package com.tencent.mm.plugin.voipmp.platform;

/* loaded from: classes14.dex */
public class a extends com.tencent.mm.protobuf.f {

    /* renamed from: y, reason: collision with root package name */
    public static final com.tencent.mm.plugin.voipmp.platform.a f177203y = new com.tencent.mm.plugin.voipmp.platform.a();

    /* renamed from: d, reason: collision with root package name */
    public int f177204d;

    /* renamed from: e, reason: collision with root package name */
    public int f177205e;

    /* renamed from: f, reason: collision with root package name */
    public int f177206f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f177207g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f177208h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f177209i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f177210m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f177211n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f177212o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f177213p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f177214q;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f177216s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f177217t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f177218u;

    /* renamed from: v, reason: collision with root package name */
    public int f177219v;

    /* renamed from: w, reason: collision with root package name */
    public int f177220w;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f177215r = new java.util.LinkedList();

    /* renamed from: x, reason: collision with root package name */
    public final boolean[] f177221x = new boolean[18];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.voipmp.platform.a)) {
            return false;
        }
        com.tencent.mm.plugin.voipmp.platform.a aVar = (com.tencent.mm.plugin.voipmp.platform.a) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f177204d), java.lang.Integer.valueOf(aVar.f177204d)) && n51.f.a(java.lang.Integer.valueOf(this.f177205e), java.lang.Integer.valueOf(aVar.f177205e)) && n51.f.a(java.lang.Integer.valueOf(this.f177206f), java.lang.Integer.valueOf(aVar.f177206f)) && n51.f.a(this.f177207g, aVar.f177207g) && n51.f.a(this.f177208h, aVar.f177208h) && n51.f.a(this.f177209i, aVar.f177209i) && n51.f.a(this.f177210m, aVar.f177210m) && n51.f.a(this.f177211n, aVar.f177211n) && n51.f.a(this.f177212o, aVar.f177212o) && n51.f.a(this.f177213p, aVar.f177213p) && n51.f.a(this.f177214q, aVar.f177214q) && n51.f.a(this.f177215r, aVar.f177215r) && n51.f.a(this.f177216s, aVar.f177216s) && n51.f.a(this.f177217t, aVar.f177217t) && n51.f.a(this.f177218u, aVar.f177218u) && n51.f.a(java.lang.Integer.valueOf(this.f177219v), java.lang.Integer.valueOf(aVar.f177219v)) && n51.f.a(java.lang.Integer.valueOf(this.f177220w), java.lang.Integer.valueOf(aVar.f177220w));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mm.plugin.voipmp.platform.a();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f177215r;
        boolean[] zArr = this.f177221x;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f177204d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f177205e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f177206f);
            }
            java.lang.String str = this.f177207g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f177208h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f177209i;
            if (str3 != null && zArr[6]) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f177210m;
            if (str4 != null && zArr[7]) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f177211n;
            if (str5 != null && zArr[8]) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f177212o;
            if (str6 != null && zArr[9]) {
                fVar.j(9, str6);
            }
            java.lang.String str7 = this.f177213p;
            if (str7 != null && zArr[10]) {
                fVar.j(10, str7);
            }
            java.lang.String str8 = this.f177214q;
            if (str8 != null && zArr[11]) {
                fVar.j(11, str8);
            }
            fVar.g(12, 2, linkedList);
            java.lang.String str9 = this.f177216s;
            if (str9 != null && zArr[13]) {
                fVar.j(13, str9);
            }
            java.lang.String str10 = this.f177217t;
            if (str10 != null && zArr[14]) {
                fVar.j(14, str10);
            }
            java.lang.String str11 = this.f177218u;
            if (str11 != null && zArr[15]) {
                fVar.j(15, str11);
            }
            if (zArr[16]) {
                fVar.e(16, this.f177219v);
            }
            if (zArr[17]) {
                fVar.e(17, this.f177220w);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? b36.f.e(1, this.f177204d) + 0 : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f177205e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f177206f);
            }
            java.lang.String str12 = this.f177207g;
            if (str12 != null && zArr[4]) {
                e17 += b36.f.j(4, str12);
            }
            java.lang.String str13 = this.f177208h;
            if (str13 != null && zArr[5]) {
                e17 += b36.f.j(5, str13);
            }
            java.lang.String str14 = this.f177209i;
            if (str14 != null && zArr[6]) {
                e17 += b36.f.j(6, str14);
            }
            java.lang.String str15 = this.f177210m;
            if (str15 != null && zArr[7]) {
                e17 += b36.f.j(7, str15);
            }
            java.lang.String str16 = this.f177211n;
            if (str16 != null && zArr[8]) {
                e17 += b36.f.j(8, str16);
            }
            java.lang.String str17 = this.f177212o;
            if (str17 != null && zArr[9]) {
                e17 += b36.f.j(9, str17);
            }
            java.lang.String str18 = this.f177213p;
            if (str18 != null && zArr[10]) {
                e17 += b36.f.j(10, str18);
            }
            java.lang.String str19 = this.f177214q;
            if (str19 != null && zArr[11]) {
                e17 += b36.f.j(11, str19);
            }
            int g17 = e17 + b36.f.g(12, 2, linkedList);
            java.lang.String str20 = this.f177216s;
            if (str20 != null && zArr[13]) {
                g17 += b36.f.j(13, str20);
            }
            java.lang.String str21 = this.f177217t;
            if (str21 != null && zArr[14]) {
                g17 += b36.f.j(14, str21);
            }
            java.lang.String str22 = this.f177218u;
            if (str22 != null && zArr[15]) {
                g17 += b36.f.j(15, str22);
            }
            if (zArr[16]) {
                g17 += b36.f.e(16, this.f177219v);
            }
            return zArr[17] ? g17 + b36.f.e(17, this.f177220w) : g17;
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
                this.f177204d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f177205e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f177206f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f177207g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f177208h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f177209i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f177210m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f177211n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f177212o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f177213p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f177214q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                linkedList.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                zArr[12] = true;
                return 0;
            case 13:
                this.f177216s = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f177217t = aVar2.k(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f177218u = aVar2.k(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f177219v = aVar2.g(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f177220w = aVar2.g(intValue);
                zArr[17] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.mm.plugin.voipmp.platform.a) super.parseFrom(bArr);
    }
}
