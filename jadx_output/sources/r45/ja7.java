package r45;

/* loaded from: classes8.dex */
public class ja7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f377679d;

    /* renamed from: e, reason: collision with root package name */
    public int f377680e;

    /* renamed from: f, reason: collision with root package name */
    public int f377681f;

    /* renamed from: g, reason: collision with root package name */
    public int f377682g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f377683h = false;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ja7)) {
            return false;
        }
        r45.ja7 ja7Var = (r45.ja7) fVar;
        return n51.f.a(this.f377679d, ja7Var.f377679d) && n51.f.a(java.lang.Integer.valueOf(this.f377680e), java.lang.Integer.valueOf(ja7Var.f377680e)) && n51.f.a(java.lang.Integer.valueOf(this.f377681f), java.lang.Integer.valueOf(ja7Var.f377681f)) && n51.f.a(java.lang.Integer.valueOf(this.f377682g), java.lang.Integer.valueOf(ja7Var.f377682g)) && n51.f.a(java.lang.Boolean.valueOf(this.f377683h), java.lang.Boolean.valueOf(ja7Var.f377683h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f377679d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f377680e);
            fVar.e(3, this.f377681f);
            fVar.e(4, this.f377682g);
            fVar.a(5, this.f377683h);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f377679d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f377680e) + b36.f.e(3, this.f377681f) + b36.f.e(4, this.f377682g) + b36.f.a(5, this.f377683h);
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
        r45.ja7 ja7Var = (r45.ja7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ja7Var.f377679d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            ja7Var.f377680e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            ja7Var.f377681f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            ja7Var.f377682g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        ja7Var.f377683h = aVar2.c(intValue);
        return 0;
    }
}
