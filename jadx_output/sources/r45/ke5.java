package r45;

/* loaded from: classes4.dex */
public class ke5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f378625d;

    /* renamed from: e, reason: collision with root package name */
    public long f378626e;

    /* renamed from: f, reason: collision with root package name */
    public long f378627f;

    /* renamed from: g, reason: collision with root package name */
    public long f378628g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ke5)) {
            return false;
        }
        r45.ke5 ke5Var = (r45.ke5) fVar;
        return n51.f.a(this.BaseRequest, ke5Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f378625d), java.lang.Integer.valueOf(ke5Var.f378625d)) && n51.f.a(java.lang.Long.valueOf(this.f378626e), java.lang.Long.valueOf(ke5Var.f378626e)) && n51.f.a(java.lang.Long.valueOf(this.f378627f), java.lang.Long.valueOf(ke5Var.f378627f)) && n51.f.a(java.lang.Long.valueOf(this.f378628g), java.lang.Long.valueOf(ke5Var.f378628g));
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
            fVar.e(2, this.f378625d);
            fVar.h(3, this.f378626e);
            fVar.h(4, this.f378627f);
            fVar.h(5, this.f378628g);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            return (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f378625d) + b36.f.h(3, this.f378626e) + b36.f.h(4, this.f378627f) + b36.f.h(5, this.f378628g);
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
        r45.ke5 ke5Var = (r45.ke5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.he heVar3 = new r45.he();
                if (bArr != null && bArr.length > 0) {
                    heVar3.parseFrom(bArr);
                }
                ke5Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            ke5Var.f378625d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            ke5Var.f378626e = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 4) {
            ke5Var.f378627f = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        ke5Var.f378628g = aVar2.i(intValue);
        return 0;
    }
}
