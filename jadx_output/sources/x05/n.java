package x05;

/* loaded from: classes9.dex */
public class n extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f451198d;

    public n() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "coverUrl"), com.tencent.mm.protobuf.i.g(-1, "height"), com.tencent.mm.protobuf.i.g(-1, "width")});
        this.f451198d = appendAttrs;
        super.set__serialName("media");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        java.lang.Float valueOf = java.lang.Float.valueOf(0.0f);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{null, valueOf, valueOf});
    }

    public java.lang.String getCoverUrl() {
        return super.getString(this.f451198d + 0);
    }

    public float getHeight() {
        return super.getFloat(this.f451198d + 1);
    }

    public float getWidth() {
        return super.getFloat(this.f451198d + 2);
    }

    public void j(java.lang.String str) {
        super.set(this.f451198d + 0, str);
    }

    public void k(float f17) {
        super.set(this.f451198d + 1, java.lang.Float.valueOf(f17));
    }

    public void l(float f17) {
        super.set(this.f451198d + 2, java.lang.Float.valueOf(f17));
    }
}
