package r45;

/* loaded from: classes2.dex */
public class mc3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f380361d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f380362e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mc3)) {
            return false;
        }
        r45.mc3 mc3Var = (r45.mc3) fVar;
        return n51.f.a(this.BaseResponse, mc3Var.BaseResponse) && n51.f.a(this.f380361d, mc3Var.f380361d) && n51.f.a(this.f380362e, mc3Var.f380362e);
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
            java.lang.String str = this.f380361d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f380362e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str3 = this.f380361d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f380362e;
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
        r45.mc3 mc3Var = (r45.mc3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                mc3Var.f380361d = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            mc3Var.f380362e = aVar2.k(intValue);
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
            mc3Var.BaseResponse = ieVar3;
        }
        return 0;
    }
}
