package r45;

/* loaded from: classes2.dex */
public class ur6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f387602d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f387603e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f387604f;

    /* renamed from: g, reason: collision with root package name */
    public int f387605g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ur6)) {
            return false;
        }
        r45.ur6 ur6Var = (r45.ur6) fVar;
        return n51.f.a(this.BaseRequest, ur6Var.BaseRequest) && n51.f.a(this.f387602d, ur6Var.f387602d) && n51.f.a(this.f387603e, ur6Var.f387603e) && n51.f.a(this.f387604f, ur6Var.f387604f) && n51.f.a(java.lang.Integer.valueOf(this.f387605g), java.lang.Integer.valueOf(ur6Var.f387605g));
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
            java.lang.String str = this.f387602d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f387603e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f387604f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f387605g);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str4 = this.f387602d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f387603e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f387604f;
            if (str6 != null) {
                i18 += b36.f.j(4, str6);
            }
            return i18 + b36.f.e(5, this.f387605g);
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
        r45.ur6 ur6Var = (r45.ur6) objArr[1];
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
                ur6Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            ur6Var.f387602d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            ur6Var.f387603e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            ur6Var.f387604f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        ur6Var.f387605g = aVar2.g(intValue);
        return 0;
    }
}
