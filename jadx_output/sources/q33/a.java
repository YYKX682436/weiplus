package q33;

/* loaded from: classes8.dex */
public class a extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public q33.f f359932d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f359933e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof q33.a)) {
            return false;
        }
        q33.a aVar = (q33.a) fVar;
        return n51.f.a(this.BaseRequest, aVar.BaseRequest) && n51.f.a(this.f359932d, aVar.f359932d) && n51.f.a(this.f359933e, aVar.f359933e);
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
            q33.f fVar2 = this.f359932d;
            if (fVar2 != null) {
                fVar.i(2, fVar2.computeSize());
                this.f359932d.writeFields(fVar);
            }
            java.lang.String str = this.f359933e;
            if (str != null) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            q33.f fVar3 = this.f359932d;
            if (fVar3 != null) {
                i18 += b36.f.i(2, fVar3.computeSize());
            }
            java.lang.String str2 = this.f359933e;
            return str2 != null ? i18 + b36.f.j(3, str2) : i18;
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
        q33.a aVar3 = (q33.a) objArr[1];
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
                aVar3.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            aVar3.f359933e = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            q33.f fVar4 = new q33.f();
            if (bArr2 != null && bArr2.length > 0) {
                fVar4.parseFrom(bArr2);
            }
            aVar3.f359932d = fVar4;
        }
        return 0;
    }
}
