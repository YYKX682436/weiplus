package x05;

/* loaded from: classes9.dex */
public class p extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f451200d;

    public p() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "objectId"), com.tencent.mm.protobuf.i.u(-1, "objectNonceId"), com.tencent.mm.protobuf.i.i(-1, ya.b.CONTENT_TYPE)});
        this.f451200d = appendAttrs;
        super.set__serialName("megaVideo");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{null, null, 0});
    }

    public java.lang.String getObjectNonceId() {
        return super.getString(this.f451200d + 1);
    }

    public int j() {
        return super.getInteger(this.f451200d + 2);
    }

    public java.lang.String k() {
        return super.getString(this.f451200d + 0);
    }

    public void l(java.lang.String str) {
        super.set(this.f451200d + 0, str);
    }

    public void n(java.lang.String str) {
        super.set(this.f451200d + 1, str);
    }
}
