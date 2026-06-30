package r45;

/* loaded from: classes9.dex */
public class od extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f382154d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f382155e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f382156f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f382157g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f382158h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f382159i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f382160m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f382161n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f382162o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.od)) {
            return false;
        }
        r45.od odVar = (r45.od) fVar;
        return n51.f.a(this.f382154d, odVar.f382154d) && n51.f.a(this.f382155e, odVar.f382155e) && n51.f.a(this.f382156f, odVar.f382156f) && n51.f.a(this.f382157g, odVar.f382157g) && n51.f.a(this.f382158h, odVar.f382158h) && n51.f.a(this.f382159i, odVar.f382159i) && n51.f.a(this.f382160m, odVar.f382160m) && n51.f.a(java.lang.Boolean.valueOf(this.f382161n), java.lang.Boolean.valueOf(odVar.f382161n)) && n51.f.a(this.f382162o, odVar.f382162o);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f382154d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f382155e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f382156f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f382157g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f382158h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f382159i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f382160m;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            fVar.a(9, this.f382161n);
            java.lang.String str8 = this.f382162o;
            if (str8 != null) {
                fVar.j(10, str8);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f382154d;
            int j17 = str9 != null ? 0 + b36.f.j(1, str9) : 0;
            java.lang.String str10 = this.f382155e;
            if (str10 != null) {
                j17 += b36.f.j(2, str10);
            }
            java.lang.String str11 = this.f382156f;
            if (str11 != null) {
                j17 += b36.f.j(3, str11);
            }
            java.lang.String str12 = this.f382157g;
            if (str12 != null) {
                j17 += b36.f.j(4, str12);
            }
            java.lang.String str13 = this.f382158h;
            if (str13 != null) {
                j17 += b36.f.j(5, str13);
            }
            java.lang.String str14 = this.f382159i;
            if (str14 != null) {
                j17 += b36.f.j(6, str14);
            }
            java.lang.String str15 = this.f382160m;
            if (str15 != null) {
                j17 += b36.f.j(8, str15);
            }
            int a17 = j17 + b36.f.a(9, this.f382161n);
            java.lang.String str16 = this.f382162o;
            return str16 != null ? a17 + b36.f.j(10, str16) : a17;
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
        r45.od odVar = (r45.od) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                odVar.f382154d = aVar2.k(intValue);
                return 0;
            case 2:
                odVar.f382155e = aVar2.k(intValue);
                return 0;
            case 3:
                odVar.f382156f = aVar2.k(intValue);
                return 0;
            case 4:
                odVar.f382157g = aVar2.k(intValue);
                return 0;
            case 5:
                odVar.f382158h = aVar2.k(intValue);
                return 0;
            case 6:
                odVar.f382159i = aVar2.k(intValue);
                return 0;
            case 7:
            default:
                return -1;
            case 8:
                odVar.f382160m = aVar2.k(intValue);
                return 0;
            case 9:
                odVar.f382161n = aVar2.c(intValue);
                return 0;
            case 10:
                odVar.f382162o = aVar2.k(intValue);
                return 0;
        }
    }
}
