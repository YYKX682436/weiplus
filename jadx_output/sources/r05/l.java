package r05;

/* loaded from: classes9.dex */
public class l extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f368366d;

    public l() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "from_username"), com.tencent.mm.protobuf.i.u(-1, "card_id"), com.tencent.mm.protobuf.i.i(-1, "from_scene"), com.tencent.mm.protobuf.i.i(-1, "card_type"), com.tencent.mm.protobuf.i.u(-1, "color"), com.tencent.mm.protobuf.i.u(-1, "card_type_name"), com.tencent.mm.protobuf.i.u(-1, "brand_name"), com.tencent.mm.protobuf.i.u(-1, "card_ext")});
        this.f368366d = appendAttrs;
        super.set__serialName("carditem");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{null, null, 0, 0, null, null, null, null});
    }

    public java.lang.String j() {
        return super.getString(this.f368366d + 6);
    }
}
