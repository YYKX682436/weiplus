package r45;

/* loaded from: classes9.dex */
public class du6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f372758d;

    /* renamed from: e, reason: collision with root package name */
    public r45.cu5 f372759e;

    /* renamed from: f, reason: collision with root package name */
    public int f372760f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f372761g;

    /* renamed from: h, reason: collision with root package name */
    public int f372762h;

    /* renamed from: i, reason: collision with root package name */
    public int f372763i;

    /* renamed from: m, reason: collision with root package name */
    public int f372764m;

    /* renamed from: n, reason: collision with root package name */
    public int f372765n;

    /* renamed from: o, reason: collision with root package name */
    public int f372766o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.du6)) {
            return false;
        }
        r45.du6 du6Var = (r45.du6) fVar;
        return n51.f.a(this.BaseRequest, du6Var.BaseRequest) && n51.f.a(this.f372758d, du6Var.f372758d) && n51.f.a(this.f372759e, du6Var.f372759e) && n51.f.a(java.lang.Integer.valueOf(this.f372760f), java.lang.Integer.valueOf(du6Var.f372760f)) && n51.f.a(this.f372761g, du6Var.f372761g) && n51.f.a(java.lang.Integer.valueOf(this.f372762h), java.lang.Integer.valueOf(du6Var.f372762h)) && n51.f.a(java.lang.Integer.valueOf(this.f372763i), java.lang.Integer.valueOf(du6Var.f372763i)) && n51.f.a(java.lang.Integer.valueOf(this.f372764m), java.lang.Integer.valueOf(du6Var.f372764m)) && n51.f.a(java.lang.Integer.valueOf(this.f372765n), java.lang.Integer.valueOf(du6Var.f372765n)) && n51.f.a(java.lang.Integer.valueOf(this.f372766o), java.lang.Integer.valueOf(du6Var.f372766o));
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
            java.lang.String str = this.f372758d;
            if (str != null) {
                fVar.j(2, str);
            }
            r45.cu5 cu5Var = this.f372759e;
            if (cu5Var != null) {
                fVar.i(3, cu5Var.computeSize());
                this.f372759e.writeFields(fVar);
            }
            fVar.e(4, this.f372760f);
            java.lang.String str2 = this.f372761g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.e(6, this.f372762h);
            fVar.e(7, this.f372763i);
            fVar.e(8, this.f372764m);
            fVar.e(9, this.f372765n);
            fVar.e(10, this.f372766o);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str3 = this.f372758d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            r45.cu5 cu5Var2 = this.f372759e;
            if (cu5Var2 != null) {
                i18 += b36.f.i(3, cu5Var2.computeSize());
            }
            int e17 = i18 + b36.f.e(4, this.f372760f);
            java.lang.String str4 = this.f372761g;
            if (str4 != null) {
                e17 += b36.f.j(5, str4);
            }
            return e17 + b36.f.e(6, this.f372762h) + b36.f.e(7, this.f372763i) + b36.f.e(8, this.f372764m) + b36.f.e(9, this.f372765n) + b36.f.e(10, this.f372766o);
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
        r45.du6 du6Var = (r45.du6) objArr[1];
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
                    du6Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                du6Var.f372758d = aVar2.k(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var3.b(bArr2);
                    }
                    du6Var.f372759e = cu5Var3;
                }
                return 0;
            case 4:
                du6Var.f372760f = aVar2.g(intValue);
                return 0;
            case 5:
                du6Var.f372761g = aVar2.k(intValue);
                return 0;
            case 6:
                du6Var.f372762h = aVar2.g(intValue);
                return 0;
            case 7:
                du6Var.f372763i = aVar2.g(intValue);
                return 0;
            case 8:
                du6Var.f372764m = aVar2.g(intValue);
                return 0;
            case 9:
                du6Var.f372765n = aVar2.g(intValue);
                return 0;
            case 10:
                du6Var.f372766o = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
