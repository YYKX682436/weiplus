package so2;

/* loaded from: classes8.dex */
public final class n6 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f410501a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f410502b;

    /* renamed from: c, reason: collision with root package name */
    public int f410503c;

    /* renamed from: d, reason: collision with root package name */
    public int f410504d;

    /* renamed from: e, reason: collision with root package name */
    public final so2.p6 f410505e;

    /* renamed from: f, reason: collision with root package name */
    public final so2.a f410506f;

    /* renamed from: g, reason: collision with root package name */
    public final so2.m f410507g;

    /* renamed from: h, reason: collision with root package name */
    public final int f410508h;

    /* renamed from: i, reason: collision with root package name */
    public final r45.gb4 f410509i;

    /* renamed from: j, reason: collision with root package name */
    public final long f410510j;

    public n6(java.lang.String old, java.lang.String str, int i17, int i18, so2.p6 textType, so2.a actionType, so2.m contentType, int i19, r45.gb4 gb4Var, long j17, int i27, kotlin.jvm.internal.i iVar) {
        old = (i27 & 1) != 0 ? "" : old;
        str = (i27 & 2) != 0 ? "" : str;
        i17 = (i27 & 4) != 0 ? 0 : i17;
        i18 = (i27 & 8) != 0 ? 0 : i18;
        actionType = (i27 & 32) != 0 ? so2.a.f410240d : actionType;
        contentType = (i27 & 64) != 0 ? so2.m.f410475d : contentType;
        i19 = (i27 & 128) != 0 ? 0 : i19;
        gb4Var = (i27 & 256) != 0 ? null : gb4Var;
        j17 = (i27 & 512) != 0 ? java.lang.System.currentTimeMillis() : j17;
        kotlin.jvm.internal.o.g(old, "old");
        kotlin.jvm.internal.o.g(str, "new");
        kotlin.jvm.internal.o.g(textType, "textType");
        kotlin.jvm.internal.o.g(actionType, "actionType");
        kotlin.jvm.internal.o.g(contentType, "contentType");
        this.f410501a = old;
        this.f410502b = str;
        this.f410503c = i17;
        this.f410504d = i18;
        this.f410505e = textType;
        this.f410506f = actionType;
        this.f410507g = contentType;
        this.f410508h = i19;
        this.f410509i = gb4Var;
        this.f410510j = j17;
    }
}
