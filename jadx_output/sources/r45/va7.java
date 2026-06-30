package r45;

/* loaded from: classes8.dex */
public class va7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f388056d;

    /* renamed from: e, reason: collision with root package name */
    public r45.sa7 f388057e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.va7)) {
            return false;
        }
        r45.va7 va7Var = (r45.va7) fVar;
        return n51.f.a(this.f388056d, va7Var.f388056d) && n51.f.a(this.f388057e, va7Var.f388057e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f388056d;
            if (str != null) {
                fVar.j(1, str);
            }
            r45.sa7 sa7Var = this.f388057e;
            if (sa7Var != null) {
                fVar.i(2, sa7Var.computeSize());
                this.f388057e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f388056d;
            int j17 = str2 != null ? 0 + b36.f.j(1, str2) : 0;
            r45.sa7 sa7Var2 = this.f388057e;
            return sa7Var2 != null ? j17 + b36.f.i(2, sa7Var2.computeSize()) : j17;
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
        r45.va7 va7Var = (r45.va7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            va7Var.f388056d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            r45.sa7 sa7Var3 = new r45.sa7();
            if (bArr != null && bArr.length > 0) {
                sa7Var3.parseFrom(bArr);
            }
            va7Var.f388057e = sa7Var3;
        }
        return 0;
    }
}
