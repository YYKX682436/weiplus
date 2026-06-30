package r45;

/* loaded from: classes8.dex */
public class so extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f385875d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f385876e;

    /* renamed from: f, reason: collision with root package name */
    public r45.eq f385877f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.so)) {
            return false;
        }
        r45.so soVar = (r45.so) fVar;
        return n51.f.a(this.BaseResponse, soVar.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f385875d), java.lang.Integer.valueOf(soVar.f385875d)) && n51.f.a(this.f385876e, soVar.f385876e) && n51.f.a(this.f385877f, soVar.f385877f);
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
            fVar.e(2, this.f385875d);
            java.lang.String str = this.f385876e;
            if (str != null) {
                fVar.j(3, str);
            }
            r45.eq eqVar = this.f385877f;
            if (eqVar != null) {
                fVar.i(4, eqVar.computeSize());
                this.f385877f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f385875d);
            java.lang.String str2 = this.f385876e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            r45.eq eqVar2 = this.f385877f;
            return eqVar2 != null ? i18 + b36.f.i(4, eqVar2.computeSize()) : i18;
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
        r45.so soVar = (r45.so) objArr[1];
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
                soVar.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            soVar.f385875d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            soVar.f385876e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.eq eqVar3 = new r45.eq();
            if (bArr2 != null && bArr2.length > 0) {
                eqVar3.parseFrom(bArr2);
            }
            soVar.f385877f = eqVar3;
        }
        return 0;
    }
}
