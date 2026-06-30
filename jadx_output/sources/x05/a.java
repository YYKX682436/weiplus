package x05;

/* loaded from: classes9.dex */
public class a extends r05.k {

    /* renamed from: e, reason: collision with root package name */
    public final int f451188e;

    public a() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.i(-1, "mediaType"), com.tencent.mm.protobuf.i.u(-1, "url"), com.tencent.mm.protobuf.i.u(-1, "thumbUrl"), com.tencent.mm.protobuf.i.u(-1, "coverUrl"), com.tencent.mm.protobuf.i.u(-1, "fullCoverUrl"), com.tencent.mm.protobuf.i.u(-1, "fullClipInset"), com.tencent.mm.protobuf.i.g(-1, "width"), com.tencent.mm.protobuf.i.g(-1, "height"), com.tencent.mm.protobuf.i.i(-1, "videoPlayDuration")});
        this.f451188e = appendAttrs;
        super.set__serialName("media");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        java.lang.Float valueOf = java.lang.Float.valueOf(0.0f);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{0, "", "", "", "", "", valueOf, valueOf, 0});
    }

    public java.lang.String getCoverUrl() {
        return super.getString(this.f451188e + 3);
    }

    public float getHeight() {
        return super.getFloat(this.f451188e + 7);
    }

    public int getMediaType() {
        return super.getInteger(this.f451188e + 0);
    }

    public java.lang.String getThumbUrl() {
        return super.getString(this.f451188e + 2);
    }

    public float getWidth() {
        return super.getFloat(this.f451188e + 6);
    }

    public java.lang.String j() {
        return super.getString(this.f451188e + 5);
    }

    public java.lang.String k() {
        return super.getString(this.f451188e + 4);
    }

    public int l() {
        return super.getInteger(this.f451188e + 8);
    }

    public void n(java.lang.String str) {
        super.set(this.f451188e + 3, str);
    }

    public void o(java.lang.String str) {
        super.set(this.f451188e + 5, str);
    }

    public void p(java.lang.String str) {
        super.set(this.f451188e + 4, str);
    }

    public void q(float f17) {
        super.set(this.f451188e + 7, java.lang.Float.valueOf(f17));
    }

    public void r(int i17) {
        super.set(this.f451188e + 0, java.lang.Integer.valueOf(i17));
    }

    public void s(java.lang.String str) {
        super.set(this.f451188e + 2, str);
    }

    public void t(int i17) {
        super.set(this.f451188e + 8, java.lang.Integer.valueOf(i17));
    }

    public void u(float f17) {
        super.set(this.f451188e + 6, java.lang.Float.valueOf(f17));
    }
}
