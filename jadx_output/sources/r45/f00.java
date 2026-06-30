package r45;

/* loaded from: classes9.dex */
public class f00 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f373869d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f373870e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f373871f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f373872g;

    /* renamed from: h, reason: collision with root package name */
    public int f373873h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.LinkedList f373874i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f373875m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f373876n;

    /* renamed from: o, reason: collision with root package name */
    public int f373877o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.f00)) {
            return false;
        }
        r45.f00 f00Var = (r45.f00) fVar;
        return n51.f.a(this.BaseRequest, f00Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f373869d), java.lang.Integer.valueOf(f00Var.f373869d)) && n51.f.a(this.f373870e, f00Var.f373870e) && n51.f.a(this.f373871f, f00Var.f373871f) && n51.f.a(this.f373872g, f00Var.f373872g) && n51.f.a(java.lang.Integer.valueOf(this.f373873h), java.lang.Integer.valueOf(f00Var.f373873h)) && n51.f.a(this.f373874i, f00Var.f373874i) && n51.f.a(this.f373875m, f00Var.f373875m) && n51.f.a(this.f373876n, f00Var.f373876n) && n51.f.a(java.lang.Integer.valueOf(this.f373877o), java.lang.Integer.valueOf(f00Var.f373877o));
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
            fVar.e(2, this.f373869d);
            java.lang.String str = this.f373870e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f373871f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f373872g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f373873h);
            fVar.g(7, 8, this.f373874i);
            java.lang.String str4 = this.f373875m;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f373876n;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            fVar.e(10, this.f373877o);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f373869d);
            java.lang.String str6 = this.f373870e;
            if (str6 != null) {
                i18 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f373871f;
            if (str7 != null) {
                i18 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f373872g;
            if (str8 != null) {
                i18 += b36.f.j(5, str8);
            }
            int e17 = i18 + b36.f.e(6, this.f373873h) + b36.f.g(7, 8, this.f373874i);
            java.lang.String str9 = this.f373875m;
            if (str9 != null) {
                e17 += b36.f.j(8, str9);
            }
            java.lang.String str10 = this.f373876n;
            if (str10 != null) {
                e17 += b36.f.j(9, str10);
            }
            return e17 + b36.f.e(10, this.f373877o);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f373874i.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.f00 f00Var = (r45.f00) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.parseFrom(bArr2);
                    }
                    f00Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                f00Var.f373869d = aVar2.g(intValue);
                return 0;
            case 3:
                f00Var.f373870e = aVar2.k(intValue);
                return 0;
            case 4:
                f00Var.f373871f = aVar2.k(intValue);
                return 0;
            case 5:
                f00Var.f373872g = aVar2.k(intValue);
                return 0;
            case 6:
                f00Var.f373873h = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.du5 du5Var = new r45.du5();
                    if (bArr3 != null && bArr3.length > 0) {
                        du5Var.b(bArr3);
                    }
                    f00Var.f373874i.add(du5Var);
                }
                return 0;
            case 8:
                f00Var.f373875m = aVar2.k(intValue);
                return 0;
            case 9:
                f00Var.f373876n = aVar2.k(intValue);
                return 0;
            case 10:
                f00Var.f373877o = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
