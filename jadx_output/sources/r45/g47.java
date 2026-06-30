package r45;

/* loaded from: classes4.dex */
public class g47 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f374883d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f374884e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.g47)) {
            return false;
        }
        r45.g47 g47Var = (r45.g47) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f374883d), java.lang.Long.valueOf(g47Var.f374883d)) && n51.f.a(this.f374884e, g47Var.f374884e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f374883d);
            java.lang.String str = this.f374884e;
            if (str != null) {
                fVar.j(2, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f374883d) + 0;
            java.lang.String str2 = this.f374884e;
            return str2 != null ? h17 + b36.f.j(2, str2) : h17;
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
        r45.g47 g47Var = (r45.g47) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            g47Var.f374883d = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        g47Var.f374884e = aVar2.k(intValue);
        return 0;
    }
}
