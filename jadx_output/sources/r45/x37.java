package r45;

/* loaded from: classes8.dex */
public class x37 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f389758d;

    /* renamed from: e, reason: collision with root package name */
    public r45.cu5 f389759e;

    /* renamed from: f, reason: collision with root package name */
    public r45.k27 f389760f;

    /* renamed from: g, reason: collision with root package name */
    public int f389761g;

    /* renamed from: h, reason: collision with root package name */
    public long f389762h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.x37)) {
            return false;
        }
        r45.x37 x37Var = (r45.x37) fVar;
        return n51.f.a(this.BaseResponse, x37Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f389758d), java.lang.Integer.valueOf(x37Var.f389758d)) && n51.f.a(this.f389759e, x37Var.f389759e) && n51.f.a(this.f389760f, x37Var.f389760f) && n51.f.a(java.lang.Integer.valueOf(this.f389761g), java.lang.Integer.valueOf(x37Var.f389761g)) && n51.f.a(java.lang.Long.valueOf(this.f389762h), java.lang.Long.valueOf(x37Var.f389762h));
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
            fVar.e(3, this.f389758d);
            r45.cu5 cu5Var = this.f389759e;
            if (cu5Var != null) {
                fVar.i(4, cu5Var.computeSize());
                this.f389759e.writeFields(fVar);
            }
            r45.k27 k27Var = this.f389760f;
            if (k27Var != null) {
                fVar.i(5, k27Var.computeSize());
                this.f389760f.writeFields(fVar);
            }
            fVar.e(7, this.f389761g);
            fVar.h(8, this.f389762h);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(3, this.f389758d);
            r45.cu5 cu5Var2 = this.f389759e;
            if (cu5Var2 != null) {
                i18 += b36.f.i(4, cu5Var2.computeSize());
            }
            r45.k27 k27Var2 = this.f389760f;
            if (k27Var2 != null) {
                i18 += b36.f.i(5, k27Var2.computeSize());
            }
            return i18 + b36.f.e(7, this.f389761g) + b36.f.h(8, this.f389762h);
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
        r45.x37 x37Var = (r45.x37) objArr[1];
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
                x37Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 3) {
            x37Var.f389758d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.cu5 cu5Var3 = new r45.cu5();
                if (bArr2 != null && bArr2.length > 0) {
                    cu5Var3.b(bArr2);
                }
                x37Var.f389759e = cu5Var3;
            }
            return 0;
        }
        if (intValue != 5) {
            if (intValue == 7) {
                x37Var.f389761g = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 8) {
                return -1;
            }
            x37Var.f389762h = aVar2.i(intValue);
            return 0;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            r45.k27 k27Var3 = new r45.k27();
            if (bArr3 != null && bArr3.length > 0) {
                k27Var3.parseFrom(bArr3);
            }
            x37Var.f389760f = k27Var3;
        }
        return 0;
    }
}
