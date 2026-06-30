package s15;

/* loaded from: classes9.dex */
public class p extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f402175d;

    public p() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.i(-1, "mediaType"), com.tencent.mm.protobuf.i.u(-1, "url"), com.tencent.mm.protobuf.i.u(-1, "thumbUrl"), com.tencent.mm.protobuf.i.u(-1, "fullCoverUrl"), com.tencent.mm.protobuf.i.u(-1, "fullClipInset"), com.tencent.mm.protobuf.i.g(-1, "width"), com.tencent.mm.protobuf.i.g(-1, "height"), com.tencent.mm.protobuf.i.i(-1, "videoPlayDuration")});
        this.f402175d = appendAttrs;
        super.set__serialName("RecordFinderFeedMediaItem");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        java.lang.Float valueOf = java.lang.Float.valueOf(0.0f);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{0, "", "", "", "", valueOf, valueOf, 0});
    }

    public float getHeight() {
        return super.getFloat(this.f402175d + 6);
    }

    public java.lang.String getThumbUrl() {
        return super.getString(this.f402175d + 2);
    }

    public float getWidth() {
        return super.getFloat(this.f402175d + 5);
    }

    public java.lang.String j() {
        return super.getString(this.f402175d + 3);
    }

    public void k(java.lang.String str) {
        super.set(this.f402175d + 4, str);
    }

    public void l(java.lang.String str) {
        super.set(this.f402175d + 3, str);
    }

    public void n(float f17) {
        super.set(this.f402175d + 6, java.lang.Float.valueOf(f17));
    }

    public void o(int i17) {
        super.set(this.f402175d + 0, java.lang.Integer.valueOf(i17));
    }

    public void p(java.lang.String str) {
        super.set(this.f402175d + 2, str);
    }

    public void q(java.lang.String str) {
        super.set(this.f402175d + 1, str);
    }

    public void r(int i17) {
        super.set(this.f402175d + 7, java.lang.Integer.valueOf(i17));
    }

    public void s(float f17) {
        super.set(this.f402175d + 5, java.lang.Float.valueOf(f17));
    }
}
