package r45;

/* loaded from: classes4.dex */
public class ra extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f384683d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f384684e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f384685f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ra)) {
            return false;
        }
        r45.ra raVar = (r45.ra) fVar;
        return n51.f.a(this.BaseRequest, raVar.BaseRequest) && n51.f.a(this.f384683d, raVar.f384683d) && n51.f.a(this.f384684e, raVar.f384684e) && n51.f.a(this.f384685f, raVar.f384685f);
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
            java.lang.String str = this.f384683d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f384684e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f384685f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str4 = this.f384683d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f384684e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f384685f;
            return str6 != null ? i18 + b36.f.j(4, str6) : i18;
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
        r45.ra raVar = (r45.ra) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                raVar.f384683d = aVar2.k(intValue);
                return 0;
            }
            if (intValue == 3) {
                raVar.f384684e = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            raVar.f384685f = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            r45.he heVar3 = new r45.he();
            if (bArr != null && bArr.length > 0) {
                heVar3.parseFrom(bArr);
            }
            raVar.BaseRequest = heVar3;
        }
        return 0;
    }
}
