package r45;

/* loaded from: classes2.dex */
public class no6 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f381560d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f381561e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.no6)) {
            return false;
        }
        r45.no6 no6Var = (r45.no6) fVar;
        return n51.f.a(this.BaseResponse, no6Var.BaseResponse) && n51.f.a(this.f381560d, no6Var.f381560d) && n51.f.a(this.f381561e, no6Var.f381561e);
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
            java.lang.String str = this.f381560d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f381561e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str3 = this.f381560d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f381561e;
            return str4 != null ? i18 + b36.f.j(3, str4) : i18;
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
        r45.no6 no6Var = (r45.no6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                no6Var.f381560d = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            no6Var.f381561e = aVar2.k(intValue);
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
            no6Var.BaseResponse = ieVar3;
        }
        return 0;
    }
}
