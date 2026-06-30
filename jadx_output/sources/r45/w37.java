package r45;

/* loaded from: classes8.dex */
public class w37 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f388861d;

    /* renamed from: e, reason: collision with root package name */
    public int f388862e;

    /* renamed from: f, reason: collision with root package name */
    public r45.cu5 f388863f;

    /* renamed from: g, reason: collision with root package name */
    public r45.k27 f388864g;

    /* renamed from: h, reason: collision with root package name */
    public long f388865h;

    /* renamed from: i, reason: collision with root package name */
    public int f388866i;

    /* renamed from: m, reason: collision with root package name */
    public long f388867m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.w37)) {
            return false;
        }
        r45.w37 w37Var = (r45.w37) fVar;
        return n51.f.a(this.BaseRequest, w37Var.BaseRequest) && n51.f.a(this.f388861d, w37Var.f388861d) && n51.f.a(java.lang.Integer.valueOf(this.f388862e), java.lang.Integer.valueOf(w37Var.f388862e)) && n51.f.a(this.f388863f, w37Var.f388863f) && n51.f.a(this.f388864g, w37Var.f388864g) && n51.f.a(java.lang.Long.valueOf(this.f388865h), java.lang.Long.valueOf(w37Var.f388865h)) && n51.f.a(java.lang.Integer.valueOf(this.f388866i), java.lang.Integer.valueOf(w37Var.f388866i)) && n51.f.a(java.lang.Long.valueOf(this.f388867m), java.lang.Long.valueOf(w37Var.f388867m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            java.lang.String str = this.f388861d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f388862e);
            r45.cu5 cu5Var = this.f388863f;
            if (cu5Var != null) {
                fVar.i(4, cu5Var.computeSize());
                this.f388863f.writeFields(fVar);
            }
            r45.k27 k27Var = this.f388864g;
            if (k27Var != null) {
                fVar.i(5, k27Var.computeSize());
                this.f388864g.writeFields(fVar);
            }
            fVar.h(6, this.f388865h);
            fVar.e(7, this.f388866i);
            fVar.h(8, this.f388867m);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str2 = this.f388861d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            int e17 = i18 + b36.f.e(3, this.f388862e);
            r45.cu5 cu5Var2 = this.f388863f;
            if (cu5Var2 != null) {
                e17 += b36.f.i(4, cu5Var2.computeSize());
            }
            r45.k27 k27Var2 = this.f388864g;
            if (k27Var2 != null) {
                e17 += b36.f.i(5, k27Var2.computeSize());
            }
            return e17 + b36.f.h(6, this.f388865h) + b36.f.e(7, this.f388866i) + b36.f.h(8, this.f388867m);
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
        r45.w37 w37Var = (r45.w37) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.parseFrom(bArr);
                    }
                    w37Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                w37Var.f388861d = aVar2.k(intValue);
                return 0;
            case 3:
                w37Var.f388862e = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var3.b(bArr2);
                    }
                    w37Var.f388863f = cu5Var3;
                }
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.k27 k27Var3 = new r45.k27();
                    if (bArr3 != null && bArr3.length > 0) {
                        k27Var3.parseFrom(bArr3);
                    }
                    w37Var.f388864g = k27Var3;
                }
                return 0;
            case 6:
                w37Var.f388865h = aVar2.i(intValue);
                return 0;
            case 7:
                w37Var.f388866i = aVar2.g(intValue);
                return 0;
            case 8:
                w37Var.f388867m = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
