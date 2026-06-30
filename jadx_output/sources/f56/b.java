package f56;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'e' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes16.dex */
public final class b {
    public static final f56.b A;
    public static final f56.b B;
    public static final f56.b C;
    public static final f56.b D;
    public static final f56.b E;
    public static final f56.b F;
    public static final f56.b G;
    public static final f56.b H;
    public static final f56.b I;

    /* renamed from: J, reason: collision with root package name */
    public static final f56.b f259776J;
    public static final f56.b K;
    public static final f56.b L;
    public static final f56.b M;
    public static final f56.b N;
    public static final f56.b P;
    public static final f56.b Q;
    public static final f56.b R;
    public static final f56.b[] S;
    public static final /* synthetic */ f56.b[] T;

    /* renamed from: e, reason: collision with root package name */
    public static final f56.b f259777e;

    /* renamed from: f, reason: collision with root package name */
    public static final f56.b f259778f;

    /* renamed from: g, reason: collision with root package name */
    public static final f56.b f259779g;

    /* renamed from: h, reason: collision with root package name */
    public static final f56.b f259780h;

    /* renamed from: i, reason: collision with root package name */
    public static final f56.b f259781i;

    /* renamed from: m, reason: collision with root package name */
    public static final f56.b f259782m;

    /* renamed from: n, reason: collision with root package name */
    public static final f56.b f259783n;

    /* renamed from: o, reason: collision with root package name */
    public static final f56.b f259784o;

    /* renamed from: p, reason: collision with root package name */
    public static final f56.b f259785p;

    /* renamed from: q, reason: collision with root package name */
    public static final f56.b f259786q;

    /* renamed from: r, reason: collision with root package name */
    public static final f56.b f259787r;

    /* renamed from: s, reason: collision with root package name */
    public static final f56.b f259788s;

    /* renamed from: t, reason: collision with root package name */
    public static final f56.b f259789t;

    /* renamed from: u, reason: collision with root package name */
    public static final f56.b f259790u;

    /* renamed from: v, reason: collision with root package name */
    public static final f56.b f259791v;

    /* renamed from: w, reason: collision with root package name */
    public static final f56.b f259792w;

    /* renamed from: x, reason: collision with root package name */
    public static final f56.b f259793x;

    /* renamed from: y, reason: collision with root package name */
    public static final f56.b f259794y;

    /* renamed from: z, reason: collision with root package name */
    public static final f56.b f259795z;

    /* renamed from: d, reason: collision with root package name */
    public final g56.a f259796d;

