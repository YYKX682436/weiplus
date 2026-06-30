package r45;

/* loaded from: classes12.dex */
public class ro3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.cu5 f385053d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f385054e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f385055f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f385056g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f385057h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f385058i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f385059m;

    /* renamed from: n, reason: collision with root package name */
    public int f385060n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f385061o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f385062p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ro3)) {
            return false;
        }
        r45.ro3 ro3Var = (r45.ro3) fVar;
        return n51.f.a(this.BaseRequest, ro3Var.BaseRequest) && n51.f.a(this.f385053d, ro3Var.f385053d) && n51.f.a(this.f385054e, ro3Var.f385054e) && n51.f.a(this.f385055f, ro3Var.f385055f) && n51.f.a(this.f385056g, ro3Var.f385056g) && n51.f.a(this.f385057h, ro3Var.f385057h) && n51.f.a(this.f385058i, ro3Var.f385058i) && n51.f.a(this.f385059m, ro3Var.f385059m) && n51.f.a(java.lang.Integer.valueOf(this.f385060n), java.lang.Integer.valueOf(ro3Var.f385060n)) && n51.f.a(this.f385061o, ro3Var.f385061o) && n51.f.a(this.f385062p, ro3Var.f385062p);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            r45.cu5 cu5Var = this.f385053d;
            if (cu5Var != null) {
                fVar.i(2, cu5Var.computeSize());
                this.f385053d.writeFields(fVar);
            }
            java.lang.String str = this.f385054e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f385055f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f385056g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f385057h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f385058i;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f385059m;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            fVar.e(9, this.f385060n);
            java.lang.String str7 = this.f385061o;
            if (str7 != null) {
                fVar.j(10, str7);
            }
            java.lang.String str8 = this.f385062p;
            if (str8 != null) {
                fVar.j(11, str8);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            r45.cu5 cu5Var2 = this.f385053d;
            if (cu5Var2 != null) {
                i18 += b36.f.i(2, cu5Var2.computeSize());
            }
            java.lang.String str9 = this.f385054e;
            if (str9 != null) {
                i18 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f385055f;
            if (str10 != null) {
                i18 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f385056g;
            if (str11 != null) {
                i18 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f385057h;
            if (str12 != null) {
                i18 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f385058i;
            if (str13 != null) {
                i18 += b36.f.j(7, str13);
            }
            java.lang.String str14 = this.f385059m;
            if (str14 != null) {
                i18 += b36.f.j(8, str14);
            }
            int e17 = i18 + b36.f.e(9, this.f385060n);
            java.lang.String str15 = this.f385061o;
            if (str15 != null) {
                e17 += b36.f.j(10, str15);
            }
            java.lang.String str16 = this.f385062p;
            return str16 != null ? e17 + b36.f.j(11, str16) : e17;
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
        r45.ro3 ro3Var = (r45.ro3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.parseFrom(bArr);
                    }
                    ro3Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var3.b(bArr2);
                    }
                    ro3Var.f385053d = cu5Var3;
                }
                return 0;
            case 3:
                ro3Var.f385054e = aVar2.k(intValue);
                return 0;
            case 4:
                ro3Var.f385055f = aVar2.k(intValue);
                return 0;
            case 5:
                ro3Var.f385056g = aVar2.k(intValue);
                return 0;
            case 6:
                ro3Var.f385057h = aVar2.k(intValue);
                return 0;
            case 7:
                ro3Var.f385058i = aVar2.k(intValue);
                return 0;
            case 8:
                ro3Var.f385059m = aVar2.k(intValue);
                return 0;
            case 9:
                ro3Var.f385060n = aVar2.g(intValue);
                return 0;
            case 10:
                ro3Var.f385061o = aVar2.k(intValue);
                return 0;
            case 11:
                ro3Var.f385062p = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
