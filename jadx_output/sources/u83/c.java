package u83;

/* loaded from: classes8.dex */
public class c extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f425495d;

    public c() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH), com.tencent.mm.protobuf.i.c(-1, "show"), com.tencent.mm.protobuf.i.r(-1, "reddot", u83.a.class)});
        this.f425495d = appendAttrs;
        super.set__serialName("WebSearchFetchUniformReddotResult");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", java.lang.Boolean.FALSE, new u83.a()});
    }

    public void j(java.lang.String str) {
        super.set(this.f425495d + 0, str);
    }

    public void k(u83.a aVar) {
        super.set(this.f425495d + 2, aVar);
    }

    public void l(boolean z17) {
        super.set(this.f425495d + 1, java.lang.Boolean.valueOf(z17));
    }
}
