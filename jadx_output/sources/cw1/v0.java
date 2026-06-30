package cw1;

/* loaded from: classes12.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f223359a;

    /* renamed from: b, reason: collision with root package name */
    public final long f223360b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f223361c;

    /* renamed from: d, reason: collision with root package name */
    public long f223362d;

    public v0(int i17, long j17, boolean z17) {
        this.f223359a = i17;
        this.f223360b = j17;
        this.f223361c = z17;
        this.f223362d = z17 ? j17 : 0L;
    }

    public /* synthetic */ v0(int i17, long j17, boolean z17, int i18, kotlin.jvm.internal.i iVar) {
        this(i17, (i18 & 2) != 0 ? 0L : j17, (i18 & 4) != 0 ? true : z17);
    }
}
