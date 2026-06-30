package x05;

/* loaded from: classes9.dex */
public class j extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f451194d;

    public j() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "objectId"), com.tencent.mm.protobuf.i.u(-1, "objectNonceId"), com.tencent.mm.protobuf.i.i(-1, "feedType"), com.tencent.mm.protobuf.i.u(-1, "nickname"), com.tencent.mm.protobuf.i.u(-1, dm.i4.COL_USERNAME), com.tencent.mm.protobuf.i.u(-1, "avatar"), com.tencent.mm.protobuf.i.u(-1, "desc"), com.tencent.mm.protobuf.i.i(-1, "mediaCount"), com.tencent.mm.protobuf.i.n(-1, dm.i4.COL_LOCALID), com.tencent.mm.protobuf.i.i(-1, "authIconType"), com.tencent.mm.protobuf.i.u(-1, "authIconUrl"), com.tencent.mm.protobuf.i.t(-1, "mediaList", x05.a.class, "media"), com.tencent.mm.protobuf.i.r(-1, "megaVideo", x05.p.class), com.tencent.mm.protobuf.i.u(-1, "bizUsername"), com.tencent.mm.protobuf.i.u(-1, "bizNickname"), com.tencent.mm.protobuf.i.u(-1, "bizAvatar"), com.tencent.mm.protobuf.i.u(-1, "bizUsernameV2"), com.tencent.mm.protobuf.i.i(-1, "bizAuthIconType"), com.tencent.mm.protobuf.i.u(-1, "bizAuthIconUrl"), com.tencent.mm.protobuf.i.i(-1, "coverEffectType"), com.tencent.mm.protobuf.i.u(-1, "coverEffectText"), com.tencent.mm.protobuf.i.u(-1, "finderForwardSource"), com.tencent.mm.protobuf.i.u(-1, "contactJumpInfoStr"), com.tencent.mm.protobuf.i.u(-1, "ecSource"), com.tencent.mm.protobuf.i.u(-1, "lastGMsgID"), com.tencent.mm.protobuf.i.r(-1, "newlifeShareExtInfo", x05.q.class), com.tencent.mm.protobuf.i.i(-1, "sourceCommentScene"), com.tencent.mm.protobuf.i.u(-1, "finderShareExtInfo")});
        this.f451194d = appendAttrs;
        super.set__serialName("finderFeed");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{null, null, 0, null, null, null, null, 0, 0L, 0, null, new java.util.LinkedList(), null, null, null, null, null, 0, null, 0, null, null, null, null, null, null, 0, null});
    }

    public int A() {
        return super.getInteger(this.f451194d + 7);
    }

    public x05.p B() {
        return (x05.p) super.getCustom(this.f451194d + 12);
    }

    public x05.q C() {
        return (x05.q) super.getCustom(this.f451194d + 25);
    }

    public java.lang.String E() {
        return super.getString(this.f451194d + 0);
    }

    public int F() {
        return super.getInteger(this.f451194d + 26);
    }

    public void G(int i17) {
        super.set(this.f451194d + 9, java.lang.Integer.valueOf(i17));
    }

    public void H(java.lang.String str) {
        super.set(this.f451194d + 10, str);
    }

    public void I(java.lang.String str) {
        super.set(this.f451194d + 5, str);
    }

    public void J(int i17) {
        super.set(this.f451194d + 17, java.lang.Integer.valueOf(i17));
    }

    public void K(java.lang.String str) {
        super.set(this.f451194d + 18, str);
    }

    public void L(java.lang.String str) {
        super.set(this.f451194d + 15, str);
    }

    public void N(java.lang.String str) {
        super.set(this.f451194d + 14, str);
    }

    public void O(java.lang.String str) {
        super.set(this.f451194d + 13, str);
    }

    public void P(java.lang.String str) {
        super.set(this.f451194d + 16, str);
    }

    public void Q(java.lang.String str) {
        super.set(this.f451194d + 22, str);
    }

    public void R(java.lang.String str) {
        super.set(this.f451194d + 20, str);
    }

    public void S(int i17) {
        super.set(this.f451194d + 19, java.lang.Integer.valueOf(i17));
    }

    public void T(java.lang.String str) {
        super.set(this.f451194d + 6, str);
    }

    public void U(java.lang.String str) {
        super.set(this.f451194d + 23, str);
    }

    public void V(int i17) {
        super.set(this.f451194d + 2, java.lang.Integer.valueOf(i17));
    }

    public void W(java.lang.String str) {
        super.set(this.f451194d + 21, str);
    }

    public void Y(java.lang.String str) {
        super.set(this.f451194d + 27, str);
    }

    public void Z(java.lang.String str) {
        super.set(this.f451194d + 24, str);
    }

    public void a0(long j17) {
        super.set(this.f451194d + 8, java.lang.Long.valueOf(j17));
    }

    public void b0(int i17) {
        super.set(this.f451194d + 7, java.lang.Integer.valueOf(i17));
    }

    public void c0(x05.p pVar) {
        super.set(this.f451194d + 12, pVar);
    }

    public void d0(x05.q qVar) {
        super.set(this.f451194d + 25, qVar);
    }

    public void e0(java.lang.String str) {
        super.set(this.f451194d + 3, str);
    }

    public void f0(java.lang.String str) {
        super.set(this.f451194d + 0, str);
    }

    public void g0(java.lang.String str) {
        super.set(this.f451194d + 1, str);
    }

    public int getAuthIconType() {
        return super.getInteger(this.f451194d + 9);
    }

    public java.lang.String getAuthIconUrl() {
        return super.getString(this.f451194d + 10);
    }

    public java.lang.String getBizNickname() {
        return super.getString(this.f451194d + 14);
    }

    public java.lang.String getBizUsername() {
        return super.getString(this.f451194d + 13);
    }

    public java.util.LinkedList getMediaList() {
        return super.getLinkedList(this.f451194d + 11);
    }

    public java.lang.String getNickname() {
        return super.getString(this.f451194d + 3);
    }

    public java.lang.String getObjectNonceId() {
        return super.getString(this.f451194d + 1);
    }

    public java.lang.String getUsername() {
        return super.getString(this.f451194d + 4);
    }

    public void h0(int i17) {
        super.set(this.f451194d + 26, java.lang.Integer.valueOf(i17));
    }

    public void i0(java.lang.String str) {
        super.set(this.f451194d + 4, str);
    }

    public java.lang.String j() {
        return super.getString(this.f451194d + 5);
    }

    public int k() {
        return super.getInteger(this.f451194d + 17);
    }

    public java.lang.String l() {
        return super.getString(this.f451194d + 18);
    }

    public java.lang.String n() {
        return super.getString(this.f451194d + 15);
    }

    public java.lang.String o() {
        return super.getString(this.f451194d + 16);
    }

    public java.lang.String p() {
        return super.getString(this.f451194d + 22);
    }

    public java.lang.String q() {
        return super.getString(this.f451194d + 20);
    }

    public int r() {
        return super.getInteger(this.f451194d + 19);
    }

    public java.lang.String s() {
        return super.getString(this.f451194d + 6);
    }

    public java.lang.String t() {
        return super.getString(this.f451194d + 23);
    }

    public int u() {
        return super.getInteger(this.f451194d + 2);
    }

    public java.lang.String w() {
        return super.getString(this.f451194d + 21);
    }

    public java.lang.String x() {
        return super.getString(this.f451194d + 27);
    }

    public java.lang.String y() {
        return super.getString(this.f451194d + 24);
    }

    public long z() {
        return super.getLong(this.f451194d + 8);
    }
}
