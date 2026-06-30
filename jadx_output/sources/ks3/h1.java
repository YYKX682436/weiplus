package ks3;

/* loaded from: classes2.dex */
public class h1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f311684d;

    /* renamed from: e, reason: collision with root package name */
    public int f311685e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof ks3.h1)) {
            return false;
        }
        ks3.h1 h1Var = (ks3.h1) fVar;
        return n51.f.a(this.f311684d, h1Var.f311684d) && n51.f.a(java.lang.Integer.valueOf(this.f311685e), java.lang.Integer.valueOf(h1Var.f311685e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f311684d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f311685e);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f311684d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f311685e);
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
        ks3.h1 h1Var = (ks3.h1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            h1Var.f311684d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        h1Var.f311685e = aVar2.g(intValue);
        return 0;
    }
}
