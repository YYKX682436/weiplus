package r72;

/* loaded from: classes16.dex */
public class o0 extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f393152d;

    public o0() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_VID), com.tencent.mm.protobuf.i.u(-1, "srcusername"), com.tencent.mm.protobuf.i.u(-1, "srcdisplayname"), com.tencent.mm.protobuf.i.u(-1, "cover"), com.tencent.mm.protobuf.i.i(-1, "itemshowtype"), com.tencent.mm.protobuf.i.i(-1, "ispaysubscribe"), com.tencent.mm.protobuf.i.i(-1, "nativepage"), com.tencent.mm.protobuf.i.i(-1, "width"), com.tencent.mm.protobuf.i.i(-1, "height"), com.tencent.mm.protobuf.i.i(-1, "pubtime"), com.tencent.mm.protobuf.i.i(-1, "duration"), com.tencent.mm.protobuf.i.i(-1, "funcflag")});
        this.f393152d = appendAttrs;
        super.set__serialName("appmsgshareitem");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", "", "", "", 0, 0, 0, 0, 0, 0, 0, 0});
    }

    public void A(int i17) {
        super.set(this.f393152d + 6, java.lang.Integer.valueOf(i17));
    }

    public void B(int i17) {
        super.set(this.f393152d + 5, java.lang.Integer.valueOf(i17));
    }

    public void C(int i17) {
        super.set(this.f393152d + 9, java.lang.Integer.valueOf(i17));
    }

    public void E(java.lang.String str) {
        super.set(this.f393152d + 2, str);
    }

    public void F(java.lang.String str) {
        super.set(this.f393152d + 1, str);
    }

    public void G(java.lang.String str) {
        super.set(this.f393152d + 0, str);
    }

    public void H(int i17) {
        super.set(this.f393152d + 8, java.lang.Integer.valueOf(i17));
    }

    public void I(int i17) {
        super.set(this.f393152d + 7, java.lang.Integer.valueOf(i17));
    }

    @Override // e14.l
    public boolean checkValueSkip(java.lang.String fieldSerializeName, java.lang.Object obj, boolean z17) {
        kotlin.jvm.internal.o.g(fieldSerializeName, "fieldSerializeName");
        return kotlin.jvm.internal.o.b(fieldSerializeName, "itemshowtype") ? obj == null || kotlin.jvm.internal.o.b(obj, 0) || kotlin.jvm.internal.o.b(obj, -1) : super.checkValueSkip(fieldSerializeName, obj, z17);
    }

    public int getFuncFlag() {
        return super.getInteger(this.f393152d + 11);
    }

    public java.lang.String j() {
        return super.getString(this.f393152d + 3);
    }

    public int k() {
        return super.getInteger(this.f393152d + 10);
    }

    public int l() {
        return super.getInteger(this.f393152d + 4);
    }

    public int n() {
        return super.getInteger(this.f393152d + 6);
    }

    public int o() {
        return super.getInteger(this.f393152d + 9);
    }

    public java.lang.String p() {
        return super.getString(this.f393152d + 2);
    }

    public java.lang.String q() {
        return super.getString(this.f393152d + 1);
    }

    public java.lang.String r() {
        return super.getString(this.f393152d + 0);
    }

    public int s() {
        return super.getInteger(this.f393152d + 8);
    }

    public int t() {
        return super.getInteger(this.f393152d + 7);
    }

    public int u() {
        return super.getInteger(this.f393152d + 5);
    }

    public void w(java.lang.String str) {
        super.set(this.f393152d + 3, str);
    }

    public void x(int i17) {
        super.set(this.f393152d + 10, java.lang.Integer.valueOf(i17));
    }

    public void y(int i17) {
        super.set(this.f393152d + 11, java.lang.Integer.valueOf(i17));
    }

    public void z(int i17) {
        super.set(this.f393152d + 4, java.lang.Integer.valueOf(i17));
    }
}
