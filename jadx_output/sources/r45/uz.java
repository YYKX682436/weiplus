package r45;

/* loaded from: classes4.dex */
public class uz extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f387743d;

    /* renamed from: e, reason: collision with root package name */
    public int f387744e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f387745f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f387746g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.uz)) {
            return false;
        }
        r45.uz uzVar = (r45.uz) fVar;
        return n51.f.a(this.BaseResponse, uzVar.BaseResponse) && n51.f.a(this.f387743d, uzVar.f387743d) && n51.f.a(java.lang.Integer.valueOf(this.f387744e), java.lang.Integer.valueOf(uzVar.f387744e)) && n51.f.a(this.f387745f, uzVar.f387745f) && n51.f.a(this.f387746g, uzVar.f387746g);
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
            java.lang.String str = this.f387743d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f387744e);
            java.lang.String str2 = this.f387745f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f387746g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str4 = this.f387743d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            int e17 = i18 + b36.f.e(3, this.f387744e);
            java.lang.String str5 = this.f387745f;
            if (str5 != null) {
                e17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f387746g;
            return str6 != null ? e17 + b36.f.j(5, str6) : e17;
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
        r45.uz uzVar = (r45.uz) objArr[1];
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
                uzVar.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            uzVar.f387743d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            uzVar.f387744e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            uzVar.f387745f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        uzVar.f387746g = aVar2.k(intValue);
        return 0;
    }
}
