package r45;

/* loaded from: classes2.dex */
public class ds4 extends r45.mr5 {
    public r45.kd3 A;
    public final java.util.LinkedList B = new java.util.LinkedList();
    public r45.ym3 C;
    public r45.rn1 D;

    /* renamed from: d, reason: collision with root package name */
    public r45.kv0 f372712d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f372713e;

    /* renamed from: f, reason: collision with root package name */
    public long f372714f;

    /* renamed from: g, reason: collision with root package name */
    public float f372715g;

    /* renamed from: h, reason: collision with root package name */
    public float f372716h;

    /* renamed from: i, reason: collision with root package name */
    public int f372717i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f372718m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f372719n;

    /* renamed from: o, reason: collision with root package name */
    public int f372720o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f372721p;

    /* renamed from: q, reason: collision with root package name */
    public r45.xu2 f372722q;

    /* renamed from: r, reason: collision with root package name */
    public r45.kw0 f372723r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f372724s;

    /* renamed from: t, reason: collision with root package name */
    public r45.dx0 f372725t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f372726u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f372727v;

    /* renamed from: w, reason: collision with root package name */
    public r45.y91 f372728w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f372729x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f372730y;

    /* renamed from: z, reason: collision with root package name */
    public r45.ni6 f372731z;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ds4)) {
            return false;
        }
        r45.ds4 ds4Var = (r45.ds4) fVar;
        return n51.f.a(this.BaseRequest, ds4Var.BaseRequest) && n51.f.a(this.f372712d, ds4Var.f372712d) && n51.f.a(this.f372713e, ds4Var.f372713e) && n51.f.a(java.lang.Long.valueOf(this.f372714f), java.lang.Long.valueOf(ds4Var.f372714f)) && n51.f.a(java.lang.Float.valueOf(this.f372715g), java.lang.Float.valueOf(ds4Var.f372715g)) && n51.f.a(java.lang.Float.valueOf(this.f372716h), java.lang.Float.valueOf(ds4Var.f372716h)) && n51.f.a(java.lang.Integer.valueOf(this.f372717i), java.lang.Integer.valueOf(ds4Var.f372717i)) && n51.f.a(this.f372718m, ds4Var.f372718m) && n51.f.a(this.f372719n, ds4Var.f372719n) && n51.f.a(java.lang.Integer.valueOf(this.f372720o), java.lang.Integer.valueOf(ds4Var.f372720o)) && n51.f.a(this.f372721p, ds4Var.f372721p) && n51.f.a(this.f372722q, ds4Var.f372722q) && n51.f.a(this.f372723r, ds4Var.f372723r) && n51.f.a(this.f372724s, ds4Var.f372724s) && n51.f.a(this.f372725t, ds4Var.f372725t) && n51.f.a(this.f372726u, ds4Var.f372726u) && n51.f.a(this.f372727v, ds4Var.f372727v) && n51.f.a(this.f372728w, ds4Var.f372728w) && n51.f.a(this.f372729x, ds4Var.f372729x) && n51.f.a(this.f372730y, ds4Var.f372730y) && n51.f.a(this.f372731z, ds4Var.f372731z) && n51.f.a(this.A, ds4Var.A) && n51.f.a(this.B, ds4Var.B) && n51.f.a(this.C, ds4Var.C) && n51.f.a(this.D, ds4Var.D);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.B;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            r45.kv0 kv0Var = this.f372712d;
            if (kv0Var != null) {
                fVar.i(2, kv0Var.computeSize());
                this.f372712d.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar = this.f372713e;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            fVar.h(4, this.f372714f);
            fVar.d(6, this.f372715g);
            fVar.d(7, this.f372716h);
            fVar.e(5, this.f372717i);
            java.lang.String str = this.f372718m;
            if (str != null) {
                fVar.j(8, str);
            }
            java.lang.String str2 = this.f372719n;
            if (str2 != null) {
                fVar.j(9, str2);
            }
            fVar.e(10, this.f372720o);
            java.lang.String str3 = this.f372721p;
            if (str3 != null) {
                fVar.j(11, str3);
            }
            r45.xu2 xu2Var = this.f372722q;
            if (xu2Var != null) {
                fVar.i(12, xu2Var.computeSize());
                this.f372722q.writeFields(fVar);
            }
            r45.kw0 kw0Var = this.f372723r;
            if (kw0Var != null) {
                fVar.i(13, kw0Var.computeSize());
                this.f372723r.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f372724s;
            if (gVar2 != null) {
                fVar.b(14, gVar2);
            }
            r45.dx0 dx0Var = this.f372725t;
            if (dx0Var != null) {
                fVar.i(15, dx0Var.computeSize());
                this.f372725t.writeFields(fVar);
            }
            java.lang.String str4 = this.f372726u;
            if (str4 != null) {
                fVar.j(16, str4);
            }
            java.lang.String str5 = this.f372727v;
            if (str5 != null) {
                fVar.j(17, str5);
            }
            r45.y91 y91Var = this.f372728w;
            if (y91Var != null) {
                fVar.i(18, y91Var.computeSize());
                this.f372728w.writeFields(fVar);
            }
            java.lang.String str6 = this.f372729x;
            if (str6 != null) {
                fVar.j(19, str6);
            }
            com.tencent.mm.protobuf.g gVar3 = this.f372730y;
            if (gVar3 != null) {
                fVar.b(20, gVar3);
            }
            r45.ni6 ni6Var = this.f372731z;
            if (ni6Var != null) {
                fVar.i(21, ni6Var.computeSize());
                this.f372731z.writeFields(fVar);
            }
            r45.kd3 kd3Var = this.A;
            if (kd3Var != null) {
                fVar.i(22, kd3Var.computeSize());
                this.A.writeFields(fVar);
            }
            fVar.g(23, 8, linkedList);
            r45.ym3 ym3Var = this.C;
            if (ym3Var != null) {
                fVar.i(24, ym3Var.computeSize());
                this.C.writeFields(fVar);
            }
            r45.rn1 rn1Var = this.D;
            if (rn1Var != null) {
                fVar.i(25, rn1Var.computeSize());
                this.D.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? b36.f.i(1, heVar2.computeSize()) + 0 : 0;
            r45.kv0 kv0Var2 = this.f372712d;
            if (kv0Var2 != null) {
                i18 += b36.f.i(2, kv0Var2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar4 = this.f372713e;
            if (gVar4 != null) {
                i18 += b36.f.b(3, gVar4);
            }
            int h17 = i18 + b36.f.h(4, this.f372714f) + b36.f.d(6, this.f372715g) + b36.f.d(7, this.f372716h) + b36.f.e(5, this.f372717i);
            java.lang.String str7 = this.f372718m;
            if (str7 != null) {
                h17 += b36.f.j(8, str7);
            }
            java.lang.String str8 = this.f372719n;
            if (str8 != null) {
                h17 += b36.f.j(9, str8);
            }
            int e17 = h17 + b36.f.e(10, this.f372720o);
            java.lang.String str9 = this.f372721p;
            if (str9 != null) {
                e17 += b36.f.j(11, str9);
            }
            r45.xu2 xu2Var2 = this.f372722q;
            if (xu2Var2 != null) {
                e17 += b36.f.i(12, xu2Var2.computeSize());
            }
            r45.kw0 kw0Var2 = this.f372723r;
            if (kw0Var2 != null) {
                e17 += b36.f.i(13, kw0Var2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar5 = this.f372724s;
            if (gVar5 != null) {
                e17 += b36.f.b(14, gVar5);
            }
            r45.dx0 dx0Var2 = this.f372725t;
            if (dx0Var2 != null) {
                e17 += b36.f.i(15, dx0Var2.computeSize());
            }
            java.lang.String str10 = this.f372726u;
            if (str10 != null) {
                e17 += b36.f.j(16, str10);
            }
            java.lang.String str11 = this.f372727v;
            if (str11 != null) {
                e17 += b36.f.j(17, str11);
            }
            r45.y91 y91Var2 = this.f372728w;
            if (y91Var2 != null) {
                e17 += b36.f.i(18, y91Var2.computeSize());
            }
            java.lang.String str12 = this.f372729x;
            if (str12 != null) {
                e17 += b36.f.j(19, str12);
            }
            com.tencent.mm.protobuf.g gVar6 = this.f372730y;
            if (gVar6 != null) {
                e17 += b36.f.b(20, gVar6);
            }
            r45.ni6 ni6Var2 = this.f372731z;
            if (ni6Var2 != null) {
                e17 += b36.f.i(21, ni6Var2.computeSize());
            }
            r45.kd3 kd3Var2 = this.A;
            if (kd3Var2 != null) {
                e17 += b36.f.i(22, kd3Var2.computeSize());
            }
            int g17 = e17 + b36.f.g(23, 8, linkedList);
            r45.ym3 ym3Var2 = this.C;
            if (ym3Var2 != null) {
                g17 += b36.f.i(24, ym3Var2.computeSize());
            }
            r45.rn1 rn1Var2 = this.D;
            return rn1Var2 != null ? g17 + b36.f.i(25, rn1Var2.computeSize()) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.ds4 ds4Var = (r45.ds4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.parseFrom(bArr2);
                    }
                    ds4Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.kv0 kv0Var3 = new r45.kv0();
                    if (bArr3 != null && bArr3.length > 0) {
                        kv0Var3.parseFrom(bArr3);
                    }
                    ds4Var.f372712d = kv0Var3;
                }
                return 0;
            case 3:
                ds4Var.f372713e = aVar2.d(intValue);
                return 0;
            case 4:
                ds4Var.f372714f = aVar2.i(intValue);
                return 0;
            case 5:
                ds4Var.f372717i = aVar2.g(intValue);
                return 0;
            case 6:
                ds4Var.f372715g = aVar2.f(intValue);
                return 0;
            case 7:
                ds4Var.f372716h = aVar2.f(intValue);
                return 0;
            case 8:
                ds4Var.f372718m = aVar2.k(intValue);
                return 0;
            case 9:
                ds4Var.f372719n = aVar2.k(intValue);
                return 0;
            case 10:
                ds4Var.f372720o = aVar2.g(intValue);
                return 0;
            case 11:
                ds4Var.f372721p = aVar2.k(intValue);
                return 0;
            case 12:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.xu2 xu2Var3 = new r45.xu2();
                    if (bArr4 != null && bArr4.length > 0) {
                        xu2Var3.parseFrom(bArr4);
                    }
                    ds4Var.f372722q = xu2Var3;
                }
                return 0;
            case 13:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.kw0 kw0Var3 = new r45.kw0();
                    if (bArr5 != null && bArr5.length > 0) {
                        kw0Var3.parseFrom(bArr5);
                    }
                    ds4Var.f372723r = kw0Var3;
                }
                return 0;
            case 14:
                ds4Var.f372724s = aVar2.d(intValue);
                return 0;
            case 15:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.dx0 dx0Var3 = new r45.dx0();
                    if (bArr6 != null && bArr6.length > 0) {
                        dx0Var3.parseFrom(bArr6);
                    }
                    ds4Var.f372725t = dx0Var3;
                }
                return 0;
            case 16:
                ds4Var.f372726u = aVar2.k(intValue);
                return 0;
            case 17:
                ds4Var.f372727v = aVar2.k(intValue);
                return 0;
            case 18:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    r45.y91 y91Var3 = new r45.y91();
                    if (bArr7 != null && bArr7.length > 0) {
                        y91Var3.parseFrom(bArr7);
                    }
                    ds4Var.f372728w = y91Var3;
                }
                return 0;
            case 19:
                ds4Var.f372729x = aVar2.k(intValue);
                return 0;
            case 20:
                ds4Var.f372730y = aVar2.d(intValue);
                return 0;
            case 21:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr8 = (byte[]) j37.get(i39);
                    r45.ni6 ni6Var3 = new r45.ni6();
                    if (bArr8 != null && bArr8.length > 0) {
                        ni6Var3.parseFrom(bArr8);
                    }
                    ds4Var.f372731z = ni6Var3;
                }
                return 0;
            case 22:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr9 = (byte[]) j38.get(i47);
                    r45.kd3 kd3Var3 = new r45.kd3();
                    if (bArr9 != null && bArr9.length > 0) {
                        kd3Var3.parseFrom(bArr9);
                    }
                    ds4Var.A = kd3Var3;
                }
                return 0;
            case 23:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr10 = (byte[]) j39.get(i48);
                    r45.vd6 vd6Var = new r45.vd6();
                    if (bArr10 != null && bArr10.length > 0) {
                        vd6Var.parseFrom(bArr10);
                    }
                    ds4Var.B.add(vd6Var);
                }
                return 0;
            case 24:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr11 = (byte[]) j47.get(i49);
                    r45.ym3 ym3Var3 = new r45.ym3();
                    if (bArr11 != null && bArr11.length > 0) {
                        ym3Var3.parseFrom(bArr11);
                    }
                    ds4Var.C = ym3Var3;
                }
                return 0;
            case 25:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size11 = j48.size();
                for (int i57 = 0; i57 < size11; i57++) {
                    byte[] bArr12 = (byte[]) j48.get(i57);
                    r45.rn1 rn1Var3 = new r45.rn1();
                    if (bArr12 != null && bArr12.length > 0) {
                        rn1Var3.parseFrom(bArr12);
                    }
                    ds4Var.D = rn1Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
