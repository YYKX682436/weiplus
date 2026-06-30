package r45;

/* loaded from: classes8.dex */
public class n35 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f381054d;

    /* renamed from: e, reason: collision with root package name */
    public int f381055e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f381056f;

    /* renamed from: g, reason: collision with root package name */
    public int f381057g;

    /* renamed from: h, reason: collision with root package name */
    public r45.cu5 f381058h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f381059i;

    /* renamed from: m, reason: collision with root package name */
    public r45.cu5 f381060m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f381061n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.n35)) {
            return false;
        }
        r45.n35 n35Var = (r45.n35) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f381054d), java.lang.Integer.valueOf(n35Var.f381054d)) && n51.f.a(java.lang.Integer.valueOf(this.f381055e), java.lang.Integer.valueOf(n35Var.f381055e)) && n51.f.a(this.f381056f, n35Var.f381056f) && n51.f.a(java.lang.Integer.valueOf(this.f381057g), java.lang.Integer.valueOf(n35Var.f381057g)) && n51.f.a(this.f381058h, n35Var.f381058h) && n51.f.a(this.f381059i, n35Var.f381059i) && n51.f.a(this.f381060m, n35Var.f381060m) && n51.f.a(this.f381061n, n35Var.f381061n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f381054d);
            fVar.e(2, this.f381055e);
            java.lang.String str = this.f381056f;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f381057g);
            r45.cu5 cu5Var = this.f381058h;
            if (cu5Var != null) {
                fVar.i(5, cu5Var.computeSize());
                this.f381058h.writeFields(fVar);
            }
            java.lang.String str2 = this.f381059i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            r45.cu5 cu5Var2 = this.f381060m;
            if (cu5Var2 != null) {
                fVar.i(7, cu5Var2.computeSize());
                this.f381060m.writeFields(fVar);
            }
            java.lang.String str3 = this.f381061n;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f381054d) + 0 + b36.f.e(2, this.f381055e);
            java.lang.String str4 = this.f381056f;
            if (str4 != null) {
                e17 += b36.f.j(3, str4);
            }
            int e18 = e17 + b36.f.e(4, this.f381057g);
            r45.cu5 cu5Var3 = this.f381058h;
            if (cu5Var3 != null) {
                e18 += b36.f.i(5, cu5Var3.computeSize());
            }
            java.lang.String str5 = this.f381059i;
            if (str5 != null) {
                e18 += b36.f.j(6, str5);
            }
            r45.cu5 cu5Var4 = this.f381060m;
            if (cu5Var4 != null) {
                e18 += b36.f.i(7, cu5Var4.computeSize());
            }
            java.lang.String str6 = this.f381061n;
            return str6 != null ? e18 + b36.f.j(8, str6) : e18;
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
        r45.n35 n35Var = (r45.n35) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                n35Var.f381054d = aVar2.g(intValue);
                return 0;
            case 2:
                n35Var.f381055e = aVar2.g(intValue);
                return 0;
            case 3:
                n35Var.f381056f = aVar2.k(intValue);
                return 0;
            case 4:
                n35Var.f381057g = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.cu5 cu5Var5 = new r45.cu5();
                    if (bArr != null && bArr.length > 0) {
                        cu5Var5.b(bArr);
                    }
                    n35Var.f381058h = cu5Var5;
                }
                return 0;
            case 6:
                n35Var.f381059i = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.cu5 cu5Var6 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var6.b(bArr2);
                    }
                    n35Var.f381060m = cu5Var6;
                }
                return 0;
            case 8:
                n35Var.f381061n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
