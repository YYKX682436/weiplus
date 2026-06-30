package s15;

/* loaded from: classes9.dex */
public class h extends k15.a {

    /* renamed from: e, reason: collision with root package name */
    public final int f402165e;

    public h() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.j(-1, "datastatus"), com.tencent.mm.protobuf.i.v(-1, "htmlid"), com.tencent.mm.protobuf.i.j(-1, "dataillegaltype"), com.tencent.mm.protobuf.i.v(-1, "datasourceid"), com.tencent.mm.protobuf.i.u(-1, "datafmt"), com.tencent.mm.protobuf.i.i(-1, "thumbwidth"), com.tencent.mm.protobuf.i.i(-1, "thumbheight"), com.tencent.mm.protobuf.i.i(-1, "cdnencryver"), com.tencent.mm.protobuf.i.i(-1, "duration"), com.tencent.mm.protobuf.i.u(-1, "streamweburl"), com.tencent.mm.protobuf.i.u(-1, "streamdataurl"), com.tencent.mm.protobuf.i.u(-1, "streamlowbandurl"), com.tencent.mm.protobuf.i.u(-1, "head256md5"), com.tencent.mm.protobuf.i.u(-1, "thumbhead256md5"), com.tencent.mm.protobuf.i.u(-1, "streamvideoid"), com.tencent.mm.protobuf.i.u(-1, "sourcetitle"), com.tencent.mm.protobuf.i.u(-1, "sourcename"), com.tencent.mm.protobuf.i.u(-1, "sourcedesc"), com.tencent.mm.protobuf.i.u(-1, "sourceheadurl"), com.tencent.mm.protobuf.i.u(-1, "sourcetime"), com.tencent.mm.protobuf.i.n(-1, "srcMsgCreateTime"), com.tencent.mm.protobuf.i.u(-1, "statextstr"), com.tencent.mm.protobuf.i.u(-1, "songalbumurl"), com.tencent.mm.protobuf.i.u(-1, "songlyric"), com.tencent.mm.protobuf.i.r(-1, "recordxml", s15.i0.class), com.tencent.mm.protobuf.i.u(-1, "messageuuid"), com.tencent.mm.protobuf.i.n(-1, "fromnewmsgid"), com.tencent.mm.protobuf.i.u(-1, "appid"), com.tencent.mm.protobuf.i.u(-1, "link"), com.tencent.mm.protobuf.i.u(-1, "brandid"), com.tencent.mm.protobuf.i.u(-1, "tpauthkey"), com.tencent.mm.protobuf.i.u(-1, "tpaeskey"), com.tencent.mm.protobuf.i.u(-1, "tpdataurl"), com.tencent.mm.protobuf.i.u(-1, "tpthumburl"), com.tencent.mm.protobuf.i.u(-1, "tpthumbaeskey"), com.tencent.mm.protobuf.i.r(-1, "dataitemsource", s15.i.class), com.tencent.mm.protobuf.i.r(-1, "locitem", s15.y.class), com.tencent.mm.protobuf.i.r(-1, "weburlitem", s15.h0.class), com.tencent.mm.protobuf.i.r(-1, "finderFeed", s15.o.class), com.tencent.mm.protobuf.i.r(-1, "finderLive", s15.r.class), com.tencent.mm.protobuf.i.r(-1, "finderShopWindowShare", s15.k.class), com.tencent.mm.protobuf.i.r(-1, "finderTopicShareItem", s15.v.class), com.tencent.mm.protobuf.i.r(-1, "finderTopicShareItem", s15.v.class), com.tencent.mm.protobuf.i.r(-1, "finderShareNameCard", s15.s.class), com.tencent.mm.protobuf.i.r(-1, "finderContentColumnSharedItem", s15.n.class), com.tencent.mm.protobuf.i.r(-1, "favbrandmpvideo", s15.g.class), com.tencent.mm.protobuf.i.r(-1, "finderproductshare", s15.j.class), com.tencent.mm.protobuf.i.r(-1, "photoAccountShareNameCard", s15.b0.class), com.tencent.mm.protobuf.i.r(-1, "productitem", s15.c0.class), com.tencent.mm.protobuf.i.r(-1, "tvitem", s15.e0.class), com.tencent.mm.protobuf.i.r(-1, "appbranditem", s15.e.class), com.tencent.mm.protobuf.i.r(-1, "musicShareItem", s15.z.class), com.tencent.mm.protobuf.i.r(-1, "tingListenItem", s15.g0.class), com.tencent.mm.protobuf.i.r(-1, "tingCategoryItem", s15.f0.class), com.tencent.mm.protobuf.i.r(-1, "refermsgitem", s15.d0.class), com.tencent.mm.protobuf.i.i(-1, "thumbfiletype"), com.tencent.mm.protobuf.i.i(-1, "filetype"), com.tencent.mm.protobuf.i.i(-1, "midfiletype"), com.tencent.mm.protobuf.i.r(-1, "liteappshareditem", s15.x.class), com.tencent.mm.protobuf.i.r(-1, "finderThemeLiveStream", s15.a.class), com.tencent.mm.protobuf.i.r(-1, "finderCollection", s15.m.class), com.tencent.mm.protobuf.i.r(-1, "emojiitem", s15.l.class), com.tencent.mm.protobuf.i.u(-1, "srcMsgContent")});
        this.f402165e = appendAttrs;
        super.set__serialName("dataitem");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{0, "", 0, "", "", 0, 0, 0, 0, "", "", "", "", "", "", "", "", "", "", "", 0L, "", "", "", null, "", 0L, "", "", "", "", "", "", "", "", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, null, null, null, null, null});
    }

    public long A() {
        return super.getLong(this.f402165e + 26);
    }

    public void A0(s15.k kVar) {
        super.set(this.f402165e + 40, kVar);
    }

    public java.lang.String B() {
        return super.getString(this.f402165e + 1);
    }

    public void B0(s15.v vVar) {
        super.set(this.f402165e + 42, vVar);
    }

    public s15.x C() {
        return (s15.x) super.getCustom(this.f402165e + 58);
    }

    public void C0(long j17) {
        super.set(this.f402165e + 26, java.lang.Long.valueOf(j17));
    }

    public void D0(java.lang.String str) {
        super.set(this.f402165e + 12, str);
    }

    public s15.y E() {
        return (s15.y) super.getCustom(this.f402165e + 36);
    }

    public void E0(java.lang.String str) {
        super.set(this.f402165e + 1, str);
    }

    public java.lang.String F() {
        return super.getString(this.f402165e + 25);
    }

    public void F0(java.lang.String str) {
        super.set(this.f402165e + 28, str);
    }

    public s15.z G() {
        return (s15.z) super.getCustom(this.f402165e + 51);
    }

    public void G0(s15.x xVar) {
        super.set(this.f402165e + 58, xVar);
    }

    public s15.i0 H() {
        return (s15.i0) super.getCustom(this.f402165e + 24);
    }

    public void H0(s15.y yVar) {
        super.set(this.f402165e + 36, yVar);
    }

    public s15.d0 I() {
        return (s15.d0) super.getCustom(this.f402165e + 54);
    }

    public void I0(java.lang.String str) {
        super.set(this.f402165e + 25, str);
    }

    public java.lang.String J() {
        return super.getString(this.f402165e + 22);
    }

    public void J0(s15.z zVar) {
        super.set(this.f402165e + 51, zVar);
    }

    public java.lang.String K() {
        return super.getString(this.f402165e + 23);
    }

    public void K0(s15.b0 b0Var) {
        super.set(this.f402165e + 47, b0Var);
    }

    public java.lang.String L() {
        return super.getString(this.f402165e + 17);
    }

    public void L0(s15.c0 c0Var) {
        super.set(this.f402165e + 48, c0Var);
    }

    public void M0(s15.i0 i0Var) {
        super.set(this.f402165e + 24, i0Var);
    }

    public java.lang.String N() {
        return super.getString(this.f402165e + 18);
    }

    public void N0(s15.d0 d0Var) {
        super.set(this.f402165e + 54, d0Var);
    }

    public java.lang.String O() {
        return super.getString(this.f402165e + 19);
    }

    public void O0(java.lang.String str) {
        super.set(this.f402165e + 22, str);
    }

    public java.lang.String P() {
        return super.getString(this.f402165e + 62);
    }

    public void P0(java.lang.String str) {
        super.set(this.f402165e + 23, str);
    }

    public long Q() {
        return super.getLong(this.f402165e + 20);
    }

    public void Q0(java.lang.String str) {
        super.set(this.f402165e + 17, str);
    }

    public java.lang.String R() {
        return super.getString(this.f402165e + 21);
    }

    public void R0(java.lang.String str) {
        super.set(this.f402165e + 18, str);
    }

    public java.lang.String S() {
        return super.getString(this.f402165e + 10);
    }

    public void S0(java.lang.String str) {
        super.set(this.f402165e + 16, str);
    }

    public java.lang.String T() {
        return super.getString(this.f402165e + 11);
    }

    public void T0(java.lang.String str) {
        super.set(this.f402165e + 19, str);
    }

    public java.lang.String U() {
        return super.getString(this.f402165e + 9);
    }

    public void U0(java.lang.String str) {
        super.set(this.f402165e + 15, str);
    }

    public s15.f0 V() {
        return (s15.f0) super.getCustom(this.f402165e + 53);
    }

    public void V0(java.lang.String str) {
        super.set(this.f402165e + 62, str);
    }

    public s15.g0 W() {
        return (s15.g0) super.getCustom(this.f402165e + 52);
    }

    public void W0(long j17) {
        super.set(this.f402165e + 20, java.lang.Long.valueOf(j17));
    }

    public void X0(java.lang.String str) {
        super.set(this.f402165e + 21, str);
    }

    public java.lang.String Y() {
        return super.getString(this.f402165e + 31);
    }

    public void Y0(java.lang.String str) {
        super.set(this.f402165e + 10, str);
    }

    public java.lang.String Z() {
        return super.getString(this.f402165e + 30);
    }

    public void Z0(java.lang.String str) {
        super.set(this.f402165e + 11, str);
    }

    public java.lang.String a0() {
        return super.getString(this.f402165e + 32);
    }

    public void a1(java.lang.String str) {
        super.set(this.f402165e + 14, str);
    }

    public java.lang.String b0() {
        return super.getString(this.f402165e + 34);
    }

    public void b1(java.lang.String str) {
        super.set(this.f402165e + 9, str);
    }

    public java.lang.String c0() {
        return super.getString(this.f402165e + 33);
    }

    public void c1(java.lang.String str) {
        super.set(this.f402165e + 13, str);
    }

    public s15.h0 d0() {
        return (s15.h0) super.getCustom(this.f402165e + 37);
    }

    public void d1(int i17) {
        super.set(this.f402165e + 6, java.lang.Integer.valueOf(i17));
    }

    public void e0(s15.e eVar) {
        super.set(this.f402165e + 50, eVar);
    }

    public void e1(int i17) {
        super.set(this.f402165e + 5, java.lang.Integer.valueOf(i17));
    }

    public void f0(java.lang.String str) {
        super.set(this.f402165e + 27, str);
    }

    public void f1(s15.f0 f0Var) {
        super.set(this.f402165e + 53, f0Var);
    }

    public void g0(java.lang.String str) {
        super.set(this.f402165e + 29, str);
    }

    public void g1(s15.g0 g0Var) {
        super.set(this.f402165e + 52, g0Var);
    }

    public java.lang.String getAppId() {
        return super.getString(this.f402165e + 27);
    }

    public java.lang.String getLink() {
        return super.getString(this.f402165e + 28);
    }

    public java.lang.String getSourceName() {
        return super.getString(this.f402165e + 16);
    }

    public int getThumbHeight() {
        return super.getInteger(this.f402165e + 6);
    }

    public int getThumbWidth() {
        return super.getInteger(this.f402165e + 5);
    }

    public void h0(s15.g gVar) {
        super.set(this.f402165e + 45, gVar);
    }

    public void h1(java.lang.String str) {
        super.set(this.f402165e + 31, str);
    }

    public void i0(int i17) {
        super.set(this.f402165e + 7, java.lang.Integer.valueOf(i17));
    }

    public void i1(java.lang.String str) {
        super.set(this.f402165e + 30, str);
    }

    public s15.e j() {
        return (s15.e) super.getCustom(this.f402165e + 50);
    }

    public void j0(java.lang.String str) {
        super.set(this.f402165e + 4, str);
    }

    public void j1(java.lang.String str) {
        super.set(this.f402165e + 32, str);
    }

    public java.lang.String k() {
        return super.getString(this.f402165e + 29);
    }

    public void k0(int i17) {
        super.set(this.f402165e + 2, java.lang.Integer.valueOf(i17));
    }

    public void k1(java.lang.String str) {
        super.set(this.f402165e + 34, str);
    }

    public s15.g l() {
        return (s15.g) super.getCustom(this.f402165e + 45);
    }

    public void l0(java.lang.String str) {
        super.set(this.f402165e + 3, str);
    }

    public void l1(java.lang.String str) {
        super.set(this.f402165e + 33, str);
    }

    public void m0(s15.i iVar) {
        super.set(this.f402165e + 35, iVar);
    }

    public void m1(s15.e0 e0Var) {
        super.set(this.f402165e + 49, e0Var);
    }

    public java.lang.String n() {
        return super.getString(this.f402165e + 4);
    }

    public void n0(int i17) {
        super.set(this.f402165e + 0, java.lang.Integer.valueOf(i17));
    }

    public void n1(s15.h0 h0Var) {
        super.set(this.f402165e + 37, h0Var);
    }

    public java.lang.String o() {
        return super.getString(this.f402165e + 3);
    }

    public void o0(int i17) {
        super.set(this.f402165e + 8, java.lang.Integer.valueOf(i17));
    }

    public s15.i p() {
        return (s15.i) super.getCustom(this.f402165e + 35);
    }

    public void p0(s15.l lVar) {
        super.set(this.f402165e + 61, lVar);
    }

    @Override // e14.l
    public java.lang.String processXmlValue(java.lang.Object value, java.lang.String tagName, java.lang.String itemTagName, boolean z17) {
        kotlin.jvm.internal.o.g(value, "value");
        kotlin.jvm.internal.o.g(tagName, "tagName");
        kotlin.jvm.internal.o.g(itemTagName, "itemTagName");
        return kotlin.jvm.internal.o.b(tagName, "recordxml") ? value.toString() : super.processXmlValue(value, tagName, itemTagName, z17);
    }

    public int q() {
        return super.getInteger(this.f402165e + 8);
    }

    public void q0(s15.v vVar) {
        super.set(this.f402165e + 41, vVar);
    }

    public s15.l r() {
        return (s15.l) super.getCustom(this.f402165e + 61);
    }

    public void r0(s15.m mVar) {
        super.set(this.f402165e + 60, mVar);
    }

    public s15.m s() {
        return (s15.m) super.getCustom(this.f402165e + 60);
    }

    public s15.o t() {
        return (s15.o) super.getCustom(this.f402165e + 38);
    }

    public void t0(s15.n nVar) {
        super.set(this.f402165e + 44, nVar);
    }

    public s15.r u() {
        return (s15.r) super.getCustom(this.f402165e + 39);
    }

    public void u0(s15.o oVar) {
        super.set(this.f402165e + 38, oVar);
    }

    public void v0(s15.r rVar) {
        super.set(this.f402165e + 39, rVar);
    }

    public s15.a w() {
        return (s15.a) super.getCustom(this.f402165e + 59);
    }

    public void w0(s15.a aVar) {
        super.set(this.f402165e + 59, aVar);
    }

    public s15.j x() {
        return (s15.j) super.getCustom(this.f402165e + 46);
    }

    public void x0(s15.j jVar) {
        super.set(this.f402165e + 46, jVar);
    }

    public s15.s y() {
        return (s15.s) super.getCustom(this.f402165e + 43);
    }

    public s15.k z() {
        return (s15.k) super.getCustom(this.f402165e + 40);
    }

    public void z0(s15.s sVar) {
        super.set(this.f402165e + 43, sVar);
    }
}
