package com.tencent.wechat.mm.finder_box;

/* loaded from: classes2.dex */
public class v2 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f219879d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f219880e;

    /* renamed from: f, reason: collision with root package name */
    public int f219881f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f219882g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f219883h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f219884i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f219885m;

    /* renamed from: n, reason: collision with root package name */
    public int f219886n;

    /* renamed from: o, reason: collision with root package name */
    public int f219887o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.wechat.mm.finder_box.t2 f219888p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.wechat.mm.finder_box.u2 f219889q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f219890r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean[] f219891s = new boolean[13];

    static {
        new com.tencent.wechat.mm.finder_box.v2();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.finder_box.v2 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.finder_box.v2) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.finder_box.v2)) {
            return false;
        }
        com.tencent.wechat.mm.finder_box.v2 v2Var = (com.tencent.wechat.mm.finder_box.v2) fVar;
        return n51.f.a(this.f219879d, v2Var.f219879d) && n51.f.a(this.f219880e, v2Var.f219880e) && n51.f.a(java.lang.Integer.valueOf(this.f219881f), java.lang.Integer.valueOf(v2Var.f219881f)) && n51.f.a(this.f219882g, v2Var.f219882g) && n51.f.a(this.f219883h, v2Var.f219883h) && n51.f.a(this.f219884i, v2Var.f219884i) && n51.f.a(this.f219885m, v2Var.f219885m) && n51.f.a(java.lang.Integer.valueOf(this.f219886n), java.lang.Integer.valueOf(v2Var.f219886n)) && n51.f.a(java.lang.Integer.valueOf(this.f219887o), java.lang.Integer.valueOf(v2Var.f219887o)) && n51.f.a(this.f219888p, v2Var.f219888p) && n51.f.a(this.f219889q, v2Var.f219889q) && n51.f.a(this.f219890r, v2Var.f219890r);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.finder_box.v2();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f219891s;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f219879d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f219880e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            if (zArr[3]) {
                fVar.e(3, this.f219881f);
            }
            java.lang.String str3 = this.f219882g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f219883h;
            if (str4 != null && zArr[5]) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f219884i;
            if (str5 != null && zArr[6]) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f219885m;
            if (str6 != null && zArr[7]) {
                fVar.j(7, str6);
            }
            if (zArr[8]) {
                fVar.e(8, this.f219886n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f219887o);
            }
            com.tencent.wechat.mm.finder_box.t2 t2Var = this.f219888p;
            if (t2Var != null && zArr[10]) {
                fVar.i(10, t2Var.computeSize());
                this.f219888p.writeFields(fVar);
            }
            com.tencent.wechat.mm.finder_box.u2 u2Var = this.f219889q;
            if (u2Var != null && zArr[11]) {
                fVar.i(11, u2Var.computeSize());
                this.f219889q.writeFields(fVar);
            }
            java.lang.String str7 = this.f219890r;
            if (str7 == null || !zArr[12]) {
                return 0;
            }
            fVar.j(12, str7);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f219879d;
            int j17 = (str8 == null || !zArr[1]) ? 0 : 0 + b36.f.j(1, str8);
            java.lang.String str9 = this.f219880e;
            if (str9 != null && zArr[2]) {
                j17 += b36.f.j(2, str9);
            }
            if (zArr[3]) {
                j17 += b36.f.e(3, this.f219881f);
            }
            java.lang.String str10 = this.f219882g;
            if (str10 != null && zArr[4]) {
                j17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f219883h;
            if (str11 != null && zArr[5]) {
                j17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f219884i;
            if (str12 != null && zArr[6]) {
                j17 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f219885m;
            if (str13 != null && zArr[7]) {
                j17 += b36.f.j(7, str13);
            }
            if (zArr[8]) {
                j17 += b36.f.e(8, this.f219886n);
            }
            if (zArr[9]) {
                j17 += b36.f.e(9, this.f219887o);
            }
            com.tencent.wechat.mm.finder_box.t2 t2Var2 = this.f219888p;
            if (t2Var2 != null && zArr[10]) {
                j17 += b36.f.i(10, t2Var2.computeSize());
            }
            com.tencent.wechat.mm.finder_box.u2 u2Var2 = this.f219889q;
            if (u2Var2 != null && zArr[11]) {
                j17 += b36.f.i(11, u2Var2.computeSize());
            }
            java.lang.String str14 = this.f219890r;
            return (str14 == null || !zArr[12]) ? j17 : j17 + b36.f.j(12, str14);
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
        switch (intValue) {
            case 1:
                this.f219879d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f219880e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f219881f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f219882g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f219883h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f219884i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f219885m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f219886n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f219887o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    com.tencent.wechat.mm.finder_box.t2 t2Var3 = new com.tencent.wechat.mm.finder_box.t2();
                    if (bArr != null && bArr.length > 0) {
                        t2Var3.parseFrom(bArr);
                    }
                    this.f219888p = t2Var3;
                }
                zArr[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    com.tencent.wechat.mm.finder_box.u2 u2Var3 = new com.tencent.wechat.mm.finder_box.u2();
                    if (bArr2 != null && bArr2.length > 0) {
                        u2Var3.parseFrom(bArr2);
                    }
                    this.f219889q = u2Var3;
                }
                zArr[11] = true;
                return 0;
            case 12:
                this.f219890r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            default:
                return -1;
        }
    }
}
