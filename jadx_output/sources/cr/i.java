package cr;

/* loaded from: classes12.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.storage.emotion.EmojiInfo f221568a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f221569b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f221570c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f221571d;

    /* renamed from: e, reason: collision with root package name */
    public final int f221572e;

    public i(com.tencent.mm.storage.emotion.EmojiInfo emojiInfo, java.lang.String url, java.lang.String path, java.lang.String authKey, int i17) {
        kotlin.jvm.internal.o.g(emojiInfo, "emojiInfo");
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(authKey, "authKey");
        this.f221568a = emojiInfo;
        this.f221569b = url;
        this.f221570c = path;
        this.f221571d = authKey;
        this.f221572e = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cr.i)) {
            return false;
        }
        cr.i iVar = (cr.i) obj;
        return kotlin.jvm.internal.o.b(this.f221568a, iVar.f221568a) && kotlin.jvm.internal.o.b(this.f221569b, iVar.f221569b) && kotlin.jvm.internal.o.b(this.f221570c, iVar.f221570c) && kotlin.jvm.internal.o.b(this.f221571d, iVar.f221571d) && this.f221572e == iVar.f221572e;
    }

    public int hashCode() {
        return (((((((this.f221568a.hashCode() * 31) + this.f221569b.hashCode()) * 31) + this.f221570c.hashCode()) * 31) + this.f221571d.hashCode()) * 31) + java.lang.Integer.hashCode(this.f221572e);
    }

    public java.lang.String toString() {
        return "EmojiFetcherConfig(emojiInfo=" + this.f221568a + ", url=" + this.f221569b + ", path=" + this.f221570c + ", authKey=" + this.f221571d + ", fetcherType=" + this.f221572e + ')';
    }
}
