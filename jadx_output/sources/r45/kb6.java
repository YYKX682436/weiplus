package r45;

/* loaded from: classes2.dex */
public class kb6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public long f378578d;

    /* renamed from: e, reason: collision with root package name */
    public int f378579e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.kb6)) {
            return false;
        }
        r45.kb6 kb6Var = (r45.kb6) fVar;
        return n51.f.a(this.BaseRequest, kb6Var.BaseRequest) && n51.f.a(java.lang.Long.valueOf(this.f378578d), java.lang.Long.valueOf(kb6Var.f378578d)) && n51.f.a(java.lang.Integer.valueOf(this.f378579e), java.lang.Integer.valueOf(kb6Var.f378579e));
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
            fVar.h(2, this.f378578d);
            fVar.e(3, this.f378579e);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            return (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.h(2, this.f378578d) + b36.f.e(3, this.f378579e);
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
        r45.kb6 kb6Var = (r45.kb6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                kb6Var.f378578d = aVar2.i(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            kb6Var.f378579e = aVar2.g(intValue);
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
            kb6Var.BaseRequest = heVar3;
        }
        return 0;
    }
}
