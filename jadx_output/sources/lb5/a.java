package lb5;

/* loaded from: classes.dex */
public class a extends co.a {

    /* renamed from: e, reason: collision with root package name */
    public final int f317790e;

    public a() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "md5"), com.tencent.mm.protobuf.i.u(-1, "xmlContent"), com.tencent.mm.protobuf.i.i(-1, "fromScene")});
        this.f317790e = appendAttrs;
        super.set__serialName("previewmsg");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{null, null, 0});
    }

    @Override // co.a
    public java.lang.Object clone() {
        return super.clone();
    }

    public java.lang.String j() {
        return super.getString(this.f317790e + 0);
    }

    public java.lang.String k() {
        return super.getString(this.f317790e + 1);
    }

    public int l() {
        return super.getInteger(this.f317790e + 2);
    }

    public void n(java.lang.String str) {
        super.set(this.f317790e + 0, str);
    }

    public void o(java.lang.String str) {
        super.set(this.f317790e + 1, str);
    }

    public void p(int i17) {
        super.set(this.f317790e + 2, java.lang.Integer.valueOf(i17));
    }
}
