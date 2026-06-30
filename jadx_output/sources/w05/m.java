package w05;

/* loaded from: classes9.dex */
public class m extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f441943d;

    public m() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "secret_img"), com.tencent.mm.protobuf.i.u(-1, "secret_img_with_bow"), com.tencent.mm.protobuf.i.u(-1, "orignial_img"), com.tencent.mm.protobuf.i.u(-1, "secret_title"), com.tencent.mm.protobuf.i.u(-1, "secret_sku_description"), com.tencent.mm.protobuf.i.i(-1, "is_secret_present"), com.tencent.mm.protobuf.i.i(-1, "is_revealed")});
        this.f441943d = appendAttrs;
        super.set__serialName("secret_present_info");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", "", "", "", "", 0, 0});
    }

    public java.lang.String j() {
        return super.getString(this.f441943d + 2);
    }

    public java.lang.String k() {
        return super.getString(this.f441943d + 0);
    }

    public java.lang.String l() {
        return super.getString(this.f441943d + 1);
    }

    public java.lang.String n() {
        return super.getString(this.f441943d + 4);
    }

    public java.lang.String o() {
        return super.getString(this.f441943d + 3);
    }

    public int p() {
        return super.getInteger(this.f441943d + 6);
    }

    public int q() {
        return super.getInteger(this.f441943d + 5);
    }
}
