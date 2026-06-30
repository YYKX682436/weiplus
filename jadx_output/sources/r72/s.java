package r72;

/* loaded from: classes15.dex */
public class s extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f393156d;

    public s() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "coverUrl"), com.tencent.mm.protobuf.i.g(-1, "height"), com.tencent.mm.protobuf.i.g(-1, "width")});
        this.f393156d = appendAttrs;
        super.set__serialName("media");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        java.lang.Float valueOf = java.lang.Float.valueOf(0.0f);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{null, valueOf, valueOf});
    }

    public java.lang.String getCoverUrl() {
        return super.getString(this.f393156d + 0);
    }

    public float getHeight() {
        return super.getFloat(this.f393156d + 1);
    }

    public float getWidth() {
        return super.getFloat(this.f393156d + 2);
    }

    public void j(java.lang.String str) {
        super.set(this.f393156d + 0, str);
    }

    public void k(float f17) {
        super.set(this.f393156d + 1, java.lang.Float.valueOf(f17));
    }

    public void l(float f17) {
        super.set(this.f393156d + 2, java.lang.Float.valueOf(f17));
    }
}
