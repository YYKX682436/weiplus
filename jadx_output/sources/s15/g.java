package s15;

/* loaded from: classes9.dex */
public class g extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f402163d;

    public g() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_VID), com.tencent.mm.protobuf.i.u(-1, "videourl"), com.tencent.mm.protobuf.i.u(-1, "mpurl"), com.tencent.mm.protobuf.i.u(-1, "bizusrname"), com.tencent.mm.protobuf.i.u(-1, "biznickname"), com.tencent.mm.protobuf.i.u(-1, "thumburl"), com.tencent.mm.protobuf.i.i(-1, "thumbwidth"), com.tencent.mm.protobuf.i.i(-1, "thumbheight"), com.tencent.mm.protobuf.i.i(-1, "duration")});
        this.f402163d = appendAttrs;
        super.set__serialName("RecordBrandMpVideoItem");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", "", "", "", "", "", 0, 0, 0});
    }

    public java.lang.String getBizNickname() {
        return super.getString(this.f402163d + 4);
    }

    public java.lang.String getBizUsername() {
        return super.getString(this.f402163d + 3);
    }

    public int getThumbHeight() {
        return super.getInteger(this.f402163d + 7);
    }

    public java.lang.String getThumbUrl() {
        return super.getString(this.f402163d + 5);
    }

    public int getThumbWidth() {
        return super.getInteger(this.f402163d + 6);
    }

    public int j() {
        return super.getInteger(this.f402163d + 8);
    }

    public java.lang.String k() {
        return super.getString(this.f402163d + 2);
    }

    public java.lang.String l() {
        return super.getString(this.f402163d + 0);
    }

    public java.lang.String n() {
        return super.getString(this.f402163d + 1);
    }

    public void o(java.lang.String str) {
        super.set(this.f402163d + 4, str);
    }

    public void p(java.lang.String str) {
        super.set(this.f402163d + 3, str);
    }

    public void q(int i17) {
        super.set(this.f402163d + 8, java.lang.Integer.valueOf(i17));
    }

    public void r(java.lang.String str) {
        super.set(this.f402163d + 2, str);
    }

    public void s(int i17) {
        super.set(this.f402163d + 7, java.lang.Integer.valueOf(i17));
    }

    public void t(java.lang.String str) {
        super.set(this.f402163d + 5, str);
    }

    public void u(int i17) {
        super.set(this.f402163d + 6, java.lang.Integer.valueOf(i17));
    }

    public void w(java.lang.String str) {
        super.set(this.f402163d + 0, str);
    }

    public void x(java.lang.String str) {
        super.set(this.f402163d + 1, str);
    }
}
