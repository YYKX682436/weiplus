package l15;

/* loaded from: classes9.dex */
public class b extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f315011d;

    public b() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "version"), com.tencent.mm.protobuf.i.u(-1, "appname"), com.tencent.mm.protobuf.i.u(-1, "appid")});
        this.f315011d = appendAttrs;
        super.set__serialName("appinfo");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{null, null, null});
    }

    public java.lang.String getAppId() {
        return super.getString(this.f315011d + 2);
    }

    public java.lang.String getAppName() {
        return super.getString(this.f315011d + 1);
    }

    public java.lang.String getVersion() {
        return super.getString(this.f315011d + 0);
    }
}
