package r45;

/* loaded from: classes2.dex */
public class v96 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.l95 f388009d;

    /* renamed from: e, reason: collision with root package name */
    public int f388010e;

    /* renamed from: f, reason: collision with root package name */
    public int f388011f;

    /* renamed from: g, reason: collision with root package name */
    public int f388012g;

    /* renamed from: h, reason: collision with root package name */
    public int f388013h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.v96)) {
            return false;
        }
        r45.v96 v96Var = (r45.v96) fVar;
        return n51.f.a(this.f388009d, v96Var.f388009d) && n51.f.a(java.lang.Integer.valueOf(this.f388010e), java.lang.Integer.valueOf(v96Var.f388010e)) && n51.f.a(java.lang.Integer.valueOf(this.f388011f), java.lang.Integer.valueOf(v96Var.f388011f)) && n51.f.a(java.lang.Integer.valueOf(this.f388012g), java.lang.Integer.valueOf(v96Var.f388012g)) && n51.f.a(java.lang.Integer.valueOf(this.f388013h), java.lang.Integer.valueOf(v96Var.f388013h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.l95 l95Var = this.f388009d;
            if (l95Var != null) {
                fVar.i(1, l95Var.computeSize());
                this.f388009d.writeFields(fVar);
            }
            fVar.e(2, this.f388010e);
            fVar.e(3, this.f388011f);
            fVar.e(4, this.f388012g);
            fVar.e(5, this.f388013h);
            return 0;
        }
        if (i17 == 1) {
            r45.l95 l95Var2 = this.f388009d;
            return (l95Var2 != null ? 0 + b36.f.i(1, l95Var2.computeSize()) : 0) + b36.f.e(2, this.f388010e) + b36.f.e(3, this.f388011f) + b36.f.e(4, this.f388012g) + b36.f.e(5, this.f388013h);
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
        r45.v96 v96Var = (r45.v96) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.l95 l95Var3 = new r45.l95();
                if (bArr != null && bArr.length > 0) {
                    l95Var3.parseFrom(bArr);
                }
                v96Var.f388009d = l95Var3;
            }
            return 0;
        }
        if (intValue == 2) {
            v96Var.f388010e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            v96Var.f388011f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            v96Var.f388012g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        v96Var.f388013h = aVar2.g(intValue);
        return 0;
    }
}
