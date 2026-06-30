package r45;

/* loaded from: classes4.dex */
public class nz extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f381771d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f381772e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f381773f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.nz)) {
            return false;
        }
        r45.nz nzVar = (r45.nz) fVar;
        return n51.f.a(this.BaseRequest, nzVar.BaseRequest) && n51.f.a(this.f381771d, nzVar.f381771d) && n51.f.a(this.f381772e, nzVar.f381772e) && n51.f.a(this.f381773f, nzVar.f381773f);
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
            java.lang.String str = this.f381771d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f381772e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f381773f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str4 = this.f381771d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f381772e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f381773f;
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
        r45.nz nzVar = (r45.nz) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                nzVar.f381771d = aVar2.k(intValue);
                return 0;
            }
            if (intValue == 3) {
                nzVar.f381772e = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            nzVar.f381773f = aVar2.k(intValue);
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
            nzVar.BaseRequest = heVar3;
        }
        return 0;
    }
}
