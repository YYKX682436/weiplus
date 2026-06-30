package fc5;

/* loaded from: classes9.dex */
public class f extends co.a {

    /* renamed from: e, reason: collision with root package name */
    public final int f261234e;

    public f() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "xmlContent")});
        this.f261234e = appendAttrs;
        super.set__serialName("previewmsg");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{null});
    }

    @Override // co.a
    public java.lang.Object clone() {
        return super.clone();
    }

    public java.lang.String j() {
        return super.getString(this.f261234e + 0);
    }

    public void k(java.lang.String str) {
        super.set(this.f261234e + 0, str);
    }
}
