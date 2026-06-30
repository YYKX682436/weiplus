package r45;

/* loaded from: classes4.dex */
public class w86 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f388968d;

    /* renamed from: e, reason: collision with root package name */
    public int f388969e;

    /* renamed from: f, reason: collision with root package name */
    public int f388970f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.w86)) {
            return false;
        }
        r45.w86 w86Var = (r45.w86) fVar;
        return n51.f.a(this.BaseRequest, w86Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f388968d), java.lang.Integer.valueOf(w86Var.f388968d)) && n51.f.a(java.lang.Integer.valueOf(this.f388969e), java.lang.Integer.valueOf(w86Var.f388969e)) && n51.f.a(java.lang.Integer.valueOf(this.f388970f), java.lang.Integer.valueOf(w86Var.f388970f));
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
            fVar.e(2, this.f388968d);
            fVar.e(3, this.f388969e);
            fVar.e(4, this.f388970f);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            return (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f388968d) + b36.f.e(3, this.f388969e) + b36.f.e(4, this.f388970f);
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
        r45.w86 w86Var = (r45.w86) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                w86Var.f388968d = aVar2.g(intValue);
                return 0;
            }
            if (intValue == 3) {
                w86Var.f388969e = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            w86Var.f388970f = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.he heVar3 = new r45.he();
            if (bArr != null && bArr.length > 0) {
                heVar3.parseFrom(bArr);
            }
            w86Var.BaseRequest = heVar3;
        }
        return 0;
    }
}
