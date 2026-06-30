package sn5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes15.dex */
public final class b {

    /* renamed from: m, reason: collision with root package name */
    public static final sn5.b f410154m;

    /* renamed from: n, reason: collision with root package name */
    public static final sn5.b f410155n;

    /* renamed from: o, reason: collision with root package name */
    public static final sn5.b f410156o;

    /* renamed from: p, reason: collision with root package name */
    public static final sn5.b f410157p;

    /* renamed from: q, reason: collision with root package name */
    public static final sn5.b f410158q;

    /* renamed from: r, reason: collision with root package name */
    public static final sn5.b f410159r;

    /* renamed from: s, reason: collision with root package name */
    public static final sn5.b f410160s;

    /* renamed from: t, reason: collision with root package name */
    public static final sn5.b f410161t;

    /* renamed from: u, reason: collision with root package name */
    public static final sn5.b f410162u;

    /* renamed from: v, reason: collision with root package name */
    public static final sn5.b f410163v;

    /* renamed from: w, reason: collision with root package name */
    public static final sn5.b f410164w;

    /* renamed from: x, reason: collision with root package name */
    public static final sn5.b f410165x;

    /* renamed from: y, reason: collision with root package name */
    public static final sn5.b f410166y;

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ sn5.b[] f410167z;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f410168d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f410169e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f410170f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f410171g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f410172h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f410173i;

    static {
        sn5.b bVar = new sn5.b("LoadFinish", 0, 2, false, false, true, false);
        f410154m = bVar;
        sn5.b bVar2 = new sn5.b("LoadReleased", 1, 2, false, false, false, false);
        f410155n = bVar2;
        sn5.b bVar3 = new sn5.b("Loading", 2, 2, false, true, false, false);
        f410156o = bVar3;
        sn5.b bVar4 = new sn5.b("None", 3, 0, false, false, false, false);
        f410157p = bVar4;
        sn5.b bVar5 = new sn5.b("PullDownCanceled", 4, 1, false, false, false, false);
        f410158q = bVar5;
        sn5.b bVar6 = new sn5.b("PullDownToRefresh", 5, 1, true, false, false, false);
        f410159r = bVar6;
        sn5.b bVar7 = new sn5.b("PullUpCanceled", 6, 2, false, false, false, false);
        f410160s = bVar7;
        sn5.b bVar8 = new sn5.b("PullUpToLoad", 7, 2, true, false, false, false);
        f410161t = bVar8;
        sn5.b bVar9 = new sn5.b("RefreshFinish", 8, 1, false, false, true, false);
        f410162u = bVar9;
        sn5.b bVar10 = new sn5.b("RefreshReleased", 9, 1, false, false, false, false);
        f410163v = bVar10;
        sn5.b bVar11 = new sn5.b("Refreshing", 10, 1, false, true, false, false);
        f410164w = bVar11;
        sn5.b bVar12 = new sn5.b("ReleaseToLoad", 11, 2, true, false, false, true);
        f410165x = bVar12;
        sn5.b bVar13 = new sn5.b("ReleaseToRefresh", 12, 1, true, false, false, true);
        f410166y = bVar13;
        sn5.b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12, bVar13};
        f410167z = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17, int i18, boolean z17, boolean z18, boolean z19, boolean z27) {
        this.f410168d = i18 == 1;
        this.f410169e = i18 == 2;
        this.f410170f = z17;
        this.f410171g = z18;
        this.f410172h = z19;
        this.f410173i = z27;
    }

    public static sn5.b valueOf(java.lang.String str) {
        return (sn5.b) java.lang.Enum.valueOf(sn5.b.class, str);
    }

    public static sn5.b[] values() {
        return (sn5.b[]) f410167z.clone();
    }
}
