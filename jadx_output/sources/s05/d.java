package s05;

/* loaded from: classes9.dex */
public class d extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f401977d;

    public d() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, dm.i4.COL_USERNAME), com.tencent.mm.protobuf.i.u(-1, "appid"), com.tencent.mm.protobuf.i.i(-1, "type"), com.tencent.mm.protobuf.i.i(-1, "version"), com.tencent.mm.protobuf.i.i(-1, "subType"), com.tencent.mm.protobuf.i.u(-1, "weappiconurl"), com.tencent.mm.protobuf.i.u(-1, "shareId"), com.tencent.mm.protobuf.i.u(-1, "sharekey"), com.tencent.mm.protobuf.i.u(-1, "weapppagethumbrawurl"), com.tencent.mm.protobuf.i.u(-1, "pagepath"), com.tencent.mm.protobuf.i.i(-1, "tradingguaranteeflag"), com.tencent.mm.protobuf.i.u(-1, "messageextradata"), com.tencent.mm.protobuf.i.i(-1, "wxaTradeCommentScore"), com.tencent.mm.protobuf.i.u(-1, "registerBody"), com.tencent.mm.protobuf.i.i(-1, "certificationImageType"), com.tencent.mm.protobuf.i.r(-1, "pkginfo", s05.e.class), com.tencent.mm.protobuf.i.r(-1, "wadynamicpageinfo", s05.b.class), com.tencent.mm.protobuf.i.r(-1, "waupdatablemsginfov3", s05.c.class), com.tencent.mm.protobuf.i.i(-1, "appservicetype"), com.tencent.mm.protobuf.i.i(-1, "secflagforsinglepagemode"), com.tencent.mm.protobuf.i.r(-1, "videopageinfo", e15.l.class), com.tencent.mm.protobuf.i.r(-1, "nativeappinfo", s05.a.class), com.tencent.mm.protobuf.i.i(-1, "disableforward"), com.tencent.mm.protobuf.i.i(-1, "showRelievedBuyFlag"), com.tencent.mm.protobuf.i.i(-1, "showFlagshipFlag"), com.tencent.mm.protobuf.i.i(-1, "hasRelievedBuyPlugin"), com.tencent.mm.protobuf.i.i(-1, "showFinancialLicenseFlag"), com.tencent.mm.protobuf.i.r(-1, "screenvideoinfo", s05.f.class)});
        this.f401977d = appendAttrs;
        super.set__serialName("WeAppInfo");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{null, null, 0, 0, 0, null, null, null, null, null, 0, null, 0, null, 0, null, null, null, 0, 0, null, null, 0, 0, 0, 0, 0, null});
    }

    public s05.c A() {
        return (s05.c) super.getCustom(this.f401977d + 17);
    }

    public java.lang.String B() {
        return super.getString(this.f401977d + 5);
    }

    public java.lang.String C() {
        return super.getString(this.f401977d + 8);
    }

    public void E(java.lang.String str) {
        super.set(this.f401977d + 1, str);
    }

    public void F(int i17) {
        super.set(this.f401977d + 14, java.lang.Integer.valueOf(i17));
    }

    public void G(int i17) {
        super.set(this.f401977d + 22, java.lang.Integer.valueOf(i17));
    }

    public void H(java.lang.String str) {
        super.set(this.f401977d + 11, str);
    }

    public void I(s05.a aVar) {
        super.set(this.f401977d + 21, aVar);
    }

    public void J(java.lang.String str) {
        super.set(this.f401977d + 9, str);
    }

    public void K(s05.e eVar) {
        super.set(this.f401977d + 15, eVar);
    }

    public void L(java.lang.String str) {
        super.set(this.f401977d + 13, str);
    }

    public void N(int i17) {
        super.set(this.f401977d + 23, java.lang.Integer.valueOf(i17));
    }

    public void O(int i17) {
        super.set(this.f401977d + 4, java.lang.Integer.valueOf(i17));
    }

    public void P(int i17) {
        super.set(this.f401977d + 10, java.lang.Integer.valueOf(i17));
    }

    public void Q(int i17) {
        super.set(this.f401977d + 2, java.lang.Integer.valueOf(i17));
    }

    public void R(java.lang.String str) {
        super.set(this.f401977d + 0, str);
    }

    public void S(int i17) {
        super.set(this.f401977d + 3, java.lang.Integer.valueOf(i17));
    }

    public void T(java.lang.String str) {
        super.set(this.f401977d + 5, str);
    }

    public void U(java.lang.String str) {
        super.set(this.f401977d + 8, str);
    }

    public void V(int i17) {
        super.set(this.f401977d + 12, java.lang.Integer.valueOf(i17));
    }

    public java.lang.String getAppId() {
        return super.getString(this.f401977d + 1);
    }

    public int getSubType() {
        return super.getInteger(this.f401977d + 4);
    }

    public int getType() {
        return super.getInteger(this.f401977d + 2);
    }

    public int getVersion() {
        return super.getInteger(this.f401977d + 3);
    }

    public int j() {
        return super.getInteger(this.f401977d + 14);
    }

    public int k() {
        return super.getInteger(this.f401977d + 22);
    }

    public int l() {
        return super.getInteger(this.f401977d + 25);
    }

    public java.lang.String n() {
        return super.getString(this.f401977d + 11);
    }

    public s05.a o() {
        return (s05.a) super.getCustom(this.f401977d + 21);
    }

    public java.lang.String p() {
        return super.getString(this.f401977d + 9);
    }

    public s05.e q() {
        return (s05.e) super.getCustom(this.f401977d + 15);
    }

    public java.lang.String r() {
        return super.getString(this.f401977d + 13);
    }

    public s05.f s() {
        return (s05.f) super.getCustom(this.f401977d + 27);
    }

    public java.lang.String t() {
        return super.getString(this.f401977d + 6);
    }

    public int u() {
        return super.getInteger(this.f401977d + 26);
    }

    public int w() {
        return super.getInteger(this.f401977d + 24);
    }

    public int x() {
        return super.getInteger(this.f401977d + 23);
    }

    public java.lang.String y() {
        return super.getString(this.f401977d + 0);
    }

    public s05.b z() {
        return (s05.b) super.getCustom(this.f401977d + 16);
    }
}
