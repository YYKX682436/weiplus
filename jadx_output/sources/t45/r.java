package t45;

/* loaded from: classes2.dex */
public class r extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public t45.p f415635d;

    /* renamed from: e, reason: collision with root package name */
    public t45.q f415636e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof t45.r)) {
            return false;
        }
        t45.r rVar = (t45.r) fVar;
        return n51.f.a(this.BaseResponse, rVar.BaseResponse) && n51.f.a(this.f415635d, rVar.f415635d) && n51.f.a(this.f415636e, rVar.f415636e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            t45.p pVar = this.f415635d;
            if (pVar != null) {
                fVar.i(2, pVar.computeSize());
                this.f415635d.writeFields(fVar);
            }
            t45.q qVar = this.f415636e;
            if (qVar != null) {
                fVar.i(3, qVar.computeSize());
                this.f415636e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            t45.p pVar2 = this.f415635d;
            if (pVar2 != null) {
                i18 += b36.f.i(2, pVar2.computeSize());
            }
            t45.q qVar2 = this.f415636e;
            return qVar2 != null ? i18 + b36.f.i(3, qVar2.computeSize()) : i18;
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
        t45.r rVar = (t45.r) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr != null && bArr.length > 0) {
                    ieVar3.parseFrom(bArr);
                }
                rVar.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                t45.p pVar3 = new t45.p();
                if (bArr2 != null && bArr2.length > 0) {
                    pVar3.parseFrom(bArr2);
                }
                rVar.f415635d = pVar3;
            }
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            t45.q qVar3 = new t45.q();
            if (bArr3 != null && bArr3.length > 0) {
                qVar3.parseFrom(bArr3);
            }
            rVar.f415636e = qVar3;
        }
        return 0;
    }
}
