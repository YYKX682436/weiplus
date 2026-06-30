package r45;

/* loaded from: classes9.dex */
public class du4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f372748d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f372749e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f372750f;

    /* renamed from: g, reason: collision with root package name */
    public int f372751g;

    /* renamed from: h, reason: collision with root package name */
    public int f372752h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f372753i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f372754m;

    /* renamed from: n, reason: collision with root package name */
    public r45.bm5 f372755n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.du4)) {
            return false;
        }
        r45.du4 du4Var = (r45.du4) fVar;
        return n51.f.a(this.f372748d, du4Var.f372748d) && n51.f.a(this.f372749e, du4Var.f372749e) && n51.f.a(this.f372750f, du4Var.f372750f) && n51.f.a(java.lang.Integer.valueOf(this.f372751g), java.lang.Integer.valueOf(du4Var.f372751g)) && n51.f.a(java.lang.Integer.valueOf(this.f372752h), java.lang.Integer.valueOf(du4Var.f372752h)) && n51.f.a(this.f372753i, du4Var.f372753i) && n51.f.a(this.f372754m, du4Var.f372754m) && n51.f.a(this.f372755n, du4Var.f372755n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f372748d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f372749e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f372750f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f372751g);
            fVar.e(5, this.f372752h);
            java.lang.String str4 = this.f372753i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f372754m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            r45.bm5 bm5Var = this.f372755n;
            if (bm5Var != null) {
                fVar.i(8, bm5Var.computeSize());
                this.f372755n.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f372748d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f372749e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f372750f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            int e17 = j17 + b36.f.e(4, this.f372751g) + b36.f.e(5, this.f372752h);
            java.lang.String str9 = this.f372753i;
            if (str9 != null) {
                e17 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f372754m;
            if (str10 != null) {
                e17 += b36.f.j(7, str10);
            }
            r45.bm5 bm5Var2 = this.f372755n;
            return bm5Var2 != null ? e17 + b36.f.i(8, bm5Var2.computeSize()) : e17;
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
        r45.du4 du4Var = (r45.du4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                du4Var.f372748d = aVar2.k(intValue);
                return 0;
            case 2:
                du4Var.f372749e = aVar2.k(intValue);
                return 0;
            case 3:
                du4Var.f372750f = aVar2.k(intValue);
                return 0;
            case 4:
                du4Var.f372751g = aVar2.g(intValue);
                return 0;
            case 5:
                du4Var.f372752h = aVar2.g(intValue);
                return 0;
            case 6:
                du4Var.f372753i = aVar2.k(intValue);
                return 0;
            case 7:
                du4Var.f372754m = aVar2.k(intValue);
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.bm5 bm5Var3 = new r45.bm5();
                    if (bArr != null && bArr.length > 0) {
                        bm5Var3.parseFrom(bArr);
                    }
                    du4Var.f372755n = bm5Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
