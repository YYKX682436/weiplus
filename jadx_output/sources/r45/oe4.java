package r45;

/* loaded from: classes4.dex */
public class oe4 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f382196d;

    /* renamed from: e, reason: collision with root package name */
    public int f382197e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f382198f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f382199g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.oe4)) {
            return false;
        }
        r45.oe4 oe4Var = (r45.oe4) fVar;
        return n51.f.a(this.BaseRequest, oe4Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f382196d), java.lang.Integer.valueOf(oe4Var.f382196d)) && n51.f.a(java.lang.Integer.valueOf(this.f382197e), java.lang.Integer.valueOf(oe4Var.f382197e)) && n51.f.a(this.f382198f, oe4Var.f382198f) && n51.f.a(this.f382199g, oe4Var.f382199g);
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
            fVar.e(2, this.f382196d);
            fVar.e(3, this.f382197e);
            java.lang.String str = this.f382198f;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f382199g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f382196d) + b36.f.e(3, this.f382197e);
            java.lang.String str3 = this.f382198f;
            if (str3 != null) {
                i18 += b36.f.j(4, str3);
            }
            java.lang.String str4 = this.f382199g;
            return str4 != null ? i18 + b36.f.j(5, str4) : i18;
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
        r45.oe4 oe4Var = (r45.oe4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr != null && bArr.length > 0) {
                    heVar3.parseFrom(bArr);
                }
                oe4Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            oe4Var.f382196d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            oe4Var.f382197e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            oe4Var.f382198f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        oe4Var.f382199g = aVar2.k(intValue);
        return 0;
    }
}
