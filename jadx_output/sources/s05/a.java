package s05;

/* loaded from: classes9.dex */
public class a extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f401974d;

    public a() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.i(-1, "type"), com.tencent.mm.protobuf.i.u(-1, "appnamemultilanguagekey"), com.tencent.mm.protobuf.i.u(-1, "sourcename"), com.tencent.mm.protobuf.i.u(-1, "sourceiconurl")});
        this.f401974d = appendAttrs;
        super.set__serialName("NativeInfoApp");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{0, null, null, null});
    }

    public java.lang.String getSourceName() {
        return super.getString(this.f401974d + 2);
    }

    public int getType() {
        return super.getInteger(this.f401974d + 0);
    }

    public java.lang.String j() {
        return super.getString(this.f401974d + 3);
    }

    public void k(java.lang.String str) {
        super.set(this.f401974d + 1, str);
    }

    public void l(java.lang.String str) {
        super.set(this.f401974d + 3, str);
    }

    public void n(java.lang.String str) {
        super.set(this.f401974d + 2, str);
    }

    public void o(int i17) {
        super.set(this.f401974d + 0, java.lang.Integer.valueOf(i17));
    }
}
