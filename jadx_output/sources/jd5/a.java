package jd5;

/* loaded from: classes9.dex */
public class a extends co.a {

    /* renamed from: e, reason: collision with root package name */
    public final int f299183e;

    public a() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.i(-1, "imgWidth"), com.tencent.mm.protobuf.i.i(-1, "imgHeight"), com.tencent.mm.protobuf.i.u(-1, "imgPath"), com.tencent.mm.protobuf.i.r(-1, "imgSource", p15.n.class)});
        this.f299183e = appendAttrs;
        super.set__serialName("previewmsg");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{0, 0, "", null});
    }

    @Override // co.a
    public java.lang.Object clone() {
        return super.clone();
    }

    public int j() {
        return super.getInteger(this.f299183e + 1);
    }

    public java.lang.String k() {
        return super.getString(this.f299183e + 2);
    }

    public p15.n l() {
        return (p15.n) super.getCustom(this.f299183e + 3);
    }

    public int n() {
        return super.getInteger(this.f299183e + 0);
    }

    public void o(int i17) {
        super.set(this.f299183e + 1, java.lang.Integer.valueOf(i17));
    }

    public void p(java.lang.String str) {
        super.set(this.f299183e + 2, str);
    }

    public void q(p15.n nVar) {
        super.set(this.f299183e + 3, nVar);
    }

    public void r(int i17) {
        super.set(this.f299183e + 0, java.lang.Integer.valueOf(i17));
    }
}
