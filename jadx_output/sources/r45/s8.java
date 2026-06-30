package r45;

/* loaded from: classes4.dex */
public class s8 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f385540d;

    /* renamed from: e, reason: collision with root package name */
    public int f385541e;

    /* renamed from: f, reason: collision with root package name */
    public int f385542f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f385543g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.s8)) {
            return false;
        }
        r45.s8 s8Var = (r45.s8) fVar;
        return n51.f.a(this.f385540d, s8Var.f385540d) && n51.f.a(java.lang.Integer.valueOf(this.f385541e), java.lang.Integer.valueOf(s8Var.f385541e)) && n51.f.a(java.lang.Integer.valueOf(this.f385542f), java.lang.Integer.valueOf(s8Var.f385542f)) && n51.f.a(this.f385543g, s8Var.f385543g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f385540d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f385541e);
            fVar.e(3, this.f385542f);
            java.lang.String str2 = this.f385543g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f385540d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.e(2, this.f385541e) + b36.f.e(3, this.f385542f);
            java.lang.String str4 = this.f385543g;
            return str4 != null ? j17 + b36.f.j(4, str4) : j17;
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
        r45.s8 s8Var = (r45.s8) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            s8Var.f385540d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            s8Var.f385541e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            s8Var.f385542f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        s8Var.f385543g = aVar2.k(intValue);
        return 0;
    }
}
