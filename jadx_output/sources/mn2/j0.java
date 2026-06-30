package mn2;

/* loaded from: classes2.dex */
public final class j0 extends mn2.a {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f330024e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f330025f;

    public j0(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        this.f330024e = url;
        this.f330025f = "finder_cover_" + com.tencent.mm.sdk.platformtools.w2.a(url);
    }

    @Override // mn2.h3
    public com.tencent.mm.plugin.finder.storage.y90 getMediaType() {
        return com.tencent.mm.plugin.finder.storage.y90.f128355e;
    }

    @Override // mn2.h3
    public java.lang.String getPath() {
        com.tencent.mm.plugin.finder.assist.e9 e9Var = com.tencent.mm.plugin.finder.assist.e9.f102132a;
        return com.tencent.mm.plugin.finder.assist.e9.f102142k + this.f330025f;
    }

    @Override // mn2.h3
    public java.lang.String getUrl() {
        return this.f330024e;
    }

    @Override // mn2.h3
    public java.lang.String h() {
        return "";
    }

    @Override // mn2.h3
    public java.lang.String i() {
        return "";
    }

    @Override // mn2.h3
    public java.lang.String l() {
        return this.f330024e;
    }

    @Override // mn2.h3
    public java.lang.String m() {
        return "";
    }

    @Override // ip0.c
    public java.lang.String n() {
        return this.f330025f;
    }
}
