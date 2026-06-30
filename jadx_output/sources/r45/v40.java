package r45;

/* loaded from: classes4.dex */
public class v40 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f387866d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f387867e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f387868f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.v40)) {
            return false;
        }
        r45.v40 v40Var = (r45.v40) fVar;
        return n51.f.a(this.BaseRequest, v40Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f387866d), java.lang.Integer.valueOf(v40Var.f387866d)) && n51.f.a(this.f387867e, v40Var.f387867e) && n51.f.a(this.f387868f, v40Var.f387868f);
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
            fVar.e(2, this.f387866d);
            java.lang.String str = this.f387867e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f387868f;
            if (str2 != null) {
                fVar.j(100, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f387866d);
            java.lang.String str3 = this.f387867e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f387868f;
            return str4 != null ? i18 + b36.f.j(100, str4) : i18;
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
        r45.v40 v40Var = (r45.v40) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                v40Var.f387866d = aVar2.g(intValue);
                return 0;
            }
            if (intValue == 3) {
                v40Var.f387867e = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 100) {
                return -1;
            }
            v40Var.f387868f = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            r45.he heVar3 = new r45.he();
            if (bArr != null && bArr.length > 0) {
                heVar3.parseFrom(bArr);
            }
            v40Var.BaseRequest = heVar3;
        }
        return 0;
    }
}
