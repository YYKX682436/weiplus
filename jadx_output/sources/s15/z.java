package s15;

/* loaded from: classes9.dex */
public class z extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f402185d;

    public z() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "mvObjectId"), com.tencent.mm.protobuf.i.u(-1, "mvNonceId"), com.tencent.mm.protobuf.i.u(-1, "mvCoverUrl"), com.tencent.mm.protobuf.i.u(-1, "mvMakerFinderNickname"), com.tencent.mm.protobuf.i.u(-1, "mvSingerName"), com.tencent.mm.protobuf.i.u(-1, "mvAlbumName"), com.tencent.mm.protobuf.i.u(-1, "mvMusicGenre"), com.tencent.mm.protobuf.i.n(-1, "mvIssueDate"), com.tencent.mm.protobuf.i.u(-1, "mvIdentification"), com.tencent.mm.protobuf.i.i(-1, "musicDuration"), com.tencent.mm.protobuf.i.u(-1, "mvExtInfo"), com.tencent.mm.protobuf.i.u(-1, "mvOperationUrl"), com.tencent.mm.protobuf.i.u(-1, "mid"), com.tencent.mm.protobuf.i.i(-1, "listenType"), com.tencent.mm.protobuf.i.u(-1, "appIdForSourceDisplay")});
        this.f402185d = appendAttrs;
        super.set__serialName("RecordMusicItem");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", "", "", "", "", "", "", 0L, "", 0, "", "", "", 0, ""});
    }

    public void A(long j17) {
        super.set(this.f402185d + 7, java.lang.Long.valueOf(j17));
    }

    public void B(java.lang.String str) {
        super.set(this.f402185d + 3, str);
    }

    public void C(java.lang.String str) {
        super.set(this.f402185d + 6, str);
    }

    public void E(java.lang.String str) {
        super.set(this.f402185d + 1, str);
    }

    public void F(java.lang.String str) {
        super.set(this.f402185d + 0, str);
    }

    public void G(java.lang.String str) {
        super.set(this.f402185d + 11, str);
    }

    public void H(java.lang.String str) {
        super.set(this.f402185d + 4, str);
    }

    public int j() {
        return super.getInteger(this.f402185d + 13);
    }

    public java.lang.String k() {
        return super.getString(this.f402185d + 12);
    }

    public int l() {
        return super.getInteger(this.f402185d + 9);
    }

    public java.lang.String n() {
        return super.getString(this.f402185d + 5);
    }

    public java.lang.String o() {
        return super.getString(this.f402185d + 10);
    }

    public java.lang.String p() {
        return super.getString(this.f402185d + 8);
    }

    public java.lang.String q() {
        return super.getString(this.f402185d + 6);
    }

    public java.lang.String r() {
        return super.getString(this.f402185d + 4);
    }

    public void s(java.lang.String str) {
        super.set(this.f402185d + 14, str);
    }

    public void t(java.lang.String str) {
        super.set(this.f402185d + 12, str);
    }

    public void u(int i17) {
        super.set(this.f402185d + 9, java.lang.Integer.valueOf(i17));
    }

    public void w(java.lang.String str) {
        super.set(this.f402185d + 5, str);
    }

    public void x(java.lang.String str) {
        super.set(this.f402185d + 2, str);
    }

    public void y(java.lang.String str) {
        super.set(this.f402185d + 10, str);
    }

    public void z(java.lang.String str) {
        super.set(this.f402185d + 8, str);
    }
}
