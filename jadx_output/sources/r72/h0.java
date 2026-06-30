package r72;

/* loaded from: classes16.dex */
public class h0 extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f393142d;

    public h0() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "streamvideourl"), com.tencent.mm.protobuf.i.i(-1, "streamvideototaltime"), com.tencent.mm.protobuf.i.u(-1, "streamvideotitle"), com.tencent.mm.protobuf.i.u(-1, "streamvideowording"), com.tencent.mm.protobuf.i.u(-1, "streamvideoweburl"), com.tencent.mm.protobuf.i.u(-1, "streamvideoaduxinfo"), com.tencent.mm.protobuf.i.u(-1, "streamvideopublishid")});
        this.f393142d = appendAttrs;
        super.set__serialName("streamvideo");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", 0, "", "", "", "", ""});
    }

    public java.lang.String j() {
        return super.getString(this.f393142d + 5);
    }

    public java.lang.String k() {
        return super.getString(this.f393142d + 6);
    }

    public java.lang.String l() {
        return super.getString(this.f393142d + 2);
    }

    public int n() {
        return super.getInteger(this.f393142d + 1);
    }

    public java.lang.String o() {
        return super.getString(this.f393142d + 0);
    }

    public java.lang.String p() {
        return super.getString(this.f393142d + 4);
    }

    public java.lang.String q() {
        return super.getString(this.f393142d + 3);
    }

    public void r(java.lang.String str) {
        super.set(this.f393142d + 5, str);
    }

    public void s(java.lang.String str) {
        super.set(this.f393142d + 6, str);
    }

    public void t(java.lang.String str) {
        super.set(this.f393142d + 2, str);
    }

    public void u(int i17) {
        super.set(this.f393142d + 1, java.lang.Integer.valueOf(i17));
    }

    public void w(java.lang.String str) {
        super.set(this.f393142d + 0, str);
    }

    public void x(java.lang.String str) {
        super.set(this.f393142d + 4, str);
    }

    public void y(java.lang.String str) {
        super.set(this.f393142d + 3, str);
    }
}
