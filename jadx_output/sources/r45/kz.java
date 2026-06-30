package r45;

/* loaded from: classes2.dex */
public class kz extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f379041d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f379042e = "ok";

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.kz)) {
            return false;
        }
        r45.kz kzVar = (r45.kz) fVar;
        return n51.f.a(this.BaseResponse, kzVar.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f379041d), java.lang.Integer.valueOf(kzVar.f379041d)) && n51.f.a(this.f379042e, kzVar.f379042e);
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
            fVar.e(2, this.f379041d);
            java.lang.String str = this.f379042e;
            if (str != null) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f379041d);
            java.lang.String str2 = this.f379042e;
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
        r45.kz kzVar = (r45.kz) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                kzVar.f379041d = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            kzVar.f379042e = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            r45.ie ieVar3 = new r45.ie();
            if (bArr != null && bArr.length > 0) {
                ieVar3.parseFrom(bArr);
            }
            kzVar.BaseResponse = ieVar3;
        }
        return 0;
    }
}
