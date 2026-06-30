package r72;

/* loaded from: classes9.dex */
public class k0 extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f393148d;

    public k0() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "tvtitle"), com.tencent.mm.protobuf.i.u(-1, "tvdesc"), com.tencent.mm.protobuf.i.u(-1, "tvthumb_url"), com.tencent.mm.protobuf.i.u(-1, "tvinfo")});
        this.f393148d = appendAttrs;
        super.set__serialName("tvitem");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", "", "", ""});
    }

    public java.lang.String j() {
        return super.getString(this.f393148d + 1);
    }

    public java.lang.String k() {
        return super.getString(this.f393148d + 3);
    }

    public java.lang.String l() {
        return super.getString(this.f393148d + 2);
    }

    public java.lang.String n() {
        return super.getString(this.f393148d + 0);
    }

    public void o(java.lang.String str) {
        super.set(this.f393148d + 1, str);
    }

    public void p(java.lang.String str) {
        super.set(this.f393148d + 3, str);
    }

    public void q(java.lang.String str) {
        super.set(this.f393148d + 2, str);
    }

    public void r(java.lang.String str) {
        super.set(this.f393148d + 0, str);
    }
}
