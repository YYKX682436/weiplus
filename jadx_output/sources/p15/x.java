package p15;

/* loaded from: classes9.dex */
public class x extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f351266d;

    public x() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "appId"), com.tencent.mm.protobuf.i.u(-1, "nickname"), com.tencent.mm.protobuf.i.u(-1, "iconUrl"), com.tencent.mm.protobuf.i.u(-1, "enterPath"), com.tencent.mm.protobuf.i.u(-1, "forwardSceneNote"), com.tencent.mm.protobuf.i.i(-1, "showSourceView"), com.tencent.mm.protobuf.i.i(-1, "versionType"), com.tencent.mm.protobuf.i.i(-1, "forwardNoteShareScene")});
        this.f351266d = appendAttrs;
        super.set__serialName("wxaInfo");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{null, null, null, null, null, 0, 0, 0});
    }

    public java.lang.String getAppId() {
        return super.getString(this.f351266d + 0);
    }

    public java.lang.String getIconUrl() {
        return super.getString(this.f351266d + 2);
    }

    public java.lang.String getNickname() {
        return super.getString(this.f351266d + 1);
    }

    public java.lang.String j() {
        return super.getString(this.f351266d + 3);
    }

    public int k() {
        return super.getInteger(this.f351266d + 7);
    }

    public java.lang.String l() {
        return super.getString(this.f351266d + 4);
    }

    public int n() {
        return super.getInteger(this.f351266d + 5);
    }

    public int o() {
        return super.getInteger(this.f351266d + 6);
    }

    public void p(java.lang.String str) {
        super.set(this.f351266d + 0, str);
    }

    public void q(java.lang.String str) {
        super.set(this.f351266d + 3, str);
    }

    public void r(int i17) {
        super.set(this.f351266d + 7, java.lang.Integer.valueOf(i17));
    }

    public void s(java.lang.String str) {
        super.set(this.f351266d + 4, str);
    }

    public void t(java.lang.String str) {
        super.set(this.f351266d + 2, str);
    }

    public void u(java.lang.String str) {
        super.set(this.f351266d + 1, str);
    }

    public void w(int i17) {
        super.set(this.f351266d + 5, java.lang.Integer.valueOf(i17));
    }

    public void x(int i17) {
        super.set(this.f351266d + 6, java.lang.Integer.valueOf(i17));
    }
}
