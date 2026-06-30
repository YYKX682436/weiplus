package v53;

/* loaded from: classes4.dex */
public class i extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f433342d;

    /* renamed from: e, reason: collision with root package name */
    public v53.c f433343e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof v53.i)) {
            return false;
        }
        v53.i iVar = (v53.i) fVar;
        return n51.f.a(this.BaseResponse, iVar.BaseResponse) && n51.f.a(this.f433342d, iVar.f433342d) && n51.f.a(this.f433343e, iVar.f433343e);
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
            java.lang.String str = this.f433342d;
            if (str != null) {
                fVar.j(2, str);
            }
            v53.c cVar = this.f433343e;
            if (cVar != null) {
                fVar.i(3, cVar.computeSize());
                this.f433343e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str2 = this.f433342d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            v53.c cVar2 = this.f433343e;
            return cVar2 != null ? i18 + b36.f.i(3, cVar2.computeSize()) : i18;
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
        v53.i iVar = (v53.i) objArr[1];
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
                iVar.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            iVar.f433342d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            v53.c cVar3 = new v53.c();
            if (bArr2 != null && bArr2.length > 0) {
                cVar3.parseFrom(bArr2);
            }
            iVar.f433343e = cVar3;
        }
        return 0;
    }
}
