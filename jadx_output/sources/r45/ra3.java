package r45;

/* loaded from: classes2.dex */
public class ra3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f384690d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public int f384691e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f384692f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f384693g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ra3)) {
            return false;
        }
        r45.ra3 ra3Var = (r45.ra3) fVar;
        return n51.f.a(this.BaseResponse, ra3Var.BaseResponse) && n51.f.a(this.f384690d, ra3Var.f384690d) && n51.f.a(java.lang.Integer.valueOf(this.f384691e), java.lang.Integer.valueOf(ra3Var.f384691e)) && n51.f.a(this.f384692f, ra3Var.f384692f) && n51.f.a(this.f384693g, ra3Var.f384693g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f384690d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.g(2, 1, linkedList);
            fVar.e(3, this.f384691e);
            java.lang.String str = this.f384692f;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f384693g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.g(2, 1, linkedList) + b36.f.e(3, this.f384691e);
            java.lang.String str3 = this.f384692f;
            if (str3 != null) {
                i18 += b36.f.j(4, str3);
            }
            java.lang.String str4 = this.f384693g;
            return str4 != null ? i18 + b36.f.j(5, str4) : i18;
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
        r45.ra3 ra3Var = (r45.ra3) objArr[1];
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
                ra3Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            ra3Var.f384690d.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue == 3) {
            ra3Var.f384691e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            ra3Var.f384692f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        ra3Var.f384693g = aVar2.k(intValue);
        return 0;
    }
}
