package xh2;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f454543a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f454544b;

    /* renamed from: c, reason: collision with root package name */
    public final long f454545c;

    public e(java.lang.String micTopicTitle, java.lang.String micTopic, long j17) {
        kotlin.jvm.internal.o.g(micTopicTitle, "micTopicTitle");
        kotlin.jvm.internal.o.g(micTopic, "micTopic");
        this.f454543a = micTopicTitle;
        this.f454544b = micTopic;
        this.f454545c = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xh2.e)) {
            return false;
        }
        xh2.e eVar = (xh2.e) obj;
        return kotlin.jvm.internal.o.b(this.f454543a, eVar.f454543a) && kotlin.jvm.internal.o.b(this.f454544b, eVar.f454544b) && this.f454545c == eVar.f454545c;
    }

    public int hashCode() {
        return (((this.f454543a.hashCode() * 31) + this.f454544b.hashCode()) * 31) + java.lang.Long.hashCode(this.f454545c);
    }

    public java.lang.String toString() {
        return "FinderLiveMicTopicData(micTopicTitle=" + this.f454543a + ", micTopic=" + this.f454544b + ", micTopicVersion=" + this.f454545c + ')';
    }
}
