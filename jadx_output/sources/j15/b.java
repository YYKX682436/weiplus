package j15;

/* loaded from: classes9.dex */
public class b extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f297194d;

    public b() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "appid"), com.tencent.mm.protobuf.i.i(-1, "version"), com.tencent.mm.protobuf.i.u(-1, "appname"), com.tencent.mm.protobuf.i.n(-1, "isforceupdate"), com.tencent.mm.protobuf.i.u(-1, "messageaction"), com.tencent.mm.protobuf.i.u(-1, "messageext"), com.tencent.mm.protobuf.i.u(-1, "mediatagname")});
        this.f297194d = appendAttrs;
        super.set__serialName("appinfo");
        super.set__xmlPrefixTag("msg");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{null, 0, null, 0L, null, null, null});
    }

    public java.lang.String getAppId() {
        return super.getString(this.f297194d + 0);
    }

    public java.lang.String j() {
        return super.getString(this.f297194d + 6);
    }

    public java.lang.String k() {
        return super.getString(this.f297194d + 4);
    }

    public java.lang.String l() {
        return super.getString(this.f297194d + 5);
    }

    public void n(java.lang.String str) {
        super.set(this.f297194d + 0, str);
    }

    public void o(java.lang.String str) {
        super.set(this.f297194d + 6, str);
    }

    public void p(java.lang.String str) {
        super.set(this.f297194d + 4, str);
    }

    public void q(java.lang.String str) {
        super.set(this.f297194d + 5, str);
    }
}
