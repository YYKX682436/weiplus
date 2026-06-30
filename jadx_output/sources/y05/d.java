package y05;

/* loaded from: classes9.dex */
public class d extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f458659d;

    public d() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "iconUrl"), com.tencent.mm.protobuf.i.u(-1, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME), com.tencent.mm.protobuf.i.u(-1, "desc"), com.tencent.mm.protobuf.i.u(-1, "tail"), com.tencent.mm.protobuf.i.u(-1, "jumpUrl")});
        this.f458659d = appendAttrs;
        super.set__serialName("namecard");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{null, null, null, null, null});
    }

    public java.lang.String getIconUrl() {
        return super.getString(this.f458659d + 0);
    }

    public java.lang.String getName() {
        return super.getString(this.f458659d + 1);
    }

    public java.lang.String j() {
        return super.getString(this.f458659d + 2);
    }

    public java.lang.String k() {
        return super.getString(this.f458659d + 4);
    }

    public java.lang.String l() {
        return super.getString(this.f458659d + 3);
    }

    public void n(java.lang.String str) {
        super.set(this.f458659d + 2, str);
    }

    public void o(java.lang.String str) {
        super.set(this.f458659d + 0, str);
    }

    public void p(java.lang.String str) {
        super.set(this.f458659d + 4, str);
    }

    public void q(java.lang.String str) {
        super.set(this.f458659d + 1, str);
    }

    public void r(java.lang.String str) {
        super.set(this.f458659d + 3, str);
    }
}
