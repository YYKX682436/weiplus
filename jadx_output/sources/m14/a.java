package m14;

/* loaded from: classes11.dex */
public class a extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f322866d;

    public a() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "packet_name"), com.tencent.mm.protobuf.i.u(-1, "client_version")});
        this.f322866d = appendAttrs;
        super.set__serialName("check_type");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", ""});
    }

    public java.lang.String j() {
        return super.getString(this.f322866d + 0);
    }
}
