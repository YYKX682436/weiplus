package mt1;

/* loaded from: classes12.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f331233a;

    /* renamed from: b, reason: collision with root package name */
    public long f331234b;

    /* renamed from: c, reason: collision with root package name */
    public long f331235c;

    public k0(java.lang.String username, long j17, long j18, int i17, kotlin.jvm.internal.i iVar) {
        username = (i17 & 1) != 0 ? "" : username;
        j17 = (i17 & 2) != 0 ? 0L : j17;
        j18 = (i17 & 4) != 0 ? 0L : j18;
        kotlin.jvm.internal.o.g(username, "username");
        this.f331233a = username;
        this.f331234b = j17;
        this.f331235c = j18;
    }
}
