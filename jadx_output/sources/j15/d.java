package j15;

/* loaded from: classes12.dex */
public class d extends l15.a {

    /* renamed from: d, reason: collision with root package name */
    public final int f297196d;

    public d() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.r(-1, "img", j15.a.class), com.tencent.mm.protobuf.i.u(-1, "platform_signature"), com.tencent.mm.protobuf.i.u(-1, "imgdatahash"), com.tencent.mm.protobuf.i.r(-1, "appinfo", j15.b.class), com.tencent.mm.protobuf.i.r(-1, "ImgSourceInfo", p15.m.class), com.tencent.mm.protobuf.i.r(-1, "wxaInfo", p15.x.class), com.tencent.mm.protobuf.i.r(-1, "mpInfo", p15.h.class), com.tencent.mm.protobuf.i.r(-1, "msgoperation", l15.d.class), com.tencent.mm.protobuf.i.r(-1, "extcommoninfo", r15.b.class), com.tencent.mm.protobuf.i.r(-1, "forwardmediainfo", f15.a.class)});
        this.f297196d = appendAttrs;
        super.set__serialName("msg");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{new j15.a(), null, null, null, null, null, null, null, null, null});
    }

    public void A(java.lang.String str) {
        super.set(this.f297196d + 2, str);
    }

    public void B(p15.m mVar) {
        super.set(this.f297196d + 4, mVar);
    }

    public void C(java.lang.String str) {
        super.set(this.f297196d + 1, str);
    }

    public void E(p15.x xVar) {
        super.set(this.f297196d + 5, xVar);
    }

    public j15.b j() {
        return (j15.b) super.getCustom(this.f297196d + 3);
    }

    public p15.h k() {
        return (p15.h) super.getCustom(this.f297196d + 6);
    }

    public r15.b l() {
        return (r15.b) super.getCustom(this.f297196d + 8);
    }

    public f15.a n() {
        return (f15.a) super.getCustom(this.f297196d + 9);
    }

    public j15.a o() {
        return (j15.a) super.getCustom(this.f297196d + 0);
    }

    public java.lang.String p() {
        return super.getString(this.f297196d + 2);
    }

    public p15.m q() {
        return (p15.m) super.getCustom(this.f297196d + 4);
    }

    public l15.d r() {
        return (l15.d) super.getCustom(this.f297196d + 7);
    }

    public java.lang.String s() {
        return super.getString(this.f297196d + 1);
    }

    public p15.x t() {
        return (p15.x) super.getCustom(this.f297196d + 5);
    }

    public void u(j15.b bVar) {
        super.set(this.f297196d + 3, bVar);
    }

    public void w(p15.h hVar) {
        super.set(this.f297196d + 6, hVar);
    }

    public void x(r15.b bVar) {
        super.set(this.f297196d + 8, bVar);
    }

    public void y(f15.a aVar) {
        super.set(this.f297196d + 9, aVar);
    }

    public void z(j15.a aVar) {
        super.set(this.f297196d + 0, aVar);
    }
}
