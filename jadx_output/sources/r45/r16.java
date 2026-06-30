package r45;

/* loaded from: classes4.dex */
public class r16 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f384434d;

    /* renamed from: e, reason: collision with root package name */
    public int f384435e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f384436f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f384437g;

    /* renamed from: h, reason: collision with root package name */
    public int f384438h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.r16)) {
            return false;
        }
        r45.r16 r16Var = (r45.r16) fVar;
        return n51.f.a(this.BaseRequest, r16Var.BaseRequest) && n51.f.a(this.f384434d, r16Var.f384434d) && n51.f.a(java.lang.Integer.valueOf(this.f384435e), java.lang.Integer.valueOf(r16Var.f384435e)) && n51.f.a(this.f384436f, r16Var.f384436f) && n51.f.a(java.lang.Boolean.valueOf(this.f384437g), java.lang.Boolean.valueOf(r16Var.f384437g)) && n51.f.a(java.lang.Integer.valueOf(this.f384438h), java.lang.Integer.valueOf(r16Var.f384438h));
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
            java.lang.String str = this.f384434d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f384435e);
            java.lang.String str2 = this.f384436f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.a(5, this.f384437g);
            fVar.e(6, this.f384438h);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str3 = this.f384434d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            int e17 = i18 + b36.f.e(3, this.f384435e);
            java.lang.String str4 = this.f384436f;
            if (str4 != null) {
                e17 += b36.f.j(4, str4);
            }
            return e17 + b36.f.a(5, this.f384437g) + b36.f.e(6, this.f384438h);
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
        r45.r16 r16Var = (r45.r16) objArr[1];
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
                    r16Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                r16Var.f384434d = aVar2.k(intValue);
                return 0;
            case 3:
                r16Var.f384435e = aVar2.g(intValue);
                return 0;
            case 4:
                r16Var.f384436f = aVar2.k(intValue);
                return 0;
            case 5:
                r16Var.f384437g = aVar2.c(intValue);
                return 0;
            case 6:
                r16Var.f384438h = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
