package h10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes15.dex */
public final class b {
    public static final h10.b A;
    public static final h10.b B;
    public static final h10.b C;
    public static final /* synthetic */ h10.b[] D;

    /* renamed from: e, reason: collision with root package name */
    public static final h10.b f277958e;

    /* renamed from: f, reason: collision with root package name */
    public static final h10.b f277959f;

    /* renamed from: g, reason: collision with root package name */
    public static final h10.b f277960g;

    /* renamed from: h, reason: collision with root package name */
    public static final h10.b f277961h;

    /* renamed from: i, reason: collision with root package name */
    public static final h10.b f277962i;

    /* renamed from: m, reason: collision with root package name */
    public static final h10.b f277963m;

    /* renamed from: n, reason: collision with root package name */
    public static final h10.b f277964n;

    /* renamed from: o, reason: collision with root package name */
    public static final h10.b f277965o;

    /* renamed from: p, reason: collision with root package name */
    public static final h10.b f277966p;

    /* renamed from: q, reason: collision with root package name */
    public static final h10.b f277967q;

    /* renamed from: r, reason: collision with root package name */
    public static final h10.b f277968r;

    /* renamed from: s, reason: collision with root package name */
    public static final h10.b f277969s;

    /* renamed from: t, reason: collision with root package name */
    public static final h10.b f277970t;

    /* renamed from: u, reason: collision with root package name */
    public static final h10.b f277971u;

    /* renamed from: v, reason: collision with root package name */
    public static final h10.b f277972v;

    /* renamed from: w, reason: collision with root package name */
    public static final h10.b f277973w;

    /* renamed from: x, reason: collision with root package name */
    public static final h10.b f277974x;

    /* renamed from: y, reason: collision with root package name */
    public static final h10.b f277975y;

    /* renamed from: z, reason: collision with root package name */
    public static final h10.b f277976z;

    /* renamed from: d, reason: collision with root package name */
    public final int f277977d;

    static {
        h10.b bVar = new h10.b("TAP", 0, 1);
        f277958e = bVar;
        h10.b bVar2 = new h10.b("LONG_PRESS", 1, 2);
        f277959f = bVar2;
        h10.b bVar3 = new h10.b("SCROLL_LEFT", 2, 4);
        f277960g = bVar3;
        h10.b bVar4 = new h10.b("SCROLL_RIGHT", 3, 8);
        f277961h = bVar4;
        h10.b bVar5 = new h10.b("SCROLL_UP", 4, 16);
        f277962i = bVar5;
        h10.b bVar6 = new h10.b("SCROLL_DOWN", 5, 32);
        f277963m = bVar6;
        h10.b bVar7 = new h10.b("INCREASE", 6, 64);
        f277964n = bVar7;
        h10.b bVar8 = new h10.b("DECREASE", 7, 128);
        f277965o = bVar8;
        h10.b bVar9 = new h10.b("SHOW_ON_SCREEN", 8, 256);
        f277966p = bVar9;
        h10.b bVar10 = new h10.b("MOVE_CURSOR_FORWARD_BY_CHARACTER", 9, 512);
        f277967q = bVar10;
        h10.b bVar11 = new h10.b("MOVE_CURSOR_BACKWARD_BY_CHARACTER", 10, 1024);
        f277968r = bVar11;
        h10.b bVar12 = new h10.b("SET_SELECTION", 11, 2048);
        f277969s = bVar12;
        h10.b bVar13 = new h10.b("COPY", 12, 4096);
        f277970t = bVar13;
        h10.b bVar14 = new h10.b("CUT", 13, 8192);
        f277971u = bVar14;
        h10.b bVar15 = new h10.b("PASTE", 14, 16384);
        f277972v = bVar15;
        h10.b bVar16 = new h10.b("DID_GAIN_ACCESSIBILITY_FOCUS", 15, 32768);
        f277973w = bVar16;
        h10.b bVar17 = new h10.b("DID_LOSE_ACCESSIBILITY_FOCUS", 16, 65536);
        f277974x = bVar17;
        h10.b bVar18 = new h10.b("CUSTOM_ACTION", 17, 131072);
        f277975y = bVar18;
        h10.b bVar19 = new h10.b("DISMISS", 18, 262144);
        f277976z = bVar19;
        h10.b bVar20 = new h10.b("MOVE_CURSOR_FORWARD_BY_WORD", 19, 524288);
        A = bVar20;
        h10.b bVar21 = new h10.b("MOVE_CURSOR_BACKWARD_BY_WORD", 20, 1048576);
        B = bVar21;
        h10.b bVar22 = new h10.b("SET_TEXT", 21, 2097152);
        C = bVar22;
        h10.b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14, bVar15, bVar16, bVar17, bVar18, bVar19, bVar20, bVar21, bVar22};
        D = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17, int i18) {
        this.f277977d = i18;
    }

    public static h10.b valueOf(java.lang.String str) {
        return (h10.b) java.lang.Enum.valueOf(h10.b.class, str);
    }

    public static h10.b[] values() {
        return (h10.b[]) D.clone();
    }
}
