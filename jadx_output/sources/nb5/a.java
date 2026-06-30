package nb5;

/* loaded from: classes9.dex */
public class a extends co.a {

    /* renamed from: e, reason: collision with root package name */
    public final int f336089e;

    public a() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "imgPath"), com.tencent.mm.protobuf.i.r(-1, "xmlContent", v05.b.class)});
        this.f336089e = appendAttrs;
        super.set__serialName("previewmsg");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", null});
    }

    @Override // co.a
    public java.lang.Object clone() {
        return super.clone();
    }

    public v05.b j() {
        return (v05.b) super.getCustom(this.f336089e + 1);
    }

    public java.lang.String k() {
        return super.getString(this.f336089e + 0);
    }

    public void l(v05.b bVar) {
        super.set(this.f336089e + 1, bVar);
    }

    public void n(java.lang.String str) {
        super.set(this.f336089e + 0, str);
    }
}
