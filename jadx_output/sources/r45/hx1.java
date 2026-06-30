package r45;

/* loaded from: classes8.dex */
public class hx1 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.kv0 f376527d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f376528e;

    /* renamed from: f, reason: collision with root package name */
    public long f376529f;

    /* renamed from: g, reason: collision with root package name */
    public long f376530g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f376531h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f376532i;

    /* renamed from: m, reason: collision with root package name */
    public int f376533m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f376534n;

    public com.tencent.mm.modelbase.i b() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 18826;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlivektvgetsongplayinfo";
        lVar.f70664a = this;
        lVar.f70665b = new r45.ix1();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        com.tencent.mm.modelbase.i wi6 = ((pc2.e) ((zy2.x5) i95.n0.c(zy2.x5.class))).wi();
        wi6.p(a17);
        return wi6;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hx1)) {
            return false;
        }
        r45.hx1 hx1Var = (r45.hx1) fVar;
        return n51.f.a(this.BaseRequest, hx1Var.BaseRequest) && n51.f.a(this.f376527d, hx1Var.f376527d) && n51.f.a(this.f376528e, hx1Var.f376528e) && n51.f.a(java.lang.Long.valueOf(this.f376529f), java.lang.Long.valueOf(hx1Var.f376529f)) && n51.f.a(java.lang.Long.valueOf(this.f376530g), java.lang.Long.valueOf(hx1Var.f376530g)) && n51.f.a(this.f376531h, hx1Var.f376531h) && n51.f.a(this.f376532i, hx1Var.f376532i) && n51.f.a(java.lang.Integer.valueOf(this.f376533m), java.lang.Integer.valueOf(hx1Var.f376533m)) && n51.f.a(this.f376534n, hx1Var.f376534n);
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
            r45.kv0 kv0Var = this.f376527d;
            if (kv0Var != null) {
                fVar.i(2, kv0Var.computeSize());
                this.f376527d.writeFields(fVar);
            }
            java.lang.String str = this.f376528e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.h(4, this.f376529f);
            fVar.h(5, this.f376530g);
            java.lang.String str2 = this.f376531h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            com.tencent.mm.protobuf.g gVar = this.f376532i;
            if (gVar != null) {
                fVar.b(7, gVar);
            }
            fVar.e(8, this.f376533m);
            java.lang.String str3 = this.f376534n;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            r45.kv0 kv0Var2 = this.f376527d;
            if (kv0Var2 != null) {
                i18 += b36.f.i(2, kv0Var2.computeSize());
            }
            java.lang.String str4 = this.f376528e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            int h17 = i18 + b36.f.h(4, this.f376529f) + b36.f.h(5, this.f376530g);
            java.lang.String str5 = this.f376531h;
            if (str5 != null) {
                h17 += b36.f.j(6, str5);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f376532i;
            if (gVar2 != null) {
                h17 += b36.f.b(7, gVar2);
            }
            int e17 = h17 + b36.f.e(8, this.f376533m);
            java.lang.String str6 = this.f376534n;
            return str6 != null ? e17 + b36.f.j(9, str6) : e17;
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
        r45.hx1 hx1Var = (r45.hx1) objArr[1];
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
                    hx1Var.BaseRequest = heVar3;
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
                    hx1Var.f376527d = kv0Var3;
                }
                return 0;
            case 3:
                hx1Var.f376528e = aVar2.k(intValue);
                return 0;
            case 4:
                hx1Var.f376529f = aVar2.i(intValue);
                return 0;
            case 5:
                hx1Var.f376530g = aVar2.i(intValue);
                return 0;
            case 6:
                hx1Var.f376531h = aVar2.k(intValue);
                return 0;
            case 7:
                hx1Var.f376532i = aVar2.d(intValue);
                return 0;
            case 8:
                hx1Var.f376533m = aVar2.g(intValue);
                return 0;
            case 9:
                hx1Var.f376534n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
