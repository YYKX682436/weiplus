package r45;

/* loaded from: classes7.dex */
public class v54 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.o54 f387902d;

    /* renamed from: e, reason: collision with root package name */
    public r45.b10 f387903e;

    /* renamed from: f, reason: collision with root package name */
    public r45.mc7 f387904f;

    /* renamed from: g, reason: collision with root package name */
    public r45.ze5 f387905g;

    /* renamed from: h, reason: collision with root package name */
    public r45.t1 f387906h;

    /* renamed from: i, reason: collision with root package name */
    public r45.d25 f387907i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f387908m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f387909n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f387910o;

    /* renamed from: p, reason: collision with root package name */
    public r45.ue7 f387911p;

    /* renamed from: q, reason: collision with root package name */
    public int f387912q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f387913r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f387914s;

    /* renamed from: t, reason: collision with root package name */
    public r45.s54 f387915t;

    /* renamed from: u, reason: collision with root package name */
    public r45.tt3 f387916u;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.v54)) {
            return false;
        }
        r45.v54 v54Var = (r45.v54) fVar;
        return n51.f.a(this.BaseResponse, v54Var.BaseResponse) && n51.f.a(this.f387902d, v54Var.f387902d) && n51.f.a(this.f387903e, v54Var.f387903e) && n51.f.a(this.f387904f, v54Var.f387904f) && n51.f.a(this.f387905g, v54Var.f387905g) && n51.f.a(this.f387906h, v54Var.f387906h) && n51.f.a(this.f387907i, v54Var.f387907i) && n51.f.a(this.f387908m, v54Var.f387908m) && n51.f.a(this.f387909n, v54Var.f387909n) && n51.f.a(this.f387910o, v54Var.f387910o) && n51.f.a(this.f387911p, v54Var.f387911p) && n51.f.a(java.lang.Integer.valueOf(this.f387912q), java.lang.Integer.valueOf(v54Var.f387912q)) && n51.f.a(this.f387913r, v54Var.f387913r) && n51.f.a(java.lang.Boolean.valueOf(this.f387914s), java.lang.Boolean.valueOf(v54Var.f387914s)) && n51.f.a(this.f387915t, v54Var.f387915t) && n51.f.a(this.f387916u, v54Var.f387916u);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            r45.o54 o54Var = this.f387902d;
            if (o54Var != null) {
                fVar.i(2, o54Var.computeSize());
                this.f387902d.writeFields(fVar);
            }
            r45.b10 b10Var = this.f387903e;
            if (b10Var != null) {
                fVar.i(3, b10Var.computeSize());
                this.f387903e.writeFields(fVar);
            }
            r45.mc7 mc7Var = this.f387904f;
            if (mc7Var != null) {
                fVar.i(4, mc7Var.computeSize());
                this.f387904f.writeFields(fVar);
            }
            r45.ze5 ze5Var = this.f387905g;
            if (ze5Var != null) {
                fVar.i(5, ze5Var.computeSize());
                this.f387905g.writeFields(fVar);
            }
            r45.t1 t1Var = this.f387906h;
            if (t1Var != null) {
                fVar.i(6, t1Var.computeSize());
                this.f387906h.writeFields(fVar);
            }
            r45.d25 d25Var = this.f387907i;
            if (d25Var != null) {
                fVar.i(7, d25Var.computeSize());
                this.f387907i.writeFields(fVar);
            }
            java.lang.String str = this.f387908m;
            if (str != null) {
                fVar.j(8, str);
            }
            java.lang.String str2 = this.f387909n;
            if (str2 != null) {
                fVar.j(9, str2);
            }
            java.lang.String str3 = this.f387910o;
            if (str3 != null) {
                fVar.j(10, str3);
            }
            r45.ue7 ue7Var = this.f387911p;
            if (ue7Var != null) {
                fVar.i(11, ue7Var.computeSize());
                this.f387911p.writeFields(fVar);
            }
            fVar.e(12, this.f387912q);
            java.lang.String str4 = this.f387913r;
            if (str4 != null) {
                fVar.j(13, str4);
            }
            fVar.a(14, this.f387914s);
            r45.s54 s54Var = this.f387915t;
            if (s54Var != null) {
                fVar.i(15, s54Var.computeSize());
                this.f387915t.writeFields(fVar);
            }
            r45.tt3 tt3Var = this.f387916u;
            if (tt3Var != null) {
                fVar.i(16, tt3Var.computeSize());
                this.f387916u.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? b36.f.i(1, ieVar2.computeSize()) + 0 : 0;
            r45.o54 o54Var2 = this.f387902d;
            if (o54Var2 != null) {
                i18 += b36.f.i(2, o54Var2.computeSize());
            }
            r45.b10 b10Var2 = this.f387903e;
            if (b10Var2 != null) {
                i18 += b36.f.i(3, b10Var2.computeSize());
            }
            r45.mc7 mc7Var2 = this.f387904f;
            if (mc7Var2 != null) {
                i18 += b36.f.i(4, mc7Var2.computeSize());
            }
            r45.ze5 ze5Var2 = this.f387905g;
            if (ze5Var2 != null) {
                i18 += b36.f.i(5, ze5Var2.computeSize());
            }
            r45.t1 t1Var2 = this.f387906h;
            if (t1Var2 != null) {
                i18 += b36.f.i(6, t1Var2.computeSize());
            }
            r45.d25 d25Var2 = this.f387907i;
            if (d25Var2 != null) {
                i18 += b36.f.i(7, d25Var2.computeSize());
            }
            java.lang.String str5 = this.f387908m;
            if (str5 != null) {
                i18 += b36.f.j(8, str5);
            }
            java.lang.String str6 = this.f387909n;
            if (str6 != null) {
                i18 += b36.f.j(9, str6);
            }
            java.lang.String str7 = this.f387910o;
            if (str7 != null) {
                i18 += b36.f.j(10, str7);
            }
            r45.ue7 ue7Var2 = this.f387911p;
            if (ue7Var2 != null) {
                i18 += b36.f.i(11, ue7Var2.computeSize());
            }
            int e17 = i18 + b36.f.e(12, this.f387912q);
            java.lang.String str8 = this.f387913r;
            if (str8 != null) {
                e17 += b36.f.j(13, str8);
            }
            int a17 = e17 + b36.f.a(14, this.f387914s);
            r45.s54 s54Var2 = this.f387915t;
            if (s54Var2 != null) {
                a17 += b36.f.i(15, s54Var2.computeSize());
            }
            r45.tt3 tt3Var2 = this.f387916u;
            return tt3Var2 != null ? a17 + b36.f.i(16, tt3Var2.computeSize()) : a17;
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
        r45.v54 v54Var = (r45.v54) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.parseFrom(bArr);
                    }
                    v54Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.o54 o54Var3 = new r45.o54();
                    if (bArr2 != null && bArr2.length > 0) {
                        o54Var3.parseFrom(bArr2);
                    }
                    v54Var.f387902d = o54Var3;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.b10 b10Var3 = new r45.b10();
                    if (bArr3 != null && bArr3.length > 0) {
                        b10Var3.parseFrom(bArr3);
                    }
                    v54Var.f387903e = b10Var3;
                }
                return 0;
            case 4:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.mc7 mc7Var3 = new r45.mc7();
                    if (bArr4 != null && bArr4.length > 0) {
                        mc7Var3.parseFrom(bArr4);
                    }
                    v54Var.f387904f = mc7Var3;
                }
                return 0;
            case 5:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    r45.ze5 ze5Var3 = new r45.ze5();
                    if (bArr5 != null && bArr5.length > 0) {
                        ze5Var3.parseFrom(bArr5);
                    }
                    v54Var.f387905g = ze5Var3;
                }
                return 0;
            case 6:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    r45.t1 t1Var3 = new r45.t1();
                    if (bArr6 != null && bArr6.length > 0) {
                        t1Var3.parseFrom(bArr6);
                    }
                    v54Var.f387906h = t1Var3;
                }
                return 0;
            case 7:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    r45.d25 d25Var3 = new r45.d25();
                    if (bArr7 != null && bArr7.length > 0) {
                        d25Var3.parseFrom(bArr7);
                    }
                    v54Var.f387907i = d25Var3;
                }
                return 0;
            case 8:
                v54Var.f387908m = aVar2.k(intValue);
                return 0;
            case 9:
                v54Var.f387909n = aVar2.k(intValue);
                return 0;
            case 10:
                v54Var.f387910o = aVar2.k(intValue);
                return 0;
            case 11:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr8 = (byte[]) j38.get(i47);
                    r45.ue7 ue7Var3 = new r45.ue7();
                    if (bArr8 != null && bArr8.length > 0) {
                        ue7Var3.parseFrom(bArr8);
                    }
                    v54Var.f387911p = ue7Var3;
                }
                return 0;
            case 12:
                v54Var.f387912q = aVar2.g(intValue);
                return 0;
            case 13:
                v54Var.f387913r = aVar2.k(intValue);
                return 0;
            case 14:
                v54Var.f387914s = aVar2.c(intValue);
                return 0;
            case 15:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr9 = (byte[]) j39.get(i48);
                    r45.s54 s54Var3 = new r45.s54();
                    if (bArr9 != null && bArr9.length > 0) {
                        s54Var3.parseFrom(bArr9);
                    }
                    v54Var.f387915t = s54Var3;
                }
                return 0;
            case 16:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr10 = (byte[]) j47.get(i49);
                    r45.tt3 tt3Var3 = new r45.tt3();
                    if (bArr10 != null && bArr10.length > 0) {
                        tt3Var3.parseFrom(bArr10);
                    }
                    v54Var.f387916u = tt3Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
