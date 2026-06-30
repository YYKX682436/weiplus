package r45;

/* loaded from: classes10.dex */
public class ny5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.mc5 f381765d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f381766e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ny5)) {
            return false;
        }
        r45.ny5 ny5Var = (r45.ny5) fVar;
        return n51.f.a(this.f381765d, ny5Var.f381765d) && n51.f.a(this.f381766e, ny5Var.f381766e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.mc5 mc5Var = this.f381765d;
            if (mc5Var != null) {
                fVar.i(1, mc5Var.computeSize());
                this.f381765d.writeFields(fVar);
            }
            java.lang.String str = this.f381766e;
            if (str != null) {
                fVar.j(2, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.mc5 mc5Var2 = this.f381765d;
            int i18 = mc5Var2 != null ? 0 + b36.f.i(1, mc5Var2.computeSize()) : 0;
            java.lang.String str2 = this.f381766e;
            return str2 != null ? i18 + b36.f.j(2, str2) : i18;
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
        r45.ny5 ny5Var = (r45.ny5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                return -1;
            }
            ny5Var.f381766e = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            r45.mc5 mc5Var3 = new r45.mc5();
            if (bArr != null && bArr.length > 0) {
                mc5Var3.parseFrom(bArr);
            }
            ny5Var.f381765d = mc5Var3;
        }
        return 0;
    }
}
