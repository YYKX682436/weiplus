package r05;

/* loaded from: classes9.dex */
public class h extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f368362d;

    public h() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "streamvideourl"), com.tencent.mm.protobuf.i.i(-1, "streamvideototaltime"), com.tencent.mm.protobuf.i.u(-1, "streamvideotitle"), com.tencent.mm.protobuf.i.u(-1, "streamvideowording"), com.tencent.mm.protobuf.i.u(-1, "streamvideoweburl"), com.tencent.mm.protobuf.i.u(-1, "streamvideothumburl"), com.tencent.mm.protobuf.i.u(-1, "streamvideoaduxinfo"), com.tencent.mm.protobuf.i.u(-1, "streamvideopublishid")});
        this.f368362d = appendAttrs;
        super.set__serialName("AppMsgStreamVideo");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", 0, "", "", "", "", "", ""});
    }

    public java.lang.String j() {
        return super.getString(this.f368362d + 6);
    }

    public java.lang.String k() {
        return super.getString(this.f368362d + 7);
    }

    public java.lang.String l() {
        return super.getString(this.f368362d + 5);
    }

    public int n() {
        return super.getInteger(this.f368362d + 1);
    }

    public java.lang.String o() {
        return super.getString(this.f368362d + 0);
    }

    public java.lang.String p() {
        return super.getString(this.f368362d + 4);
    }

    public java.lang.String q() {
        return super.getString(this.f368362d + 3);
    }
}
