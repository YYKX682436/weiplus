package r45;

/* loaded from: classes9.dex */
public class bn5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f370896d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f370897e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f370898f;

    /* renamed from: g, reason: collision with root package name */
    public int f370899g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bn5)) {
            return false;
        }
        r45.bn5 bn5Var = (r45.bn5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f370896d), java.lang.Integer.valueOf(bn5Var.f370896d)) && n51.f.a(this.f370897e, bn5Var.f370897e) && n51.f.a(this.f370898f, bn5Var.f370898f) && n51.f.a(java.lang.Integer.valueOf(this.f370899g), java.lang.Integer.valueOf(bn5Var.f370899g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f370896d);
            java.lang.String str = this.f370897e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f370898f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f370899g);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f370896d) + 0;
            java.lang.String str3 = this.f370897e;
            if (str3 != null) {
                e17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f370898f;
            if (str4 != null) {
                e17 += b36.f.j(3, str4);
            }
            return e17 + b36.f.e(4, this.f370899g);
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
        r45.bn5 bn5Var = (r45.bn5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            bn5Var.f370896d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            bn5Var.f370897e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            bn5Var.f370898f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        bn5Var.f370899g = aVar2.g(intValue);
        return 0;
    }
}
