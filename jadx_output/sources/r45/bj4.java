package r45;

/* loaded from: classes9.dex */
public class bj4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f370804d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f370805e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f370806f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bj4)) {
            return false;
        }
        r45.bj4 bj4Var = (r45.bj4) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f370804d), java.lang.Long.valueOf(bj4Var.f370804d)) && n51.f.a(this.f370805e, bj4Var.f370805e) && n51.f.a(this.f370806f, bj4Var.f370806f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f370804d);
            java.lang.String str = this.f370805e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f370806f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f370804d) + 0;
            java.lang.String str3 = this.f370805e;
            if (str3 != null) {
                h17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f370806f;
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
        r45.bj4 bj4Var = (r45.bj4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            bj4Var.f370804d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            bj4Var.f370805e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        bj4Var.f370806f = aVar2.k(intValue);
        return 0;
    }
}
