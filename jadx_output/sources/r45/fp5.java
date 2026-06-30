package r45;

/* loaded from: classes10.dex */
public class fp5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f374528d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f374529e;

    /* renamed from: f, reason: collision with root package name */
    public int f374530f;

    /* renamed from: g, reason: collision with root package name */
    public int f374531g;

    /* renamed from: h, reason: collision with root package name */
    public int f374532h;

    /* renamed from: i, reason: collision with root package name */
    public int f374533i;

    /* renamed from: m, reason: collision with root package name */
    public int f374534m;

    /* renamed from: n, reason: collision with root package name */
    public int f374535n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f374536o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fp5)) {
            return false;
        }
        r45.fp5 fp5Var = (r45.fp5) fVar;
        return n51.f.a(this.f374528d, fp5Var.f374528d) && n51.f.a(this.f374529e, fp5Var.f374529e) && n51.f.a(java.lang.Integer.valueOf(this.f374530f), java.lang.Integer.valueOf(fp5Var.f374530f)) && n51.f.a(java.lang.Integer.valueOf(this.f374531g), java.lang.Integer.valueOf(fp5Var.f374531g)) && n51.f.a(java.lang.Integer.valueOf(this.f374532h), java.lang.Integer.valueOf(fp5Var.f374532h)) && n51.f.a(java.lang.Integer.valueOf(this.f374533i), java.lang.Integer.valueOf(fp5Var.f374533i)) && n51.f.a(java.lang.Integer.valueOf(this.f374534m), java.lang.Integer.valueOf(fp5Var.f374534m)) && n51.f.a(java.lang.Integer.valueOf(this.f374535n), java.lang.Integer.valueOf(fp5Var.f374535n)) && n51.f.a(this.f374536o, fp5Var.f374536o);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f374528d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f374529e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f374530f);
            fVar.e(4, this.f374531g);
            fVar.e(5, this.f374532h);
            fVar.e(6, this.f374533i);
            fVar.e(7, this.f374534m);
            fVar.e(8, this.f374535n);
            java.lang.String str3 = this.f374536o;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f374528d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f374529e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            int e17 = j17 + b36.f.e(3, this.f374530f) + b36.f.e(4, this.f374531g) + b36.f.e(5, this.f374532h) + b36.f.e(6, this.f374533i) + b36.f.e(7, this.f374534m) + b36.f.e(8, this.f374535n);
            java.lang.String str6 = this.f374536o;
            return str6 != null ? e17 + b36.f.j(9, str6) : e17;
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
        r45.fp5 fp5Var = (r45.fp5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                fp5Var.f374528d = aVar2.k(intValue);
                return 0;
            case 2:
                fp5Var.f374529e = aVar2.k(intValue);
                return 0;
            case 3:
                fp5Var.f374530f = aVar2.g(intValue);
                return 0;
            case 4:
                fp5Var.f374531g = aVar2.g(intValue);
                return 0;
            case 5:
                fp5Var.f374532h = aVar2.g(intValue);
                return 0;
            case 6:
                fp5Var.f374533i = aVar2.g(intValue);
                return 0;
            case 7:
                fp5Var.f374534m = aVar2.g(intValue);
                return 0;
            case 8:
                fp5Var.f374535n = aVar2.g(intValue);
                return 0;
            case 9:
                fp5Var.f374536o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
