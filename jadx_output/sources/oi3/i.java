package oi3;

/* loaded from: classes5.dex */
public final class i extends oi3.g {

    /* renamed from: e, reason: collision with root package name */
    public final int f345619e;

    public i() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "imgPath")});
        this.f345619e = appendAttrs;
        super.set__serialName("simplevoicemsginfo");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{""});
    }

    public java.lang.String j() {
        return super.getString(this.f345619e + 0);
    }

    public void k(java.lang.String str) {
        super.set(this.f345619e + 0, str);
    }
}
