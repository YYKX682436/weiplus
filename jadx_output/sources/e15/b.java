package e15;

/* loaded from: classes9.dex */
public class b extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f246446d;

    public b() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "mvObjectId"), com.tencent.mm.protobuf.i.u(-1, "mvNonceId"), com.tencent.mm.protobuf.i.u(-1, "mvMakerFinderNickname"), com.tencent.mm.protobuf.i.u(-1, "mvIdentification"), com.tencent.mm.protobuf.i.u(-1, "mvExtInfo"), com.tencent.mm.protobuf.i.u(-1, "mvOperationUrl"), com.tencent.mm.protobuf.i.u(-1, "appIdForSourceDisplay"), com.tencent.mm.protobuf.i.u(-1, "mvCoverUrl"), com.tencent.mm.protobuf.i.u(-1, "mvSingerName"), com.tencent.mm.protobuf.i.u(-1, "mvAlbumName"), com.tencent.mm.protobuf.i.u(-1, "mvMusicGenre"), com.tencent.mm.protobuf.i.u(-1, "mvIssueDate"), com.tencent.mm.protobuf.i.i(-1, "musicDuration"), com.tencent.mm.protobuf.i.u(-1, "mid")});
        this.f246446d = appendAttrs;
        super.set__serialName("musicShareItem");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{null, null, null, null, null, null, null, null, null, null, null, null, 0, null});
    }

    public void A(java.lang.String str) {
        super.set(this.f246446d + 11, str);
    }

    public void B(java.lang.String str) {
        super.set(this.f246446d + 10, str);
    }

    public void C(java.lang.String str) {
        super.set(this.f246446d + 8, str);
    }

    public java.lang.String j() {
        return super.getString(this.f246446d + 13);
    }

    public int k() {
        return super.getInteger(this.f246446d + 12);
    }

    public java.lang.String l() {
        return super.getString(this.f246446d + 9);
    }

    public java.lang.String n() {
        return super.getString(this.f246446d + 7);
    }

    public java.lang.String o() {
        return super.getString(this.f246446d + 4);
    }

    public java.lang.String p() {
        return super.getString(this.f246446d + 3);
    }

    public java.lang.String q() {
        return super.getString(this.f246446d + 11);
    }

    public java.lang.String r() {
        return super.getString(this.f246446d + 2);
    }

    public java.lang.String s() {
        return super.getString(this.f246446d + 10);
    }

    public java.lang.String t() {
        return super.getString(this.f246446d + 1);
    }

    public java.lang.String u() {
        return super.getString(this.f246446d + 0);
    }

    public java.lang.String w() {
        return super.getString(this.f246446d + 5);
    }

    public java.lang.String x() {
        return super.getString(this.f246446d + 8);
    }

    public void y(int i17) {
        super.set(this.f246446d + 12, java.lang.Integer.valueOf(i17));
    }

    public void z(java.lang.String str) {
        super.set(this.f246446d + 9, str);
    }
}
