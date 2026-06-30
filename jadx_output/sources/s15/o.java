package s15;

/* loaded from: classes9.dex */
public class o extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f402174d;

    public o() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "objectId"), com.tencent.mm.protobuf.i.u(-1, "objectNonceId"), com.tencent.mm.protobuf.i.i(-1, "feedType"), com.tencent.mm.protobuf.i.u(-1, "nickname"), com.tencent.mm.protobuf.i.u(-1, dm.i4.COL_USERNAME), com.tencent.mm.protobuf.i.u(-1, "avatar"), com.tencent.mm.protobuf.i.u(-1, "desc"), com.tencent.mm.protobuf.i.i(-1, "mediaCount"), com.tencent.mm.protobuf.i.n(-1, dm.i4.COL_LOCALID), com.tencent.mm.protobuf.i.i(-1, "authIconType"), com.tencent.mm.protobuf.i.u(-1, "authIconUrl"), com.tencent.mm.protobuf.i.t(-1, "mediaList", s15.p.class, "media"), com.tencent.mm.protobuf.i.r(-1, "megaVideo", s15.q.class), com.tencent.mm.protobuf.i.u(-1, "bizUsername"), com.tencent.mm.protobuf.i.u(-1, "bizNickname"), com.tencent.mm.protobuf.i.u(-1, "bizAvatar"), com.tencent.mm.protobuf.i.u(-1, "bizUsernameV2"), com.tencent.mm.protobuf.i.i(-1, "bizAuthIconType"), com.tencent.mm.protobuf.i.u(-1, "bizAuthIconUrl"), com.tencent.mm.protobuf.i.i(-1, "coverEffectType"), com.tencent.mm.protobuf.i.u(-1, "coverEffectText"), com.tencent.mm.protobuf.i.u(-1, "finderForwardSource"), com.tencent.mm.protobuf.i.u(-1, "contactJumpInfoStr"), com.tencent.mm.protobuf.i.r(-1, "newlifeShareExtInfo", s15.d.class), com.tencent.mm.protobuf.i.i(-1, "sourceCommentScene"), com.tencent.mm.protobuf.i.u(-1, "finderShareExtInfo")});
        this.f402174d = appendAttrs;
        super.set__serialName("RecordFinderFeedItem");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", "", 0, "", "", "", "", 0, 0L, 0, "", new java.util.LinkedList(), null, "", "", "", "", 0, "", 0, "", "", "", null, 0, ""});
    }

    public void A(java.lang.String str) {
        super.set(this.f402174d + 10, str);
    }

    public void B(java.lang.String str) {
        super.set(this.f402174d + 5, str);
    }

    public void C(int i17) {
        super.set(this.f402174d + 17, java.lang.Integer.valueOf(i17));
    }

    public void E(java.lang.String str) {
        super.set(this.f402174d + 18, str);
    }

    public void F(java.lang.String str) {
        super.set(this.f402174d + 15, str);
    }

    public void G(java.lang.String str) {
        super.set(this.f402174d + 14, str);
    }

    public void H(java.lang.String str) {
        super.set(this.f402174d + 13, str);
    }

    public void I(java.lang.String str) {
        super.set(this.f402174d + 16, str);
    }

    public void J(java.lang.String str) {
        super.set(this.f402174d + 22, str);
    }

    public void K(java.lang.String str) {
        super.set(this.f402174d + 20, str);
    }

    public void L(int i17) {
        super.set(this.f402174d + 19, java.lang.Integer.valueOf(i17));
    }

    public void N(java.lang.String str) {
        super.set(this.f402174d + 6, str);
    }

    public void O(int i17) {
        super.set(this.f402174d + 2, java.lang.Integer.valueOf(i17));
    }

    public void P(java.lang.String str) {
        super.set(this.f402174d + 21, str);
    }

    public void Q(java.lang.String str) {
        super.set(this.f402174d + 25, str);
    }

    public void R(long j17) {
        super.set(this.f402174d + 8, java.lang.Long.valueOf(j17));
    }

    public void S(int i17) {
        super.set(this.f402174d + 7, java.lang.Integer.valueOf(i17));
    }

    public void T(java.util.LinkedList linkedList) {
        super.set(this.f402174d + 11, linkedList);
    }

    public void U(s15.q qVar) {
        super.set(this.f402174d + 12, qVar);
    }

    public void V(s15.d dVar) {
        super.set(this.f402174d + 23, dVar);
    }

    public void W(java.lang.String str) {
        super.set(this.f402174d + 3, str);
    }

    public void Y(java.lang.String str) {
        super.set(this.f402174d + 0, str);
    }

    public void Z(java.lang.String str) {
        super.set(this.f402174d + 1, str);
    }

    public void a0(int i17) {
        super.set(this.f402174d + 24, java.lang.Integer.valueOf(i17));
    }

    public void b0(java.lang.String str) {
        super.set(this.f402174d + 4, str);
    }

    public int getAuthIconType() {
        return super.getInteger(this.f402174d + 9);
    }

    public java.lang.String getAuthIconUrl() {
        return super.getString(this.f402174d + 10);
    }

    public java.lang.String getNickname() {
        return super.getString(this.f402174d + 3);
    }

    public java.lang.String getObjectNonceId() {
        return super.getString(this.f402174d + 1);
    }

    public java.lang.String getUsername() {
        return super.getString(this.f402174d + 4);
    }

    public java.lang.String j() {
        return super.getString(this.f402174d + 5);
    }

    public int k() {
        return super.getInteger(this.f402174d + 17);
    }

    public java.lang.String l() {
        return super.getString(this.f402174d + 18);
    }

    public java.lang.String n() {
        return super.getString(this.f402174d + 15);
    }

    public java.lang.String o() {
        return super.getString(this.f402174d + 16);
    }

    public java.lang.String p() {
        return super.getString(this.f402174d + 6);
    }

    public int q() {
        return super.getInteger(this.f402174d + 2);
    }

    public long r() {
        return super.getLong(this.f402174d + 8);
    }

    public int s() {
        return super.getInteger(this.f402174d + 7);
    }

    public java.util.LinkedList t() {
        return super.getLinkedList(this.f402174d + 11);
    }

    public s15.q u() {
        return (s15.q) super.getCustom(this.f402174d + 12);
    }

    public s15.d w() {
        return (s15.d) super.getCustom(this.f402174d + 23);
    }

    public java.lang.String x() {
        return super.getString(this.f402174d + 0);
    }

    public int y() {
        return super.getInteger(this.f402174d + 24);
    }

    public void z(int i17) {
        super.set(this.f402174d + 9, java.lang.Integer.valueOf(i17));
    }
}
