package s15;

/* loaded from: classes9.dex */
public class u extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f402180d;

    public u() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "poiClassifyId"), com.tencent.mm.protobuf.i.g(-1, "longitude"), com.tencent.mm.protobuf.i.g(-1, "latitude")});
        this.f402180d = appendAttrs;
        super.set__serialName("RecordFinderTopicLocationItem");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        java.lang.Float valueOf = java.lang.Float.valueOf(0.0f);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", valueOf, valueOf});
    }

    public void j(float f17) {
        super.set(this.f402180d + 2, java.lang.Float.valueOf(f17));
    }

    public void k(float f17) {
        super.set(this.f402180d + 1, java.lang.Float.valueOf(f17));
    }

    public void l(java.lang.String str) {
        super.set(this.f402180d + 0, str);
    }
}
