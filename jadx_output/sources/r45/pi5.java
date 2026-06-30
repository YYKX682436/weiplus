package r45;

/* loaded from: classes8.dex */
public class pi5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f383077d;

    /* renamed from: e, reason: collision with root package name */
    public float f383078e;

    /* renamed from: f, reason: collision with root package name */
    public float f383079f;

    /* renamed from: g, reason: collision with root package name */
    public int f383080g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f383081h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f383082i;

    /* renamed from: m, reason: collision with root package name */
    public int f383083m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pi5)) {
            return false;
        }
        r45.pi5 pi5Var = (r45.pi5) fVar;
        return n51.f.a(this.BaseRequest, pi5Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f383077d), java.lang.Integer.valueOf(pi5Var.f383077d)) && n51.f.a(java.lang.Float.valueOf(this.f383078e), java.lang.Float.valueOf(pi5Var.f383078e)) && n51.f.a(java.lang.Float.valueOf(this.f383079f), java.lang.Float.valueOf(pi5Var.f383079f)) && n51.f.a(java.lang.Integer.valueOf(this.f383080g), java.lang.Integer.valueOf(pi5Var.f383080g)) && n51.f.a(this.f383081h, pi5Var.f383081h) && n51.f.a(this.f383082i, pi5Var.f383082i) && n51.f.a(java.lang.Integer.valueOf(this.f383083m), java.lang.Integer.valueOf(pi5Var.f383083m));
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
            fVar.e(2, this.f383077d);
            fVar.d(3, this.f383078e);
            fVar.d(4, this.f383079f);
            fVar.e(5, this.f383080g);
            java.lang.String str = this.f383081h;
            if (str != null) {
                fVar.j(6, str);
            }
            java.lang.String str2 = this.f383082i;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            fVar.e(8, this.f383083m);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f383077d) + b36.f.d(3, this.f383078e) + b36.f.d(4, this.f383079f) + b36.f.e(5, this.f383080g);
            java.lang.String str3 = this.f383081h;
            if (str3 != null) {
                i18 += b36.f.j(6, str3);
            }
            java.lang.String str4 = this.f383082i;
            if (str4 != null) {
                i18 += b36.f.j(7, str4);
            }
            return i18 + b36.f.e(8, this.f383083m);
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
        r45.pi5 pi5Var = (r45.pi5) objArr[1];
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
                    pi5Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                pi5Var.f383077d = aVar2.g(intValue);
                return 0;
            case 3:
                pi5Var.f383078e = aVar2.f(intValue);
                return 0;
            case 4:
                pi5Var.f383079f = aVar2.f(intValue);
                return 0;
            case 5:
                pi5Var.f383080g = aVar2.g(intValue);
                return 0;
            case 6:
                pi5Var.f383081h = aVar2.k(intValue);
                return 0;
            case 7:
                pi5Var.f383082i = aVar2.k(intValue);
                return 0;
            case 8:
                pi5Var.f383083m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
