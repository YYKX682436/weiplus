package r45;

/* loaded from: classes4.dex */
public class wb6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f389038d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f389039e;

    /* renamed from: f, reason: collision with root package name */
    public long f389040f;

    /* renamed from: g, reason: collision with root package name */
    public int f389041g;

    /* renamed from: h, reason: collision with root package name */
    public long f389042h;

    /* renamed from: i, reason: collision with root package name */
    public int f389043i;

    /* renamed from: m, reason: collision with root package name */
    public int f389044m;

    /* renamed from: n, reason: collision with root package name */
    public int f389045n;

    /* renamed from: o, reason: collision with root package name */
    public int f389046o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wb6)) {
            return false;
        }
        r45.wb6 wb6Var = (r45.wb6) fVar;
        return n51.f.a(this.BaseRequest, wb6Var.BaseRequest) && n51.f.a(this.f389038d, wb6Var.f389038d) && n51.f.a(this.f389039e, wb6Var.f389039e) && n51.f.a(java.lang.Long.valueOf(this.f389040f), java.lang.Long.valueOf(wb6Var.f389040f)) && n51.f.a(java.lang.Integer.valueOf(this.f389041g), java.lang.Integer.valueOf(wb6Var.f389041g)) && n51.f.a(java.lang.Long.valueOf(this.f389042h), java.lang.Long.valueOf(wb6Var.f389042h)) && n51.f.a(java.lang.Integer.valueOf(this.f389043i), java.lang.Integer.valueOf(wb6Var.f389043i)) && n51.f.a(java.lang.Integer.valueOf(this.f389044m), java.lang.Integer.valueOf(wb6Var.f389044m)) && n51.f.a(java.lang.Integer.valueOf(this.f389045n), java.lang.Integer.valueOf(wb6Var.f389045n)) && n51.f.a(java.lang.Integer.valueOf(this.f389046o), java.lang.Integer.valueOf(wb6Var.f389046o));
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
            java.lang.String str = this.f389038d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f389039e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.h(4, this.f389040f);
            fVar.e(5, this.f389041g);
            fVar.h(6, this.f389042h);
            fVar.e(7, this.f389043i);
            fVar.e(8, this.f389044m);
            fVar.e(9, this.f389045n);
            fVar.e(10, this.f389046o);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str3 = this.f389038d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f389039e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            return i18 + b36.f.h(4, this.f389040f) + b36.f.e(5, this.f389041g) + b36.f.h(6, this.f389042h) + b36.f.e(7, this.f389043i) + b36.f.e(8, this.f389044m) + b36.f.e(9, this.f389045n) + b36.f.e(10, this.f389046o);
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
        r45.wb6 wb6Var = (r45.wb6) objArr[1];
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
                    wb6Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                wb6Var.f389038d = aVar2.k(intValue);
                return 0;
            case 3:
                wb6Var.f389039e = aVar2.k(intValue);
                return 0;
            case 4:
                wb6Var.f389040f = aVar2.i(intValue);
                return 0;
            case 5:
                wb6Var.f389041g = aVar2.g(intValue);
                return 0;
            case 6:
                wb6Var.f389042h = aVar2.i(intValue);
                return 0;
            case 7:
                wb6Var.f389043i = aVar2.g(intValue);
                return 0;
            case 8:
                wb6Var.f389044m = aVar2.g(intValue);
                return 0;
            case 9:
                wb6Var.f389045n = aVar2.g(intValue);
                return 0;
            case 10:
                wb6Var.f389046o = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
