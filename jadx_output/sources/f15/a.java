package f15;

/* loaded from: classes9.dex */
public class a extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f258693d;

    public a() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.r(-1, "fav_data_item", c01.f7.class)});
        this.f258693d = appendAttrs;
        super.set__serialName("forward_media_info");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{null});
    }

    public c01.f7 j() {
        return (c01.f7) super.getCustom(this.f258693d + 0);
    }

    public void k(c01.f7 f7Var) {
        super.set(this.f258693d + 0, f7Var);
    }
}
