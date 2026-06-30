package r45;

/* loaded from: classes4.dex */
public class d06 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f371980d;

    /* renamed from: e, reason: collision with root package name */
    public int f371981e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f371982f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public int f371983g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.d06)) {
            return false;
        }
        r45.d06 d06Var = (r45.d06) fVar;
        return n51.f.a(this.BaseRequest, d06Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f371980d), java.lang.Integer.valueOf(d06Var.f371980d)) && n51.f.a(java.lang.Integer.valueOf(this.f371981e), java.lang.Integer.valueOf(d06Var.f371981e)) && n51.f.a(this.f371982f, d06Var.f371982f) && n51.f.a(java.lang.Integer.valueOf(this.f371983g), java.lang.Integer.valueOf(d06Var.f371983g));
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
            fVar.e(2, this.f371980d);
            fVar.e(3, this.f371981e);
            fVar.g(4, 8, this.f371982f);
            fVar.e(5, this.f371983g);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            return (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f371980d) + b36.f.e(3, this.f371981e) + b36.f.g(4, 8, this.f371982f) + b36.f.e(5, this.f371983g);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f371982f.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.d06 d06Var = (r45.d06) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.he heVar3 = new r45.he();
                if (bArr2 != null && bArr2.length > 0) {
                    heVar3.parseFrom(bArr2);
                }
                d06Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            d06Var.f371980d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            d06Var.f371981e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            d06Var.f371983g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            r45.m57 m57Var = new r45.m57();
            if (bArr3 != null && bArr3.length > 0) {
                m57Var.parseFrom(bArr3);
            }
            d06Var.f371982f.add(m57Var);
        }
        return 0;
    }
}
