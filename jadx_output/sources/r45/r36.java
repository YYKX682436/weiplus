package r45;

/* loaded from: classes8.dex */
public class r36 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f384507d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f384508e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f384509f;

    /* renamed from: g, reason: collision with root package name */
    public int f384510g;

    /* renamed from: h, reason: collision with root package name */
    public int f384511h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.r36)) {
            return false;
        }
        r45.r36 r36Var = (r45.r36) fVar;
        return n51.f.a(this.BaseResponse, r36Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f384507d), java.lang.Integer.valueOf(r36Var.f384507d)) && n51.f.a(this.f384508e, r36Var.f384508e) && n51.f.a(this.f384509f, r36Var.f384509f) && n51.f.a(java.lang.Integer.valueOf(this.f384510g), java.lang.Integer.valueOf(r36Var.f384510g)) && n51.f.a(java.lang.Integer.valueOf(this.f384511h), java.lang.Integer.valueOf(r36Var.f384511h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f384508e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f384507d);
            fVar.g(3, 8, linkedList);
            java.lang.String str = this.f384509f;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.e(5, this.f384510g);
            fVar.e(6, this.f384511h);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f384507d) + b36.f.g(3, 8, linkedList);
            java.lang.String str2 = this.f384509f;
            if (str2 != null) {
                i18 += b36.f.j(4, str2);
            }
            return i18 + b36.f.e(5, this.f384510g) + b36.f.e(6, this.f384511h);
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
        r45.r36 r36Var = (r45.r36) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.parseFrom(bArr2);
                    }
                    r36Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                r36Var.f384507d = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.p36 p36Var = new r45.p36();
                    if (bArr3 != null && bArr3.length > 0) {
                        p36Var.parseFrom(bArr3);
                    }
                    r36Var.f384508e.add(p36Var);
                }
                return 0;
            case 4:
                r36Var.f384509f = aVar2.k(intValue);
                return 0;
            case 5:
                r36Var.f384510g = aVar2.g(intValue);
                return 0;
            case 6:
                r36Var.f384511h = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
