package r45;

/* loaded from: classes4.dex */
public class vx extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f388630d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f388631e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f388632f;

    /* renamed from: g, reason: collision with root package name */
    public r45.v56 f388633g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vx)) {
            return false;
        }
        r45.vx vxVar = (r45.vx) fVar;
        return n51.f.a(this.BaseResponse, vxVar.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f388630d), java.lang.Integer.valueOf(vxVar.f388630d)) && n51.f.a(this.f388631e, vxVar.f388631e) && n51.f.a(this.f388632f, vxVar.f388632f) && n51.f.a(this.f388633g, vxVar.f388633g);
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
            fVar.e(2, this.f388630d);
            java.lang.String str = this.f388631e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f388632f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            r45.v56 v56Var = this.f388633g;
            if (v56Var != null) {
                fVar.i(5, v56Var.computeSize());
                this.f388633g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f388630d);
            java.lang.String str3 = this.f388631e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f388632f;
            if (str4 != null) {
                i18 += b36.f.j(4, str4);
            }
            r45.v56 v56Var2 = this.f388633g;
            return v56Var2 != null ? i18 + b36.f.i(5, v56Var2.computeSize()) : i18;
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
        r45.vx vxVar = (r45.vx) objArr[1];
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
                vxVar.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            vxVar.f388630d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            vxVar.f388631e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            vxVar.f388632f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.v56 v56Var3 = new r45.v56();
            if (bArr2 != null && bArr2.length > 0) {
                v56Var3.parseFrom(bArr2);
            }
            vxVar.f388633g = v56Var3;
        }
        return 0;
    }
}
