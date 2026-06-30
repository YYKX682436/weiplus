package dd5;

/* loaded from: classes8.dex */
public final class c0 implements uc5.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f229097a;

    /* renamed from: b, reason: collision with root package name */
    public final long f229098b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.api.IEmojiInfo f229099c;

    public c0(java.lang.String md52, long j17, com.tencent.mm.api.IEmojiInfo emojiInfo) {
        kotlin.jvm.internal.o.g(md52, "md5");
        kotlin.jvm.internal.o.g(emojiInfo, "emojiInfo");
        this.f229097a = md52;
        this.f229098b = j17;
        this.f229099c = emojiInfo;
    }

    @Override // uc5.r0
    public java.util.List a() {
        java.lang.String Bi = ((com.tencent.mm.feature.emoji.q0) ((com.tencent.mm.feature.emoji.api.z5) i95.n0.c(com.tencent.mm.feature.emoji.api.z5.class))).Bi(this.f229097a);
        if (Bi == null || r26.n0.N(Bi)) {
            return kz5.p0.f313996d;
        }
        kotlin.jvm.internal.o.d(Bi);
        return kz5.b0.c(Bi);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd5.c0)) {
            return false;
        }
        dd5.c0 c0Var = (dd5.c0) obj;
        return kotlin.jvm.internal.o.b(this.f229097a, c0Var.f229097a) && this.f229098b == c0Var.f229098b && kotlin.jvm.internal.o.b(this.f229099c, c0Var.f229099c);
    }

    public int hashCode() {
        return (((this.f229097a.hashCode() * 31) + java.lang.Long.hashCode(this.f229098b)) * 31) + this.f229099c.hashCode();
    }

    public java.lang.String toString() {
        return "ViewModel(md5=" + this.f229097a + ", msgId=" + this.f229098b + ", emojiInfo=" + this.f229099c + ')';
    }
}
