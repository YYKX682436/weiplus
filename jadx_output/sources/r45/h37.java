package r45;

/* loaded from: classes9.dex */
public class h37 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f375810d;

    /* renamed from: e, reason: collision with root package name */
    public int f375811e;

    /* renamed from: f, reason: collision with root package name */
    public int f375812f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f375813g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f375814h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.h37)) {
            return false;
        }
        r45.h37 h37Var = (r45.h37) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f375810d), java.lang.Integer.valueOf(h37Var.f375810d)) && n51.f.a(java.lang.Integer.valueOf(this.f375811e), java.lang.Integer.valueOf(h37Var.f375811e)) && n51.f.a(java.lang.Integer.valueOf(this.f375812f), java.lang.Integer.valueOf(h37Var.f375812f)) && n51.f.a(this.f375813g, h37Var.f375813g) && n51.f.a(this.f375814h, h37Var.f375814h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f375810d);
            fVar.e(2, this.f375811e);
            fVar.e(3, this.f375812f);
            java.lang.String str = this.f375813g;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f375814h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f375810d) + 0 + b36.f.e(2, this.f375811e) + b36.f.e(3, this.f375812f);
            java.lang.String str3 = this.f375813g;
            if (str3 != null) {
                e17 += b36.f.j(4, str3);
            }
            java.lang.String str4 = this.f375814h;
            return str4 != null ? e17 + b36.f.j(5, str4) : e17;
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
        r45.h37 h37Var = (r45.h37) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            h37Var.f375810d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            h37Var.f375811e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            h37Var.f375812f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            h37Var.f375813g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        h37Var.f375814h = aVar2.k(intValue);
        return 0;
    }
}
