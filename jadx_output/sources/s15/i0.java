package s15;

/* loaded from: classes9.dex */
public class i0 extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f402168d;

    public i0() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.r(-1, "recordinfo", s15.w.class)});
        this.f402168d = appendAttrs;
        super.set__serialName("RecordXmlDataItem");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{null});
    }

    public s15.w j() {
        return (s15.w) super.getCustom(this.f402168d + 0);
    }

    public void k(s15.w wVar) {
        super.set(this.f402168d + 0, wVar);
    }
}
