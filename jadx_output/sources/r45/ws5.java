package r45;

/* loaded from: classes7.dex */
public class ws5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f389417d;

    /* renamed from: e, reason: collision with root package name */
    public int f389418e;

    /* renamed from: f, reason: collision with root package name */
    public int f389419f;

    /* renamed from: g, reason: collision with root package name */
    public int f389420g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f389421h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f389422i;

    /* renamed from: m, reason: collision with root package name */
    public int f389423m;

    /* renamed from: n, reason: collision with root package name */
    public long f389424n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f389425o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ws5)) {
            return false;
        }
        r45.ws5 ws5Var = (r45.ws5) fVar;
        return n51.f.a(this.BaseRequest, ws5Var.BaseRequest) && n51.f.a(this.f389417d, ws5Var.f389417d) && n51.f.a(java.lang.Integer.valueOf(this.f389418e), java.lang.Integer.valueOf(ws5Var.f389418e)) && n51.f.a(java.lang.Integer.valueOf(this.f389419f), java.lang.Integer.valueOf(ws5Var.f389419f)) && n51.f.a(java.lang.Integer.valueOf(this.f389420g), java.lang.Integer.valueOf(ws5Var.f389420g)) && n51.f.a(this.f389421h, ws5Var.f389421h) && n51.f.a(this.f389422i, ws5Var.f389422i) && n51.f.a(java.lang.Integer.valueOf(this.f389423m), java.lang.Integer.valueOf(ws5Var.f389423m)) && n51.f.a(java.lang.Long.valueOf(this.f389424n), java.lang.Long.valueOf(ws5Var.f389424n)) && n51.f.a(this.f389425o, ws5Var.f389425o);
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
            java.lang.String str = this.f389417d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f389418e);
            fVar.e(4, this.f389419f);
            fVar.e(5, this.f389420g);
            java.lang.String str2 = this.f389421h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f389422i;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            fVar.e(8, this.f389423m);
            fVar.h(9, this.f389424n);
            java.lang.String str4 = this.f389425o;
            if (str4 != null) {
                fVar.j(10, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str5 = this.f389417d;
            if (str5 != null) {
                i18 += b36.f.j(2, str5);
            }
            int e17 = i18 + b36.f.e(3, this.f389418e) + b36.f.e(4, this.f389419f) + b36.f.e(5, this.f389420g);
            java.lang.String str6 = this.f389421h;
            if (str6 != null) {
                e17 += b36.f.j(6, str6);
            }
            java.lang.String str7 = this.f389422i;
            if (str7 != null) {
                e17 += b36.f.j(7, str7);
            }
            int e18 = e17 + b36.f.e(8, this.f389423m) + b36.f.h(9, this.f389424n);
            java.lang.String str8 = this.f389425o;
            return str8 != null ? e18 + b36.f.j(10, str8) : e18;
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
        r45.ws5 ws5Var = (r45.ws5) objArr[1];
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
                    ws5Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                ws5Var.f389417d = aVar2.k(intValue);
                return 0;
            case 3:
                ws5Var.f389418e = aVar2.g(intValue);
                return 0;
            case 4:
                ws5Var.f389419f = aVar2.g(intValue);
                return 0;
            case 5:
                ws5Var.f389420g = aVar2.g(intValue);
                return 0;
            case 6:
                ws5Var.f389421h = aVar2.k(intValue);
                return 0;
            case 7:
                ws5Var.f389422i = aVar2.k(intValue);
                return 0;
            case 8:
                ws5Var.f389423m = aVar2.g(intValue);
                return 0;
            case 9:
                ws5Var.f389424n = aVar2.i(intValue);
                return 0;
            case 10:
                ws5Var.f389425o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
