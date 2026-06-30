package p15;

/* loaded from: classes8.dex */
public class n extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f351260d;

    public n() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "imgSourceUrl"), com.tencent.mm.protobuf.i.r(-1, "wxaInfo", p15.x.class), com.tencent.mm.protobuf.i.r(-1, "imgSourceInfo", p15.m.class)});
        this.f351260d = appendAttrs;
        super.set__serialName("ImgSourceStructInfo");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{null, null, null});
    }

    public p15.m j() {
        return (p15.m) super.getCustom(this.f351260d + 2);
    }

    public java.lang.String k() {
        return super.getString(this.f351260d + 0);
    }

    public p15.x l() {
        return (p15.x) super.getCustom(this.f351260d + 1);
    }

    public void n(p15.m mVar) {
        super.set(this.f351260d + 2, mVar);
    }

    public void o(p15.x xVar) {
        super.set(this.f351260d + 1, xVar);
    }
}
