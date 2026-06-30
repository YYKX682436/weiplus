package dd5;

/* loaded from: classes11.dex */
public final class e3 implements uc5.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f229125a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f229126b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f229127c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f229128d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f229129e;

    public e3(long j17, java.lang.String talker, java.lang.String videoThumbKey, java.lang.String videoThumbPath, java.lang.String videoDuration) {
        kotlin.jvm.internal.o.g(talker, "talker");
        kotlin.jvm.internal.o.g(videoThumbKey, "videoThumbKey");
        kotlin.jvm.internal.o.g(videoThumbPath, "videoThumbPath");
        kotlin.jvm.internal.o.g(videoDuration, "videoDuration");
        this.f229125a = j17;
        this.f229126b = talker;
        this.f229127c = videoThumbKey;
        this.f229128d = videoThumbPath;
        this.f229129e = videoDuration;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd5.e3)) {
            return false;
        }
        dd5.e3 e3Var = (dd5.e3) obj;
        return this.f229125a == e3Var.f229125a && kotlin.jvm.internal.o.b(this.f229126b, e3Var.f229126b) && kotlin.jvm.internal.o.b(this.f229127c, e3Var.f229127c) && kotlin.jvm.internal.o.b(this.f229128d, e3Var.f229128d) && kotlin.jvm.internal.o.b(this.f229129e, e3Var.f229129e);
    }

    public int hashCode() {
        return (((((((java.lang.Long.hashCode(this.f229125a) * 31) + this.f229126b.hashCode()) * 31) + this.f229127c.hashCode()) * 31) + this.f229128d.hashCode()) * 31) + this.f229129e.hashCode();
    }

    public java.lang.String toString() {
        return "ViewModel(msgId=" + this.f229125a + ", talker=" + this.f229126b + ", videoThumbKey=" + this.f229127c + ", videoThumbPath=" + this.f229128d + ", videoDuration=" + this.f229129e + ')';
    }
}
