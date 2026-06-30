package r45;

/* loaded from: classes4.dex */
public class fv5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f374625d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public int f374626e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f374627f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f374628g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fv5)) {
            return false;
        }
        r45.fv5 fv5Var = (r45.fv5) fVar;
        return n51.f.a(this.BaseResponse, fv5Var.BaseResponse) && n51.f.a(this.f374625d, fv5Var.f374625d) && n51.f.a(java.lang.Integer.valueOf(this.f374626e), java.lang.Integer.valueOf(fv5Var.f374626e)) && n51.f.a(java.lang.Boolean.valueOf(this.f374627f), java.lang.Boolean.valueOf(fv5Var.f374627f)) && n51.f.a(this.f374628g, fv5Var.f374628g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f374625d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList);
            fVar.e(3, this.f374626e);
            fVar.a(4, this.f374627f);
            java.lang.String str = this.f374628g;
            if (str != null) {
                fVar.j(5, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.g(2, 8, linkedList) + b36.f.e(3, this.f374626e) + b36.f.a(4, this.f374627f);
            java.lang.String str2 = this.f374628g;
            return str2 != null ? i18 + b36.f.j(5, str2) : i18;
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
        r45.fv5 fv5Var = (r45.fv5) objArr[1];
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
                fv5Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                fv5Var.f374626e = aVar2.g(intValue);
                return 0;
            }
            if (intValue == 4) {
                fv5Var.f374627f = aVar2.c(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            fv5Var.f374628g = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr3 = (byte[]) j18.get(i27);
            r45.ri riVar = new r45.ri();
            if (bArr3 != null && bArr3.length > 0) {
                riVar.parseFrom(bArr3);
            }
            fv5Var.f374625d.add(riVar);
        }
        return 0;
    }
}
