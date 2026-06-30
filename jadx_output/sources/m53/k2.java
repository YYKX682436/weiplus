package m53;

/* loaded from: classes7.dex */
public class k2 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public m53.u3 f323837d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f323838e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public boolean f323839f;

    /* renamed from: g, reason: collision with root package name */
    public int f323840g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.k2)) {
            return false;
        }
        m53.k2 k2Var = (m53.k2) fVar;
        return n51.f.a(this.BaseResponse, k2Var.BaseResponse) && n51.f.a(this.f323837d, k2Var.f323837d) && n51.f.a(this.f323838e, k2Var.f323838e) && n51.f.a(java.lang.Boolean.valueOf(this.f323839f), java.lang.Boolean.valueOf(k2Var.f323839f)) && n51.f.a(java.lang.Integer.valueOf(this.f323840g), java.lang.Integer.valueOf(k2Var.f323840g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f323838e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            m53.u3 u3Var = this.f323837d;
            if (u3Var != null) {
                fVar.i(2, u3Var.computeSize());
                this.f323837d.writeFields(fVar);
            }
            fVar.g(3, 8, linkedList);
            fVar.a(4, this.f323839f);
            fVar.e(5, this.f323840g);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            m53.u3 u3Var2 = this.f323837d;
            if (u3Var2 != null) {
                i18 += b36.f.i(2, u3Var2.computeSize());
            }
            return i18 + b36.f.g(3, 8, linkedList) + b36.f.a(4, this.f323839f) + b36.f.e(5, this.f323840g);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        m53.k2 k2Var = (m53.k2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr2 != null && bArr2.length > 0) {
                    ieVar3.parseFrom(bArr2);
                }
                k2Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr3 = (byte[]) j18.get(i27);
                m53.u3 u3Var3 = new m53.u3();
                if (bArr3 != null && bArr3.length > 0) {
                    u3Var3.parseFrom(bArr3);
                }
                k2Var.f323837d = u3Var3;
            }
            return 0;
        }
        if (intValue != 3) {
            if (intValue == 4) {
                k2Var.f323839f = aVar2.c(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            k2Var.f323840g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr4 = (byte[]) j19.get(i28);
            m53.f fVar2 = new m53.f();
            if (bArr4 != null && bArr4.length > 0) {
                fVar2.parseFrom(bArr4);
            }
            k2Var.f323838e.add(fVar2);
        }
        return 0;
    }
}
