package oi3;

/* loaded from: classes12.dex */
public class f extends oi3.g {

    /* renamed from: e, reason: collision with root package name */
    public final int f345616e;

    public f() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "imgPath"), com.tencent.mm.protobuf.i.i(-1, "thumbImgW"), com.tencent.mm.protobuf.i.i(-1, "thumbImgH"), com.tencent.mm.protobuf.i.i(-1, "cleanflag"), com.tencent.mm.protobuf.i.i(-1, "synchflag")});
        this.f345616e = appendAttrs;
        super.set__serialName("simpleimgmsginfo");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", 0, 0, 0, 0});
    }

    public int j() {
        return super.getInteger(this.f345616e + 3);
    }

    public java.lang.String k() {
        return super.getString(this.f345616e + 0);
    }

    public int l() {
        return super.getInteger(this.f345616e + 2);
    }

    public int n() {
        return super.getInteger(this.f345616e + 1);
    }

    public void o(int i17) {
        super.set(this.f345616e + 3, java.lang.Integer.valueOf(i17));
    }

    public void p(java.lang.String str) {
        super.set(this.f345616e + 0, str);
    }

    public void q(int i17) {
        super.set(this.f345616e + 4, java.lang.Integer.valueOf(i17));
    }

    public void r(int i17) {
        super.set(this.f345616e + 2, java.lang.Integer.valueOf(i17));
    }

    public void s(int i17) {
        super.set(this.f345616e + 1, java.lang.Integer.valueOf(i17));
    }
}
