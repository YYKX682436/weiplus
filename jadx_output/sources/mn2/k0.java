package mn2;

/* loaded from: classes2.dex */
public final class k0 extends mn2.a {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f330029e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f330030f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.y90 f330031g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f330032h;

    public k0(java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.mm.plugin.finder.storage.y90 mediaType) {
        kotlin.jvm.internal.o.g(mediaType, "mediaType");
        this.f330029e = str;
        this.f330030f = str3;
        this.f330031g = mediaType;
        str2 = str2 == null ? "" : str2;
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        this.f330032h = com.tencent.mm.sdk.platformtools.w2.b(str2.getBytes());
    }

    @Override // mn2.h3
    public com.tencent.mm.plugin.finder.storage.y90 getMediaType() {
        return this.f330031g;
    }

    @Override // mn2.h3
    public java.lang.String getPath() {
        com.tencent.mm.plugin.finder.assist.e9 e9Var = com.tencent.mm.plugin.finder.assist.e9.f102132a;
        return com.tencent.mm.plugin.finder.assist.e9.f102139h + n();
    }

    @Override // mn2.h3
    public java.lang.String getUrl() {
        java.lang.String str = this.f330029e;
        return str == null ? "" : str;
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
        java.lang.String str = this.f330029e;
        return str == null ? "" : str;
    }

    @Override // mn2.h3
    public java.lang.String m() {
        return "";
    }

    @Override // ip0.c
    public java.lang.String n() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f330031g.f128374d);
        sb6.append("_finder_");
        java.lang.String str2 = this.f330030f;
        if (str2 == null || str2.length() == 0) {
            str = "";
        } else {
            str = "_" + str2 + '_';
        }
        sb6.append(str);
        sb6.append(this.f330032h);
        return sb6.toString();
    }
}
