package s15;

/* loaded from: classes9.dex */
public class q extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f402176d;

    public q() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "objectId"), com.tencent.mm.protobuf.i.u(-1, "objectNonceId"), com.tencent.mm.protobuf.i.i(-1, ya.b.CONTENT_TYPE)});
        this.f402176d = appendAttrs;
        super.set__serialName("RecordFinderFeedMegaVideoItem");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", "", 0});
    }

    public int j() {
        return super.getInteger(this.f402176d + 2);
    }

    public void k(java.lang.String str) {
        super.set(this.f402176d + 0, str);
    }

    public void l(java.lang.String str) {
        super.set(this.f402176d + 1, str);
    }
}
