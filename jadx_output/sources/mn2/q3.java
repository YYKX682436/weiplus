package mn2;

/* loaded from: classes10.dex */
public class q3 extends mn2.a {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f330096e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.y90 f330097f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f330098g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f330099h;

    public q3(java.lang.String str, com.tencent.mm.plugin.finder.storage.y90 mediaType) {
        kotlin.jvm.internal.o.g(mediaType, "mediaType");
        this.f330096e = str;
        this.f330097f = mediaType;
        this.f330098g = jz5.h.b(new mn2.p3(this));
        this.f330099h = jz5.h.b(new mn2.o3(this));
    }

    @Override // mn2.h3
    public com.tencent.mm.plugin.finder.storage.y90 getMediaType() {
        return this.f330097f;
    }

    @Override // mn2.h3
    public java.lang.String getPath() {
        com.tencent.mm.plugin.finder.assist.e9 e9Var = com.tencent.mm.plugin.finder.assist.e9.f102132a;
        return com.tencent.mm.plugin.finder.assist.e9.f102139h + n();
    }

    @Override // mn2.h3
    public java.lang.String getUrl() {
        java.lang.String str = this.f330096e;
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
        java.lang.String str = this.f330096e;
        return str == null ? "" : str;
    }

    @Override // mn2.h3
    public java.lang.String m() {
        return "";
    }

    @Override // ip0.c
    public java.lang.String n() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f330097f.f128374d);
        sb6.append("_finder_");
        java.lang.Object value = ((jz5.n) this.f330099h).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        sb6.append((java.lang.String) value);
        return sb6.toString();
    }
}
