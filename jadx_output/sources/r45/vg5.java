package r45;

/* loaded from: classes9.dex */
public class vg5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f388212d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f388213e;

    /* renamed from: f, reason: collision with root package name */
    public int f388214f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f388215g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f388216h;

    /* renamed from: i, reason: collision with root package name */
    public r45.iu3 f388217i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f388218m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f388219n;

    /* renamed from: o, reason: collision with root package name */
    public r45.du4 f388220o;

    /* renamed from: p, reason: collision with root package name */
    public r45.ce4 f388221p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f388222q;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vg5)) {
            return false;
        }
        r45.vg5 vg5Var = (r45.vg5) fVar;
        return n51.f.a(this.BaseResponse, vg5Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f388212d), java.lang.Integer.valueOf(vg5Var.f388212d)) && n51.f.a(this.f388213e, vg5Var.f388213e) && n51.f.a(java.lang.Integer.valueOf(this.f388214f), java.lang.Integer.valueOf(vg5Var.f388214f)) && n51.f.a(this.f388215g, vg5Var.f388215g) && n51.f.a(this.f388216h, vg5Var.f388216h) && n51.f.a(this.f388217i, vg5Var.f388217i) && n51.f.a(this.f388218m, vg5Var.f388218m) && n51.f.a(this.f388219n, vg5Var.f388219n) && n51.f.a(this.f388220o, vg5Var.f388220o) && n51.f.a(this.f388221p, vg5Var.f388221p) && n51.f.a(this.f388222q, vg5Var.f388222q);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f388212d);
            java.lang.String str = this.f388213e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f388214f);
            java.lang.String str2 = this.f388215g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f388216h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            r45.iu3 iu3Var = this.f388217i;
            if (iu3Var != null) {
                fVar.i(7, iu3Var.computeSize());
                this.f388217i.writeFields(fVar);
            }
            java.lang.String str4 = this.f388218m;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f388219n;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            r45.du4 du4Var = this.f388220o;
            if (du4Var != null) {
                fVar.i(10, du4Var.computeSize());
                this.f388220o.writeFields(fVar);
            }
            r45.ce4 ce4Var = this.f388221p;
            if (ce4Var != null) {
                fVar.i(99, ce4Var.computeSize());
                this.f388221p.writeFields(fVar);
            }
            java.lang.String str6 = this.f388222q;
            if (str6 != null) {
                fVar.j(100, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f388212d);
            java.lang.String str7 = this.f388213e;
            if (str7 != null) {
                i18 += b36.f.j(3, str7);
            }
            int e17 = i18 + b36.f.e(4, this.f388214f);
            java.lang.String str8 = this.f388215g;
            if (str8 != null) {
                e17 += b36.f.j(5, str8);
            }
            java.lang.String str9 = this.f388216h;
            if (str9 != null) {
                e17 += b36.f.j(6, str9);
            }
            r45.iu3 iu3Var2 = this.f388217i;
            if (iu3Var2 != null) {
                e17 += b36.f.i(7, iu3Var2.computeSize());
            }
            java.lang.String str10 = this.f388218m;
            if (str10 != null) {
                e17 += b36.f.j(8, str10);
            }
            java.lang.String str11 = this.f388219n;
            if (str11 != null) {
                e17 += b36.f.j(9, str11);
            }
            r45.du4 du4Var2 = this.f388220o;
            if (du4Var2 != null) {
                e17 += b36.f.i(10, du4Var2.computeSize());
            }
            r45.ce4 ce4Var2 = this.f388221p;
            if (ce4Var2 != null) {
                e17 += b36.f.i(99, ce4Var2.computeSize());
            }
            java.lang.String str12 = this.f388222q;
            return str12 != null ? e17 + b36.f.j(100, str12) : e17;
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
        r45.vg5 vg5Var = (r45.vg5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 99) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.ce4 ce4Var3 = new r45.ce4();
                if (bArr != null && bArr.length > 0) {
                    ce4Var3.parseFrom(bArr);
                }
                vg5Var.f388221p = ce4Var3;
            }
            return 0;
        }
        if (intValue == 100) {
            vg5Var.f388222q = aVar2.k(intValue);
            return 0;
        }
        switch (intValue) {
            case 1:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.parseFrom(bArr2);
                    }
                    vg5Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                vg5Var.f388212d = aVar2.g(intValue);
                return 0;
            case 3:
                vg5Var.f388213e = aVar2.k(intValue);
                return 0;
            case 4:
                vg5Var.f388214f = aVar2.g(intValue);
                return 0;
            case 5:
                vg5Var.f388215g = aVar2.k(intValue);
                return 0;
            case 6:
                vg5Var.f388216h = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.iu3 iu3Var3 = new r45.iu3();
                    if (bArr3 != null && bArr3.length > 0) {
                        iu3Var3.parseFrom(bArr3);
                    }
                    vg5Var.f388217i = iu3Var3;
                }
                return 0;
            case 8:
                vg5Var.f388218m = aVar2.k(intValue);
                return 0;
            case 9:
                vg5Var.f388219n = aVar2.k(intValue);
                return 0;
            case 10:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.du4 du4Var3 = new r45.du4();
                    if (bArr4 != null && bArr4.length > 0) {
                        du4Var3.parseFrom(bArr4);
                    }
                    vg5Var.f388220o = du4Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
