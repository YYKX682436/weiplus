package t45;

/* loaded from: classes2.dex */
public class w extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public t45.e f415650d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f415651e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof t45.w)) {
            return false;
        }
        t45.w wVar = (t45.w) fVar;
        return n51.f.a(this.BaseResponse, wVar.BaseResponse) && n51.f.a(this.f415650d, wVar.f415650d) && n51.f.a(java.lang.Boolean.valueOf(this.f415651e), java.lang.Boolean.valueOf(wVar.f415651e));
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
            t45.e eVar = this.f415650d;
            if (eVar != null) {
                fVar.i(2, eVar.computeSize());
                this.f415650d.writeFields(fVar);
            }
            fVar.a(3, this.f415651e);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            t45.e eVar2 = this.f415650d;
            if (eVar2 != null) {
                i18 += b36.f.i(2, eVar2.computeSize());
            }
            return i18 + b36.f.a(3, this.f415651e);
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
        t45.w wVar = (t45.w) objArr[1];
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
                wVar.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            wVar.f415651e = aVar2.c(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            t45.e eVar3 = new t45.e();
            if (bArr2 != null && bArr2.length > 0) {
                eVar3.parseFrom(bArr2);
            }
            wVar.f415650d = eVar3;
        }
        return 0;
    }
}
