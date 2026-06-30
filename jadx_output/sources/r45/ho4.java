package r45;

/* loaded from: classes4.dex */
public class ho4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.du5 f376328d;

    /* renamed from: e, reason: collision with root package name */
    public int f376329e;

    /* renamed from: f, reason: collision with root package name */
    public int f376330f;

    /* renamed from: g, reason: collision with root package name */
    public int f376331g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ho4)) {
            return false;
        }
        r45.ho4 ho4Var = (r45.ho4) fVar;
        return n51.f.a(this.f376328d, ho4Var.f376328d) && n51.f.a(java.lang.Integer.valueOf(this.f376329e), java.lang.Integer.valueOf(ho4Var.f376329e)) && n51.f.a(java.lang.Integer.valueOf(this.f376330f), java.lang.Integer.valueOf(ho4Var.f376330f)) && n51.f.a(java.lang.Integer.valueOf(this.f376331g), java.lang.Integer.valueOf(ho4Var.f376331g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.du5 du5Var = this.f376328d;
            if (du5Var != null) {
                fVar.i(1, du5Var.computeSize());
                this.f376328d.writeFields(fVar);
            }
            fVar.e(2, this.f376329e);
            fVar.e(3, this.f376330f);
            fVar.e(4, this.f376331g);
            return 0;
        }
        if (i17 == 1) {
            r45.du5 du5Var2 = this.f376328d;
            return (du5Var2 != null ? 0 + b36.f.i(1, du5Var2.computeSize()) : 0) + b36.f.e(2, this.f376329e) + b36.f.e(3, this.f376330f) + b36.f.e(4, this.f376331g);
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
        r45.ho4 ho4Var = (r45.ho4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                ho4Var.f376329e = aVar2.g(intValue);
                return 0;
            }
            if (intValue == 3) {
                ho4Var.f376330f = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            ho4Var.f376331g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.du5 du5Var3 = new r45.du5();
            if (bArr != null && bArr.length > 0) {
                du5Var3.b(bArr);
            }
            ho4Var.f376328d = du5Var3;
        }
        return 0;
    }
}
