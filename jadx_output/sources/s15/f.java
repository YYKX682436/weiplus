package s15;

/* loaded from: classes9.dex */
public class f extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f402161d;

    public f() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_VID), com.tencent.mm.protobuf.i.u(-1, "srcusername"), com.tencent.mm.protobuf.i.u(-1, "srcdisplayname"), com.tencent.mm.protobuf.i.u(-1, "cover"), com.tencent.mm.protobuf.i.i(-1, "itemshowtype"), com.tencent.mm.protobuf.i.i(-1, "ispaysubscribe"), com.tencent.mm.protobuf.i.i(-1, "nativepage"), com.tencent.mm.protobuf.i.i(-1, "width"), com.tencent.mm.protobuf.i.i(-1, "height"), com.tencent.mm.protobuf.i.i(-1, "pubtime"), com.tencent.mm.protobuf.i.i(-1, "duration"), com.tencent.mm.protobuf.i.i(-1, "funcflag")});
        this.f402161d = appendAttrs;
        super.set__serialName("appmsgshareitem");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", "", "", "", 0, 0, 0, 0, 0, 0, 0, 0});
    }

    public int j() {
        return super.getInteger(this.f402161d + 4);
    }

    public int k() {
        return super.getInteger(this.f402161d + 6);
    }

    public java.lang.String l() {
        return super.getString(this.f402161d + 1);
    }

    public void n(java.lang.String str) {
        super.set(this.f402161d + 3, str);
    }

    public void o(int i17) {
        super.set(this.f402161d + 10, java.lang.Integer.valueOf(i17));
    }

    public void p(int i17) {
        super.set(this.f402161d + 11, java.lang.Integer.valueOf(i17));
    }

    public void q(int i17) {
        super.set(this.f402161d + 4, java.lang.Integer.valueOf(i17));
    }

    public void r(int i17) {
        super.set(this.f402161d + 6, java.lang.Integer.valueOf(i17));
    }

    public void s(int i17) {
        super.set(this.f402161d + 5, java.lang.Integer.valueOf(i17));
    }

    public void t(int i17) {
        super.set(this.f402161d + 9, java.lang.Integer.valueOf(i17));
    }

    public void u(java.lang.String str) {
        super.set(this.f402161d + 2, str);
    }

    public void w(java.lang.String str) {
        super.set(this.f402161d + 1, str);
    }

    public void x(java.lang.String str) {
        super.set(this.f402161d + 0, str);
    }

    public void y(int i17) {
        super.set(this.f402161d + 8, java.lang.Integer.valueOf(i17));
    }

    public void z(int i17) {
        super.set(this.f402161d + 7, java.lang.Integer.valueOf(i17));
    }
}
