package r45;

/* loaded from: classes10.dex */
public class h70 extends com.tencent.mm.protobuf.f {

    /* renamed from: e, reason: collision with root package name */
    public long f375898e;

    /* renamed from: f, reason: collision with root package name */
    public long f375899f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f375900g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f375901h;

    /* renamed from: i, reason: collision with root package name */
    public r45.i70 f375902i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f375903m;

    /* renamed from: n, reason: collision with root package name */
    public r45.g70 f375904n;

    /* renamed from: p, reason: collision with root package name */
    public r45.tz6 f375906p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f375907q;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f375909s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f375910t;

    /* renamed from: v, reason: collision with root package name */
    public boolean f375912v;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f375897d = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f375905o = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public java.util.LinkedList f375908r = new java.util.LinkedList();

    /* renamed from: u, reason: collision with root package name */
    public final java.util.LinkedList f375911u = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.h70)) {
            return false;
        }
        r45.h70 h70Var = (r45.h70) fVar;
        return n51.f.a(this.f375897d, h70Var.f375897d) && n51.f.a(java.lang.Long.valueOf(this.f375898e), java.lang.Long.valueOf(h70Var.f375898e)) && n51.f.a(java.lang.Long.valueOf(this.f375899f), java.lang.Long.valueOf(h70Var.f375899f)) && n51.f.a(java.lang.Boolean.valueOf(this.f375900g), java.lang.Boolean.valueOf(h70Var.f375900g)) && n51.f.a(this.f375901h, h70Var.f375901h) && n51.f.a(this.f375902i, h70Var.f375902i) && n51.f.a(java.lang.Boolean.valueOf(this.f375903m), java.lang.Boolean.valueOf(h70Var.f375903m)) && n51.f.a(this.f375904n, h70Var.f375904n) && n51.f.a(this.f375905o, h70Var.f375905o) && n51.f.a(this.f375906p, h70Var.f375906p) && n51.f.a(java.lang.Boolean.valueOf(this.f375907q), java.lang.Boolean.valueOf(h70Var.f375907q)) && n51.f.a(this.f375908r, h70Var.f375908r) && n51.f.a(this.f375909s, h70Var.f375909s) && n51.f.a(java.lang.Boolean.valueOf(this.f375910t), java.lang.Boolean.valueOf(h70Var.f375910t)) && n51.f.a(this.f375911u, h70Var.f375911u) && n51.f.a(java.lang.Boolean.valueOf(this.f375912v), java.lang.Boolean.valueOf(h70Var.f375912v));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f375911u;
        java.util.LinkedList linkedList2 = this.f375905o;
        java.util.LinkedList linkedList3 = this.f375897d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList3);
            fVar.h(2, this.f375898e);
            fVar.h(3, this.f375899f);
            fVar.a(4, this.f375900g);
            java.lang.String str = this.f375901h;
            if (str != null) {
                fVar.j(5, str);
            }
            r45.i70 i70Var = this.f375902i;
            if (i70Var != null) {
                fVar.i(6, i70Var.computeSize());
                this.f375902i.writeFields(fVar);
            }
            fVar.a(7, this.f375903m);
            r45.g70 g70Var = this.f375904n;
            if (g70Var != null) {
                fVar.i(8, g70Var.computeSize());
                this.f375904n.writeFields(fVar);
            }
            fVar.g(9, 8, linkedList2);
            r45.tz6 tz6Var = this.f375906p;
            if (tz6Var != null) {
                fVar.i(10, tz6Var.computeSize());
                this.f375906p.writeFields(fVar);
            }
            fVar.a(11, this.f375907q);
            fVar.g(12, 8, this.f375908r);
            java.lang.String str2 = this.f375909s;
            if (str2 != null) {
                fVar.j(13, str2);
            }
            fVar.a(14, this.f375910t);
            fVar.g(15, 8, linkedList);
            fVar.a(16, this.f375912v);
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList3) + 0 + b36.f.h(2, this.f375898e) + b36.f.h(3, this.f375899f) + b36.f.a(4, this.f375900g);
            java.lang.String str3 = this.f375901h;
            if (str3 != null) {
                g17 += b36.f.j(5, str3);
            }
            r45.i70 i70Var2 = this.f375902i;
            if (i70Var2 != null) {
                g17 += b36.f.i(6, i70Var2.computeSize());
            }
            int a17 = g17 + b36.f.a(7, this.f375903m);
            r45.g70 g70Var2 = this.f375904n;
            if (g70Var2 != null) {
                a17 += b36.f.i(8, g70Var2.computeSize());
            }
            int g18 = a17 + b36.f.g(9, 8, linkedList2);
            r45.tz6 tz6Var2 = this.f375906p;
            if (tz6Var2 != null) {
                g18 += b36.f.i(10, tz6Var2.computeSize());
            }
            int a18 = g18 + b36.f.a(11, this.f375907q) + b36.f.g(12, 8, this.f375908r);
            java.lang.String str4 = this.f375909s;
            if (str4 != null) {
                a18 += b36.f.j(13, str4);
            }
            return a18 + b36.f.a(14, this.f375910t) + b36.f.g(15, 8, linkedList) + b36.f.a(16, this.f375912v);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList3.clear();
            linkedList2.clear();
            this.f375908r.clear();
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
        r45.h70 h70Var = (r45.h70) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.ho6 ho6Var = new r45.ho6();
                    if (bArr2 != null && bArr2.length > 0) {
                        ho6Var.parseFrom(bArr2);
                    }
                    h70Var.f375897d.add(ho6Var);
                }
                return 0;
            case 2:
                h70Var.f375898e = aVar2.i(intValue);
                return 0;
            case 3:
                h70Var.f375899f = aVar2.i(intValue);
                return 0;
            case 4:
                h70Var.f375900g = aVar2.c(intValue);
                return 0;
            case 5:
                h70Var.f375901h = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.i70 i70Var3 = new r45.i70();
                    if (bArr3 != null && bArr3.length > 0) {
                        i70Var3.parseFrom(bArr3);
                    }
                    h70Var.f375902i = i70Var3;
                }
                return 0;
            case 7:
                h70Var.f375903m = aVar2.c(intValue);
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    r45.g70 g70Var3 = new r45.g70();
                    if (bArr4 != null && bArr4.length > 0) {
                        g70Var3.parseFrom(bArr4);
                    }
                    h70Var.f375904n = g70Var3;
                }
                return 0;
            case 9:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j27.get(i28);
                    r45.ci4 ci4Var = new r45.ci4();
                    if (bArr5 != null && bArr5.length > 0) {
                        ci4Var.parseFrom(bArr5);
                    }
                    h70Var.f375905o.add(ci4Var);
                }
                return 0;
            case 10:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr6 = (byte[]) j28.get(i29);
                    r45.tz6 tz6Var3 = new r45.tz6();
                    if (bArr6 != null && bArr6.length > 0) {
                        tz6Var3.parseFrom(bArr6);
                    }
                    h70Var.f375906p = tz6Var3;
                }
                return 0;
            case 11:
                h70Var.f375907q = aVar2.c(intValue);
                return 0;
            case 12:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr7 = (byte[]) j29.get(i37);
                    r45.j70 j70Var = new r45.j70();
                    if (bArr7 != null && bArr7.length > 0) {
                        j70Var.parseFrom(bArr7);
                    }
                    h70Var.f375908r.add(j70Var);
                }
                return 0;
            case 13:
                h70Var.f375909s = aVar2.k(intValue);
                return 0;
            case 14:
                h70Var.f375910t = aVar2.c(intValue);
                return 0;
            case 15:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i38 = 0; i38 < size7; i38++) {
                    byte[] bArr8 = (byte[]) j37.get(i38);
                    r45.fe6 fe6Var = new r45.fe6();
                    if (bArr8 != null && bArr8.length > 0) {
                        fe6Var.parseFrom(bArr8);
                    }
                    h70Var.f375911u.add(fe6Var);
                }
                return 0;
            case 16:
                h70Var.f375912v = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
