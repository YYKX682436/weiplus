package r45;

/* loaded from: classes9.dex */
public class jd extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f377710d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f377711e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f377712f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f377713g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f377714h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f377715i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f377716m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f377717n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.jd)) {
            return false;
        }
        r45.jd jdVar = (r45.jd) fVar;
        return n51.f.a(this.f377710d, jdVar.f377710d) && n51.f.a(this.f377711e, jdVar.f377711e) && n51.f.a(this.f377712f, jdVar.f377712f) && n51.f.a(this.f377713g, jdVar.f377713g) && n51.f.a(this.f377714h, jdVar.f377714h) && n51.f.a(this.f377715i, jdVar.f377715i) && n51.f.a(this.f377716m, jdVar.f377716m) && n51.f.a(this.f377717n, jdVar.f377717n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f377710d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f377711e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f377712f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f377713g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f377714h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f377715i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f377716m;
            if (str7 != null) {
                fVar.j(7, str7);
            }
            java.lang.String str8 = this.f377717n;
            if (str8 != null) {
                fVar.j(8, str8);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f377710d;
            int j17 = str9 != null ? 0 + b36.f.j(1, str9) : 0;
            java.lang.String str10 = this.f377711e;
            if (str10 != null) {
                j17 += b36.f.j(2, str10);
            }
            java.lang.String str11 = this.f377712f;
            if (str11 != null) {
                j17 += b36.f.j(3, str11);
            }
            java.lang.String str12 = this.f377713g;
            if (str12 != null) {
                j17 += b36.f.j(4, str12);
            }
            java.lang.String str13 = this.f377714h;
            if (str13 != null) {
                j17 += b36.f.j(5, str13);
            }
            java.lang.String str14 = this.f377715i;
            if (str14 != null) {
                j17 += b36.f.j(6, str14);
            }
            java.lang.String str15 = this.f377716m;
            if (str15 != null) {
                j17 += b36.f.j(7, str15);
            }
            java.lang.String str16 = this.f377717n;
            return str16 != null ? j17 + b36.f.j(8, str16) : j17;
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
        r45.jd jdVar = (r45.jd) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                jdVar.f377710d = aVar2.k(intValue);
                return 0;
            case 2:
                jdVar.f377711e = aVar2.k(intValue);
                return 0;
            case 3:
                jdVar.f377712f = aVar2.k(intValue);
                return 0;
            case 4:
                jdVar.f377713g = aVar2.k(intValue);
                return 0;
            case 5:
                jdVar.f377714h = aVar2.k(intValue);
                return 0;
            case 6:
                jdVar.f377715i = aVar2.k(intValue);
                return 0;
            case 7:
                jdVar.f377716m = aVar2.k(intValue);
                return 0;
            case 8:
                jdVar.f377717n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
