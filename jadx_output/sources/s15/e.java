package s15;

/* loaded from: classes9.dex */
public class e extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f402159d;

    public e() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, dm.i4.COL_USERNAME), com.tencent.mm.protobuf.i.u(-1, "appid"), com.tencent.mm.protobuf.i.i(-1, "pkgtype"), com.tencent.mm.protobuf.i.u(-1, "iconurl"), com.tencent.mm.protobuf.i.i(-1, "type"), com.tencent.mm.protobuf.i.u(-1, "pagepath"), com.tencent.mm.protobuf.i.u(-1, "sourcedisplayname"), com.tencent.mm.protobuf.i.i(-1, "version"), com.tencent.mm.protobuf.i.i(-1, "disableforward"), com.tencent.mm.protobuf.i.i(-1, "showRelievedBuyFlag"), com.tencent.mm.protobuf.i.u(-1, "messageextradata"), com.tencent.mm.protobuf.i.i(-1, "subtype"), com.tencent.mm.protobuf.i.r(-1, "nativeappinfo", s05.a.class)});
        this.f402159d = appendAttrs;
        super.set__serialName("RecordAppBrandItem");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", "", 0, "", 0, "", "", 0, 0, 0, "", 0, null});
    }

    public void A(int i17) {
        super.set(this.f402159d + 7, java.lang.Integer.valueOf(i17));
    }

    public java.lang.String getAppId() {
        return super.getString(this.f402159d + 1);
    }

    public java.lang.String getIconUrl() {
        return super.getString(this.f402159d + 3);
    }

    public int getSubType() {
        return super.getInteger(this.f402159d + 11);
    }

    public int getType() {
        return super.getInteger(this.f402159d + 4);
    }

    public java.lang.String getUsername() {
        return super.getString(this.f402159d + 0);
    }

    public int getVersion() {
        return super.getInteger(this.f402159d + 7);
    }

    public java.lang.String j() {
        return super.getString(this.f402159d + 10);
    }

    public java.lang.String k() {
        return super.getString(this.f402159d + 5);
    }

    public int l() {
        return super.getInteger(this.f402159d + 2);
    }

    public int n() {
        return super.getInteger(this.f402159d + 9);
    }

    public void o(java.lang.String str) {
        super.set(this.f402159d + 1, str);
    }

    public void p(int i17) {
        super.set(this.f402159d + 8, java.lang.Integer.valueOf(i17));
    }

    public void q(java.lang.String str) {
        super.set(this.f402159d + 3, str);
    }

    public void r(java.lang.String str) {
        super.set(this.f402159d + 10, str);
    }

    public void s(java.lang.String str) {
        super.set(this.f402159d + 5, str);
    }

    public void t(int i17) {
        super.set(this.f402159d + 2, java.lang.Integer.valueOf(i17));
    }

    public void u(int i17) {
        super.set(this.f402159d + 9, java.lang.Integer.valueOf(i17));
    }

    public void w(java.lang.String str) {
        super.set(this.f402159d + 6, str);
    }

    public void x(int i17) {
        super.set(this.f402159d + 11, java.lang.Integer.valueOf(i17));
    }

    public void y(int i17) {
        super.set(this.f402159d + 4, java.lang.Integer.valueOf(i17));
    }

    public void z(java.lang.String str) {
        super.set(this.f402159d + 0, str);
    }
}
