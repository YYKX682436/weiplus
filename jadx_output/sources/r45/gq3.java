package r45;

/* loaded from: classes4.dex */
public class gq3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f375479d;

    /* renamed from: e, reason: collision with root package name */
    public int f375480e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f375481f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f375482g = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gq3)) {
            return false;
        }
        r45.gq3 gq3Var = (r45.gq3) fVar;
        return n51.f.a(this.BaseResponse, gq3Var.BaseResponse) && n51.f.a(this.f375479d, gq3Var.f375479d) && n51.f.a(java.lang.Integer.valueOf(this.f375480e), java.lang.Integer.valueOf(gq3Var.f375480e)) && n51.f.a(this.f375481f, gq3Var.f375481f) && n51.f.a(this.f375482g, gq3Var.f375482g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f375482g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            java.lang.String str = this.f375479d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f375480e);
            java.lang.String str2 = this.f375481f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.g(5, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str3 = this.f375479d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            int e17 = i18 + b36.f.e(3, this.f375480e);
            java.lang.String str4 = this.f375481f;
            if (str4 != null) {
                e17 += b36.f.j(4, str4);
            }
            return e17 + b36.f.g(5, 1, linkedList);
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
        r45.gq3 gq3Var = (r45.gq3) objArr[1];
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
                gq3Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            gq3Var.f375479d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            gq3Var.f375480e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            gq3Var.f375481f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        gq3Var.f375482g.add(aVar2.k(intValue));
        return 0;
    }
}
