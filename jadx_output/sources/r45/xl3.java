package r45;

/* loaded from: classes8.dex */
public class xl3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f390211d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f390212e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f390213f;

    /* renamed from: g, reason: collision with root package name */
    public int f390214g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xl3)) {
            return false;
        }
        r45.xl3 xl3Var = (r45.xl3) fVar;
        return n51.f.a(this.BaseResponse, xl3Var.BaseResponse) && n51.f.a(this.f390211d, xl3Var.f390211d) && n51.f.a(this.f390212e, xl3Var.f390212e) && n51.f.a(this.f390213f, xl3Var.f390213f) && n51.f.a(java.lang.Integer.valueOf(this.f390214g), java.lang.Integer.valueOf(xl3Var.f390214g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f390211d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList);
            java.lang.String str = this.f390212e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f390213f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.f390214g);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.g(2, 8, linkedList);
            java.lang.String str3 = this.f390212e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f390213f;
            if (str4 != null) {
                i18 += b36.f.j(4, str4);
            }
            return i18 + b36.f.e(5, this.f390214g);
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
        r45.xl3 xl3Var = (r45.xl3) objArr[1];
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
                xl3Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                xl3Var.f390212e = aVar2.k(intValue);
                return 0;
            }
            if (intValue == 4) {
                xl3Var.f390213f = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            xl3Var.f390214g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr3 = (byte[]) j18.get(i27);
            r45.el5 el5Var = new r45.el5();
            if (bArr3 != null && bArr3.length > 0) {
                el5Var.parseFrom(bArr3);
            }
            xl3Var.f390211d.add(el5Var);
        }
        return 0;
    }
}
