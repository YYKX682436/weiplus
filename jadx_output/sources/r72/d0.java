package r72;

/* loaded from: classes9.dex */
public class d0 extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f393136d;

    public d0() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.j(-1, "type"), com.tencent.mm.protobuf.i.u(-1, "producttitle"), com.tencent.mm.protobuf.i.u(-1, "productdesc"), com.tencent.mm.protobuf.i.u(-1, "productthumb_url"), com.tencent.mm.protobuf.i.u(-1, "productinfo")});
        this.f393136d = appendAttrs;
        super.set__serialName("productitem");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{0, "", "", "", ""});
    }

    public int getType() {
        return super.getInteger(this.f393136d + 0);
    }

    public java.lang.String j() {
        return super.getString(this.f393136d + 2);
    }

    public java.lang.String k() {
        return super.getString(this.f393136d + 4);
    }

    public java.lang.String l() {
        return super.getString(this.f393136d + 3);
    }

    public java.lang.String n() {
        return super.getString(this.f393136d + 1);
    }

    public void o(java.lang.String str) {
        super.set(this.f393136d + 2, str);
    }

    public void p(java.lang.String str) {
        super.set(this.f393136d + 4, str);
    }

    public void q(java.lang.String str) {
        super.set(this.f393136d + 3, str);
    }

    public void r(java.lang.String str) {
        super.set(this.f393136d + 1, str);
    }

    public void s(int i17) {
        super.set(this.f393136d + 0, java.lang.Integer.valueOf(i17));
    }
}
