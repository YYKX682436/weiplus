package r45;

/* loaded from: classes10.dex */
public class y03 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.kv0 f390671d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f390672e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f390673f;

    /* renamed from: g, reason: collision with root package name */
    public long f390674g;

    /* renamed from: h, reason: collision with root package name */
    public long f390675h;

    /* renamed from: i, reason: collision with root package name */
    public long f390676i;

    /* renamed from: m, reason: collision with root package name */
    public long f390677m;

    /* renamed from: n, reason: collision with root package name */
    public int f390678n;

    /* renamed from: o, reason: collision with root package name */
    public int f390679o;

    /* renamed from: p, reason: collision with root package name */
    public int f390680p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f390681q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f390682r;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.y03)) {
            return false;
        }
        r45.y03 y03Var = (r45.y03) fVar;
        return n51.f.a(this.BaseRequest, y03Var.BaseRequest) && n51.f.a(this.f390671d, y03Var.f390671d) && n51.f.a(this.f390672e, y03Var.f390672e) && n51.f.a(this.f390673f, y03Var.f390673f) && n51.f.a(java.lang.Long.valueOf(this.f390674g), java.lang.Long.valueOf(y03Var.f390674g)) && n51.f.a(java.lang.Long.valueOf(this.f390675h), java.lang.Long.valueOf(y03Var.f390675h)) && n51.f.a(java.lang.Long.valueOf(this.f390676i), java.lang.Long.valueOf(y03Var.f390676i)) && n51.f.a(java.lang.Long.valueOf(this.f390677m), java.lang.Long.valueOf(y03Var.f390677m)) && n51.f.a(java.lang.Integer.valueOf(this.f390678n), java.lang.Integer.valueOf(y03Var.f390678n)) && n51.f.a(java.lang.Integer.valueOf(this.f390679o), java.lang.Integer.valueOf(y03Var.f390679o)) && n51.f.a(java.lang.Integer.valueOf(this.f390680p), java.lang.Integer.valueOf(y03Var.f390680p)) && n51.f.a(this.f390681q, y03Var.f390681q) && n51.f.a(this.f390682r, y03Var.f390682r);
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
            r45.kv0 kv0Var = this.f390671d;
            if (kv0Var != null) {
                fVar.i(2, kv0Var.computeSize());
                this.f390671d.writeFields(fVar);
            }
            java.lang.String str = this.f390672e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f390673f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.h(5, this.f390674g);
            fVar.h(6, this.f390675h);
            fVar.h(7, this.f390676i);
            fVar.h(8, this.f390677m);
            fVar.e(9, this.f390678n);
            fVar.e(10, this.f390679o);
            fVar.e(11, this.f390680p);
            java.lang.String str3 = this.f390681q;
            if (str3 != null) {
                fVar.j(12, str3);
            }
            com.tencent.mm.protobuf.g gVar = this.f390682r;
            if (gVar == null) {
                return 0;
            }
            fVar.b(100, gVar);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            r45.kv0 kv0Var2 = this.f390671d;
            if (kv0Var2 != null) {
                i18 += b36.f.i(2, kv0Var2.computeSize());
            }
            java.lang.String str4 = this.f390672e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f390673f;
            if (str5 != null) {
                i18 += b36.f.j(4, str5);
            }
            int h17 = i18 + b36.f.h(5, this.f390674g) + b36.f.h(6, this.f390675h) + b36.f.h(7, this.f390676i) + b36.f.h(8, this.f390677m) + b36.f.e(9, this.f390678n) + b36.f.e(10, this.f390679o) + b36.f.e(11, this.f390680p);
            java.lang.String str6 = this.f390681q;
            if (str6 != null) {
                h17 += b36.f.j(12, str6);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f390682r;
            return gVar2 != null ? h17 + b36.f.b(100, gVar2) : h17;
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
        r45.y03 y03Var = (r45.y03) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 100) {
            y03Var.f390682r = aVar2.d(intValue);
            return 0;
        }
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
                    y03Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.kv0 kv0Var3 = new r45.kv0();
                    if (bArr2 != null && bArr2.length > 0) {
                        kv0Var3.parseFrom(bArr2);
                    }
                    y03Var.f390671d = kv0Var3;
                }
                return 0;
            case 3:
                y03Var.f390672e = aVar2.k(intValue);
                return 0;
            case 4:
                y03Var.f390673f = aVar2.k(intValue);
                return 0;
            case 5:
                y03Var.f390674g = aVar2.i(intValue);
                return 0;
            case 6:
                y03Var.f390675h = aVar2.i(intValue);
                return 0;
            case 7:
                y03Var.f390676i = aVar2.i(intValue);
                return 0;
            case 8:
                y03Var.f390677m = aVar2.i(intValue);
                return 0;
            case 9:
                y03Var.f390678n = aVar2.g(intValue);
                return 0;
            case 10:
                y03Var.f390679o = aVar2.g(intValue);
                return 0;
            case 11:
                y03Var.f390680p = aVar2.g(intValue);
                return 0;
            case 12:
                y03Var.f390681q = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
