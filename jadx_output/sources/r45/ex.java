package r45;

/* loaded from: classes9.dex */
public class ex extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f373767d;

    /* renamed from: e, reason: collision with root package name */
    public int f373768e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f373769f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f373770g;

    /* renamed from: h, reason: collision with root package name */
    public int f373771h;

    /* renamed from: i, reason: collision with root package name */
    public int f373772i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f373773m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f373774n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f373775o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f373776p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f373777q;

    /* renamed from: r, reason: collision with root package name */
    public int f373778r;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ex)) {
            return false;
        }
        r45.ex exVar = (r45.ex) fVar;
        return n51.f.a(this.BaseRequest, exVar.BaseRequest) && n51.f.a(this.f373767d, exVar.f373767d) && n51.f.a(java.lang.Integer.valueOf(this.f373768e), java.lang.Integer.valueOf(exVar.f373768e)) && n51.f.a(this.f373769f, exVar.f373769f) && n51.f.a(this.f373770g, exVar.f373770g) && n51.f.a(java.lang.Integer.valueOf(this.f373771h), java.lang.Integer.valueOf(exVar.f373771h)) && n51.f.a(java.lang.Integer.valueOf(this.f373772i), java.lang.Integer.valueOf(exVar.f373772i)) && n51.f.a(this.f373773m, exVar.f373773m) && n51.f.a(this.f373774n, exVar.f373774n) && n51.f.a(this.f373775o, exVar.f373775o) && n51.f.a(this.f373776p, exVar.f373776p) && n51.f.a(this.f373777q, exVar.f373777q) && n51.f.a(java.lang.Integer.valueOf(this.f373778r), java.lang.Integer.valueOf(exVar.f373778r));
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
            java.lang.String str = this.f373767d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f373768e);
            java.lang.String str2 = this.f373769f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f373770g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f373771h);
            fVar.e(7, this.f373772i);
            java.lang.String str4 = this.f373773m;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f373774n;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            java.lang.String str6 = this.f373775o;
            if (str6 != null) {
                fVar.j(10, str6);
            }
            java.lang.String str7 = this.f373776p;
            if (str7 != null) {
                fVar.j(11, str7);
            }
            java.lang.String str8 = this.f373777q;
            if (str8 != null) {
                fVar.j(12, str8);
            }
            fVar.e(13, this.f373778r);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str9 = this.f373767d;
            if (str9 != null) {
                i18 += b36.f.j(2, str9);
            }
            int e17 = i18 + b36.f.e(3, this.f373768e);
            java.lang.String str10 = this.f373769f;
            if (str10 != null) {
                e17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f373770g;
            if (str11 != null) {
                e17 += b36.f.j(5, str11);
            }
            int e18 = e17 + b36.f.e(6, this.f373771h) + b36.f.e(7, this.f373772i);
            java.lang.String str12 = this.f373773m;
            if (str12 != null) {
                e18 += b36.f.j(8, str12);
            }
            java.lang.String str13 = this.f373774n;
            if (str13 != null) {
                e18 += b36.f.j(9, str13);
            }
            java.lang.String str14 = this.f373775o;
            if (str14 != null) {
                e18 += b36.f.j(10, str14);
            }
            java.lang.String str15 = this.f373776p;
            if (str15 != null) {
                e18 += b36.f.j(11, str15);
            }
            java.lang.String str16 = this.f373777q;
            if (str16 != null) {
                e18 += b36.f.j(12, str16);
            }
            return e18 + b36.f.e(13, this.f373778r);
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
        r45.ex exVar = (r45.ex) objArr[1];
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
                    exVar.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                exVar.f373767d = aVar2.k(intValue);
                return 0;
            case 3:
                exVar.f373768e = aVar2.g(intValue);
                return 0;
            case 4:
                exVar.f373769f = aVar2.k(intValue);
                return 0;
            case 5:
                exVar.f373770g = aVar2.k(intValue);
                return 0;
            case 6:
                exVar.f373771h = aVar2.g(intValue);
                return 0;
            case 7:
                exVar.f373772i = aVar2.g(intValue);
                return 0;
            case 8:
                exVar.f373773m = aVar2.k(intValue);
                return 0;
            case 9:
                exVar.f373774n = aVar2.k(intValue);
                return 0;
            case 10:
                exVar.f373775o = aVar2.k(intValue);
                return 0;
            case 11:
                exVar.f373776p = aVar2.k(intValue);
                return 0;
            case 12:
                exVar.f373777q = aVar2.k(intValue);
                return 0;
            case 13:
                exVar.f373778r = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
