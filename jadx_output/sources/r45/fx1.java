package r45;

/* loaded from: classes10.dex */
public class fx1 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.kv0 f374674d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f374675e;

    /* renamed from: f, reason: collision with root package name */
    public long f374676f;

    /* renamed from: g, reason: collision with root package name */
    public long f374677g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f374678h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f374679i;

    /* renamed from: m, reason: collision with root package name */
    public int f374680m;

    /* renamed from: n, reason: collision with root package name */
    public int f374681n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f374682o;

    /* renamed from: p, reason: collision with root package name */
    public int f374683p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f374684q;

    /* renamed from: r, reason: collision with root package name */
    public long f374685r;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fx1)) {
            return false;
        }
        r45.fx1 fx1Var = (r45.fx1) fVar;
        return n51.f.a(this.BaseRequest, fx1Var.BaseRequest) && n51.f.a(this.f374674d, fx1Var.f374674d) && n51.f.a(this.f374675e, fx1Var.f374675e) && n51.f.a(java.lang.Long.valueOf(this.f374676f), java.lang.Long.valueOf(fx1Var.f374676f)) && n51.f.a(java.lang.Long.valueOf(this.f374677g), java.lang.Long.valueOf(fx1Var.f374677g)) && n51.f.a(this.f374678h, fx1Var.f374678h) && n51.f.a(this.f374679i, fx1Var.f374679i) && n51.f.a(java.lang.Integer.valueOf(this.f374680m), java.lang.Integer.valueOf(fx1Var.f374680m)) && n51.f.a(java.lang.Integer.valueOf(this.f374681n), java.lang.Integer.valueOf(fx1Var.f374681n)) && n51.f.a(java.lang.Boolean.valueOf(this.f374682o), java.lang.Boolean.valueOf(fx1Var.f374682o)) && n51.f.a(java.lang.Integer.valueOf(this.f374683p), java.lang.Integer.valueOf(fx1Var.f374683p)) && n51.f.a(java.lang.Boolean.valueOf(this.f374684q), java.lang.Boolean.valueOf(fx1Var.f374684q)) && n51.f.a(java.lang.Long.valueOf(this.f374685r), java.lang.Long.valueOf(fx1Var.f374685r));
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
            r45.kv0 kv0Var = this.f374674d;
            if (kv0Var != null) {
                fVar.i(2, kv0Var.computeSize());
                this.f374674d.writeFields(fVar);
            }
            java.lang.String str = this.f374675e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.h(4, this.f374676f);
            fVar.h(5, this.f374677g);
            java.lang.String str2 = this.f374678h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            com.tencent.mm.protobuf.g gVar = this.f374679i;
            if (gVar != null) {
                fVar.b(7, gVar);
            }
            fVar.e(8, this.f374680m);
            fVar.e(9, this.f374681n);
            fVar.a(10, this.f374682o);
            fVar.e(11, this.f374683p);
            fVar.a(12, this.f374684q);
            fVar.h(13, this.f374685r);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            r45.kv0 kv0Var2 = this.f374674d;
            if (kv0Var2 != null) {
                i18 += b36.f.i(2, kv0Var2.computeSize());
            }
            java.lang.String str3 = this.f374675e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            int h17 = i18 + b36.f.h(4, this.f374676f) + b36.f.h(5, this.f374677g);
            java.lang.String str4 = this.f374678h;
            if (str4 != null) {
                h17 += b36.f.j(6, str4);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f374679i;
            if (gVar2 != null) {
                h17 += b36.f.b(7, gVar2);
            }
            return h17 + b36.f.e(8, this.f374680m) + b36.f.e(9, this.f374681n) + b36.f.a(10, this.f374682o) + b36.f.e(11, this.f374683p) + b36.f.a(12, this.f374684q) + b36.f.h(13, this.f374685r);
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
        r45.fx1 fx1Var = (r45.fx1) objArr[1];
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
                    fx1Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.kv0 kv0Var3 = new r45.kv0();
                    if (bArr2 != null && bArr2.length > 0) {
                        kv0Var3.parseFrom(bArr2);
                    }
                    fx1Var.f374674d = kv0Var3;
                }
                return 0;
            case 3:
                fx1Var.f374675e = aVar2.k(intValue);
                return 0;
            case 4:
                fx1Var.f374676f = aVar2.i(intValue);
                return 0;
            case 5:
                fx1Var.f374677g = aVar2.i(intValue);
                return 0;
            case 6:
                fx1Var.f374678h = aVar2.k(intValue);
                return 0;
            case 7:
                fx1Var.f374679i = aVar2.d(intValue);
                return 0;
            case 8:
                fx1Var.f374680m = aVar2.g(intValue);
                return 0;
            case 9:
                fx1Var.f374681n = aVar2.g(intValue);
                return 0;
            case 10:
                fx1Var.f374682o = aVar2.c(intValue);
                return 0;
            case 11:
                fx1Var.f374683p = aVar2.g(intValue);
                return 0;
            case 12:
                fx1Var.f374684q = aVar2.c(intValue);
                return 0;
            case 13:
                fx1Var.f374685r = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
