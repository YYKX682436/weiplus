package r45;

/* loaded from: classes8.dex */
public class pv3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.nv3 f383415d;

    /* renamed from: e, reason: collision with root package name */
    public int f383416e;

    /* renamed from: f, reason: collision with root package name */
    public r45.cu5 f383417f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pv3)) {
            return false;
        }
        r45.pv3 pv3Var = (r45.pv3) fVar;
        return n51.f.a(this.BaseRequest, pv3Var.BaseRequest) && n51.f.a(this.f383415d, pv3Var.f383415d) && n51.f.a(java.lang.Integer.valueOf(this.f383416e), java.lang.Integer.valueOf(pv3Var.f383416e)) && n51.f.a(this.f383417f, pv3Var.f383417f);
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
            r45.nv3 nv3Var = this.f383415d;
            if (nv3Var != null) {
                fVar.i(2, nv3Var.computeSize());
                this.f383415d.writeFields(fVar);
            }
            fVar.e(3, this.f383416e);
            r45.cu5 cu5Var = this.f383417f;
            if (cu5Var != null) {
                fVar.i(4, cu5Var.computeSize());
                this.f383417f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            r45.nv3 nv3Var2 = this.f383415d;
            if (nv3Var2 != null) {
                i18 += b36.f.i(2, nv3Var2.computeSize());
            }
            int e17 = i18 + b36.f.e(3, this.f383416e);
            r45.cu5 cu5Var2 = this.f383417f;
            return cu5Var2 != null ? e17 + b36.f.i(4, cu5Var2.computeSize()) : e17;
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
        r45.pv3 pv3Var = (r45.pv3) objArr[1];
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
                pv3Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.nv3 nv3Var3 = new r45.nv3();
                if (bArr2 != null && bArr2.length > 0) {
                    nv3Var3.parseFrom(bArr2);
                }
                pv3Var.f383415d = nv3Var3;
            }
            return 0;
        }
        if (intValue == 3) {
            pv3Var.f383416e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            r45.cu5 cu5Var3 = new r45.cu5();
            if (bArr3 != null && bArr3.length > 0) {
                cu5Var3.b(bArr3);
            }
            pv3Var.f383417f = cu5Var3;
        }
        return 0;
    }
}
