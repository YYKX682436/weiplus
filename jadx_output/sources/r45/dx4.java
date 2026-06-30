package r45;

/* loaded from: classes8.dex */
public class dx4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f372826d;

    /* renamed from: e, reason: collision with root package name */
    public int f372827e;

    /* renamed from: f, reason: collision with root package name */
    public int f372828f;

    /* renamed from: g, reason: collision with root package name */
    public int f372829g;

    /* renamed from: h, reason: collision with root package name */
    public int f372830h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dx4)) {
            return false;
        }
        r45.dx4 dx4Var = (r45.dx4) fVar;
        return n51.f.a(this.f372826d, dx4Var.f372826d) && n51.f.a(java.lang.Integer.valueOf(this.f372827e), java.lang.Integer.valueOf(dx4Var.f372827e)) && n51.f.a(java.lang.Integer.valueOf(this.f372828f), java.lang.Integer.valueOf(dx4Var.f372828f)) && n51.f.a(java.lang.Integer.valueOf(this.f372829g), java.lang.Integer.valueOf(dx4Var.f372829g)) && n51.f.a(java.lang.Integer.valueOf(this.f372830h), java.lang.Integer.valueOf(dx4Var.f372830h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f372826d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f372827e);
            fVar.e(3, this.f372828f);
            fVar.e(4, this.f372829g);
            fVar.e(5, this.f372830h);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f372826d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f372827e) + b36.f.e(3, this.f372828f) + b36.f.e(4, this.f372829g) + b36.f.e(5, this.f372830h);
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
        r45.dx4 dx4Var = (r45.dx4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            dx4Var.f372826d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            dx4Var.f372827e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            dx4Var.f372828f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            dx4Var.f372829g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        dx4Var.f372830h = aVar2.g(intValue);
        return 0;
    }
}