    static {
        f56.b bVar;
        g56.a aVar = g56.a.INTEGER;
        f56.b bVar2 = new f56.b("POSFIXINT", 0, aVar);
        f259777e = bVar2;
        g56.a aVar2 = g56.a.MAP;
        f56.b bVar3 = new f56.b("FIXMAP", 1, aVar2);
        f259778f = bVar3;
        g56.a aVar3 = g56.a.ARRAY;
        f56.b bVar4 = new f56.b("FIXARRAY", 2, aVar3);
        f259779g = bVar4;
        g56.a aVar4 = g56.a.STRING;
        f56.b bVar5 = new f56.b("FIXSTR", 3, aVar4);
        f259780h = bVar5;
        f56.b bVar6 = new f56.b("NIL", 4, g56.a.NIL);
        f259781i = bVar6;
        f56.b bVar7 = new f56.b("NEVER_USED", 5, null);
        f259782m = bVar7;
        f56.b bVar8 = new f56.b("BOOLEAN", 6, g56.a.BOOLEAN);
        f259783n = bVar8;
        g56.a aVar5 = g56.a.BINARY;
        f56.b bVar9 = new f56.b("BIN8", 7, aVar5);
        f259784o = bVar9;
        f56.b bVar10 = new f56.b("BIN16", 8, aVar5);
        f259785p = bVar10;
        f56.b bVar11 = new f56.b("BIN32", 9, aVar5);
        f259786q = bVar11;
        g56.a aVar6 = g56.a.EXTENSION;
        f56.b bVar12 = new f56.b("EXT8", 10, aVar6);
        f259787r = bVar12;
        f56.b bVar13 = new f56.b("EXT16", 11, aVar6);
        f259788s = bVar13;
        f56.b bVar14 = new f56.b("EXT32", 12, aVar6);
        f259789t = bVar14;
        g56.a aVar7 = g56.a.FLOAT;
        f56.b bVar15 = new f56.b("FLOAT32", 13, aVar7);
        f259790u = bVar15;
        f56.b bVar16 = new f56.b("FLOAT64", 14, aVar7);
        f259791v = bVar16;
        f56.b bVar17 = new f56.b("UINT8", 15, aVar);
        f259792w = bVar17;
        f56.b bVar18 = new f56.b("UINT16", 16, aVar);
        f259793x = bVar18;
        f56.b bVar19 = new f56.b("UINT32", 17, aVar);
        f259794y = bVar19;
        f56.b bVar20 = new f56.b("UINT64", 18, aVar);
        f259795z = bVar20;
        f56.b bVar21 = new f56.b("INT8", 19, aVar);
        A = bVar21;
        f56.b bVar22 = new f56.b("INT16", 20, aVar);
        B = bVar22;
        f56.b bVar23 = new f56.b("INT32", 21, aVar);
        C = bVar23;
        f56.b bVar24 = new f56.b("INT64", 22, aVar);
        D = bVar24;
        f56.b bVar25 = new f56.b("FIXEXT1", 23, aVar6);
        E = bVar25;
        f56.b bVar26 = new f56.b("FIXEXT2", 24, aVar6);
        F = bVar26;
        f56.b bVar27 = new f56.b("FIXEXT4", 25, aVar6);
        G = bVar27;
        f56.b bVar28 = new f56.b("FIXEXT8", 26, aVar6);
        H = bVar28;
        f56.b bVar29 = new f56.b("FIXEXT16", 27, aVar6);
        I = bVar29;
        f56.b bVar30 = new f56.b("STR8", 28, aVar4);
        f259776J = bVar30;
        f56.b bVar31 = new f56.b("STR16", 29, aVar4);
        K = bVar31;
        f56.b bVar32 = new f56.b("STR32", 30, aVar4);
        L = bVar32;
        f56.b bVar33 = new f56.b("ARRAY16", 31, aVar3);
        M = bVar33;
        f56.b bVar34 = new f56.b("ARRAY32", 32, aVar3);
        N = bVar34;
        f56.b bVar35 = new f56.b("MAP16", 33, aVar2);
        P = bVar35;
        f56.b bVar36 = new f56.b("MAP32", 34, aVar2);
        Q = bVar36;
        f56.b bVar37 = new f56.b("NEGFIXINT", 35, aVar);
        R = bVar37;
        T = new f56.b[]{bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14, bVar15, bVar16, bVar17, bVar18, bVar19, bVar20, bVar21, bVar22, bVar23, bVar24, bVar25, bVar26, bVar27, bVar28, bVar29, bVar30, bVar31, bVar32, bVar33, bVar34, bVar35, bVar36, bVar37};
        S = new f56.b[256];
        for (int i17 = 0; i17 <= 255; i17++) {
            byte b17 = (byte) i17;
            if (!((b17 & Byte.MIN_VALUE) == 0)) {
                int i18 = b17 & (-32);
                if (i18 == -32) {
                    bVar = R;
                } else if (!(i18 == -96)) {
                    int i19 = b17 & (-16);
                    if (i19 == -112) {
                        bVar = f259779g;
                    } else if (!(i19 == -128)) {
                        switch (b17) {
                            case -64:
                                bVar = f259781i;
                                break;
                            case -63:
                            default:
                                bVar = f259782m;
                                break;
                            case -62:
                            case -61:
                                bVar = f259783n;
                                break;
                            case -60:
                                bVar = f259784o;
                                break;
                            case -59:
                                bVar = f259785p;
                                break;
                            case -58:
                                bVar = f259786q;
                                break;
                            case -57:
                                bVar = f259787r;
                                break;
                            case -56:
                                bVar = f259788s;
                                break;
                            case -55:
                                bVar = f259789t;
                                break;
                            case -54:
                                bVar = f259790u;
                                break;
                            case -53:
                                bVar = f259791v;
                                break;
                            case -52:
                                bVar = f259792w;
                                break;
                            case -51:
                                bVar = f259793x;
                                break;
                            case -50:
                                bVar = f259794y;
                                break;
                            case -49:
                                bVar = f259795z;
                                break;
                            case -48:
                                bVar = A;
                                break;
                            case -47:
                                bVar = B;
                                break;
                            case -46:
                                bVar = C;
                                break;
                            case -45:
                                bVar = D;
                                break;
                            case -44:
                                bVar = E;
                                break;
                            case -43:
                                bVar = F;
                                break;
                            case -42:
                                bVar = G;
                                break;
                            case -41:
                                bVar = H;
                                break;
                            case -40:
                                bVar = I;
                                break;
                            case -39:
                                bVar = f259776J;
                                break;
                            case -38:
                                bVar = K;
                                break;
                            case -37:
                                bVar = L;
                                break;
                            case -36:
                                bVar = M;
                                break;
                            case -35:
                                bVar = N;
                                break;
                            case -34:
                                bVar = P;
                                break;
                            case -33:
                                bVar = Q;
                                break;
                        }
                    } else {
                        bVar = f259778f;
                    }
                } else {
                    bVar = f259780h;
                }
            } else {
                bVar = f259777e;
            }
            S[i17] = bVar;
        }
    }

    public b(java.lang.String str, int i17, g56.a aVar) {
        this.f259796d = aVar;
    }

    public static f56.b valueOf(java.lang.String str) {
        return (f56.b) java.lang.Enum.valueOf(f56.b.class, str);
    }

    public static f56.b[] values() {
        return (f56.b[]) T.clone();
    }
}
