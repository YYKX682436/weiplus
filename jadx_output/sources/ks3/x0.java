package ks3;

/* loaded from: classes4.dex */
public class x0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f311770d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f311771e;

    /* renamed from: f, reason: collision with root package name */
    public long f311772f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof ks3.x0)) {
            return false;
        }
        ks3.x0 x0Var = (ks3.x0) fVar;
        return n51.f.a(this.f311770d, x0Var.f311770d) && n51.f.a(this.f311771e, x0Var.f311771e) && n51.f.a(java.lang.Long.valueOf(this.f311772f), java.lang.Long.valueOf(x0Var.f311772f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f311770d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f311771e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.h(3, this.f311772f);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f311770d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f311771e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.h(3, this.f311772f);
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
        ks3.x0 x0Var = (ks3.x0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            x0Var.f311770d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            x0Var.f311771e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        x0Var.f311772f = aVar2.i(intValue);
        return 0;
    }
}
