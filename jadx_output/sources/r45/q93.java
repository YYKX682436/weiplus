package r45;

/* loaded from: classes9.dex */
public class q93 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f383769d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f383770e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f383771f;

    /* renamed from: g, reason: collision with root package name */
    public int f383772g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f383773h;

    /* renamed from: i, reason: collision with root package name */
    public int f383774i;

    /* renamed from: m, reason: collision with root package name */
    public int f383775m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f383776n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f383777o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f383778p;

    /* renamed from: q, reason: collision with root package name */
    public int f383779q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f383780r;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.q93)) {
            return false;
        }
        r45.q93 q93Var = (r45.q93) fVar;
        return n51.f.a(this.BaseRequest, q93Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f383769d), java.lang.Integer.valueOf(q93Var.f383769d)) && n51.f.a(this.f383770e, q93Var.f383770e) && n51.f.a(this.f383771f, q93Var.f383771f) && n51.f.a(java.lang.Integer.valueOf(this.f383772g), java.lang.Integer.valueOf(q93Var.f383772g)) && n51.f.a(this.f383773h, q93Var.f383773h) && n51.f.a(java.lang.Integer.valueOf(this.f383774i), java.lang.Integer.valueOf(q93Var.f383774i)) && n51.f.a(java.lang.Integer.valueOf(this.f383775m), java.lang.Integer.valueOf(q93Var.f383775m)) && n51.f.a(this.f383776n, q93Var.f383776n) && n51.f.a(this.f383777o, q93Var.f383777o) && n51.f.a(this.f383778p, q93Var.f383778p) && n51.f.a(java.lang.Integer.valueOf(this.f383779q), java.lang.Integer.valueOf(q93Var.f383779q)) && n51.f.a(this.f383780r, q93Var.f383780r);
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
            fVar.e(2, this.f383769d);
            java.lang.String str = this.f383770e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f383771f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.f383772g);
            java.lang.String str3 = this.f383773h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            fVar.e(7, this.f383774i);
            fVar.e(8, this.f383775m);
            java.lang.String str4 = this.f383776n;
            if (str4 != null) {
                fVar.j(9, str4);
            }
            java.lang.String str5 = this.f383777o;
            if (str5 != null) {
                fVar.j(10, str5);
            }
            java.lang.String str6 = this.f383778p;
            if (str6 != null) {
                fVar.j(11, str6);
            }
            fVar.e(12, this.f383779q);
            java.lang.String str7 = this.f383780r;
            if (str7 == null) {
                return 0;
            }
            fVar.j(13, str7);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f383769d);
            java.lang.String str8 = this.f383770e;
            if (str8 != null) {
                i18 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f383771f;
            if (str9 != null) {
                i18 += b36.f.j(4, str9);
            }
            int e17 = i18 + b36.f.e(5, this.f383772g);
            java.lang.String str10 = this.f383773h;
            if (str10 != null) {
                e17 += b36.f.j(6, str10);
            }
            int e18 = e17 + b36.f.e(7, this.f383774i) + b36.f.e(8, this.f383775m);
            java.lang.String str11 = this.f383776n;
            if (str11 != null) {
                e18 += b36.f.j(9, str11);
            }
            java.lang.String str12 = this.f383777o;
            if (str12 != null) {
                e18 += b36.f.j(10, str12);
            }
            java.lang.String str13 = this.f383778p;
            if (str13 != null) {
                e18 += b36.f.j(11, str13);
            }
            int e19 = e18 + b36.f.e(12, this.f383779q);
            java.lang.String str14 = this.f383780r;
            return str14 != null ? e19 + b36.f.j(13, str14) : e19;
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
        r45.q93 q93Var = (r45.q93) objArr[1];
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
                    q93Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                q93Var.f383769d = aVar2.g(intValue);
                return 0;
            case 3:
                q93Var.f383770e = aVar2.k(intValue);
                return 0;
            case 4:
                q93Var.f383771f = aVar2.k(intValue);
                return 0;
            case 5:
                q93Var.f383772g = aVar2.g(intValue);
                return 0;
            case 6:
                q93Var.f383773h = aVar2.k(intValue);
                return 0;
            case 7:
                q93Var.f383774i = aVar2.g(intValue);
                return 0;
            case 8:
                q93Var.f383775m = aVar2.g(intValue);
                return 0;
            case 9:
                q93Var.f383776n = aVar2.k(intValue);
                return 0;
            case 10:
                q93Var.f383777o = aVar2.k(intValue);
                return 0;
            case 11:
                q93Var.f383778p = aVar2.k(intValue);
                return 0;
            case 12:
                q93Var.f383779q = aVar2.g(intValue);
                return 0;
            case 13:
                q93Var.f383780r = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
