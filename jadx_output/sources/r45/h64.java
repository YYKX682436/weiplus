package r45;

/* loaded from: classes9.dex */
public class h64 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f375871d;

    /* renamed from: e, reason: collision with root package name */
    public float f375872e;

    /* renamed from: f, reason: collision with root package name */
    public float f375873f;

    /* renamed from: g, reason: collision with root package name */
    public int f375874g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f375875h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f375876i;

    /* renamed from: m, reason: collision with root package name */
    public int f375877m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f375878n;

    /* renamed from: o, reason: collision with root package name */
    public int f375879o;

    /* renamed from: p, reason: collision with root package name */
    public int f375880p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.h64)) {
            return false;
        }
        r45.h64 h64Var = (r45.h64) fVar;
        return n51.f.a(this.BaseRequest, h64Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f375871d), java.lang.Integer.valueOf(h64Var.f375871d)) && n51.f.a(java.lang.Float.valueOf(this.f375872e), java.lang.Float.valueOf(h64Var.f375872e)) && n51.f.a(java.lang.Float.valueOf(this.f375873f), java.lang.Float.valueOf(h64Var.f375873f)) && n51.f.a(java.lang.Integer.valueOf(this.f375874g), java.lang.Integer.valueOf(h64Var.f375874g)) && n51.f.a(this.f375875h, h64Var.f375875h) && n51.f.a(this.f375876i, h64Var.f375876i) && n51.f.a(java.lang.Integer.valueOf(this.f375877m), java.lang.Integer.valueOf(h64Var.f375877m)) && n51.f.a(this.f375878n, h64Var.f375878n) && n51.f.a(java.lang.Integer.valueOf(this.f375879o), java.lang.Integer.valueOf(h64Var.f375879o)) && n51.f.a(java.lang.Integer.valueOf(this.f375880p), java.lang.Integer.valueOf(h64Var.f375880p));
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
            fVar.e(2, this.f375871d);
            fVar.d(3, this.f375872e);
            fVar.d(4, this.f375873f);
            fVar.e(5, this.f375874g);
            java.lang.String str = this.f375875h;
            if (str != null) {
                fVar.j(6, str);
            }
            java.lang.String str2 = this.f375876i;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            fVar.e(8, this.f375877m);
            java.lang.String str3 = this.f375878n;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            fVar.e(10, this.f375879o);
            fVar.e(11, this.f375880p);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f375871d) + b36.f.d(3, this.f375872e) + b36.f.d(4, this.f375873f) + b36.f.e(5, this.f375874g);
            java.lang.String str4 = this.f375875h;
            if (str4 != null) {
                i18 += b36.f.j(6, str4);
            }
            java.lang.String str5 = this.f375876i;
            if (str5 != null) {
                i18 += b36.f.j(7, str5);
            }
            int e17 = i18 + b36.f.e(8, this.f375877m);
            java.lang.String str6 = this.f375878n;
            if (str6 != null) {
                e17 += b36.f.j(9, str6);
            }
            return e17 + b36.f.e(10, this.f375879o) + b36.f.e(11, this.f375880p);
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
        r45.h64 h64Var = (r45.h64) objArr[1];
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
                    h64Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                h64Var.f375871d = aVar2.g(intValue);
                return 0;
            case 3:
                h64Var.f375872e = aVar2.f(intValue);
                return 0;
            case 4:
                h64Var.f375873f = aVar2.f(intValue);
                return 0;
            case 5:
                h64Var.f375874g = aVar2.g(intValue);
                return 0;
            case 6:
                h64Var.f375875h = aVar2.k(intValue);
                return 0;
            case 7:
                h64Var.f375876i = aVar2.k(intValue);
                return 0;
            case 8:
                h64Var.f375877m = aVar2.g(intValue);
                return 0;
            case 9:
                h64Var.f375878n = aVar2.k(intValue);
                return 0;
            case 10:
                h64Var.f375879o = aVar2.g(intValue);
                return 0;
            case 11:
                h64Var.f375880p = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
