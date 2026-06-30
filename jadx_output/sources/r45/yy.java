package r45;

/* loaded from: classes9.dex */
public class yy extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f391486d;

    /* renamed from: e, reason: collision with root package name */
    public int f391487e;

    /* renamed from: f, reason: collision with root package name */
    public long f391488f;

    /* renamed from: g, reason: collision with root package name */
    public int f391489g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f391490h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f391491i;

    /* renamed from: m, reason: collision with root package name */
    public r45.cu5 f391492m;

    /* renamed from: n, reason: collision with root package name */
    public int f391493n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f391494o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yy)) {
            return false;
        }
        r45.yy yyVar = (r45.yy) fVar;
        return n51.f.a(this.BaseRequest, yyVar.BaseRequest) && n51.f.a(this.f391486d, yyVar.f391486d) && n51.f.a(java.lang.Integer.valueOf(this.f391487e), java.lang.Integer.valueOf(yyVar.f391487e)) && n51.f.a(java.lang.Long.valueOf(this.f391488f), java.lang.Long.valueOf(yyVar.f391488f)) && n51.f.a(java.lang.Integer.valueOf(this.f391489g), java.lang.Integer.valueOf(yyVar.f391489g)) && n51.f.a(this.f391490h, yyVar.f391490h) && n51.f.a(this.f391491i, yyVar.f391491i) && n51.f.a(this.f391492m, yyVar.f391492m) && n51.f.a(java.lang.Integer.valueOf(this.f391493n), java.lang.Integer.valueOf(yyVar.f391493n)) && n51.f.a(this.f391494o, yyVar.f391494o);
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
            java.lang.String str = this.f391486d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f391487e);
            fVar.h(4, this.f391488f);
            fVar.e(5, this.f391489g);
            java.lang.String str2 = this.f391490h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f391491i;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            r45.cu5 cu5Var = this.f391492m;
            if (cu5Var != null) {
                fVar.i(8, cu5Var.computeSize());
                this.f391492m.writeFields(fVar);
            }
            fVar.e(9, this.f391493n);
            java.lang.String str4 = this.f391494o;
            if (str4 != null) {
                fVar.j(10, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str5 = this.f391486d;
            if (str5 != null) {
                i18 += b36.f.j(2, str5);
            }
            int e17 = i18 + b36.f.e(3, this.f391487e) + b36.f.h(4, this.f391488f) + b36.f.e(5, this.f391489g);
            java.lang.String str6 = this.f391490h;
            if (str6 != null) {
                e17 += b36.f.j(6, str6);
            }
            java.lang.String str7 = this.f391491i;
            if (str7 != null) {
                e17 += b36.f.j(7, str7);
            }
            r45.cu5 cu5Var2 = this.f391492m;
            if (cu5Var2 != null) {
                e17 += b36.f.i(8, cu5Var2.computeSize());
            }
            int e18 = e17 + b36.f.e(9, this.f391493n);
            java.lang.String str8 = this.f391494o;
            return str8 != null ? e18 + b36.f.j(10, str8) : e18;
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
        r45.yy yyVar = (r45.yy) objArr[1];
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
                    yyVar.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                yyVar.f391486d = aVar2.k(intValue);
                return 0;
            case 3:
                yyVar.f391487e = aVar2.g(intValue);
                return 0;
            case 4:
                yyVar.f391488f = aVar2.i(intValue);
                return 0;
            case 5:
                yyVar.f391489g = aVar2.g(intValue);
                return 0;
            case 6:
                yyVar.f391490h = aVar2.k(intValue);
                return 0;
            case 7:
                yyVar.f391491i = aVar2.k(intValue);
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var3.b(bArr2);
                    }
                    yyVar.f391492m = cu5Var3;
                }
                return 0;
            case 9:
                yyVar.f391493n = aVar2.g(intValue);
                return 0;
            case 10:
                yyVar.f391494o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
