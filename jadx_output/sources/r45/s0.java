package r45;

/* loaded from: classes11.dex */
public class s0 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f385351d;

    /* renamed from: e, reason: collision with root package name */
    public int f385352e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f385353f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f385354g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f385355h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f385356i;

    /* renamed from: m, reason: collision with root package name */
    public int f385357m;

    /* renamed from: n, reason: collision with root package name */
    public int f385358n;

    /* renamed from: o, reason: collision with root package name */
    public r45.pd6 f385359o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.s0)) {
            return false;
        }
        r45.s0 s0Var = (r45.s0) fVar;
        return n51.f.a(this.BaseRequest, s0Var.BaseRequest) && n51.f.a(this.f385351d, s0Var.f385351d) && n51.f.a(java.lang.Integer.valueOf(this.f385352e), java.lang.Integer.valueOf(s0Var.f385352e)) && n51.f.a(this.f385353f, s0Var.f385353f) && n51.f.a(this.f385354g, s0Var.f385354g) && n51.f.a(this.f385355h, s0Var.f385355h) && n51.f.a(this.f385356i, s0Var.f385356i) && n51.f.a(java.lang.Integer.valueOf(this.f385357m), java.lang.Integer.valueOf(s0Var.f385357m)) && n51.f.a(java.lang.Integer.valueOf(this.f385358n), java.lang.Integer.valueOf(s0Var.f385358n)) && n51.f.a(this.f385359o, s0Var.f385359o);
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
            java.lang.String str = this.f385351d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f385352e);
            java.lang.String str2 = this.f385353f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f385354g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f385355h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f385356i;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            fVar.e(8, this.f385357m);
            fVar.e(9, this.f385358n);
            r45.pd6 pd6Var = this.f385359o;
            if (pd6Var != null) {
                fVar.i(10, pd6Var.computeSize());
                this.f385359o.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str6 = this.f385351d;
            if (str6 != null) {
                i18 += b36.f.j(2, str6);
            }
            int e17 = i18 + b36.f.e(3, this.f385352e);
            java.lang.String str7 = this.f385353f;
            if (str7 != null) {
                e17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f385354g;
            if (str8 != null) {
                e17 += b36.f.j(5, str8);
            }
            java.lang.String str9 = this.f385355h;
            if (str9 != null) {
                e17 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f385356i;
            if (str10 != null) {
                e17 += b36.f.j(7, str10);
            }
            int e18 = e17 + b36.f.e(8, this.f385357m) + b36.f.e(9, this.f385358n);
            r45.pd6 pd6Var2 = this.f385359o;
            return pd6Var2 != null ? e18 + b36.f.i(10, pd6Var2.computeSize()) : e18;
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
        r45.s0 s0Var = (r45.s0) objArr[1];
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
                    s0Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                s0Var.f385351d = aVar2.k(intValue);
                return 0;
            case 3:
                s0Var.f385352e = aVar2.g(intValue);
                return 0;
            case 4:
                s0Var.f385353f = aVar2.k(intValue);
                return 0;
            case 5:
                s0Var.f385354g = aVar2.k(intValue);
                return 0;
            case 6:
                s0Var.f385355h = aVar2.k(intValue);
                return 0;
            case 7:
                s0Var.f385356i = aVar2.k(intValue);
                return 0;
            case 8:
                s0Var.f385357m = aVar2.g(intValue);
                return 0;
            case 9:
                s0Var.f385358n = aVar2.g(intValue);
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.pd6 pd6Var3 = new r45.pd6();
                    if (bArr2 != null && bArr2.length > 0) {
                        pd6Var3.parseFrom(bArr2);
                    }
                    s0Var.f385359o = pd6Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
