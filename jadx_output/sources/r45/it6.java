package r45;

/* loaded from: classes7.dex */
public class it6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f377319d;

    /* renamed from: e, reason: collision with root package name */
    public int f377320e;

    /* renamed from: f, reason: collision with root package name */
    public int f377321f;

    /* renamed from: g, reason: collision with root package name */
    public int f377322g;

    /* renamed from: h, reason: collision with root package name */
    public int f377323h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f377324i;

    /* renamed from: m, reason: collision with root package name */
    public int f377325m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f377326n;

    /* renamed from: o, reason: collision with root package name */
    public int f377327o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.it6)) {
            return false;
        }
        r45.it6 it6Var = (r45.it6) fVar;
        return n51.f.a(this.BaseRequest, it6Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f377319d), java.lang.Integer.valueOf(it6Var.f377319d)) && n51.f.a(java.lang.Integer.valueOf(this.f377320e), java.lang.Integer.valueOf(it6Var.f377320e)) && n51.f.a(java.lang.Integer.valueOf(this.f377321f), java.lang.Integer.valueOf(it6Var.f377321f)) && n51.f.a(java.lang.Integer.valueOf(this.f377322g), java.lang.Integer.valueOf(it6Var.f377322g)) && n51.f.a(java.lang.Integer.valueOf(this.f377323h), java.lang.Integer.valueOf(it6Var.f377323h)) && n51.f.a(this.f377324i, it6Var.f377324i) && n51.f.a(java.lang.Integer.valueOf(this.f377325m), java.lang.Integer.valueOf(it6Var.f377325m)) && n51.f.a(this.f377326n, it6Var.f377326n) && n51.f.a(java.lang.Integer.valueOf(this.f377327o), java.lang.Integer.valueOf(it6Var.f377327o));
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
            fVar.e(2, this.f377319d);
            fVar.e(3, this.f377320e);
            fVar.e(4, this.f377321f);
            fVar.e(5, this.f377322g);
            fVar.e(6, this.f377323h);
            java.lang.String str = this.f377324i;
            if (str != null) {
                fVar.j(7, str);
            }
            fVar.e(8, this.f377325m);
            java.lang.String str2 = this.f377326n;
            if (str2 != null) {
                fVar.j(9, str2);
            }
            fVar.e(11, this.f377327o);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f377319d) + b36.f.e(3, this.f377320e) + b36.f.e(4, this.f377321f) + b36.f.e(5, this.f377322g) + b36.f.e(6, this.f377323h);
            java.lang.String str3 = this.f377324i;
            if (str3 != null) {
                i18 += b36.f.j(7, str3);
            }
            int e17 = i18 + b36.f.e(8, this.f377325m);
            java.lang.String str4 = this.f377326n;
            if (str4 != null) {
                e17 += b36.f.j(9, str4);
            }
            return e17 + b36.f.e(11, this.f377327o);
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
        r45.it6 it6Var = (r45.it6) objArr[1];
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
                    it6Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                it6Var.f377319d = aVar2.g(intValue);
                return 0;
            case 3:
                it6Var.f377320e = aVar2.g(intValue);
                return 0;
            case 4:
                it6Var.f377321f = aVar2.g(intValue);
                return 0;
            case 5:
                it6Var.f377322g = aVar2.g(intValue);
                return 0;
            case 6:
                it6Var.f377323h = aVar2.g(intValue);
                return 0;
            case 7:
                it6Var.f377324i = aVar2.k(intValue);
                return 0;
            case 8:
                it6Var.f377325m = aVar2.g(intValue);
                return 0;
            case 9:
                it6Var.f377326n = aVar2.k(intValue);
                return 0;
            case 10:
            default:
                return -1;
            case 11:
                it6Var.f377327o = aVar2.g(intValue);
                return 0;
        }
    }
}
