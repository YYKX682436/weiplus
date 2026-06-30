package pb5;

/* loaded from: classes9.dex */
public class a extends co.a {

    /* renamed from: e, reason: collision with root package name */
    public final int f353199e;

    public a() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.r(-1, "xmlContent", m15.a.class), com.tencent.mm.protobuf.i.u(-1, "cardUserName")});
        this.f353199e = appendAttrs;
        super.set__serialName("previewmsg");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{null, ""});
    }

    @Override // co.a
    public java.lang.Object clone() {
        return super.clone();
    }

    public m15.a j() {
        return (m15.a) super.getCustom(this.f353199e + 0);
    }

    public java.lang.String k() {
        return super.getString(this.f353199e + 1);
    }

    public void l(m15.a aVar) {
        super.set(this.f353199e + 0, aVar);
    }

    public void n(java.lang.String str) {
        super.set(this.f353199e + 1, str);
    }
}
