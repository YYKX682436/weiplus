package r45;

/* loaded from: classes7.dex */
public class gn0 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f375369d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f375370e;

    /* renamed from: f, reason: collision with root package name */
    public int f375371f;

    /* renamed from: g, reason: collision with root package name */
    public int f375372g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f375373h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f375374i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f375375m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f375376n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f375377o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gn0)) {
            return false;
        }
        r45.gn0 gn0Var = (r45.gn0) fVar;
        return n51.f.a(this.BaseRequest, gn0Var.BaseRequest) && n51.f.a(this.f375369d, gn0Var.f375369d) && n51.f.a(this.f375370e, gn0Var.f375370e) && n51.f.a(java.lang.Integer.valueOf(this.f375371f), java.lang.Integer.valueOf(gn0Var.f375371f)) && n51.f.a(java.lang.Integer.valueOf(this.f375372g), java.lang.Integer.valueOf(gn0Var.f375372g)) && n51.f.a(this.f375373h, gn0Var.f375373h) && n51.f.a(this.f375374i, gn0Var.f375374i) && n51.f.a(this.f375375m, gn0Var.f375375m) && n51.f.a(this.f375376n, gn0Var.f375376n) && n51.f.a(this.f375377o, gn0Var.f375377o);
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
            java.lang.String str = this.f375369d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f375370e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f375371f);
            fVar.e(5, this.f375372g);
            java.lang.String str3 = this.f375373h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f375374i;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f375375m;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f375376n;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            java.lang.String str7 = this.f375377o;
            if (str7 != null) {
                fVar.j(10, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str8 = this.f375369d;
            if (str8 != null) {
                i18 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f375370e;
            if (str9 != null) {
                i18 += b36.f.j(3, str9);
            }
            int e17 = i18 + b36.f.e(4, this.f375371f) + b36.f.e(5, this.f375372g);
            java.lang.String str10 = this.f375373h;
            if (str10 != null) {
                e17 += b36.f.j(6, str10);
            }
            java.lang.String str11 = this.f375374i;
            if (str11 != null) {
                e17 += b36.f.j(7, str11);
            }
            java.lang.String str12 = this.f375375m;
            if (str12 != null) {
                e17 += b36.f.j(8, str12);
            }
            java.lang.String str13 = this.f375376n;
            if (str13 != null) {
                e17 += b36.f.j(9, str13);
            }
            java.lang.String str14 = this.f375377o;
            return str14 != null ? e17 + b36.f.j(10, str14) : e17;
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
        r45.gn0 gn0Var = (r45.gn0) objArr[1];
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
                    gn0Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                gn0Var.f375369d = aVar2.k(intValue);
                return 0;
            case 3:
                gn0Var.f375370e = aVar2.k(intValue);
                return 0;
            case 4:
                gn0Var.f375371f = aVar2.g(intValue);
                return 0;
            case 5:
                gn0Var.f375372g = aVar2.g(intValue);
                return 0;
            case 6:
                gn0Var.f375373h = aVar2.k(intValue);
                return 0;
            case 7:
                gn0Var.f375374i = aVar2.k(intValue);
                return 0;
            case 8:
                gn0Var.f375375m = aVar2.k(intValue);
                return 0;
            case 9:
                gn0Var.f375376n = aVar2.k(intValue);
                return 0;
            case 10:
                gn0Var.f375377o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
