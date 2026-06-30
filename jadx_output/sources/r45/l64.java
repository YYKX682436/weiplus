package r45;

/* loaded from: classes9.dex */
public class l64 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f379170d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f379171e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f379172f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f379173g;

    /* renamed from: h, reason: collision with root package name */
    public r45.fv6 f379174h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f379175i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f379176m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f379177n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f379178o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.l64)) {
            return false;
        }
        r45.l64 l64Var = (r45.l64) fVar;
        return n51.f.a(this.f379170d, l64Var.f379170d) && n51.f.a(this.f379171e, l64Var.f379171e) && n51.f.a(this.f379172f, l64Var.f379172f) && n51.f.a(this.f379173g, l64Var.f379173g) && n51.f.a(this.f379174h, l64Var.f379174h) && n51.f.a(this.f379175i, l64Var.f379175i) && n51.f.a(this.f379176m, l64Var.f379176m) && n51.f.a(this.f379177n, l64Var.f379177n) && n51.f.a(this.f379178o, l64Var.f379178o);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f379170d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f379171e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f379172f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f379173g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            r45.fv6 fv6Var = this.f379174h;
            if (fv6Var != null) {
                fVar.i(5, fv6Var.computeSize());
                this.f379174h.writeFields(fVar);
            }
            java.lang.String str5 = this.f379175i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f379176m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f379177n;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            java.lang.String str8 = this.f379178o;
            if (str8 != null) {
                fVar.j(9, str8);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f379170d;
            int j17 = str9 != null ? 0 + b36.f.j(1, str9) : 0;
            java.lang.String str10 = this.f379171e;
            if (str10 != null) {
                j17 += b36.f.j(2, str10);
            }
            java.lang.String str11 = this.f379172f;
            if (str11 != null) {
                j17 += b36.f.j(3, str11);
            }
            java.lang.String str12 = this.f379173g;
            if (str12 != null) {
                j17 += b36.f.j(4, str12);
            }
            r45.fv6 fv6Var2 = this.f379174h;
            if (fv6Var2 != null) {
                j17 += b36.f.i(5, fv6Var2.computeSize());
            }
            java.lang.String str13 = this.f379175i;
            if (str13 != null) {
                j17 += b36.f.j(6, str13);
            }
            java.lang.String str14 = this.f379176m;
            if (str14 != null) {
                j17 += b36.f.j(7, str14);
            }
            java.lang.String str15 = this.f379177n;
            if (str15 != null) {
                j17 += b36.f.j(8, str15);
            }
            java.lang.String str16 = this.f379178o;
            return str16 != null ? j17 + b36.f.j(9, str16) : j17;
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
        r45.l64 l64Var = (r45.l64) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                l64Var.f379170d = aVar2.k(intValue);
                return 0;
            case 2:
                l64Var.f379171e = aVar2.k(intValue);
                return 0;
            case 3:
                l64Var.f379172f = aVar2.k(intValue);
                return 0;
            case 4:
                l64Var.f379173g = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.fv6 fv6Var3 = new r45.fv6();
                    if (bArr != null && bArr.length > 0) {
                        fv6Var3.parseFrom(bArr);
                    }
                    l64Var.f379174h = fv6Var3;
                }
                return 0;
            case 6:
                l64Var.f379175i = aVar2.k(intValue);
                return 0;
            case 7:
                l64Var.f379176m = aVar2.k(intValue);
                return 0;
            case 8:
                l64Var.f379177n = aVar2.k(intValue);
                return 0;
            case 9:
                l64Var.f379178o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
