package r45;

/* loaded from: classes4.dex */
public class b83 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f370627d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f370628e;

    /* renamed from: f, reason: collision with root package name */
    public int f370629f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f370630g = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.b83)) {
            return false;
        }
        r45.b83 b83Var = (r45.b83) fVar;
        return n51.f.a(this.BaseRequest, b83Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f370627d), java.lang.Integer.valueOf(b83Var.f370627d)) && n51.f.a(this.f370628e, b83Var.f370628e) && n51.f.a(java.lang.Integer.valueOf(this.f370629f), java.lang.Integer.valueOf(b83Var.f370629f)) && n51.f.a(this.f370630g, b83Var.f370630g);
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
            fVar.e(2, this.f370627d);
            java.lang.String str = this.f370628e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f370629f);
            fVar.g(5, 8, this.f370630g);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f370627d);
            java.lang.String str2 = this.f370628e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            return i18 + b36.f.e(4, this.f370629f) + b36.f.g(5, 8, this.f370630g);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f370630g.clear();
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
        r45.b83 b83Var = (r45.b83) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr2 != null && bArr2.length > 0) {
                    heVar3.parseFrom(bArr2);
                }
                b83Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            b83Var.f370627d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            b83Var.f370628e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            b83Var.f370629f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr3 = (byte[]) j18.get(i27);
            r45.d83 d83Var = new r45.d83();
            if (bArr3 != null && bArr3.length > 0) {
                d83Var.parseFrom(bArr3);
            }
            b83Var.f370630g.add(d83Var);
        }
        return 0;
    }
}
