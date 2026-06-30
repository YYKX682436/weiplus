package r45;

/* loaded from: classes4.dex */
public class qi5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f384025d;

    /* renamed from: e, reason: collision with root package name */
    public int f384026e;

    /* renamed from: f, reason: collision with root package name */
    public int f384027f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f384028g = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qi5)) {
            return false;
        }
        r45.qi5 qi5Var = (r45.qi5) fVar;
        return n51.f.a(this.BaseResponse, qi5Var.BaseResponse) && n51.f.a(this.f384025d, qi5Var.f384025d) && n51.f.a(java.lang.Integer.valueOf(this.f384026e), java.lang.Integer.valueOf(qi5Var.f384026e)) && n51.f.a(java.lang.Integer.valueOf(this.f384027f), java.lang.Integer.valueOf(qi5Var.f384027f)) && n51.f.a(this.f384028g, qi5Var.f384028g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f384028g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            java.lang.String str = this.f384025d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f384026e);
            fVar.e(4, this.f384027f);
            fVar.g(5, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str2 = this.f384025d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            return i18 + b36.f.e(3, this.f384026e) + b36.f.e(4, this.f384027f) + b36.f.g(5, 8, linkedList);
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
        r45.qi5 qi5Var = (r45.qi5) objArr[1];
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
                qi5Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            qi5Var.f384025d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            qi5Var.f384026e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            qi5Var.f384027f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr3 = (byte[]) j18.get(i27);
            r45.oi5 oi5Var = new r45.oi5();
            if (bArr3 != null && bArr3.length > 0) {
                oi5Var.parseFrom(bArr3);
            }
            qi5Var.f384028g.add(oi5Var);
        }
        return 0;
    }
}
