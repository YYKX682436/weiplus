package r45;

/* loaded from: classes10.dex */
public class lx1 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.kv0 f379921d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f379922e;

    /* renamed from: f, reason: collision with root package name */
    public long f379923f;

    /* renamed from: g, reason: collision with root package name */
    public long f379924g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f379925h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f379926i;

    /* renamed from: m, reason: collision with root package name */
    public int f379927m;

    /* renamed from: n, reason: collision with root package name */
    public int f379928n;

    /* renamed from: o, reason: collision with root package name */
    public r45.yx1 f379929o;

    /* renamed from: p, reason: collision with root package name */
    public r45.nx1 f379930p;

    /* renamed from: q, reason: collision with root package name */
    public r45.dy1 f379931q;

    public com.tencent.mm.modelbase.i b() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 20600;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlivektvmodsonglist";
        lVar.f70664a = this;
        lVar.f70665b = new r45.mx1();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        com.tencent.mm.modelbase.i wi6 = ((pc2.e) ((zy2.x5) i95.n0.c(zy2.x5.class))).wi();
        wi6.p(a17);
        return wi6;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lx1)) {
            return false;
        }
        r45.lx1 lx1Var = (r45.lx1) fVar;
        return n51.f.a(this.BaseRequest, lx1Var.BaseRequest) && n51.f.a(this.f379921d, lx1Var.f379921d) && n51.f.a(this.f379922e, lx1Var.f379922e) && n51.f.a(java.lang.Long.valueOf(this.f379923f), java.lang.Long.valueOf(lx1Var.f379923f)) && n51.f.a(java.lang.Long.valueOf(this.f379924g), java.lang.Long.valueOf(lx1Var.f379924g)) && n51.f.a(this.f379925h, lx1Var.f379925h) && n51.f.a(this.f379926i, lx1Var.f379926i) && n51.f.a(java.lang.Integer.valueOf(this.f379927m), java.lang.Integer.valueOf(lx1Var.f379927m)) && n51.f.a(java.lang.Integer.valueOf(this.f379928n), java.lang.Integer.valueOf(lx1Var.f379928n)) && n51.f.a(this.f379929o, lx1Var.f379929o) && n51.f.a(this.f379930p, lx1Var.f379930p) && n51.f.a(this.f379931q, lx1Var.f379931q);
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
            r45.kv0 kv0Var = this.f379921d;
            if (kv0Var != null) {
                fVar.i(2, kv0Var.computeSize());
                this.f379921d.writeFields(fVar);
            }
            java.lang.String str = this.f379922e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.h(4, this.f379923f);
            fVar.h(5, this.f379924g);
            java.lang.String str2 = this.f379925h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            com.tencent.mm.protobuf.g gVar = this.f379926i;
            if (gVar != null) {
                fVar.b(7, gVar);
            }
            fVar.e(8, this.f379927m);
            fVar.e(9, this.f379928n);
            r45.yx1 yx1Var = this.f379929o;
            if (yx1Var != null) {
                fVar.i(10, yx1Var.computeSize());
                this.f379929o.writeFields(fVar);
            }
            r45.nx1 nx1Var = this.f379930p;
            if (nx1Var != null) {
                fVar.i(11, nx1Var.computeSize());
                this.f379930p.writeFields(fVar);
            }
            r45.dy1 dy1Var = this.f379931q;
            if (dy1Var != null) {
                fVar.i(12, dy1Var.computeSize());
                this.f379931q.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            r45.kv0 kv0Var2 = this.f379921d;
            if (kv0Var2 != null) {
                i18 += b36.f.i(2, kv0Var2.computeSize());
            }
            java.lang.String str3 = this.f379922e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            int h17 = i18 + b36.f.h(4, this.f379923f) + b36.f.h(5, this.f379924g);
            java.lang.String str4 = this.f379925h;
            if (str4 != null) {
                h17 += b36.f.j(6, str4);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f379926i;
            if (gVar2 != null) {
                h17 += b36.f.b(7, gVar2);
            }
            int e17 = h17 + b36.f.e(8, this.f379927m) + b36.f.e(9, this.f379928n);
            r45.yx1 yx1Var2 = this.f379929o;
            if (yx1Var2 != null) {
                e17 += b36.f.i(10, yx1Var2.computeSize());
            }
            r45.nx1 nx1Var2 = this.f379930p;
            if (nx1Var2 != null) {
                e17 += b36.f.i(11, nx1Var2.computeSize());
            }
            r45.dy1 dy1Var2 = this.f379931q;
            return dy1Var2 != null ? e17 + b36.f.i(12, dy1Var2.computeSize()) : e17;
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
        r45.lx1 lx1Var = (r45.lx1) objArr[1];
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
                    lx1Var.BaseRequest = heVar3;
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
                    lx1Var.f379921d = kv0Var3;
                }
                return 0;
            case 3:
                lx1Var.f379922e = aVar2.k(intValue);
                return 0;
            case 4:
                lx1Var.f379923f = aVar2.i(intValue);
                return 0;
            case 5:
                lx1Var.f379924g = aVar2.i(intValue);
                return 0;
            case 6:
                lx1Var.f379925h = aVar2.k(intValue);
                return 0;
            case 7:
                lx1Var.f379926i = aVar2.d(intValue);
                return 0;
            case 8:
                lx1Var.f379927m = aVar2.g(intValue);
                return 0;
            case 9:
                lx1Var.f379928n = aVar2.g(intValue);
                return 0;
            case 10:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.yx1 yx1Var3 = new r45.yx1();
                    if (bArr3 != null && bArr3.length > 0) {
                        yx1Var3.parseFrom(bArr3);
                    }
                    lx1Var.f379929o = yx1Var3;
                }
                return 0;
            case 11:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.nx1 nx1Var3 = new r45.nx1();
                    if (bArr4 != null && bArr4.length > 0) {
                        nx1Var3.parseFrom(bArr4);
                    }
                    lx1Var.f379930p = nx1Var3;
                }
                return 0;
            case 12:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    r45.dy1 dy1Var3 = new r45.dy1();
                    if (bArr5 != null && bArr5.length > 0) {
                        dy1Var3.parseFrom(bArr5);
                    }
                    lx1Var.f379931q = dy1Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
