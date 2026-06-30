package r45;

/* loaded from: classes4.dex */
public class oi4 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f382279d;

    /* renamed from: e, reason: collision with root package name */
    public int f382280e;

    /* renamed from: f, reason: collision with root package name */
    public int f382281f;

    /* renamed from: g, reason: collision with root package name */
    public int f382282g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.oi4)) {
            return false;
        }
        r45.oi4 oi4Var = (r45.oi4) fVar;
        return n51.f.a(this.BaseRequest, oi4Var.BaseRequest) && n51.f.a(this.f382279d, oi4Var.f382279d) && n51.f.a(java.lang.Integer.valueOf(this.f382280e), java.lang.Integer.valueOf(oi4Var.f382280e)) && n51.f.a(java.lang.Integer.valueOf(this.f382281f), java.lang.Integer.valueOf(oi4Var.f382281f)) && n51.f.a(java.lang.Integer.valueOf(this.f382282g), java.lang.Integer.valueOf(oi4Var.f382282g));
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
            java.lang.String str = this.f382279d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f382280e);
            fVar.e(4, this.f382281f);
            fVar.e(5, this.f382282g);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str2 = this.f382279d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            return i18 + b36.f.e(3, this.f382280e) + b36.f.e(4, this.f382281f) + b36.f.e(5, this.f382282g);
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
        r45.oi4 oi4Var = (r45.oi4) objArr[1];
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
                oi4Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            oi4Var.f382279d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            oi4Var.f382280e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            oi4Var.f382281f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        oi4Var.f382282g = aVar2.g(intValue);
        return 0;
    }
}
