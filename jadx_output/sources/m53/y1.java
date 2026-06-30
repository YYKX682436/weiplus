package m53;

/* loaded from: classes8.dex */
public class y1 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f324200d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f324201e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f324202f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f324203g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.y1)) {
            return false;
        }
        m53.y1 y1Var = (m53.y1) fVar;
        return n51.f.a(this.BaseResponse, y1Var.BaseResponse) && n51.f.a(this.f324200d, y1Var.f324200d) && n51.f.a(this.f324201e, y1Var.f324201e) && n51.f.a(java.lang.Boolean.valueOf(this.f324202f), java.lang.Boolean.valueOf(y1Var.f324202f)) && n51.f.a(this.f324203g, y1Var.f324203g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f324200d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList);
            com.tencent.mm.protobuf.g gVar = this.f324201e;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            fVar.a(4, this.f324202f);
            java.lang.String str = this.f324203g;
            if (str != null) {
                fVar.j(5, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.g(2, 8, linkedList);
            com.tencent.mm.protobuf.g gVar2 = this.f324201e;
            if (gVar2 != null) {
                i18 += b36.f.b(3, gVar2);
            }
            int a17 = i18 + b36.f.a(4, this.f324202f);
            java.lang.String str2 = this.f324203g;
            return str2 != null ? a17 + b36.f.j(5, str2) : a17;
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
        m53.y1 y1Var = (m53.y1) objArr[1];
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
                y1Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                y1Var.f324201e = aVar2.d(intValue);
                return 0;
            }
            if (intValue == 4) {
                y1Var.f324202f = aVar2.c(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            y1Var.f324203g = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr3 = (byte[]) j18.get(i27);
            m53.y0 y0Var = new m53.y0();
            if (bArr3 != null && bArr3.length > 0) {
                y0Var.parseFrom(bArr3);
            }
            y1Var.f324200d.add(y0Var);
        }
        return 0;
    }
}
