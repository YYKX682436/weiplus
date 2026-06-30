package x15;

/* loaded from: classes11.dex */
public final class b extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f451473d;

    public b() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.v(-1, "aeskey"), com.tencent.mm.protobuf.i.v(-1, "url"), com.tencent.mm.protobuf.i.v(-1, "fileid")});
        this.f451473d = appendAttrs;
        super.set__serialName("image");
        super.set__xmlPrefixTag("");
        super.set__trim(false);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", "", ""});
    }

    public final void j(java.lang.String str) {
        super.set(this.f451473d + 0, str);
    }

    public final void k(java.lang.String str) {
        super.set(this.f451473d + 2, str);
    }

    public final void l(java.lang.String str) {
        super.set(this.f451473d + 1, str);
    }
}
