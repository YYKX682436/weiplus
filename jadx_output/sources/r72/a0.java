package r72;

/* loaded from: classes16.dex */
public class a0 extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f393131d;

    public a0() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "mvObjectId"), com.tencent.mm.protobuf.i.u(-1, "mvNonceId"), com.tencent.mm.protobuf.i.u(-1, "mvCoverUrl"), com.tencent.mm.protobuf.i.u(-1, "mvMakerFinderNickname"), com.tencent.mm.protobuf.i.u(-1, "singerName"), com.tencent.mm.protobuf.i.u(-1, "albumName"), com.tencent.mm.protobuf.i.u(-1, "musicGenre"), com.tencent.mm.protobuf.i.n(-1, "issueDate"), com.tencent.mm.protobuf.i.u(-1, "identification"), com.tencent.mm.protobuf.i.i(-1, "musicDuration"), com.tencent.mm.protobuf.i.u(-1, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_EXTRA_INFO), com.tencent.mm.protobuf.i.u(-1, "musicOperationUrl"), com.tencent.mm.protobuf.i.u(-1, "mid"), com.tencent.mm.protobuf.i.u(-1, "appIdForSourceDisplay")});
        this.f393131d = appendAttrs;
        super.set__serialName("musicShareItem");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", "", "", "", "", "", "", 0L, "", 0, "", "", "", ""});
    }

    public void A(java.lang.String str) {
        super.set(this.f393131d + 13, str);
    }

    public void B(java.lang.String str) {
        super.set(this.f393131d + 10, str);
    }

    public void C(java.lang.String str) {
        super.set(this.f393131d + 8, str);
    }

    public void E(long j17) {
        super.set(this.f393131d + 7, java.lang.Long.valueOf(j17));
    }

    public void F(java.lang.String str) {
        super.set(this.f393131d + 12, str);
    }

    public void G(int i17) {
        super.set(this.f393131d + 9, java.lang.Integer.valueOf(i17));
    }

    public void H(java.lang.String str) {
        super.set(this.f393131d + 6, str);
    }

    public void I(java.lang.String str) {
        super.set(this.f393131d + 11, str);
    }

    public void J(java.lang.String str) {
        super.set(this.f393131d + 2, str);
    }

    public void K(java.lang.String str) {
        super.set(this.f393131d + 3, str);
    }

    public void L(java.lang.String str) {
        super.set(this.f393131d + 1, str);
    }

    public void N(java.lang.String str) {
        super.set(this.f393131d + 0, str);
    }

    public void O(java.lang.String str) {
        super.set(this.f393131d + 4, str);
    }

    public java.lang.String j() {
        return super.getString(this.f393131d + 5);
    }

    public java.lang.String k() {
        return super.getString(this.f393131d + 13);
    }

    public java.lang.String l() {
        return super.getString(this.f393131d + 10);
    }

    public java.lang.String n() {
        return super.getString(this.f393131d + 8);
    }

    public long o() {
        return super.getLong(this.f393131d + 7);
    }

    public java.lang.String p() {
        return super.getString(this.f393131d + 12);
    }

    @Override // e14.l
    public boolean processXmlValueUseCData(java.lang.Object value, java.lang.String tagName, java.lang.String itemTagName, boolean z17) {
        kotlin.jvm.internal.o.g(value, "value");
        kotlin.jvm.internal.o.g(tagName, "tagName");
        kotlin.jvm.internal.o.g(itemTagName, "itemTagName");
        if (kotlin.jvm.internal.o.b(tagName, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_EXTRA_INFO) || kotlin.jvm.internal.o.b(tagName, "identification")) {
            return true;
        }
        return super.processXmlValueUseCData(value, tagName, itemTagName, z17);
    }

    public int q() {
        return super.getInteger(this.f393131d + 9);
    }

    public java.lang.String r() {
        return super.getString(this.f393131d + 6);
    }

    public java.lang.String s() {
        return super.getString(this.f393131d + 11);
    }

    public java.lang.String t() {
        return super.getString(this.f393131d + 2);
    }

    public java.lang.String u() {
        return super.getString(this.f393131d + 3);
    }

    public java.lang.String w() {
        return super.getString(this.f393131d + 1);
    }

    public java.lang.String x() {
        return super.getString(this.f393131d + 0);
    }

    public java.lang.String y() {
        return super.getString(this.f393131d + 4);
    }

    public void z(java.lang.String str) {
        super.set(this.f393131d + 5, str);
    }
}
