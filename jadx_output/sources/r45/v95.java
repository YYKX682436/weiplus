package r45;

/* loaded from: classes2.dex */
public class v95 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f388005d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f388006e;

    /* renamed from: f, reason: collision with root package name */
    public int f388007f;

    /* renamed from: g, reason: collision with root package name */
    public float f388008g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.v95)) {
            return false;
        }
        r45.v95 v95Var = (r45.v95) fVar;
        return n51.f.a(this.f388005d, v95Var.f388005d) && n51.f.a(this.f388006e, v95Var.f388006e) && n51.f.a(java.lang.Integer.valueOf(this.f388007f), java.lang.Integer.valueOf(v95Var.f388007f)) && n51.f.a(java.lang.Float.valueOf(this.f388008g), java.lang.Float.valueOf(v95Var.f388008g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f388005d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f388006e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f388007f);
            fVar.d(4, this.f388008g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f388005d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f388006e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.e(3, this.f388007f) + b36.f.d(4, this.f388008g);
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
        r45.v95 v95Var = (r45.v95) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            v95Var.f388005d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            v95Var.f388006e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            v95Var.f388007f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        v95Var.f388008g = aVar2.f(intValue);
        return 0;
    }
}
