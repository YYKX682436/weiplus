package r45;

/* loaded from: classes2.dex */
public class x9 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f389880d;

    /* renamed from: e, reason: collision with root package name */
    public long f389881e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f389882f;

    /* renamed from: g, reason: collision with root package name */
    public int f389883g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.x9)) {
            return false;
        }
        r45.x9 x9Var = (r45.x9) fVar;
        return n51.f.a(this.f389880d, x9Var.f389880d) && n51.f.a(java.lang.Long.valueOf(this.f389881e), java.lang.Long.valueOf(x9Var.f389881e)) && n51.f.a(this.f389882f, x9Var.f389882f) && n51.f.a(java.lang.Integer.valueOf(this.f389883g), java.lang.Integer.valueOf(x9Var.f389883g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f389880d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f389881e);
            java.lang.String str2 = this.f389882f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f389883g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f389880d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.h(2, this.f389881e);
            java.lang.String str4 = this.f389882f;
            if (str4 != null) {
                j17 += b36.f.j(3, str4);
            }
            return j17 + b36.f.e(4, this.f389883g);
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
        r45.x9 x9Var = (r45.x9) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            x9Var.f389880d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            x9Var.f389881e = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 3) {
            x9Var.f389882f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        x9Var.f389883g = aVar2.g(intValue);
        return 0;
    }
}
