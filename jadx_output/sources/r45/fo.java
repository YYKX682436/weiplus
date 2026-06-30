package r45;

/* loaded from: classes9.dex */
public class fo extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f374473d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f374474e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f374475f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f374476g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f374477h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f374478i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f374479m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fo)) {
            return false;
        }
        r45.fo foVar = (r45.fo) fVar;
        return n51.f.a(this.f374473d, foVar.f374473d) && n51.f.a(this.f374474e, foVar.f374474e) && n51.f.a(this.f374475f, foVar.f374475f) && n51.f.a(this.f374476g, foVar.f374476g) && n51.f.a(this.f374477h, foVar.f374477h) && n51.f.a(this.f374478i, foVar.f374478i) && n51.f.a(this.f374479m, foVar.f374479m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f374473d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f374474e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f374475f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f374476g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f374477h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f374478i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f374479m;
            if (str7 != null) {
                fVar.j(7, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f374473d;
            int j17 = str8 != null ? 0 + b36.f.j(1, str8) : 0;
            java.lang.String str9 = this.f374474e;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f374475f;
            if (str10 != null) {
                j17 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f374476g;
            if (str11 != null) {
                j17 += b36.f.j(4, str11);
            }
            java.lang.String str12 = this.f374477h;
            if (str12 != null) {
                j17 += b36.f.j(5, str12);
            }
            java.lang.String str13 = this.f374478i;
            if (str13 != null) {
                j17 += b36.f.j(6, str13);
            }
            java.lang.String str14 = this.f374479m;
            return str14 != null ? j17 + b36.f.j(7, str14) : j17;
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
        r45.fo foVar = (r45.fo) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                foVar.f374473d = aVar2.k(intValue);
                return 0;
            case 2:
                foVar.f374474e = aVar2.k(intValue);
                return 0;
            case 3:
                foVar.f374475f = aVar2.k(intValue);
                return 0;
            case 4:
                foVar.f374476g = aVar2.k(intValue);
                return 0;
            case 5:
                foVar.f374477h = aVar2.k(intValue);
                return 0;
            case 6:
                foVar.f374478i = aVar2.k(intValue);
                return 0;
            case 7:
                foVar.f374479m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
