package r72;

/* loaded from: classes16.dex */
public class d extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f393135d;

    public d() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.j(-1, "datatype"), com.tencent.mm.protobuf.i.j(-1, "datastatus"), com.tencent.mm.protobuf.i.v(-1, "dataid"), com.tencent.mm.protobuf.i.v(-1, "htmlid"), com.tencent.mm.protobuf.i.j(-1, "dataillegaltype"), com.tencent.mm.protobuf.i.v(-1, "datasourceid"), com.tencent.mm.protobuf.i.u(-1, "datafmt"), com.tencent.mm.protobuf.i.u(-1, "datatitle"), com.tencent.mm.protobuf.i.u(-1, "datadesc"), com.tencent.mm.protobuf.i.u(-1, "cdn_thumburl"), com.tencent.mm.protobuf.i.i(-1, "thumb_width"), com.tencent.mm.protobuf.i.i(-1, "thumb_height"), com.tencent.mm.protobuf.i.u(-1, "cdn_dataurl"), com.tencent.mm.protobuf.i.u(-1, "cdn_thumbkey"), com.tencent.mm.protobuf.i.u(-1, "cdn_datakey"), com.tencent.mm.protobuf.i.i(-1, "cdn_encryver"), com.tencent.mm.protobuf.i.i(-1, "duration"), com.tencent.mm.protobuf.i.u(-1, "stream_weburl"), com.tencent.mm.protobuf.i.u(-1, "songalbumurl"), com.tencent.mm.protobuf.i.u(-1, "songlyric"), com.tencent.mm.protobuf.i.u(-1, "stream_dataurl"), com.tencent.mm.protobuf.i.u(-1, "stream_lowbandurl"), com.tencent.mm.protobuf.i.u(-1, "dataext"), com.tencent.mm.protobuf.i.u(-1, "fullmd5"), com.tencent.mm.protobuf.i.u(-1, "head256md5"), com.tencent.mm.protobuf.i.n(-1, "fullsize"), com.tencent.mm.protobuf.i.u(-1, "thumbfullmd5"), com.tencent.mm.protobuf.i.u(-1, "thumbhead256md5"), com.tencent.mm.protobuf.i.n(-1, "thumbfullsize"), com.tencent.mm.protobuf.i.u(-1, "stream_videoid"), com.tencent.mm.protobuf.i.u(-1, "datasrctitle"), com.tencent.mm.protobuf.i.u(-1, "datasrcname"), com.tencent.mm.protobuf.i.u(-1, "datasrctime"), com.tencent.mm.protobuf.i.u(-1, "canvasPageXml"), com.tencent.mm.protobuf.i.u(-1, "statextstr"), com.tencent.mm.protobuf.i.r(-1, "recordxml", r72.h.class), com.tencent.mm.protobuf.i.u(-1, "messageuuid"), com.tencent.mm.protobuf.i.n(-1, "fromnewmsgid"), com.tencent.mm.protobuf.i.u(-1, "datasrcheadurl"), com.tencent.mm.protobuf.i.i(-1, "filetype"), com.tencent.mm.protobuf.i.i(-1, "thumbfiletype"), com.tencent.mm.protobuf.i.r(-1, "streamvideo", r72.h0.class), com.tencent.mm.protobuf.i.r(-1, "dataitemsource", r72.i.class), com.tencent.mm.protobuf.i.r(-1, "locitem", r72.f.class), com.tencent.mm.protobuf.i.r(-1, "weburlitem", r72.m0.class), com.tencent.mm.protobuf.i.r(-1, "productitem", r72.d0.class), com.tencent.mm.protobuf.i.r(-1, "tvitem", r72.k0.class), com.tencent.mm.protobuf.i.r(-1, "noteinfo", r72.b0.class), com.tencent.mm.protobuf.i.r(-1, "appbranditem", r72.a.class), com.tencent.mm.protobuf.i.r(-1, "finderFeed", x05.j.class), com.tencent.mm.protobuf.i.r(-1, "finderCollection", r72.m.class), com.tencent.mm.protobuf.i.r(-1, "musicShareItem", r72.a0.class), com.tencent.mm.protobuf.i.r(-1, "tingListenItem", r72.j0.class), com.tencent.mm.protobuf.i.r(-1, "tingCategoryItem", r72.i0.class), com.tencent.mm.protobuf.i.r(-1, "favbrandmpvideo", r72.c.class), com.tencent.mm.protobuf.i.r(-1, "finderLive", r72.r.class), com.tencent.mm.protobuf.i.u(-1, "datasrcnamepost"), com.tencent.mm.protobuf.i.r(-1, "finderTopic", r72.u.class), com.tencent.mm.protobuf.i.r(-1, "finderTopic", r72.u.class), com.tencent.mm.protobuf.i.u(-1, "sourcedatapath"), com.tencent.mm.protobuf.i.u(-1, "sourcethumbpath"), com.tencent.mm.protobuf.i.c(-1, "needcompressoriginal"), com.tencent.mm.protobuf.i.c(-1, "needcompressthumb"), com.tencent.mm.protobuf.i.c(-1, "ishighqualityresources")});
        this.f393135d = appendAttrs;
        super.set__serialName("dataitem");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        super.replaceDefault(appendAttrs, new java.lang.Object[]{0, 0, "", "", 0, "", "", "", "", "", 0, 0, "", "", "", 0, 0, "", "", "", "", "", "", "", "", 0L, "", "", 0L, "", "", "", "", "", "", null, "", 0L, "", 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "", null, null, "", "", bool, bool, bool});
    }

    public java.lang.String A() {
        return super.getString(this.f393135d + 2);
    }

    public void A0(java.lang.String str) {
        super.set(this.f393135d + 33, str);
    }

    public void A1(java.lang.String str) {
        super.set(this.f393135d + 21, str);
    }

    public r72.f B() {
        return (r72.f) super.getCustom(this.f393135d + 43);
    }

    public void B0(java.lang.String str) {
        super.set(this.f393135d + 14, str);
    }

    public void B1(r72.h0 h0Var) {
        super.set(this.f393135d + 41, h0Var);
    }

    public r72.b0 C() {
        return (r72.b0) super.getCustom(this.f393135d + 47);
    }

    public void C0(java.lang.String str) {
        super.set(this.f393135d + 12, str);
    }

    public void C1(java.lang.String str) {
        super.set(this.f393135d + 29, str);
    }

    public void D0(int i17) {
        super.set(this.f393135d + 15, java.lang.Integer.valueOf(i17));
    }

    public void D1(java.lang.String str) {
        super.set(this.f393135d + 17, str);
    }

    public r72.d0 E() {
        return (r72.d0) super.getCustom(this.f393135d + 45);
    }

    public void E0(java.lang.String str) {
        super.set(this.f393135d + 13, str);
    }

    public void E1(int i17) {
        super.set(this.f393135d + 11, java.lang.Integer.valueOf(i17));
    }

    public java.lang.String F() {
        return super.getString(this.f393135d + 5);
    }

    public void F0(java.lang.String str) {
        super.set(this.f393135d + 9, str);
    }

    public void F1(int i17) {
        super.set(this.f393135d + 40, java.lang.Integer.valueOf(i17));
    }

    public r72.i G() {
        return (r72.i) super.getCustom(this.f393135d + 42);
    }

    public void G0(int i17) {
        super.set(this.f393135d + 4, java.lang.Integer.valueOf(i17));
    }

    public void G1(java.lang.String str) {
        super.set(this.f393135d + 26, str);
    }

    public java.lang.String H() {
        return super.getString(this.f393135d + 31);
    }

    public void H0(r72.a aVar) {
        super.set(this.f393135d + 48, aVar);
    }

    public void H1(long j17) {
        super.set(this.f393135d + 28, java.lang.Long.valueOf(j17));
    }

    public java.lang.String I() {
        return super.getString(this.f393135d + 56);
    }

    public void I0(r72.c cVar) {
        super.set(this.f393135d + 54, cVar);
    }

    public void I1(java.lang.String str) {
        super.set(this.f393135d + 27, str);
    }

    public java.lang.String J() {
        return super.getString(this.f393135d + 32);
    }

    public void J0(java.lang.String str) {
        super.set(this.f393135d + 8, str);
    }

    public void J1(int i17) {
        super.set(this.f393135d + 10, java.lang.Integer.valueOf(i17));
    }

    public java.lang.String K() {
        return super.getString(this.f393135d + 30);
    }

    public void K0(java.lang.String str) {
        super.set(this.f393135d + 22, str);
    }

    public void K1(r72.i0 i0Var) {
        super.set(this.f393135d + 53, i0Var);
    }

    public int L() {
        return super.getInteger(this.f393135d + 1);
    }

    public void L0(r72.u uVar) {
        super.set(this.f393135d + 57, uVar);
    }

    public void L1(r72.j0 j0Var) {
        super.set(this.f393135d + 52, j0Var);
    }

    public void M0(r72.r rVar) {
        super.set(this.f393135d + 55, rVar);
    }

    public java.lang.String N() {
        return super.getString(this.f393135d + 7);
    }

    public void N0(r72.u uVar) {
        super.set(this.f393135d + 58, uVar);
    }

    public r72.k0 O() {
        return (r72.k0) super.getCustom(this.f393135d + 46);
    }

    public void O0(java.lang.String str) {
        super.set(this.f393135d + 6, str);
    }

    public int P() {
        return super.getInteger(this.f393135d + 0);
    }

    public void P0(java.lang.String str) {
        super.set(this.f393135d + 2, str);
    }

    public r72.m0 Q() {
        return (r72.m0) super.getCustom(this.f393135d + 44);
    }

    public void Q0(r72.f fVar) {
        super.set(this.f393135d + 43, fVar);
    }

    public int R() {
        return super.getInteger(this.f393135d + 16);
    }

    public void R0(r72.b0 b0Var) {
        super.set(this.f393135d + 47, b0Var);
    }

    public r72.m S() {
        return (r72.m) super.getCustom(this.f393135d + 50);
    }

    public void S0(r72.d0 d0Var) {
        super.set(this.f393135d + 45, d0Var);
    }

    public x05.j T() {
        return (x05.j) super.getCustom(this.f393135d + 49);
    }

    public void T0(java.lang.String str) {
        super.set(this.f393135d + 5, str);
    }

    public long U() {
        return super.getLong(this.f393135d + 37);
    }

    public void U0(r72.i iVar) {
        super.set(this.f393135d + 42, iVar);
    }

    public long V() {
        return super.getLong(this.f393135d + 25);
    }

    public void V0(java.lang.String str) {
        super.set(this.f393135d + 31, str);
    }

    public java.lang.String W() {
        return super.getString(this.f393135d + 23);
    }

    public void W0(java.lang.String str) {
        super.set(this.f393135d + 56, str);
    }

    public void X0(java.lang.String str) {
        super.set(this.f393135d + 32, str);
    }

    public java.lang.String Y() {
        return super.getString(this.f393135d + 24);
    }

    public void Y0(java.lang.String str) {
        super.set(this.f393135d + 30, str);
    }

    public java.lang.String Z() {
        return super.getString(this.f393135d + 3);
    }

    public void Z0(int i17) {
        super.set(this.f393135d + 1, java.lang.Integer.valueOf(i17));
    }

    public java.lang.String a0() {
        return super.getString(this.f393135d + 36);
    }

    public void a1(java.lang.String str) {
        super.set(this.f393135d + 7, str);
    }

    public r72.a0 b0() {
        return (r72.a0) super.getCustom(this.f393135d + 51);
    }

    public void b1(r72.k0 k0Var) {
        super.set(this.f393135d + 46, k0Var);
    }

    public boolean c0() {
        return super.getBoolean(this.f393135d + 61);
    }

    public void c1(int i17) {
        super.set(this.f393135d + 0, java.lang.Integer.valueOf(i17));
    }

    public boolean d0() {
        return super.getBoolean(this.f393135d + 62);
    }

    public void d1(r72.m0 m0Var) {
        super.set(this.f393135d + 44, m0Var);
    }

    public r72.h e0() {
        return (r72.h) super.getCustom(this.f393135d + 35);
    }

    public void e1(int i17) {
        super.set(this.f393135d + 16, java.lang.Integer.valueOf(i17));
    }

    public java.lang.String f0() {
        return super.getString(this.f393135d + 18);
    }

    public void f1(int i17) {
        super.set(this.f393135d + 39, java.lang.Integer.valueOf(i17));
    }

    public java.lang.String g0() {
        return super.getString(this.f393135d + 19);
    }

    public void g1(r72.m mVar) {
        super.set(this.f393135d + 50, mVar);
    }

    public int getFileType() {
        return super.getInteger(this.f393135d + 39);
    }

    public int getThumbWidth() {
        return super.getInteger(this.f393135d + 10);
    }

    public java.lang.String h0() {
        return super.getString(this.f393135d + 38);
    }

    public void h1(x05.j jVar) {
        super.set(this.f393135d + 49, jVar);
    }

    public java.lang.String i0() {
        return super.getString(this.f393135d + 59);
    }

    public void i1(long j17) {
        super.set(this.f393135d + 37, java.lang.Long.valueOf(j17));
    }

    public java.lang.String j() {
        return super.getString(this.f393135d + 33);
    }

    public java.lang.String j0() {
        return super.getString(this.f393135d + 60);
    }

    public void j1(long j17) {
        super.set(this.f393135d + 25, java.lang.Long.valueOf(j17));
    }

    public java.lang.String k() {
        return super.getString(this.f393135d + 14);
    }

    public java.lang.String k0() {
        return super.getString(this.f393135d + 34);
    }

    public void k1(java.lang.String str) {
        super.set(this.f393135d + 23, str);
    }

    public java.lang.String l() {
        return super.getString(this.f393135d + 12);
    }

    public java.lang.String l0() {
        return super.getString(this.f393135d + 20);
    }

    public void l1(java.lang.String str) {
        super.set(this.f393135d + 24, str);
    }

    public java.lang.String m0() {
        return super.getString(this.f393135d + 21);
    }

    public void m1(boolean z17) {
        super.set(this.f393135d + 63, java.lang.Boolean.valueOf(z17));
    }

    public int n() {
        return super.getInteger(this.f393135d + 15);
    }

    public r72.h0 n0() {
        return (r72.h0) super.getCustom(this.f393135d + 41);
    }

    public void n1(java.lang.String str) {
        super.set(this.f393135d + 3, str);
    }

    public java.lang.String o() {
        return super.getString(this.f393135d + 13);
    }

    public java.lang.String o0() {
        return super.getString(this.f393135d + 29);
    }

    public void o1(java.lang.String str) {
        super.set(this.f393135d + 36, str);
    }

    public java.lang.String p() {
        return super.getString(this.f393135d + 9);
    }

    public java.lang.String p0() {
        return super.getString(this.f393135d + 17);
    }

    public void p1(r72.a0 a0Var) {
        super.set(this.f393135d + 51, a0Var);
    }

    public int q() {
        return super.getInteger(this.f393135d + 4);
    }

    public int q0() {
        return super.getInteger(this.f393135d + 11);
    }

    public void q1(boolean z17) {
        super.set(this.f393135d + 61, java.lang.Boolean.valueOf(z17));
    }

    public r72.a r() {
        return (r72.a) super.getCustom(this.f393135d + 48);
    }

    public int r0() {
        return super.getInteger(this.f393135d + 40);
    }

    public void r1(boolean z17) {
        super.set(this.f393135d + 62, java.lang.Boolean.valueOf(z17));
    }

    public r72.c s() {
        return (r72.c) super.getCustom(this.f393135d + 54);
    }

    public void s1(r72.h hVar) {
        super.set(this.f393135d + 35, hVar);
    }

    public java.lang.String t() {
        return super.getString(this.f393135d + 8);
    }

    public java.lang.String t0() {
        return super.getString(this.f393135d + 26);
    }

    public void t1(java.lang.String str) {
        super.set(this.f393135d + 18, str);
    }

    public java.lang.String u() {
        return super.getString(this.f393135d + 22);
    }

    public long u0() {
        return super.getLong(this.f393135d + 28);
    }

    public void u1(java.lang.String str) {
        super.set(this.f393135d + 19, str);
    }

    public java.lang.String v0() {
        return super.getString(this.f393135d + 27);
    }

    public void v1(java.lang.String str) {
        super.set(this.f393135d + 38, str);
    }

    public r72.u w() {
        return (r72.u) super.getCustom(this.f393135d + 57);
    }

    public r72.i0 w0() {
        return (r72.i0) super.getCustom(this.f393135d + 53);
    }

    public void w1(java.lang.String str) {
        super.set(this.f393135d + 59, str);
    }

    public r72.r x() {
        return (r72.r) super.getCustom(this.f393135d + 55);
    }

    public r72.j0 x0() {
        return (r72.j0) super.getCustom(this.f393135d + 52);
    }

    public void x1(java.lang.String str) {
        super.set(this.f393135d + 60, str);
    }

    public r72.u y() {
        return (r72.u) super.getCustom(this.f393135d + 58);
    }

    public void y1(java.lang.String str) {
        super.set(this.f393135d + 34, str);
    }

    public java.lang.String z() {
        return super.getString(this.f393135d + 6);
    }

    public boolean z0() {
        return super.getBoolean(this.f393135d + 63);
    }

    public void z1(java.lang.String str) {
        super.set(this.f393135d + 20, str);
    }
}
