package r72;

/* loaded from: classes16.dex */
public class j extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f393145d;

    public j() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "content"), com.tencent.mm.protobuf.i.u(-1, "excerptkey"), com.tencent.mm.protobuf.i.u(-1, "excerpturl")});
        this.f393145d = appendAttrs;
        super.set__serialName("excerptitem");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", "", ""});
    }

    public java.lang.String getContent() {
        return super.getString(this.f393145d + 0);
    }

    public java.lang.String j() {
        return super.getString(this.f393145d + 1);
    }

    public java.lang.String k() {
        return super.getString(this.f393145d + 2);
    }

    public void l(java.lang.String str) {
        super.set(this.f393145d + 0, str);
    }

    public void n(java.lang.String str) {
        super.set(this.f393145d + 1, str);
    }

    public void o(java.lang.String str) {
        super.set(this.f393145d + 2, str);
    }
}
