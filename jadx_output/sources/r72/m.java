package r72;

/* loaded from: classes16.dex */
public class m extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f393149d;

    public m() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.i(-1, "feedCount"), com.tencent.mm.protobuf.i.i(-1, "collectionTopicType"), com.tencent.mm.protobuf.i.i(-1, "paidCollectionType"), com.tencent.mm.protobuf.i.i(-1, ya.b.PRICE), com.tencent.mm.protobuf.i.u(-1, com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE), com.tencent.mm.protobuf.i.n(-1, "collectionId"), com.tencent.mm.protobuf.i.u(-1, "thumbUrl"), com.tencent.mm.protobuf.i.u(-1, "collectionDesc"), com.tencent.mm.protobuf.i.u(-1, "authorUsername"), com.tencent.mm.protobuf.i.u(-1, "nickname"), com.tencent.mm.protobuf.i.u(-1, "avatarURL"), com.tencent.mm.protobuf.i.u(-1, "authIconURL"), com.tencent.mm.protobuf.i.i(-1, "authIconType"), com.tencent.mm.protobuf.i.i(-1, "sourceCommentScene")});
        this.f393149d = appendAttrs;
        super.set__serialName("finderCollection");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{0, 0, 0, 0, "", 0L, "", "", "", "", "", "", 0, 0});
    }

    public void A(int i17) {
        super.set(this.f393149d + 0, java.lang.Integer.valueOf(i17));
    }

    public void B(java.lang.String str) {
        super.set(this.f393149d + 9, str);
    }

    public void C(int i17) {
        super.set(this.f393149d + 2, java.lang.Integer.valueOf(i17));
    }

    public void E(int i17) {
        super.set(this.f393149d + 3, java.lang.Integer.valueOf(i17));
    }

    public void F(int i17) {
        super.set(this.f393149d + 13, java.lang.Integer.valueOf(i17));
    }

    public void G(java.lang.String str) {
        super.set(this.f393149d + 6, str);
    }

    public void H(java.lang.String str) {
        super.set(this.f393149d + 4, str);
    }

    public int getAuthIconType() {
        return super.getInteger(this.f393149d + 12);
    }

    public int getFeedCount() {
        return super.getInteger(this.f393149d + 0);
    }

    public java.lang.String getNickname() {
        return super.getString(this.f393149d + 9);
    }

    public int getPrice() {
        return super.getInteger(this.f393149d + 3);
    }

    public java.lang.String getThumbUrl() {
        return super.getString(this.f393149d + 6);
    }

    public java.lang.String getTitle() {
        return super.getString(this.f393149d + 4);
    }

    public java.lang.String j() {
        return super.getString(this.f393149d + 11);
    }

    public java.lang.String k() {
        return super.getString(this.f393149d + 8);
    }

    public java.lang.String l() {
        return super.getString(this.f393149d + 10);
    }

    public java.lang.String n() {
        return super.getString(this.f393149d + 7);
    }

    public long o() {
        return super.getLong(this.f393149d + 5);
    }

    public int p() {
        return super.getInteger(this.f393149d + 1);
    }

    public int q() {
        return super.getInteger(this.f393149d + 2);
    }

    public int r() {
        return super.getInteger(this.f393149d + 13);
    }

    public void s(int i17) {
        super.set(this.f393149d + 12, java.lang.Integer.valueOf(i17));
    }

    public void t(java.lang.String str) {
        super.set(this.f393149d + 11, str);
    }

    public void u(java.lang.String str) {
        super.set(this.f393149d + 8, str);
    }

    public void w(java.lang.String str) {
        super.set(this.f393149d + 10, str);
    }

    public void x(java.lang.String str) {
        super.set(this.f393149d + 7, str);
    }

    public void y(long j17) {
        super.set(this.f393149d + 5, java.lang.Long.valueOf(j17));
    }

    public void z(int i17) {
        super.set(this.f393149d + 1, java.lang.Integer.valueOf(i17));
    }
}
