package r45;

/* loaded from: classes9.dex */
public class c40 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f371261d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f371262e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f371263f;

    /* renamed from: g, reason: collision with root package name */
    public int f371264g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f371265h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.c40)) {
            return false;
        }
        r45.c40 c40Var = (r45.c40) fVar;
        return n51.f.a(this.f371261d, c40Var.f371261d) && n51.f.a(this.f371262e, c40Var.f371262e) && n51.f.a(this.f371263f, c40Var.f371263f) && n51.f.a(java.lang.Integer.valueOf(this.f371264g), java.lang.Integer.valueOf(c40Var.f371264g)) && n51.f.a(this.f371265h, c40Var.f371265h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mm.protobuf.g gVar = this.f371261d;
            if (gVar != null) {
                fVar.b(1, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f371262e;
            if (gVar2 != null) {
                fVar.b(2, gVar2);
            }
            java.lang.String str = this.f371263f;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f371264g);
            java.lang.String str2 = this.f371265h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mm.protobuf.g gVar3 = this.f371261d;
            int b17 = gVar3 != null ? 0 + b36.f.b(1, gVar3) : 0;
            com.tencent.mm.protobuf.g gVar4 = this.f371262e;
            if (gVar4 != null) {
                b17 += b36.f.b(2, gVar4);
            }
            java.lang.String str3 = this.f371263f;
            if (str3 != null) {
                b17 += b36.f.j(3, str3);
            }
            int e17 = b17 + b36.f.e(4, this.f371264g);
            java.lang.String str4 = this.f371265h;
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
        r45.c40 c40Var = (r45.c40) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            c40Var.f371261d = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 2) {
            c40Var.f371262e = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 3) {
            c40Var.f371263f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            c40Var.f371264g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        c40Var.f371265h = aVar2.k(intValue);
        return 0;
    }
}
