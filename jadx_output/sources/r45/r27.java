package r45;

/* loaded from: classes12.dex */
public class r27 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f384489d;

    /* renamed from: e, reason: collision with root package name */
    public long f384490e;

    /* renamed from: f, reason: collision with root package name */
    public int f384491f;

    /* renamed from: g, reason: collision with root package name */
    public int f384492g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f384493h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f384494i;

    /* renamed from: m, reason: collision with root package name */
    public int f384495m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.r27)) {
            return false;
        }
        r45.r27 r27Var = (r45.r27) fVar;
        return n51.f.a(this.BaseResponse, r27Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f384489d), java.lang.Integer.valueOf(r27Var.f384489d)) && n51.f.a(java.lang.Long.valueOf(this.f384490e), java.lang.Long.valueOf(r27Var.f384490e)) && n51.f.a(java.lang.Integer.valueOf(this.f384491f), java.lang.Integer.valueOf(r27Var.f384491f)) && n51.f.a(java.lang.Integer.valueOf(this.f384492g), java.lang.Integer.valueOf(r27Var.f384492g)) && n51.f.a(this.f384493h, r27Var.f384493h) && n51.f.a(this.f384494i, r27Var.f384494i) && n51.f.a(java.lang.Integer.valueOf(this.f384495m), java.lang.Integer.valueOf(r27Var.f384495m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f384493h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f384489d);
            fVar.h(3, this.f384490e);
            fVar.e(4, this.f384491f);
            fVar.e(6, this.f384492g);
            fVar.g(7, 8, linkedList);
            java.lang.String str = this.f384494i;
            if (str != null) {
                fVar.j(8, str);
            }
            fVar.e(9, this.f384495m);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f384489d) + b36.f.h(3, this.f384490e) + b36.f.e(4, this.f384491f) + b36.f.e(6, this.f384492g) + b36.f.g(7, 8, linkedList);
            java.lang.String str2 = this.f384494i;
            if (str2 != null) {
                i18 += b36.f.j(8, str2);
            }
            return i18 + b36.f.e(9, this.f384495m);
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
        r45.r27 r27Var = (r45.r27) objArr[1];
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
                    r27Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                r27Var.f384489d = aVar2.g(intValue);
                return 0;
            case 3:
                r27Var.f384490e = aVar2.i(intValue);
                return 0;
            case 4:
                r27Var.f384491f = aVar2.g(intValue);
                return 0;
            case 5:
            default:
                return -1;
            case 6:
                r27Var.f384492g = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.v37 v37Var = new r45.v37();
                    if (bArr3 != null && bArr3.length > 0) {
                        v37Var.parseFrom(bArr3);
                    }
                    r27Var.f384493h.add(v37Var);
                }
                return 0;
            case 8:
                r27Var.f384494i = aVar2.k(intValue);
                return 0;
            case 9:
                r27Var.f384495m = aVar2.g(intValue);
                return 0;
        }
    }
}
