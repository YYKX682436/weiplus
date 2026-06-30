package r45;

/* loaded from: classes9.dex */
public class nf3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f381348d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f381349e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f381350f;

    /* renamed from: g, reason: collision with root package name */
    public r45.ae f381351g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.nf3)) {
            return false;
        }
        r45.nf3 nf3Var = (r45.nf3) fVar;
        return n51.f.a(this.BaseRequest, nf3Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f381348d), java.lang.Integer.valueOf(nf3Var.f381348d)) && n51.f.a(this.f381349e, nf3Var.f381349e) && n51.f.a(this.f381350f, nf3Var.f381350f) && n51.f.a(this.f381351g, nf3Var.f381351g);
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
            fVar.e(2, this.f381348d);
            java.lang.String str = this.f381349e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f381350f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            r45.ae aeVar = this.f381351g;
            if (aeVar != null) {
                fVar.i(5, aeVar.computeSize());
                this.f381351g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f381348d);
            java.lang.String str3 = this.f381349e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f381350f;
            if (str4 != null) {
                i18 += b36.f.j(4, str4);
            }
            r45.ae aeVar2 = this.f381351g;
            return aeVar2 != null ? i18 + b36.f.i(5, aeVar2.computeSize()) : i18;
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
        r45.nf3 nf3Var = (r45.nf3) objArr[1];
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
                nf3Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            nf3Var.f381348d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            nf3Var.f381349e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            nf3Var.f381350f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.ae aeVar3 = new r45.ae();
            if (bArr2 != null && bArr2.length > 0) {
                aeVar3.parseFrom(bArr2);
            }
            nf3Var.f381351g = aeVar3;
        }
        return 0;
    }
}
