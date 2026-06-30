package y15;

/* loaded from: classes12.dex */
public class d extends l15.a {

    /* renamed from: d, reason: collision with root package name */
    public final int f458923d;

    public d() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.r(-1, "videomsg", y15.c.class), com.tencent.mm.protobuf.i.r(-1, "extcommoninfo", r15.b.class), com.tencent.mm.protobuf.i.r(-1, "msgoperation", l15.d.class), com.tencent.mm.protobuf.i.r(-1, "clientFavInfo", c01.f7.class)});
        this.f458923d = appendAttrs;
        super.set__serialName("msg");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{new y15.c(), null, null, null});
    }

    public r15.b j() {
        return (r15.b) super.getCustom(this.f458923d + 1);
    }

    public c01.f7 k() {
        return (c01.f7) super.getCustom(this.f458923d + 3);
    }

    public l15.d l() {
        return (l15.d) super.getCustom(this.f458923d + 2);
    }

    public y15.c n() {
        return (y15.c) super.getCustom(this.f458923d + 0);
    }

    public void o(r15.b bVar) {
        super.set(this.f458923d + 1, bVar);
    }

    public void p(c01.f7 f7Var) {
        super.set(this.f458923d + 3, f7Var);
    }
}
