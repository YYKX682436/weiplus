package r72;

/* loaded from: classes16.dex */
public class m0 extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f393150d;

    public m0() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "clean_url"), com.tencent.mm.protobuf.i.u(-1, "pagedesc"), com.tencent.mm.protobuf.i.u(-1, "pagethumb_url"), com.tencent.mm.protobuf.i.u(-1, "pagetitle"), com.tencent.mm.protobuf.i.u(-1, "desc"), com.tencent.mm.protobuf.i.u(-1, com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE), com.tencent.mm.protobuf.i.i(-1, "opencache"), com.tencent.mm.protobuf.i.i(-1, "contentattr"), com.tencent.mm.protobuf.i.u(-1, "canvasPageXml"), com.tencent.mm.protobuf.i.u(-1, "extraparam"), com.tencent.mm.protobuf.i.u(-1, "wsVideoFlowXml"), com.tencent.mm.protobuf.i.i(-1, "forwardflag"), com.tencent.mm.protobuf.i.t(-1, "excerptlist", r72.j.class, "excerptitem"), com.tencent.mm.protobuf.i.r(-1, "appmsgshareitem", r72.o0.class)});
        this.f393150d = appendAttrs;
        super.set__serialName("weburlitem");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", "", "", "", "", "", 0, 0, "", "", "", 0, new java.util.LinkedList(), null});
    }

    public void A(java.lang.String str) {
        super.set(this.f393150d + 0, str);
    }

    public void B(int i17) {
        super.set(this.f393150d + 7, java.lang.Integer.valueOf(i17));
    }

    public void C(java.lang.String str) {
        super.set(this.f393150d + 4, str);
    }

    public void E(java.lang.String str) {
        super.set(this.f393150d + 9, str);
    }

    public void F(int i17) {
        super.set(this.f393150d + 11, java.lang.Integer.valueOf(i17));
    }

    public void G(r72.o0 o0Var) {
        super.set(this.f393150d + 13, o0Var);
    }

    public void H(int i17) {
        super.set(this.f393150d + 6, java.lang.Integer.valueOf(i17));
    }

    public void I(java.lang.String str) {
        super.set(this.f393150d + 1, str);
    }

    public void J(java.lang.String str) {
        super.set(this.f393150d + 2, str);
    }

    public void K(java.lang.String str) {
        super.set(this.f393150d + 3, str);
    }

    public void L(java.lang.String str) {
        super.set(this.f393150d + 5, str);
    }

    public void N(java.lang.String str) {
        super.set(this.f393150d + 10, str);
    }

    public java.lang.String j() {
        return super.getString(this.f393150d + 8);
    }

    public java.lang.String k() {
        return super.getString(this.f393150d + 0);
    }

    public int l() {
        return super.getInteger(this.f393150d + 7);
    }

    public java.util.LinkedList n() {
        return super.getLinkedList(this.f393150d + 12);
    }

    public java.lang.String o() {
        return super.getString(this.f393150d + 4);
    }

    public java.lang.String p() {
        return super.getString(this.f393150d + 9);
    }

    public int q() {
        return super.getInteger(this.f393150d + 11);
    }

    public r72.o0 r() {
        return (r72.o0) super.getCustom(this.f393150d + 13);
    }

    public int s() {
        return super.getInteger(this.f393150d + 6);
    }

    public java.lang.String t() {
        return super.getString(this.f393150d + 1);
    }

    public java.lang.String u() {
        return super.getString(this.f393150d + 2);
    }

    public java.lang.String w() {
        return super.getString(this.f393150d + 3);
    }

    public java.lang.String x() {
        return super.getString(this.f393150d + 5);
    }

    public java.lang.String y() {
        return super.getString(this.f393150d + 10);
    }

    public void z(java.lang.String str) {
        super.set(this.f393150d + 8, str);
    }
}
