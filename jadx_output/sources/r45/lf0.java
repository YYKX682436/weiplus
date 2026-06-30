package r45;

/* loaded from: classes8.dex */
public class lf0 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.n35 f379403d;

    /* renamed from: e, reason: collision with root package name */
    public int f379404e;

    /* renamed from: f, reason: collision with root package name */
    public int f379405f;

    /* renamed from: g, reason: collision with root package name */
    public int f379406g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lf0)) {
            return false;
        }
        r45.lf0 lf0Var = (r45.lf0) fVar;
        return n51.f.a(this.BaseRequest, lf0Var.BaseRequest) && n51.f.a(this.f379403d, lf0Var.f379403d) && n51.f.a(java.lang.Integer.valueOf(this.f379404e), java.lang.Integer.valueOf(lf0Var.f379404e)) && n51.f.a(java.lang.Integer.valueOf(this.f379405f), java.lang.Integer.valueOf(lf0Var.f379405f)) && n51.f.a(java.lang.Integer.valueOf(this.f379406g), java.lang.Integer.valueOf(lf0Var.f379406g));
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
            r45.n35 n35Var = this.f379403d;
            if (n35Var != null) {
                fVar.i(2, n35Var.computeSize());
                this.f379403d.writeFields(fVar);
            }
            fVar.e(3, this.f379404e);
            fVar.e(4, this.f379405f);
            fVar.e(5, this.f379406g);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            r45.n35 n35Var2 = this.f379403d;
            if (n35Var2 != null) {
                i18 += b36.f.i(2, n35Var2.computeSize());
            }
            return i18 + b36.f.e(3, this.f379404e) + b36.f.e(4, this.f379405f) + b36.f.e(5, this.f379406g);
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
        r45.lf0 lf0Var = (r45.lf0) objArr[1];
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
                lf0Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                lf0Var.f379404e = aVar2.g(intValue);
                return 0;
            }
            if (intValue == 4) {
                lf0Var.f379405f = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            lf0Var.f379406g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.n35 n35Var3 = new r45.n35();
            if (bArr2 != null && bArr2.length > 0) {
                n35Var3.parseFrom(bArr2);
            }
            lf0Var.f379403d = n35Var3;
        }
        return 0;
    }
}
