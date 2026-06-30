package s15;

/* loaded from: classes9.dex */
public class b extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f402153d;

    public b() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "rich_text_json"), com.tencent.mm.protobuf.i.u(-1, "rich_text_title"), com.tencent.mm.protobuf.i.h(-1, "picture_cut_ratio"), com.tencent.mm.protobuf.i.i(-1, "from_rich_publisher")});
        this.f402153d = appendAttrs;
        super.set__serialName("FinderNewLifeDesc");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", "", java.lang.Double.valueOf(0.0d), 0});
    }

    public java.lang.String j() {
        return super.getString(this.f402153d + 1);
    }
}
