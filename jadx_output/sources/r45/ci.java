package r45;

/* loaded from: classes2.dex */
public class ci extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f371562d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f371563e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f371564f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ci)) {
            return false;
        }
        r45.ci ciVar = (r45.ci) fVar;
        return n51.f.a(this.BaseResponse, ciVar.BaseResponse) && n51.f.a(this.f371562d, ciVar.f371562d) && n51.f.a(this.f371563e, ciVar.f371563e) && n51.f.a(this.f371564f, ciVar.f371564f);
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
            java.lang.String str = this.f371562d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f371563e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f371564f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str4 = this.f371562d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f371563e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f371564f;
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
        r45.ci ciVar = (r45.ci) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                ciVar.f371562d = aVar2.k(intValue);
                return 0;
            }
            if (intValue == 3) {
                ciVar.f371563e = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            ciVar.f371564f = aVar2.k(intValue);
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
            ciVar.BaseResponse = ieVar3;
        }
        return 0;
    }
}
