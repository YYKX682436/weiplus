package r45;

/* loaded from: classes8.dex */
public class x45 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f389772d;

    /* renamed from: e, reason: collision with root package name */
    public r45.z45 f389773e;

    /* renamed from: f, reason: collision with root package name */
    public int f389774f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f389775g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.x45)) {
            return false;
        }
        r45.x45 x45Var = (r45.x45) fVar;
        return n51.f.a(this.BaseRequest, x45Var.BaseRequest) && n51.f.a(this.f389772d, x45Var.f389772d) && n51.f.a(this.f389773e, x45Var.f389773e) && n51.f.a(java.lang.Integer.valueOf(this.f389774f), java.lang.Integer.valueOf(x45Var.f389774f)) && n51.f.a(this.f389775g, x45Var.f389775g);
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
            java.lang.String str = this.f389772d;
            if (str != null) {
                fVar.j(2, str);
            }
            r45.z45 z45Var = this.f389773e;
            if (z45Var != null) {
                fVar.i(3, z45Var.computeSize());
                this.f389773e.writeFields(fVar);
            }
            fVar.e(4, this.f389774f);
            com.tencent.mm.protobuf.g gVar = this.f389775g;
            if (gVar != null) {
                fVar.b(5, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str2 = this.f389772d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            r45.z45 z45Var2 = this.f389773e;
            if (z45Var2 != null) {
                i18 += b36.f.i(3, z45Var2.computeSize());
            }
            int e17 = i18 + b36.f.e(4, this.f389774f);
            com.tencent.mm.protobuf.g gVar2 = this.f389775g;
            return gVar2 != null ? e17 + b36.f.b(5, gVar2) : e17;
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
        r45.x45 x45Var = (r45.x45) objArr[1];
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
                x45Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            x45Var.f389772d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            if (intValue == 4) {
                x45Var.f389774f = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            x45Var.f389775g = aVar2.d(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.z45 z45Var3 = new r45.z45();
            if (bArr2 != null && bArr2.length > 0) {
                z45Var3.parseFrom(bArr2);
            }
            x45Var.f389773e = z45Var3;
        }
        return 0;
    }
}
