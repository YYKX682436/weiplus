package h22;

/* loaded from: classes15.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public boolean f278296a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f278297b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f278298c;

    /* renamed from: d, reason: collision with root package name */
    public long f278299d;

    /* renamed from: e, reason: collision with root package name */
    public final int f278300e;

    /* renamed from: f, reason: collision with root package name */
    public int f278301f;

    /* renamed from: g, reason: collision with root package name */
    public int f278302g;

    public f(boolean z17, boolean z18, boolean z19, long j17, int i17, int i18, int i19, int i27, kotlin.jvm.internal.i iVar) {
        z17 = (i27 & 1) != 0 ? false : z17;
        z18 = (i27 & 2) != 0 ? true : z18;
        z19 = (i27 & 4) != 0 ? true : z19;
        j17 = (i27 & 8) != 0 ? 5000L : j17;
        i17 = (i27 & 16) != 0 ? 500 : i17;
        i18 = (i27 & 32) != 0 ? 0 : i18;
        i19 = (i27 & 64) != 0 ? 30 : i19;
        this.f278296a = z17;
        this.f278297b = z18;
        this.f278298c = z19;
        this.f278299d = j17;
        this.f278300e = i17;
        this.f278301f = i18;
        this.f278302g = i19;
    }
}
