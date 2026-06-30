package r45;

/* loaded from: classes4.dex */
public class bv5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f371084d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f371085e;

    /* renamed from: f, reason: collision with root package name */
    public r45.vi f371086f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bv5)) {
            return false;
        }
        r45.bv5 bv5Var = (r45.bv5) fVar;
        return n51.f.a(this.BaseRequest, bv5Var.BaseRequest) && n51.f.a(this.f371084d, bv5Var.f371084d) && n51.f.a(java.lang.Boolean.valueOf(this.f371085e), java.lang.Boolean.valueOf(bv5Var.f371085e)) && n51.f.a(this.f371086f, bv5Var.f371086f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f371084d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            fVar.g(2, 1, linkedList);
            fVar.a(3, this.f371085e);
            r45.vi viVar = this.f371086f;
            if (viVar != null) {
                fVar.i(4, viVar.computeSize());
                this.f371086f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.g(2, 1, linkedList) + b36.f.a(3, this.f371085e);
            r45.vi viVar2 = this.f371086f;
            return viVar2 != null ? i18 + b36.f.i(4, viVar2.computeSize()) : i18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
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
        r45.bv5 bv5Var = (r45.bv5) objArr[1];
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
                bv5Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            bv5Var.f371084d.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue == 3) {
            bv5Var.f371085e = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr3 = (byte[]) j18.get(i27);
            r45.vi viVar3 = new r45.vi();
            if (bArr3 != null && bArr3.length > 0) {
                viVar3.parseFrom(bArr3);
            }
            bv5Var.f371086f = viVar3;
        }
        return 0;
    }
}
