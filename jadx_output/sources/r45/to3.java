package r45;

/* loaded from: classes4.dex */
public class to3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f386627d;

    /* renamed from: e, reason: collision with root package name */
    public int f386628e;

    /* renamed from: f, reason: collision with root package name */
    public int f386629f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f386630g;

    /* renamed from: h, reason: collision with root package name */
    public int f386631h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.LinkedList f386632i = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.to3)) {
            return false;
        }
        r45.to3 to3Var = (r45.to3) fVar;
        return n51.f.a(this.BaseRequest, to3Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f386627d), java.lang.Integer.valueOf(to3Var.f386627d)) && n51.f.a(java.lang.Integer.valueOf(this.f386628e), java.lang.Integer.valueOf(to3Var.f386628e)) && n51.f.a(java.lang.Integer.valueOf(this.f386629f), java.lang.Integer.valueOf(to3Var.f386629f)) && n51.f.a(this.f386630g, to3Var.f386630g) && n51.f.a(java.lang.Integer.valueOf(this.f386631h), java.lang.Integer.valueOf(to3Var.f386631h)) && n51.f.a(this.f386632i, to3Var.f386632i);
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
            fVar.e(2, this.f386627d);
            fVar.e(3, this.f386628e);
            fVar.e(4, this.f386629f);
            java.lang.String str = this.f386630g;
            if (str != null) {
                fVar.j(5, str);
            }
            fVar.e(6, this.f386631h);
            fVar.g(7, 8, this.f386632i);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f386627d) + b36.f.e(3, this.f386628e) + b36.f.e(4, this.f386629f);
            java.lang.String str2 = this.f386630g;
            if (str2 != null) {
                i18 += b36.f.j(5, str2);
            }
            return i18 + b36.f.e(6, this.f386631h) + b36.f.g(7, 8, this.f386632i);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f386632i.clear();
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
        r45.to3 to3Var = (r45.to3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.parseFrom(bArr2);
                    }
                    to3Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                to3Var.f386627d = aVar2.g(intValue);
                return 0;
            case 3:
                to3Var.f386628e = aVar2.g(intValue);
                return 0;
            case 4:
                to3Var.f386629f = aVar2.g(intValue);
                return 0;
            case 5:
                to3Var.f386630g = aVar2.k(intValue);
                return 0;
            case 6:
                to3Var.f386631h = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.du5 du5Var = new r45.du5();
                    if (bArr3 != null && bArr3.length > 0) {
                        du5Var.b(bArr3);
                    }
                    to3Var.f386632i.add(du5Var);
                }
                return 0;
            default:
                return -1;
        }
    }
}
