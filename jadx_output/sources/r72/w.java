package r72;

/* loaded from: classes15.dex */
public class w extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f393159d;

    public w() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "poiClassifyId"), com.tencent.mm.protobuf.i.g(-1, "longitude"), com.tencent.mm.protobuf.i.g(-1, "latitude")});
        this.f393159d = appendAttrs;
        super.set__serialName("finderTopicLocation");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        java.lang.Float valueOf = java.lang.Float.valueOf(0.0f);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", valueOf, valueOf});
    }

    public float getLatitude() {
        return super.getFloat(this.f393159d + 2);
    }

    public float getLongitude() {
        return super.getFloat(this.f393159d + 1);
    }

    public java.lang.String j() {
        return super.getString(this.f393159d + 0);
    }

    public void k(float f17) {
        super.set(this.f393159d + 2, java.lang.Float.valueOf(f17));
    }

    public void l(float f17) {
        super.set(this.f393159d + 1, java.lang.Float.valueOf(f17));
    }

    public void n(java.lang.String str) {
        super.set(this.f393159d + 0, str);
    }
}
