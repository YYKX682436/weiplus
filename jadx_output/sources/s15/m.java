package s15;

/* loaded from: classes9.dex */
public class m extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f402172d;

    public m() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.i(-1, "feedCount"), com.tencent.mm.protobuf.i.i(-1, "collectionTopicType"), com.tencent.mm.protobuf.i.i(-1, "paidCollectionType"), com.tencent.mm.protobuf.i.i(-1, ya.b.PRICE), com.tencent.mm.protobuf.i.u(-1, com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE), com.tencent.mm.protobuf.i.u(-1, "collectionId"), com.tencent.mm.protobuf.i.u(-1, "thumbUrl"), com.tencent.mm.protobuf.i.u(-1, "collectionDesc"), com.tencent.mm.protobuf.i.u(-1, "authorUsername"), com.tencent.mm.protobuf.i.u(-1, "nickname"), com.tencent.mm.protobuf.i.u(-1, "avatarURL"), com.tencent.mm.protobuf.i.u(-1, "authIconURL"), com.tencent.mm.protobuf.i.i(-1, "authIconType"), com.tencent.mm.protobuf.i.i(-1, "sourceCommentScene")});
        this.f402172d = appendAttrs;
        super.set__serialName("RecordFinderCollectionItem");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{0, 0, 0, 0, "", "", "", "", "", "", "", "", 0, 0});
    }

    public void A(int i17) {
        super.set(this.f402172d + 2, java.lang.Integer.valueOf(i17));
    }

    public void B(int i17) {
        super.set(this.f402172d + 3, java.lang.Integer.valueOf(i17));
    }

    public void C(java.lang.String str) {
        super.set(this.f402172d + 6, str);
    }

    public void E(java.lang.String str) {
        super.set(this.f402172d + 4, str);
    }

    public int getFeedCount() {
        return super.getInteger(this.f402172d + 0);
    }

    public java.lang.String getNickname() {
        return super.getString(this.f402172d + 9);
    }

    public int getPrice() {
        return super.getInteger(this.f402172d + 3);
    }

    public java.lang.String getThumbUrl() {
        return super.getString(this.f402172d + 6);
    }

    public java.lang.String getTitle() {
        return super.getString(this.f402172d + 4);
    }

    public java.lang.String j() {
        return super.getString(this.f402172d + 8);
    }

    public java.lang.String k() {
        return super.getString(this.f402172d + 10);
    }

    public java.lang.String l() {
        return super.getString(this.f402172d + 7);
    }

    public java.lang.String n() {
        return super.getString(this.f402172d + 5);
    }

    public int o() {
        return super.getInteger(this.f402172d + 1);
    }

    public int p() {
        return super.getInteger(this.f402172d + 2);
    }

    public void q(int i17) {
        super.set(this.f402172d + 12, java.lang.Integer.valueOf(i17));
    }

    public void r(java.lang.String str) {
        super.set(this.f402172d + 11, str);
    }

    public void s(java.lang.String str) {
        super.set(this.f402172d + 8, str);
    }

    public void t(java.lang.String str) {
        super.set(this.f402172d + 10, str);
    }

    public void u(java.lang.String str) {
        super.set(this.f402172d + 7, str);
    }

    public void w(java.lang.String str) {
        super.set(this.f402172d + 5, str);
    }

    public void x(int i17) {
        super.set(this.f402172d + 1, java.lang.Integer.valueOf(i17));
    }

    public void y(int i17) {
        super.set(this.f402172d + 0, java.lang.Integer.valueOf(i17));
    }

    public void z(java.lang.String str) {
        super.set(this.f402172d + 9, str);
    }
}
