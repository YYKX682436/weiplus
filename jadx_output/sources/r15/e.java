package r15;

/* loaded from: classes5.dex */
public class e extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f368643d;

    public e() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "type"), com.tencent.mm.protobuf.i.u(-1, "label"), com.tencent.mm.protobuf.i.u(-1, "callback_buf"), com.tencent.mm.protobuf.i.u(-1, "style"), com.tencent.mm.protobuf.i.u(-1, "url")});
        this.f368643d = appendAttrs;
        super.set__serialName("button");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", "", "", "", ""});
    }

    public java.lang.String getUrl() {
        return super.getString(this.f368643d + 4);
    }

    public java.lang.String j() {
        return super.getString(this.f368643d + 2);
    }

    public java.lang.String k() {
        return super.getString(this.f368643d + 1);
    }

    public java.lang.String l() {
        return super.getString(this.f368643d + 3);
    }

    public java.lang.String n() {
        return super.getString(this.f368643d + 0);
    }
}
