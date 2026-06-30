package r45;

/* loaded from: classes9.dex */
public class gq extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f375462d;

    /* renamed from: e, reason: collision with root package name */
    public r45.yt5 f375463e;

    /* renamed from: f, reason: collision with root package name */
    public int f375464f;

    /* renamed from: g, reason: collision with root package name */
    public r45.bz3 f375465g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f375466h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f375467i;

    /* renamed from: m, reason: collision with root package name */
    public int f375468m;

    /* renamed from: n, reason: collision with root package name */
    public r45.a50 f375469n;

    /* renamed from: o, reason: collision with root package name */
    public long f375470o;

    /* renamed from: p, reason: collision with root package name */
    public long f375471p;

    /* renamed from: q, reason: collision with root package name */
    public r45.cg0 f375472q;

    /* renamed from: r, reason: collision with root package name */
    public r45.cg0 f375473r;

    /* renamed from: s, reason: collision with root package name */
    public long f375474s;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gq)) {
            return false;
        }
        r45.gq gqVar = (r45.gq) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f375462d), java.lang.Integer.valueOf(gqVar.f375462d)) && n51.f.a(this.f375463e, gqVar.f375463e) && n51.f.a(java.lang.Integer.valueOf(this.f375464f), java.lang.Integer.valueOf(gqVar.f375464f)) && n51.f.a(this.f375465g, gqVar.f375465g) && n51.f.a(this.f375466h, gqVar.f375466h) && n51.f.a(this.f375467i, gqVar.f375467i) && n51.f.a(java.lang.Integer.valueOf(this.f375468m), java.lang.Integer.valueOf(gqVar.f375468m)) && n51.f.a(this.f375469n, gqVar.f375469n) && n51.f.a(java.lang.Long.valueOf(this.f375470o), java.lang.Long.valueOf(gqVar.f375470o)) && n51.f.a(java.lang.Long.valueOf(this.f375471p), java.lang.Long.valueOf(gqVar.f375471p)) && n51.f.a(this.f375472q, gqVar.f375472q) && n51.f.a(this.f375473r, gqVar.f375473r) && n51.f.a(java.lang.Long.valueOf(this.f375474s), java.lang.Long.valueOf(gqVar.f375474s));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f375462d);
            r45.yt5 yt5Var = this.f375463e;
            if (yt5Var != null) {
                fVar.i(2, yt5Var.computeSize());
                this.f375463e.writeFields(fVar);
            }
            fVar.e(3, this.f375464f);
            r45.bz3 bz3Var = this.f375465g;
            if (bz3Var != null) {
                fVar.i(4, bz3Var.computeSize());
                this.f375465g.writeFields(fVar);
            }
            java.lang.String str = this.f375466h;
            if (str != null) {
                fVar.j(5, str);
            }
            java.lang.String str2 = this.f375467i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            fVar.e(7, this.f375468m);
            r45.a50 a50Var = this.f375469n;
            if (a50Var != null) {
                fVar.i(8, a50Var.computeSize());
                this.f375469n.writeFields(fVar);
            }
            fVar.h(9, this.f375470o);
            fVar.h(10, this.f375471p);
            r45.cg0 cg0Var = this.f375472q;
            if (cg0Var != null) {
                fVar.i(11, cg0Var.computeSize());
                this.f375472q.writeFields(fVar);
            }
            r45.cg0 cg0Var2 = this.f375473r;
            if (cg0Var2 != null) {
                fVar.i(12, cg0Var2.computeSize());
                this.f375473r.writeFields(fVar);
            }
            fVar.h(13, this.f375474s);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f375462d) + 0;
            r45.yt5 yt5Var2 = this.f375463e;
            if (yt5Var2 != null) {
                e17 += b36.f.i(2, yt5Var2.computeSize());
            }
            int e18 = e17 + b36.f.e(3, this.f375464f);
            r45.bz3 bz3Var2 = this.f375465g;
            if (bz3Var2 != null) {
                e18 += b36.f.i(4, bz3Var2.computeSize());
            }
            java.lang.String str3 = this.f375466h;
            if (str3 != null) {
                e18 += b36.f.j(5, str3);
            }
            java.lang.String str4 = this.f375467i;
            if (str4 != null) {
                e18 += b36.f.j(6, str4);
            }
            int e19 = e18 + b36.f.e(7, this.f375468m);
            r45.a50 a50Var2 = this.f375469n;
            if (a50Var2 != null) {
                e19 += b36.f.i(8, a50Var2.computeSize());
            }
            int h17 = e19 + b36.f.h(9, this.f375470o) + b36.f.h(10, this.f375471p);
            r45.cg0 cg0Var3 = this.f375472q;
            if (cg0Var3 != null) {
                h17 += b36.f.i(11, cg0Var3.computeSize());
            }
            r45.cg0 cg0Var4 = this.f375473r;
            if (cg0Var4 != null) {
                h17 += b36.f.i(12, cg0Var4.computeSize());
            }
            return h17 + b36.f.h(13, this.f375474s);
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
        r45.gq gqVar = (r45.gq) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                gqVar.f375462d = aVar2.g(intValue);
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.yt5 yt5Var3 = new r45.yt5();
                    if (bArr != null && bArr.length > 0) {
                        yt5Var3.parseFrom(bArr);
                    }
                    gqVar.f375463e = yt5Var3;
                }
                return 0;
            case 3:
                gqVar.f375464f = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.bz3 bz3Var3 = new r45.bz3();
                    if (bArr2 != null && bArr2.length > 0) {
                        bz3Var3.parseFrom(bArr2);
                    }
                    gqVar.f375465g = bz3Var3;
                }
                return 0;
            case 5:
                gqVar.f375466h = aVar2.k(intValue);
                return 0;
            case 6:
                gqVar.f375467i = aVar2.k(intValue);
                return 0;
            case 7:
                gqVar.f375468m = aVar2.g(intValue);
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    r45.a50 a50Var3 = new r45.a50();
                    if (bArr3 != null && bArr3.length > 0) {
                        a50Var3.parseFrom(bArr3);
                    }
                    gqVar.f375469n = a50Var3;
                }
                return 0;
            case 9:
                gqVar.f375470o = aVar2.i(intValue);
                return 0;
            case 10:
                gqVar.f375471p = aVar2.i(intValue);
                return 0;
            case 11:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    r45.cg0 cg0Var5 = new r45.cg0();
                    if (bArr4 != null && bArr4.length > 0) {
                        cg0Var5.parseFrom(bArr4);
                    }
                    gqVar.f375472q = cg0Var5;
                }
                return 0;
            case 12:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j28.get(i29);
                    r45.cg0 cg0Var6 = new r45.cg0();
                    if (bArr5 != null && bArr5.length > 0) {
                        cg0Var6.parseFrom(bArr5);
                    }
                    gqVar.f375473r = cg0Var6;
                }
                return 0;
            case 13:
                gqVar.f375474s = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
