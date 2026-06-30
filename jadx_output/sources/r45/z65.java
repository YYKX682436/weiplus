package r45;

/* loaded from: classes8.dex */
public class z65 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f391746d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f391747e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f391748f;

    /* renamed from: g, reason: collision with root package name */
    public int f391749g;

    /* renamed from: h, reason: collision with root package name */
    public int f391750h;

    /* renamed from: i, reason: collision with root package name */
    public int f391751i;

    /* renamed from: m, reason: collision with root package name */
    public r45.r1 f391752m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.z65)) {
            return false;
        }
        r45.z65 z65Var = (r45.z65) fVar;
        return n51.f.a(this.BaseRequest, z65Var.BaseRequest) && n51.f.a(this.f391746d, z65Var.f391746d) && n51.f.a(this.f391747e, z65Var.f391747e) && n51.f.a(this.f391748f, z65Var.f391748f) && n51.f.a(java.lang.Integer.valueOf(this.f391749g), java.lang.Integer.valueOf(z65Var.f391749g)) && n51.f.a(java.lang.Integer.valueOf(this.f391750h), java.lang.Integer.valueOf(z65Var.f391750h)) && n51.f.a(java.lang.Integer.valueOf(this.f391751i), java.lang.Integer.valueOf(z65Var.f391751i)) && n51.f.a(this.f391752m, z65Var.f391752m);
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
            java.lang.String str = this.f391746d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f391747e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            com.tencent.mm.protobuf.g gVar = this.f391748f;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            fVar.e(5, this.f391749g);
            fVar.e(6, this.f391750h);
            fVar.e(7, this.f391751i);
            r45.r1 r1Var = this.f391752m;
            if (r1Var != null) {
                fVar.i(8, r1Var.computeSize());
                this.f391752m.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str3 = this.f391746d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f391747e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f391748f;
            if (gVar2 != null) {
                i18 += b36.f.b(4, gVar2);
            }
            int e17 = i18 + b36.f.e(5, this.f391749g) + b36.f.e(6, this.f391750h) + b36.f.e(7, this.f391751i);
            r45.r1 r1Var2 = this.f391752m;
            return r1Var2 != null ? e17 + b36.f.i(8, r1Var2.computeSize()) : e17;
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
        r45.z65 z65Var = (r45.z65) objArr[1];
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
                    z65Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                z65Var.f391746d = aVar2.k(intValue);
                return 0;
            case 3:
                z65Var.f391747e = aVar2.k(intValue);
                return 0;
            case 4:
                z65Var.f391748f = aVar2.d(intValue);
                return 0;
            case 5:
                z65Var.f391749g = aVar2.g(intValue);
                return 0;
            case 6:
                z65Var.f391750h = aVar2.g(intValue);
                return 0;
            case 7:
                z65Var.f391751i = aVar2.g(intValue);
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.r1 r1Var3 = new r45.r1();
                    if (bArr2 != null && bArr2.length > 0) {
                        r1Var3.parseFrom(bArr2);
                    }
                    z65Var.f391752m = r1Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
