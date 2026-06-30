package r45;

/* loaded from: classes4.dex */
public class ui3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f387400d;

    /* renamed from: e, reason: collision with root package name */
    public int f387401e;

    /* renamed from: f, reason: collision with root package name */
    public double f387402f;

    /* renamed from: g, reason: collision with root package name */
    public double f387403g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ui3)) {
            return false;
        }
        r45.ui3 ui3Var = (r45.ui3) fVar;
        return n51.f.a(this.BaseRequest, ui3Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f387400d), java.lang.Integer.valueOf(ui3Var.f387400d)) && n51.f.a(java.lang.Integer.valueOf(this.f387401e), java.lang.Integer.valueOf(ui3Var.f387401e)) && n51.f.a(java.lang.Double.valueOf(this.f387402f), java.lang.Double.valueOf(ui3Var.f387402f)) && n51.f.a(java.lang.Double.valueOf(this.f387403g), java.lang.Double.valueOf(ui3Var.f387403g));
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
            fVar.e(2, this.f387400d);
            fVar.e(3, this.f387401e);
            fVar.c(4, this.f387402f);
            fVar.c(5, this.f387403g);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            return (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f387400d) + b36.f.e(3, this.f387401e) + b36.f.c(4, this.f387402f) + b36.f.c(5, this.f387403g);
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
        r45.ui3 ui3Var = (r45.ui3) objArr[1];
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
                ui3Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            ui3Var.f387400d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            ui3Var.f387401e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            ui3Var.f387402f = aVar2.e(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        ui3Var.f387403g = aVar2.e(intValue);
        return 0;
    }
}
