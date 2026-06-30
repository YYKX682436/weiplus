package r72;

/* loaded from: classes16.dex */
public class c extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f393133d;

    public c() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_VID), com.tencent.mm.protobuf.i.u(-1, "videourl"), com.tencent.mm.protobuf.i.u(-1, "mpurl"), com.tencent.mm.protobuf.i.u(-1, "bizusrname"), com.tencent.mm.protobuf.i.u(-1, "biznickname"), com.tencent.mm.protobuf.i.u(-1, "thumburl"), com.tencent.mm.protobuf.i.i(-1, "thumbwidth"), com.tencent.mm.protobuf.i.i(-1, "thumbheight"), com.tencent.mm.protobuf.i.i(-1, "duration")});
        this.f393133d = appendAttrs;
        super.set__serialName("favbrandmpvideo");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", "", "", "", "", "", 0, 0, 0});
    }

    public void A(int i17) {
        super.set(this.f393133d + 7, java.lang.Integer.valueOf(i17));
    }

    public void B(java.lang.String str) {
        super.set(this.f393133d + 1, str);
    }

    public void C(int i17) {
        super.set(this.f393133d + 6, java.lang.Integer.valueOf(i17));
    }

    public java.lang.String j() {
        return super.getString(this.f393133d + 5);
    }

    public int k() {
        return super.getInteger(this.f393133d + 8);
    }

    public java.lang.String l() {
        return super.getString(this.f393133d + 2);
    }

    public java.lang.String n() {
        return super.getString(this.f393133d + 4);
    }

    public java.lang.String o() {
        return super.getString(this.f393133d + 3);
    }

    public java.lang.String p() {
        return super.getString(this.f393133d + 0);
    }

    public int q() {
        return super.getInteger(this.f393133d + 7);
    }

    public java.lang.String r() {
        return super.getString(this.f393133d + 1);
    }

    public int s() {
        return super.getInteger(this.f393133d + 6);
    }

    public void t(java.lang.String str) {
        super.set(this.f393133d + 5, str);
    }

    public void u(int i17) {
        super.set(this.f393133d + 8, java.lang.Integer.valueOf(i17));
    }

    public void w(java.lang.String str) {
        super.set(this.f393133d + 2, str);
    }

    public void x(java.lang.String str) {
        super.set(this.f393133d + 4, str);
    }

    public void y(java.lang.String str) {
        super.set(this.f393133d + 3, str);
    }

    public void z(java.lang.String str) {
        super.set(this.f393133d + 0, str);
    }
}
