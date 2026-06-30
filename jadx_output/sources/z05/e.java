package z05;

/* loaded from: classes9.dex */
public class e extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f469251d;

    public e() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "cdnthumburl"), com.tencent.mm.protobuf.i.u(-1, "cdnthumbmd5"), com.tencent.mm.protobuf.i.i(-1, "cdnthumblength"), com.tencent.mm.protobuf.i.i(-1, "cdnthumbwidth"), com.tencent.mm.protobuf.i.i(-1, "cdnthumbheight"), com.tencent.mm.protobuf.i.u(-1, "cdnthumbaeskey")});
        this.f469251d = appendAttrs;
        super.set__serialName("OldImageCDNInfo");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", "", 0, 0, 0, ""});
    }

    public java.lang.String j() {
        return super.getString(this.f469251d + 5);
    }

    public int k() {
        return super.getInteger(this.f469251d + 4);
    }

    public int l() {
        return super.getInteger(this.f469251d + 2);
    }

    public java.lang.String n() {
        return super.getString(this.f469251d + 1);
    }

    public java.lang.String o() {
        return super.getString(this.f469251d + 0);
    }

    public int p() {
        return super.getInteger(this.f469251d + 3);
    }

    public void q(java.lang.String str) {
        super.set(this.f469251d + 5, str);
    }

    public void r(int i17) {
        super.set(this.f469251d + 4, java.lang.Integer.valueOf(i17));
    }

    public void s(int i17) {
        super.set(this.f469251d + 2, java.lang.Integer.valueOf(i17));
    }

    public void t(java.lang.String str) {
        super.set(this.f469251d + 1, str);
    }

    public void u(java.lang.String str) {
        super.set(this.f469251d + 0, str);
    }

    public void w(int i17) {
        super.set(this.f469251d + 3, java.lang.Integer.valueOf(i17));
    }
}
