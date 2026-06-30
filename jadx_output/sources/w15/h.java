package w15;

/* loaded from: classes5.dex */
public class h extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f442249d;

    public h() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.v(-1, "type"), com.tencent.mm.protobuf.i.r(-1, "revokemsgcontent", w15.e.class), com.tencent.mm.protobuf.i.r(-1, "extcommoninfo", r15.b.class)});
        this.f442249d = appendAttrs;
        super.set__serialName("sysmsg");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{null, null, null});
    }

    public final r15.b j() {
        return (r15.b) super.getCustom(this.f442249d + 2);
    }

    public final w15.e k() {
        return (w15.e) super.getCustom(this.f442249d + 1);
    }

    public final void l(r15.b bVar) {
        super.set(this.f442249d + 2, bVar);
    }

    public final void n(w15.e eVar) {
        super.set(this.f442249d + 1, eVar);
    }

    public final void o(java.lang.String str) {
        super.set(this.f442249d + 0, str);
    }
}
