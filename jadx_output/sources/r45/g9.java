package r45;

/* loaded from: classes9.dex */
public class g9 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f374997d;

    /* renamed from: e, reason: collision with root package name */
    public int f374998e;

    /* renamed from: f, reason: collision with root package name */
    public int f374999f;

    /* renamed from: g, reason: collision with root package name */
    public int f375000g;

    /* renamed from: h, reason: collision with root package name */
    public int f375001h;

    /* renamed from: i, reason: collision with root package name */
    public int f375002i;

    /* renamed from: m, reason: collision with root package name */
    public int f375003m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f375004n;

    /* renamed from: o, reason: collision with root package name */
    public long f375005o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.g9)) {
            return false;
        }
        r45.g9 g9Var = (r45.g9) fVar;
        return n51.f.a(this.BaseRequest, g9Var.BaseRequest) && n51.f.a(this.f374997d, g9Var.f374997d) && n51.f.a(java.lang.Integer.valueOf(this.f374998e), java.lang.Integer.valueOf(g9Var.f374998e)) && n51.f.a(java.lang.Integer.valueOf(this.f374999f), java.lang.Integer.valueOf(g9Var.f374999f)) && n51.f.a(java.lang.Integer.valueOf(this.f375000g), java.lang.Integer.valueOf(g9Var.f375000g)) && n51.f.a(java.lang.Integer.valueOf(this.f375001h), java.lang.Integer.valueOf(g9Var.f375001h)) && n51.f.a(java.lang.Integer.valueOf(this.f375002i), java.lang.Integer.valueOf(g9Var.f375002i)) && n51.f.a(java.lang.Integer.valueOf(this.f375003m), java.lang.Integer.valueOf(g9Var.f375003m)) && n51.f.a(this.f375004n, g9Var.f375004n) && n51.f.a(java.lang.Long.valueOf(this.f375005o), java.lang.Long.valueOf(g9Var.f375005o));
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
            java.lang.String str = this.f374997d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(4, this.f374998e);
            fVar.e(6, this.f374999f);
            fVar.e(7, this.f375000g);
            fVar.e(8, this.f375001h);
            fVar.e(9, this.f375002i);
            fVar.e(10, this.f375003m);
            java.lang.String str2 = this.f375004n;
            if (str2 != null) {
                fVar.j(11, str2);
            }
            fVar.h(12, this.f375005o);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str3 = this.f374997d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            int e17 = i18 + b36.f.e(4, this.f374998e) + b36.f.e(6, this.f374999f) + b36.f.e(7, this.f375000g) + b36.f.e(8, this.f375001h) + b36.f.e(9, this.f375002i) + b36.f.e(10, this.f375003m);
            java.lang.String str4 = this.f375004n;
            if (str4 != null) {
                e17 += b36.f.j(11, str4);
            }
            return e17 + b36.f.h(12, this.f375005o);
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
        r45.g9 g9Var = (r45.g9) objArr[1];
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
                    g9Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                g9Var.f374997d = aVar2.k(intValue);
                return 0;
            case 3:
            case 5:
            default:
                return -1;
            case 4:
                g9Var.f374998e = aVar2.g(intValue);
                return 0;
            case 6:
                g9Var.f374999f = aVar2.g(intValue);
                return 0;
            case 7:
                g9Var.f375000g = aVar2.g(intValue);
                return 0;
            case 8:
                g9Var.f375001h = aVar2.g(intValue);
                return 0;
            case 9:
                g9Var.f375002i = aVar2.g(intValue);
                return 0;
            case 10:
                g9Var.f375003m = aVar2.g(intValue);
                return 0;
            case 11:
                g9Var.f375004n = aVar2.k(intValue);
                return 0;
            case 12:
                g9Var.f375005o = aVar2.i(intValue);
                return 0;
        }
    }
}
