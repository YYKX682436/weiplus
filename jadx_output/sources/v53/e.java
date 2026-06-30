package v53;

/* loaded from: classes4.dex */
public class e extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public v53.a f433334d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f433335e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof v53.e)) {
            return false;
        }
        v53.e eVar = (v53.e) fVar;
        return n51.f.a(this.BaseResponse, eVar.BaseResponse) && n51.f.a(this.f433334d, eVar.f433334d) && n51.f.a(java.lang.Boolean.valueOf(this.f433335e), java.lang.Boolean.valueOf(eVar.f433335e));
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
            v53.a aVar = this.f433334d;
            if (aVar != null) {
                fVar.i(2, aVar.computeSize());
                this.f433334d.writeFields(fVar);
            }
            fVar.a(3, this.f433335e);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            v53.a aVar2 = this.f433334d;
            if (aVar2 != null) {
                i18 += b36.f.i(2, aVar2.computeSize());
            }
            return i18 + b36.f.a(3, this.f433335e);
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
        v53.e eVar = (v53.e) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar4.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr != null && bArr.length > 0) {
                    ieVar3.parseFrom(bArr);
                }
                eVar.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            eVar.f433335e = aVar4.c(intValue);
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
            eVar.f433334d = aVar5;
        }
        return 0;
    }
}
