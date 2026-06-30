package x05;

/* loaded from: classes9.dex */
public class o extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f451199d;

    public o() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "activityKey"), com.tencent.mm.protobuf.i.u(-1, "coverMaskImageURL")});
        this.f451199d = appendAttrs;
        super.set__serialName("instantDiscountActivityExtra");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{null, null});
    }

    public java.lang.String j() {
        return super.getString(this.f451199d + 0);
    }

    public java.lang.String k() {
        return super.getString(this.f451199d + 1);
    }

    public void l(java.lang.String str) {
        super.set(this.f451199d + 0, str);
    }

    public void n(java.lang.String str) {
        super.set(this.f451199d + 1, str);
    }
}
