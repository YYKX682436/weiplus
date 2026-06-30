package r05;

/* loaded from: classes9.dex */
public class d extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f368359d;

    public d() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.i(-1, "tid"), com.tencent.mm.protobuf.i.u(-1, com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE), com.tencent.mm.protobuf.i.u(-1, "desc"), com.tencent.mm.protobuf.i.u(-1, "iconUrl"), com.tencent.mm.protobuf.i.u(-1, "secondUrl"), com.tencent.mm.protobuf.i.i(-1, "pageType"), com.tencent.mm.protobuf.i.u(-1, "setKey")});
        this.f368359d = appendAttrs;
        super.set__serialName("AppMsgEmoticonPageShared");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{0, "", "", "", "", 0, ""});
    }

    public java.lang.String getIconUrl() {
        return super.getString(this.f368359d + 3);
    }

    public java.lang.String getTitle() {
        return super.getString(this.f368359d + 1);
    }

    public java.lang.String j() {
        return super.getString(this.f368359d + 2);
    }

    public java.lang.String k() {
        return super.getString(this.f368359d + 4);
    }

    public java.lang.String l() {
        return super.getString(this.f368359d + 6);
    }

    public int n() {
        return super.getInteger(this.f368359d + 0);
    }

    public void o(java.lang.String str) {
        super.set(this.f368359d + 2, str);
    }

    public void p(java.lang.String str) {
        super.set(this.f368359d + 3, str);
    }

    public void q(int i17) {
        super.set(this.f368359d + 5, java.lang.Integer.valueOf(i17));
    }

    public void r(java.lang.String str) {
        super.set(this.f368359d + 4, str);
    }

    public void s(java.lang.String str) {
        super.set(this.f368359d + 6, str);
    }

    public void t(int i17) {
        super.set(this.f368359d + 0, java.lang.Integer.valueOf(i17));
    }

    public void u(java.lang.String str) {
        super.set(this.f368359d + 1, str);
    }
}
