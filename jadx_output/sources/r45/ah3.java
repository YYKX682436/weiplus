package r45;

/* loaded from: classes8.dex */
public class ah3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f370008d;

    /* renamed from: e, reason: collision with root package name */
    public r45.z55 f370009e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f370010f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ah3)) {
            return false;
        }
        r45.ah3 ah3Var = (r45.ah3) fVar;
        return n51.f.a(this.BaseRequest, ah3Var.BaseRequest) && n51.f.a(this.f370008d, ah3Var.f370008d) && n51.f.a(this.f370009e, ah3Var.f370009e) && n51.f.a(java.lang.Boolean.valueOf(this.f370010f), java.lang.Boolean.valueOf(ah3Var.f370010f));
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
            java.lang.String str = this.f370008d;
            if (str != null) {
                fVar.j(2, str);
            }
            r45.z55 z55Var = this.f370009e;
            if (z55Var != null) {
                fVar.i(3, z55Var.computeSize());
                this.f370009e.writeFields(fVar);
            }
            fVar.a(4, this.f370010f);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str2 = this.f370008d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            r45.z55 z55Var2 = this.f370009e;
            if (z55Var2 != null) {
                i18 += b36.f.i(3, z55Var2.computeSize());
            }
            return i18 + b36.f.a(4, this.f370010f);
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
        r45.ah3 ah3Var = (r45.ah3) objArr[1];
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
                ah3Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            ah3Var.f370008d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            ah3Var.f370010f = aVar2.c(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.z55 z55Var3 = new r45.z55();
            if (bArr2 != null && bArr2.length > 0) {
                z55Var3.parseFrom(bArr2);
            }
            ah3Var.f370009e = z55Var3;
        }
        return 0;
    }
}
