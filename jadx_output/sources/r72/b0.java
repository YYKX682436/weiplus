package r72;

/* loaded from: classes15.dex */
public class b0 extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f393132d;

    public b0() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "noteauthor"), com.tencent.mm.protobuf.i.u(-1, "noteeditor")});
        this.f393132d = appendAttrs;
        super.set__serialName("noteinfo");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", ""});
    }

    public java.lang.String j() {
        return super.getString(this.f393132d + 0);
    }

    public java.lang.String k() {
        return super.getString(this.f393132d + 1);
    }

    public void l(java.lang.String str) {
        super.set(this.f393132d + 0, str);
    }

    public void n(java.lang.String str) {
        super.set(this.f393132d + 1, str);
    }
}
