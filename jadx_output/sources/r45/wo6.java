package r45;

/* loaded from: classes9.dex */
public class wo6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f389347d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f389348e;

    /* renamed from: f, reason: collision with root package name */
    public r45.rf4 f389349f;

    /* renamed from: g, reason: collision with root package name */
    public int f389350g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wo6)) {
            return false;
        }
        r45.wo6 wo6Var = (r45.wo6) fVar;
        return n51.f.a(this.BaseRequest, wo6Var.BaseRequest) && n51.f.a(this.f389347d, wo6Var.f389347d) && n51.f.a(this.f389348e, wo6Var.f389348e) && n51.f.a(this.f389349f, wo6Var.f389349f) && n51.f.a(java.lang.Integer.valueOf(this.f389350g), java.lang.Integer.valueOf(wo6Var.f389350g));
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
            java.lang.String str = this.f389347d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f389348e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            r45.rf4 rf4Var = this.f389349f;
            if (rf4Var != null) {
                fVar.i(4, rf4Var.computeSize());
                this.f389349f.writeFields(fVar);
            }
            fVar.e(5, this.f389350g);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str3 = this.f389347d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f389348e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            r45.rf4 rf4Var2 = this.f389349f;
            if (rf4Var2 != null) {
                i18 += b36.f.i(4, rf4Var2.computeSize());
            }
            return i18 + b36.f.e(5, this.f389350g);
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
        r45.wo6 wo6Var = (r45.wo6) objArr[1];
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
                wo6Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            wo6Var.f389347d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            wo6Var.f389348e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            wo6Var.f389350g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.rf4 rf4Var3 = new r45.rf4();
            if (bArr2 != null && bArr2.length > 0) {
                rf4Var3.parseFrom(bArr2);
            }
            wo6Var.f389349f = rf4Var3;
        }
        return 0;
    }
}
