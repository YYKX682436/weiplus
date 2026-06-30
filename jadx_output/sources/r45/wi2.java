package r45;

/* loaded from: classes2.dex */
public class wi2 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f389195d;

    /* renamed from: e, reason: collision with root package name */
    public r45.kv0 f389196e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f389197f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f389198g;

    /* renamed from: h, reason: collision with root package name */
    public int f389199h;

    /* renamed from: i, reason: collision with root package name */
    public r45.dx0 f389200i;

    /* renamed from: m, reason: collision with root package name */
    public int f389201m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f389202n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f389203o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wi2)) {
            return false;
        }
        r45.wi2 wi2Var = (r45.wi2) fVar;
        return n51.f.a(this.BaseRequest, wi2Var.BaseRequest) && n51.f.a(this.f389195d, wi2Var.f389195d) && n51.f.a(this.f389196e, wi2Var.f389196e) && n51.f.a(this.f389197f, wi2Var.f389197f) && n51.f.a(this.f389198g, wi2Var.f389198g) && n51.f.a(java.lang.Integer.valueOf(this.f389199h), java.lang.Integer.valueOf(wi2Var.f389199h)) && n51.f.a(this.f389200i, wi2Var.f389200i) && n51.f.a(java.lang.Integer.valueOf(this.f389201m), java.lang.Integer.valueOf(wi2Var.f389201m)) && n51.f.a(this.f389202n, wi2Var.f389202n) && n51.f.a(this.f389203o, wi2Var.f389203o);
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
            java.lang.String str = this.f389195d;
            if (str != null) {
                fVar.j(2, str);
            }
            r45.kv0 kv0Var = this.f389196e;
            if (kv0Var != null) {
                fVar.i(3, kv0Var.computeSize());
                this.f389196e.writeFields(fVar);
            }
            java.lang.String str2 = this.f389197f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            com.tencent.mm.protobuf.g gVar = this.f389198g;
            if (gVar != null) {
                fVar.b(5, gVar);
            }
            fVar.e(6, this.f389199h);
            r45.dx0 dx0Var = this.f389200i;
            if (dx0Var != null) {
                fVar.i(7, dx0Var.computeSize());
                this.f389200i.writeFields(fVar);
            }
            fVar.e(8, this.f389201m);
            com.tencent.mm.protobuf.g gVar2 = this.f389202n;
            if (gVar2 != null) {
                fVar.b(9, gVar2);
            }
            com.tencent.mm.protobuf.g gVar3 = this.f389203o;
            if (gVar3 != null) {
                fVar.b(10, gVar3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str3 = this.f389195d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            r45.kv0 kv0Var2 = this.f389196e;
            if (kv0Var2 != null) {
                i18 += b36.f.i(3, kv0Var2.computeSize());
            }
            java.lang.String str4 = this.f389197f;
            if (str4 != null) {
                i18 += b36.f.j(4, str4);
            }
            com.tencent.mm.protobuf.g gVar4 = this.f389198g;
            if (gVar4 != null) {
                i18 += b36.f.b(5, gVar4);
            }
            int e17 = i18 + b36.f.e(6, this.f389199h);
            r45.dx0 dx0Var2 = this.f389200i;
            if (dx0Var2 != null) {
                e17 += b36.f.i(7, dx0Var2.computeSize());
            }
            int e18 = e17 + b36.f.e(8, this.f389201m);
            com.tencent.mm.protobuf.g gVar5 = this.f389202n;
            if (gVar5 != null) {
                e18 += b36.f.b(9, gVar5);
            }
            com.tencent.mm.protobuf.g gVar6 = this.f389203o;
            return gVar6 != null ? e18 + b36.f.b(10, gVar6) : e18;
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
        r45.wi2 wi2Var = (r45.wi2) objArr[1];
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
                    wi2Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                wi2Var.f389195d = aVar2.k(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.kv0 kv0Var3 = new r45.kv0();
                    if (bArr2 != null && bArr2.length > 0) {
                        kv0Var3.parseFrom(bArr2);
                    }
                    wi2Var.f389196e = kv0Var3;
                }
                return 0;
            case 4:
                wi2Var.f389197f = aVar2.k(intValue);
                return 0;
            case 5:
                wi2Var.f389198g = aVar2.d(intValue);
                return 0;
            case 6:
                wi2Var.f389199h = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.dx0 dx0Var3 = new r45.dx0();
                    if (bArr3 != null && bArr3.length > 0) {
                        dx0Var3.parseFrom(bArr3);
                    }
                    wi2Var.f389200i = dx0Var3;
                }
                return 0;
            case 8:
                wi2Var.f389201m = aVar2.g(intValue);
                return 0;
            case 9:
                wi2Var.f389202n = aVar2.d(intValue);
                return 0;
            case 10:
                wi2Var.f389203o = aVar2.d(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
