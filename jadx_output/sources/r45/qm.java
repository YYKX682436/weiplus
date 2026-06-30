package r45;

/* loaded from: classes2.dex */
public class qm extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f384090d;

    /* renamed from: e, reason: collision with root package name */
    public r45.dz6 f384091e;

    /* renamed from: f, reason: collision with root package name */
    public r45.tl f384092f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qm)) {
            return false;
        }
        r45.qm qmVar = (r45.qm) fVar;
        return n51.f.a(this.BaseRequest, qmVar.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f384090d), java.lang.Integer.valueOf(qmVar.f384090d)) && n51.f.a(this.f384091e, qmVar.f384091e) && n51.f.a(this.f384092f, qmVar.f384092f);
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
            fVar.e(2, this.f384090d);
            r45.dz6 dz6Var = this.f384091e;
            if (dz6Var != null) {
                fVar.i(3, dz6Var.computeSize());
                this.f384091e.writeFields(fVar);
            }
            r45.tl tlVar = this.f384092f;
            if (tlVar != null) {
                fVar.i(4, tlVar.computeSize());
                this.f384092f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f384090d);
            r45.dz6 dz6Var2 = this.f384091e;
            if (dz6Var2 != null) {
                i18 += b36.f.i(3, dz6Var2.computeSize());
            }
            r45.tl tlVar2 = this.f384092f;
            return tlVar2 != null ? i18 + b36.f.i(4, tlVar2.computeSize()) : i18;
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
        r45.qm qmVar = (r45.qm) objArr[1];
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
                qmVar.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            qmVar.f384090d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.dz6 dz6Var3 = new r45.dz6();
                if (bArr2 != null && bArr2.length > 0) {
                    dz6Var3.parseFrom(bArr2);
                }
                qmVar.f384091e = dz6Var3;
            }
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            r45.tl tlVar3 = new r45.tl();
            if (bArr3 != null && bArr3.length > 0) {
                tlVar3.parseFrom(bArr3);
            }
            qmVar.f384092f = tlVar3;
        }
        return 0;
    }
}
