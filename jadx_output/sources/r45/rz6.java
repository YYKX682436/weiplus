package r45;

/* loaded from: classes7.dex */
public class rz6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f385320d;

    /* renamed from: e, reason: collision with root package name */
    public int f385321e;

    /* renamed from: f, reason: collision with root package name */
    public int f385322f;

    /* renamed from: g, reason: collision with root package name */
    public r45.b70 f385323g;

    /* renamed from: h, reason: collision with root package name */
    public r45.xs f385324h;

    /* renamed from: i, reason: collision with root package name */
    public r45.e7 f385325i;

    /* renamed from: m, reason: collision with root package name */
    public r45.dg0 f385326m;

    /* renamed from: n, reason: collision with root package name */
    public int f385327n;

    /* renamed from: o, reason: collision with root package name */
    public int f385328o;

    /* renamed from: p, reason: collision with root package name */
    public int f385329p;

    /* renamed from: q, reason: collision with root package name */
    public r45.xy6 f385330q;

    /* renamed from: r, reason: collision with root package name */
    public r45.ol0 f385331r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f385332s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f385333t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f385334u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f385335v;

    /* renamed from: w, reason: collision with root package name */
    public r45.dv0 f385336w;

    /* renamed from: x, reason: collision with root package name */
    public r45.mi0 f385337x;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rz6)) {
            return false;
        }
        r45.rz6 rz6Var = (r45.rz6) fVar;
        return n51.f.a(this.f385320d, rz6Var.f385320d) && n51.f.a(java.lang.Integer.valueOf(this.f385321e), java.lang.Integer.valueOf(rz6Var.f385321e)) && n51.f.a(java.lang.Integer.valueOf(this.f385322f), java.lang.Integer.valueOf(rz6Var.f385322f)) && n51.f.a(this.f385323g, rz6Var.f385323g) && n51.f.a(this.f385324h, rz6Var.f385324h) && n51.f.a(this.f385325i, rz6Var.f385325i) && n51.f.a(this.f385326m, rz6Var.f385326m) && n51.f.a(java.lang.Integer.valueOf(this.f385327n), java.lang.Integer.valueOf(rz6Var.f385327n)) && n51.f.a(java.lang.Integer.valueOf(this.f385328o), java.lang.Integer.valueOf(rz6Var.f385328o)) && n51.f.a(java.lang.Integer.valueOf(this.f385329p), java.lang.Integer.valueOf(rz6Var.f385329p)) && n51.f.a(this.f385330q, rz6Var.f385330q) && n51.f.a(this.f385331r, rz6Var.f385331r) && n51.f.a(this.f385332s, rz6Var.f385332s) && n51.f.a(this.f385333t, rz6Var.f385333t) && n51.f.a(this.f385334u, rz6Var.f385334u) && n51.f.a(this.f385335v, rz6Var.f385335v) && n51.f.a(this.f385336w, rz6Var.f385336w) && n51.f.a(this.f385337x, rz6Var.f385337x);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f385320d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f385321e);
            fVar.e(3, this.f385322f);
            r45.b70 b70Var = this.f385323g;
            if (b70Var != null) {
                fVar.i(4, b70Var.computeSize());
                this.f385323g.writeFields(fVar);
            }
            r45.xs xsVar = this.f385324h;
            if (xsVar != null) {
                fVar.i(5, xsVar.computeSize());
                this.f385324h.writeFields(fVar);
            }
            r45.e7 e7Var = this.f385325i;
            if (e7Var != null) {
                fVar.i(6, e7Var.computeSize());
                this.f385325i.writeFields(fVar);
            }
            r45.dg0 dg0Var = this.f385326m;
            if (dg0Var != null) {
                fVar.i(7, dg0Var.computeSize());
                this.f385326m.writeFields(fVar);
            }
            fVar.e(8, this.f385327n);
            fVar.e(9, this.f385328o);
            fVar.e(10, this.f385329p);
            r45.xy6 xy6Var = this.f385330q;
            if (xy6Var != null) {
                fVar.i(11, xy6Var.computeSize());
                this.f385330q.writeFields(fVar);
            }
            r45.ol0 ol0Var = this.f385331r;
            if (ol0Var != null) {
                fVar.i(12, ol0Var.computeSize());
                this.f385331r.writeFields(fVar);
            }
            java.lang.String str2 = this.f385332s;
            if (str2 != null) {
                fVar.j(13, str2);
            }
            com.tencent.mm.protobuf.g gVar = this.f385333t;
            if (gVar != null) {
                fVar.b(14, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f385334u;
            if (gVar2 != null) {
                fVar.b(15, gVar2);
            }
            java.lang.String str3 = this.f385335v;
            if (str3 != null) {
                fVar.j(16, str3);
            }
            r45.dv0 dv0Var = this.f385336w;
            if (dv0Var != null) {
                fVar.i(17, dv0Var.computeSize());
                this.f385336w.writeFields(fVar);
            }
            r45.mi0 mi0Var = this.f385337x;
            if (mi0Var != null) {
                fVar.i(26, mi0Var.computeSize());
                this.f385337x.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f385320d;
            int j17 = (str4 != null ? b36.f.j(1, str4) + 0 : 0) + b36.f.e(2, this.f385321e) + b36.f.e(3, this.f385322f);
            r45.b70 b70Var2 = this.f385323g;
            if (b70Var2 != null) {
                j17 += b36.f.i(4, b70Var2.computeSize());
            }
            r45.xs xsVar2 = this.f385324h;
            if (xsVar2 != null) {
                j17 += b36.f.i(5, xsVar2.computeSize());
            }
            r45.e7 e7Var2 = this.f385325i;
            if (e7Var2 != null) {
                j17 += b36.f.i(6, e7Var2.computeSize());
            }
            r45.dg0 dg0Var2 = this.f385326m;
            if (dg0Var2 != null) {
                j17 += b36.f.i(7, dg0Var2.computeSize());
            }
            int e17 = j17 + b36.f.e(8, this.f385327n) + b36.f.e(9, this.f385328o) + b36.f.e(10, this.f385329p);
            r45.xy6 xy6Var2 = this.f385330q;
            if (xy6Var2 != null) {
                e17 += b36.f.i(11, xy6Var2.computeSize());
            }
            r45.ol0 ol0Var2 = this.f385331r;
            if (ol0Var2 != null) {
                e17 += b36.f.i(12, ol0Var2.computeSize());
            }
            java.lang.String str5 = this.f385332s;
            if (str5 != null) {
                e17 += b36.f.j(13, str5);
            }
            com.tencent.mm.protobuf.g gVar3 = this.f385333t;
            if (gVar3 != null) {
                e17 += b36.f.b(14, gVar3);
            }
            com.tencent.mm.protobuf.g gVar4 = this.f385334u;
            if (gVar4 != null) {
                e17 += b36.f.b(15, gVar4);
            }
            java.lang.String str6 = this.f385335v;
            if (str6 != null) {
                e17 += b36.f.j(16, str6);
            }
            r45.dv0 dv0Var2 = this.f385336w;
            if (dv0Var2 != null) {
                e17 += b36.f.i(17, dv0Var2.computeSize());
            }
            r45.mi0 mi0Var2 = this.f385337x;
            return mi0Var2 != null ? e17 + b36.f.i(26, mi0Var2.computeSize()) : e17;
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
        r45.rz6 rz6Var = (r45.rz6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 26) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size = j18.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j18.get(i18);
                r45.mi0 mi0Var3 = new r45.mi0();
                if (bArr != null && bArr.length > 0) {
                    mi0Var3.parseFrom(bArr);
                }
                rz6Var.f385337x = mi0Var3;
            }
            return 0;
        }
        switch (intValue) {
            case 1:
                rz6Var.f385320d = aVar2.k(intValue);
                return 0;
            case 2:
                rz6Var.f385321e = aVar2.g(intValue);
                return 0;
            case 3:
                rz6Var.f385322f = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    r45.b70 b70Var3 = new r45.b70();
                    if (bArr2 != null && bArr2.length > 0) {
                        b70Var3.parseFrom(bArr2);
                    }
                    rz6Var.f385323g = b70Var3;
                }
                return 0;
            case 5:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j27.get(i27);
                    r45.xs xsVar3 = new r45.xs();
                    if (bArr3 != null && bArr3.length > 0) {
                        xsVar3.parseFrom(bArr3);
                    }
                    rz6Var.f385324h = xsVar3;
                }
                return 0;
            case 6:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size4 = j28.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j28.get(i28);
                    r45.e7 e7Var3 = new r45.e7();
                    if (bArr4 != null && bArr4.length > 0) {
                        e7Var3.parseFrom(bArr4);
                    }
                    rz6Var.f385325i = e7Var3;
                }
                return 0;
            case 7:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size5 = j29.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j29.get(i29);
                    r45.dg0 dg0Var3 = new r45.dg0();
                    if (bArr5 != null && bArr5.length > 0) {
                        dg0Var3.parseFrom(bArr5);
                    }
                    rz6Var.f385326m = dg0Var3;
                }
                return 0;
            case 8:
                rz6Var.f385327n = aVar2.g(intValue);
                return 0;
            case 9:
                rz6Var.f385328o = aVar2.g(intValue);
                return 0;
            case 10:
                rz6Var.f385329p = aVar2.g(intValue);
                return 0;
            case 11:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size6 = j37.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr6 = (byte[]) j37.get(i37);
                    r45.xy6 xy6Var3 = new r45.xy6();
                    if (bArr6 != null && bArr6.length > 0) {
                        xy6Var3.parseFrom(bArr6);
                    }
                    rz6Var.f385330q = xy6Var3;
                }
                return 0;
            case 12:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size7 = j38.size();
                for (int i38 = 0; i38 < size7; i38++) {
                    byte[] bArr7 = (byte[]) j38.get(i38);
                    r45.ol0 ol0Var3 = new r45.ol0();
                    if (bArr7 != null && bArr7.length > 0) {
                        ol0Var3.parseFrom(bArr7);
                    }
                    rz6Var.f385331r = ol0Var3;
                }
                return 0;
            case 13:
                rz6Var.f385332s = aVar2.k(intValue);
                return 0;
            case 14:
                rz6Var.f385333t = aVar2.d(intValue);
                return 0;
            case 15:
                rz6Var.f385334u = aVar2.d(intValue);
                return 0;
            case 16:
                rz6Var.f385335v = aVar2.k(intValue);
                return 0;
            case 17:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size8 = j39.size();
                for (int i39 = 0; i39 < size8; i39++) {
                    byte[] bArr8 = (byte[]) j39.get(i39);
                    r45.dv0 dv0Var3 = new r45.dv0();
                    if (bArr8 != null && bArr8.length > 0) {
                        dv0Var3.parseFrom(bArr8);
                    }
                    rz6Var.f385336w = dv0Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
