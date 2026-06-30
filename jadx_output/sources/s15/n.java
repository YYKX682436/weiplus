package s15;

/* loaded from: classes9.dex */
public class n extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f402173d;

    public n() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "cardId"), com.tencent.mm.protobuf.i.u(-1, com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE), com.tencent.mm.protobuf.i.u(-1, "secondTitle"), com.tencent.mm.protobuf.i.u(-1, "iconUrl"), com.tencent.mm.protobuf.i.u(-1, "iconUrl_1"), com.tencent.mm.protobuf.i.u(-1, "iconUrl_2"), com.tencent.mm.protobuf.i.u(-1, "iconUrl_3"), com.tencent.mm.protobuf.i.u(-1, "cardbuffer")});
        this.f402173d = appendAttrs;
        super.set__serialName("RecordFinderContentColumnSharedItem");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", "", "", "", "", "", "", ""});
    }

    public java.lang.String getTitle() {
        return super.getString(this.f402173d + 1);
    }

    public java.lang.String j() {
        return super.getString(this.f402173d + 2);
    }

    public void k(java.lang.String str) {
        super.set(this.f402173d + 0, str);
    }

    public void l(java.lang.String str) {
        super.set(this.f402173d + 7, str);
    }

    public void n(java.lang.String str) {
        super.set(this.f402173d + 3, str);
    }

    public void o(java.lang.String str) {
        super.set(this.f402173d + 4, str);
    }

    public void p(java.lang.String str) {
        super.set(this.f402173d + 5, str);
    }

    public void q(java.lang.String str) {
        super.set(this.f402173d + 6, str);
    }

    public void r(java.lang.String str) {
        super.set(this.f402173d + 2, str);
    }

    public void s(java.lang.String str) {
        super.set(this.f402173d + 1, str);
    }
}
