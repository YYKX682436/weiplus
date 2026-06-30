package r45;

/* loaded from: classes8.dex */
public class va3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f388025d;

    /* renamed from: e, reason: collision with root package name */
    public int f388026e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f388027f;

    /* renamed from: g, reason: collision with root package name */
    public r45.cu5 f388028g;

    /* renamed from: h, reason: collision with root package name */
    public int f388029h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f388030i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f388031m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f388032n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f388033o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.va3)) {
            return false;
        }
        r45.va3 va3Var = (r45.va3) fVar;
        return n51.f.a(this.BaseRequest, va3Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f388025d), java.lang.Integer.valueOf(va3Var.f388025d)) && n51.f.a(java.lang.Integer.valueOf(this.f388026e), java.lang.Integer.valueOf(va3Var.f388026e)) && n51.f.a(this.f388027f, va3Var.f388027f) && n51.f.a(this.f388028g, va3Var.f388028g) && n51.f.a(java.lang.Integer.valueOf(this.f388029h), java.lang.Integer.valueOf(va3Var.f388029h)) && n51.f.a(this.f388030i, va3Var.f388030i) && n51.f.a(this.f388031m, va3Var.f388031m) && n51.f.a(this.f388032n, va3Var.f388032n) && n51.f.a(this.f388033o, va3Var.f388033o);
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
            fVar.e(2, this.f388025d);
            fVar.e(3, this.f388026e);
            java.lang.String str = this.f388027f;
            if (str != null) {
                fVar.j(4, str);
            }
            r45.cu5 cu5Var = this.f388028g;
            if (cu5Var != null) {
                fVar.i(5, cu5Var.computeSize());
                this.f388028g.writeFields(fVar);
            }
            fVar.e(6, this.f388029h);
            java.lang.String str2 = this.f388030i;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            java.lang.String str3 = this.f388031m;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            com.tencent.mm.protobuf.g gVar = this.f388032n;
            if (gVar != null) {
                fVar.b(9, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f388033o;
            if (gVar2 != null) {
                fVar.b(10, gVar2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f388025d) + b36.f.e(3, this.f388026e);
            java.lang.String str4 = this.f388027f;
            if (str4 != null) {
                i18 += b36.f.j(4, str4);
            }
            r45.cu5 cu5Var2 = this.f388028g;
            if (cu5Var2 != null) {
                i18 += b36.f.i(5, cu5Var2.computeSize());
            }
            int e17 = i18 + b36.f.e(6, this.f388029h);
            java.lang.String str5 = this.f388030i;
            if (str5 != null) {
                e17 += b36.f.j(7, str5);
            }
            java.lang.String str6 = this.f388031m;
            if (str6 != null) {
                e17 += b36.f.j(8, str6);
            }
            com.tencent.mm.protobuf.g gVar3 = this.f388032n;
            if (gVar3 != null) {
                e17 += b36.f.b(9, gVar3);
            }
            com.tencent.mm.protobuf.g gVar4 = this.f388033o;
            return gVar4 != null ? e17 + b36.f.b(10, gVar4) : e17;
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
        r45.va3 va3Var = (r45.va3) objArr[1];
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
                    va3Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                va3Var.f388025d = aVar2.g(intValue);
                return 0;
            case 3:
                va3Var.f388026e = aVar2.g(intValue);
                return 0;
            case 4:
                va3Var.f388027f = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var3.b(bArr2);
                    }
                    va3Var.f388028g = cu5Var3;
                }
                return 0;
            case 6:
                va3Var.f388029h = aVar2.g(intValue);
                return 0;
            case 7:
                va3Var.f388030i = aVar2.k(intValue);
                return 0;
            case 8:
                va3Var.f388031m = aVar2.k(intValue);
                return 0;
            case 9:
                va3Var.f388032n = aVar2.d(intValue);
                return 0;
            case 10:
                va3Var.f388033o = aVar2.d(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
