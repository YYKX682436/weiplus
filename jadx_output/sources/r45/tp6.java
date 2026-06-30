package r45;

/* loaded from: classes9.dex */
public class tp6 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f386659d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f386660e;

    /* renamed from: f, reason: collision with root package name */
    public int f386661f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f386662g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public r45.n34 f386663h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tp6)) {
            return false;
        }
        r45.tp6 tp6Var = (r45.tp6) fVar;
        return n51.f.a(this.BaseResponse, tp6Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f386659d), java.lang.Integer.valueOf(tp6Var.f386659d)) && n51.f.a(this.f386660e, tp6Var.f386660e) && n51.f.a(java.lang.Integer.valueOf(this.f386661f), java.lang.Integer.valueOf(tp6Var.f386661f)) && n51.f.a(this.f386662g, tp6Var.f386662g) && n51.f.a(this.f386663h, tp6Var.f386663h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f386662g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f386659d);
            java.lang.String str = this.f386660e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f386661f);
            fVar.g(5, 8, linkedList);
            r45.n34 n34Var = this.f386663h;
            if (n34Var != null) {
                fVar.i(6, n34Var.computeSize());
                this.f386663h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f386659d);
            java.lang.String str2 = this.f386660e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            int e17 = i18 + b36.f.e(4, this.f386661f) + b36.f.g(5, 8, linkedList);
            r45.n34 n34Var2 = this.f386663h;
            return n34Var2 != null ? e17 + b36.f.i(6, n34Var2.computeSize()) : e17;
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
        r45.tp6 tp6Var = (r45.tp6) objArr[1];
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
                    tp6Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                tp6Var.f386659d = aVar2.g(intValue);
                return 0;
            case 3:
                tp6Var.f386660e = aVar2.k(intValue);
                return 0;
            case 4:
                tp6Var.f386661f = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.f44 f44Var = new r45.f44();
                    if (bArr3 != null && bArr3.length > 0) {
                        f44Var.parseFrom(bArr3);
                    }
                    tp6Var.f386662g.add(f44Var);
                }
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.n34 n34Var3 = new r45.n34();
                    if (bArr4 != null && bArr4.length > 0) {
                        n34Var3.parseFrom(bArr4);
                    }
                    tp6Var.f386663h = n34Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
