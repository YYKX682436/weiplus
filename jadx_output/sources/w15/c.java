package w15;

/* loaded from: classes5.dex */
public class c extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f442244d;

    public c() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.v(-1, "type"), com.tencent.mm.protobuf.i.r(-1, "uploadfinishmsg", w15.b.class)});
        this.f442244d = appendAttrs;
        super.set__serialName("sysmsg");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"uploadfinishmsg", null});
    }

    public w15.b j() {
        return (w15.b) super.getCustom(this.f442244d + 1);
    }
}
