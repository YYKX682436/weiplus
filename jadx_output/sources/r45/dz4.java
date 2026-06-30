package r45;

/* loaded from: classes9.dex */
public class dz4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f372870d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f372871e;

    /* renamed from: f, reason: collision with root package name */
    public int f372872f;

    /* renamed from: g, reason: collision with root package name */
    public int f372873g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f372874h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dz4)) {
            return false;
        }
        r45.dz4 dz4Var = (r45.dz4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f372870d), java.lang.Integer.valueOf(dz4Var.f372870d)) && n51.f.a(this.f372871e, dz4Var.f372871e) && n51.f.a(java.lang.Integer.valueOf(this.f372872f), java.lang.Integer.valueOf(dz4Var.f372872f)) && n51.f.a(java.lang.Integer.valueOf(this.f372873g), java.lang.Integer.valueOf(dz4Var.f372873g)) && n51.f.a(this.f372874h, dz4Var.f372874h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f372870d);
            java.lang.String str = this.f372871e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f372872f);
            fVar.e(5, this.f372873g);
            java.lang.String str2 = this.f372874h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f372870d) + 0;
            java.lang.String str3 = this.f372871e;
            if (str3 != null) {
                e17 += b36.f.j(3, str3);
            }
            int e18 = e17 + b36.f.e(4, this.f372872f) + b36.f.e(5, this.f372873g);
            java.lang.String str4 = this.f372874h;
            return str4 != null ? e18 + b36.f.j(6, str4) : e18;
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
        r45.dz4 dz4Var = (r45.dz4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            dz4Var.f372870d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            dz4Var.f372871e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            dz4Var.f372872f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 5) {
            dz4Var.f372873g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 6) {
            return -1;
        }
        dz4Var.f372874h = aVar2.k(intValue);
        return 0;
    }
}
