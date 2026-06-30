package jr;

/* loaded from: classes4.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final long f301318a;

    /* renamed from: b, reason: collision with root package name */
    public final int f301319b;

    /* renamed from: c, reason: collision with root package name */
    public final int f301320c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f301321d;

    public q(long j17, int i17, int i18, java.lang.String preloadSessionId, int i19, kotlin.jvm.internal.i iVar) {
        j17 = (i19 & 1) != 0 ? 0L : j17;
        i17 = (i19 & 2) != 0 ? 0 : i17;
        i18 = (i19 & 4) != 0 ? 0 : i18;
        preloadSessionId = (i19 & 8) != 0 ? "-1" : preloadSessionId;
        kotlin.jvm.internal.o.g(preloadSessionId, "preloadSessionId");
        this.f301318a = j17;
        this.f301319b = i17;
        this.f301320c = i18;
        this.f301321d = preloadSessionId;
    }
}
