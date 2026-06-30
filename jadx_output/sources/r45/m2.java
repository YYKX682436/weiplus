package r45;

/* loaded from: classes8.dex */
public class m2 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f380076d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f380077e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f380078f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f380079g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f380080h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f380081i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f380082m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f380083n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f380084o;

    /* renamed from: p, reason: collision with root package name */
    public r45.og7 f380085p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f380086q;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.m2)) {
            return false;
        }
        r45.m2 m2Var = (r45.m2) fVar;
        return n51.f.a(this.f380076d, m2Var.f380076d) && n51.f.a(this.f380077e, m2Var.f380077e) && n51.f.a(this.f380078f, m2Var.f380078f) && n51.f.a(this.f380079g, m2Var.f380079g) && n51.f.a(this.f380080h, m2Var.f380080h) && n51.f.a(this.f380081i, m2Var.f380081i) && n51.f.a(this.f380082m, m2Var.f380082m) && n51.f.a(this.f380083n, m2Var.f380083n) && n51.f.a(this.f380084o, m2Var.f380084o) && n51.f.a(this.f380085p, m2Var.f380085p) && n51.f.a(this.f380086q, m2Var.f380086q);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f380076d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f380077e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f380078f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f380079g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f380080h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f380081i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f380082m;
            if (str7 != null) {
                fVar.j(7, str7);
            }
            java.lang.String str8 = this.f380083n;
            if (str8 != null) {
                fVar.j(8, str8);
            }
            java.lang.String str9 = this.f380084o;
            if (str9 != null) {
                fVar.j(9, str9);
            }
            r45.og7 og7Var = this.f380085p;
            if (og7Var != null) {
                fVar.i(10, og7Var.computeSize());
                this.f380085p.writeFields(fVar);
            }
            java.lang.String str10 = this.f380086q;
            if (str10 != null) {
                fVar.j(11, str10);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str11 = this.f380076d;
            int j17 = str11 != null ? 0 + b36.f.j(1, str11) : 0;
            java.lang.String str12 = this.f380077e;
            if (str12 != null) {
                j17 += b36.f.j(2, str12);
            }
            java.lang.String str13 = this.f380078f;
            if (str13 != null) {
                j17 += b36.f.j(3, str13);
            }
            java.lang.String str14 = this.f380079g;
            if (str14 != null) {
                j17 += b36.f.j(4, str14);
            }
            java.lang.String str15 = this.f380080h;
            if (str15 != null) {
                j17 += b36.f.j(5, str15);
            }
            java.lang.String str16 = this.f380081i;
            if (str16 != null) {
                j17 += b36.f.j(6, str16);
            }
            java.lang.String str17 = this.f380082m;
            if (str17 != null) {
                j17 += b36.f.j(7, str17);
            }
            java.lang.String str18 = this.f380083n;
            if (str18 != null) {
                j17 += b36.f.j(8, str18);
            }
            java.lang.String str19 = this.f380084o;
            if (str19 != null) {
                j17 += b36.f.j(9, str19);
            }
            r45.og7 og7Var2 = this.f380085p;
            if (og7Var2 != null) {
                j17 += b36.f.i(10, og7Var2.computeSize());
            }
            java.lang.String str20 = this.f380086q;
            return str20 != null ? j17 + b36.f.j(11, str20) : j17;
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
        r45.m2 m2Var = (r45.m2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                m2Var.f380076d = aVar2.k(intValue);
                return 0;
            case 2:
                m2Var.f380077e = aVar2.k(intValue);
                return 0;
            case 3:
                m2Var.f380078f = aVar2.k(intValue);
                return 0;
            case 4:
                m2Var.f380079g = aVar2.k(intValue);
                return 0;
            case 5:
                m2Var.f380080h = aVar2.k(intValue);
                return 0;
            case 6:
                m2Var.f380081i = aVar2.k(intValue);
                return 0;
            case 7:
                m2Var.f380082m = aVar2.k(intValue);
                return 0;
            case 8:
                m2Var.f380083n = aVar2.k(intValue);
                return 0;
            case 9:
                m2Var.f380084o = aVar2.k(intValue);
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.og7 og7Var3 = new r45.og7();
                    if (bArr != null && bArr.length > 0) {
                        og7Var3.parseFrom(bArr);
                    }
                    m2Var.f380085p = og7Var3;
                }
                return 0;
            case 11:
                m2Var.f380086q = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
