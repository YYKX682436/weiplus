package r45;

/* loaded from: classes9.dex */
public class zo extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.k6 f392246d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f392247e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zo)) {
            return false;
        }
        r45.zo zoVar = (r45.zo) fVar;
        return n51.f.a(this.BaseRequest, zoVar.BaseRequest) && n51.f.a(this.f392246d, zoVar.f392246d) && n51.f.a(this.f392247e, zoVar.f392247e);
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
            r45.k6 k6Var = this.f392246d;
            if (k6Var != null) {
                fVar.i(2, k6Var.computeSize());
                this.f392246d.writeFields(fVar);
            }
            java.lang.String str = this.f392247e;
            if (str != null) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            r45.k6 k6Var2 = this.f392246d;
            if (k6Var2 != null) {
                i18 += b36.f.i(2, k6Var2.computeSize());
            }
            java.lang.String str2 = this.f392247e;
            return str2 != null ? i18 + b36.f.j(3, str2) : i18;
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
        r45.zo zoVar = (r45.zo) objArr[1];
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
                zoVar.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            zoVar.f392247e = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.k6 k6Var3 = new r45.k6();
            if (bArr2 != null && bArr2.length > 0) {
                k6Var3.parseFrom(bArr2);
            }
            zoVar.f392246d = k6Var3;
        }
        return 0;
    }
}
