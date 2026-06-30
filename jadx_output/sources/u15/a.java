package u15;

/* loaded from: classes8.dex */
public class a extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f423803d;

    public a() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.r(-1, "simplemsginfo", oi3.e.class), com.tencent.mm.protobuf.i.c(-1, "isfunctiontips"), com.tencent.mm.protobuf.i.i(-1, "messageCount"), com.tencent.mm.protobuf.i.i(-1, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), com.tencent.mm.protobuf.i.u(-1, com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE), com.tencent.mm.protobuf.i.c(-1, "isTop"), com.tencent.mm.protobuf.i.c(-1, "isBottom")});
        this.f423803d = appendAttrs;
        super.set__serialName("sharepreviewsimplemsgitem");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        super.replaceDefault(appendAttrs, new java.lang.Object[]{null, bool, null, 0, null, bool, bool});
    }

    public int getScene() {
        return super.getInteger(this.f423803d + 3);
    }

    public java.lang.String getTitle() {
        return super.getString(this.f423803d + 4);
    }

    public java.lang.Integer j() {
        return super.getIntegerWrapper(this.f423803d + 2);
    }

    public oi3.e k() {
        return (oi3.e) super.getCustom(this.f423803d + 0);
    }

    public boolean l() {
        return super.getBoolean(this.f423803d + 6);
    }

    public boolean n() {
        return super.getBoolean(this.f423803d + 1);
    }

    public boolean o() {
        return super.getBoolean(this.f423803d + 5);
    }

    public void p(boolean z17) {
        super.set(this.f423803d + 6, java.lang.Boolean.valueOf(z17));
    }

    public void q(boolean z17) {
        super.set(this.f423803d + 1, java.lang.Boolean.valueOf(z17));
    }

    public void r(java.lang.Integer num) {
        super.set(this.f423803d + 2, num);
    }

    public void s(int i17) {
        super.set(this.f423803d + 3, java.lang.Integer.valueOf(i17));
    }

    public void t(oi3.e eVar) {
        super.set(this.f423803d + 0, eVar);
    }

    public void u(java.lang.String str) {
        super.set(this.f423803d + 4, str);
    }

    public void w(boolean z17) {
        super.set(this.f423803d + 5, java.lang.Boolean.valueOf(z17));
    }
}
