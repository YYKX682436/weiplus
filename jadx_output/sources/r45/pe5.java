package r45;

/* loaded from: classes4.dex */
public class pe5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f382983d;

    /* renamed from: e, reason: collision with root package name */
    public long f382984e;

    /* renamed from: f, reason: collision with root package name */
    public long f382985f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pe5)) {
            return false;
        }
        r45.pe5 pe5Var = (r45.pe5) fVar;
        return n51.f.a(this.BaseRequest, pe5Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f382983d), java.lang.Integer.valueOf(pe5Var.f382983d)) && n51.f.a(java.lang.Long.valueOf(this.f382984e), java.lang.Long.valueOf(pe5Var.f382984e)) && n51.f.a(java.lang.Long.valueOf(this.f382985f), java.lang.Long.valueOf(pe5Var.f382985f));
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
            fVar.e(2, this.f382983d);
            fVar.h(3, this.f382984e);
            fVar.h(4, this.f382985f);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            return (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f382983d) + b36.f.h(3, this.f382984e) + b36.f.h(4, this.f382985f);
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
        r45.pe5 pe5Var = (r45.pe5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                pe5Var.f382983d = aVar2.g(intValue);
                return 0;
            }
            if (intValue == 3) {
                pe5Var.f382984e = aVar2.i(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            pe5Var.f382985f = aVar2.i(intValue);
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
            pe5Var.BaseRequest = heVar3;
        }
        return 0;
    }
}
