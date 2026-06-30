package m53;

/* loaded from: classes8.dex */
public class f4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f323679d;

    /* renamed from: e, reason: collision with root package name */
    public m53.p3 f323680e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.f4)) {
            return false;
        }
        m53.f4 f4Var = (m53.f4) fVar;
        return n51.f.a(this.f323679d, f4Var.f323679d) && n51.f.a(this.f323680e, f4Var.f323680e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f323679d;
            if (str != null) {
                fVar.j(1, str);
            }
            m53.p3 p3Var = this.f323680e;
            if (p3Var != null) {
                fVar.i(2, p3Var.computeSize());
                this.f323680e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f323679d;
            int j17 = str2 != null ? 0 + b36.f.j(1, str2) : 0;
            m53.p3 p3Var2 = this.f323680e;
            return p3Var2 != null ? j17 + b36.f.i(2, p3Var2.computeSize()) : j17;
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
        m53.f4 f4Var = (m53.f4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            f4Var.f323679d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            m53.p3 p3Var3 = new m53.p3();
            if (bArr != null && bArr.length > 0) {
                p3Var3.parseFrom(bArr);
            }
            f4Var.f323680e = p3Var3;
        }
        return 0;
    }
}
