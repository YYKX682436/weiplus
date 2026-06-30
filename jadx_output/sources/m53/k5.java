package m53;

/* loaded from: classes4.dex */
public class k5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f323850d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f323851e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f323852f;

    /* renamed from: g, reason: collision with root package name */
    public m53.s f323853g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.k5)) {
            return false;
        }
        m53.k5 k5Var = (m53.k5) fVar;
        return n51.f.a(this.BaseResponse, k5Var.BaseResponse) && n51.f.a(java.lang.Boolean.valueOf(this.f323850d), java.lang.Boolean.valueOf(k5Var.f323850d)) && n51.f.a(this.f323851e, k5Var.f323851e) && n51.f.a(this.f323852f, k5Var.f323852f) && n51.f.a(this.f323853g, k5Var.f323853g);
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
            fVar.a(2, this.f323850d);
            java.lang.String str = this.f323851e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f323852f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            m53.s sVar = this.f323853g;
            if (sVar != null) {
                fVar.i(5, sVar.computeSize());
                this.f323853g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.a(2, this.f323850d);
            java.lang.String str3 = this.f323851e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f323852f;
            if (str4 != null) {
                i18 += b36.f.j(4, str4);
            }
            m53.s sVar2 = this.f323853g;
            return sVar2 != null ? i18 + b36.f.i(5, sVar2.computeSize()) : i18;
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
        m53.k5 k5Var = (m53.k5) objArr[1];
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
                k5Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            k5Var.f323850d = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 3) {
            k5Var.f323851e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            k5Var.f323852f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            m53.s sVar3 = new m53.s();
            if (bArr2 != null && bArr2.length > 0) {
                sVar3.parseFrom(bArr2);
            }
            k5Var.f323853g = sVar3;
        }
        return 0;
    }
}
