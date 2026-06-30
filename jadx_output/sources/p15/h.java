package p15;

/* loaded from: classes9.dex */
public class h extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f351257d;

    public h() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "imageId"), com.tencent.mm.protobuf.i.u(-1, "articleUrl"), com.tencent.mm.protobuf.i.n(-1, "itemShowType"), com.tencent.mm.protobuf.i.n(-1, "bizuin"), com.tencent.mm.protobuf.i.n(-1, "mid"), com.tencent.mm.protobuf.i.n(-1, "idx")});
        this.f351257d = appendAttrs;
        super.set__serialName("mpInfo");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{null, null, null, null, null, null});
    }

    public java.lang.String j() {
        return super.getString(this.f351257d + 1);
    }

    public java.lang.Long k() {
        return super.getLongWrapper(this.f351257d + 3);
    }

    public java.lang.Long l() {
        return super.getLongWrapper(this.f351257d + 5);
    }

    public java.lang.String n() {
        return super.getString(this.f351257d + 0);
    }

    public java.lang.Long o() {
        return super.getLongWrapper(this.f351257d + 2);
    }

    public java.lang.Long p() {
        return super.getLongWrapper(this.f351257d + 4);
    }

    public void q(java.lang.String str) {
        super.set(this.f351257d + 1, str);
    }

    public void r(java.lang.Long l17) {
        super.set(this.f351257d + 3, l17);
    }

    public void s(java.lang.Long l17) {
        super.set(this.f351257d + 5, l17);
    }

    public void t(java.lang.String str) {
        super.set(this.f351257d + 0, str);
    }

    public void u(java.lang.Long l17) {
        super.set(this.f351257d + 2, l17);
    }

    public void w(java.lang.Long l17) {
        super.set(this.f351257d + 4, l17);
    }
}
