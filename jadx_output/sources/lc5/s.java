package lc5;

/* loaded from: classes8.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final long f318029a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.ball.model.BallInfo f318030b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f318031c;

    public s(long j17, com.tencent.mm.plugin.ball.model.BallInfo ballInfo, java.lang.String talker) {
        kotlin.jvm.internal.o.g(ballInfo, "ballInfo");
        kotlin.jvm.internal.o.g(talker, "talker");
        this.f318029a = j17;
        this.f318030b = ballInfo;
        this.f318031c = talker;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lc5.s)) {
            return false;
        }
        lc5.s sVar = (lc5.s) obj;
        return this.f318029a == sVar.f318029a && kotlin.jvm.internal.o.b(this.f318030b, sVar.f318030b) && kotlin.jvm.internal.o.b(this.f318031c, sVar.f318031c);
    }

    public int hashCode() {
        return (((java.lang.Long.hashCode(this.f318029a) * 31) + this.f318030b.hashCode()) * 31) + this.f318031c.hashCode();
    }

    public java.lang.String toString() {
        return "ImageFloatBallData(msgId=" + this.f318029a + ", ballInfo=" + this.f318030b + ", talker=" + this.f318031c + ')';
    }
}
