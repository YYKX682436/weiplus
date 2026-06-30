package r45;

/* loaded from: classes4.dex */
public class db6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f372285d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f372286e;

    /* renamed from: f, reason: collision with root package name */
    public long f372287f;

    /* renamed from: g, reason: collision with root package name */
    public int f372288g;

    /* renamed from: h, reason: collision with root package name */
    public long f372289h;

    /* renamed from: i, reason: collision with root package name */
    public int f372290i;

    /* renamed from: m, reason: collision with root package name */
    public int f372291m;

    /* renamed from: n, reason: collision with root package name */
    public int f372292n;

    /* renamed from: o, reason: collision with root package name */
    public int f372293o;

    /* renamed from: p, reason: collision with root package name */
    public int f372294p;

    /* renamed from: q, reason: collision with root package name */
    public int f372295q;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.db6)) {
            return false;
        }
        r45.db6 db6Var = (r45.db6) fVar;
        return n51.f.a(this.BaseRequest, db6Var.BaseRequest) && n51.f.a(this.f372285d, db6Var.f372285d) && n51.f.a(this.f372286e, db6Var.f372286e) && n51.f.a(java.lang.Long.valueOf(this.f372287f), java.lang.Long.valueOf(db6Var.f372287f)) && n51.f.a(java.lang.Integer.valueOf(this.f372288g), java.lang.Integer.valueOf(db6Var.f372288g)) && n51.f.a(java.lang.Long.valueOf(this.f372289h), java.lang.Long.valueOf(db6Var.f372289h)) && n51.f.a(java.lang.Integer.valueOf(this.f372290i), java.lang.Integer.valueOf(db6Var.f372290i)) && n51.f.a(java.lang.Integer.valueOf(this.f372291m), java.lang.Integer.valueOf(db6Var.f372291m)) && n51.f.a(java.lang.Integer.valueOf(this.f372292n), java.lang.Integer.valueOf(db6Var.f372292n)) && n51.f.a(java.lang.Integer.valueOf(this.f372293o), java.lang.Integer.valueOf(db6Var.f372293o)) && n51.f.a(java.lang.Integer.valueOf(this.f372294p), java.lang.Integer.valueOf(db6Var.f372294p)) && n51.f.a(java.lang.Integer.valueOf(this.f372295q), java.lang.Integer.valueOf(db6Var.f372295q));
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
            java.lang.String str = this.f372285d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f372286e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.h(4, this.f372287f);
            fVar.e(5, this.f372288g);
            fVar.h(6, this.f372289h);
            fVar.e(7, this.f372290i);
            fVar.e(8, this.f372291m);
            fVar.e(9, this.f372292n);
            fVar.e(10, this.f372293o);
            fVar.e(11, this.f372294p);
            fVar.e(12, this.f372295q);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str3 = this.f372285d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f372286e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            return i18 + b36.f.h(4, this.f372287f) + b36.f.e(5, this.f372288g) + b36.f.h(6, this.f372289h) + b36.f.e(7, this.f372290i) + b36.f.e(8, this.f372291m) + b36.f.e(9, this.f372292n) + b36.f.e(10, this.f372293o) + b36.f.e(11, this.f372294p) + b36.f.e(12, this.f372295q);
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
        r45.db6 db6Var = (r45.db6) objArr[1];
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
                    db6Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                db6Var.f372285d = aVar2.k(intValue);
                return 0;
            case 3:
                db6Var.f372286e = aVar2.k(intValue);
                return 0;
            case 4:
                db6Var.f372287f = aVar2.i(intValue);
                return 0;
            case 5:
                db6Var.f372288g = aVar2.g(intValue);
                return 0;
            case 6:
                db6Var.f372289h = aVar2.i(intValue);
                return 0;
            case 7:
                db6Var.f372290i = aVar2.g(intValue);
                return 0;
            case 8:
                db6Var.f372291m = aVar2.g(intValue);
                return 0;
            case 9:
                db6Var.f372292n = aVar2.g(intValue);
                return 0;
            case 10:
                db6Var.f372293o = aVar2.g(intValue);
                return 0;
            case 11:
                db6Var.f372294p = aVar2.g(intValue);
                return 0;
            case 12:
                db6Var.f372295q = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
