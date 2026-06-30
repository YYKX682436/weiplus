package r45;

/* loaded from: classes9.dex */
public class e0 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f372879d;

    /* renamed from: e, reason: collision with root package name */
    public int f372880e;

    /* renamed from: f, reason: collision with root package name */
    public int f372881f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f372882g;

    /* renamed from: h, reason: collision with root package name */
    public int f372883h;

    /* renamed from: i, reason: collision with root package name */
    public int f372884i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f372885m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.e0)) {
            return false;
        }
        r45.e0 e0Var = (r45.e0) fVar;
        return n51.f.a(this.BaseRequest, e0Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f372879d), java.lang.Integer.valueOf(e0Var.f372879d)) && n51.f.a(java.lang.Integer.valueOf(this.f372880e), java.lang.Integer.valueOf(e0Var.f372880e)) && n51.f.a(java.lang.Integer.valueOf(this.f372881f), java.lang.Integer.valueOf(e0Var.f372881f)) && n51.f.a(this.f372882g, e0Var.f372882g) && n51.f.a(java.lang.Integer.valueOf(this.f372883h), java.lang.Integer.valueOf(e0Var.f372883h)) && n51.f.a(java.lang.Integer.valueOf(this.f372884i), java.lang.Integer.valueOf(e0Var.f372884i)) && n51.f.a(this.f372885m, e0Var.f372885m);
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
            fVar.e(2, this.f372879d);
            fVar.e(3, this.f372880e);
            fVar.e(4, this.f372881f);
            java.lang.String str = this.f372882g;
            if (str != null) {
                fVar.j(5, str);
            }
            fVar.e(6, this.f372883h);
            fVar.e(7, this.f372884i);
            java.lang.String str2 = this.f372885m;
            if (str2 != null) {
                fVar.j(8, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f372879d) + b36.f.e(3, this.f372880e) + b36.f.e(4, this.f372881f);
            java.lang.String str3 = this.f372882g;
            if (str3 != null) {
                i18 += b36.f.j(5, str3);
            }
            int e17 = i18 + b36.f.e(6, this.f372883h) + b36.f.e(7, this.f372884i);
            java.lang.String str4 = this.f372885m;
            return str4 != null ? e17 + b36.f.j(8, str4) : e17;
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
        r45.e0 e0Var = (r45.e0) objArr[1];
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
                    e0Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                e0Var.f372879d = aVar2.g(intValue);
                return 0;
            case 3:
                e0Var.f372880e = aVar2.g(intValue);
                return 0;
            case 4:
                e0Var.f372881f = aVar2.g(intValue);
                return 0;
            case 5:
                e0Var.f372882g = aVar2.k(intValue);
                return 0;
            case 6:
                e0Var.f372883h = aVar2.g(intValue);
                return 0;
            case 7:
                e0Var.f372884i = aVar2.g(intValue);
                return 0;
            case 8:
                e0Var.f372885m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
