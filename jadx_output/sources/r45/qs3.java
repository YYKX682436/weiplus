package r45;

/* loaded from: classes7.dex */
public class qs3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f384245d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f384246e;

    /* renamed from: f, reason: collision with root package name */
    public r45.id7 f384247f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qs3)) {
            return false;
        }
        r45.qs3 qs3Var = (r45.qs3) fVar;
        return n51.f.a(this.BaseRequest, qs3Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f384245d), java.lang.Integer.valueOf(qs3Var.f384245d)) && n51.f.a(this.f384246e, qs3Var.f384246e) && n51.f.a(this.f384247f, qs3Var.f384247f);
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
            fVar.e(2, this.f384245d);
            java.lang.String str = this.f384246e;
            if (str != null) {
                fVar.j(3, str);
            }
            r45.id7 id7Var = this.f384247f;
            if (id7Var != null) {
                fVar.i(4, id7Var.computeSize());
                this.f384247f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f384245d);
            java.lang.String str2 = this.f384246e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            r45.id7 id7Var2 = this.f384247f;
            return id7Var2 != null ? i18 + b36.f.i(4, id7Var2.computeSize()) : i18;
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
        r45.qs3 qs3Var = (r45.qs3) objArr[1];
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
                qs3Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            qs3Var.f384245d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            qs3Var.f384246e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.id7 id7Var3 = new r45.id7();
            if (bArr2 != null && bArr2.length > 0) {
                id7Var3.parseFrom(bArr2);
            }
            qs3Var.f384247f = id7Var3;
        }
        return 0;
    }
}
