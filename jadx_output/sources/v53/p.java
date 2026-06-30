package v53;

/* loaded from: classes4.dex */
public class p extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public v53.a f433358d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f433359e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof v53.p)) {
            return false;
        }
        v53.p pVar = (v53.p) fVar;
        return n51.f.a(this.BaseRequest, pVar.BaseRequest) && n51.f.a(this.f433358d, pVar.f433358d) && n51.f.a(java.lang.Boolean.valueOf(this.f433359e), java.lang.Boolean.valueOf(pVar.f433359e));
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
            v53.a aVar = this.f433358d;
            if (aVar != null) {
                fVar.i(2, aVar.computeSize());
                this.f433358d.writeFields(fVar);
            }
            fVar.a(3, this.f433359e);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            v53.a aVar2 = this.f433358d;
            if (aVar2 != null) {
                i18 += b36.f.i(2, aVar2.computeSize());
            }
            return i18 + b36.f.a(3, this.f433359e);
        }
        if (i17 == 2) {
            c36.a aVar3 = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar3); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar3)) {
                if (!super.populateBuilderWithField(aVar3, this, nextFieldNumber)) {
                    aVar3.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar4 = (c36.a) objArr[0];
        v53.p pVar = (v53.p) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar4.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr != null && bArr.length > 0) {
                    heVar3.parseFrom(bArr);
                }
                pVar.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            pVar.f433359e = aVar4.c(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar4.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            v53.a aVar5 = new v53.a();
            if (bArr2 != null && bArr2.length > 0) {
                aVar5.parseFrom(bArr2);
            }
            pVar.f433358d = aVar5;
        }
        return 0;
    }
}
