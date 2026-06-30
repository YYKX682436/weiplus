package m92;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class j {
    public static final m92.j A;
    public static final m92.j B;
    public static final m92.j C;
    public static final /* synthetic */ m92.j[] D;

    /* renamed from: e, reason: collision with root package name */
    public static final m92.j f324990e;

    /* renamed from: f, reason: collision with root package name */
    public static final m92.j f324991f;

    /* renamed from: g, reason: collision with root package name */
    public static final m92.j f324992g;

    /* renamed from: h, reason: collision with root package name */
    public static final m92.j f324993h;

    /* renamed from: i, reason: collision with root package name */
    public static final m92.j f324994i;

    /* renamed from: m, reason: collision with root package name */
    public static final m92.j f324995m;

    /* renamed from: n, reason: collision with root package name */
    public static final m92.j f324996n;

    /* renamed from: o, reason: collision with root package name */
    public static final m92.j f324997o;

    /* renamed from: p, reason: collision with root package name */
    public static final m92.j f324998p;

    /* renamed from: q, reason: collision with root package name */
    public static final m92.j f324999q;

    /* renamed from: r, reason: collision with root package name */
    public static final m92.j f325000r;

    /* renamed from: s, reason: collision with root package name */
    public static final m92.j f325001s;

    /* renamed from: t, reason: collision with root package name */
    public static final m92.j f325002t;

    /* renamed from: u, reason: collision with root package name */
    public static final m92.j f325003u;

    /* renamed from: v, reason: collision with root package name */
    public static final m92.j f325004v;

    /* renamed from: w, reason: collision with root package name */
    public static final m92.j f325005w;

    /* renamed from: x, reason: collision with root package name */
    public static final m92.j f325006x;

    /* renamed from: y, reason: collision with root package name */
    public static final m92.j f325007y;

    /* renamed from: z, reason: collision with root package name */
    public static final m92.j f325008z;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f325009d;

    static {
        m92.j jVar = new m92.j("UPGRADE", 0, null, 1, null);
        f324990e = jVar;
        m92.j jVar2 = new m92.j("ACCOUNT_CREATE", 1, null, 1, null);
        f324991f = jVar2;
        m92.j jVar3 = new m92.j("ACCOUNT_MODIFY", 2, null, 1, null);
        f324992g = jVar3;
        m92.j jVar4 = new m92.j("FINDER_GET_MENTION_LIST", 3, null, 1, null);
        f324993h = jVar4;
        m92.j jVar5 = new m92.j("FINDER_ORIGINAL", 4, null, 1, null);
        m92.j jVar6 = new m92.j("FINDER_INIT", 5, null, 1, null);
        f324994i = jVar6;
        m92.j jVar7 = new m92.j("FINDER_RE_INIT", 6, null, 1, null);
        f324995m = jVar7;
        m92.j jVar8 = new m92.j("SAVE_ROLE_CHOOSER", 7, null, 1, null);
        f324996n = jVar8;
        m92.j jVar9 = new m92.j("MODIFY_USER", 8, null, 1, null);
        f324997o = jVar9;
        m92.j jVar10 = new m92.j("USER_PAGE", 9, null, 1, null);
        f324998p = jVar10;
        m92.j jVar11 = new m92.j("USER_PREPARE", 10, null, 1, null);
        f324999q = jVar11;
        m92.j jVar12 = new m92.j("JOIN_LIVE", 11, null, 1, null);
        f325000r = jVar12;
        m92.j jVar13 = new m92.j("LIVE_LOTTERY_CREATE", 12, null, 1, null);
        f325001s = jVar13;
        m92.j jVar14 = new m92.j("LIVE_UPDATE_ANCHOR_STATUS", 13, null, 1, null);
        f325002t = jVar14;
        m92.j jVar15 = new m92.j("AGREE_SAVE_PHONE", 14, null, 1, null);
        f325003u = jVar15;
        m92.j jVar16 = new m92.j("FINDER_CONFIG", 15, null, 1, null);
        f325004v = jVar16;
        m92.j jVar17 = new m92.j("FINDER_SETTING_PERSONALIZED", 16, null, 1, null);
        f325005w = jVar17;
        m92.j jVar18 = new m92.j("MOD_OVERSEA", 17, null, 1, null);
        f325006x = jVar18;
        m92.j jVar19 = new m92.j("APP_START_UP", 18, null, 1, null);
        f325007y = jVar19;
        m92.j jVar20 = new m92.j("SYS_MSG_COUNT", 19, null, 1, null);
        f325008z = jVar20;
        m92.j jVar21 = new m92.j("FINDER_MSG_STATUS_SETTING", 20, null, 1, null);
        A = jVar21;
        m92.j jVar22 = new m92.j("FINDER_SYNC", 21, null, 1, null);
        B = jVar22;
        m92.j jVar23 = new m92.j("MY_TAB_FINDER_CLICK", 22, null, 1, null);
        C = jVar23;
        m92.j[] jVarArr = {jVar, jVar2, jVar3, jVar4, jVar5, jVar6, jVar7, jVar8, jVar9, jVar10, jVar11, jVar12, jVar13, jVar14, jVar15, jVar16, jVar17, jVar18, jVar19, jVar20, jVar21, jVar22, jVar23, new m92.j("NEW_XML_ORDER_CENTER_REDDOT_CONSUMER", 23, null, 1, null)};
        D = jVarArr;
        rz5.b.a(jVarArr);
    }

    public j(java.lang.String str, int i17, java.util.Set set, int i18, kotlin.jvm.internal.i iVar) {
        this.f325009d = (i18 & 1) != 0 ? kz5.r0.f314002d : set;
    }

    public static m92.j valueOf(java.lang.String str) {
        return (m92.j) java.lang.Enum.valueOf(m92.j.class, str);
    }

    public static m92.j[] values() {
        return (m92.j[]) D.clone();
    }
}
