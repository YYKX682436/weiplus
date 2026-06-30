package w05;

/* loaded from: classes.dex */
public class i extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f441940d;

    public i() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "url")});
        this.f441940d = appendAttrs;
        super.set__serialName("html5_info");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{""});
    }

    public java.lang.String getUrl() {
        return super.getString(this.f441940d + 0);
    }
}
