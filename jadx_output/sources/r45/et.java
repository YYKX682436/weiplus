package r45;

/* loaded from: classes8.dex */
public class et extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f373716d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f373717e;

    /* renamed from: f, reason: collision with root package name */
    public r45.r1 f373718f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.et)) {
            return false;
        }
        r45.et etVar = (r45.et) fVar;
        return n51.f.a(this.BaseRequest, etVar.BaseRequest) && n51.f.a(this.f373716d, etVar.f373716d) && n51.f.a(this.f373717e, etVar.f373717e) && n51.f.a(this.f373718f, etVar.f373718f);
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
            java.lang.String str = this.f373716d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f373717e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            r45.r1 r1Var = this.f373718f;
            if (r1Var != null) {
                fVar.i(4, r1Var.computeSize());
                this.f373718f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str3 = this.f373716d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f373717e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            r45.r1 r1Var2 = this.f373718f;
            return r1Var2 != null ? i18 + b36.f.i(4, r1Var2.computeSize()) : i18;
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
        r45.et etVar = (r45.et) objArr[1];
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
                etVar.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            etVar.f373716d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            etVar.f373717e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
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
            etVar.f373718f = r1Var3;
        }
        return 0;
    }
}
