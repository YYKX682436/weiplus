package r45;

/* loaded from: classes2.dex */
public class c25 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f371242d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f371243e;

    /* renamed from: f, reason: collision with root package name */
    public int f371244f;

    /* renamed from: g, reason: collision with root package name */
    public int f371245g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.c25)) {
            return false;
        }
        r45.c25 c25Var = (r45.c25) fVar;
        return n51.f.a(this.f371242d, c25Var.f371242d) && n51.f.a(this.f371243e, c25Var.f371243e) && n51.f.a(java.lang.Integer.valueOf(this.f371244f), java.lang.Integer.valueOf(c25Var.f371244f)) && n51.f.a(java.lang.Integer.valueOf(this.f371245g), java.lang.Integer.valueOf(c25Var.f371245g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f371242d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f371243e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f371244f);
            fVar.e(4, this.f371245g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f371242d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f371243e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.e(3, this.f371244f) + b36.f.e(4, this.f371245g);
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
        r45.c25 c25Var = (r45.c25) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            c25Var.f371242d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            c25Var.f371243e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            c25Var.f371244f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        c25Var.f371245g = aVar2.g(intValue);
        return 0;
    }
}
