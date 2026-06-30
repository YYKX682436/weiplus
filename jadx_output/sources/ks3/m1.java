package ks3;

/* loaded from: classes4.dex */
public class m1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f311719d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f311720e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f311721f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof ks3.m1)) {
            return false;
        }
        ks3.m1 m1Var = (ks3.m1) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f311719d), java.lang.Long.valueOf(m1Var.f311719d)) && n51.f.a(this.f311720e, m1Var.f311720e) && n51.f.a(this.f311721f, m1Var.f311721f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f311719d);
            java.lang.String str = this.f311720e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f311721f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f311719d) + 0;
            java.lang.String str3 = this.f311720e;
            if (str3 != null) {
                h17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f311721f;
            return str4 != null ? h17 + b36.f.j(3, str4) : h17;
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
        ks3.m1 m1Var = (ks3.m1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            m1Var.f311719d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            m1Var.f311720e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        m1Var.f311721f = aVar2.k(intValue);
        return 0;
    }
}
