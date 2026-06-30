package s05;

/* loaded from: classes.dex */
public class b extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f401975d;

    public b() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.i(-1, "shouldUseDynamicPage"), com.tencent.mm.protobuf.i.u(-1, "cacheKey")});
        this.f401975d = appendAttrs;
        super.set__serialName("WaDynamicPageInfo");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{0, null});
    }

    public int j() {
        return super.getInteger(this.f401975d + 0);
    }
}
