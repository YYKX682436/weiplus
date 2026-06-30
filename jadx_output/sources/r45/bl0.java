package r45;

/* loaded from: classes4.dex */
public class bl0 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f370841d;

    /* renamed from: e, reason: collision with root package name */
    public int f370842e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f370843f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f370844g;

    /* renamed from: h, reason: collision with root package name */
    public int f370845h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bl0)) {
            return false;
        }
        r45.bl0 bl0Var = (r45.bl0) fVar;
        return n51.f.a(this.BaseRequest, bl0Var.BaseRequest) && n51.f.a(this.f370841d, bl0Var.f370841d) && n51.f.a(java.lang.Integer.valueOf(this.f370842e), java.lang.Integer.valueOf(bl0Var.f370842e)) && n51.f.a(this.f370843f, bl0Var.f370843f) && n51.f.a(this.f370844g, bl0Var.f370844g) && n51.f.a(java.lang.Integer.valueOf(this.f370845h), java.lang.Integer.valueOf(bl0Var.f370845h));
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
            java.lang.String str = this.f370841d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f370842e);
            com.tencent.mm.protobuf.g gVar = this.f370843f;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f370844g;
            if (gVar2 != null) {
                fVar.b(5, gVar2);
            }
            fVar.e(6, this.f370845h);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str2 = this.f370841d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            int e17 = i18 + b36.f.e(3, this.f370842e);
            com.tencent.mm.protobuf.g gVar3 = this.f370843f;
            if (gVar3 != null) {
                e17 += b36.f.b(4, gVar3);
            }
            com.tencent.mm.protobuf.g gVar4 = this.f370844g;
            if (gVar4 != null) {
                e17 += b36.f.b(5, gVar4);
            }
            return e17 + b36.f.e(6, this.f370845h);
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
        r45.bl0 bl0Var = (r45.bl0) objArr[1];
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
                    bl0Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                bl0Var.f370841d = aVar2.k(intValue);
                return 0;
            case 3:
                bl0Var.f370842e = aVar2.g(intValue);
                return 0;
            case 4:
                bl0Var.f370843f = aVar2.d(intValue);
                return 0;
            case 5:
                bl0Var.f370844g = aVar2.d(intValue);
                return 0;
            case 6:
                bl0Var.f370845h = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
