package r45;

/* loaded from: classes8.dex */
public class c44 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f371268d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f371269e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.c44)) {
            return false;
        }
        r45.c44 c44Var = (r45.c44) fVar;
        return n51.f.a(this.f371268d, c44Var.f371268d) && n51.f.a(this.f371269e, c44Var.f371269e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f371268d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f371269e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f371268d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f371269e;
            return str4 != null ? j17 + b36.f.j(2, str4) : j17;
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
        r45.c44 c44Var = (r45.c44) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            c44Var.f371268d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        c44Var.f371269e = aVar2.k(intValue);
        return 0;
    }
}
