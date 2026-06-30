package r45;

/* loaded from: classes4.dex */
public class wf extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f389122d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public r45.cu5 f389123e;

    /* renamed from: f, reason: collision with root package name */
    public r45.mm0 f389124f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wf)) {
            return false;
        }
        r45.wf wfVar = (r45.wf) fVar;
        return n51.f.a(this.BaseRequest, wfVar.BaseRequest) && n51.f.a(this.f389122d, wfVar.f389122d) && n51.f.a(this.f389123e, wfVar.f389123e) && n51.f.a(this.f389124f, wfVar.f389124f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f389122d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            fVar.g(2, 3, linkedList);
            r45.cu5 cu5Var = this.f389123e;
            if (cu5Var != null) {
                fVar.i(4, cu5Var.computeSize());
                this.f389123e.writeFields(fVar);
            }
            r45.mm0 mm0Var = this.f389124f;
            if (mm0Var != null) {
                fVar.i(5, mm0Var.computeSize());
                this.f389124f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.g(2, 3, linkedList);
            r45.cu5 cu5Var2 = this.f389123e;
            if (cu5Var2 != null) {
                i18 += b36.f.i(4, cu5Var2.computeSize());
            }
            r45.mm0 mm0Var2 = this.f389124f;
            return mm0Var2 != null ? i18 + b36.f.i(5, mm0Var2.computeSize()) : i18;
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
        r45.wf wfVar = (r45.wf) objArr[1];
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
                wfVar.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            wfVar.f389122d.add(java.lang.Long.valueOf(aVar2.i(intValue)));
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr3 = (byte[]) j18.get(i27);
                r45.cu5 cu5Var3 = new r45.cu5();
                if (bArr3 != null && bArr3.length > 0) {
                    cu5Var3.b(bArr3);
                }
                wfVar.f389123e = cu5Var3;
            }
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr4 = (byte[]) j19.get(i28);
            r45.mm0 mm0Var3 = new r45.mm0();
            if (bArr4 != null && bArr4.length > 0) {
                mm0Var3.parseFrom(bArr4);
            }
            wfVar.f389124f = mm0Var3;
        }
        return 0;
    }
}
