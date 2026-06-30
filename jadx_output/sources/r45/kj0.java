package r45;

/* loaded from: classes12.dex */
public class kj0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.ij0 f378726d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f378727e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f378728f;

    /* renamed from: g, reason: collision with root package name */
    public int f378729g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f378730h;

    /* renamed from: i, reason: collision with root package name */
    public int f378731i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f378732m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f378733n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f378734o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f378735p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f378736q;

    /* renamed from: r, reason: collision with root package name */
    public r45.lj0 f378737r;

    static {
        new r45.kj0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r45.kj0 parseFrom(byte[] bArr) {
        return (r45.kj0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.kj0)) {
            return false;
        }
        r45.kj0 kj0Var = (r45.kj0) fVar;
        return n51.f.a(this.f378726d, kj0Var.f378726d) && n51.f.a(this.f378727e, kj0Var.f378727e) && n51.f.a(this.f378728f, kj0Var.f378728f) && n51.f.a(java.lang.Integer.valueOf(this.f378729g), java.lang.Integer.valueOf(kj0Var.f378729g)) && n51.f.a(this.f378730h, kj0Var.f378730h) && n51.f.a(java.lang.Integer.valueOf(this.f378731i), java.lang.Integer.valueOf(kj0Var.f378731i)) && n51.f.a(this.f378732m, kj0Var.f378732m) && n51.f.a(this.f378733n, kj0Var.f378733n) && n51.f.a(this.f378734o, kj0Var.f378734o) && n51.f.a(this.f378735p, kj0Var.f378735p) && n51.f.a(this.f378736q, kj0Var.f378736q) && n51.f.a(this.f378737r, kj0Var.f378737r);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.kj0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ij0 ij0Var = this.f378726d;
            if (ij0Var != null) {
                fVar.i(1, ij0Var.computeSize());
                this.f378726d.writeFields(fVar);
            }
            java.lang.String str = this.f378727e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f378728f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f378729g);
            java.lang.String str3 = this.f378730h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f378731i);
            java.lang.String str4 = this.f378732m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f378733n;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f378734o;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            java.lang.String str7 = this.f378735p;
            if (str7 != null) {
                fVar.j(10, str7);
            }
            java.lang.String str8 = this.f378736q;
            if (str8 != null) {
                fVar.j(11, str8);
            }
            r45.lj0 lj0Var = this.f378737r;
            if (lj0Var != null) {
                fVar.i(12, lj0Var.computeSize());
                this.f378737r.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ij0 ij0Var2 = this.f378726d;
            int i18 = ij0Var2 != null ? 0 + b36.f.i(1, ij0Var2.computeSize()) : 0;
            java.lang.String str9 = this.f378727e;
            if (str9 != null) {
                i18 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f378728f;
            if (str10 != null) {
                i18 += b36.f.j(3, str10);
            }
            int e17 = i18 + b36.f.e(4, this.f378729g);
            java.lang.String str11 = this.f378730h;
            if (str11 != null) {
                e17 += b36.f.j(5, str11);
            }
            int e18 = e17 + b36.f.e(6, this.f378731i);
            java.lang.String str12 = this.f378732m;
            if (str12 != null) {
                e18 += b36.f.j(7, str12);
            }
            java.lang.String str13 = this.f378733n;
            if (str13 != null) {
                e18 += b36.f.j(8, str13);
            }
            java.lang.String str14 = this.f378734o;
            if (str14 != null) {
                e18 += b36.f.j(9, str14);
            }
            java.lang.String str15 = this.f378735p;
            if (str15 != null) {
                e18 += b36.f.j(10, str15);
            }
            java.lang.String str16 = this.f378736q;
            if (str16 != null) {
                e18 += b36.f.j(11, str16);
            }
            r45.lj0 lj0Var2 = this.f378737r;
            return lj0Var2 != null ? e18 + b36.f.i(12, lj0Var2.computeSize()) : e18;
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
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ij0 ij0Var3 = new r45.ij0();
                    if (bArr != null && bArr.length > 0) {
                        ij0Var3.parseFrom(bArr);
                    }
                    this.f378726d = ij0Var3;
                }
                return 0;
            case 2:
                this.f378727e = aVar2.k(intValue);
                return 0;
            case 3:
                this.f378728f = aVar2.k(intValue);
                return 0;
            case 4:
                this.f378729g = aVar2.g(intValue);
                return 0;
            case 5:
                this.f378730h = aVar2.k(intValue);
                return 0;
            case 6:
                this.f378731i = aVar2.g(intValue);
                return 0;
            case 7:
                this.f378732m = aVar2.k(intValue);
                return 0;
            case 8:
                this.f378733n = aVar2.k(intValue);
                return 0;
            case 9:
                this.f378734o = aVar2.k(intValue);
                return 0;
            case 10:
                this.f378735p = aVar2.k(intValue);
                return 0;
            case 11:
                this.f378736q = aVar2.k(intValue);
                return 0;
            case 12:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.lj0 lj0Var3 = new r45.lj0();
                    if (bArr2 != null && bArr2.length > 0) {
                        lj0Var3.parseFrom(bArr2);
                    }
                    this.f378737r = lj0Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
