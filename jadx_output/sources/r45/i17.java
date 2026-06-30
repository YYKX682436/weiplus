package r45;

/* loaded from: classes9.dex */
public class i17 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f376668d;

    /* renamed from: e, reason: collision with root package name */
    public int f376669e;

    /* renamed from: f, reason: collision with root package name */
    public int f376670f;

    /* renamed from: g, reason: collision with root package name */
    public r45.cu5 f376671g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.i17)) {
            return false;
        }
        r45.i17 i17Var = (r45.i17) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f376668d), java.lang.Integer.valueOf(i17Var.f376668d)) && n51.f.a(java.lang.Integer.valueOf(this.f376669e), java.lang.Integer.valueOf(i17Var.f376669e)) && n51.f.a(java.lang.Integer.valueOf(this.f376670f), java.lang.Integer.valueOf(i17Var.f376670f)) && n51.f.a(this.f376671g, i17Var.f376671g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f376668d);
            fVar.e(2, this.f376669e);
            fVar.e(3, this.f376670f);
            r45.cu5 cu5Var = this.f376671g;
            if (cu5Var != null) {
                fVar.i(4, cu5Var.computeSize());
                this.f376671g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f376668d) + 0 + b36.f.e(2, this.f376669e) + b36.f.e(3, this.f376670f);
            r45.cu5 cu5Var2 = this.f376671g;
            return cu5Var2 != null ? e17 + b36.f.i(4, cu5Var2.computeSize()) : e17;
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
        r45.i17 i17Var = (r45.i17) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            i17Var.f376668d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            i17Var.f376669e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            i17Var.f376670f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.cu5 cu5Var3 = new r45.cu5();
            if (bArr != null && bArr.length > 0) {
                cu5Var3.b(bArr);
            }
            i17Var.f376671g = cu5Var3;
        }
        return 0;
    }
}
