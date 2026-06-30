package x15;

/* loaded from: classes11.dex */
public final class a extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f451472d;

    public a() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.v(-1, "fromusername"), com.tencent.mm.protobuf.i.v(-1, "encryptusername"), com.tencent.mm.protobuf.i.v(-1, "fromnickname"), com.tencent.mm.protobuf.i.v(-1, "content"), com.tencent.mm.protobuf.i.j(-1, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), com.tencent.mm.protobuf.i.v(-1, "ticket"), com.tencent.mm.protobuf.i.v(-1, "openimcustominfo"), com.tencent.mm.protobuf.i.v(-1, "openimappid"), com.tencent.mm.protobuf.i.v(-1, "openimdescwordingid"), com.tencent.mm.protobuf.i.t(-1, "images", x15.b.class, "image")});
        this.f451472d = appendAttrs;
        super.set__serialName("msg");
        super.set__xmlPrefixTag("");
        super.set__trim(false);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", "", "", "", 0, "", null, null, null, new java.util.LinkedList()});
    }

    public final java.util.LinkedList j() {
        return super.getLinkedList(this.f451472d + 9);
    }

    public final void k(java.lang.String str) {
        super.set(this.f451472d + 3, str);
    }

    public final void l(java.lang.String str) {
        super.set(this.f451472d + 8, str);
    }

    public final void n(java.lang.String str) {
        super.set(this.f451472d + 1, str);
    }

    public final void o(java.lang.String str) {
        super.set(this.f451472d + 2, str);
    }

    public final void p(java.lang.String str) {
        super.set(this.f451472d + 0, str);
    }

    public final void q(java.lang.String str) {
        super.set(this.f451472d + 7, str);
    }

    public final void r(java.lang.String str) {
        super.set(this.f451472d + 6, str);
    }

    public final void s(int i17) {
        super.set(this.f451472d + 4, java.lang.Integer.valueOf(i17));
    }

    public final void t(java.lang.String str) {
        super.set(this.f451472d + 5, str);
    }
}
