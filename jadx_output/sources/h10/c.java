package h10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes15.dex */
public final class c {
    public static final h10.c A;
    public static final h10.c B;
    public static final h10.c C;
    public static final /* synthetic */ h10.c[] D;

    /* renamed from: e, reason: collision with root package name */
    public static final h10.c f277978e;

    /* renamed from: f, reason: collision with root package name */
    public static final h10.c f277979f;

    /* renamed from: g, reason: collision with root package name */
    public static final h10.c f277980g;

    /* renamed from: h, reason: collision with root package name */
    public static final h10.c f277981h;

    /* renamed from: i, reason: collision with root package name */
    public static final h10.c f277982i;

    /* renamed from: m, reason: collision with root package name */
    public static final h10.c f277983m;

    /* renamed from: n, reason: collision with root package name */
    public static final h10.c f277984n;

    /* renamed from: o, reason: collision with root package name */
    public static final h10.c f277985o;

    /* renamed from: p, reason: collision with root package name */
    public static final h10.c f277986p;

    /* renamed from: q, reason: collision with root package name */
    public static final h10.c f277987q;

    /* renamed from: r, reason: collision with root package name */
    public static final h10.c f277988r;

    /* renamed from: s, reason: collision with root package name */
    public static final h10.c f277989s;

    /* renamed from: t, reason: collision with root package name */
    public static final h10.c f277990t;

    /* renamed from: u, reason: collision with root package name */
    public static final h10.c f277991u;

    /* renamed from: v, reason: collision with root package name */
    public static final h10.c f277992v;

    /* renamed from: w, reason: collision with root package name */
    public static final h10.c f277993w;

    /* renamed from: x, reason: collision with root package name */
    public static final h10.c f277994x;

    /* renamed from: y, reason: collision with root package name */
    public static final h10.c f277995y;

    /* renamed from: z, reason: collision with root package name */
    public static final h10.c f277996z;

    /* renamed from: d, reason: collision with root package name */
    public final int f277997d;

    static {
        h10.c cVar = new h10.c("HAS_CHECKED_STATE", 0, 1);
        f277978e = cVar;
        h10.c cVar2 = new h10.c("IS_CHECKED", 1, 2);
        f277979f = cVar2;
        h10.c cVar3 = new h10.c("IS_SELECTED", 2, 4);
        f277980g = cVar3;
        h10.c cVar4 = new h10.c("IS_BUTTON", 3, 8);
        f277981h = cVar4;
        h10.c cVar5 = new h10.c("IS_TEXT_FIELD", 4, 16);
        f277982i = cVar5;
        h10.c cVar6 = new h10.c("IS_FOCUSED", 5, 32);
        f277983m = cVar6;
        h10.c cVar7 = new h10.c("HAS_ENABLED_STATE", 6, 64);
        f277984n = cVar7;
        h10.c cVar8 = new h10.c("IS_ENABLED", 7, 128);
        f277985o = cVar8;
        h10.c cVar9 = new h10.c("IS_IN_MUTUALLY_EXCLUSIVE_GROUP", 8, 256);
        f277986p = cVar9;
        h10.c cVar10 = new h10.c("IS_HEADER", 9, 512);
        f277987q = cVar10;
        h10.c cVar11 = new h10.c("IS_OBSCURED", 10, 1024);
        f277988r = cVar11;
        h10.c cVar12 = new h10.c("SCOPES_ROUTE", 11, 2048);
        f277989s = cVar12;
        h10.c cVar13 = new h10.c("NAMES_ROUTE", 12, 4096);
        f277990t = cVar13;
        h10.c cVar14 = new h10.c("IS_HIDDEN", 13, 8192);
        f277991u = cVar14;
        h10.c cVar15 = new h10.c("IS_IMAGE", 14, 16384);
        f277992v = cVar15;
        h10.c cVar16 = new h10.c("IS_LIVE_REGION", 15, 32768);
        f277993w = cVar16;
        h10.c cVar17 = new h10.c("HAS_TOGGLED_STATE", 16, 65536);
        f277994x = cVar17;
        h10.c cVar18 = new h10.c("IS_TOGGLED", 17, 131072);
        f277995y = cVar18;
        h10.c cVar19 = new h10.c("HAS_IMPLICIT_SCROLLING", 18, 262144);
        f277996z = cVar19;
        h10.c cVar20 = new h10.c("IS_MULTILINE", 19, 524288);
        h10.c cVar21 = new h10.c("IS_READ_ONLY", 20, 1048576);
        A = cVar21;
        h10.c cVar22 = new h10.c("IS_FOCUSABLE", 21, 2097152);
        B = cVar22;
        h10.c cVar23 = new h10.c("IS_LINK", 22, 4194304);
        h10.c cVar24 = new h10.c("IS_SLIDER", 23, 8388608);
        C = cVar24;
        h10.c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12, cVar13, cVar14, cVar15, cVar16, cVar17, cVar18, cVar19, cVar20, cVar21, cVar22, cVar23, cVar24, new h10.c("IS_KEYBOARD_KEY", 24, com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62), new h10.c("IS_CHECK_STATE_MIXED", 25, com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCHighTierLevel62), new h10.c("HAS_EXPANDED_STATE", 26, 67108864), new h10.c("IS_EXPANDED", 27, 134217728)};
        D = cVarArr;
        rz5.b.a(cVarArr);
    }

    public c(java.lang.String str, int i17, int i18) {
        this.f277997d = i18;
    }

    public static h10.c valueOf(java.lang.String str) {
        return (h10.c) java.lang.Enum.valueOf(h10.c.class, str);
    }

    public static h10.c[] values() {
        return (h10.c[]) D.clone();
    }
}
