package s15;

/* loaded from: classes9.dex */
public class h0 extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f402166d;

    public h0() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "link"), com.tencent.mm.protobuf.i.u(-1, "desc"), com.tencent.mm.protobuf.i.u(-1, "thumburl"), com.tencent.mm.protobuf.i.u(-1, com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE), com.tencent.mm.protobuf.i.i(-1, "opencache"), com.tencent.mm.protobuf.i.i(-1, "contentattr"), com.tencent.mm.protobuf.i.i(-1, "forwardflag"), com.tencent.mm.protobuf.i.r(-1, "appmsgshareitem", s15.f.class), com.tencent.mm.protobuf.i.u(-1, "extraparam")});
        this.f402166d = appendAttrs;
        super.set__serialName("RecordUrlItem");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", "", "", "", 0, 0, 0, null, ""});
    }

    public java.lang.String getLink() {
        return super.getString(this.f402166d + 0);
    }

    public java.lang.String getTitle() {
        return super.getString(this.f402166d + 3);
    }

    public java.lang.String j() {
        return super.getString(this.f402166d + 1);
    }

    public java.lang.String k() {
        return super.getString(this.f402166d + 8);
    }

    public int l() {
        return super.getInteger(this.f402166d + 6);
    }

    public s15.f n() {
        return (s15.f) super.getCustom(this.f402166d + 7);
    }

    public java.lang.String o() {
        return super.getString(this.f402166d + 2);
    }

    public void p(int i17) {
        super.set(this.f402166d + 5, java.lang.Integer.valueOf(i17));
    }

    public void q(java.lang.String str) {
        super.set(this.f402166d + 1, str);
    }

    public void r(java.lang.String str) {
        super.set(this.f402166d + 8, str);
    }

    public void s(int i17) {
        super.set(this.f402166d + 6, java.lang.Integer.valueOf(i17));
    }

    public void t(java.lang.String str) {
        super.set(this.f402166d + 0, str);
    }

    public void u(int i17) {
        super.set(this.f402166d + 4, java.lang.Integer.valueOf(i17));
    }

    public void w(s15.f fVar) {
        super.set(this.f402166d + 7, fVar);
    }

    public void x(java.lang.String str) {
        super.set(this.f402166d + 2, str);
    }

    public void y(java.lang.String str) {
        super.set(this.f402166d + 3, str);
    }
}
