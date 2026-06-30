package r72;

/* loaded from: classes16.dex */
public class g0 extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f393140d;

    public g0() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.j(-1, "sourcetype"), com.tencent.mm.protobuf.i.v(-1, "sourceid"), com.tencent.mm.protobuf.i.u(-1, "fromusr"), com.tencent.mm.protobuf.i.u(-1, "tousr"), com.tencent.mm.protobuf.i.u(-1, "realchatname"), com.tencent.mm.protobuf.i.u(-1, "msgid"), com.tencent.mm.protobuf.i.u(-1, "eventid"), com.tencent.mm.protobuf.i.u(-1, "appid"), com.tencent.mm.protobuf.i.u(-1, "sourceid"), com.tencent.mm.protobuf.i.u(-1, "link"), com.tencent.mm.protobuf.i.u(-1, "brandid")});
        this.f393140d = appendAttrs;
        super.set__serialName(ya.b.SOURCE);
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{0, "", "", "", "", "", "", "", "", "", ""});
    }

    public void A(int i17) {
        super.set(this.f393140d + 0, java.lang.Integer.valueOf(i17));
    }

    public void B(java.lang.String str) {
        super.set(this.f393140d + 3, str);
    }

    public java.lang.String getAppId() {
        return super.getString(this.f393140d + 7);
    }

    public java.lang.String getLink() {
        return super.getString(this.f393140d + 9);
    }

    public java.lang.String getMsgId() {
        return super.getString(this.f393140d + 5);
    }

    public java.lang.String getSourceId() {
        return super.getString(this.f393140d + 8);
    }

    public int getSourceType() {
        return super.getInteger(this.f393140d + 0);
    }

    public java.lang.String j() {
        return super.getString(this.f393140d + 10);
    }

    public java.lang.String k() {
        return super.getString(this.f393140d + 6);
    }

    public java.lang.String l() {
        return super.getString(this.f393140d + 2);
    }

    public java.lang.String n() {
        return super.getString(this.f393140d + 4);
    }

    public java.lang.String o() {
        return super.getString(this.f393140d + 1);
    }

    public java.lang.String p() {
        return super.getString(this.f393140d + 3);
    }

    public void q(java.lang.String str) {
        super.set(this.f393140d + 7, str);
    }

    public void r(java.lang.String str) {
        super.set(this.f393140d + 10, str);
    }

    public void s(java.lang.String str) {
        super.set(this.f393140d + 6, str);
    }

    public void t(java.lang.String str) {
        super.set(this.f393140d + 2, str);
    }

    public void u(java.lang.String str) {
        super.set(this.f393140d + 9, str);
    }

    public void w(java.lang.String str) {
        super.set(this.f393140d + 5, str);
    }

    public void x(java.lang.String str) {
        super.set(this.f393140d + 4, str);
    }

    public void y(java.lang.String str) {
        super.set(this.f393140d + 1, str);
    }

    public void z(java.lang.String str) {
        super.set(this.f393140d + 8, str);
    }
}
