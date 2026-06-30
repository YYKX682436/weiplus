package r45;

/* loaded from: classes2.dex */
public class yu3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.yj6 f391371d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f391372e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f391373f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yu3)) {
            return false;
        }
        r45.yu3 yu3Var = (r45.yu3) fVar;
        return n51.f.a(this.BaseResponse, yu3Var.BaseResponse) && n51.f.a(this.f391371d, yu3Var.f391371d) && n51.f.a(this.f391372e, yu3Var.f391372e) && n51.f.a(this.f391373f, yu3Var.f391373f);
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
            r45.yj6 yj6Var = this.f391371d;
            if (yj6Var != null) {
                fVar.i(2, yj6Var.computeSize());
                this.f391371d.writeFields(fVar);
            }
            java.lang.String str = this.f391372e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f391373f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            r45.yj6 yj6Var2 = this.f391371d;
            if (yj6Var2 != null) {
                i18 += b36.f.i(2, yj6Var2.computeSize());
            }
            java.lang.String str3 = this.f391372e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f391373f;
            return str4 != null ? i18 + b36.f.j(4, str4) : i18;
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
        r45.yu3 yu3Var = (r45.yu3) objArr[1];
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
                yu3Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                yu3Var.f391372e = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            yu3Var.f391373f = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.yj6 yj6Var3 = new r45.yj6();
            if (bArr2 != null && bArr2.length > 0) {
                yj6Var3.parseFrom(bArr2);
            }
            yu3Var.f391371d = yj6Var3;
        }
        return 0;
    }
}
