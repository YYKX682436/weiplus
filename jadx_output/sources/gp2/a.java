package gp2;

/* loaded from: classes10.dex */
public final class a extends gp2.b {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f274195b;

    /* renamed from: c, reason: collision with root package name */
    public final so2.h1 f274196c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f274197d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.lang.String liveUrl, so2.h1 feed, boolean z17) {
        super(liveUrl);
        kotlin.jvm.internal.o.g(liveUrl, "liveUrl");
        kotlin.jvm.internal.o.g(feed, "feed");
        this.f274195b = liveUrl;
        this.f274196c = feed;
        this.f274197d = z17;
    }

    public java.lang.String toString() {
        return "feed:" + this.f274196c + " liveUrl:" + this.f274195b + " isLeftPos:" + this.f274197d;
    }
}
