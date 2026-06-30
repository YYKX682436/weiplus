package eu0;

/* loaded from: classes5.dex */
public final class n {

    /* renamed from: h, reason: collision with root package name */
    public static final eu0.m f256719h = new eu0.m(null);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f256720a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f256721b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f256722c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f256723d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f256724e;

    /* renamed from: f, reason: collision with root package name */
    public final long f256725f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f256726g;

    public n(java.lang.String musicID, java.lang.String musicName, java.lang.String authorName, java.lang.String coverUrl, java.lang.String musicFilePath, long j17, boolean z17) {
        kotlin.jvm.internal.o.g(musicID, "musicID");
        kotlin.jvm.internal.o.g(musicName, "musicName");
        kotlin.jvm.internal.o.g(authorName, "authorName");
        kotlin.jvm.internal.o.g(coverUrl, "coverUrl");
        kotlin.jvm.internal.o.g(musicFilePath, "musicFilePath");
        this.f256720a = musicID;
        this.f256721b = musicName;
        this.f256722c = authorName;
        this.f256723d = coverUrl;
        this.f256724e = musicFilePath;
        this.f256725f = j17;
        this.f256726g = z17;
    }

    public final org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("musicID", this.f256720a);
        jSONObject.put("musicName", this.f256721b);
        jSONObject.put("authorName", this.f256722c);
        jSONObject.put("coverUrl", this.f256723d);
        jSONObject.put("musicFilePath", this.f256724e);
        jSONObject.put("durationInMs", this.f256725f);
        jSONObject.put("isMusicOn", this.f256726g);
        return jSONObject;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eu0.n)) {
            return false;
        }
        eu0.n nVar = (eu0.n) obj;
        return kotlin.jvm.internal.o.b(this.f256720a, nVar.f256720a) && kotlin.jvm.internal.o.b(this.f256721b, nVar.f256721b) && kotlin.jvm.internal.o.b(this.f256722c, nVar.f256722c) && kotlin.jvm.internal.o.b(this.f256723d, nVar.f256723d) && kotlin.jvm.internal.o.b(this.f256724e, nVar.f256724e) && this.f256725f == nVar.f256725f && this.f256726g == nVar.f256726g;
    }

    public int hashCode() {
        return (((((((((((this.f256720a.hashCode() * 31) + this.f256721b.hashCode()) * 31) + this.f256722c.hashCode()) * 31) + this.f256723d.hashCode()) * 31) + this.f256724e.hashCode()) * 31) + java.lang.Long.hashCode(this.f256725f)) * 31) + java.lang.Boolean.hashCode(this.f256726g);
    }

    public java.lang.String toString() {
        return "ComposingCreationMusicInfo(musicID=" + this.f256720a + ", musicName=" + this.f256721b + ", authorName=" + this.f256722c + ", coverUrl=" + this.f256723d + ", musicFilePath=" + this.f256724e + ", durationInMs=" + this.f256725f + ", isMusicOn=" + this.f256726g + ')';
    }
}
