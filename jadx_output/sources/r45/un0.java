package r45;

/* loaded from: classes2.dex */
public class un0 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f387487d;

    /* renamed from: e, reason: collision with root package name */
    public double f387488e;

    /* renamed from: f, reason: collision with root package name */
    public double f387489f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.un0)) {
            return false;
        }
        r45.un0 un0Var = (r45.un0) fVar;
        return n51.f.a(this.BaseRequest, un0Var.BaseRequest) && n51.f.a(this.f387487d, un0Var.f387487d) && n51.f.a(java.lang.Double.valueOf(this.f387488e), java.lang.Double.valueOf(un0Var.f387488e)) && n51.f.a(java.lang.Double.valueOf(this.f387489f), java.lang.Double.valueOf(un0Var.f387489f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            java.lang.String str = this.f387487d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.c(3, this.f387488e);
            fVar.c(4, this.f387489f);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str2 = this.f387487d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            return i18 + b36.f.c(3, this.f387488e) + b36.f.c(4, this.f387489f);
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
        r45.un0 un0Var = (r45.un0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                un0Var.f387487d = aVar2.k(intValue);
                return 0;
            }
            if (intValue == 3) {
                un0Var.f387488e = aVar2.e(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            un0Var.f387489f = aVar2.e(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            r45.he heVar3 = new r45.he();
            if (bArr != null && bArr.length > 0) {
                heVar3.parseFrom(bArr);
            }
            un0Var.BaseRequest = heVar3;
        }
        return 0;
    }
}
