package r45;

/* loaded from: classes4.dex */
public class rd3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public long f384738d;

    /* renamed from: e, reason: collision with root package name */
    public long f384739e;

    /* renamed from: f, reason: collision with root package name */
    public int f384740f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rd3)) {
            return false;
        }
        r45.rd3 rd3Var = (r45.rd3) fVar;
        return n51.f.a(this.BaseRequest, rd3Var.BaseRequest) && n51.f.a(java.lang.Long.valueOf(this.f384738d), java.lang.Long.valueOf(rd3Var.f384738d)) && n51.f.a(java.lang.Long.valueOf(this.f384739e), java.lang.Long.valueOf(rd3Var.f384739e)) && n51.f.a(java.lang.Integer.valueOf(this.f384740f), java.lang.Integer.valueOf(rd3Var.f384740f));
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
            fVar.h(2, this.f384738d);
            fVar.h(3, this.f384739e);
            fVar.e(4, this.f384740f);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            return (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.h(2, this.f384738d) + b36.f.h(3, this.f384739e) + b36.f.e(4, this.f384740f);
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
        r45.rd3 rd3Var = (r45.rd3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                rd3Var.f384738d = aVar2.i(intValue);
                return 0;
            }
            if (intValue == 3) {
                rd3Var.f384739e = aVar2.i(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            rd3Var.f384740f = aVar2.g(intValue);
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
            rd3Var.BaseRequest = heVar3;
        }
        return 0;
    }
}
