package r45;

/* loaded from: classes10.dex */
public class m10 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f380058d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f380059e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f380060f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f380061g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f380062h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f380063i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f380064m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f380065n;

    /* renamed from: o, reason: collision with root package name */
    public int f380066o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f380067p;

    /* renamed from: q, reason: collision with root package name */
    public int f380068q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f380069r;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.m10)) {
            return false;
        }
        r45.m10 m10Var = (r45.m10) fVar;
        return n51.f.a(this.BaseRequest, m10Var.BaseRequest) && n51.f.a(this.f380058d, m10Var.f380058d) && n51.f.a(this.f380059e, m10Var.f380059e) && n51.f.a(this.f380060f, m10Var.f380060f) && n51.f.a(this.f380061g, m10Var.f380061g) && n51.f.a(this.f380062h, m10Var.f380062h) && n51.f.a(this.f380063i, m10Var.f380063i) && n51.f.a(this.f380064m, m10Var.f380064m) && n51.f.a(this.f380065n, m10Var.f380065n) && n51.f.a(java.lang.Integer.valueOf(this.f380066o), java.lang.Integer.valueOf(m10Var.f380066o)) && n51.f.a(this.f380067p, m10Var.f380067p) && n51.f.a(java.lang.Integer.valueOf(this.f380068q), java.lang.Integer.valueOf(m10Var.f380068q)) && n51.f.a(this.f380069r, m10Var.f380069r);
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
            java.lang.String str = this.f380058d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f380059e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f380060f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f380061g;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f380062h;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f380063i;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f380064m;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            java.lang.String str8 = this.f380065n;
            if (str8 != null) {
                fVar.j(9, str8);
            }
            fVar.e(10, this.f380066o);
            java.lang.String str9 = this.f380067p;
            if (str9 != null) {
                fVar.j(11, str9);
            }
            fVar.e(12, this.f380068q);
            java.lang.String str10 = this.f380069r;
            if (str10 == null) {
                return 0;
            }
            fVar.j(13, str10);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str11 = this.f380058d;
            if (str11 != null) {
                i18 += b36.f.j(2, str11);
            }
            java.lang.String str12 = this.f380059e;
            if (str12 != null) {
                i18 += b36.f.j(3, str12);
            }
            java.lang.String str13 = this.f380060f;
            if (str13 != null) {
                i18 += b36.f.j(4, str13);
            }
            java.lang.String str14 = this.f380061g;
            if (str14 != null) {
                i18 += b36.f.j(5, str14);
            }
            java.lang.String str15 = this.f380062h;
            if (str15 != null) {
                i18 += b36.f.j(6, str15);
            }
            java.lang.String str16 = this.f380063i;
            if (str16 != null) {
                i18 += b36.f.j(7, str16);
            }
            java.lang.String str17 = this.f380064m;
            if (str17 != null) {
                i18 += b36.f.j(8, str17);
            }
            java.lang.String str18 = this.f380065n;
            if (str18 != null) {
                i18 += b36.f.j(9, str18);
            }
            int e17 = i18 + b36.f.e(10, this.f380066o);
            java.lang.String str19 = this.f380067p;
            if (str19 != null) {
                e17 += b36.f.j(11, str19);
            }
            int e18 = e17 + b36.f.e(12, this.f380068q);
            java.lang.String str20 = this.f380069r;
            return str20 != null ? e18 + b36.f.j(13, str20) : e18;
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
        r45.m10 m10Var = (r45.m10) objArr[1];
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
                    m10Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                m10Var.f380058d = aVar2.k(intValue);
                return 0;
            case 3:
                m10Var.f380059e = aVar2.k(intValue);
                return 0;
            case 4:
                m10Var.f380060f = aVar2.k(intValue);
                return 0;
            case 5:
                m10Var.f380061g = aVar2.k(intValue);
                return 0;
            case 6:
                m10Var.f380062h = aVar2.k(intValue);
                return 0;
            case 7:
                m10Var.f380063i = aVar2.k(intValue);
                return 0;
            case 8:
                m10Var.f380064m = aVar2.k(intValue);
                return 0;
            case 9:
                m10Var.f380065n = aVar2.k(intValue);
                return 0;
            case 10:
                m10Var.f380066o = aVar2.g(intValue);
                return 0;
            case 11:
                m10Var.f380067p = aVar2.k(intValue);
                return 0;
            case 12:
                m10Var.f380068q = aVar2.g(intValue);
                return 0;
            case 13:
                m10Var.f380069r = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
