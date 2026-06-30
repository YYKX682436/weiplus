package v24;

/* loaded from: classes15.dex */
public class t0 extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f432953d;

    public t0() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "show_packet_name"), com.tencent.mm.protobuf.i.i(-1, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), com.tencent.mm.protobuf.i.i(-1, "redDot"), com.tencent.mm.protobuf.i.t(-1, "items", v24.i.class, ""), com.tencent.mm.protobuf.i.u(-1, "original_data"), com.tencent.mm.protobuf.i.u(-1, "regcountry")});
        this.f432953d = appendAttrs;
        super.set__serialName("TipsDataForLiteApp");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", 1, 0, new java.util.LinkedList(), "", ""});
    }

    public int j() {
        return super.getInteger(this.f432953d + 2);
    }

    public java.lang.String k() {
        return super.getString(this.f432953d + 0);
    }

    public void l(java.util.LinkedList linkedList) {
        super.set(this.f432953d + 3, linkedList);
    }

    public void n(java.lang.String str) {
        super.set(this.f432953d + 4, str);
    }

    public void o(int i17) {
        super.set(this.f432953d + 2, java.lang.Integer.valueOf(i17));
    }

    public void p(java.lang.String str) {
        super.set(this.f432953d + 5, str);
    }

    public void q(int i17) {
        super.set(this.f432953d + 1, java.lang.Integer.valueOf(i17));
    }

    public void r(java.lang.String str) {
        super.set(this.f432953d + 0, str);
    }
}
