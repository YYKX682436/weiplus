package r05;

/* loaded from: classes11.dex */
public class i extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f368363d;

    public i() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "shareUrlOriginal"), com.tencent.mm.protobuf.i.u(-1, "shareUrlOpen"), com.tencent.mm.protobuf.i.u(-1, "jsAppId"), com.tencent.mm.protobuf.i.u(-1, "publisherId"), com.tencent.mm.protobuf.i.u(-1, "publisherReqId")});
        this.f368363d = appendAttrs;
        super.set__serialName("AppMsgWebViewShared");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", "", "", "", ""});
    }

    public java.lang.String j() {
        return super.getString(this.f368363d + 2);
    }

    public java.lang.String k() {
        return super.getString(this.f368363d + 1);
    }

    public java.lang.String l() {
        return super.getString(this.f368363d + 0);
    }
}
