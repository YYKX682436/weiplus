package r45;

/* loaded from: classes9.dex */
public class zh extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f392045d;

    /* renamed from: e, reason: collision with root package name */
    public int f392046e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f392047f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f392048g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f392049h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f392050i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f392051m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f392052n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f392053o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zh)) {
            return false;
        }
        r45.zh zhVar = (r45.zh) fVar;
        return n51.f.a(this.BaseRequest, zhVar.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f392045d), java.lang.Integer.valueOf(zhVar.f392045d)) && n51.f.a(java.lang.Integer.valueOf(this.f392046e), java.lang.Integer.valueOf(zhVar.f392046e)) && n51.f.a(this.f392047f, zhVar.f392047f) && n51.f.a(this.f392048g, zhVar.f392048g) && n51.f.a(this.f392049h, zhVar.f392049h) && n51.f.a(this.f392050i, zhVar.f392050i) && n51.f.a(this.f392051m, zhVar.f392051m) && n51.f.a(this.f392052n, zhVar.f392052n) && n51.f.a(this.f392053o, zhVar.f392053o);
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
            fVar.e(2, this.f392045d);
            fVar.e(3, this.f392046e);
            java.lang.String str = this.f392047f;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f392048g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f392049h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f392050i;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f392051m;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f392052n;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            java.lang.String str7 = this.f392053o;
            if (str7 != null) {
                fVar.j(10, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f392045d) + b36.f.e(3, this.f392046e);
            java.lang.String str8 = this.f392047f;
            if (str8 != null) {
                i18 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f392048g;
            if (str9 != null) {
                i18 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f392049h;
            if (str10 != null) {
                i18 += b36.f.j(6, str10);
            }
            java.lang.String str11 = this.f392050i;
            if (str11 != null) {
                i18 += b36.f.j(7, str11);
            }
            java.lang.String str12 = this.f392051m;
            if (str12 != null) {
                i18 += b36.f.j(8, str12);
            }
            java.lang.String str13 = this.f392052n;
            if (str13 != null) {
                i18 += b36.f.j(9, str13);
            }
            java.lang.String str14 = this.f392053o;
            return str14 != null ? i18 + b36.f.j(10, str14) : i18;
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
        r45.zh zhVar = (r45.zh) objArr[1];
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
                    zhVar.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                zhVar.f392045d = aVar2.g(intValue);
                return 0;
            case 3:
                zhVar.f392046e = aVar2.g(intValue);
                return 0;
            case 4:
                zhVar.f392047f = aVar2.k(intValue);
                return 0;
            case 5:
                zhVar.f392048g = aVar2.k(intValue);
                return 0;
            case 6:
                zhVar.f392049h = aVar2.k(intValue);
                return 0;
            case 7:
                zhVar.f392050i = aVar2.k(intValue);
                return 0;
            case 8:
                zhVar.f392051m = aVar2.k(intValue);
                return 0;
            case 9:
                zhVar.f392052n = aVar2.k(intValue);
                return 0;
            case 10:
                zhVar.f392053o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
