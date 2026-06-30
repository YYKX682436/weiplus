package ne5;

/* loaded from: classes.dex */
public class a extends co.a {

    /* renamed from: e, reason: collision with root package name */
    public final int f336571e;

    public a() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "textContent"), com.tencent.mm.protobuf.i.c(-1, "isPartialTextSelect")});
        this.f336571e = appendAttrs;
        super.set__serialName("previewmsg");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", java.lang.Boolean.FALSE});
    }

    @Override // co.a
    public java.lang.Object clone() {
        return super.clone();
    }

    public java.lang.String j() {
        return super.getString(this.f336571e + 0);
    }

    public boolean k() {
        return super.getBoolean(this.f336571e + 1);
    }

    public void l(boolean z17) {
        super.set(this.f336571e + 1, java.lang.Boolean.valueOf(z17));
    }

    public void n(java.lang.String str) {
        super.set(this.f336571e + 0, str);
    }
}
