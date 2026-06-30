package r45;

/* loaded from: classes9.dex */
public class fl6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f374427d;

    /* renamed from: e, reason: collision with root package name */
    public int f374428e;

    /* renamed from: f, reason: collision with root package name */
    public r45.cu5 f374429f;

    /* renamed from: g, reason: collision with root package name */
    public r45.cu5 f374430g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f374431h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f374432i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fl6)) {
            return false;
        }
        r45.fl6 fl6Var = (r45.fl6) fVar;
        return n51.f.a(this.BaseRequest, fl6Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f374427d), java.lang.Integer.valueOf(fl6Var.f374427d)) && n51.f.a(java.lang.Integer.valueOf(this.f374428e), java.lang.Integer.valueOf(fl6Var.f374428e)) && n51.f.a(this.f374429f, fl6Var.f374429f) && n51.f.a(this.f374430g, fl6Var.f374430g) && n51.f.a(this.f374431h, fl6Var.f374431h) && n51.f.a(this.f374432i, fl6Var.f374432i);
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
            fVar.e(2, this.f374427d);
            fVar.e(3, this.f374428e);
            r45.cu5 cu5Var = this.f374429f;
            if (cu5Var != null) {
                fVar.i(4, cu5Var.computeSize());
                this.f374429f.writeFields(fVar);
            }
            r45.cu5 cu5Var2 = this.f374430g;
            if (cu5Var2 != null) {
                fVar.i(5, cu5Var2.computeSize());
                this.f374430g.writeFields(fVar);
            }
            java.lang.String str = this.f374431h;
            if (str != null) {
                fVar.j(6, str);
            }
            java.lang.String str2 = this.f374432i;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f374427d) + b36.f.e(3, this.f374428e);
            r45.cu5 cu5Var3 = this.f374429f;
            if (cu5Var3 != null) {
                i18 += b36.f.i(4, cu5Var3.computeSize());
            }
            r45.cu5 cu5Var4 = this.f374430g;
            if (cu5Var4 != null) {
                i18 += b36.f.i(5, cu5Var4.computeSize());
            }
            java.lang.String str3 = this.f374431h;
            if (str3 != null) {
                i18 += b36.f.j(6, str3);
            }
            java.lang.String str4 = this.f374432i;
            return str4 != null ? i18 + b36.f.j(7, str4) : i18;
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
        r45.fl6 fl6Var = (r45.fl6) objArr[1];
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
                    fl6Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                fl6Var.f374427d = aVar2.g(intValue);
                return 0;
            case 3:
                fl6Var.f374428e = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var5 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var5.b(bArr2);
                    }
                    fl6Var.f374429f = cu5Var5;
                }
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.cu5 cu5Var6 = new r45.cu5();
                    if (bArr3 != null && bArr3.length > 0) {
                        cu5Var6.b(bArr3);
                    }
                    fl6Var.f374430g = cu5Var6;
                }
                return 0;
            case 6:
                fl6Var.f374431h = aVar2.k(intValue);
                return 0;
            case 7:
                fl6Var.f374432i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
