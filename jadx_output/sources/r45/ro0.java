package r45;

/* loaded from: classes9.dex */
public class ro0 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f385039d;

    /* renamed from: e, reason: collision with root package name */
    public long f385040e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f385041f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f385042g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f385043h;

    /* renamed from: i, reason: collision with root package name */
    public int f385044i;

    /* renamed from: m, reason: collision with root package name */
    public int f385045m;

    /* renamed from: n, reason: collision with root package name */
    public int f385046n;

    /* renamed from: o, reason: collision with root package name */
    public float f385047o;

    /* renamed from: p, reason: collision with root package name */
    public int f385048p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f385049q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f385050r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f385051s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f385052t;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ro0)) {
            return false;
        }
        r45.ro0 ro0Var = (r45.ro0) fVar;
        return n51.f.a(this.BaseRequest, ro0Var.BaseRequest) && n51.f.a(this.f385039d, ro0Var.f385039d) && n51.f.a(java.lang.Long.valueOf(this.f385040e), java.lang.Long.valueOf(ro0Var.f385040e)) && n51.f.a(this.f385041f, ro0Var.f385041f) && n51.f.a(this.f385042g, ro0Var.f385042g) && n51.f.a(this.f385043h, ro0Var.f385043h) && n51.f.a(java.lang.Integer.valueOf(this.f385044i), java.lang.Integer.valueOf(ro0Var.f385044i)) && n51.f.a(java.lang.Integer.valueOf(this.f385045m), java.lang.Integer.valueOf(ro0Var.f385045m)) && n51.f.a(java.lang.Integer.valueOf(this.f385046n), java.lang.Integer.valueOf(ro0Var.f385046n)) && n51.f.a(java.lang.Float.valueOf(this.f385047o), java.lang.Float.valueOf(ro0Var.f385047o)) && n51.f.a(java.lang.Integer.valueOf(this.f385048p), java.lang.Integer.valueOf(ro0Var.f385048p)) && n51.f.a(this.f385049q, ro0Var.f385049q) && n51.f.a(this.f385050r, ro0Var.f385050r) && n51.f.a(this.f385051s, ro0Var.f385051s) && n51.f.a(this.f385052t, ro0Var.f385052t);
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
            java.lang.String str = this.f385039d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.h(3, this.f385040e);
            java.lang.String str2 = this.f385041f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f385042g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f385043h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.e(7, this.f385044i);
            fVar.e(8, this.f385045m);
            fVar.e(9, this.f385046n);
            fVar.d(10, this.f385047o);
            fVar.e(11, this.f385048p);
            com.tencent.mm.protobuf.g gVar = this.f385049q;
            if (gVar != null) {
                fVar.b(12, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f385050r;
            if (gVar2 != null) {
                fVar.b(13, gVar2);
            }
            java.lang.String str5 = this.f385051s;
            if (str5 != null) {
                fVar.j(14, str5);
            }
            java.lang.String str6 = this.f385052t;
            if (str6 != null) {
                fVar.j(15, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? b36.f.i(1, heVar2.computeSize()) + 0 : 0;
            java.lang.String str7 = this.f385039d;
            if (str7 != null) {
                i18 += b36.f.j(2, str7);
            }
            int h17 = i18 + b36.f.h(3, this.f385040e);
            java.lang.String str8 = this.f385041f;
            if (str8 != null) {
                h17 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f385042g;
            if (str9 != null) {
                h17 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f385043h;
            if (str10 != null) {
                h17 += b36.f.j(6, str10);
            }
            int e17 = h17 + b36.f.e(7, this.f385044i) + b36.f.e(8, this.f385045m) + b36.f.e(9, this.f385046n) + b36.f.d(10, this.f385047o) + b36.f.e(11, this.f385048p);
            com.tencent.mm.protobuf.g gVar3 = this.f385049q;
            if (gVar3 != null) {
                e17 += b36.f.b(12, gVar3);
            }
            com.tencent.mm.protobuf.g gVar4 = this.f385050r;
            if (gVar4 != null) {
                e17 += b36.f.b(13, gVar4);
            }
            java.lang.String str11 = this.f385051s;
            if (str11 != null) {
                e17 += b36.f.j(14, str11);
            }
            java.lang.String str12 = this.f385052t;
            return str12 != null ? e17 + b36.f.j(15, str12) : e17;
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
        r45.ro0 ro0Var = (r45.ro0) objArr[1];
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
                    ro0Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                ro0Var.f385039d = aVar2.k(intValue);
                return 0;
            case 3:
                ro0Var.f385040e = aVar2.i(intValue);
                return 0;
            case 4:
                ro0Var.f385041f = aVar2.k(intValue);
                return 0;
            case 5:
                ro0Var.f385042g = aVar2.k(intValue);
                return 0;
            case 6:
                ro0Var.f385043h = aVar2.k(intValue);
                return 0;
            case 7:
                ro0Var.f385044i = aVar2.g(intValue);
                return 0;
            case 8:
                ro0Var.f385045m = aVar2.g(intValue);
                return 0;
            case 9:
                ro0Var.f385046n = aVar2.g(intValue);
                return 0;
            case 10:
                ro0Var.f385047o = aVar2.f(intValue);
                return 0;
            case 11:
                ro0Var.f385048p = aVar2.g(intValue);
                return 0;
            case 12:
                ro0Var.f385049q = aVar2.d(intValue);
                return 0;
            case 13:
                ro0Var.f385050r = aVar2.d(intValue);
                return 0;
            case 14:
                ro0Var.f385051s = aVar2.k(intValue);
                return 0;
            case 15:
                ro0Var.f385052t = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
