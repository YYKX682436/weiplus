package r45;

/* loaded from: classes8.dex */
public class w57 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f388906d;

    /* renamed from: e, reason: collision with root package name */
    public r45.v57 f388907e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.w57)) {
            return false;
        }
        r45.w57 w57Var = (r45.w57) fVar;
        return n51.f.a(this.f388906d, w57Var.f388906d) && n51.f.a(this.f388907e, w57Var.f388907e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f388906d;
            if (str != null) {
                fVar.j(1, str);
            }
            r45.v57 v57Var = this.f388907e;
            if (v57Var != null) {
                fVar.i(2, v57Var.computeSize());
                this.f388907e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f388906d;
            int j17 = str2 != null ? 0 + b36.f.j(1, str2) : 0;
            r45.v57 v57Var2 = this.f388907e;
            return v57Var2 != null ? j17 + b36.f.i(2, v57Var2.computeSize()) : j17;
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
        r45.w57 w57Var = (r45.w57) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            w57Var.f388906d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            r45.v57 v57Var3 = new r45.v57();
            if (bArr != null && bArr.length > 0) {
                v57Var3.parseFrom(bArr);
            }
            w57Var.f388907e = v57Var3;
        }
        return 0;
    }
}
