package r45;

/* loaded from: classes4.dex */
public class c76 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.l76 f371351d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f371352e;

    /* renamed from: f, reason: collision with root package name */
    public r45.du5 f371353f;

    /* renamed from: g, reason: collision with root package name */
    public int f371354g;

    /* renamed from: h, reason: collision with root package name */
    public r45.du5 f371355h;

    /* renamed from: i, reason: collision with root package name */
    public int f371356i;

    /* renamed from: m, reason: collision with root package name */
    public int f371357m;

    /* renamed from: n, reason: collision with root package name */
    public int f371358n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f371359o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f371360p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.c76)) {
            return false;
        }
        r45.c76 c76Var = (r45.c76) fVar;
        return n51.f.a(this.BaseRequest, c76Var.BaseRequest) && n51.f.a(this.f371351d, c76Var.f371351d) && n51.f.a(this.f371352e, c76Var.f371352e) && n51.f.a(this.f371353f, c76Var.f371353f) && n51.f.a(java.lang.Integer.valueOf(this.f371354g), java.lang.Integer.valueOf(c76Var.f371354g)) && n51.f.a(this.f371355h, c76Var.f371355h) && n51.f.a(java.lang.Integer.valueOf(this.f371356i), java.lang.Integer.valueOf(c76Var.f371356i)) && n51.f.a(java.lang.Integer.valueOf(this.f371357m), java.lang.Integer.valueOf(c76Var.f371357m)) && n51.f.a(java.lang.Integer.valueOf(this.f371358n), java.lang.Integer.valueOf(c76Var.f371358n)) && n51.f.a(this.f371359o, c76Var.f371359o) && n51.f.a(this.f371360p, c76Var.f371360p);
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
            r45.l76 l76Var = this.f371351d;
            if (l76Var != null) {
                fVar.i(2, l76Var.computeSize());
                this.f371351d.writeFields(fVar);
            }
            java.lang.String str = this.f371352e;
            if (str != null) {
                fVar.j(3, str);
            }
            r45.du5 du5Var = this.f371353f;
            if (du5Var != null) {
                fVar.i(4, du5Var.computeSize());
                this.f371353f.writeFields(fVar);
            }
            fVar.e(5, this.f371354g);
            r45.du5 du5Var2 = this.f371355h;
            if (du5Var2 != null) {
                fVar.i(6, du5Var2.computeSize());
                this.f371355h.writeFields(fVar);
            }
            fVar.e(7, this.f371356i);
            fVar.e(8, this.f371357m);
            fVar.e(9, this.f371358n);
            java.lang.String str2 = this.f371359o;
            if (str2 != null) {
                fVar.j(10, str2);
            }
            java.lang.String str3 = this.f371360p;
            if (str3 != null) {
                fVar.j(11, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            r45.l76 l76Var2 = this.f371351d;
            if (l76Var2 != null) {
                i18 += b36.f.i(2, l76Var2.computeSize());
            }
            java.lang.String str4 = this.f371352e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            r45.du5 du5Var3 = this.f371353f;
            if (du5Var3 != null) {
                i18 += b36.f.i(4, du5Var3.computeSize());
            }
            int e17 = i18 + b36.f.e(5, this.f371354g);
            r45.du5 du5Var4 = this.f371355h;
            if (du5Var4 != null) {
                e17 += b36.f.i(6, du5Var4.computeSize());
            }
            int e18 = e17 + b36.f.e(7, this.f371356i) + b36.f.e(8, this.f371357m) + b36.f.e(9, this.f371358n);
            java.lang.String str5 = this.f371359o;
            if (str5 != null) {
                e18 += b36.f.j(10, str5);
            }
            java.lang.String str6 = this.f371360p;
            return str6 != null ? e18 + b36.f.j(11, str6) : e18;
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
        r45.c76 c76Var = (r45.c76) objArr[1];
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
                    c76Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.l76 l76Var3 = new r45.l76();
                    if (bArr2 != null && bArr2.length > 0) {
                        l76Var3.parseFrom(bArr2);
                    }
                    c76Var.f371351d = l76Var3;
                }
                return 0;
            case 3:
                c76Var.f371352e = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.du5 du5Var5 = new r45.du5();
                    if (bArr3 != null && bArr3.length > 0) {
                        du5Var5.b(bArr3);
                    }
                    c76Var.f371353f = du5Var5;
                }
                return 0;
            case 5:
                c76Var.f371354g = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.du5 du5Var6 = new r45.du5();
                    if (bArr4 != null && bArr4.length > 0) {
                        du5Var6.b(bArr4);
                    }
                    c76Var.f371355h = du5Var6;
                }
                return 0;
            case 7:
                c76Var.f371356i = aVar2.g(intValue);
                return 0;
            case 8:
                c76Var.f371357m = aVar2.g(intValue);
                return 0;
            case 9:
                c76Var.f371358n = aVar2.g(intValue);
                return 0;
            case 10:
                c76Var.f371359o = aVar2.k(intValue);
                return 0;
            case 11:
                c76Var.f371360p = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
