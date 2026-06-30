package r45;

/* loaded from: classes2.dex */
public class bi4 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f370781d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public int f370782e;

    /* renamed from: f, reason: collision with root package name */
    public r45.xq0 f370783f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bi4)) {
            return false;
        }
        r45.bi4 bi4Var = (r45.bi4) fVar;
        return n51.f.a(this.BaseResponse, bi4Var.BaseResponse) && n51.f.a(this.f370781d, bi4Var.f370781d) && n51.f.a(java.lang.Integer.valueOf(this.f370782e), java.lang.Integer.valueOf(bi4Var.f370782e)) && n51.f.a(this.f370783f, bi4Var.f370783f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f370781d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList);
            fVar.e(3, this.f370782e);
            r45.xq0 xq0Var = this.f370783f;
            if (xq0Var != null) {
                fVar.i(4, xq0Var.computeSize());
                this.f370783f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.g(2, 8, linkedList) + b36.f.e(3, this.f370782e);
            r45.xq0 xq0Var2 = this.f370783f;
            return xq0Var2 != null ? i18 + b36.f.i(4, xq0Var2.computeSize()) : i18;
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
        r45.bi4 bi4Var = (r45.bi4) objArr[1];
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
                bi4Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr3 = (byte[]) j18.get(i27);
                r45.e66 e66Var = new r45.e66();
                if (bArr3 != null && bArr3.length > 0) {
                    e66Var.parseFrom(bArr3);
                }
                bi4Var.f370781d.add(e66Var);
            }
            return 0;
        }
        if (intValue == 3) {
            bi4Var.f370782e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr4 = (byte[]) j19.get(i28);
            r45.xq0 xq0Var3 = new r45.xq0();
            if (bArr4 != null && bArr4.length > 0) {
                xq0Var3.parseFrom(bArr4);
            }
            bi4Var.f370783f = xq0Var3;
        }
        return 0;
    }
}
