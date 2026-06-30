package w05;

/* loaded from: classes5.dex */
public class n extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f441944d;

    public n() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "skuimgurl")});
        this.f441944d = appendAttrs;
        super.set__serialName("skuinfo");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{""});
    }

    public java.lang.String j() {
        return super.getString(this.f441944d + 0);
    }
}
