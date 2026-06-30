package r45;

/* loaded from: classes2.dex */
public class lq4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f379723d;

    /* renamed from: e, reason: collision with root package name */
    public int f379724e;

    /* renamed from: f, reason: collision with root package name */
    public int f379725f;

    /* renamed from: g, reason: collision with root package name */
    public int f379726g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f379727h;

    /* renamed from: i, reason: collision with root package name */
    public int f379728i;

    /* renamed from: m, reason: collision with root package name */
    public r45.se0 f379729m;

    /* renamed from: n, reason: collision with root package name */
    public r45.mq4 f379730n;

    /* renamed from: o, reason: collision with root package name */
    public r45.te0 f379731o;

    /* renamed from: p, reason: collision with root package name */
    public r45.iz3 f379732p;

    /* renamed from: q, reason: collision with root package name */
    public int f379733q;

    /* renamed from: r, reason: collision with root package name */
    public int f379734r;

    /* renamed from: s, reason: collision with root package name */
    public int f379735s;

    /* renamed from: t, reason: collision with root package name */
    public long f379736t;

    /* renamed from: u, reason: collision with root package name */
    public int f379737u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f379738v;

    /* renamed from: w, reason: collision with root package name */
    public int f379739w;

    /* renamed from: x, reason: collision with root package name */
    public r45.tm f379740x;

    /* renamed from: y, reason: collision with root package name */
    public r45.vz3 f379741y;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lq4)) {
            return false;
        }
        r45.lq4 lq4Var = (r45.lq4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f379723d), java.lang.Integer.valueOf(lq4Var.f379723d)) && n51.f.a(java.lang.Integer.valueOf(this.f379724e), java.lang.Integer.valueOf(lq4Var.f379724e)) && n51.f.a(java.lang.Integer.valueOf(this.f379725f), java.lang.Integer.valueOf(lq4Var.f379725f)) && n51.f.a(java.lang.Integer.valueOf(this.f379726g), java.lang.Integer.valueOf(lq4Var.f379726g)) && n51.f.a(this.f379727h, lq4Var.f379727h) && n51.f.a(java.lang.Integer.valueOf(this.f379728i), java.lang.Integer.valueOf(lq4Var.f379728i)) && n51.f.a(this.f379729m, lq4Var.f379729m) && n51.f.a(this.f379730n, lq4Var.f379730n) && n51.f.a(this.f379731o, lq4Var.f379731o) && n51.f.a(this.f379732p, lq4Var.f379732p) && n51.f.a(java.lang.Integer.valueOf(this.f379733q), java.lang.Integer.valueOf(lq4Var.f379733q)) && n51.f.a(java.lang.Integer.valueOf(this.f379734r), java.lang.Integer.valueOf(lq4Var.f379734r)) && n51.f.a(java.lang.Integer.valueOf(this.f379735s), java.lang.Integer.valueOf(lq4Var.f379735s)) && n51.f.a(java.lang.Long.valueOf(this.f379736t), java.lang.Long.valueOf(lq4Var.f379736t)) && n51.f.a(java.lang.Integer.valueOf(this.f379737u), java.lang.Integer.valueOf(lq4Var.f379737u)) && n51.f.a(this.f379738v, lq4Var.f379738v) && n51.f.a(java.lang.Integer.valueOf(this.f379739w), java.lang.Integer.valueOf(lq4Var.f379739w)) && n51.f.a(this.f379740x, lq4Var.f379740x) && n51.f.a(this.f379741y, lq4Var.f379741y);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f379723d);
            fVar.e(2, this.f379724e);
            fVar.e(3, this.f379725f);
            fVar.e(5, this.f379726g);
            java.lang.String str = this.f379727h;
            if (str != null) {
                fVar.j(6, str);
            }
            fVar.e(7, this.f379728i);
            r45.se0 se0Var = this.f379729m;
            if (se0Var != null) {
                fVar.i(8, se0Var.computeSize());
                this.f379729m.writeFields(fVar);
            }
            r45.mq4 mq4Var = this.f379730n;
            if (mq4Var != null) {
                fVar.i(9, mq4Var.computeSize());
                this.f379730n.writeFields(fVar);
            }
            r45.te0 te0Var = this.f379731o;
            if (te0Var != null) {
                fVar.i(11, te0Var.computeSize());
                this.f379731o.writeFields(fVar);
            }
            r45.iz3 iz3Var = this.f379732p;
            if (iz3Var != null) {
                fVar.i(12, iz3Var.computeSize());
                this.f379732p.writeFields(fVar);
            }
            fVar.e(31, this.f379733q);
            fVar.e(32, this.f379734r);
            fVar.e(33, this.f379735s);
            fVar.h(34, this.f379736t);
            fVar.e(35, this.f379737u);
            java.lang.String str2 = this.f379738v;
            if (str2 != null) {
                fVar.j(61, str2);
            }
            fVar.e(62, this.f379739w);
            r45.tm tmVar = this.f379740x;
            if (tmVar != null) {
                fVar.i(81, tmVar.computeSize());
                this.f379740x.writeFields(fVar);
            }
            r45.vz3 vz3Var = this.f379741y;
            if (vz3Var != null) {
                fVar.i(91, vz3Var.computeSize());
                this.f379741y.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f379723d) + 0 + b36.f.e(2, this.f379724e) + b36.f.e(3, this.f379725f) + b36.f.e(5, this.f379726g);
            java.lang.String str3 = this.f379727h;
            if (str3 != null) {
                e17 += b36.f.j(6, str3);
            }
            int e18 = e17 + b36.f.e(7, this.f379728i);
            r45.se0 se0Var2 = this.f379729m;
            if (se0Var2 != null) {
                e18 += b36.f.i(8, se0Var2.computeSize());
            }
            r45.mq4 mq4Var2 = this.f379730n;
            if (mq4Var2 != null) {
                e18 += b36.f.i(9, mq4Var2.computeSize());
            }
            r45.te0 te0Var2 = this.f379731o;
            if (te0Var2 != null) {
                e18 += b36.f.i(11, te0Var2.computeSize());
            }
            r45.iz3 iz3Var2 = this.f379732p;
            if (iz3Var2 != null) {
                e18 += b36.f.i(12, iz3Var2.computeSize());
            }
            int e19 = e18 + b36.f.e(31, this.f379733q) + b36.f.e(32, this.f379734r) + b36.f.e(33, this.f379735s) + b36.f.h(34, this.f379736t) + b36.f.e(35, this.f379737u);
            java.lang.String str4 = this.f379738v;
            if (str4 != null) {
                e19 += b36.f.j(61, str4);
            }
            int e27 = e19 + b36.f.e(62, this.f379739w);
            r45.tm tmVar2 = this.f379740x;
            if (tmVar2 != null) {
                e27 += b36.f.i(81, tmVar2.computeSize());
            }
            r45.vz3 vz3Var2 = this.f379741y;
            return vz3Var2 != null ? e27 + b36.f.i(91, vz3Var2.computeSize()) : e27;
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
        r45.lq4 lq4Var = (r45.lq4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            lq4Var.f379723d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            lq4Var.f379724e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            lq4Var.f379725f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 11) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.te0 te0Var3 = new r45.te0();
                if (bArr != null && bArr.length > 0) {
                    te0Var3.parseFrom(bArr);
                }
                lq4Var.f379731o = te0Var3;
            }
            return 0;
        }
        if (intValue == 12) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j18.get(i19);
                r45.iz3 iz3Var3 = new r45.iz3();
                if (bArr2 != null && bArr2.length > 0) {
                    iz3Var3.parseFrom(bArr2);
                }
                lq4Var.f379732p = iz3Var3;
            }
            return 0;
        }
        if (intValue == 61) {
            lq4Var.f379738v = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 62) {
            lq4Var.f379739w = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 81) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i27 = 0; i27 < size3; i27++) {
                byte[] bArr3 = (byte[]) j19.get(i27);
                r45.tm tmVar3 = new r45.tm();
                if (bArr3 != null && bArr3.length > 0) {
                    tmVar3.parseFrom(bArr3);
                }
                lq4Var.f379740x = tmVar3;
            }
            return 0;
        }
        if (intValue == 91) {
            java.util.LinkedList j27 = aVar2.j(intValue);
            int size4 = j27.size();
            for (int i28 = 0; i28 < size4; i28++) {
                byte[] bArr4 = (byte[]) j27.get(i28);
                r45.vz3 vz3Var3 = new r45.vz3();
                if (bArr4 != null && bArr4.length > 0) {
                    vz3Var3.parseFrom(bArr4);
                }
                lq4Var.f379741y = vz3Var3;
            }
            return 0;
        }
        switch (intValue) {
            case 5:
                lq4Var.f379726g = aVar2.g(intValue);
                return 0;
            case 6:
                lq4Var.f379727h = aVar2.k(intValue);
                return 0;
            case 7:
                lq4Var.f379728i = aVar2.g(intValue);
                return 0;
            case 8:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j28.get(i29);
                    r45.se0 se0Var3 = new r45.se0();
                    if (bArr5 != null && bArr5.length > 0) {
                        se0Var3.parseFrom(bArr5);
                    }
                    lq4Var.f379729m = se0Var3;
                }
                return 0;
            case 9:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr6 = (byte[]) j29.get(i37);
                    r45.mq4 mq4Var3 = new r45.mq4();
                    if (bArr6 != null && bArr6.length > 0) {
                        mq4Var3.parseFrom(bArr6);
                    }
                    lq4Var.f379730n = mq4Var3;
                }
                return 0;
            default:
                switch (intValue) {
                    case 31:
                        lq4Var.f379733q = aVar2.g(intValue);
                        return 0;
                    case 32:
                        lq4Var.f379734r = aVar2.g(intValue);
                        return 0;
                    case 33:
                        lq4Var.f379735s = aVar2.g(intValue);
                        return 0;
                    case 34:
                        lq4Var.f379736t = aVar2.i(intValue);
                        return 0;
                    case 35:
                        lq4Var.f379737u = aVar2.g(intValue);
                        return 0;
                    default:
                        return -1;
                }
        }
    }
}
