package r45;

/* loaded from: classes4.dex */
public class cc0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f371447d;

    /* renamed from: e, reason: collision with root package name */
    public int f371448e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f371449f;

    /* renamed from: g, reason: collision with root package name */
    public int f371450g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.cc0)) {
            return false;
        }
        r45.cc0 cc0Var = (r45.cc0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f371447d), java.lang.Integer.valueOf(cc0Var.f371447d)) && n51.f.a(java.lang.Integer.valueOf(this.f371448e), java.lang.Integer.valueOf(cc0Var.f371448e)) && n51.f.a(this.f371449f, cc0Var.f371449f) && n51.f.a(java.lang.Integer.valueOf(this.f371450g), java.lang.Integer.valueOf(cc0Var.f371450g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f371447d);
            fVar.e(2, this.f371448e);
            java.lang.String str = this.f371449f;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f371450g);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f371447d) + 0 + b36.f.e(2, this.f371448e);
            java.lang.String str2 = this.f371449f;
            if (str2 != null) {
                e17 += b36.f.j(3, str2);
            }
            return e17 + b36.f.e(4, this.f371450g);
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
        r45.cc0 cc0Var = (r45.cc0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            cc0Var.f371447d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            cc0Var.f371448e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            cc0Var.f371449f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        cc0Var.f371450g = aVar2.g(intValue);
        return 0;
    }
}
