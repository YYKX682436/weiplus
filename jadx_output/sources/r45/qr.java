package r45;

/* loaded from: classes12.dex */
public class qr extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f384216d;

    /* renamed from: e, reason: collision with root package name */
    public r45.fr f384217e;

    public com.tencent.mm.modelbase.i b() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 3862;
        lVar.f70666c = "/cgi-bin/micromsg-bin/bypsend";
        lVar.f70664a = this;
        lVar.f70665b = new r45.rr();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        com.tencent.mm.modelbase.i iVar = new com.tencent.mm.modelbase.i();
        iVar.p(a17);
        return iVar;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qr)) {
            return false;
        }
        r45.qr qrVar = (r45.qr) fVar;
        return n51.f.a(this.BaseRequest, qrVar.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f384216d), java.lang.Integer.valueOf(qrVar.f384216d)) && n51.f.a(this.f384217e, qrVar.f384217e);
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
            fVar.e(2, this.f384216d);
            r45.fr frVar = this.f384217e;
            if (frVar != null) {
                fVar.i(3, frVar.computeSize());
                this.f384217e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f384216d);
            r45.fr frVar2 = this.f384217e;
            return frVar2 != null ? i18 + b36.f.i(3, frVar2.computeSize()) : i18;
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
        r45.qr qrVar = (r45.qr) objArr[1];
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
                qrVar.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            qrVar.f384216d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.fr frVar3 = new r45.fr();
            if (bArr2 != null && bArr2.length > 0) {
                frVar3.parseFrom(bArr2);
            }
            qrVar.f384217e = frVar3;
        }
        return 0;
    }
}
