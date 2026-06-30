package r45;

/* loaded from: classes2.dex */
public class ue4 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f387299d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f387300e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f387301f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ue4)) {
            return false;
        }
        r45.ue4 ue4Var = (r45.ue4) fVar;
        return n51.f.a(this.BaseRequest, ue4Var.BaseRequest) && n51.f.a(this.f387299d, ue4Var.f387299d) && n51.f.a(this.f387300e, ue4Var.f387300e) && n51.f.a(this.f387301f, ue4Var.f387301f);
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
            java.lang.String str = this.f387299d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f387300e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f387301f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str4 = this.f387299d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f387300e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f387301f;
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
        r45.ue4 ue4Var = (r45.ue4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                ue4Var.f387299d = aVar2.k(intValue);
                return 0;
            }
            if (intValue == 3) {
                ue4Var.f387300e = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            ue4Var.f387301f = aVar2.k(intValue);
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
            ue4Var.BaseRequest = heVar3;
        }
        return 0;
    }
}
