package r45;

/* loaded from: classes2.dex */
public class qv5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.ae f384300d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f384301e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f384302f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public int f384303g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qv5)) {
            return false;
        }
        r45.qv5 qv5Var = (r45.qv5) fVar;
        return n51.f.a(this.BaseRequest, qv5Var.BaseRequest) && n51.f.a(this.f384300d, qv5Var.f384300d) && n51.f.a(this.f384301e, qv5Var.f384301e) && n51.f.a(this.f384302f, qv5Var.f384302f) && n51.f.a(java.lang.Integer.valueOf(this.f384303g), java.lang.Integer.valueOf(qv5Var.f384303g));
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
            r45.ae aeVar = this.f384300d;
            if (aeVar != null) {
                fVar.i(2, aeVar.computeSize());
                this.f384300d.writeFields(fVar);
            }
            java.lang.String str = this.f384301e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.g(4, 1, this.f384302f);
            fVar.e(5, this.f384303g);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            r45.ae aeVar2 = this.f384300d;
            if (aeVar2 != null) {
                i18 += b36.f.i(2, aeVar2.computeSize());
            }
            java.lang.String str2 = this.f384301e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            return i18 + b36.f.g(4, 1, this.f384302f) + b36.f.e(5, this.f384303g);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f384302f.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.qv5 qv5Var = (r45.qv5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr2 != null && bArr2.length > 0) {
                    heVar3.parseFrom(bArr2);
                }
                qv5Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                qv5Var.f384301e = aVar2.k(intValue);
                return 0;
            }
            if (intValue == 4) {
                qv5Var.f384302f.add(aVar2.k(intValue));
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            qv5Var.f384303g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr3 = (byte[]) j18.get(i27);
            r45.ae aeVar3 = new r45.ae();
            if (bArr3 != null && bArr3.length > 0) {
                aeVar3.parseFrom(bArr3);
            }
            qv5Var.f384300d = aeVar3;
        }
        return 0;
    }
}
