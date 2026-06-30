package oi3;

/* loaded from: classes9.dex */
public class e extends oi3.g {

    /* renamed from: e, reason: collision with root package name */
    public final int f345615e;

    public e() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "imgPath")});
        this.f345615e = appendAttrs;
        super.set__serialName("simpleappmsginfo");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{""});
    }

    public java.lang.String j() {
        return super.getString(this.f345615e + 0);
    }

    public void k(java.lang.String str) {
        super.set(this.f345615e + 0, str);
    }
}
