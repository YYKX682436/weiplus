package fr;

/* loaded from: classes12.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.storage.emotion.EmojiInfo f265680a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f265681b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f265682c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f265683d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f265684e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f265685f;

    /* renamed from: g, reason: collision with root package name */
    public final int f265686g;

    public c(com.tencent.mm.storage.emotion.EmojiInfo emojiInfo, java.lang.String verifyMd5, boolean z17, java.lang.String aesKey, java.lang.String path, java.lang.String tempPath, int i17) {
        kotlin.jvm.internal.o.g(emojiInfo, "emojiInfo");
        kotlin.jvm.internal.o.g(verifyMd5, "verifyMd5");
        kotlin.jvm.internal.o.g(aesKey, "aesKey");
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(tempPath, "tempPath");
        this.f265680a = emojiInfo;
        this.f265681b = verifyMd5;
        this.f265682c = z17;
        this.f265683d = aesKey;
        this.f265684e = path;
        this.f265685f = tempPath;
        this.f265686g = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fr.c)) {
            return false;
        }
        fr.c cVar = (fr.c) obj;
        return kotlin.jvm.internal.o.b(this.f265680a, cVar.f265680a) && kotlin.jvm.internal.o.b(this.f265681b, cVar.f265681b) && this.f265682c == cVar.f265682c && kotlin.jvm.internal.o.b(this.f265683d, cVar.f265683d) && kotlin.jvm.internal.o.b(this.f265684e, cVar.f265684e) && kotlin.jvm.internal.o.b(this.f265685f, cVar.f265685f) && this.f265686g == cVar.f265686g;
    }

    public int hashCode() {
        return (((((((((((this.f265680a.hashCode() * 31) + this.f265681b.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f265682c)) * 31) + this.f265683d.hashCode()) * 31) + this.f265684e.hashCode()) * 31) + this.f265685f.hashCode()) * 31) + java.lang.Integer.hashCode(this.f265686g);
    }

    public java.lang.String toString() {
        return "EmojiVerifyConfig(emojiInfo=" + this.f265680a + ", verifyMd5=" + this.f265681b + ", needDecrypt=" + this.f265682c + ", aesKey=" + this.f265683d + ", path=" + this.f265684e + ", tempPath=" + this.f265685f + ", fetcherType=" + this.f265686g + ')';
    }
}
