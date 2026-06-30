package r45;

/* loaded from: classes8.dex */
public class gy4 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f375638d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f375639e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f375640f;

    /* renamed from: g, reason: collision with root package name */
    public r45.r1 f375641g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gy4)) {
            return false;
        }
        r45.gy4 gy4Var = (r45.gy4) fVar;
        return n51.f.a(this.BaseRequest, gy4Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f375638d), java.lang.Integer.valueOf(gy4Var.f375638d)) && n51.f.a(this.f375639e, gy4Var.f375639e) && n51.f.a(this.f375640f, gy4Var.f375640f) && n51.f.a(this.f375641g, gy4Var.f375641g);
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
            fVar.e(2, this.f375638d);
            java.lang.String str = this.f375639e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f375640f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            r45.r1 r1Var = this.f375641g;
            if (r1Var != null) {
                fVar.i(5, r1Var.computeSize());
                this.f375641g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f375638d);
            java.lang.String str3 = this.f375639e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f375640f;
            if (str4 != null) {
                i18 += b36.f.j(4, str4);
            }
            r45.r1 r1Var2 = this.f375641g;
            return r1Var2 != null ? i18 + b36.f.i(5, r1Var2.computeSize()) : i18;
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
        r45.gy4 gy4Var = (r45.gy4) objArr[1];
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
                gy4Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            gy4Var.f375638d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            gy4Var.f375639e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            gy4Var.f375640f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.r1 r1Var3 = new r45.r1();
            if (bArr2 != null && bArr2.length > 0) {
                r1Var3.parseFrom(bArr2);
            }
            gy4Var.f375641g = r1Var3;
        }
        return 0;
    }
}
