package r45;

/* loaded from: classes7.dex */
public class ac7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f369926d;

    /* renamed from: e, reason: collision with root package name */
    public int f369927e;

    /* renamed from: f, reason: collision with root package name */
    public int f369928f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f369929g;

    /* renamed from: h, reason: collision with root package name */
    public int f369930h;

    /* renamed from: i, reason: collision with root package name */
    public int f369931i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ac7)) {
            return false;
        }
        r45.ac7 ac7Var = (r45.ac7) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f369926d), java.lang.Integer.valueOf(ac7Var.f369926d)) && n51.f.a(java.lang.Integer.valueOf(this.f369927e), java.lang.Integer.valueOf(ac7Var.f369927e)) && n51.f.a(java.lang.Integer.valueOf(this.f369928f), java.lang.Integer.valueOf(ac7Var.f369928f)) && n51.f.a(this.f369929g, ac7Var.f369929g) && n51.f.a(java.lang.Integer.valueOf(this.f369930h), java.lang.Integer.valueOf(ac7Var.f369930h)) && n51.f.a(java.lang.Integer.valueOf(this.f369931i), java.lang.Integer.valueOf(ac7Var.f369931i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f369926d);
            fVar.e(2, this.f369927e);
            fVar.e(3, this.f369928f);
            java.lang.String str = this.f369929g;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.e(5, this.f369930h);
            fVar.e(6, this.f369931i);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f369926d) + 0 + b36.f.e(2, this.f369927e) + b36.f.e(3, this.f369928f);
            java.lang.String str2 = this.f369929g;
            if (str2 != null) {
                e17 += b36.f.j(4, str2);
            }
            return e17 + b36.f.e(5, this.f369930h) + b36.f.e(6, this.f369931i);
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
        r45.ac7 ac7Var = (r45.ac7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ac7Var.f369926d = aVar2.g(intValue);
                return 0;
            case 2:
                ac7Var.f369927e = aVar2.g(intValue);
                return 0;
            case 3:
                ac7Var.f369928f = aVar2.g(intValue);
                return 0;
            case 4:
                ac7Var.f369929g = aVar2.k(intValue);
                return 0;
            case 5:
                ac7Var.f369930h = aVar2.g(intValue);
                return 0;
            case 6:
                ac7Var.f369931i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
