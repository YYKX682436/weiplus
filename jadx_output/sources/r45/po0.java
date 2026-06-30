package r45;

/* loaded from: classes8.dex */
public class po0 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f383245d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f383246e;

    /* renamed from: f, reason: collision with root package name */
    public int f383247f;

    /* renamed from: g, reason: collision with root package name */
    public int f383248g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f383249h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f383250i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.po0)) {
            return false;
        }
        r45.po0 po0Var = (r45.po0) fVar;
        return n51.f.a(this.BaseRequest, po0Var.BaseRequest) && n51.f.a(this.f383245d, po0Var.f383245d) && n51.f.a(this.f383246e, po0Var.f383246e) && n51.f.a(java.lang.Integer.valueOf(this.f383247f), java.lang.Integer.valueOf(po0Var.f383247f)) && n51.f.a(java.lang.Integer.valueOf(this.f383248g), java.lang.Integer.valueOf(po0Var.f383248g)) && n51.f.a(this.f383249h, po0Var.f383249h) && n51.f.a(this.f383250i, po0Var.f383250i);
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
            java.lang.String str = this.f383245d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f383246e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f383247f);
            fVar.e(5, this.f383248g);
            com.tencent.mm.protobuf.g gVar = this.f383249h;
            if (gVar != null) {
                fVar.b(6, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f383250i;
            if (gVar2 != null) {
                fVar.b(7, gVar2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str3 = this.f383245d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f383246e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            int e17 = i18 + b36.f.e(4, this.f383247f) + b36.f.e(5, this.f383248g);
            com.tencent.mm.protobuf.g gVar3 = this.f383249h;
            if (gVar3 != null) {
                e17 += b36.f.b(6, gVar3);
            }
            com.tencent.mm.protobuf.g gVar4 = this.f383250i;
            return gVar4 != null ? e17 + b36.f.b(7, gVar4) : e17;
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
        r45.po0 po0Var = (r45.po0) objArr[1];
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
                    po0Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                po0Var.f383245d = aVar2.k(intValue);
                return 0;
            case 3:
                po0Var.f383246e = aVar2.k(intValue);
                return 0;
            case 4:
                po0Var.f383247f = aVar2.g(intValue);
                return 0;
            case 5:
                po0Var.f383248g = aVar2.g(intValue);
                return 0;
            case 6:
                po0Var.f383249h = aVar2.d(intValue);
                return 0;
            case 7:
                po0Var.f383250i = aVar2.d(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
