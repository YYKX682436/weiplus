package s15;

/* loaded from: classes9.dex */
public class i extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f402167d;

    public i() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "fromusr"), com.tencent.mm.protobuf.i.u(-1, "realchatname"), com.tencent.mm.protobuf.i.u(-1, "hashusername")});
        this.f402167d = appendAttrs;
        super.set__serialName("RecordDataSourceItem");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", "", ""});
    }

    public java.lang.String j() {
        return super.getString(this.f402167d + 0);
    }

    public java.lang.String k() {
        return super.getString(this.f402167d + 2);
    }

    public java.lang.String l() {
        return super.getString(this.f402167d + 1);
    }

    public void n(java.lang.String str) {
        super.set(this.f402167d + 0, str);
    }

    public void o(java.lang.String str) {
        super.set(this.f402167d + 2, str);
    }

    public void p(java.lang.String str) {
        super.set(this.f402167d + 1, str);
    }
}
