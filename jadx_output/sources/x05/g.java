package x05;

/* loaded from: classes9.dex */
public class g extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f451191d;

    public g() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.i(-1, "fromRichPublisher"), com.tencent.mm.protobuf.i.g(-1, "pictureCutRatio"), com.tencent.mm.protobuf.i.g(-1, "pictureCutRatioForFinder"), com.tencent.mm.protobuf.i.u(-1, "richTextJson"), com.tencent.mm.protobuf.i.u(-1, "richTextTitle")});
        this.f451191d = appendAttrs;
        super.set__serialName("desc");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        java.lang.Float valueOf = java.lang.Float.valueOf(0.0f);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{0, valueOf, valueOf, null, null});
    }

    public int j() {
        return super.getInteger(this.f451191d + 0);
    }

    public float k() {
        return super.getFloat(this.f451191d + 1);
    }

    public float l() {
        return super.getFloat(this.f451191d + 2);
    }

    public java.lang.String n() {
        return super.getString(this.f451191d + 3);
    }

    public java.lang.String o() {
        return super.getString(this.f451191d + 4);
    }

    public void p(int i17) {
        super.set(this.f451191d + 0, java.lang.Integer.valueOf(i17));
    }

    public void q(float f17) {
        super.set(this.f451191d + 1, java.lang.Float.valueOf(f17));
    }

    public void r(float f17) {
        super.set(this.f451191d + 2, java.lang.Float.valueOf(f17));
    }

    public void s(java.lang.String str) {
        super.set(this.f451191d + 3, str);
    }

    public void t(java.lang.String str) {
        super.set(this.f451191d + 4, str);
    }
}
